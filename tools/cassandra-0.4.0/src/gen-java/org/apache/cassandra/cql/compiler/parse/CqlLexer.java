// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g 2009-09-10 18:27:13

            package org.apache.cassandra.cql.compiler.parse;
        

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CqlLexer extends Lexer {
    public static final int K_EXPLAIN=23;
    public static final int K_OFFSET=41;
    public static final int K_GET=25;
    public static final int K_DELETE=33;
    public static final int A_KEY_EXACT_MATCH=14;
    public static final int K_BY=40;
    public static final int A_SELECT=6;
    public static final int A_SUPERCOLUMN_MAP_VALUE=19;
    public static final int EOF=-1;
    public static final int K_SELECT=27;
    public static final int K_LIMIT=31;
    public static final int Identifier=34;
    public static final int K_SET=26;
    public static final int K_WHERE=29;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int COMMA=36;
    public static final int A_EXPLAIN_PLAN=8;
    public static final int A_LIMIT=15;
    public static final int COMMENT=46;
    public static final int T__50=50;
    public static final int K_ORDER=42;
    public static final int RIGHT_BRACE=37;
    public static final int A_COLUMN_MAP_VALUE=11;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int SEMICOLON=22;
    public static final int K_IN=30;
    public static final int Digit=44;
    public static final int A_OFFSET=16;
    public static final int A_WHERE=21;
    public static final int K_PLAN=24;
    public static final int A_ORDER_BY=17;
    public static final int K_FROM=28;
    public static final int StringLiteral=39;
    public static final int A_COLUMN_MAP_ENTRY=10;
    public static final int WS=45;
    public static final int LEFT_BRACE=35;
    public static final int A_FROM=12;
    public static final int A_GET=5;
    public static final int A_KEY_IN_LIST=13;
    public static final int A_COLUMN_ACCESS=9;
    public static final int IntegerLiteral=32;
    public static final int A_SUPERCOLUMN_MAP_ENTRY=18;
    public static final int ASSOC=38;
    public static final int A_SELECT_CLAUSE=20;
    public static final int Letter=43;
    public static final int A_DELETE=4;
    public static final int A_SET=7;

    // delegates
    // delegators

    public CqlLexer() {;} 
    public CqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g"; }

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:7:7: ( '=' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:7:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:8:7: ( '(' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:8:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:9:7: ( ')' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:9:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:10:7: ( '[' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:10:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:11:7: ( ']' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:11:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:12:7: ( '.' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:13:7: ( '?' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:13:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "K_BY"
    public final void mK_BY() throws RecognitionException {
        try {
            int _type = K_BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:247:5: ( 'BY' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:247:14: 'BY'
            {
            match("BY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_BY"

    // $ANTLR start "K_DELETE"
    public final void mK_DELETE() throws RecognitionException {
        try {
            int _type = K_DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:248:9: ( 'DELETE' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:248:14: 'DELETE'
            {
            match("DELETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DELETE"

    // $ANTLR start "K_EXPLAIN"
    public final void mK_EXPLAIN() throws RecognitionException {
        try {
            int _type = K_EXPLAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:249:10: ( 'EXPLAIN' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:249:14: 'EXPLAIN'
            {
            match("EXPLAIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_EXPLAIN"

    // $ANTLR start "K_FROM"
    public final void mK_FROM() throws RecognitionException {
        try {
            int _type = K_FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:250:7: ( 'FROM' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:250:14: 'FROM'
            {
            match("FROM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_FROM"

    // $ANTLR start "K_GET"
    public final void mK_GET() throws RecognitionException {
        try {
            int _type = K_GET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:251:6: ( 'GET' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:251:14: 'GET'
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

    // $ANTLR start "K_IN"
    public final void mK_IN() throws RecognitionException {
        try {
            int _type = K_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:252:5: ( 'IN' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:252:14: 'IN'
            {
            match("IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_IN"

    // $ANTLR start "K_LIMIT"
    public final void mK_LIMIT() throws RecognitionException {
        try {
            int _type = K_LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:253:8: ( 'LIMIT' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:253:14: 'LIMIT'
            {
            match("LIMIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_LIMIT"

    // $ANTLR start "K_OFFSET"
    public final void mK_OFFSET() throws RecognitionException {
        try {
            int _type = K_OFFSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:254:9: ( 'OFFSET' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:254:14: 'OFFSET'
            {
            match("OFFSET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_OFFSET"

    // $ANTLR start "K_ORDER"
    public final void mK_ORDER() throws RecognitionException {
        try {
            int _type = K_ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:255:8: ( 'ORDER' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:255:14: 'ORDER'
            {
            match("ORDER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ORDER"

    // $ANTLR start "K_PLAN"
    public final void mK_PLAN() throws RecognitionException {
        try {
            int _type = K_PLAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:256:7: ( 'PLAN' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:256:14: 'PLAN'
            {
            match("PLAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_PLAN"

    // $ANTLR start "K_SELECT"
    public final void mK_SELECT() throws RecognitionException {
        try {
            int _type = K_SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:257:9: ( 'SELECT' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:257:14: 'SELECT'
            {
            match("SELECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_SELECT"

    // $ANTLR start "K_SET"
    public final void mK_SET() throws RecognitionException {
        try {
            int _type = K_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:258:6: ( 'SET' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:258:14: 'SET'
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

    // $ANTLR start "K_WHERE"
    public final void mK_WHERE() throws RecognitionException {
        try {
            int _type = K_WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:259:8: ( 'WHERE' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:259:14: 'WHERE'
            {
            match("WHERE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_WHERE"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:264:5: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:
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
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:270:5: ( '0' .. '9' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:270:7: '0' .. '9'
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
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:275:5: ( Letter ( Letter | Digit | '_' )* )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:275:7: Letter ( Letter | Digit | '_' )*
            {
            mLetter(); 
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:275:14: ( Letter | Digit | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:
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
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:284:5: ( '\\'' (~ '\\'' )* '\\'' ( '\\'' (~ '\\'' )* '\\'' )* )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:284:7: '\\'' (~ '\\'' )* '\\'' ( '\\'' (~ '\\'' )* '\\'' )*
            {
            match('\''); 
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:284:12: (~ '\\'' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:284:13: ~ '\\''
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
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:284:26: ( '\\'' (~ '\\'' )* '\\'' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\'') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:284:28: '\\'' (~ '\\'' )* '\\''
            	    {
            	    match('\''); 
            	    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:284:33: (~ '\\'' )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFF')) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:284:34: ~ '\\''
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
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:289:5: ( ( Digit )+ )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:289:7: ( Digit )+
            {
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:289:7: ( Digit )+
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
            	    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:289:7: Digit
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:296:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:296:8: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            skip();

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
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:300:5: ( '--' (~ ( '\\n' | '\\r' ) )* | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='-') ) {
                alt8=1;
            }
            else if ( (LA8_0=='/') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:300:7: '--' (~ ( '\\n' | '\\r' ) )*
                    {
                    match("--"); 

                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:300:12: (~ ( '\\n' | '\\r' ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:300:13: ~ ( '\\n' | '\\r' )
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
                    	    break loop6;
                        }
                    } while (true);

                     _channel=HIDDEN; 

                    }
                    break;
                case 2 :
                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:301:7: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:301:12: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:301:39: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
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

    // $ANTLR start "ASSOC"
    public final void mASSOC() throws RecognitionException {
        try {
            int _type = ASSOC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:304:6: ( '=>' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:304:15: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSOC"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:305:6: ( ',' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:305:15: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "LEFT_BRACE"
    public final void mLEFT_BRACE() throws RecognitionException {
        try {
            int _type = LEFT_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:306:11: ( '{' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:306:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFT_BRACE"

    // $ANTLR start "RIGHT_BRACE"
    public final void mRIGHT_BRACE() throws RecognitionException {
        try {
            int _type = RIGHT_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:307:12: ( '}' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:307:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHT_BRACE"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:308:10: ( ';' )
            // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:308:15: ';'
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

    public void mTokens() throws RecognitionException {
        // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:8: ( T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | K_BY | K_DELETE | K_EXPLAIN | K_FROM | K_GET | K_IN | K_LIMIT | K_OFFSET | K_ORDER | K_PLAN | K_SELECT | K_SET | K_WHERE | Identifier | StringLiteral | IntegerLiteral | WS | COMMENT | ASSOC | COMMA | LEFT_BRACE | RIGHT_BRACE | SEMICOLON )
        int alt9=30;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:10: T__47
                {
                mT__47(); 

                }
                break;
            case 2 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:16: T__48
                {
                mT__48(); 

                }
                break;
            case 3 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:22: T__49
                {
                mT__49(); 

                }
                break;
            case 4 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:28: T__50
                {
                mT__50(); 

                }
                break;
            case 5 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:34: T__51
                {
                mT__51(); 

                }
                break;
            case 6 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:40: T__52
                {
                mT__52(); 

                }
                break;
            case 7 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:46: T__53
                {
                mT__53(); 

                }
                break;
            case 8 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:52: K_BY
                {
                mK_BY(); 

                }
                break;
            case 9 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:57: K_DELETE
                {
                mK_DELETE(); 

                }
                break;
            case 10 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:66: K_EXPLAIN
                {
                mK_EXPLAIN(); 

                }
                break;
            case 11 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:76: K_FROM
                {
                mK_FROM(); 

                }
                break;
            case 12 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:83: K_GET
                {
                mK_GET(); 

                }
                break;
            case 13 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:89: K_IN
                {
                mK_IN(); 

                }
                break;
            case 14 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:94: K_LIMIT
                {
                mK_LIMIT(); 

                }
                break;
            case 15 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:102: K_OFFSET
                {
                mK_OFFSET(); 

                }
                break;
            case 16 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:111: K_ORDER
                {
                mK_ORDER(); 

                }
                break;
            case 17 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:119: K_PLAN
                {
                mK_PLAN(); 

                }
                break;
            case 18 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:126: K_SELECT
                {
                mK_SELECT(); 

                }
                break;
            case 19 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:135: K_SET
                {
                mK_SET(); 

                }
                break;
            case 20 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:141: K_WHERE
                {
                mK_WHERE(); 

                }
                break;
            case 21 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:149: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 22 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:160: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 23 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:174: IntegerLiteral
                {
                mIntegerLiteral(); 

                }
                break;
            case 24 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:189: WS
                {
                mWS(); 

                }
                break;
            case 25 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:192: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 26 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:200: ASSOC
                {
                mASSOC(); 

                }
                break;
            case 27 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:206: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 28 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:212: LEFT_BRACE
                {
                mLEFT_BRACE(); 

                }
                break;
            case 29 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:223: RIGHT_BRACE
                {
                mRIGHT_BRACE(); 

                }
                break;
            case 30 :
                // /Users/jboner/src/java/cassandra-trunk/src/java/org/apache/cassandra/cql/compiler/parse/Cql.g:1:235: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\1\35\6\uffff\13\23\13\uffff\1\52\4\23\1\57\6\23\1\uffff"+
        "\3\23\1\72\1\uffff\5\23\1\100\3\23\1\104\1\uffff\3\23\1\110\1\23"+
        "\1\uffff\3\23\1\uffff\1\115\1\23\1\117\1\uffff\1\23\1\121\1\122"+
        "\1\23\1\uffff\1\124\1\uffff\1\125\2\uffff\1\126\3\uffff";
    static final String DFA9_eofS =
        "\127\uffff";
    static final String DFA9_minS =
        "\1\11\1\76\6\uffff\1\131\1\105\1\130\1\122\1\105\1\116\1\111\1\106"+
        "\1\114\1\105\1\110\13\uffff\1\60\1\114\1\120\1\117\1\124\1\60\1"+
        "\115\1\106\1\104\1\101\1\114\1\105\1\uffff\1\105\1\114\1\115\1\60"+
        "\1\uffff\1\111\1\123\1\105\1\116\1\105\1\60\1\122\1\124\1\101\1"+
        "\60\1\uffff\1\124\1\105\1\122\1\60\1\103\1\uffff\2\105\1\111\1\uffff"+
        "\1\60\1\124\1\60\1\uffff\1\124\2\60\1\116\1\uffff\1\60\1\uffff\1"+
        "\60\2\uffff\1\60\3\uffff";
    static final String DFA9_maxS =
        "\1\175\1\76\6\uffff\1\131\1\105\1\130\1\122\1\105\1\116\1\111\1"+
        "\122\1\114\1\105\1\110\13\uffff\1\172\1\114\1\120\1\117\1\124\1"+
        "\172\1\115\1\106\1\104\1\101\1\124\1\105\1\uffff\1\105\1\114\1\115"+
        "\1\172\1\uffff\1\111\1\123\1\105\1\116\1\105\1\172\1\122\1\124\1"+
        "\101\1\172\1\uffff\1\124\1\105\1\122\1\172\1\103\1\uffff\2\105\1"+
        "\111\1\uffff\1\172\1\124\1\172\1\uffff\1\124\2\172\1\116\1\uffff"+
        "\1\172\1\uffff\1\172\2\uffff\1\172\3\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\13\uffff\1\25\1\26\1\27\1\30\1"+
        "\31\1\33\1\34\1\35\1\36\1\32\1\1\14\uffff\1\10\4\uffff\1\15\12\uffff"+
        "\1\14\5\uffff\1\23\3\uffff\1\13\3\uffff\1\21\4\uffff\1\16\1\uffff"+
        "\1\20\1\uffff\1\24\1\11\1\uffff\1\17\1\22\1\12";
    static final String DFA9_specialS =
        "\127\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\26\2\uffff\1\26\22\uffff\1\26\6\uffff\1\24\1\2\1\3\2\uffff"+
            "\1\30\1\27\1\6\1\27\12\25\1\uffff\1\33\1\uffff\1\1\1\uffff\1"+
            "\7\1\uffff\1\23\1\10\1\23\1\11\1\12\1\13\1\14\1\23\1\15\2\23"+
            "\1\16\2\23\1\17\1\20\2\23\1\21\3\23\1\22\3\23\1\4\1\uffff\1"+
            "\5\3\uffff\32\23\1\31\1\uffff\1\32",
            "\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45\13\uffff\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64\7\uffff\1\65",
            "\1\66",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\101",
            "\1\102",
            "\1\103",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\111",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\116",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\120",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\123",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | K_BY | K_DELETE | K_EXPLAIN | K_FROM | K_GET | K_IN | K_LIMIT | K_OFFSET | K_ORDER | K_PLAN | K_SELECT | K_SET | K_WHERE | Identifier | StringLiteral | IntegerLiteral | WS | COMMENT | ASSOC | COMMA | LEFT_BRACE | RIGHT_BRACE | SEMICOLON );";
        }
    }
 

}