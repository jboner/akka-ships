// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g 2009-09-10 18:27:11

package org.apache.cassandra.cli;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CliLexer extends Lexer {
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
    public static final int SLASH=19;
    public static final int NODE_CONNECT=4;
    public static final int NODE_SHOW_TABLES=12;
    public static final int K_CLUSTER=27;
    public static final int K_SHOW=26;
    public static final int NODE_DESCRIBE_TABLE=5;
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
    public static final int IntegerLiteral=39;
    public static final int NODE_SHOW_CLUSTER_NAME=9;
    public static final int Letter=40;
    public static final int NODE_COLUMN_ACCESS=15;

    // delegates
    // delegators

    public CliLexer() {;} 
    public CliLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CliLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g"; }

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:7:7: ( '?' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:7:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:8:7: ( '=' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:8:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:9:7: ( '[' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:9:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:10:7: ( ']' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:10:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "K_CONFIG"
    public final void mK_CONFIG() throws RecognitionException {
        try {
            int _type = K_CONFIG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:169:9: ( 'CONFIG' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:169:15: 'CONFIG'
            {
            match("CONFIG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_CONFIG"

    // $ANTLR start "K_CONNECT"
    public final void mK_CONNECT() throws RecognitionException {
        try {
            int _type = K_CONNECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:170:10: ( 'CONNECT' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:170:15: 'CONNECT'
            {
            match("CONNECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_CONNECT"

    // $ANTLR start "K_CLUSTER"
    public final void mK_CLUSTER() throws RecognitionException {
        try {
            int _type = K_CLUSTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:171:10: ( 'CLUSTER' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:171:15: 'CLUSTER'
            {
            match("CLUSTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_CLUSTER"

    // $ANTLR start "K_DESCRIBE"
    public final void mK_DESCRIBE() throws RecognitionException {
        try {
            int _type = K_DESCRIBE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:172:11: ( 'DESCRIBE' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:172:15: 'DESCRIBE'
            {
            match("DESCRIBE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DESCRIBE"

    // $ANTLR start "K_GET"
    public final void mK_GET() throws RecognitionException {
        try {
            int _type = K_GET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:173:6: ( 'GET' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:173:15: 'GET'
            {
            match("GET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_GET"

    // $ANTLR start "K_HELP"
    public final void mK_HELP() throws RecognitionException {
        try {
            int _type = K_HELP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:174:7: ( 'HELP' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:174:15: 'HELP'
            {
            match("HELP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_HELP"

    // $ANTLR start "K_EXIT"
    public final void mK_EXIT() throws RecognitionException {
        try {
            int _type = K_EXIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:175:7: ( 'EXIT' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:175:15: 'EXIT'
            {
            match("EXIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_EXIT"

    // $ANTLR start "K_FILE"
    public final void mK_FILE() throws RecognitionException {
        try {
            int _type = K_FILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:176:7: ( 'FILE' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:176:15: 'FILE'
            {
            match("FILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_FILE"

    // $ANTLR start "K_NAME"
    public final void mK_NAME() throws RecognitionException {
        try {
            int _type = K_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:177:7: ( 'NAME' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:177:15: 'NAME'
            {
            match("NAME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_NAME"

    // $ANTLR start "K_QUIT"
    public final void mK_QUIT() throws RecognitionException {
        try {
            int _type = K_QUIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:178:7: ( 'QUIT' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:178:15: 'QUIT'
            {
            match("QUIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_QUIT"

    // $ANTLR start "K_SET"
    public final void mK_SET() throws RecognitionException {
        try {
            int _type = K_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:179:6: ( 'SET' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:179:15: 'SET'
            {
            match("SET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_SET"

    // $ANTLR start "K_SHOW"
    public final void mK_SHOW() throws RecognitionException {
        try {
            int _type = K_SHOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:180:7: ( 'SHOW' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:180:15: 'SHOW'
            {
            match("SHOW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_SHOW"

    // $ANTLR start "K_TABLE"
    public final void mK_TABLE() throws RecognitionException {
        try {
            int _type = K_TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:181:8: ( 'KEYSPACE' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:181:15: 'KEYSPACE'
            {
            match("KEYSPACE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TABLE"

    // $ANTLR start "K_TABLES"
    public final void mK_TABLES() throws RecognitionException {
        try {
            int _type = K_TABLES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:182:9: ( 'KEYSPACES' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:182:15: 'KEYSPACES'
            {
            match("KEYSPACES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TABLES"

    // $ANTLR start "K_THRIFT"
    public final void mK_THRIFT() throws RecognitionException {
        try {
            int _type = K_THRIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:183:9: ( 'THRIFT' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:183:15: 'THRIFT'
            {
            match("THRIFT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_THRIFT"

    // $ANTLR start "K_VERSION"
    public final void mK_VERSION() throws RecognitionException {
        try {
            int _type = K_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:184:10: ( 'VERSION' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:184:15: 'VERSION'
            {
            match("VERSION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_VERSION"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:189:5: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:195:5: ( '0' .. '9' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:195:7: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:200:5: ( Letter ( Letter | Digit | '_' )* )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:200:7: Letter ( Letter | Digit | '_' )*
            {
            mLetter(); 
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:200:14: ( Letter | Digit | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:205:5: ( '\\'' (~ '\\'' )* '\\'' ( '\\'' (~ '\\'' )* '\\'' )* )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:206:5: '\\'' (~ '\\'' )* '\\'' ( '\\'' (~ '\\'' )* '\\'' )*
            {
            match('\''); 
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:206:10: (~ '\\'' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:206:11: ~ '\\''
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\''); 
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:206:24: ( '\\'' (~ '\\'' )* '\\'' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\'') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:206:26: '\\'' (~ '\\'' )* '\\''
            	    {
            	    match('\''); 
            	    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:206:31: (~ '\\'' )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFF')) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:206:32: ~ '\\''
            	    	    {
            	    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    match('\''); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "IntegerLiteral"
    public final void mIntegerLiteral() throws RecognitionException {
        try {
            int _type = IntegerLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:210:4: ( ( Digit )+ )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:210:6: ( Digit )+
            {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:210:6: ( Digit )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:210:6: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IntegerLiteral"

    // $ANTLR start "HostIdentifier"
    public final void mHostIdentifier() throws RecognitionException {
        try {
            int _type = HostIdentifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:214:5: ( ( Letter | Digit ) ( Letter | Digit | DOT | '-' )* ( Letter | Digit ) )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:214:7: ( Letter | Digit ) ( Letter | Digit | DOT | '-' )* ( Letter | Digit )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:214:26: ( Letter | Digit | DOT | '-' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                    int LA6_1 = input.LA(2);

                    if ( ((LA6_1>='-' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='9')||(LA6_1>='A' && LA6_1<='Z')||(LA6_1>='a' && LA6_1<='z')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='-' && LA6_0<='.')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HostIdentifier"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:222:5: ( '.' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:222:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:226:5: ( '/' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:226:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:230:5: ( ';' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:230:7: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:234:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:234:8: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:238:5: ( '--' (~ ( '\\n' | '\\r' ) )* | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='-') ) {
                alt9=1;
            }
            else if ( (LA9_0=='/') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:238:7: '--' (~ ( '\\n' | '\\r' ) )*
                    {
                    match("--"); 

                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:238:12: (~ ( '\\n' | '\\r' ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:238:13: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                     _channel=HIDDEN; 

                    }
                    break;
                case 2 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:239:7: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:239:12: ( options {greedy=false; } : . )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='*') ) {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1=='/') ) {
                                alt8=2;
                            }
                            else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                                alt8=1;
                            }


                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:239:39: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match("*/"); 

                     _channel=HIDDEN; 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:8: ( T__44 | T__45 | T__46 | T__47 | K_CONFIG | K_CONNECT | K_CLUSTER | K_DESCRIBE | K_GET | K_HELP | K_EXIT | K_FILE | K_NAME | K_QUIT | K_SET | K_SHOW | K_TABLE | K_TABLES | K_THRIFT | K_VERSION | Identifier | StringLiteral | IntegerLiteral | HostIdentifier | DOT | SLASH | SEMICOLON | WS | COMMENT )
        int alt10=29;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:10: T__44
                {
                mT__44(); 

                }
                break;
            case 2 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:16: T__45
                {
                mT__45(); 

                }
                break;
            case 3 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:22: T__46
                {
                mT__46(); 

                }
                break;
            case 4 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:28: T__47
                {
                mT__47(); 

                }
                break;
            case 5 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:34: K_CONFIG
                {
                mK_CONFIG(); 

                }
                break;
            case 6 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:43: K_CONNECT
                {
                mK_CONNECT(); 

                }
                break;
            case 7 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:53: K_CLUSTER
                {
                mK_CLUSTER(); 

                }
                break;
            case 8 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:63: K_DESCRIBE
                {
                mK_DESCRIBE(); 

                }
                break;
            case 9 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:74: K_GET
                {
                mK_GET(); 

                }
                break;
            case 10 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:80: K_HELP
                {
                mK_HELP(); 

                }
                break;
            case 11 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:87: K_EXIT
                {
                mK_EXIT(); 

                }
                break;
            case 12 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:94: K_FILE
                {
                mK_FILE(); 

                }
                break;
            case 13 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:101: K_NAME
                {
                mK_NAME(); 

                }
                break;
            case 14 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:108: K_QUIT
                {
                mK_QUIT(); 

                }
                break;
            case 15 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:115: K_SET
                {
                mK_SET(); 

                }
                break;
            case 16 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:121: K_SHOW
                {
                mK_SHOW(); 

                }
                break;
            case 17 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:128: K_TABLE
                {
                mK_TABLE(); 

                }
                break;
            case 18 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:136: K_TABLES
                {
                mK_TABLES(); 

                }
                break;
            case 19 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:145: K_THRIFT
                {
                mK_THRIFT(); 

                }
                break;
            case 20 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:154: K_VERSION
                {
                mK_VERSION(); 

                }
                break;
            case 21 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:164: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 22 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:175: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 23 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:189: IntegerLiteral
                {
                mIntegerLiteral(); 

                }
                break;
            case 24 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:204: HostIdentifier
                {
                mHostIdentifier(); 

                }
                break;
            case 25 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:219: DOT
                {
                mDOT(); 

                }
                break;
            case 26 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:223: SLASH
                {
                mSLASH(); 

                }
                break;
            case 27 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:229: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 28 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:239: WS
                {
                mWS(); 

                }
                break;
            case 29 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cli/Cli.g:1:242: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\5\uffff\15\35\1\uffff\1\53\1\uffff\1\54\3\uffff\3\35\2\uffff\14"+
        "\35\1\53\2\uffff\3\35\1\77\5\35\1\105\10\35\1\uffff\1\116\1\117"+
        "\1\120\1\121\1\122\1\uffff\1\123\7\35\6\uffff\3\35\1\136\4\35\1"+
        "\143\1\35\1\uffff\1\145\1\146\2\35\1\uffff\1\151\2\uffff\1\152\1"+
        "\154\2\uffff\1\155\2\uffff";
    static final String DFA10_eofS =
        "\156\uffff";
    static final String DFA10_minS =
        "\1\11\4\uffff\15\55\1\uffff\1\55\1\uffff\1\52\3\uffff\3\55\2\uffff"+
        "\15\55\2\uffff\22\55\1\uffff\5\55\1\uffff\10\55\6\uffff\12\55\1"+
        "\uffff\4\55\1\uffff\1\55\2\uffff\2\55\2\uffff\1\55\2\uffff";
    static final String DFA10_maxS =
        "\1\172\4\uffff\15\172\1\uffff\1\172\1\uffff\1\52\3\uffff\3\172\2"+
        "\uffff\15\172\2\uffff\22\172\1\uffff\5\172\1\uffff\10\172\6\uffff"+
        "\12\172\1\uffff\4\172\1\uffff\1\172\2\uffff\2\172\2\uffff\1\172"+
        "\2\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\15\uffff\1\26\1\uffff\1\31\1\uffff\1\33"+
        "\1\34\1\35\3\uffff\1\30\1\25\15\uffff\1\27\1\32\22\uffff\1\11\5"+
        "\uffff\1\17\10\uffff\1\12\1\13\1\14\1\15\1\16\1\20\12\uffff\1\5"+
        "\4\uffff\1\23\1\uffff\1\6\1\7\2\uffff\1\24\1\10\1\uffff\1\21\1\22";
    static final String DFA10_specialS =
        "\156\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\27\2\uffff\1\27\22\uffff\1\27\6\uffff\1\22\5\uffff\1\30\1"+
            "\24\1\25\12\23\1\uffff\1\26\1\uffff\1\2\1\uffff\1\1\1\uffff"+
            "\2\21\1\5\1\6\1\11\1\12\1\7\1\10\2\21\1\16\2\21\1\13\2\21\1"+
            "\14\1\21\1\15\1\17\1\21\1\20\4\21\1\3\1\uffff\1\4\3\uffff\32"+
            "\21",
            "",
            "",
            "",
            "",
            "\2\34\1\uffff\12\33\7\uffff\13\33\1\32\2\33\1\31\13\33\6\uffff"+
            "\32\33",
            "\2\34\1\uffff\12\33\7\uffff\4\33\1\36\25\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\4\33\1\37\25\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\4\33\1\40\25\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\27\33\1\41\2\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\10\33\1\42\21\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\1\43\31\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\24\33\1\44\5\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\4\33\1\45\2\33\1\46\22\33\6\uffff"+
            "\32\33",
            "\2\34\1\uffff\12\33\7\uffff\4\33\1\47\25\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\7\33\1\50\22\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\4\33\1\51\25\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "\2\34\1\uffff\12\52\7\uffff\32\34\6\uffff\32\34",
            "",
            "\1\30",
            "",
            "",
            "",
            "\2\34\1\uffff\12\33\7\uffff\15\33\1\55\14\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\24\33\1\56\5\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "",
            "\2\34\1\uffff\12\33\7\uffff\22\33\1\57\7\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\23\33\1\60\6\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\13\33\1\61\16\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\10\33\1\62\21\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\13\33\1\63\16\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\14\33\1\64\15\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\10\33\1\65\21\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\23\33\1\66\6\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\16\33\1\67\13\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\30\33\1\70\1\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\21\33\1\71\10\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\21\33\1\72\10\33\6\uffff\32\33",
            "\2\34\1\uffff\12\52\7\uffff\32\34\6\uffff\32\34",
            "",
            "",
            "\2\34\1\uffff\12\33\7\uffff\5\33\1\73\7\33\1\74\14\33\6\uffff"+
            "\32\33",
            "\2\34\1\uffff\12\33\7\uffff\22\33\1\75\7\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\2\33\1\76\27\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\32\33\4\uffff\1\35\1\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\17\33\1\100\12\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\23\33\1\101\6\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\4\33\1\102\25\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\4\33\1\103\25\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\23\33\1\104\6\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\32\33\4\uffff\1\35\1\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\26\33\1\106\3\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\22\33\1\107\7\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\10\33\1\110\21\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\22\33\1\111\7\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\10\33\1\112\21\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\4\33\1\113\25\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\23\33\1\114\6\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\21\33\1\115\10\33\6\uffff\32\33",
            "",
            "\2\34\1\uffff\12\33\7\uffff\32\33\4\uffff\1\35\1\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\32\33\4\uffff\1\35\1\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\32\33\4\uffff\1\35\1\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\32\33\4\uffff\1\35\1\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\32\33\4\uffff\1\35\1\uffff\32\33",
            "",
            "\2\34\1\uffff\12\33\7\uffff\32\33\4\uffff\1\35\1\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\17\33\1\124\12\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\5\33\1\125\24\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\10\33\1\126\21\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\6\33\1\127\23\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\2\33\1\130\27\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\4\33\1\131\25\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\10\33\1\132\21\33\6\uffff\32\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\34\1\uffff\12\33\7\uffff\1\133\31\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\23\33\1\134\6\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\16\33\1\135\13\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\32\33\4\uffff\1\35\1\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\23\33\1\137\6\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\21\33\1\140\10\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\1\33\1\141\30\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\2\33\1\142\27\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\32\33\4\uffff\1\35\1\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\15\33\1\144\14\33\6\uffff\32\33",
            "",
            "\2\34\1\uffff\12\33\7\uffff\32\33\4\uffff\1\35\1\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\32\33\4\uffff\1\35\1\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\4\33\1\147\25\33\6\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\4\33\1\150\25\33\6\uffff\32\33",
            "",
            "\2\34\1\uffff\12\33\7\uffff\32\33\4\uffff\1\35\1\uffff\32\33",
            "",
            "",
            "\2\34\1\uffff\12\33\7\uffff\32\33\4\uffff\1\35\1\uffff\32\33",
            "\2\34\1\uffff\12\33\7\uffff\22\33\1\153\7\33\4\uffff\1\35\1"+
            "\uffff\32\33",
            "",
            "",
            "\2\34\1\uffff\12\33\7\uffff\32\33\4\uffff\1\35\1\uffff\32\33",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__44 | T__45 | T__46 | T__47 | K_CONFIG | K_CONNECT | K_CLUSTER | K_DESCRIBE | K_GET | K_HELP | K_EXIT | K_FILE | K_NAME | K_QUIT | K_SET | K_SHOW | K_TABLE | K_TABLES | K_THRIFT | K_VERSION | Identifier | StringLiteral | IntegerLiteral | HostIdentifier | DOT | SLASH | SEMICOLON | WS | COMMENT );";
        }
    }
 

}