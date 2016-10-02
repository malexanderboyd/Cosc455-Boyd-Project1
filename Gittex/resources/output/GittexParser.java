// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g 2016-09-30 01:09:12

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GittexParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TEXT", "WS", "DOC_BEGIN", "DOC_END", "TITLE_BEGIN", "SQUARE_CLOSE", "SQUARE_OPEN", "PARA_BEGIN", "PARA_END", "BOLD_ASTR", "ITALIC_ASTR", "LIST_STARTER", "IMG_STARTER", "VAR_EQUAL", "VAR_START", "VAR_USE", "NEWLINE", "ADDRESS", "HEADING_START"
    };
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


        public GittexParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GittexParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GittexParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g"; }



    // $ANTLR start "headings"
    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:35:1: headings : HEADING_START WS ;
    public final void headings() throws RecognitionException {
        try {
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:35:9: ( HEADING_START WS )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:35:11: HEADING_START WS
            {
            match(input,HEADING_START,FOLLOW_HEADING_START_in_headings236); 
            match(input,WS,FOLLOW_WS_in_headings238); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "headings"


    // $ANTLR start "bold"
    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:36:1: bold : BOLD_ASTR TEXT BOLD_ASTR ;
    public final void bold() throws RecognitionException {
        try {
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:36:6: ( BOLD_ASTR TEXT BOLD_ASTR )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:36:8: BOLD_ASTR TEXT BOLD_ASTR
            {
            match(input,BOLD_ASTR,FOLLOW_BOLD_ASTR_in_bold245); 
            match(input,TEXT,FOLLOW_TEXT_in_bold247); 
            match(input,BOLD_ASTR,FOLLOW_BOLD_ASTR_in_bold249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "bold"


    // $ANTLR start "italics"
    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:37:1: italics : ITALIC_ASTR TEXT ITALIC_ASTR ;
    public final void italics() throws RecognitionException {
        try {
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:37:9: ( ITALIC_ASTR TEXT ITALIC_ASTR )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:37:11: ITALIC_ASTR TEXT ITALIC_ASTR
            {
            match(input,ITALIC_ASTR,FOLLOW_ITALIC_ASTR_in_italics256); 
            match(input,TEXT,FOLLOW_TEXT_in_italics258); 
            match(input,ITALIC_ASTR,FOLLOW_ITALIC_ASTR_in_italics260); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "italics"


    // $ANTLR start "links"
    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:38:1: links : SQUARE_OPEN ( TEXT | WS )+ SQUARE_CLOSE ADDRESS ;
    public final void links() throws RecognitionException {
        try {
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:38:7: ( SQUARE_OPEN ( TEXT | WS )+ SQUARE_CLOSE ADDRESS )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:38:9: SQUARE_OPEN ( TEXT | WS )+ SQUARE_CLOSE ADDRESS
            {
            match(input,SQUARE_OPEN,FOLLOW_SQUARE_OPEN_in_links268); 
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:38:21: ( TEXT | WS )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=TEXT && LA1_0<=WS)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:
            	    {
            	    if ( (input.LA(1)>=TEXT && input.LA(1)<=WS) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match(input,SQUARE_CLOSE,FOLLOW_SQUARE_CLOSE_in_links279); 
            match(input,ADDRESS,FOLLOW_ADDRESS_in_links281); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "links"


    // $ANTLR start "images"
    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:39:1: images : IMG_STARTER SQUARE_OPEN TEXT SQUARE_CLOSE ADDRESS ;
    public final void images() throws RecognitionException {
        try {
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:39:9: ( IMG_STARTER SQUARE_OPEN TEXT SQUARE_CLOSE ADDRESS )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:39:11: IMG_STARTER SQUARE_OPEN TEXT SQUARE_CLOSE ADDRESS
            {
            match(input,IMG_STARTER,FOLLOW_IMG_STARTER_in_images289); 
            match(input,SQUARE_OPEN,FOLLOW_SQUARE_OPEN_in_images291); 
            match(input,TEXT,FOLLOW_TEXT_in_images293); 
            match(input,SQUARE_CLOSE,FOLLOW_SQUARE_CLOSE_in_images295); 
            match(input,ADDRESS,FOLLOW_ADDRESS_in_images297); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "images"


    // $ANTLR start "list"
    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:40:1: list : LIST_STARTER ( TEXT ( WS )? )+ ;
    public final void list() throws RecognitionException {
        try {
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:40:6: ( LIST_STARTER ( TEXT ( WS )? )+ )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:40:8: LIST_STARTER ( TEXT ( WS )? )+
            {
            match(input,LIST_STARTER,FOLLOW_LIST_STARTER_in_list304); 
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:40:21: ( TEXT ( WS )? )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==TEXT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:40:22: TEXT ( WS )?
            	    {
            	    match(input,TEXT,FOLLOW_TEXT_in_list307); 
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:40:27: ( WS )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==WS) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:40:27: WS
            	            {
            	            match(input,WS,FOLLOW_WS_in_list309); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "list"


    // $ANTLR start "useVariable"
    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:41:1: useVariable : VAR_USE SQUARE_OPEN varName SQUARE_CLOSE ;
    public final void useVariable() throws RecognitionException {
        try {
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:41:13: ( VAR_USE SQUARE_OPEN varName SQUARE_CLOSE )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:41:15: VAR_USE SQUARE_OPEN varName SQUARE_CLOSE
            {
            match(input,VAR_USE,FOLLOW_VAR_USE_in_useVariable319); 
            match(input,SQUARE_OPEN,FOLLOW_SQUARE_OPEN_in_useVariable321); 
            pushFollow(FOLLOW_varName_in_useVariable323);
            varName();

            state._fsp--;

            match(input,SQUARE_CLOSE,FOLLOW_SQUARE_CLOSE_in_useVariable325); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "useVariable"


    // $ANTLR start "defineVariable"
    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:42:1: defineVariable : VAR_START SQUARE_OPEN varName VAR_EQUAL varValue SQUARE_CLOSE ;
    public final void defineVariable() throws RecognitionException {
        try {
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:42:17: ( VAR_START SQUARE_OPEN varName VAR_EQUAL varValue SQUARE_CLOSE )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:42:19: VAR_START SQUARE_OPEN varName VAR_EQUAL varValue SQUARE_CLOSE
            {
            match(input,VAR_START,FOLLOW_VAR_START_in_defineVariable334); 
            match(input,SQUARE_OPEN,FOLLOW_SQUARE_OPEN_in_defineVariable336); 
            pushFollow(FOLLOW_varName_in_defineVariable338);
            varName();

            state._fsp--;

            match(input,VAR_EQUAL,FOLLOW_VAR_EQUAL_in_defineVariable340); 
            pushFollow(FOLLOW_varValue_in_defineVariable342);
            varValue();

            state._fsp--;

            match(input,SQUARE_CLOSE,FOLLOW_SQUARE_CLOSE_in_defineVariable344); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "defineVariable"


    // $ANTLR start "varName"
    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:43:1: varName : TEXT ;
    public final void varName() throws RecognitionException {
        try {
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:43:9: ( TEXT )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:43:11: TEXT
            {
            match(input,TEXT,FOLLOW_TEXT_in_varName352); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "varName"


    // $ANTLR start "varValue"
    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:44:1: varValue : TEXT ;
    public final void varValue() throws RecognitionException {
        try {
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:44:10: ( TEXT )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:44:12: TEXT
            {
            match(input,TEXT,FOLLOW_TEXT_in_varValue359); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "varValue"


    // $ANTLR start "title"
    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:45:1: title : TITLE_BEGIN SQUARE_OPEN ( TEXT | WS )+ SQUARE_CLOSE ;
    public final void title() throws RecognitionException {
        try {
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:45:8: ( TITLE_BEGIN SQUARE_OPEN ( TEXT | WS )+ SQUARE_CLOSE )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:45:10: TITLE_BEGIN SQUARE_OPEN ( TEXT | WS )+ SQUARE_CLOSE
            {
            match(input,TITLE_BEGIN,FOLLOW_TITLE_BEGIN_in_title368); 
            match(input,SQUARE_OPEN,FOLLOW_SQUARE_OPEN_in_title370); 
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:45:34: ( TEXT | WS )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=TEXT && LA4_0<=WS)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:
            	    {
            	    if ( (input.LA(1)>=TEXT && input.LA(1)<=WS) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match(input,SQUARE_CLOSE,FOLLOW_SQUARE_CLOSE_in_title379); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "title"


    // $ANTLR start "paragraph"
    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:46:1: paragraph : PARA_BEGIN parabody PARA_END ;
    public final void paragraph() throws RecognitionException {
        try {
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:46:12: ( PARA_BEGIN parabody PARA_END )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:46:14: PARA_BEGIN parabody PARA_END
            {
            match(input,PARA_BEGIN,FOLLOW_PARA_BEGIN_in_paragraph387); 
            pushFollow(FOLLOW_parabody_in_paragraph389);
            parabody();

            state._fsp--;

            match(input,PARA_END,FOLLOW_PARA_END_in_paragraph391); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "paragraph"


    // $ANTLR start "parabody"
    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:47:1: parabody : ( TEXT | bold | italics | links | NEWLINE | list | WS )+ ;
    public final void parabody() throws RecognitionException {
        try {
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:47:11: ( ( TEXT | bold | italics | links | NEWLINE | list | WS )+ )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:47:13: ( TEXT | bold | italics | links | NEWLINE | list | WS )+
            {
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:47:13: ( TEXT | bold | italics | links | NEWLINE | list | WS )+
            int cnt5=0;
            loop5:
            do {
                int alt5=8;
                switch ( input.LA(1) ) {
                case TEXT:
                    {
                    alt5=1;
                    }
                    break;
                case BOLD_ASTR:
                    {
                    alt5=2;
                    }
                    break;
                case ITALIC_ASTR:
                    {
                    alt5=3;
                    }
                    break;
                case SQUARE_OPEN:
                    {
                    alt5=4;
                    }
                    break;
                case NEWLINE:
                    {
                    alt5=5;
                    }
                    break;
                case LIST_STARTER:
                    {
                    alt5=6;
                    }
                    break;
                case WS:
                    {
                    alt5=7;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:47:14: TEXT
            	    {
            	    match(input,TEXT,FOLLOW_TEXT_in_parabody400); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:47:21: bold
            	    {
            	    pushFollow(FOLLOW_bold_in_parabody404);
            	    bold();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:47:28: italics
            	    {
            	    pushFollow(FOLLOW_italics_in_parabody408);
            	    italics();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:47:38: links
            	    {
            	    pushFollow(FOLLOW_links_in_parabody412);
            	    links();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:47:46: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_parabody416); 

            	    }
            	    break;
            	case 6 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:47:56: list
            	    {
            	    pushFollow(FOLLOW_list_in_parabody420);
            	    list();

            	    state._fsp--;


            	    }
            	    break;
            	case 7 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:47:63: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_parabody424); 

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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "parabody"


    // $ANTLR start "body"
    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:48:1: body : ( WS | TEXT | headings | bold | italics | links | images | list | defineVariable | useVariable | paragraph )+ ;
    public final void body() throws RecognitionException {
        try {
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:48:6: ( ( WS | TEXT | headings | bold | italics | links | images | list | defineVariable | useVariable | paragraph )+ )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:48:8: ( WS | TEXT | headings | bold | italics | links | images | list | defineVariable | useVariable | paragraph )+
            {
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:48:8: ( WS | TEXT | headings | bold | italics | links | images | list | defineVariable | useVariable | paragraph )+
            int cnt6=0;
            loop6:
            do {
                int alt6=12;
                switch ( input.LA(1) ) {
                case WS:
                    {
                    alt6=1;
                    }
                    break;
                case TEXT:
                    {
                    alt6=2;
                    }
                    break;
                case HEADING_START:
                    {
                    alt6=3;
                    }
                    break;
                case BOLD_ASTR:
                    {
                    alt6=4;
                    }
                    break;
                case ITALIC_ASTR:
                    {
                    alt6=5;
                    }
                    break;
                case SQUARE_OPEN:
                    {
                    alt6=6;
                    }
                    break;
                case IMG_STARTER:
                    {
                    alt6=7;
                    }
                    break;
                case LIST_STARTER:
                    {
                    alt6=8;
                    }
                    break;
                case VAR_START:
                    {
                    alt6=9;
                    }
                    break;
                case VAR_USE:
                    {
                    alt6=10;
                    }
                    break;
                case PARA_BEGIN:
                    {
                    alt6=11;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:48:9: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_body436); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:48:14: TEXT
            	    {
            	    match(input,TEXT,FOLLOW_TEXT_in_body440); 

            	    }
            	    break;
            	case 3 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:48:21: headings
            	    {
            	    pushFollow(FOLLOW_headings_in_body444);
            	    headings();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:48:32: bold
            	    {
            	    pushFollow(FOLLOW_bold_in_body448);
            	    bold();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:48:39: italics
            	    {
            	    pushFollow(FOLLOW_italics_in_body452);
            	    italics();

            	    state._fsp--;


            	    }
            	    break;
            	case 6 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:48:49: links
            	    {
            	    pushFollow(FOLLOW_links_in_body456);
            	    links();

            	    state._fsp--;


            	    }
            	    break;
            	case 7 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:48:57: images
            	    {
            	    pushFollow(FOLLOW_images_in_body460);
            	    images();

            	    state._fsp--;


            	    }
            	    break;
            	case 8 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:48:66: list
            	    {
            	    pushFollow(FOLLOW_list_in_body464);
            	    list();

            	    state._fsp--;


            	    }
            	    break;
            	case 9 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:48:73: defineVariable
            	    {
            	    pushFollow(FOLLOW_defineVariable_in_body468);
            	    defineVariable();

            	    state._fsp--;


            	    }
            	    break;
            	case 10 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:48:90: useVariable
            	    {
            	    pushFollow(FOLLOW_useVariable_in_body472);
            	    useVariable();

            	    state._fsp--;


            	    }
            	    break;
            	case 11 :
            	    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:48:104: paragraph
            	    {
            	    pushFollow(FOLLOW_paragraph_in_body476);
            	    paragraph();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "body"


    // $ANTLR start "gittex"
    // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:49:1: gittex : DOC_BEGIN title body DOC_END ;
    public final void gittex() throws RecognitionException {
        try {
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:49:8: ( DOC_BEGIN title body DOC_END )
            // D:\\Program Files\\Misc OS Cleanup files\\GitHub\\Cosc455-Boyd-Project1\\Gittex\\resources\\Gittex.g:49:10: DOC_BEGIN title body DOC_END
            {
            match(input,DOC_BEGIN,FOLLOW_DOC_BEGIN_in_gittex487); 
            pushFollow(FOLLOW_title_in_gittex489);
            title();

            state._fsp--;

            pushFollow(FOLLOW_body_in_gittex491);
            body();

            state._fsp--;

            match(input,DOC_END,FOLLOW_DOC_END_in_gittex493); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "gittex"

    // Delegated rules


 

    public static final BitSet FOLLOW_HEADING_START_in_headings236 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_headings238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOLD_ASTR_in_bold245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_bold247 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BOLD_ASTR_in_bold249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITALIC_ASTR_in_italics256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_italics258 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ITALIC_ASTR_in_italics260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUARE_OPEN_in_links268 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_links270 = new BitSet(new long[]{0x0000000000000230L});
    public static final BitSet FOLLOW_SQUARE_CLOSE_in_links279 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ADDRESS_in_links281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMG_STARTER_in_images289 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SQUARE_OPEN_in_images291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_images293 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SQUARE_CLOSE_in_images295 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ADDRESS_in_images297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_STARTER_in_list304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_list307 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_WS_in_list309 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_VAR_USE_in_useVariable319 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SQUARE_OPEN_in_useVariable321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_varName_in_useVariable323 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SQUARE_CLOSE_in_useVariable325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_START_in_defineVariable334 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SQUARE_OPEN_in_defineVariable336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_varName_in_defineVariable338 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_VAR_EQUAL_in_defineVariable340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_varValue_in_defineVariable342 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_SQUARE_CLOSE_in_defineVariable344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_varName352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_varValue359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TITLE_BEGIN_in_title368 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SQUARE_OPEN_in_title370 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_title372 = new BitSet(new long[]{0x0000000000000230L});
    public static final BitSet FOLLOW_SQUARE_CLOSE_in_title379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARA_BEGIN_in_paragraph387 = new BitSet(new long[]{0x000000000010E430L});
    public static final BitSet FOLLOW_parabody_in_paragraph389 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PARA_END_in_paragraph391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parabody400 = new BitSet(new long[]{0x000000000010E432L});
    public static final BitSet FOLLOW_bold_in_parabody404 = new BitSet(new long[]{0x000000000010E432L});
    public static final BitSet FOLLOW_italics_in_parabody408 = new BitSet(new long[]{0x000000000010E432L});
    public static final BitSet FOLLOW_links_in_parabody412 = new BitSet(new long[]{0x000000000010E432L});
    public static final BitSet FOLLOW_NEWLINE_in_parabody416 = new BitSet(new long[]{0x000000000010E432L});
    public static final BitSet FOLLOW_list_in_parabody420 = new BitSet(new long[]{0x000000000010E432L});
    public static final BitSet FOLLOW_WS_in_parabody424 = new BitSet(new long[]{0x000000000010E432L});
    public static final BitSet FOLLOW_WS_in_body436 = new BitSet(new long[]{0x00000000004DEC32L});
    public static final BitSet FOLLOW_TEXT_in_body440 = new BitSet(new long[]{0x00000000004DEC32L});
    public static final BitSet FOLLOW_headings_in_body444 = new BitSet(new long[]{0x00000000004DEC32L});
    public static final BitSet FOLLOW_bold_in_body448 = new BitSet(new long[]{0x00000000004DEC32L});
    public static final BitSet FOLLOW_italics_in_body452 = new BitSet(new long[]{0x00000000004DEC32L});
    public static final BitSet FOLLOW_links_in_body456 = new BitSet(new long[]{0x00000000004DEC32L});
    public static final BitSet FOLLOW_images_in_body460 = new BitSet(new long[]{0x00000000004DEC32L});
    public static final BitSet FOLLOW_list_in_body464 = new BitSet(new long[]{0x00000000004DEC32L});
    public static final BitSet FOLLOW_defineVariable_in_body468 = new BitSet(new long[]{0x00000000004DEC32L});
    public static final BitSet FOLLOW_useVariable_in_body472 = new BitSet(new long[]{0x00000000004DEC32L});
    public static final BitSet FOLLOW_paragraph_in_body476 = new BitSet(new long[]{0x00000000004DEC32L});
    public static final BitSet FOLLOW_DOC_BEGIN_in_gittex487 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_title_in_gittex489 = new BitSet(new long[]{0x00000000004DEC30L});
    public static final BitSet FOLLOW_body_in_gittex491 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DOC_END_in_gittex493 = new BitSet(new long[]{0x0000000000000002L});

}