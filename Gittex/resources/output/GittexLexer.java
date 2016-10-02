// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g 2016-09-30 01:09:12

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GittexLexer extends Lexer {
    public static final int EOF=-1;
    public static final int TEXT=4;
    public static final int WS=5;
    public static final int DOC_BEGIN=6;
    public static final int DOC_END=7;
    public static final int TITLE_BEGIN=8;
    public static final int SQUARE_CLOSE=9;
    public static final int SQUARE_OPEN=10;
    public static final int PARA_BEGIN=11;
    public static final int PARA_END=12;
    public static final int BOLD_ASTR=13;
    public static final int ITALIC_ASTR=14;
    public static final int LIST_STARTER=15;
    public static final int IMG_STARTER=16;
    public static final int VAR_EQUAL=17;
    public static final int VAR_START=18;
    public static final int VAR_USE=19;
    public static final int NEWLINE=20;
    public static final int ADDRESS=21;
    public static final int HEADING_START=22;

    // delegates
    // delegators

    public GittexLexer() {;} 
    public GittexLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GittexLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g"; }

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:16:6: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | ',' | '\"' | ':' | '?' | '.' | '/' | '_' | '\\u000C' )* )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:16:8: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | ',' | '\"' | ':' | '?' | '.' | '/' | '_' | '\\u000C' )*
            {
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:16:8: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | ',' | '\"' | ':' | '?' | '.' | '/' | '_' | '\\u000C' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\f'||LA1_0=='\"'||LA1_0==','||(LA1_0>='.' && LA1_0<=':')||LA1_0=='?'||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:
            	    {
            	    if ( input.LA(1)=='\f'||input.LA(1)=='\"'||input.LA(1)==','||(input.LA(1)>='.' && input.LA(1)<=':')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "TEXT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:17:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:17:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

    // $ANTLR start "DOC_BEGIN"
    public final void mDOC_BEGIN() throws RecognitionException {
        try {
            int _type = DOC_BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:18:11: ( '\\\\BEGIN' )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:18:13: '\\\\BEGIN'
            {
            match("\\BEGIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOC_BEGIN"

    // $ANTLR start "DOC_END"
    public final void mDOC_END() throws RecognitionException {
        try {
            int _type = DOC_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:19:9: ( '\\\\END' )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:19:11: '\\\\END'
            {
            match("\\END"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOC_END"

    // $ANTLR start "TITLE_BEGIN"
    public final void mTITLE_BEGIN() throws RecognitionException {
        try {
            int _type = TITLE_BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:20:13: ( '\\\\TITLE' )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:20:15: '\\\\TITLE'
            {
            match("\\TITLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TITLE_BEGIN"

    // $ANTLR start "SQUARE_CLOSE"
    public final void mSQUARE_CLOSE() throws RecognitionException {
        try {
            int _type = SQUARE_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:21:14: ( ']' )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:21:16: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQUARE_CLOSE"

    // $ANTLR start "SQUARE_OPEN"
    public final void mSQUARE_OPEN() throws RecognitionException {
        try {
            int _type = SQUARE_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:22:13: ( '[' )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:22:15: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQUARE_OPEN"

    // $ANTLR start "PARA_BEGIN"
    public final void mPARA_BEGIN() throws RecognitionException {
        try {
            int _type = PARA_BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:23:12: ( '\\\\PARB' )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:23:14: '\\\\PARB'
            {
            match("\\PARB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARA_BEGIN"

    // $ANTLR start "PARA_END"
    public final void mPARA_END() throws RecognitionException {
        try {
            int _type = PARA_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:24:9: ( '\\\\PARE' )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:24:11: '\\\\PARE'
            {
            match("\\PARE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARA_END"

    // $ANTLR start "BOLD_ASTR"
    public final void mBOLD_ASTR() throws RecognitionException {
        try {
            int _type = BOLD_ASTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:25:11: ( '**' )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:25:13: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOLD_ASTR"

    // $ANTLR start "ITALIC_ASTR"
    public final void mITALIC_ASTR() throws RecognitionException {
        try {
            int _type = ITALIC_ASTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:26:13: ( '*' )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:26:15: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ITALIC_ASTR"

    // $ANTLR start "LIST_STARTER"
    public final void mLIST_STARTER() throws RecognitionException {
        try {
            int _type = LIST_STARTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:27:13: ( '+' )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:27:15: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIST_STARTER"

    // $ANTLR start "IMG_STARTER"
    public final void mIMG_STARTER() throws RecognitionException {
        try {
            int _type = IMG_STARTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:28:13: ( '!' )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:28:15: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMG_STARTER"

    // $ANTLR start "VAR_EQUAL"
    public final void mVAR_EQUAL() throws RecognitionException {
        try {
            int _type = VAR_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:29:11: ( '=' )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:29:13: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR_EQUAL"

    // $ANTLR start "VAR_START"
    public final void mVAR_START() throws RecognitionException {
        try {
            int _type = VAR_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:30:11: ( '\\\\DEF' )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:30:13: '\\\\DEF'
            {
            match("\\DEF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR_START"

    // $ANTLR start "VAR_USE"
    public final void mVAR_USE() throws RecognitionException {
        try {
            int _type = VAR_USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:31:9: ( '\\\\USE' )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:31:11: '\\\\USE'
            {
            match("\\USE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR_USE"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:32:9: ( '\\\\\\\\' )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:32:12: '\\\\\\\\'
            {
            match("\\\\"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "ADDRESS"
    public final void mADDRESS() throws RecognitionException {
        try {
            int _type = ADDRESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:33:9: ( '(' TEXT ')' )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:33:11: '(' TEXT ')'
            {
            match('('); 
            mTEXT(); 
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADDRESS"

    // $ANTLR start "HEADING_START"
    public final void mHEADING_START() throws RecognitionException {
        try {
            int _type = HEADING_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:34:15: ( '#' )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:34:17: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEADING_START"

    public void mTokens() throws RecognitionException {
        // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:8: ( TEXT | WS | DOC_BEGIN | DOC_END | TITLE_BEGIN | SQUARE_CLOSE | SQUARE_OPEN | PARA_BEGIN | PARA_END | BOLD_ASTR | ITALIC_ASTR | LIST_STARTER | IMG_STARTER | VAR_EQUAL | VAR_START | VAR_USE | NEWLINE | ADDRESS | HEADING_START )
        int alt2=19;
        alt2 = dfa2.predict(input);
        switch (alt2) {
            case 1 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:10: TEXT
                {
                mTEXT(); 

                }
                break;
            case 2 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:15: WS
                {
                mWS(); 

                }
                break;
            case 3 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:18: DOC_BEGIN
                {
                mDOC_BEGIN(); 

                }
                break;
            case 4 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:28: DOC_END
                {
                mDOC_END(); 

                }
                break;
            case 5 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:36: TITLE_BEGIN
                {
                mTITLE_BEGIN(); 

                }
                break;
            case 6 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:48: SQUARE_CLOSE
                {
                mSQUARE_CLOSE(); 

                }
                break;
            case 7 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:61: SQUARE_OPEN
                {
                mSQUARE_OPEN(); 

                }
                break;
            case 8 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:73: PARA_BEGIN
                {
                mPARA_BEGIN(); 

                }
                break;
            case 9 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:84: PARA_END
                {
                mPARA_END(); 

                }
                break;
            case 10 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:93: BOLD_ASTR
                {
                mBOLD_ASTR(); 

                }
                break;
            case 11 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:103: ITALIC_ASTR
                {
                mITALIC_ASTR(); 

                }
                break;
            case 12 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:115: LIST_STARTER
                {
                mLIST_STARTER(); 

                }
                break;
            case 13 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:128: IMG_STARTER
                {
                mIMG_STARTER(); 

                }
                break;
            case 14 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:140: VAR_EQUAL
                {
                mVAR_EQUAL(); 

                }
                break;
            case 15 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:150: VAR_START
                {
                mVAR_START(); 

                }
                break;
            case 16 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:160: VAR_USE
                {
                mVAR_USE(); 

                }
                break;
            case 17 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:168: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 18 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:176: ADDRESS
                {
                mADDRESS(); 

                }
                break;
            case 19 :
                // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:1:184: HEADING_START
                {
                mHEADING_START(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\1\1\5\uffff\1\24\22\uffff";
    static final String DFA2_eofS =
        "\31\uffff";
    static final String DFA2_minS =
        "\1\11\2\uffff\1\102\2\uffff\1\52\10\uffff\1\101\5\uffff\1\122\1"+
        "\102\2\uffff";
    static final String DFA2_maxS =
        "\1\135\2\uffff\1\134\2\uffff\1\52\10\uffff\1\101\5\uffff\1\122"+
        "\1\105\2\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\6\1\7\1\uffff\1\14\1\15\1\16\1\22\1"+
        "\23\1\3\1\4\1\5\1\uffff\1\17\1\20\1\21\1\12\1\13\2\uffff\1\10\1"+
        "\11";
    static final String DFA2_specialS =
        "\31\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\2\2\uffff\1\2\22\uffff\1\2\1\10\1\uffff\1\13\4\uffff\1\12"+
            "\1\uffff\1\6\1\7\21\uffff\1\11\35\uffff\1\5\1\3\1\4",
            "",
            "",
            "\1\14\1\uffff\1\20\1\15\12\uffff\1\17\3\uffff\1\16\1\21\6"+
            "\uffff\1\22",
            "",
            "",
            "\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25",
            "",
            "",
            "",
            "",
            "",
            "\1\26",
            "\1\27\2\uffff\1\30",
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
            return "1:1: Tokens : ( TEXT | WS | DOC_BEGIN | DOC_END | TITLE_BEGIN | SQUARE_CLOSE | SQUARE_OPEN | PARA_BEGIN | PARA_END | BOLD_ASTR | ITALIC_ASTR | LIST_STARTER | IMG_STARTER | VAR_EQUAL | VAR_START | VAR_USE | NEWLINE | ADDRESS | HEADING_START );";
        }
    }
 

}