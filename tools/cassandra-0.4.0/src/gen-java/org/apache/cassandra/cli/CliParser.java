// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g 2009-09-10 18:27:11

package org.apache.cassandra.cli;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

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
public class CliParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NODE_CONNECT", "NODE_DESCRIBE_TABLE", "NODE_EXIT", "NODE_HELP", "NODE_NO_OP", "NODE_SHOW_CLUSTER_NAME", "NODE_SHOW_CONFIG_FILE", "NODE_SHOW_VERSION", "NODE_SHOW_TABLES", "NODE_THRIFT_GET", "NODE_THRIFT_SET", "NODE_COLUMN_ACCESS", "NODE_ID_LIST", "SEMICOLON", "K_CONNECT", "SLASH", "K_HELP", "K_QUIT", "K_EXIT", "K_THRIFT", "K_GET", "K_SET", "K_SHOW", "K_CLUSTER", "K_NAME", "K_CONFIG", "K_FILE", "K_VERSION", "K_TABLES", "K_DESCRIBE", "K_TABLE", "DOT", "Identifier", "StringLiteral", "HostIdentifier", "IntegerLiteral", "Letter", "Digit", "WS", "COMMENT", "'?'", "'='", "'['", "']'"
    };
    public static final int K_TABLES=32;
    public static final int NODE_EXIT=6;
    public static final int K_EXIT=22;
    public static final int K_GET=24;
    public static final int K_CONNECT=18;
    public static final int K_CONFIG=29;
    public static final int EOF=-1;
    public static final int Identifier=36;
    public static final int K_SET=25;
    public static final int K_DESCRIBE=33;
    public static final int NODE_SHOW_VERSION=11;
    public static final int NODE_CONNECT=4;
    public static final int SLASH=19;
    public static final int NODE_SHOW_TABLES=12;
    public static final int K_CLUSTER=27;
    public static final int NODE_DESCRIBE_TABLE=5;
    public static final int K_SHOW=26;
    public static final int K_TABLE=34;
    public static final int COMMENT=43;
    public static final int K_NAME=28;
    public static final int DOT=35;
    public static final int K_QUIT=21;
    public static final int NODE_SHOW_CONFIG_FILE=10;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int K_VERSION=31;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int K_FILE=30;
    public static final int SEMICOLON=17;
    public static final int Digit=41;
    public static final int NODE_THRIFT_GET=13;
    public static final int StringLiteral=37;
    public static final int NODE_THRIFT_SET=14;
    public static final int NODE_NO_OP=8;
    public static final int NODE_HELP=7;
    public static final int NODE_ID_LIST=16;
    public static final int WS=42;
    public static final int HostIdentifier=38;
    public static final int K_THRIFT=23;
    public static final int K_HELP=20;
    public static final int NODE_SHOW_CLUSTER_NAME=9;
    public static final int IntegerLiteral=39;
    public static final int Letter=40;
    public static final int NODE_COLUMN_ACCESS=15;

    // delegates
    // delegators


        public CliParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CliParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return CliParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g"; }


    public static class root_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "root"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:73:1: root : stmt ( SEMICOLON )? EOF -> stmt ;
    public final CliParser.root_return root() throws RecognitionException {
        CliParser.root_return retval = new CliParser.root_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMICOLON2=null;
        Token EOF3=null;
        CliParser.stmt_return stmt1 = null;


        CommonTree SEMICOLON2_tree=null;
        CommonTree EOF3_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:73:5: ( stmt ( SEMICOLON )? EOF -> stmt )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:73:7: stmt ( SEMICOLON )? EOF
            {
            pushFollow(FOLLOW_stmt_in_root200);
            stmt1=stmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_stmt.add(stmt1.getTree());
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:73:12: ( SEMICOLON )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SEMICOLON) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:0:0: SEMICOLON
                    {
                    SEMICOLON2=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_root202); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON2);


                    }
                    break;

            }

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_root205); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF3);



            // AST REWRITE
            // elements: stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 73:27: -> stmt
            {
                adaptor.addChild(root_0, stream_stmt.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "root"

    public static class stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmt"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:75:1: stmt : ( connectStmt | exitStmt | describeTable | getStmt | helpStmt | setStmt | showStmt | -> ^( NODE_NO_OP ) );
    public final CliParser.stmt_return stmt() throws RecognitionException {
        CliParser.stmt_return retval = new CliParser.stmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.connectStmt_return connectStmt4 = null;

        CliParser.exitStmt_return exitStmt5 = null;

        CliParser.describeTable_return describeTable6 = null;

        CliParser.getStmt_return getStmt7 = null;

        CliParser.helpStmt_return helpStmt8 = null;

        CliParser.setStmt_return setStmt9 = null;

        CliParser.showStmt_return showStmt10 = null;



        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:76:5: ( connectStmt | exitStmt | describeTable | getStmt | helpStmt | setStmt | showStmt | -> ^( NODE_NO_OP ) )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:76:7: connectStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_connectStmt_in_stmt221);
                    connectStmt4=connectStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, connectStmt4.getTree());

                    }
                    break;
                case 2 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:77:7: exitStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_exitStmt_in_stmt229);
                    exitStmt5=exitStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exitStmt5.getTree());

                    }
                    break;
                case 3 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:78:7: describeTable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_describeTable_in_stmt237);
                    describeTable6=describeTable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, describeTable6.getTree());

                    }
                    break;
                case 4 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:79:7: getStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_getStmt_in_stmt245);
                    getStmt7=getStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, getStmt7.getTree());

                    }
                    break;
                case 5 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:80:7: helpStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_helpStmt_in_stmt253);
                    helpStmt8=helpStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, helpStmt8.getTree());

                    }
                    break;
                case 6 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:81:7: setStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_setStmt_in_stmt261);
                    setStmt9=setStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setStmt9.getTree());

                    }
                    break;
                case 7 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:82:7: showStmt
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showStmt_in_stmt269);
                    showStmt10=showStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showStmt10.getTree());

                    }
                    break;
                case 8 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:83:7: 
                    {

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 83:7: -> ^( NODE_NO_OP )
                    {
                        // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:83:10: ^( NODE_NO_OP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_NO_OP, "NODE_NO_OP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stmt"

    public static class connectStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "connectStmt"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:86:1: connectStmt : ( K_CONNECT host SLASH port -> ^( NODE_CONNECT host port ) | K_CONNECT ip SLASH port -> ^( NODE_CONNECT ip port ) );
    public final CliParser.connectStmt_return connectStmt() throws RecognitionException {
        CliParser.connectStmt_return retval = new CliParser.connectStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_CONNECT11=null;
        Token SLASH13=null;
        Token K_CONNECT15=null;
        Token SLASH17=null;
        CliParser.host_return host12 = null;

        CliParser.port_return port14 = null;

        CliParser.ip_return ip16 = null;

        CliParser.port_return port18 = null;


        CommonTree K_CONNECT11_tree=null;
        CommonTree SLASH13_tree=null;
        CommonTree K_CONNECT15_tree=null;
        CommonTree SLASH17_tree=null;
        RewriteRuleTokenStream stream_SLASH=new RewriteRuleTokenStream(adaptor,"token SLASH");
        RewriteRuleTokenStream stream_K_CONNECT=new RewriteRuleTokenStream(adaptor,"token K_CONNECT");
        RewriteRuleSubtreeStream stream_port=new RewriteRuleSubtreeStream(adaptor,"rule port");
        RewriteRuleSubtreeStream stream_host=new RewriteRuleSubtreeStream(adaptor,"rule host");
        RewriteRuleSubtreeStream stream_ip=new RewriteRuleSubtreeStream(adaptor,"rule ip");
        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:87:5: ( K_CONNECT host SLASH port -> ^( NODE_CONNECT host port ) | K_CONNECT ip SLASH port -> ^( NODE_CONNECT ip port ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==K_CONNECT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==IntegerLiteral) ) {
                    alt3=2;
                }
                else if ( (LA3_1==HostIdentifier) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:87:7: K_CONNECT host SLASH port
                    {
                    K_CONNECT11=(Token)match(input,K_CONNECT,FOLLOW_K_CONNECT_in_connectStmt298); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_K_CONNECT.add(K_CONNECT11);

                    pushFollow(FOLLOW_host_in_connectStmt300);
                    host12=host();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_host.add(host12.getTree());
                    SLASH13=(Token)match(input,SLASH,FOLLOW_SLASH_in_connectStmt302); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SLASH.add(SLASH13);

                    pushFollow(FOLLOW_port_in_connectStmt304);
                    port14=port();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_port.add(port14.getTree());


                    // AST REWRITE
                    // elements: port, host
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 87:33: -> ^( NODE_CONNECT host port )
                    {
                        // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:87:36: ^( NODE_CONNECT host port )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"), root_1);

                        adaptor.addChild(root_1, stream_host.nextTree());
                        adaptor.addChild(root_1, stream_port.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:88:7: K_CONNECT ip SLASH port
                    {
                    K_CONNECT15=(Token)match(input,K_CONNECT,FOLLOW_K_CONNECT_in_connectStmt322); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_K_CONNECT.add(K_CONNECT15);

                    pushFollow(FOLLOW_ip_in_connectStmt324);
                    ip16=ip();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ip.add(ip16.getTree());
                    SLASH17=(Token)match(input,SLASH,FOLLOW_SLASH_in_connectStmt326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SLASH.add(SLASH17);

                    pushFollow(FOLLOW_port_in_connectStmt328);
                    port18=port();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_port.add(port18.getTree());


                    // AST REWRITE
                    // elements: ip, port
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 88:31: -> ^( NODE_CONNECT ip port )
                    {
                        // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:88:34: ^( NODE_CONNECT ip port )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_CONNECT, "NODE_CONNECT"), root_1);

                        adaptor.addChild(root_1, stream_ip.nextTree());
                        adaptor.addChild(root_1, stream_port.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "connectStmt"

    public static class helpStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "helpStmt"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:91:1: helpStmt : ( K_HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) );
    public final CliParser.helpStmt_return helpStmt() throws RecognitionException {
        CliParser.helpStmt_return retval = new CliParser.helpStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_HELP19=null;
        Token char_literal20=null;

        CommonTree K_HELP19_tree=null;
        CommonTree char_literal20_tree=null;
        RewriteRuleTokenStream stream_K_HELP=new RewriteRuleTokenStream(adaptor,"token K_HELP");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");

        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:92:5: ( K_HELP -> ^( NODE_HELP ) | '?' -> ^( NODE_HELP ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==K_HELP) ) {
                alt4=1;
            }
            else if ( (LA4_0==44) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:92:7: K_HELP
                    {
                    K_HELP19=(Token)match(input,K_HELP,FOLLOW_K_HELP_in_helpStmt355); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_K_HELP.add(K_HELP19);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 92:14: -> ^( NODE_HELP )
                    {
                        // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:92:17: ^( NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:93:7: '?'
                    {
                    char_literal20=(Token)match(input,44,FOLLOW_44_in_helpStmt369); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_44.add(char_literal20);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 93:14: -> ^( NODE_HELP )
                    {
                        // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:93:17: ^( NODE_HELP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_HELP, "NODE_HELP"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "helpStmt"

    public static class exitStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exitStmt"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:96:1: exitStmt : ( K_QUIT -> ^( NODE_EXIT ) | K_EXIT -> ^( NODE_EXIT ) );
    public final CliParser.exitStmt_return exitStmt() throws RecognitionException {
        CliParser.exitStmt_return retval = new CliParser.exitStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_QUIT21=null;
        Token K_EXIT22=null;

        CommonTree K_QUIT21_tree=null;
        CommonTree K_EXIT22_tree=null;
        RewriteRuleTokenStream stream_K_EXIT=new RewriteRuleTokenStream(adaptor,"token K_EXIT");
        RewriteRuleTokenStream stream_K_QUIT=new RewriteRuleTokenStream(adaptor,"token K_QUIT");

        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:97:5: ( K_QUIT -> ^( NODE_EXIT ) | K_EXIT -> ^( NODE_EXIT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==K_QUIT) ) {
                alt5=1;
            }
            else if ( (LA5_0==K_EXIT) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:97:7: K_QUIT
                    {
                    K_QUIT21=(Token)match(input,K_QUIT,FOLLOW_K_QUIT_in_exitStmt395); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_K_QUIT.add(K_QUIT21);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 97:14: -> ^( NODE_EXIT )
                    {
                        // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:97:17: ^( NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:98:7: K_EXIT
                    {
                    K_EXIT22=(Token)match(input,K_EXIT,FOLLOW_K_EXIT_in_exitStmt409); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_K_EXIT.add(K_EXIT22);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 98:14: -> ^( NODE_EXIT )
                    {
                        // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:98:17: ^( NODE_EXIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_EXIT, "NODE_EXIT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exitStmt"

    public static class getStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "getStmt"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:101:1: getStmt : K_THRIFT K_GET columnFamilyExpr -> ^( NODE_THRIFT_GET columnFamilyExpr ) ;
    public final CliParser.getStmt_return getStmt() throws RecognitionException {
        CliParser.getStmt_return retval = new CliParser.getStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_THRIFT23=null;
        Token K_GET24=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr25 = null;


        CommonTree K_THRIFT23_tree=null;
        CommonTree K_GET24_tree=null;
        RewriteRuleTokenStream stream_K_THRIFT=new RewriteRuleTokenStream(adaptor,"token K_THRIFT");
        RewriteRuleTokenStream stream_K_GET=new RewriteRuleTokenStream(adaptor,"token K_GET");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:102:5: ( K_THRIFT K_GET columnFamilyExpr -> ^( NODE_THRIFT_GET columnFamilyExpr ) )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:102:7: K_THRIFT K_GET columnFamilyExpr
            {
            K_THRIFT23=(Token)match(input,K_THRIFT,FOLLOW_K_THRIFT_in_getStmt432); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_THRIFT.add(K_THRIFT23);

            K_GET24=(Token)match(input,K_GET,FOLLOW_K_GET_in_getStmt434); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_GET.add(K_GET24);

            pushFollow(FOLLOW_columnFamilyExpr_in_getStmt436);
            columnFamilyExpr25=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr25.getTree());


            // AST REWRITE
            // elements: columnFamilyExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 102:39: -> ^( NODE_THRIFT_GET columnFamilyExpr )
            {
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:102:42: ^( NODE_THRIFT_GET columnFamilyExpr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_GET, "NODE_THRIFT_GET"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "getStmt"

    public static class setStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setStmt"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:105:1: setStmt : K_THRIFT K_SET columnFamilyExpr '=' value -> ^( NODE_THRIFT_SET columnFamilyExpr value ) ;
    public final CliParser.setStmt_return setStmt() throws RecognitionException {
        CliParser.setStmt_return retval = new CliParser.setStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_THRIFT26=null;
        Token K_SET27=null;
        Token char_literal29=null;
        CliParser.columnFamilyExpr_return columnFamilyExpr28 = null;

        CliParser.value_return value30 = null;


        CommonTree K_THRIFT26_tree=null;
        CommonTree K_SET27_tree=null;
        CommonTree char_literal29_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_K_THRIFT=new RewriteRuleTokenStream(adaptor,"token K_THRIFT");
        RewriteRuleTokenStream stream_K_SET=new RewriteRuleTokenStream(adaptor,"token K_SET");
        RewriteRuleSubtreeStream stream_columnFamilyExpr=new RewriteRuleSubtreeStream(adaptor,"rule columnFamilyExpr");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:106:5: ( K_THRIFT K_SET columnFamilyExpr '=' value -> ^( NODE_THRIFT_SET columnFamilyExpr value ) )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:106:7: K_THRIFT K_SET columnFamilyExpr '=' value
            {
            K_THRIFT26=(Token)match(input,K_THRIFT,FOLLOW_K_THRIFT_in_setStmt461); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_THRIFT.add(K_THRIFT26);

            K_SET27=(Token)match(input,K_SET,FOLLOW_K_SET_in_setStmt463); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_SET.add(K_SET27);

            pushFollow(FOLLOW_columnFamilyExpr_in_setStmt465);
            columnFamilyExpr28=columnFamilyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamilyExpr.add(columnFamilyExpr28.getTree());
            char_literal29=(Token)match(input,45,FOLLOW_45_in_setStmt467); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_45.add(char_literal29);

            pushFollow(FOLLOW_value_in_setStmt469);
            value30=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value30.getTree());


            // AST REWRITE
            // elements: value, columnFamilyExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 106:49: -> ^( NODE_THRIFT_SET columnFamilyExpr value )
            {
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:106:52: ^( NODE_THRIFT_SET columnFamilyExpr value )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_THRIFT_SET, "NODE_THRIFT_SET"), root_1);

                adaptor.addChild(root_1, stream_columnFamilyExpr.nextTree());
                adaptor.addChild(root_1, stream_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "setStmt"

    public static class showStmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showStmt"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:109:1: showStmt : ( showClusterName | showVersion | showConfigFile | showTables );
    public final CliParser.showStmt_return showStmt() throws RecognitionException {
        CliParser.showStmt_return retval = new CliParser.showStmt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CliParser.showClusterName_return showClusterName31 = null;

        CliParser.showVersion_return showVersion32 = null;

        CliParser.showConfigFile_return showConfigFile33 = null;

        CliParser.showTables_return showTables34 = null;



        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:110:5: ( showClusterName | showVersion | showConfigFile | showTables )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==K_SHOW) ) {
                switch ( input.LA(2) ) {
                case K_CLUSTER:
                    {
                    alt6=1;
                    }
                    break;
                case K_VERSION:
                    {
                    alt6=2;
                    }
                    break;
                case K_CONFIG:
                    {
                    alt6=3;
                    }
                    break;
                case K_TABLES:
                    {
                    alt6=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:110:7: showClusterName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showClusterName_in_showStmt496);
                    showClusterName31=showClusterName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showClusterName31.getTree());

                    }
                    break;
                case 2 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:111:7: showVersion
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showVersion_in_showStmt504);
                    showVersion32=showVersion();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showVersion32.getTree());

                    }
                    break;
                case 3 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:112:7: showConfigFile
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showConfigFile_in_showStmt512);
                    showConfigFile33=showConfigFile();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showConfigFile33.getTree());

                    }
                    break;
                case 4 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:113:7: showTables
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_showTables_in_showStmt520);
                    showTables34=showTables();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, showTables34.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showStmt"

    public static class showClusterName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showClusterName"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:116:1: showClusterName : K_SHOW K_CLUSTER K_NAME -> ^( NODE_SHOW_CLUSTER_NAME ) ;
    public final CliParser.showClusterName_return showClusterName() throws RecognitionException {
        CliParser.showClusterName_return retval = new CliParser.showClusterName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_SHOW35=null;
        Token K_CLUSTER36=null;
        Token K_NAME37=null;

        CommonTree K_SHOW35_tree=null;
        CommonTree K_CLUSTER36_tree=null;
        CommonTree K_NAME37_tree=null;
        RewriteRuleTokenStream stream_K_SHOW=new RewriteRuleTokenStream(adaptor,"token K_SHOW");
        RewriteRuleTokenStream stream_K_NAME=new RewriteRuleTokenStream(adaptor,"token K_NAME");
        RewriteRuleTokenStream stream_K_CLUSTER=new RewriteRuleTokenStream(adaptor,"token K_CLUSTER");

        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:117:5: ( K_SHOW K_CLUSTER K_NAME -> ^( NODE_SHOW_CLUSTER_NAME ) )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:117:7: K_SHOW K_CLUSTER K_NAME
            {
            K_SHOW35=(Token)match(input,K_SHOW,FOLLOW_K_SHOW_in_showClusterName537); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_SHOW.add(K_SHOW35);

            K_CLUSTER36=(Token)match(input,K_CLUSTER,FOLLOW_K_CLUSTER_in_showClusterName539); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_CLUSTER.add(K_CLUSTER36);

            K_NAME37=(Token)match(input,K_NAME,FOLLOW_K_NAME_in_showClusterName541); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_NAME.add(K_NAME37);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 117:31: -> ^( NODE_SHOW_CLUSTER_NAME )
            {
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:117:34: ^( NODE_SHOW_CLUSTER_NAME )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_CLUSTER_NAME, "NODE_SHOW_CLUSTER_NAME"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showClusterName"

    public static class showConfigFile_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showConfigFile"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:120:1: showConfigFile : K_SHOW K_CONFIG K_FILE -> ^( NODE_SHOW_CONFIG_FILE ) ;
    public final CliParser.showConfigFile_return showConfigFile() throws RecognitionException {
        CliParser.showConfigFile_return retval = new CliParser.showConfigFile_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_SHOW38=null;
        Token K_CONFIG39=null;
        Token K_FILE40=null;

        CommonTree K_SHOW38_tree=null;
        CommonTree K_CONFIG39_tree=null;
        CommonTree K_FILE40_tree=null;
        RewriteRuleTokenStream stream_K_SHOW=new RewriteRuleTokenStream(adaptor,"token K_SHOW");
        RewriteRuleTokenStream stream_K_FILE=new RewriteRuleTokenStream(adaptor,"token K_FILE");
        RewriteRuleTokenStream stream_K_CONFIG=new RewriteRuleTokenStream(adaptor,"token K_CONFIG");

        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:121:5: ( K_SHOW K_CONFIG K_FILE -> ^( NODE_SHOW_CONFIG_FILE ) )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:121:7: K_SHOW K_CONFIG K_FILE
            {
            K_SHOW38=(Token)match(input,K_SHOW,FOLLOW_K_SHOW_in_showConfigFile564); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_SHOW.add(K_SHOW38);

            K_CONFIG39=(Token)match(input,K_CONFIG,FOLLOW_K_CONFIG_in_showConfigFile566); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_CONFIG.add(K_CONFIG39);

            K_FILE40=(Token)match(input,K_FILE,FOLLOW_K_FILE_in_showConfigFile568); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_FILE.add(K_FILE40);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 121:30: -> ^( NODE_SHOW_CONFIG_FILE )
            {
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:121:33: ^( NODE_SHOW_CONFIG_FILE )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_CONFIG_FILE, "NODE_SHOW_CONFIG_FILE"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showConfigFile"

    public static class showVersion_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showVersion"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:124:1: showVersion : K_SHOW K_VERSION -> ^( NODE_SHOW_VERSION ) ;
    public final CliParser.showVersion_return showVersion() throws RecognitionException {
        CliParser.showVersion_return retval = new CliParser.showVersion_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_SHOW41=null;
        Token K_VERSION42=null;

        CommonTree K_SHOW41_tree=null;
        CommonTree K_VERSION42_tree=null;
        RewriteRuleTokenStream stream_K_SHOW=new RewriteRuleTokenStream(adaptor,"token K_SHOW");
        RewriteRuleTokenStream stream_K_VERSION=new RewriteRuleTokenStream(adaptor,"token K_VERSION");

        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:125:5: ( K_SHOW K_VERSION -> ^( NODE_SHOW_VERSION ) )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:125:7: K_SHOW K_VERSION
            {
            K_SHOW41=(Token)match(input,K_SHOW,FOLLOW_K_SHOW_in_showVersion591); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_SHOW.add(K_SHOW41);

            K_VERSION42=(Token)match(input,K_VERSION,FOLLOW_K_VERSION_in_showVersion593); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_VERSION.add(K_VERSION42);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 125:24: -> ^( NODE_SHOW_VERSION )
            {
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:125:27: ^( NODE_SHOW_VERSION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_VERSION, "NODE_SHOW_VERSION"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showVersion"

    public static class showTables_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "showTables"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:128:1: showTables : K_SHOW K_TABLES -> ^( NODE_SHOW_TABLES ) ;
    public final CliParser.showTables_return showTables() throws RecognitionException {
        CliParser.showTables_return retval = new CliParser.showTables_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_SHOW43=null;
        Token K_TABLES44=null;

        CommonTree K_SHOW43_tree=null;
        CommonTree K_TABLES44_tree=null;
        RewriteRuleTokenStream stream_K_SHOW=new RewriteRuleTokenStream(adaptor,"token K_SHOW");
        RewriteRuleTokenStream stream_K_TABLES=new RewriteRuleTokenStream(adaptor,"token K_TABLES");

        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:129:5: ( K_SHOW K_TABLES -> ^( NODE_SHOW_TABLES ) )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:129:7: K_SHOW K_TABLES
            {
            K_SHOW43=(Token)match(input,K_SHOW,FOLLOW_K_SHOW_in_showTables616); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_SHOW.add(K_SHOW43);

            K_TABLES44=(Token)match(input,K_TABLES,FOLLOW_K_TABLES_in_showTables618); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_TABLES.add(K_TABLES44);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 129:23: -> ^( NODE_SHOW_TABLES )
            {
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:129:26: ^( NODE_SHOW_TABLES )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_SHOW_TABLES, "NODE_SHOW_TABLES"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "showTables"

    public static class describeTable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "describeTable"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:132:1: describeTable : K_DESCRIBE K_TABLE table -> ^( NODE_DESCRIBE_TABLE table ) ;
    public final CliParser.describeTable_return describeTable() throws RecognitionException {
        CliParser.describeTable_return retval = new CliParser.describeTable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token K_DESCRIBE45=null;
        Token K_TABLE46=null;
        CliParser.table_return table47 = null;


        CommonTree K_DESCRIBE45_tree=null;
        CommonTree K_TABLE46_tree=null;
        RewriteRuleTokenStream stream_K_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token K_DESCRIBE");
        RewriteRuleTokenStream stream_K_TABLE=new RewriteRuleTokenStream(adaptor,"token K_TABLE");
        RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");
        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:133:5: ( K_DESCRIBE K_TABLE table -> ^( NODE_DESCRIBE_TABLE table ) )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:133:7: K_DESCRIBE K_TABLE table
            {
            K_DESCRIBE45=(Token)match(input,K_DESCRIBE,FOLLOW_K_DESCRIBE_in_describeTable641); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_DESCRIBE.add(K_DESCRIBE45);

            K_TABLE46=(Token)match(input,K_TABLE,FOLLOW_K_TABLE_in_describeTable643); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_K_TABLE.add(K_TABLE46);

            pushFollow(FOLLOW_table_in_describeTable645);
            table47=table();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_table.add(table47.getTree());


            // AST REWRITE
            // elements: table
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 133:32: -> ^( NODE_DESCRIBE_TABLE table )
            {
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:133:35: ^( NODE_DESCRIBE_TABLE table )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_DESCRIBE_TABLE, "NODE_DESCRIBE_TABLE"), root_1);

                adaptor.addChild(root_1, stream_table.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "describeTable"

    public static class columnFamilyExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnFamilyExpr"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:135:1: columnFamilyExpr : table DOT columnFamily '[' rowKey ']' ( '[' a+= columnOrSuperColumn ']' ( '[' a+= columnOrSuperColumn ']' )? )? -> ^( NODE_COLUMN_ACCESS table columnFamily rowKey ( ( $a)+ )? ) ;
    public final CliParser.columnFamilyExpr_return columnFamilyExpr() throws RecognitionException {
        CliParser.columnFamilyExpr_return retval = new CliParser.columnFamilyExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT49=null;
        Token char_literal51=null;
        Token char_literal53=null;
        Token char_literal54=null;
        Token char_literal55=null;
        Token char_literal56=null;
        Token char_literal57=null;
        List list_a=null;
        CliParser.table_return table48 = null;

        CliParser.columnFamily_return columnFamily50 = null;

        CliParser.rowKey_return rowKey52 = null;

        CliParser.columnOrSuperColumn_return a = null;
         a = null;
        CommonTree DOT49_tree=null;
        CommonTree char_literal51_tree=null;
        CommonTree char_literal53_tree=null;
        CommonTree char_literal54_tree=null;
        CommonTree char_literal55_tree=null;
        CommonTree char_literal56_tree=null;
        CommonTree char_literal57_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_columnFamily=new RewriteRuleSubtreeStream(adaptor,"rule columnFamily");
        RewriteRuleSubtreeStream stream_rowKey=new RewriteRuleSubtreeStream(adaptor,"rule rowKey");
        RewriteRuleSubtreeStream stream_table=new RewriteRuleSubtreeStream(adaptor,"rule table");
        RewriteRuleSubtreeStream stream_columnOrSuperColumn=new RewriteRuleSubtreeStream(adaptor,"rule columnOrSuperColumn");
        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:136:5: ( table DOT columnFamily '[' rowKey ']' ( '[' a+= columnOrSuperColumn ']' ( '[' a+= columnOrSuperColumn ']' )? )? -> ^( NODE_COLUMN_ACCESS table columnFamily rowKey ( ( $a)+ )? ) )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:136:7: table DOT columnFamily '[' rowKey ']' ( '[' a+= columnOrSuperColumn ']' ( '[' a+= columnOrSuperColumn ']' )? )?
            {
            pushFollow(FOLLOW_table_in_columnFamilyExpr665);
            table48=table();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_table.add(table48.getTree());
            DOT49=(Token)match(input,DOT,FOLLOW_DOT_in_columnFamilyExpr667); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT49);

            pushFollow(FOLLOW_columnFamily_in_columnFamilyExpr669);
            columnFamily50=columnFamily();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnFamily.add(columnFamily50.getTree());
            char_literal51=(Token)match(input,46,FOLLOW_46_in_columnFamilyExpr671); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(char_literal51);

            pushFollow(FOLLOW_rowKey_in_columnFamilyExpr673);
            rowKey52=rowKey();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rowKey.add(rowKey52.getTree());
            char_literal53=(Token)match(input,47,FOLLOW_47_in_columnFamilyExpr675); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(char_literal53);

            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:137:9: ( '[' a+= columnOrSuperColumn ']' ( '[' a+= columnOrSuperColumn ']' )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==46) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:137:11: '[' a+= columnOrSuperColumn ']' ( '[' a+= columnOrSuperColumn ']' )?
                    {
                    char_literal54=(Token)match(input,46,FOLLOW_46_in_columnFamilyExpr688); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_46.add(char_literal54);

                    pushFollow(FOLLOW_columnOrSuperColumn_in_columnFamilyExpr692);
                    a=columnOrSuperColumn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(a.getTree());
                    if (list_a==null) list_a=new ArrayList();
                    list_a.add(a.getTree());

                    char_literal55=(Token)match(input,47,FOLLOW_47_in_columnFamilyExpr694); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_47.add(char_literal55);

                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:138:13: ( '[' a+= columnOrSuperColumn ']' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==46) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:138:14: '[' a+= columnOrSuperColumn ']'
                            {
                            char_literal56=(Token)match(input,46,FOLLOW_46_in_columnFamilyExpr710); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_46.add(char_literal56);

                            pushFollow(FOLLOW_columnOrSuperColumn_in_columnFamilyExpr714);
                            a=columnOrSuperColumn();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_columnOrSuperColumn.add(a.getTree());
                            if (list_a==null) list_a=new ArrayList();
                            list_a.add(a.getTree());

                            char_literal57=(Token)match(input,47,FOLLOW_47_in_columnFamilyExpr716); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_47.add(char_literal57);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: a, rowKey, table, columnFamily
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: a
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",list_a);
            root_0 = (CommonTree)adaptor.nil();
            // 140:7: -> ^( NODE_COLUMN_ACCESS table columnFamily rowKey ( ( $a)+ )? )
            {
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:140:10: ^( NODE_COLUMN_ACCESS table columnFamily rowKey ( ( $a)+ )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_COLUMN_ACCESS, "NODE_COLUMN_ACCESS"), root_1);

                adaptor.addChild(root_1, stream_table.nextTree());
                adaptor.addChild(root_1, stream_columnFamily.nextTree());
                adaptor.addChild(root_1, stream_rowKey.nextTree());
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:140:57: ( ( $a)+ )?
                if ( stream_a.hasNext() ) {
                    if ( !(stream_a.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_a.hasNext() ) {
                        adaptor.addChild(root_1, stream_a.nextTree());

                    }
                    stream_a.reset();

                }
                stream_a.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnFamilyExpr"

    public static class table_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "table"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:143:1: table : Identifier ;
    public final CliParser.table_return table() throws RecognitionException {
        CliParser.table_return retval = new CliParser.table_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier58=null;

        CommonTree Identifier58_tree=null;

        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:143:6: ( Identifier )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:143:8: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier58=(Token)match(input,Identifier,FOLLOW_Identifier_in_table767); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier58_tree = (CommonTree)adaptor.create(Identifier58);
            adaptor.addChild(root_0, Identifier58_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "table"

    public static class columnFamily_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnFamily"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:145:1: columnFamily : Identifier ;
    public final CliParser.columnFamily_return columnFamily() throws RecognitionException {
        CliParser.columnFamily_return retval = new CliParser.columnFamily_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier59=null;

        CommonTree Identifier59_tree=null;

        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:145:13: ( Identifier )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:145:15: Identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier59=(Token)match(input,Identifier,FOLLOW_Identifier_in_columnFamily774); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier59_tree = (CommonTree)adaptor.create(Identifier59);
            adaptor.addChild(root_0, Identifier59_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnFamily"

    public static class rowKey_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rowKey"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:147:1: rowKey : StringLiteral ;
    public final CliParser.rowKey_return rowKey() throws RecognitionException {
        CliParser.rowKey_return retval = new CliParser.rowKey_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral60=null;

        CommonTree StringLiteral60_tree=null;

        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:147:7: ( StringLiteral )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:147:11: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral60=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_rowKey783); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral60_tree = (CommonTree)adaptor.create(StringLiteral60);
            adaptor.addChild(root_0, StringLiteral60_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rowKey"

    public static class value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:149:1: value : StringLiteral ;
    public final CliParser.value_return value() throws RecognitionException {
        CliParser.value_return retval = new CliParser.value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral61=null;

        CommonTree StringLiteral61_tree=null;

        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:149:6: ( StringLiteral )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:149:8: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral61=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_value790); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral61_tree = (CommonTree)adaptor.create(StringLiteral61);
            adaptor.addChild(root_0, StringLiteral61_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class columnOrSuperColumn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "columnOrSuperColumn"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:151:1: columnOrSuperColumn : StringLiteral ;
    public final CliParser.columnOrSuperColumn_return columnOrSuperColumn() throws RecognitionException {
        CliParser.columnOrSuperColumn_return retval = new CliParser.columnOrSuperColumn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral62=null;

        CommonTree StringLiteral62_tree=null;

        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:151:20: ( StringLiteral )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:151:22: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral62=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_columnOrSuperColumn797); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            StringLiteral62_tree = (CommonTree)adaptor.create(StringLiteral62);
            adaptor.addChild(root_0, StringLiteral62_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "columnOrSuperColumn"

    public static class host_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "host"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:153:1: host : id+= HostIdentifier -> ^( NODE_ID_LIST ( $id)+ ) ;
    public final CliParser.host_return host() throws RecognitionException {
        CliParser.host_return retval = new CliParser.host_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token id=null;
        List list_id=null;

        CommonTree id_tree=null;
        RewriteRuleTokenStream stream_HostIdentifier=new RewriteRuleTokenStream(adaptor,"token HostIdentifier");

        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:153:5: (id+= HostIdentifier -> ^( NODE_ID_LIST ( $id)+ ) )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:153:7: id+= HostIdentifier
            {
            id=(Token)match(input,HostIdentifier,FOLLOW_HostIdentifier_in_host806); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_HostIdentifier.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);



            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: id
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id", list_id);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 153:26: -> ^( NODE_ID_LIST ( $id)+ )
            {
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:153:29: ^( NODE_ID_LIST ( $id)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ID_LIST, "NODE_ID_LIST"), root_1);

                if ( !(stream_id.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_id.hasNext() ) {
                    adaptor.addChild(root_1, stream_id.nextNode());

                }
                stream_id.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "host"

    public static class ip_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ip"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:155:1: ip : id+= IntegerLiteral id+= DOT id+= IntegerLiteral id+= DOT id+= IntegerLiteral id+= DOT id+= IntegerLiteral -> ^( NODE_ID_LIST ( $id)+ ) ;
    public final CliParser.ip_return ip() throws RecognitionException {
        CliParser.ip_return retval = new CliParser.ip_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token id=null;
        List list_id=null;

        CommonTree id_tree=null;
        RewriteRuleTokenStream stream_IntegerLiteral=new RewriteRuleTokenStream(adaptor,"token IntegerLiteral");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");

        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:155:3: (id+= IntegerLiteral id+= DOT id+= IntegerLiteral id+= DOT id+= IntegerLiteral id+= DOT id+= IntegerLiteral -> ^( NODE_ID_LIST ( $id)+ ) )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:155:5: id+= IntegerLiteral id+= DOT id+= IntegerLiteral id+= DOT id+= IntegerLiteral id+= DOT id+= IntegerLiteral
            {
            id=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_ip825); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IntegerLiteral.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);

            id=(Token)match(input,DOT,FOLLOW_DOT_in_ip829); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);

            id=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_ip833); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IntegerLiteral.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);

            id=(Token)match(input,DOT,FOLLOW_DOT_in_ip837); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);

            id=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_ip841); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IntegerLiteral.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);

            id=(Token)match(input,DOT,FOLLOW_DOT_in_ip845); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);

            id=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_ip849); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IntegerLiteral.add(id);

            if (list_id==null) list_id=new ArrayList();
            list_id.add(id);



            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: id
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id", list_id);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 155:105: -> ^( NODE_ID_LIST ( $id)+ )
            {
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:155:108: ^( NODE_ID_LIST ( $id)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NODE_ID_LIST, "NODE_ID_LIST"), root_1);

                if ( !(stream_id.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_id.hasNext() ) {
                    adaptor.addChild(root_1, stream_id.nextNode());

                }
                stream_id.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ip"

    public static class port_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "port"
    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:157:1: port : IntegerLiteral ;
    public final CliParser.port_return port() throws RecognitionException {
        CliParser.port_return retval = new CliParser.port_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IntegerLiteral63=null;

        CommonTree IntegerLiteral63_tree=null;

        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:157:5: ( IntegerLiteral )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:157:7: IntegerLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            IntegerLiteral63=(Token)match(input,IntegerLiteral,FOLLOW_IntegerLiteral_in_port866); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IntegerLiteral63_tree = (CommonTree)adaptor.create(IntegerLiteral63);
            adaptor.addChild(root_0, IntegerLiteral63_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "port"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\1\7\11\uffff";
    static final String DFA2_minS =
        "\1\21\3\uffff\1\30\5\uffff";
    static final String DFA2_maxS =
        "\1\54\3\uffff\1\31\5\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\7\1\10\1\4\1\6";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\7\1\1\1\uffff\1\5\2\2\1\4\2\uffff\1\6\6\uffff\1\3\12\uffff"+
            "\1\5",
            "",
            "",
            "",
            "\1\10\1\11",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "75:1: stmt : ( connectStmt | exitStmt | describeTable | getStmt | helpStmt | setStmt | showStmt | -> ^( NODE_NO_OP ) );";
        }
    }
 

    public static final BitSet FOLLOW_stmt_in_root200 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_SEMICOLON_in_root202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_root205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_connectStmt_in_stmt221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exitStmt_in_stmt229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_describeTable_in_stmt237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getStmt_in_stmt245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_helpStmt_in_stmt253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setStmt_in_stmt261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showStmt_in_stmt269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CONNECT_in_connectStmt298 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_host_in_connectStmt300 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SLASH_in_connectStmt302 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_port_in_connectStmt304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CONNECT_in_connectStmt322 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ip_in_connectStmt324 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SLASH_in_connectStmt326 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_port_in_connectStmt328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_HELP_in_helpStmt355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_helpStmt369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_QUIT_in_exitStmt395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_EXIT_in_exitStmt409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_THRIFT_in_getStmt432 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_K_GET_in_getStmt434 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_getStmt436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_THRIFT_in_setStmt461 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_K_SET_in_setStmt463 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_columnFamilyExpr_in_setStmt465 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_setStmt467 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_value_in_setStmt469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showClusterName_in_showStmt496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showVersion_in_showStmt504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showConfigFile_in_showStmt512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_showTables_in_showStmt520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SHOW_in_showClusterName537 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_CLUSTER_in_showClusterName539 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_K_NAME_in_showClusterName541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SHOW_in_showConfigFile564 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_K_CONFIG_in_showConfigFile566 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_K_FILE_in_showConfigFile568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SHOW_in_showVersion591 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_K_VERSION_in_showVersion593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SHOW_in_showTables616 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_K_TABLES_in_showTables618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DESCRIBE_in_describeTable641 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_K_TABLE_in_describeTable643 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_table_in_describeTable645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_in_columnFamilyExpr665 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_columnFamilyExpr667 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_columnFamily_in_columnFamilyExpr669 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_columnFamilyExpr671 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rowKey_in_columnFamilyExpr673 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_columnFamilyExpr675 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_columnFamilyExpr688 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_columnFamilyExpr692 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_columnFamilyExpr694 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_columnFamilyExpr710 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_columnOrSuperColumn_in_columnFamilyExpr714 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_columnFamilyExpr716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_table767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_columnFamily774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_rowKey783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_value790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_columnOrSuperColumn797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HostIdentifier_in_host806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_ip825 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_ip829 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_IntegerLiteral_in_ip833 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_ip837 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_IntegerLiteral_in_ip841 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_DOT_in_ip845 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_IntegerLiteral_in_ip849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegerLiteral_in_port866 = new BitSet(new long[]{0x0000000000000002L});

}