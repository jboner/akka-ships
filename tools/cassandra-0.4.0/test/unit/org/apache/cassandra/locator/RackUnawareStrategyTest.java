/*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.apache.cassandra.locator;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;
import org.apache.cassandra.dht.IPartitioner;
import org.apache.cassandra.dht.RandomPartitioner;
import org.apache.cassandra.dht.BigIntegerToken;
import org.apache.cassandra.dht.Token;
import org.apache.cassandra.dht.OrderPreservingPartitioner;
import org.apache.cassandra.dht.StringToken;
import org.apache.cassandra.net.EndPoint;

public class RackUnawareStrategyTest
{
    @Test
    public void testBigIntegerStorageEndPoints()
    {
        TokenMetadata tmd = new TokenMetadata();
        IPartitioner partitioner = new RandomPartitioner();
        IReplicaPlacementStrategy strategy = new RackUnawareStrategy(tmd, partitioner, 3, 7000);

        List<Token> endPointTokens = new ArrayList<Token>();
        List<Token> keyTokens = new ArrayList<Token>();
        for (int i = 0; i < 5; i++) {
            endPointTokens.add(new BigIntegerToken(String.valueOf(10 * i)));
            keyTokens.add(new BigIntegerToken(String.valueOf(10 * i + 5)));
        }
        testGetStorageEndPoints(tmd, strategy, endPointTokens.toArray(new Token[0]), keyTokens.toArray(new Token[0]));
    }

    @Test
    public void testStringStorageEndPoints()
    {
        TokenMetadata tmd = new TokenMetadata();
        IPartitioner partitioner = new OrderPreservingPartitioner();
        IReplicaPlacementStrategy strategy = new RackUnawareStrategy(tmd, partitioner, 3, 7000);

        List<Token> endPointTokens = new ArrayList<Token>();
        List<Token> keyTokens = new ArrayList<Token>();
        for (int i = 0; i < 5; i++) {
            endPointTokens.add(new StringToken(String.valueOf((char)('a' + i * 2))));
            keyTokens.add(partitioner.getInitialToken(String.valueOf((char)('a' + i * 2 + 1))));
        }
        testGetStorageEndPoints(tmd, strategy, endPointTokens.toArray(new Token[0]), keyTokens.toArray(new Token[0]));
    }

    // given a list of endpoint tokens, and a set of key tokens falling between the endpoint tokens,
    // make sure that the Strategy picks the right endpoints for the keys.
    private void testGetStorageEndPoints(TokenMetadata tmd, IReplicaPlacementStrategy strategy, Token[] endPointTokens, Token[] keyTokens)
    {
        List<EndPoint> hosts = new ArrayList<EndPoint>();
        for (int i = 0; i < endPointTokens.length; i++)
        {
            EndPoint ep = new EndPoint("127.0.0." + String.valueOf(i + 1), 7001);
            tmd.update(endPointTokens[i], ep);
            hosts.add(ep);
        }

        for (int i = 0; i < keyTokens.length; i++)
        {
            EndPoint[] endPoints = strategy.getStorageEndPoints(keyTokens[i]);
            assert endPoints.length == 3;
            for (int j = 0; j < endPoints.length; j++)
            {
                assert endPoints[j] == hosts.get((i + j + 1) % hosts.size());
            }
        }
    }
}
