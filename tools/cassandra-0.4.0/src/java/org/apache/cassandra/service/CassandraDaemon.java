/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.cassandra.service;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;
import org.apache.thrift.transport.TTransportFactory;
import org.apache.thrift.TProcessorFactory;
import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.utils.FBUtilities;
import org.apache.cassandra.db.Table;
import org.apache.cassandra.db.RecoveryManager;
import org.apache.cassandra.db.CalloutManager;

/**
 * This class supports two methods for creating a Cassandra node daemon, 
 * invoking the class's main method, and using the jsvc wrapper from 
 * commons-daemon, (for more information on using this class with the 
 * jsvc wrapper, see the 
 * <a href="http://commons.apache.org/daemon/jsvc.html">Commons Daemon</a>
 * documentation).
 * 
 * @author Eric Evans <eevans@racklabs.com>
 * 
 */

public class CassandraDaemon
{
    private static Logger logger = Logger.getLogger(CassandraDaemon.class);
    private TThreadPoolServer serverEngine;

    private void setup() throws IOException, TTransportException
    {
        int listenPort = DatabaseDescriptor.getThriftPort();
        String listenAddr = DatabaseDescriptor.getThriftAddress();
        
        /* 
         * If ThriftAddress was left completely unconfigured, then assume
         * the same default as ListenAddress, (InetAddress.getLocalHost).
         */
        if (listenAddr == null)
            listenAddr = FBUtilities.getHostAddress();
        
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler()
        {
            public void uncaughtException(Thread t, Throwable e)
            {
                logger.error("Fatal exception in thread " + t, e);
                if (e instanceof OutOfMemoryError)
                {
                    System.exit(100);
                }
            }
        });

        // initialize stuff
        CalloutManager.instance().onStart();

        Set<String> tables = DatabaseDescriptor.getTableToColumnFamilyMap().keySet();
        for (String table : tables)
        {
            if (logger.isDebugEnabled())
                logger.debug("opening keyspace " + table);
            Table tbl = Table.open(table);
            tbl.onStart();
        }

        // replay the log if necessary
        RecoveryManager recoveryMgr = RecoveryManager.instance();
        recoveryMgr.doRecovery();

        // now we start listening for clients
        CassandraServer peerStorageServer = new CassandraServer();
        peerStorageServer.start();
        Cassandra.Processor processor = new Cassandra.Processor(peerStorageServer);

        // Transport
        TServerSocket tServerSocket = new TServerSocket(new InetSocketAddress(listenAddr, listenPort));
        
        if (logger.isDebugEnabled())
            logger.debug(String.format("Binding thrift service to %s:%s", listenAddr, listenPort));

        // Protocol factory
        TProtocolFactory tProtocolFactory = new TBinaryProtocol.Factory();

        // ThreadPool Server
        TThreadPoolServer.Options options = new TThreadPoolServer.Options();
        options.minWorkerThreads = 64;
        serverEngine = new TThreadPoolServer(new TProcessorFactory(processor),
                                             tServerSocket,
                                             new TTransportFactory(),
                                             new TTransportFactory(),
                                             tProtocolFactory,
                                             tProtocolFactory,
                                             options);
    }

    /** hook for JSVC */
    public void init(String[] args) throws IOException, TTransportException
    {  
        setup();
    }

    /** hook for JSVC */
    public void start()
    {
        logger.info("Cassandra starting up...");
        serverEngine.serve();
    }

    /** hook for JSVC */
    public void stop()
    {
        logger.info("Cassandra shutting down...");
        serverEngine.stop();
    }
    
    
    /** hook for JSVC */
    public void destroy()
    {        
    }
    
    public static void main(String[] args)
    {
        CassandraDaemon daemon = new CassandraDaemon();
        String pidFile = System.getProperty("cassandra-pidfile");
        
        try
        {   
            daemon.setup();

            if (pidFile != null)
            {
                new File(pidFile).deleteOnExit();
            }

            if (System.getProperty("cassandra-foreground") == null)
            {
                System.out.close();
                System.err.close();
            }

            daemon.start();
        }
        catch (Exception e)
        {
            String msg = "Exception encountered during startup.";
            logger.error(msg, e);

            // try to warn user on stdout too, if we haven't already detached
            System.out.println(msg);
            e.printStackTrace();

            System.exit(3);
        }
    }
}
