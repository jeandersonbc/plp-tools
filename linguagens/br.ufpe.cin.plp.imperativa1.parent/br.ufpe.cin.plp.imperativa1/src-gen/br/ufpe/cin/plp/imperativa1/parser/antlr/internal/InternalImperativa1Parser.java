package br.ufpe.cin.plp.imperativa1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.ufpe.cin.plp.imperativa1.services.Imperativa1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalImperativa1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VALORSTRING", "RULE_VALORINTEIRO", "RULE_VALORBOOLEANO", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'read'", "'('", "')'", "'write'", "'if'", "'then'", "'else'", "'while'", "'do'", "'skip'", "':='", "'-'", "'not'", "'length'", "'+'", "'and'", "'or'", "'=='", "'++'", "'{'", "'}'", "','", "'var'", "'='"
    };
    public static final int RULE_VALORINTEIRO=5;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_VALORBOOLEANO=6;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_VALORSTRING=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalImperativa1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalImperativa1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalImperativa1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalImperativa1.g"; }



     	private Imperativa1GrammarAccess grammarAccess;

        public InternalImperativa1Parser(TokenStream input, Imperativa1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Imperativa1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalImperativa1.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalImperativa1.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalImperativa1.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalImperativa1.g:71:1: ruleModel returns [EObject current=null] : ( (lv_comandos_0_0= ruleComando ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_comandos_0_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:77:2: ( ( (lv_comandos_0_0= ruleComando ) )* )
            // InternalImperativa1.g:78:2: ( (lv_comandos_0_0= ruleComando ) )*
            {
            // InternalImperativa1.g:78:2: ( (lv_comandos_0_0= ruleComando ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_VALORSTRING||(LA1_0>=15 && LA1_0<=16)||(LA1_0>=18 && LA1_0<=19)||LA1_0==22||LA1_0==24||LA1_0==34) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalImperativa1.g:79:3: (lv_comandos_0_0= ruleComando )
            	    {
            	    // InternalImperativa1.g:79:3: (lv_comandos_0_0= ruleComando )
            	    // InternalImperativa1.g:80:4: lv_comandos_0_0= ruleComando
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getComandosComandoParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_comandos_0_0=ruleComando();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"comandos",
            	      					lv_comandos_0_0,
            	      					"br.ufpe.cin.plp.imperativa1.Imperativa1.Comando");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleComando"
    // InternalImperativa1.g:100:1: entryRuleComando returns [EObject current=null] : iv_ruleComando= ruleComando EOF ;
    public final EObject entryRuleComando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComando = null;


        try {
            // InternalImperativa1.g:100:48: (iv_ruleComando= ruleComando EOF )
            // InternalImperativa1.g:101:2: iv_ruleComando= ruleComando EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComandoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComando=ruleComando();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComando; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComando"


    // $ANTLR start "ruleComando"
    // InternalImperativa1.g:107:1: ruleComando returns [EObject current=null] : ( ( ( ( ruleSequenciaComando ) )=> (lv_sequenciaComando_0_0= ruleSequenciaComando ) ) | ( (lv_comandoSimples_1_0= ruleComandoSimples ) ) ) ;
    public final EObject ruleComando() throws RecognitionException {
        EObject current = null;

        EObject lv_sequenciaComando_0_0 = null;

        EObject lv_comandoSimples_1_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:113:2: ( ( ( ( ( ruleSequenciaComando ) )=> (lv_sequenciaComando_0_0= ruleSequenciaComando ) ) | ( (lv_comandoSimples_1_0= ruleComandoSimples ) ) ) )
            // InternalImperativa1.g:114:2: ( ( ( ( ruleSequenciaComando ) )=> (lv_sequenciaComando_0_0= ruleSequenciaComando ) ) | ( (lv_comandoSimples_1_0= ruleComandoSimples ) ) )
            {
            // InternalImperativa1.g:114:2: ( ( ( ( ruleSequenciaComando ) )=> (lv_sequenciaComando_0_0= ruleSequenciaComando ) ) | ( (lv_comandoSimples_1_0= ruleComandoSimples ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalImperativa1.g:115:3: ( ( ( ruleSequenciaComando ) )=> (lv_sequenciaComando_0_0= ruleSequenciaComando ) )
                    {
                    // InternalImperativa1.g:115:3: ( ( ( ruleSequenciaComando ) )=> (lv_sequenciaComando_0_0= ruleSequenciaComando ) )
                    // InternalImperativa1.g:116:4: ( ( ruleSequenciaComando ) )=> (lv_sequenciaComando_0_0= ruleSequenciaComando )
                    {
                    // InternalImperativa1.g:120:4: (lv_sequenciaComando_0_0= ruleSequenciaComando )
                    // InternalImperativa1.g:121:5: lv_sequenciaComando_0_0= ruleSequenciaComando
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComandoAccess().getSequenciaComandoSequenciaComandoParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_sequenciaComando_0_0=ruleSequenciaComando();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getComandoRule());
                      					}
                      					set(
                      						current,
                      						"sequenciaComando",
                      						lv_sequenciaComando_0_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.SequenciaComando");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:139:3: ( (lv_comandoSimples_1_0= ruleComandoSimples ) )
                    {
                    // InternalImperativa1.g:139:3: ( (lv_comandoSimples_1_0= ruleComandoSimples ) )
                    // InternalImperativa1.g:140:4: (lv_comandoSimples_1_0= ruleComandoSimples )
                    {
                    // InternalImperativa1.g:140:4: (lv_comandoSimples_1_0= ruleComandoSimples )
                    // InternalImperativa1.g:141:5: lv_comandoSimples_1_0= ruleComandoSimples
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComandoAccess().getComandoSimplesComandoSimplesParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_comandoSimples_1_0=ruleComandoSimples();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getComandoRule());
                      					}
                      					set(
                      						current,
                      						"comandoSimples",
                      						lv_comandoSimples_1_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.ComandoSimples");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComando"


    // $ANTLR start "entryRuleSequenciaComando"
    // InternalImperativa1.g:162:1: entryRuleSequenciaComando returns [EObject current=null] : iv_ruleSequenciaComando= ruleSequenciaComando EOF ;
    public final EObject entryRuleSequenciaComando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenciaComando = null;


        try {
            // InternalImperativa1.g:162:57: (iv_ruleSequenciaComando= ruleSequenciaComando EOF )
            // InternalImperativa1.g:163:2: iv_ruleSequenciaComando= ruleSequenciaComando EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequenciaComandoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSequenciaComando=ruleSequenciaComando();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSequenciaComando; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenciaComando"


    // $ANTLR start "ruleSequenciaComando"
    // InternalImperativa1.g:169:1: ruleSequenciaComando returns [EObject current=null] : ( ( (lv_comandoSimples_0_0= ruleComandoSimples ) ) otherlv_1= ';' ( (lv_comando_2_0= ruleComando ) ) ) ;
    public final EObject ruleSequenciaComando() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_comandoSimples_0_0 = null;

        EObject lv_comando_2_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:175:2: ( ( ( (lv_comandoSimples_0_0= ruleComandoSimples ) ) otherlv_1= ';' ( (lv_comando_2_0= ruleComando ) ) ) )
            // InternalImperativa1.g:176:2: ( ( (lv_comandoSimples_0_0= ruleComandoSimples ) ) otherlv_1= ';' ( (lv_comando_2_0= ruleComando ) ) )
            {
            // InternalImperativa1.g:176:2: ( ( (lv_comandoSimples_0_0= ruleComandoSimples ) ) otherlv_1= ';' ( (lv_comando_2_0= ruleComando ) ) )
            // InternalImperativa1.g:177:3: ( (lv_comandoSimples_0_0= ruleComandoSimples ) ) otherlv_1= ';' ( (lv_comando_2_0= ruleComando ) )
            {
            // InternalImperativa1.g:177:3: ( (lv_comandoSimples_0_0= ruleComandoSimples ) )
            // InternalImperativa1.g:178:4: (lv_comandoSimples_0_0= ruleComandoSimples )
            {
            // InternalImperativa1.g:178:4: (lv_comandoSimples_0_0= ruleComandoSimples )
            // InternalImperativa1.g:179:5: lv_comandoSimples_0_0= ruleComandoSimples
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSequenciaComandoAccess().getComandoSimplesComandoSimplesParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_comandoSimples_0_0=ruleComandoSimples();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSequenciaComandoRule());
              					}
              					set(
              						current,
              						"comandoSimples",
              						lv_comandoSimples_0_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.ComandoSimples");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSequenciaComandoAccess().getSemicolonKeyword_1());
              		
            }
            // InternalImperativa1.g:200:3: ( (lv_comando_2_0= ruleComando ) )
            // InternalImperativa1.g:201:4: (lv_comando_2_0= ruleComando )
            {
            // InternalImperativa1.g:201:4: (lv_comando_2_0= ruleComando )
            // InternalImperativa1.g:202:5: lv_comando_2_0= ruleComando
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSequenciaComandoAccess().getComandoComandoParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_comando_2_0=ruleComando();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSequenciaComandoRule());
              					}
              					set(
              						current,
              						"comando",
              						lv_comando_2_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Comando");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenciaComando"


    // $ANTLR start "entryRuleIO"
    // InternalImperativa1.g:223:1: entryRuleIO returns [EObject current=null] : iv_ruleIO= ruleIO EOF ;
    public final EObject entryRuleIO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIO = null;


        try {
            // InternalImperativa1.g:223:43: (iv_ruleIO= ruleIO EOF )
            // InternalImperativa1.g:224:2: iv_ruleIO= ruleIO EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIORule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIO=ruleIO();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIO; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIO"


    // $ANTLR start "ruleIO"
    // InternalImperativa1.g:230:1: ruleIO returns [EObject current=null] : ( ( (lv_read_0_0= ruleRead ) ) | ( (lv_write_1_0= ruleWrite ) ) ) ;
    public final EObject ruleIO() throws RecognitionException {
        EObject current = null;

        EObject lv_read_0_0 = null;

        EObject lv_write_1_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:236:2: ( ( ( (lv_read_0_0= ruleRead ) ) | ( (lv_write_1_0= ruleWrite ) ) ) )
            // InternalImperativa1.g:237:2: ( ( (lv_read_0_0= ruleRead ) ) | ( (lv_write_1_0= ruleWrite ) ) )
            {
            // InternalImperativa1.g:237:2: ( ( (lv_read_0_0= ruleRead ) ) | ( (lv_write_1_0= ruleWrite ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalImperativa1.g:238:3: ( (lv_read_0_0= ruleRead ) )
                    {
                    // InternalImperativa1.g:238:3: ( (lv_read_0_0= ruleRead ) )
                    // InternalImperativa1.g:239:4: (lv_read_0_0= ruleRead )
                    {
                    // InternalImperativa1.g:239:4: (lv_read_0_0= ruleRead )
                    // InternalImperativa1.g:240:5: lv_read_0_0= ruleRead
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIOAccess().getReadReadParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_read_0_0=ruleRead();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getIORule());
                      					}
                      					set(
                      						current,
                      						"read",
                      						lv_read_0_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.Read");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:258:3: ( (lv_write_1_0= ruleWrite ) )
                    {
                    // InternalImperativa1.g:258:3: ( (lv_write_1_0= ruleWrite ) )
                    // InternalImperativa1.g:259:4: (lv_write_1_0= ruleWrite )
                    {
                    // InternalImperativa1.g:259:4: (lv_write_1_0= ruleWrite )
                    // InternalImperativa1.g:260:5: lv_write_1_0= ruleWrite
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIOAccess().getWriteWriteParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_write_1_0=ruleWrite();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getIORule());
                      					}
                      					set(
                      						current,
                      						"write",
                      						lv_write_1_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.Write");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIO"


    // $ANTLR start "entryRuleRead"
    // InternalImperativa1.g:281:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // InternalImperativa1.g:281:45: (iv_ruleRead= ruleRead EOF )
            // InternalImperativa1.g:282:2: iv_ruleRead= ruleRead EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReadRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRead=ruleRead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRead; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // InternalImperativa1.g:288:1: ruleRead returns [EObject current=null] : (otherlv_0= 'read' otherlv_1= '(' ( (lv_pid_2_0= rulePId ) ) otherlv_3= ')' ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_pid_2_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:294:2: ( (otherlv_0= 'read' otherlv_1= '(' ( (lv_pid_2_0= rulePId ) ) otherlv_3= ')' ) )
            // InternalImperativa1.g:295:2: (otherlv_0= 'read' otherlv_1= '(' ( (lv_pid_2_0= rulePId ) ) otherlv_3= ')' )
            {
            // InternalImperativa1.g:295:2: (otherlv_0= 'read' otherlv_1= '(' ( (lv_pid_2_0= rulePId ) ) otherlv_3= ')' )
            // InternalImperativa1.g:296:3: otherlv_0= 'read' otherlv_1= '(' ( (lv_pid_2_0= rulePId ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReadAccess().getReadKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReadAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalImperativa1.g:304:3: ( (lv_pid_2_0= rulePId ) )
            // InternalImperativa1.g:305:4: (lv_pid_2_0= rulePId )
            {
            // InternalImperativa1.g:305:4: (lv_pid_2_0= rulePId )
            // InternalImperativa1.g:306:5: lv_pid_2_0= rulePId
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReadAccess().getPidPIdParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_pid_2_0=rulePId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReadRule());
              					}
              					set(
              						current,
              						"pid",
              						lv_pid_2_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.PId");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getReadAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleWrite"
    // InternalImperativa1.g:331:1: entryRuleWrite returns [EObject current=null] : iv_ruleWrite= ruleWrite EOF ;
    public final EObject entryRuleWrite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrite = null;


        try {
            // InternalImperativa1.g:331:46: (iv_ruleWrite= ruleWrite EOF )
            // InternalImperativa1.g:332:2: iv_ruleWrite= ruleWrite EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWriteRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWrite=ruleWrite();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWrite; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWrite"


    // $ANTLR start "ruleWrite"
    // InternalImperativa1.g:338:1: ruleWrite returns [EObject current=null] : (otherlv_0= 'write' otherlv_1= '(' ( (lv_expressao_2_0= ruleExpressao ) ) otherlv_3= ')' ) ;
    public final EObject ruleWrite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressao_2_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:344:2: ( (otherlv_0= 'write' otherlv_1= '(' ( (lv_expressao_2_0= ruleExpressao ) ) otherlv_3= ')' ) )
            // InternalImperativa1.g:345:2: (otherlv_0= 'write' otherlv_1= '(' ( (lv_expressao_2_0= ruleExpressao ) ) otherlv_3= ')' )
            {
            // InternalImperativa1.g:345:2: (otherlv_0= 'write' otherlv_1= '(' ( (lv_expressao_2_0= ruleExpressao ) ) otherlv_3= ')' )
            // InternalImperativa1.g:346:3: otherlv_0= 'write' otherlv_1= '(' ( (lv_expressao_2_0= ruleExpressao ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWriteAccess().getWriteKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWriteAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalImperativa1.g:354:3: ( (lv_expressao_2_0= ruleExpressao ) )
            // InternalImperativa1.g:355:4: (lv_expressao_2_0= ruleExpressao )
            {
            // InternalImperativa1.g:355:4: (lv_expressao_2_0= ruleExpressao )
            // InternalImperativa1.g:356:5: lv_expressao_2_0= ruleExpressao
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWriteAccess().getExpressaoExpressaoParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_expressao_2_0=ruleExpressao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWriteRule());
              					}
              					set(
              						current,
              						"expressao",
              						lv_expressao_2_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Expressao");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWriteAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWrite"


    // $ANTLR start "entryRuleIfThenElse"
    // InternalImperativa1.g:381:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // InternalImperativa1.g:381:51: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // InternalImperativa1.g:382:2: iv_ruleIfThenElse= ruleIfThenElse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfThenElseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfThenElse=ruleIfThenElse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfThenElse; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfThenElse"


    // $ANTLR start "ruleIfThenElse"
    // InternalImperativa1.g:388:1: ruleIfThenElse returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expressao_1_0= ruleExpressao ) ) otherlv_2= 'then' ( (lv_comando_3_0= ruleComando ) ) otherlv_4= 'else' ( (lv_comando_5_0= ruleComando ) ) ) ;
    public final EObject ruleIfThenElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expressao_1_0 = null;

        EObject lv_comando_3_0 = null;

        EObject lv_comando_5_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:394:2: ( (otherlv_0= 'if' ( (lv_expressao_1_0= ruleExpressao ) ) otherlv_2= 'then' ( (lv_comando_3_0= ruleComando ) ) otherlv_4= 'else' ( (lv_comando_5_0= ruleComando ) ) ) )
            // InternalImperativa1.g:395:2: (otherlv_0= 'if' ( (lv_expressao_1_0= ruleExpressao ) ) otherlv_2= 'then' ( (lv_comando_3_0= ruleComando ) ) otherlv_4= 'else' ( (lv_comando_5_0= ruleComando ) ) )
            {
            // InternalImperativa1.g:395:2: (otherlv_0= 'if' ( (lv_expressao_1_0= ruleExpressao ) ) otherlv_2= 'then' ( (lv_comando_3_0= ruleComando ) ) otherlv_4= 'else' ( (lv_comando_5_0= ruleComando ) ) )
            // InternalImperativa1.g:396:3: otherlv_0= 'if' ( (lv_expressao_1_0= ruleExpressao ) ) otherlv_2= 'then' ( (lv_comando_3_0= ruleComando ) ) otherlv_4= 'else' ( (lv_comando_5_0= ruleComando ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfThenElseAccess().getIfKeyword_0());
              		
            }
            // InternalImperativa1.g:400:3: ( (lv_expressao_1_0= ruleExpressao ) )
            // InternalImperativa1.g:401:4: (lv_expressao_1_0= ruleExpressao )
            {
            // InternalImperativa1.g:401:4: (lv_expressao_1_0= ruleExpressao )
            // InternalImperativa1.g:402:5: lv_expressao_1_0= ruleExpressao
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfThenElseAccess().getExpressaoExpressaoParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_expressao_1_0=ruleExpressao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfThenElseRule());
              					}
              					set(
              						current,
              						"expressao",
              						lv_expressao_1_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Expressao");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfThenElseAccess().getThenKeyword_2());
              		
            }
            // InternalImperativa1.g:423:3: ( (lv_comando_3_0= ruleComando ) )
            // InternalImperativa1.g:424:4: (lv_comando_3_0= ruleComando )
            {
            // InternalImperativa1.g:424:4: (lv_comando_3_0= ruleComando )
            // InternalImperativa1.g:425:5: lv_comando_3_0= ruleComando
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfThenElseAccess().getComandoComandoParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_comando_3_0=ruleComando();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfThenElseRule());
              					}
              					set(
              						current,
              						"comando",
              						lv_comando_3_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Comando");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfThenElseAccess().getElseKeyword_4());
              		
            }
            // InternalImperativa1.g:446:3: ( (lv_comando_5_0= ruleComando ) )
            // InternalImperativa1.g:447:4: (lv_comando_5_0= ruleComando )
            {
            // InternalImperativa1.g:447:4: (lv_comando_5_0= ruleComando )
            // InternalImperativa1.g:448:5: lv_comando_5_0= ruleComando
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfThenElseAccess().getComandoComandoParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_comando_5_0=ruleComando();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfThenElseRule());
              					}
              					set(
              						current,
              						"comando",
              						lv_comando_5_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Comando");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfThenElse"


    // $ANTLR start "entryRuleWhile"
    // InternalImperativa1.g:469:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalImperativa1.g:469:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalImperativa1.g:470:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalImperativa1.g:476:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expressao_1_0= ruleExpressao ) ) otherlv_2= 'do' ( (lv_comando_3_0= ruleComando ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expressao_1_0 = null;

        EObject lv_comando_3_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:482:2: ( (otherlv_0= 'while' ( (lv_expressao_1_0= ruleExpressao ) ) otherlv_2= 'do' ( (lv_comando_3_0= ruleComando ) ) ) )
            // InternalImperativa1.g:483:2: (otherlv_0= 'while' ( (lv_expressao_1_0= ruleExpressao ) ) otherlv_2= 'do' ( (lv_comando_3_0= ruleComando ) ) )
            {
            // InternalImperativa1.g:483:2: (otherlv_0= 'while' ( (lv_expressao_1_0= ruleExpressao ) ) otherlv_2= 'do' ( (lv_comando_3_0= ruleComando ) ) )
            // InternalImperativa1.g:484:3: otherlv_0= 'while' ( (lv_expressao_1_0= ruleExpressao ) ) otherlv_2= 'do' ( (lv_comando_3_0= ruleComando ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
              		
            }
            // InternalImperativa1.g:488:3: ( (lv_expressao_1_0= ruleExpressao ) )
            // InternalImperativa1.g:489:4: (lv_expressao_1_0= ruleExpressao )
            {
            // InternalImperativa1.g:489:4: (lv_expressao_1_0= ruleExpressao )
            // InternalImperativa1.g:490:5: lv_expressao_1_0= ruleExpressao
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getExpressaoExpressaoParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_expressao_1_0=ruleExpressao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileRule());
              					}
              					set(
              						current,
              						"expressao",
              						lv_expressao_1_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Expressao");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getDoKeyword_2());
              		
            }
            // InternalImperativa1.g:511:3: ( (lv_comando_3_0= ruleComando ) )
            // InternalImperativa1.g:512:4: (lv_comando_3_0= ruleComando )
            {
            // InternalImperativa1.g:512:4: (lv_comando_3_0= ruleComando )
            // InternalImperativa1.g:513:5: lv_comando_3_0= ruleComando
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getComandoComandoParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_comando_3_0=ruleComando();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileRule());
              					}
              					set(
              						current,
              						"comando",
              						lv_comando_3_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Comando");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleSkip"
    // InternalImperativa1.g:534:1: entryRuleSkip returns [EObject current=null] : iv_ruleSkip= ruleSkip EOF ;
    public final EObject entryRuleSkip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkip = null;


        try {
            // InternalImperativa1.g:534:45: (iv_ruleSkip= ruleSkip EOF )
            // InternalImperativa1.g:535:2: iv_ruleSkip= ruleSkip EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSkipRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSkip=ruleSkip();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSkip; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSkip"


    // $ANTLR start "ruleSkip"
    // InternalImperativa1.g:541:1: ruleSkip returns [EObject current=null] : ( (lv_skip_0_0= 'skip' ) ) ;
    public final EObject ruleSkip() throws RecognitionException {
        EObject current = null;

        Token lv_skip_0_0=null;


        	enterRule();

        try {
            // InternalImperativa1.g:547:2: ( ( (lv_skip_0_0= 'skip' ) ) )
            // InternalImperativa1.g:548:2: ( (lv_skip_0_0= 'skip' ) )
            {
            // InternalImperativa1.g:548:2: ( (lv_skip_0_0= 'skip' ) )
            // InternalImperativa1.g:549:3: (lv_skip_0_0= 'skip' )
            {
            // InternalImperativa1.g:549:3: (lv_skip_0_0= 'skip' )
            // InternalImperativa1.g:550:4: lv_skip_0_0= 'skip'
            {
            lv_skip_0_0=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_skip_0_0, grammarAccess.getSkipAccess().getSkipSkipKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSkipRule());
              				}
              				setWithLastConsumed(current, "skip", lv_skip_0_0, "skip");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSkip"


    // $ANTLR start "entryRuleAtribuicao"
    // InternalImperativa1.g:565:1: entryRuleAtribuicao returns [EObject current=null] : iv_ruleAtribuicao= ruleAtribuicao EOF ;
    public final EObject entryRuleAtribuicao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtribuicao = null;


        try {
            // InternalImperativa1.g:565:51: (iv_ruleAtribuicao= ruleAtribuicao EOF )
            // InternalImperativa1.g:566:2: iv_ruleAtribuicao= ruleAtribuicao EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtribuicaoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtribuicao=ruleAtribuicao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtribuicao; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtribuicao"


    // $ANTLR start "ruleAtribuicao"
    // InternalImperativa1.g:572:1: ruleAtribuicao returns [EObject current=null] : ( ( (lv_pid_0_0= rulePId ) ) otherlv_1= ':=' ( (lv_expressao_2_0= ruleExpressao ) ) ) ;
    public final EObject ruleAtribuicao() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_pid_0_0 = null;

        EObject lv_expressao_2_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:578:2: ( ( ( (lv_pid_0_0= rulePId ) ) otherlv_1= ':=' ( (lv_expressao_2_0= ruleExpressao ) ) ) )
            // InternalImperativa1.g:579:2: ( ( (lv_pid_0_0= rulePId ) ) otherlv_1= ':=' ( (lv_expressao_2_0= ruleExpressao ) ) )
            {
            // InternalImperativa1.g:579:2: ( ( (lv_pid_0_0= rulePId ) ) otherlv_1= ':=' ( (lv_expressao_2_0= ruleExpressao ) ) )
            // InternalImperativa1.g:580:3: ( (lv_pid_0_0= rulePId ) ) otherlv_1= ':=' ( (lv_expressao_2_0= ruleExpressao ) )
            {
            // InternalImperativa1.g:580:3: ( (lv_pid_0_0= rulePId ) )
            // InternalImperativa1.g:581:4: (lv_pid_0_0= rulePId )
            {
            // InternalImperativa1.g:581:4: (lv_pid_0_0= rulePId )
            // InternalImperativa1.g:582:5: lv_pid_0_0= rulePId
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAtribuicaoAccess().getPidPIdParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_pid_0_0=rulePId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAtribuicaoRule());
              					}
              					set(
              						current,
              						"pid",
              						lv_pid_0_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.PId");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAtribuicaoAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalImperativa1.g:603:3: ( (lv_expressao_2_0= ruleExpressao ) )
            // InternalImperativa1.g:604:4: (lv_expressao_2_0= ruleExpressao )
            {
            // InternalImperativa1.g:604:4: (lv_expressao_2_0= ruleExpressao )
            // InternalImperativa1.g:605:5: lv_expressao_2_0= ruleExpressao
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAtribuicaoAccess().getExpressaoExpressaoParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expressao_2_0=ruleExpressao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAtribuicaoRule());
              					}
              					set(
              						current,
              						"expressao",
              						lv_expressao_2_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Expressao");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtribuicao"


    // $ANTLR start "entryRulePId"
    // InternalImperativa1.g:626:1: entryRulePId returns [String current=null] : iv_rulePId= rulePId EOF ;
    public final String entryRulePId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePId = null;


        try {
            // InternalImperativa1.g:626:43: (iv_rulePId= rulePId EOF )
            // InternalImperativa1.g:627:2: iv_rulePId= rulePId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPIdRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePId=rulePId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePId.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePId"


    // $ANTLR start "rulePId"
    // InternalImperativa1.g:633:1: rulePId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VALORSTRING_0= RULE_VALORSTRING (this_VALORSTRING_1= RULE_VALORSTRING | this_VALORINTEIRO_2= RULE_VALORINTEIRO )* ) ;
    public final AntlrDatatypeRuleToken rulePId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VALORSTRING_0=null;
        Token this_VALORSTRING_1=null;
        Token this_VALORINTEIRO_2=null;


        	enterRule();

        try {
            // InternalImperativa1.g:639:2: ( (this_VALORSTRING_0= RULE_VALORSTRING (this_VALORSTRING_1= RULE_VALORSTRING | this_VALORINTEIRO_2= RULE_VALORINTEIRO )* ) )
            // InternalImperativa1.g:640:2: (this_VALORSTRING_0= RULE_VALORSTRING (this_VALORSTRING_1= RULE_VALORSTRING | this_VALORINTEIRO_2= RULE_VALORINTEIRO )* )
            {
            // InternalImperativa1.g:640:2: (this_VALORSTRING_0= RULE_VALORSTRING (this_VALORSTRING_1= RULE_VALORSTRING | this_VALORINTEIRO_2= RULE_VALORINTEIRO )* )
            // InternalImperativa1.g:641:3: this_VALORSTRING_0= RULE_VALORSTRING (this_VALORSTRING_1= RULE_VALORSTRING | this_VALORINTEIRO_2= RULE_VALORINTEIRO )*
            {
            this_VALORSTRING_0=(Token)match(input,RULE_VALORSTRING,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_VALORSTRING_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_VALORSTRING_0, grammarAccess.getPIdAccess().getVALORSTRINGTerminalRuleCall_0());
              		
            }
            // InternalImperativa1.g:648:3: (this_VALORSTRING_1= RULE_VALORSTRING | this_VALORINTEIRO_2= RULE_VALORINTEIRO )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_VALORSTRING) ) {
                    alt4=1;
                }
                else if ( (LA4_0==RULE_VALORINTEIRO) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalImperativa1.g:649:4: this_VALORSTRING_1= RULE_VALORSTRING
            	    {
            	    this_VALORSTRING_1=(Token)match(input,RULE_VALORSTRING,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_VALORSTRING_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_VALORSTRING_1, grammarAccess.getPIdAccess().getVALORSTRINGTerminalRuleCall_1_0());
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalImperativa1.g:657:4: this_VALORINTEIRO_2= RULE_VALORINTEIRO
            	    {
            	    this_VALORINTEIRO_2=(Token)match(input,RULE_VALORINTEIRO,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_VALORINTEIRO_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_VALORINTEIRO_2, grammarAccess.getPIdAccess().getVALORINTEIROTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePId"


    // $ANTLR start "entryRuleValor"
    // InternalImperativa1.g:669:1: entryRuleValor returns [EObject current=null] : iv_ruleValor= ruleValor EOF ;
    public final EObject entryRuleValor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValor = null;


        try {
            // InternalImperativa1.g:669:46: (iv_ruleValor= ruleValor EOF )
            // InternalImperativa1.g:670:2: iv_ruleValor= ruleValor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValor=ruleValor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValor"


    // $ANTLR start "ruleValor"
    // InternalImperativa1.g:676:1: ruleValor returns [EObject current=null] : ( ( (lv_intType_0_0= RULE_VALORINTEIRO ) ) | ( (lv_stringType_1_0= RULE_VALORSTRING ) ) | ( (lv_boolType_2_0= RULE_VALORBOOLEANO ) ) ) ;
    public final EObject ruleValor() throws RecognitionException {
        EObject current = null;

        Token lv_intType_0_0=null;
        Token lv_stringType_1_0=null;
        Token lv_boolType_2_0=null;


        	enterRule();

        try {
            // InternalImperativa1.g:682:2: ( ( ( (lv_intType_0_0= RULE_VALORINTEIRO ) ) | ( (lv_stringType_1_0= RULE_VALORSTRING ) ) | ( (lv_boolType_2_0= RULE_VALORBOOLEANO ) ) ) )
            // InternalImperativa1.g:683:2: ( ( (lv_intType_0_0= RULE_VALORINTEIRO ) ) | ( (lv_stringType_1_0= RULE_VALORSTRING ) ) | ( (lv_boolType_2_0= RULE_VALORBOOLEANO ) ) )
            {
            // InternalImperativa1.g:683:2: ( ( (lv_intType_0_0= RULE_VALORINTEIRO ) ) | ( (lv_stringType_1_0= RULE_VALORSTRING ) ) | ( (lv_boolType_2_0= RULE_VALORBOOLEANO ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_VALORINTEIRO:
                {
                alt5=1;
                }
                break;
            case RULE_VALORSTRING:
                {
                alt5=2;
                }
                break;
            case RULE_VALORBOOLEANO:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalImperativa1.g:684:3: ( (lv_intType_0_0= RULE_VALORINTEIRO ) )
                    {
                    // InternalImperativa1.g:684:3: ( (lv_intType_0_0= RULE_VALORINTEIRO ) )
                    // InternalImperativa1.g:685:4: (lv_intType_0_0= RULE_VALORINTEIRO )
                    {
                    // InternalImperativa1.g:685:4: (lv_intType_0_0= RULE_VALORINTEIRO )
                    // InternalImperativa1.g:686:5: lv_intType_0_0= RULE_VALORINTEIRO
                    {
                    lv_intType_0_0=(Token)match(input,RULE_VALORINTEIRO,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_intType_0_0, grammarAccess.getValorAccess().getIntTypeVALORINTEIROTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getValorRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"intType",
                      						lv_intType_0_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.VALORINTEIRO");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:703:3: ( (lv_stringType_1_0= RULE_VALORSTRING ) )
                    {
                    // InternalImperativa1.g:703:3: ( (lv_stringType_1_0= RULE_VALORSTRING ) )
                    // InternalImperativa1.g:704:4: (lv_stringType_1_0= RULE_VALORSTRING )
                    {
                    // InternalImperativa1.g:704:4: (lv_stringType_1_0= RULE_VALORSTRING )
                    // InternalImperativa1.g:705:5: lv_stringType_1_0= RULE_VALORSTRING
                    {
                    lv_stringType_1_0=(Token)match(input,RULE_VALORSTRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_stringType_1_0, grammarAccess.getValorAccess().getStringTypeVALORSTRINGTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getValorRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"stringType",
                      						lv_stringType_1_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.VALORSTRING");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalImperativa1.g:722:3: ( (lv_boolType_2_0= RULE_VALORBOOLEANO ) )
                    {
                    // InternalImperativa1.g:722:3: ( (lv_boolType_2_0= RULE_VALORBOOLEANO ) )
                    // InternalImperativa1.g:723:4: (lv_boolType_2_0= RULE_VALORBOOLEANO )
                    {
                    // InternalImperativa1.g:723:4: (lv_boolType_2_0= RULE_VALORBOOLEANO )
                    // InternalImperativa1.g:724:5: lv_boolType_2_0= RULE_VALORBOOLEANO
                    {
                    lv_boolType_2_0=(Token)match(input,RULE_VALORBOOLEANO,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_boolType_2_0, grammarAccess.getValorAccess().getBoolTypeVALORBOOLEANOTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getValorRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"boolType",
                      						lv_boolType_2_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.VALORBOOLEANO");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValor"


    // $ANTLR start "entryRuleExpMenos"
    // InternalImperativa1.g:744:1: entryRuleExpMenos returns [EObject current=null] : iv_ruleExpMenos= ruleExpMenos EOF ;
    public final EObject entryRuleExpMenos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpMenos = null;


        try {
            // InternalImperativa1.g:744:49: (iv_ruleExpMenos= ruleExpMenos EOF )
            // InternalImperativa1.g:745:2: iv_ruleExpMenos= ruleExpMenos EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpMenosRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpMenos=ruleExpMenos();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpMenos; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpMenos"


    // $ANTLR start "ruleExpMenos"
    // InternalImperativa1.g:751:1: ruleExpMenos returns [EObject current=null] : (otherlv_0= '-' ( (lv_menosExpressao_1_0= ruleExpressao ) ) ) ;
    public final EObject ruleExpMenos() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_menosExpressao_1_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:757:2: ( (otherlv_0= '-' ( (lv_menosExpressao_1_0= ruleExpressao ) ) ) )
            // InternalImperativa1.g:758:2: (otherlv_0= '-' ( (lv_menosExpressao_1_0= ruleExpressao ) ) )
            {
            // InternalImperativa1.g:758:2: (otherlv_0= '-' ( (lv_menosExpressao_1_0= ruleExpressao ) ) )
            // InternalImperativa1.g:759:3: otherlv_0= '-' ( (lv_menosExpressao_1_0= ruleExpressao ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExpMenosAccess().getHyphenMinusKeyword_0());
              		
            }
            // InternalImperativa1.g:763:3: ( (lv_menosExpressao_1_0= ruleExpressao ) )
            // InternalImperativa1.g:764:4: (lv_menosExpressao_1_0= ruleExpressao )
            {
            // InternalImperativa1.g:764:4: (lv_menosExpressao_1_0= ruleExpressao )
            // InternalImperativa1.g:765:5: lv_menosExpressao_1_0= ruleExpressao
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpMenosAccess().getMenosExpressaoExpressaoParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_menosExpressao_1_0=ruleExpressao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpMenosRule());
              					}
              					set(
              						current,
              						"menosExpressao",
              						lv_menosExpressao_1_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Expressao");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpMenos"


    // $ANTLR start "entryRuleExpNot"
    // InternalImperativa1.g:786:1: entryRuleExpNot returns [EObject current=null] : iv_ruleExpNot= ruleExpNot EOF ;
    public final EObject entryRuleExpNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpNot = null;


        try {
            // InternalImperativa1.g:786:47: (iv_ruleExpNot= ruleExpNot EOF )
            // InternalImperativa1.g:787:2: iv_ruleExpNot= ruleExpNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpNotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpNot=ruleExpNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpNot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpNot"


    // $ANTLR start "ruleExpNot"
    // InternalImperativa1.g:793:1: ruleExpNot returns [EObject current=null] : (otherlv_0= 'not' ( (lv_notExpressao_1_0= ruleExpressao ) ) ) ;
    public final EObject ruleExpNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_notExpressao_1_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:799:2: ( (otherlv_0= 'not' ( (lv_notExpressao_1_0= ruleExpressao ) ) ) )
            // InternalImperativa1.g:800:2: (otherlv_0= 'not' ( (lv_notExpressao_1_0= ruleExpressao ) ) )
            {
            // InternalImperativa1.g:800:2: (otherlv_0= 'not' ( (lv_notExpressao_1_0= ruleExpressao ) ) )
            // InternalImperativa1.g:801:3: otherlv_0= 'not' ( (lv_notExpressao_1_0= ruleExpressao ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExpNotAccess().getNotKeyword_0());
              		
            }
            // InternalImperativa1.g:805:3: ( (lv_notExpressao_1_0= ruleExpressao ) )
            // InternalImperativa1.g:806:4: (lv_notExpressao_1_0= ruleExpressao )
            {
            // InternalImperativa1.g:806:4: (lv_notExpressao_1_0= ruleExpressao )
            // InternalImperativa1.g:807:5: lv_notExpressao_1_0= ruleExpressao
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpNotAccess().getNotExpressaoExpressaoParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_notExpressao_1_0=ruleExpressao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpNotRule());
              					}
              					set(
              						current,
              						"notExpressao",
              						lv_notExpressao_1_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Expressao");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpNot"


    // $ANTLR start "entryRuleExpLenght"
    // InternalImperativa1.g:828:1: entryRuleExpLenght returns [EObject current=null] : iv_ruleExpLenght= ruleExpLenght EOF ;
    public final EObject entryRuleExpLenght() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpLenght = null;


        try {
            // InternalImperativa1.g:828:50: (iv_ruleExpLenght= ruleExpLenght EOF )
            // InternalImperativa1.g:829:2: iv_ruleExpLenght= ruleExpLenght EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpLenghtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpLenght=ruleExpLenght();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpLenght; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpLenght"


    // $ANTLR start "ruleExpLenght"
    // InternalImperativa1.g:835:1: ruleExpLenght returns [EObject current=null] : (otherlv_0= 'length' ( (lv_lengthExpressao_1_0= ruleExpressao ) ) ) ;
    public final EObject ruleExpLenght() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_lengthExpressao_1_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:841:2: ( (otherlv_0= 'length' ( (lv_lengthExpressao_1_0= ruleExpressao ) ) ) )
            // InternalImperativa1.g:842:2: (otherlv_0= 'length' ( (lv_lengthExpressao_1_0= ruleExpressao ) ) )
            {
            // InternalImperativa1.g:842:2: (otherlv_0= 'length' ( (lv_lengthExpressao_1_0= ruleExpressao ) ) )
            // InternalImperativa1.g:843:3: otherlv_0= 'length' ( (lv_lengthExpressao_1_0= ruleExpressao ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExpLenghtAccess().getLengthKeyword_0());
              		
            }
            // InternalImperativa1.g:847:3: ( (lv_lengthExpressao_1_0= ruleExpressao ) )
            // InternalImperativa1.g:848:4: (lv_lengthExpressao_1_0= ruleExpressao )
            {
            // InternalImperativa1.g:848:4: (lv_lengthExpressao_1_0= ruleExpressao )
            // InternalImperativa1.g:849:5: lv_lengthExpressao_1_0= ruleExpressao
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpLenghtAccess().getLengthExpressaoExpressaoParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_lengthExpressao_1_0=ruleExpressao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpLenghtRule());
              					}
              					set(
              						current,
              						"lengthExpressao",
              						lv_lengthExpressao_1_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Expressao");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpLenght"


    // $ANTLR start "entryRuleExpPrimaria"
    // InternalImperativa1.g:870:1: entryRuleExpPrimaria returns [EObject current=null] : iv_ruleExpPrimaria= ruleExpPrimaria EOF ;
    public final EObject entryRuleExpPrimaria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpPrimaria = null;


        try {
            // InternalImperativa1.g:870:52: (iv_ruleExpPrimaria= ruleExpPrimaria EOF )
            // InternalImperativa1.g:871:2: iv_ruleExpPrimaria= ruleExpPrimaria EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpPrimariaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpPrimaria=ruleExpPrimaria();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpPrimaria; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpPrimaria"


    // $ANTLR start "ruleExpPrimaria"
    // InternalImperativa1.g:877:1: ruleExpPrimaria returns [EObject current=null] : ( ( (lv_pid_0_0= rulePId ) ) | ( (lv_valor_1_0= ruleValor ) ) | (otherlv_2= '(' ( (lv_expressao_3_0= ruleExpressao ) ) otherlv_4= ')' ) ) ;
    public final EObject ruleExpPrimaria() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_pid_0_0 = null;

        EObject lv_valor_1_0 = null;

        EObject lv_expressao_3_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:883:2: ( ( ( (lv_pid_0_0= rulePId ) ) | ( (lv_valor_1_0= ruleValor ) ) | (otherlv_2= '(' ( (lv_expressao_3_0= ruleExpressao ) ) otherlv_4= ')' ) ) )
            // InternalImperativa1.g:884:2: ( ( (lv_pid_0_0= rulePId ) ) | ( (lv_valor_1_0= ruleValor ) ) | (otherlv_2= '(' ( (lv_expressao_3_0= ruleExpressao ) ) otherlv_4= ')' ) )
            {
            // InternalImperativa1.g:884:2: ( ( (lv_pid_0_0= rulePId ) ) | ( (lv_valor_1_0= ruleValor ) ) | (otherlv_2= '(' ( (lv_expressao_3_0= ruleExpressao ) ) otherlv_4= ')' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_VALORSTRING:
                {
                alt6=1;
                }
                break;
            case RULE_VALORINTEIRO:
            case RULE_VALORBOOLEANO:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalImperativa1.g:885:3: ( (lv_pid_0_0= rulePId ) )
                    {
                    // InternalImperativa1.g:885:3: ( (lv_pid_0_0= rulePId ) )
                    // InternalImperativa1.g:886:4: (lv_pid_0_0= rulePId )
                    {
                    // InternalImperativa1.g:886:4: (lv_pid_0_0= rulePId )
                    // InternalImperativa1.g:887:5: lv_pid_0_0= rulePId
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpPrimariaAccess().getPidPIdParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_pid_0_0=rulePId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpPrimariaRule());
                      					}
                      					set(
                      						current,
                      						"pid",
                      						lv_pid_0_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.PId");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:905:3: ( (lv_valor_1_0= ruleValor ) )
                    {
                    // InternalImperativa1.g:905:3: ( (lv_valor_1_0= ruleValor ) )
                    // InternalImperativa1.g:906:4: (lv_valor_1_0= ruleValor )
                    {
                    // InternalImperativa1.g:906:4: (lv_valor_1_0= ruleValor )
                    // InternalImperativa1.g:907:5: lv_valor_1_0= ruleValor
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpPrimariaAccess().getValorValorParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_valor_1_0=ruleValor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpPrimariaRule());
                      					}
                      					set(
                      						current,
                      						"valor",
                      						lv_valor_1_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.Valor");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalImperativa1.g:925:3: (otherlv_2= '(' ( (lv_expressao_3_0= ruleExpressao ) ) otherlv_4= ')' )
                    {
                    // InternalImperativa1.g:925:3: (otherlv_2= '(' ( (lv_expressao_3_0= ruleExpressao ) ) otherlv_4= ')' )
                    // InternalImperativa1.g:926:4: otherlv_2= '(' ( (lv_expressao_3_0= ruleExpressao ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getExpPrimariaAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalImperativa1.g:930:4: ( (lv_expressao_3_0= ruleExpressao ) )
                    // InternalImperativa1.g:931:5: (lv_expressao_3_0= ruleExpressao )
                    {
                    // InternalImperativa1.g:931:5: (lv_expressao_3_0= ruleExpressao )
                    // InternalImperativa1.g:932:6: lv_expressao_3_0= ruleExpressao
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpPrimariaAccess().getExpressaoExpressaoParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_expressao_3_0=ruleExpressao();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpPrimariaRule());
                      						}
                      						set(
                      							current,
                      							"expressao",
                      							lv_expressao_3_0,
                      							"br.ufpe.cin.plp.imperativa1.Imperativa1.Expressao");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getExpPrimariaAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpPrimaria"


    // $ANTLR start "entryRuleExpUnaria"
    // InternalImperativa1.g:958:1: entryRuleExpUnaria returns [EObject current=null] : iv_ruleExpUnaria= ruleExpUnaria EOF ;
    public final EObject entryRuleExpUnaria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpUnaria = null;


        try {
            // InternalImperativa1.g:958:50: (iv_ruleExpUnaria= ruleExpUnaria EOF )
            // InternalImperativa1.g:959:2: iv_ruleExpUnaria= ruleExpUnaria EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpUnariaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpUnaria=ruleExpUnaria();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpUnaria; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpUnaria"


    // $ANTLR start "ruleExpUnaria"
    // InternalImperativa1.g:965:1: ruleExpUnaria returns [EObject current=null] : ( ( (lv_menosExpressao_0_0= ruleExpMenos ) ) | ( (lv_notExpressao_1_0= ruleExpNot ) ) | ( (lv_lengthExpressao_2_0= ruleExpLenght ) ) ) ;
    public final EObject ruleExpUnaria() throws RecognitionException {
        EObject current = null;

        EObject lv_menosExpressao_0_0 = null;

        EObject lv_notExpressao_1_0 = null;

        EObject lv_lengthExpressao_2_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:971:2: ( ( ( (lv_menosExpressao_0_0= ruleExpMenos ) ) | ( (lv_notExpressao_1_0= ruleExpNot ) ) | ( (lv_lengthExpressao_2_0= ruleExpLenght ) ) ) )
            // InternalImperativa1.g:972:2: ( ( (lv_menosExpressao_0_0= ruleExpMenos ) ) | ( (lv_notExpressao_1_0= ruleExpNot ) ) | ( (lv_lengthExpressao_2_0= ruleExpLenght ) ) )
            {
            // InternalImperativa1.g:972:2: ( ( (lv_menosExpressao_0_0= ruleExpMenos ) ) | ( (lv_notExpressao_1_0= ruleExpNot ) ) | ( (lv_lengthExpressao_2_0= ruleExpLenght ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalImperativa1.g:973:3: ( (lv_menosExpressao_0_0= ruleExpMenos ) )
                    {
                    // InternalImperativa1.g:973:3: ( (lv_menosExpressao_0_0= ruleExpMenos ) )
                    // InternalImperativa1.g:974:4: (lv_menosExpressao_0_0= ruleExpMenos )
                    {
                    // InternalImperativa1.g:974:4: (lv_menosExpressao_0_0= ruleExpMenos )
                    // InternalImperativa1.g:975:5: lv_menosExpressao_0_0= ruleExpMenos
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpUnariaAccess().getMenosExpressaoExpMenosParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_menosExpressao_0_0=ruleExpMenos();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpUnariaRule());
                      					}
                      					set(
                      						current,
                      						"menosExpressao",
                      						lv_menosExpressao_0_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.ExpMenos");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:993:3: ( (lv_notExpressao_1_0= ruleExpNot ) )
                    {
                    // InternalImperativa1.g:993:3: ( (lv_notExpressao_1_0= ruleExpNot ) )
                    // InternalImperativa1.g:994:4: (lv_notExpressao_1_0= ruleExpNot )
                    {
                    // InternalImperativa1.g:994:4: (lv_notExpressao_1_0= ruleExpNot )
                    // InternalImperativa1.g:995:5: lv_notExpressao_1_0= ruleExpNot
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpUnariaAccess().getNotExpressaoExpNotParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_notExpressao_1_0=ruleExpNot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpUnariaRule());
                      					}
                      					set(
                      						current,
                      						"notExpressao",
                      						lv_notExpressao_1_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.ExpNot");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalImperativa1.g:1013:3: ( (lv_lengthExpressao_2_0= ruleExpLenght ) )
                    {
                    // InternalImperativa1.g:1013:3: ( (lv_lengthExpressao_2_0= ruleExpLenght ) )
                    // InternalImperativa1.g:1014:4: (lv_lengthExpressao_2_0= ruleExpLenght )
                    {
                    // InternalImperativa1.g:1014:4: (lv_lengthExpressao_2_0= ruleExpLenght )
                    // InternalImperativa1.g:1015:5: lv_lengthExpressao_2_0= ruleExpLenght
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpUnariaAccess().getLengthExpressaoExpLenghtParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_lengthExpressao_2_0=ruleExpLenght();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpUnariaRule());
                      					}
                      					set(
                      						current,
                      						"lengthExpressao",
                      						lv_lengthExpressao_2_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.ExpLenght");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpUnaria"


    // $ANTLR start "entryRuleExpBinaria"
    // InternalImperativa1.g:1036:1: entryRuleExpBinaria returns [EObject current=null] : iv_ruleExpBinaria= ruleExpBinaria EOF ;
    public final EObject entryRuleExpBinaria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpBinaria = null;


        try {
            // InternalImperativa1.g:1036:51: (iv_ruleExpBinaria= ruleExpBinaria EOF )
            // InternalImperativa1.g:1037:2: iv_ruleExpBinaria= ruleExpBinaria EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpBinariaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpBinaria=ruleExpBinaria();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpBinaria; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpBinaria"


    // $ANTLR start "ruleExpBinaria"
    // InternalImperativa1.g:1043:1: ruleExpBinaria returns [EObject current=null] : ( ( (lv_somaExpressao_0_0= ruleExpSoma ) ) | ( (lv_subExpressao_1_0= ruleExpSub ) ) | ( (lv_orExpressao_2_0= ruleExpOr ) ) | ( (lv_andExpressao_3_0= ruleExpAnd ) ) | ( (lv_equalsExpressao_4_0= ruleExpEquals ) ) | ( (lv_concatExpressao_5_0= ruleExpConcat ) ) ) ;
    public final EObject ruleExpBinaria() throws RecognitionException {
        EObject current = null;

        EObject lv_somaExpressao_0_0 = null;

        EObject lv_subExpressao_1_0 = null;

        EObject lv_orExpressao_2_0 = null;

        EObject lv_andExpressao_3_0 = null;

        EObject lv_equalsExpressao_4_0 = null;

        EObject lv_concatExpressao_5_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:1049:2: ( ( ( (lv_somaExpressao_0_0= ruleExpSoma ) ) | ( (lv_subExpressao_1_0= ruleExpSub ) ) | ( (lv_orExpressao_2_0= ruleExpOr ) ) | ( (lv_andExpressao_3_0= ruleExpAnd ) ) | ( (lv_equalsExpressao_4_0= ruleExpEquals ) ) | ( (lv_concatExpressao_5_0= ruleExpConcat ) ) ) )
            // InternalImperativa1.g:1050:2: ( ( (lv_somaExpressao_0_0= ruleExpSoma ) ) | ( (lv_subExpressao_1_0= ruleExpSub ) ) | ( (lv_orExpressao_2_0= ruleExpOr ) ) | ( (lv_andExpressao_3_0= ruleExpAnd ) ) | ( (lv_equalsExpressao_4_0= ruleExpEquals ) ) | ( (lv_concatExpressao_5_0= ruleExpConcat ) ) )
            {
            // InternalImperativa1.g:1050:2: ( ( (lv_somaExpressao_0_0= ruleExpSoma ) ) | ( (lv_subExpressao_1_0= ruleExpSub ) ) | ( (lv_orExpressao_2_0= ruleExpOr ) ) | ( (lv_andExpressao_3_0= ruleExpAnd ) ) | ( (lv_equalsExpressao_4_0= ruleExpEquals ) ) | ( (lv_concatExpressao_5_0= ruleExpConcat ) ) )
            int alt8=6;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalImperativa1.g:1051:3: ( (lv_somaExpressao_0_0= ruleExpSoma ) )
                    {
                    // InternalImperativa1.g:1051:3: ( (lv_somaExpressao_0_0= ruleExpSoma ) )
                    // InternalImperativa1.g:1052:4: (lv_somaExpressao_0_0= ruleExpSoma )
                    {
                    // InternalImperativa1.g:1052:4: (lv_somaExpressao_0_0= ruleExpSoma )
                    // InternalImperativa1.g:1053:5: lv_somaExpressao_0_0= ruleExpSoma
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpBinariaAccess().getSomaExpressaoExpSomaParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_somaExpressao_0_0=ruleExpSoma();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpBinariaRule());
                      					}
                      					set(
                      						current,
                      						"somaExpressao",
                      						lv_somaExpressao_0_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.ExpSoma");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:1071:3: ( (lv_subExpressao_1_0= ruleExpSub ) )
                    {
                    // InternalImperativa1.g:1071:3: ( (lv_subExpressao_1_0= ruleExpSub ) )
                    // InternalImperativa1.g:1072:4: (lv_subExpressao_1_0= ruleExpSub )
                    {
                    // InternalImperativa1.g:1072:4: (lv_subExpressao_1_0= ruleExpSub )
                    // InternalImperativa1.g:1073:5: lv_subExpressao_1_0= ruleExpSub
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpBinariaAccess().getSubExpressaoExpSubParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_subExpressao_1_0=ruleExpSub();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpBinariaRule());
                      					}
                      					set(
                      						current,
                      						"subExpressao",
                      						lv_subExpressao_1_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.ExpSub");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalImperativa1.g:1091:3: ( (lv_orExpressao_2_0= ruleExpOr ) )
                    {
                    // InternalImperativa1.g:1091:3: ( (lv_orExpressao_2_0= ruleExpOr ) )
                    // InternalImperativa1.g:1092:4: (lv_orExpressao_2_0= ruleExpOr )
                    {
                    // InternalImperativa1.g:1092:4: (lv_orExpressao_2_0= ruleExpOr )
                    // InternalImperativa1.g:1093:5: lv_orExpressao_2_0= ruleExpOr
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpBinariaAccess().getOrExpressaoExpOrParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_orExpressao_2_0=ruleExpOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpBinariaRule());
                      					}
                      					set(
                      						current,
                      						"orExpressao",
                      						lv_orExpressao_2_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.ExpOr");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalImperativa1.g:1111:3: ( (lv_andExpressao_3_0= ruleExpAnd ) )
                    {
                    // InternalImperativa1.g:1111:3: ( (lv_andExpressao_3_0= ruleExpAnd ) )
                    // InternalImperativa1.g:1112:4: (lv_andExpressao_3_0= ruleExpAnd )
                    {
                    // InternalImperativa1.g:1112:4: (lv_andExpressao_3_0= ruleExpAnd )
                    // InternalImperativa1.g:1113:5: lv_andExpressao_3_0= ruleExpAnd
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpBinariaAccess().getAndExpressaoExpAndParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_andExpressao_3_0=ruleExpAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpBinariaRule());
                      					}
                      					set(
                      						current,
                      						"andExpressao",
                      						lv_andExpressao_3_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.ExpAnd");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalImperativa1.g:1131:3: ( (lv_equalsExpressao_4_0= ruleExpEquals ) )
                    {
                    // InternalImperativa1.g:1131:3: ( (lv_equalsExpressao_4_0= ruleExpEquals ) )
                    // InternalImperativa1.g:1132:4: (lv_equalsExpressao_4_0= ruleExpEquals )
                    {
                    // InternalImperativa1.g:1132:4: (lv_equalsExpressao_4_0= ruleExpEquals )
                    // InternalImperativa1.g:1133:5: lv_equalsExpressao_4_0= ruleExpEquals
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpBinariaAccess().getEqualsExpressaoExpEqualsParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_equalsExpressao_4_0=ruleExpEquals();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpBinariaRule());
                      					}
                      					set(
                      						current,
                      						"equalsExpressao",
                      						lv_equalsExpressao_4_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.ExpEquals");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalImperativa1.g:1151:3: ( (lv_concatExpressao_5_0= ruleExpConcat ) )
                    {
                    // InternalImperativa1.g:1151:3: ( (lv_concatExpressao_5_0= ruleExpConcat ) )
                    // InternalImperativa1.g:1152:4: (lv_concatExpressao_5_0= ruleExpConcat )
                    {
                    // InternalImperativa1.g:1152:4: (lv_concatExpressao_5_0= ruleExpConcat )
                    // InternalImperativa1.g:1153:5: lv_concatExpressao_5_0= ruleExpConcat
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpBinariaAccess().getConcatExpressaoExpConcatParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_concatExpressao_5_0=ruleExpConcat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpBinariaRule());
                      					}
                      					set(
                      						current,
                      						"concatExpressao",
                      						lv_concatExpressao_5_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.ExpConcat");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpBinaria"


    // $ANTLR start "entryRuleExpSoma"
    // InternalImperativa1.g:1174:1: entryRuleExpSoma returns [EObject current=null] : iv_ruleExpSoma= ruleExpSoma EOF ;
    public final EObject entryRuleExpSoma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpSoma = null;


        try {
            // InternalImperativa1.g:1174:48: (iv_ruleExpSoma= ruleExpSoma EOF )
            // InternalImperativa1.g:1175:2: iv_ruleExpSoma= ruleExpSoma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpSomaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpSoma=ruleExpSoma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpSoma; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpSoma"


    // $ANTLR start "ruleExpSoma"
    // InternalImperativa1.g:1181:1: ruleExpSoma returns [EObject current=null] : ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '+' ( (lv_expressao_2_0= ruleExpressao ) ) ) ;
    public final EObject ruleExpSoma() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_valor_0_0 = null;

        EObject lv_expressao_2_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:1187:2: ( ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '+' ( (lv_expressao_2_0= ruleExpressao ) ) ) )
            // InternalImperativa1.g:1188:2: ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '+' ( (lv_expressao_2_0= ruleExpressao ) ) )
            {
            // InternalImperativa1.g:1188:2: ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '+' ( (lv_expressao_2_0= ruleExpressao ) ) )
            // InternalImperativa1.g:1189:3: ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '+' ( (lv_expressao_2_0= ruleExpressao ) )
            {
            // InternalImperativa1.g:1189:3: ( (lv_valor_0_0= ruleValor ) )
            // InternalImperativa1.g:1190:4: (lv_valor_0_0= ruleValor )
            {
            // InternalImperativa1.g:1190:4: (lv_valor_0_0= ruleValor )
            // InternalImperativa1.g:1191:5: lv_valor_0_0= ruleValor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpSomaAccess().getValorValorParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_valor_0_0=ruleValor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpSomaRule());
              					}
              					set(
              						current,
              						"valor",
              						lv_valor_0_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Valor");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExpSomaAccess().getPlusSignKeyword_1());
              		
            }
            // InternalImperativa1.g:1212:3: ( (lv_expressao_2_0= ruleExpressao ) )
            // InternalImperativa1.g:1213:4: (lv_expressao_2_0= ruleExpressao )
            {
            // InternalImperativa1.g:1213:4: (lv_expressao_2_0= ruleExpressao )
            // InternalImperativa1.g:1214:5: lv_expressao_2_0= ruleExpressao
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpSomaAccess().getExpressaoExpressaoParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expressao_2_0=ruleExpressao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpSomaRule());
              					}
              					set(
              						current,
              						"expressao",
              						lv_expressao_2_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Expressao");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpSoma"


    // $ANTLR start "entryRuleExpSub"
    // InternalImperativa1.g:1235:1: entryRuleExpSub returns [EObject current=null] : iv_ruleExpSub= ruleExpSub EOF ;
    public final EObject entryRuleExpSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpSub = null;


        try {
            // InternalImperativa1.g:1235:47: (iv_ruleExpSub= ruleExpSub EOF )
            // InternalImperativa1.g:1236:2: iv_ruleExpSub= ruleExpSub EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpSubRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpSub=ruleExpSub();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpSub; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpSub"


    // $ANTLR start "ruleExpSub"
    // InternalImperativa1.g:1242:1: ruleExpSub returns [EObject current=null] : ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '-' ( (lv_expressao_2_0= ruleExpressao ) ) ) ;
    public final EObject ruleExpSub() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_valor_0_0 = null;

        EObject lv_expressao_2_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:1248:2: ( ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '-' ( (lv_expressao_2_0= ruleExpressao ) ) ) )
            // InternalImperativa1.g:1249:2: ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '-' ( (lv_expressao_2_0= ruleExpressao ) ) )
            {
            // InternalImperativa1.g:1249:2: ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '-' ( (lv_expressao_2_0= ruleExpressao ) ) )
            // InternalImperativa1.g:1250:3: ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '-' ( (lv_expressao_2_0= ruleExpressao ) )
            {
            // InternalImperativa1.g:1250:3: ( (lv_valor_0_0= ruleValor ) )
            // InternalImperativa1.g:1251:4: (lv_valor_0_0= ruleValor )
            {
            // InternalImperativa1.g:1251:4: (lv_valor_0_0= ruleValor )
            // InternalImperativa1.g:1252:5: lv_valor_0_0= ruleValor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpSubAccess().getValorValorParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_valor_0_0=ruleValor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpSubRule());
              					}
              					set(
              						current,
              						"valor",
              						lv_valor_0_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Valor");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExpSubAccess().getHyphenMinusKeyword_1());
              		
            }
            // InternalImperativa1.g:1273:3: ( (lv_expressao_2_0= ruleExpressao ) )
            // InternalImperativa1.g:1274:4: (lv_expressao_2_0= ruleExpressao )
            {
            // InternalImperativa1.g:1274:4: (lv_expressao_2_0= ruleExpressao )
            // InternalImperativa1.g:1275:5: lv_expressao_2_0= ruleExpressao
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpSubAccess().getExpressaoExpressaoParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expressao_2_0=ruleExpressao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpSubRule());
              					}
              					set(
              						current,
              						"expressao",
              						lv_expressao_2_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Expressao");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpSub"


    // $ANTLR start "entryRuleExpAnd"
    // InternalImperativa1.g:1296:1: entryRuleExpAnd returns [EObject current=null] : iv_ruleExpAnd= ruleExpAnd EOF ;
    public final EObject entryRuleExpAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpAnd = null;


        try {
            // InternalImperativa1.g:1296:47: (iv_ruleExpAnd= ruleExpAnd EOF )
            // InternalImperativa1.g:1297:2: iv_ruleExpAnd= ruleExpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpAnd=ruleExpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpAnd"


    // $ANTLR start "ruleExpAnd"
    // InternalImperativa1.g:1303:1: ruleExpAnd returns [EObject current=null] : ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= 'and' ( (lv_expressao_2_0= ruleExpressao ) ) ) ;
    public final EObject ruleExpAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_valor_0_0 = null;

        EObject lv_expressao_2_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:1309:2: ( ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= 'and' ( (lv_expressao_2_0= ruleExpressao ) ) ) )
            // InternalImperativa1.g:1310:2: ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= 'and' ( (lv_expressao_2_0= ruleExpressao ) ) )
            {
            // InternalImperativa1.g:1310:2: ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= 'and' ( (lv_expressao_2_0= ruleExpressao ) ) )
            // InternalImperativa1.g:1311:3: ( (lv_valor_0_0= ruleValor ) ) otherlv_1= 'and' ( (lv_expressao_2_0= ruleExpressao ) )
            {
            // InternalImperativa1.g:1311:3: ( (lv_valor_0_0= ruleValor ) )
            // InternalImperativa1.g:1312:4: (lv_valor_0_0= ruleValor )
            {
            // InternalImperativa1.g:1312:4: (lv_valor_0_0= ruleValor )
            // InternalImperativa1.g:1313:5: lv_valor_0_0= ruleValor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpAndAccess().getValorValorParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_valor_0_0=ruleValor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpAndRule());
              					}
              					set(
              						current,
              						"valor",
              						lv_valor_0_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Valor");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExpAndAccess().getAndKeyword_1());
              		
            }
            // InternalImperativa1.g:1334:3: ( (lv_expressao_2_0= ruleExpressao ) )
            // InternalImperativa1.g:1335:4: (lv_expressao_2_0= ruleExpressao )
            {
            // InternalImperativa1.g:1335:4: (lv_expressao_2_0= ruleExpressao )
            // InternalImperativa1.g:1336:5: lv_expressao_2_0= ruleExpressao
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpAndAccess().getExpressaoExpressaoParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expressao_2_0=ruleExpressao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpAndRule());
              					}
              					set(
              						current,
              						"expressao",
              						lv_expressao_2_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Expressao");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpAnd"


    // $ANTLR start "entryRuleExpOr"
    // InternalImperativa1.g:1357:1: entryRuleExpOr returns [EObject current=null] : iv_ruleExpOr= ruleExpOr EOF ;
    public final EObject entryRuleExpOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpOr = null;


        try {
            // InternalImperativa1.g:1357:46: (iv_ruleExpOr= ruleExpOr EOF )
            // InternalImperativa1.g:1358:2: iv_ruleExpOr= ruleExpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpOr=ruleExpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpOr"


    // $ANTLR start "ruleExpOr"
    // InternalImperativa1.g:1364:1: ruleExpOr returns [EObject current=null] : ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= 'or' ( (lv_expressao_2_0= ruleExpressao ) ) ) ;
    public final EObject ruleExpOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_valor_0_0 = null;

        EObject lv_expressao_2_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:1370:2: ( ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= 'or' ( (lv_expressao_2_0= ruleExpressao ) ) ) )
            // InternalImperativa1.g:1371:2: ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= 'or' ( (lv_expressao_2_0= ruleExpressao ) ) )
            {
            // InternalImperativa1.g:1371:2: ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= 'or' ( (lv_expressao_2_0= ruleExpressao ) ) )
            // InternalImperativa1.g:1372:3: ( (lv_valor_0_0= ruleValor ) ) otherlv_1= 'or' ( (lv_expressao_2_0= ruleExpressao ) )
            {
            // InternalImperativa1.g:1372:3: ( (lv_valor_0_0= ruleValor ) )
            // InternalImperativa1.g:1373:4: (lv_valor_0_0= ruleValor )
            {
            // InternalImperativa1.g:1373:4: (lv_valor_0_0= ruleValor )
            // InternalImperativa1.g:1374:5: lv_valor_0_0= ruleValor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpOrAccess().getValorValorParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_valor_0_0=ruleValor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpOrRule());
              					}
              					set(
              						current,
              						"valor",
              						lv_valor_0_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Valor");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExpOrAccess().getOrKeyword_1());
              		
            }
            // InternalImperativa1.g:1395:3: ( (lv_expressao_2_0= ruleExpressao ) )
            // InternalImperativa1.g:1396:4: (lv_expressao_2_0= ruleExpressao )
            {
            // InternalImperativa1.g:1396:4: (lv_expressao_2_0= ruleExpressao )
            // InternalImperativa1.g:1397:5: lv_expressao_2_0= ruleExpressao
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpOrAccess().getExpressaoExpressaoParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expressao_2_0=ruleExpressao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpOrRule());
              					}
              					set(
              						current,
              						"expressao",
              						lv_expressao_2_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Expressao");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpOr"


    // $ANTLR start "entryRuleExpEquals"
    // InternalImperativa1.g:1418:1: entryRuleExpEquals returns [EObject current=null] : iv_ruleExpEquals= ruleExpEquals EOF ;
    public final EObject entryRuleExpEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpEquals = null;


        try {
            // InternalImperativa1.g:1418:50: (iv_ruleExpEquals= ruleExpEquals EOF )
            // InternalImperativa1.g:1419:2: iv_ruleExpEquals= ruleExpEquals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpEqualsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpEquals=ruleExpEquals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpEquals; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpEquals"


    // $ANTLR start "ruleExpEquals"
    // InternalImperativa1.g:1425:1: ruleExpEquals returns [EObject current=null] : ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '==' ( (lv_expressao_2_0= ruleExpressao ) ) ) ;
    public final EObject ruleExpEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_valor_0_0 = null;

        EObject lv_expressao_2_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:1431:2: ( ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '==' ( (lv_expressao_2_0= ruleExpressao ) ) ) )
            // InternalImperativa1.g:1432:2: ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '==' ( (lv_expressao_2_0= ruleExpressao ) ) )
            {
            // InternalImperativa1.g:1432:2: ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '==' ( (lv_expressao_2_0= ruleExpressao ) ) )
            // InternalImperativa1.g:1433:3: ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '==' ( (lv_expressao_2_0= ruleExpressao ) )
            {
            // InternalImperativa1.g:1433:3: ( (lv_valor_0_0= ruleValor ) )
            // InternalImperativa1.g:1434:4: (lv_valor_0_0= ruleValor )
            {
            // InternalImperativa1.g:1434:4: (lv_valor_0_0= ruleValor )
            // InternalImperativa1.g:1435:5: lv_valor_0_0= ruleValor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpEqualsAccess().getValorValorParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_valor_0_0=ruleValor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpEqualsRule());
              					}
              					set(
              						current,
              						"valor",
              						lv_valor_0_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Valor");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExpEqualsAccess().getEqualsSignEqualsSignKeyword_1());
              		
            }
            // InternalImperativa1.g:1456:3: ( (lv_expressao_2_0= ruleExpressao ) )
            // InternalImperativa1.g:1457:4: (lv_expressao_2_0= ruleExpressao )
            {
            // InternalImperativa1.g:1457:4: (lv_expressao_2_0= ruleExpressao )
            // InternalImperativa1.g:1458:5: lv_expressao_2_0= ruleExpressao
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpEqualsAccess().getExpressaoExpressaoParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expressao_2_0=ruleExpressao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpEqualsRule());
              					}
              					set(
              						current,
              						"expressao",
              						lv_expressao_2_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Expressao");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpEquals"


    // $ANTLR start "entryRuleExpConcat"
    // InternalImperativa1.g:1479:1: entryRuleExpConcat returns [EObject current=null] : iv_ruleExpConcat= ruleExpConcat EOF ;
    public final EObject entryRuleExpConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpConcat = null;


        try {
            // InternalImperativa1.g:1479:50: (iv_ruleExpConcat= ruleExpConcat EOF )
            // InternalImperativa1.g:1480:2: iv_ruleExpConcat= ruleExpConcat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpConcatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpConcat=ruleExpConcat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpConcat; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpConcat"


    // $ANTLR start "ruleExpConcat"
    // InternalImperativa1.g:1486:1: ruleExpConcat returns [EObject current=null] : ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '++' ( (lv_expressao_2_0= ruleExpressao ) ) ) ;
    public final EObject ruleExpConcat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_valor_0_0 = null;

        EObject lv_expressao_2_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:1492:2: ( ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '++' ( (lv_expressao_2_0= ruleExpressao ) ) ) )
            // InternalImperativa1.g:1493:2: ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '++' ( (lv_expressao_2_0= ruleExpressao ) ) )
            {
            // InternalImperativa1.g:1493:2: ( ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '++' ( (lv_expressao_2_0= ruleExpressao ) ) )
            // InternalImperativa1.g:1494:3: ( (lv_valor_0_0= ruleValor ) ) otherlv_1= '++' ( (lv_expressao_2_0= ruleExpressao ) )
            {
            // InternalImperativa1.g:1494:3: ( (lv_valor_0_0= ruleValor ) )
            // InternalImperativa1.g:1495:4: (lv_valor_0_0= ruleValor )
            {
            // InternalImperativa1.g:1495:4: (lv_valor_0_0= ruleValor )
            // InternalImperativa1.g:1496:5: lv_valor_0_0= ruleValor
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpConcatAccess().getValorValorParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_valor_0_0=ruleValor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpConcatRule());
              					}
              					set(
              						current,
              						"valor",
              						lv_valor_0_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Valor");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExpConcatAccess().getPlusSignPlusSignKeyword_1());
              		
            }
            // InternalImperativa1.g:1517:3: ( (lv_expressao_2_0= ruleExpressao ) )
            // InternalImperativa1.g:1518:4: (lv_expressao_2_0= ruleExpressao )
            {
            // InternalImperativa1.g:1518:4: (lv_expressao_2_0= ruleExpressao )
            // InternalImperativa1.g:1519:5: lv_expressao_2_0= ruleExpressao
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpConcatAccess().getExpressaoExpressaoParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expressao_2_0=ruleExpressao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpConcatRule());
              					}
              					set(
              						current,
              						"expressao",
              						lv_expressao_2_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Expressao");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpConcat"


    // $ANTLR start "entryRuleExpressao"
    // InternalImperativa1.g:1540:1: entryRuleExpressao returns [EObject current=null] : iv_ruleExpressao= ruleExpressao EOF ;
    public final EObject entryRuleExpressao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressao = null;


        try {
            // InternalImperativa1.g:1540:50: (iv_ruleExpressao= ruleExpressao EOF )
            // InternalImperativa1.g:1541:2: iv_ruleExpressao= ruleExpressao EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressaoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressao=ruleExpressao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressao; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressao"


    // $ANTLR start "ruleExpressao"
    // InternalImperativa1.g:1547:1: ruleExpressao returns [EObject current=null] : ( ( ( ( ruleExpUnaria ) )=> (lv_expUnaria_0_0= ruleExpUnaria ) ) | ( (lv_expPrimaria_1_0= ruleExpPrimaria ) ) | ( (lv_expBinaria_2_0= ruleExpBinaria ) ) ) ;
    public final EObject ruleExpressao() throws RecognitionException {
        EObject current = null;

        EObject lv_expUnaria_0_0 = null;

        EObject lv_expPrimaria_1_0 = null;

        EObject lv_expBinaria_2_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:1553:2: ( ( ( ( ( ruleExpUnaria ) )=> (lv_expUnaria_0_0= ruleExpUnaria ) ) | ( (lv_expPrimaria_1_0= ruleExpPrimaria ) ) | ( (lv_expBinaria_2_0= ruleExpBinaria ) ) ) )
            // InternalImperativa1.g:1554:2: ( ( ( ( ruleExpUnaria ) )=> (lv_expUnaria_0_0= ruleExpUnaria ) ) | ( (lv_expPrimaria_1_0= ruleExpPrimaria ) ) | ( (lv_expBinaria_2_0= ruleExpBinaria ) ) )
            {
            // InternalImperativa1.g:1554:2: ( ( ( ( ruleExpUnaria ) )=> (lv_expUnaria_0_0= ruleExpUnaria ) ) | ( (lv_expPrimaria_1_0= ruleExpPrimaria ) ) | ( (lv_expBinaria_2_0= ruleExpBinaria ) ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) && (synpred2_InternalImperativa1())) {
                alt9=1;
            }
            else if ( (LA9_0==27) && (synpred2_InternalImperativa1())) {
                alt9=1;
            }
            else if ( (LA9_0==28) && (synpred2_InternalImperativa1())) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_VALORSTRING) ) {
                int LA9_4 = input.LA(2);

                if ( (LA9_4==EOF||(LA9_4>=RULE_VALORSTRING && LA9_4<=RULE_VALORINTEIRO)||(LA9_4>=14 && LA9_4<=24)||(LA9_4>=34 && LA9_4<=36)) ) {
                    alt9=2;
                }
                else if ( (LA9_4==26||(LA9_4>=29 && LA9_4<=33)) ) {
                    alt9=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==RULE_VALORINTEIRO) ) {
                int LA9_5 = input.LA(2);

                if ( (LA9_5==26||(LA9_5>=29 && LA9_5<=33)) ) {
                    alt9=3;
                }
                else if ( (LA9_5==EOF||LA9_5==RULE_VALORSTRING||(LA9_5>=14 && LA9_5<=24)||(LA9_5>=34 && LA9_5<=36)) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 5, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==RULE_VALORBOOLEANO) ) {
                int LA9_6 = input.LA(2);

                if ( (LA9_6==26||(LA9_6>=29 && LA9_6<=33)) ) {
                    alt9=3;
                }
                else if ( (LA9_6==EOF||LA9_6==RULE_VALORSTRING||(LA9_6>=14 && LA9_6<=24)||(LA9_6>=34 && LA9_6<=36)) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 6, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==16) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalImperativa1.g:1555:3: ( ( ( ruleExpUnaria ) )=> (lv_expUnaria_0_0= ruleExpUnaria ) )
                    {
                    // InternalImperativa1.g:1555:3: ( ( ( ruleExpUnaria ) )=> (lv_expUnaria_0_0= ruleExpUnaria ) )
                    // InternalImperativa1.g:1556:4: ( ( ruleExpUnaria ) )=> (lv_expUnaria_0_0= ruleExpUnaria )
                    {
                    // InternalImperativa1.g:1560:4: (lv_expUnaria_0_0= ruleExpUnaria )
                    // InternalImperativa1.g:1561:5: lv_expUnaria_0_0= ruleExpUnaria
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressaoAccess().getExpUnariaExpUnariaParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expUnaria_0_0=ruleExpUnaria();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressaoRule());
                      					}
                      					set(
                      						current,
                      						"expUnaria",
                      						lv_expUnaria_0_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.ExpUnaria");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:1579:3: ( (lv_expPrimaria_1_0= ruleExpPrimaria ) )
                    {
                    // InternalImperativa1.g:1579:3: ( (lv_expPrimaria_1_0= ruleExpPrimaria ) )
                    // InternalImperativa1.g:1580:4: (lv_expPrimaria_1_0= ruleExpPrimaria )
                    {
                    // InternalImperativa1.g:1580:4: (lv_expPrimaria_1_0= ruleExpPrimaria )
                    // InternalImperativa1.g:1581:5: lv_expPrimaria_1_0= ruleExpPrimaria
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressaoAccess().getExpPrimariaExpPrimariaParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expPrimaria_1_0=ruleExpPrimaria();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressaoRule());
                      					}
                      					set(
                      						current,
                      						"expPrimaria",
                      						lv_expPrimaria_1_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.ExpPrimaria");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalImperativa1.g:1599:3: ( (lv_expBinaria_2_0= ruleExpBinaria ) )
                    {
                    // InternalImperativa1.g:1599:3: ( (lv_expBinaria_2_0= ruleExpBinaria ) )
                    // InternalImperativa1.g:1600:4: (lv_expBinaria_2_0= ruleExpBinaria )
                    {
                    // InternalImperativa1.g:1600:4: (lv_expBinaria_2_0= ruleExpBinaria )
                    // InternalImperativa1.g:1601:5: lv_expBinaria_2_0= ruleExpBinaria
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressaoAccess().getExpBinariaExpBinariaParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_expBinaria_2_0=ruleExpBinaria();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressaoRule());
                      					}
                      					set(
                      						current,
                      						"expBinaria",
                      						lv_expBinaria_2_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.ExpBinaria");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressao"


    // $ANTLR start "entryRuleComandoSimples"
    // InternalImperativa1.g:1622:1: entryRuleComandoSimples returns [EObject current=null] : iv_ruleComandoSimples= ruleComandoSimples EOF ;
    public final EObject entryRuleComandoSimples() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoSimples = null;


        try {
            // InternalImperativa1.g:1622:55: (iv_ruleComandoSimples= ruleComandoSimples EOF )
            // InternalImperativa1.g:1623:2: iv_ruleComandoSimples= ruleComandoSimples EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComandoSimplesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComandoSimples=ruleComandoSimples();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComandoSimples; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComandoSimples"


    // $ANTLR start "ruleComandoSimples"
    // InternalImperativa1.g:1629:1: ruleComandoSimples returns [EObject current=null] : ( ( (lv_skip_0_0= ruleSkip ) ) | ( (lv_atribuicao_1_0= ruleAtribuicao ) ) | ( (lv_comandoDeclaracao_2_0= ruleComandoDeclaracao ) ) | ( (lv_while_3_0= ruleWhile ) ) | ( (lv_ifThenElse_4_0= ruleIfThenElse ) ) | ( (lv_io_5_0= ruleIO ) ) | (otherlv_6= '(' ( (lv_comando_7_0= ruleComando ) ) otherlv_8= ')' ) ) ;
    public final EObject ruleComandoSimples() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_skip_0_0 = null;

        EObject lv_atribuicao_1_0 = null;

        EObject lv_comandoDeclaracao_2_0 = null;

        EObject lv_while_3_0 = null;

        EObject lv_ifThenElse_4_0 = null;

        EObject lv_io_5_0 = null;

        EObject lv_comando_7_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:1635:2: ( ( ( (lv_skip_0_0= ruleSkip ) ) | ( (lv_atribuicao_1_0= ruleAtribuicao ) ) | ( (lv_comandoDeclaracao_2_0= ruleComandoDeclaracao ) ) | ( (lv_while_3_0= ruleWhile ) ) | ( (lv_ifThenElse_4_0= ruleIfThenElse ) ) | ( (lv_io_5_0= ruleIO ) ) | (otherlv_6= '(' ( (lv_comando_7_0= ruleComando ) ) otherlv_8= ')' ) ) )
            // InternalImperativa1.g:1636:2: ( ( (lv_skip_0_0= ruleSkip ) ) | ( (lv_atribuicao_1_0= ruleAtribuicao ) ) | ( (lv_comandoDeclaracao_2_0= ruleComandoDeclaracao ) ) | ( (lv_while_3_0= ruleWhile ) ) | ( (lv_ifThenElse_4_0= ruleIfThenElse ) ) | ( (lv_io_5_0= ruleIO ) ) | (otherlv_6= '(' ( (lv_comando_7_0= ruleComando ) ) otherlv_8= ')' ) )
            {
            // InternalImperativa1.g:1636:2: ( ( (lv_skip_0_0= ruleSkip ) ) | ( (lv_atribuicao_1_0= ruleAtribuicao ) ) | ( (lv_comandoDeclaracao_2_0= ruleComandoDeclaracao ) ) | ( (lv_while_3_0= ruleWhile ) ) | ( (lv_ifThenElse_4_0= ruleIfThenElse ) ) | ( (lv_io_5_0= ruleIO ) ) | (otherlv_6= '(' ( (lv_comando_7_0= ruleComando ) ) otherlv_8= ')' ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt10=1;
                }
                break;
            case RULE_VALORSTRING:
                {
                alt10=2;
                }
                break;
            case 34:
                {
                alt10=3;
                }
                break;
            case 22:
                {
                alt10=4;
                }
                break;
            case 19:
                {
                alt10=5;
                }
                break;
            case 15:
            case 18:
                {
                alt10=6;
                }
                break;
            case 16:
                {
                alt10=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalImperativa1.g:1637:3: ( (lv_skip_0_0= ruleSkip ) )
                    {
                    // InternalImperativa1.g:1637:3: ( (lv_skip_0_0= ruleSkip ) )
                    // InternalImperativa1.g:1638:4: (lv_skip_0_0= ruleSkip )
                    {
                    // InternalImperativa1.g:1638:4: (lv_skip_0_0= ruleSkip )
                    // InternalImperativa1.g:1639:5: lv_skip_0_0= ruleSkip
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComandoSimplesAccess().getSkipSkipParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_skip_0_0=ruleSkip();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getComandoSimplesRule());
                      					}
                      					set(
                      						current,
                      						"skip",
                      						lv_skip_0_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.Skip");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:1657:3: ( (lv_atribuicao_1_0= ruleAtribuicao ) )
                    {
                    // InternalImperativa1.g:1657:3: ( (lv_atribuicao_1_0= ruleAtribuicao ) )
                    // InternalImperativa1.g:1658:4: (lv_atribuicao_1_0= ruleAtribuicao )
                    {
                    // InternalImperativa1.g:1658:4: (lv_atribuicao_1_0= ruleAtribuicao )
                    // InternalImperativa1.g:1659:5: lv_atribuicao_1_0= ruleAtribuicao
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComandoSimplesAccess().getAtribuicaoAtribuicaoParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_atribuicao_1_0=ruleAtribuicao();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getComandoSimplesRule());
                      					}
                      					set(
                      						current,
                      						"atribuicao",
                      						lv_atribuicao_1_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.Atribuicao");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalImperativa1.g:1677:3: ( (lv_comandoDeclaracao_2_0= ruleComandoDeclaracao ) )
                    {
                    // InternalImperativa1.g:1677:3: ( (lv_comandoDeclaracao_2_0= ruleComandoDeclaracao ) )
                    // InternalImperativa1.g:1678:4: (lv_comandoDeclaracao_2_0= ruleComandoDeclaracao )
                    {
                    // InternalImperativa1.g:1678:4: (lv_comandoDeclaracao_2_0= ruleComandoDeclaracao )
                    // InternalImperativa1.g:1679:5: lv_comandoDeclaracao_2_0= ruleComandoDeclaracao
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComandoSimplesAccess().getComandoDeclaracaoComandoDeclaracaoParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_comandoDeclaracao_2_0=ruleComandoDeclaracao();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getComandoSimplesRule());
                      					}
                      					set(
                      						current,
                      						"comandoDeclaracao",
                      						lv_comandoDeclaracao_2_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.ComandoDeclaracao");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalImperativa1.g:1697:3: ( (lv_while_3_0= ruleWhile ) )
                    {
                    // InternalImperativa1.g:1697:3: ( (lv_while_3_0= ruleWhile ) )
                    // InternalImperativa1.g:1698:4: (lv_while_3_0= ruleWhile )
                    {
                    // InternalImperativa1.g:1698:4: (lv_while_3_0= ruleWhile )
                    // InternalImperativa1.g:1699:5: lv_while_3_0= ruleWhile
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComandoSimplesAccess().getWhileWhileParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_while_3_0=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getComandoSimplesRule());
                      					}
                      					set(
                      						current,
                      						"while",
                      						lv_while_3_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.While");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalImperativa1.g:1717:3: ( (lv_ifThenElse_4_0= ruleIfThenElse ) )
                    {
                    // InternalImperativa1.g:1717:3: ( (lv_ifThenElse_4_0= ruleIfThenElse ) )
                    // InternalImperativa1.g:1718:4: (lv_ifThenElse_4_0= ruleIfThenElse )
                    {
                    // InternalImperativa1.g:1718:4: (lv_ifThenElse_4_0= ruleIfThenElse )
                    // InternalImperativa1.g:1719:5: lv_ifThenElse_4_0= ruleIfThenElse
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComandoSimplesAccess().getIfThenElseIfThenElseParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ifThenElse_4_0=ruleIfThenElse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getComandoSimplesRule());
                      					}
                      					set(
                      						current,
                      						"ifThenElse",
                      						lv_ifThenElse_4_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.IfThenElse");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalImperativa1.g:1737:3: ( (lv_io_5_0= ruleIO ) )
                    {
                    // InternalImperativa1.g:1737:3: ( (lv_io_5_0= ruleIO ) )
                    // InternalImperativa1.g:1738:4: (lv_io_5_0= ruleIO )
                    {
                    // InternalImperativa1.g:1738:4: (lv_io_5_0= ruleIO )
                    // InternalImperativa1.g:1739:5: lv_io_5_0= ruleIO
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getComandoSimplesAccess().getIoIOParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_io_5_0=ruleIO();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getComandoSimplesRule());
                      					}
                      					set(
                      						current,
                      						"io",
                      						lv_io_5_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.IO");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalImperativa1.g:1757:3: (otherlv_6= '(' ( (lv_comando_7_0= ruleComando ) ) otherlv_8= ')' )
                    {
                    // InternalImperativa1.g:1757:3: (otherlv_6= '(' ( (lv_comando_7_0= ruleComando ) ) otherlv_8= ')' )
                    // InternalImperativa1.g:1758:4: otherlv_6= '(' ( (lv_comando_7_0= ruleComando ) ) otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getComandoSimplesAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    // InternalImperativa1.g:1762:4: ( (lv_comando_7_0= ruleComando ) )
                    // InternalImperativa1.g:1763:5: (lv_comando_7_0= ruleComando )
                    {
                    // InternalImperativa1.g:1763:5: (lv_comando_7_0= ruleComando )
                    // InternalImperativa1.g:1764:6: lv_comando_7_0= ruleComando
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComandoSimplesAccess().getComandoComandoParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_comando_7_0=ruleComando();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComandoSimplesRule());
                      						}
                      						set(
                      							current,
                      							"comando",
                      							lv_comando_7_0,
                      							"br.ufpe.cin.plp.imperativa1.Imperativa1.Comando");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getComandoSimplesAccess().getRightParenthesisKeyword_6_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComandoSimples"


    // $ANTLR start "entryRuleComandoDeclaracao"
    // InternalImperativa1.g:1790:1: entryRuleComandoDeclaracao returns [EObject current=null] : iv_ruleComandoDeclaracao= ruleComandoDeclaracao EOF ;
    public final EObject entryRuleComandoDeclaracao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoDeclaracao = null;


        try {
            // InternalImperativa1.g:1790:58: (iv_ruleComandoDeclaracao= ruleComandoDeclaracao EOF )
            // InternalImperativa1.g:1791:2: iv_ruleComandoDeclaracao= ruleComandoDeclaracao EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComandoDeclaracaoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComandoDeclaracao=ruleComandoDeclaracao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComandoDeclaracao; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComandoDeclaracao"


    // $ANTLR start "ruleComandoDeclaracao"
    // InternalImperativa1.g:1797:1: ruleComandoDeclaracao returns [EObject current=null] : (otherlv_0= '{' ( (lv_declaracao_1_0= ruleDeclaracao ) ) otherlv_2= ';' ( (lv_comando_3_0= ruleComando ) ) otherlv_4= '}' ) ;
    public final EObject ruleComandoDeclaracao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_declaracao_1_0 = null;

        EObject lv_comando_3_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:1803:2: ( (otherlv_0= '{' ( (lv_declaracao_1_0= ruleDeclaracao ) ) otherlv_2= ';' ( (lv_comando_3_0= ruleComando ) ) otherlv_4= '}' ) )
            // InternalImperativa1.g:1804:2: (otherlv_0= '{' ( (lv_declaracao_1_0= ruleDeclaracao ) ) otherlv_2= ';' ( (lv_comando_3_0= ruleComando ) ) otherlv_4= '}' )
            {
            // InternalImperativa1.g:1804:2: (otherlv_0= '{' ( (lv_declaracao_1_0= ruleDeclaracao ) ) otherlv_2= ';' ( (lv_comando_3_0= ruleComando ) ) otherlv_4= '}' )
            // InternalImperativa1.g:1805:3: otherlv_0= '{' ( (lv_declaracao_1_0= ruleDeclaracao ) ) otherlv_2= ';' ( (lv_comando_3_0= ruleComando ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComandoDeclaracaoAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalImperativa1.g:1809:3: ( (lv_declaracao_1_0= ruleDeclaracao ) )
            // InternalImperativa1.g:1810:4: (lv_declaracao_1_0= ruleDeclaracao )
            {
            // InternalImperativa1.g:1810:4: (lv_declaracao_1_0= ruleDeclaracao )
            // InternalImperativa1.g:1811:5: lv_declaracao_1_0= ruleDeclaracao
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComandoDeclaracaoAccess().getDeclaracaoDeclaracaoParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_declaracao_1_0=ruleDeclaracao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComandoDeclaracaoRule());
              					}
              					set(
              						current,
              						"declaracao",
              						lv_declaracao_1_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Declaracao");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getComandoDeclaracaoAccess().getSemicolonKeyword_2());
              		
            }
            // InternalImperativa1.g:1832:3: ( (lv_comando_3_0= ruleComando ) )
            // InternalImperativa1.g:1833:4: (lv_comando_3_0= ruleComando )
            {
            // InternalImperativa1.g:1833:4: (lv_comando_3_0= ruleComando )
            // InternalImperativa1.g:1834:5: lv_comando_3_0= ruleComando
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComandoDeclaracaoAccess().getComandoComandoParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_comando_3_0=ruleComando();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComandoDeclaracaoRule());
              					}
              					set(
              						current,
              						"comando",
              						lv_comando_3_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Comando");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getComandoDeclaracaoAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComandoDeclaracao"


    // $ANTLR start "entryRuleDeclaracao"
    // InternalImperativa1.g:1859:1: entryRuleDeclaracao returns [EObject current=null] : iv_ruleDeclaracao= ruleDeclaracao EOF ;
    public final EObject entryRuleDeclaracao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracao = null;


        try {
            // InternalImperativa1.g:1859:51: (iv_ruleDeclaracao= ruleDeclaracao EOF )
            // InternalImperativa1.g:1860:2: iv_ruleDeclaracao= ruleDeclaracao EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaracaoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaracao=ruleDeclaracao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaracao; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaracao"


    // $ANTLR start "ruleDeclaracao"
    // InternalImperativa1.g:1866:1: ruleDeclaracao returns [EObject current=null] : ( ( ( ( ruleDeclaracaoComposta ) )=> (lv_decComposta_0_0= ruleDeclaracaoComposta ) ) | ( (lv_decVariavel_1_0= ruleDeclaracaoVariavel ) ) | (otherlv_2= '(' ( (lv_declaracao_3_0= ruleDeclaracao ) ) otherlv_4= ')' ) ) ;
    public final EObject ruleDeclaracao() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_decComposta_0_0 = null;

        EObject lv_decVariavel_1_0 = null;

        EObject lv_declaracao_3_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:1872:2: ( ( ( ( ( ruleDeclaracaoComposta ) )=> (lv_decComposta_0_0= ruleDeclaracaoComposta ) ) | ( (lv_decVariavel_1_0= ruleDeclaracaoVariavel ) ) | (otherlv_2= '(' ( (lv_declaracao_3_0= ruleDeclaracao ) ) otherlv_4= ')' ) ) )
            // InternalImperativa1.g:1873:2: ( ( ( ( ruleDeclaracaoComposta ) )=> (lv_decComposta_0_0= ruleDeclaracaoComposta ) ) | ( (lv_decVariavel_1_0= ruleDeclaracaoVariavel ) ) | (otherlv_2= '(' ( (lv_declaracao_3_0= ruleDeclaracao ) ) otherlv_4= ')' ) )
            {
            // InternalImperativa1.g:1873:2: ( ( ( ( ruleDeclaracaoComposta ) )=> (lv_decComposta_0_0= ruleDeclaracaoComposta ) ) | ( (lv_decVariavel_1_0= ruleDeclaracaoVariavel ) ) | (otherlv_2= '(' ( (lv_declaracao_3_0= ruleDeclaracao ) ) otherlv_4= ')' ) )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==37) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred3_InternalImperativa1()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==16) ) {
                alt11=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalImperativa1.g:1874:3: ( ( ( ruleDeclaracaoComposta ) )=> (lv_decComposta_0_0= ruleDeclaracaoComposta ) )
                    {
                    // InternalImperativa1.g:1874:3: ( ( ( ruleDeclaracaoComposta ) )=> (lv_decComposta_0_0= ruleDeclaracaoComposta ) )
                    // InternalImperativa1.g:1875:4: ( ( ruleDeclaracaoComposta ) )=> (lv_decComposta_0_0= ruleDeclaracaoComposta )
                    {
                    // InternalImperativa1.g:1879:4: (lv_decComposta_0_0= ruleDeclaracaoComposta )
                    // InternalImperativa1.g:1880:5: lv_decComposta_0_0= ruleDeclaracaoComposta
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDeclaracaoAccess().getDecCompostaDeclaracaoCompostaParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_decComposta_0_0=ruleDeclaracaoComposta();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDeclaracaoRule());
                      					}
                      					set(
                      						current,
                      						"decComposta",
                      						lv_decComposta_0_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.DeclaracaoComposta");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:1898:3: ( (lv_decVariavel_1_0= ruleDeclaracaoVariavel ) )
                    {
                    // InternalImperativa1.g:1898:3: ( (lv_decVariavel_1_0= ruleDeclaracaoVariavel ) )
                    // InternalImperativa1.g:1899:4: (lv_decVariavel_1_0= ruleDeclaracaoVariavel )
                    {
                    // InternalImperativa1.g:1899:4: (lv_decVariavel_1_0= ruleDeclaracaoVariavel )
                    // InternalImperativa1.g:1900:5: lv_decVariavel_1_0= ruleDeclaracaoVariavel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDeclaracaoAccess().getDecVariavelDeclaracaoVariavelParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_decVariavel_1_0=ruleDeclaracaoVariavel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDeclaracaoRule());
                      					}
                      					set(
                      						current,
                      						"decVariavel",
                      						lv_decVariavel_1_0,
                      						"br.ufpe.cin.plp.imperativa1.Imperativa1.DeclaracaoVariavel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalImperativa1.g:1918:3: (otherlv_2= '(' ( (lv_declaracao_3_0= ruleDeclaracao ) ) otherlv_4= ')' )
                    {
                    // InternalImperativa1.g:1918:3: (otherlv_2= '(' ( (lv_declaracao_3_0= ruleDeclaracao ) ) otherlv_4= ')' )
                    // InternalImperativa1.g:1919:4: otherlv_2= '(' ( (lv_declaracao_3_0= ruleDeclaracao ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getDeclaracaoAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalImperativa1.g:1923:4: ( (lv_declaracao_3_0= ruleDeclaracao ) )
                    // InternalImperativa1.g:1924:5: (lv_declaracao_3_0= ruleDeclaracao )
                    {
                    // InternalImperativa1.g:1924:5: (lv_declaracao_3_0= ruleDeclaracao )
                    // InternalImperativa1.g:1925:6: lv_declaracao_3_0= ruleDeclaracao
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDeclaracaoAccess().getDeclaracaoDeclaracaoParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_declaracao_3_0=ruleDeclaracao();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDeclaracaoRule());
                      						}
                      						set(
                      							current,
                      							"declaracao",
                      							lv_declaracao_3_0,
                      							"br.ufpe.cin.plp.imperativa1.Imperativa1.Declaracao");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getDeclaracaoAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaracao"


    // $ANTLR start "entryRuleDeclaracaoComposta"
    // InternalImperativa1.g:1951:1: entryRuleDeclaracaoComposta returns [EObject current=null] : iv_ruleDeclaracaoComposta= ruleDeclaracaoComposta EOF ;
    public final EObject entryRuleDeclaracaoComposta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracaoComposta = null;


        try {
            // InternalImperativa1.g:1951:59: (iv_ruleDeclaracaoComposta= ruleDeclaracaoComposta EOF )
            // InternalImperativa1.g:1952:2: iv_ruleDeclaracaoComposta= ruleDeclaracaoComposta EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaracaoCompostaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaracaoComposta=ruleDeclaracaoComposta();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaracaoComposta; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaracaoComposta"


    // $ANTLR start "ruleDeclaracaoComposta"
    // InternalImperativa1.g:1958:1: ruleDeclaracaoComposta returns [EObject current=null] : ( ( (lv_decVariavel_0_0= ruleDeclaracaoVariavel ) ) otherlv_1= ',' ( (lv_declaracao_2_0= ruleDeclaracao ) ) ) ;
    public final EObject ruleDeclaracaoComposta() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_decVariavel_0_0 = null;

        EObject lv_declaracao_2_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:1964:2: ( ( ( (lv_decVariavel_0_0= ruleDeclaracaoVariavel ) ) otherlv_1= ',' ( (lv_declaracao_2_0= ruleDeclaracao ) ) ) )
            // InternalImperativa1.g:1965:2: ( ( (lv_decVariavel_0_0= ruleDeclaracaoVariavel ) ) otherlv_1= ',' ( (lv_declaracao_2_0= ruleDeclaracao ) ) )
            {
            // InternalImperativa1.g:1965:2: ( ( (lv_decVariavel_0_0= ruleDeclaracaoVariavel ) ) otherlv_1= ',' ( (lv_declaracao_2_0= ruleDeclaracao ) ) )
            // InternalImperativa1.g:1966:3: ( (lv_decVariavel_0_0= ruleDeclaracaoVariavel ) ) otherlv_1= ',' ( (lv_declaracao_2_0= ruleDeclaracao ) )
            {
            // InternalImperativa1.g:1966:3: ( (lv_decVariavel_0_0= ruleDeclaracaoVariavel ) )
            // InternalImperativa1.g:1967:4: (lv_decVariavel_0_0= ruleDeclaracaoVariavel )
            {
            // InternalImperativa1.g:1967:4: (lv_decVariavel_0_0= ruleDeclaracaoVariavel )
            // InternalImperativa1.g:1968:5: lv_decVariavel_0_0= ruleDeclaracaoVariavel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeclaracaoCompostaAccess().getDecVariavelDeclaracaoVariavelParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_decVariavel_0_0=ruleDeclaracaoVariavel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDeclaracaoCompostaRule());
              					}
              					set(
              						current,
              						"decVariavel",
              						lv_decVariavel_0_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.DeclaracaoVariavel");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDeclaracaoCompostaAccess().getCommaKeyword_1());
              		
            }
            // InternalImperativa1.g:1989:3: ( (lv_declaracao_2_0= ruleDeclaracao ) )
            // InternalImperativa1.g:1990:4: (lv_declaracao_2_0= ruleDeclaracao )
            {
            // InternalImperativa1.g:1990:4: (lv_declaracao_2_0= ruleDeclaracao )
            // InternalImperativa1.g:1991:5: lv_declaracao_2_0= ruleDeclaracao
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeclaracaoCompostaAccess().getDeclaracaoDeclaracaoParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_declaracao_2_0=ruleDeclaracao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDeclaracaoCompostaRule());
              					}
              					set(
              						current,
              						"declaracao",
              						lv_declaracao_2_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Declaracao");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaracaoComposta"


    // $ANTLR start "entryRuleDeclaracaoVariavel"
    // InternalImperativa1.g:2012:1: entryRuleDeclaracaoVariavel returns [EObject current=null] : iv_ruleDeclaracaoVariavel= ruleDeclaracaoVariavel EOF ;
    public final EObject entryRuleDeclaracaoVariavel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracaoVariavel = null;


        try {
            // InternalImperativa1.g:2012:59: (iv_ruleDeclaracaoVariavel= ruleDeclaracaoVariavel EOF )
            // InternalImperativa1.g:2013:2: iv_ruleDeclaracaoVariavel= ruleDeclaracaoVariavel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaracaoVariavelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaracaoVariavel=ruleDeclaracaoVariavel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaracaoVariavel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaracaoVariavel"


    // $ANTLR start "ruleDeclaracaoVariavel"
    // InternalImperativa1.g:2019:1: ruleDeclaracaoVariavel returns [EObject current=null] : (otherlv_0= 'var' ( (lv_pid_1_0= rulePId ) ) otherlv_2= '=' ( (lv_expressao_3_0= ruleExpressao ) ) ) ;
    public final EObject ruleDeclaracaoVariavel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_pid_1_0 = null;

        EObject lv_expressao_3_0 = null;



        	enterRule();

        try {
            // InternalImperativa1.g:2025:2: ( (otherlv_0= 'var' ( (lv_pid_1_0= rulePId ) ) otherlv_2= '=' ( (lv_expressao_3_0= ruleExpressao ) ) ) )
            // InternalImperativa1.g:2026:2: (otherlv_0= 'var' ( (lv_pid_1_0= rulePId ) ) otherlv_2= '=' ( (lv_expressao_3_0= ruleExpressao ) ) )
            {
            // InternalImperativa1.g:2026:2: (otherlv_0= 'var' ( (lv_pid_1_0= rulePId ) ) otherlv_2= '=' ( (lv_expressao_3_0= ruleExpressao ) ) )
            // InternalImperativa1.g:2027:3: otherlv_0= 'var' ( (lv_pid_1_0= rulePId ) ) otherlv_2= '=' ( (lv_expressao_3_0= ruleExpressao ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDeclaracaoVariavelAccess().getVarKeyword_0());
              		
            }
            // InternalImperativa1.g:2031:3: ( (lv_pid_1_0= rulePId ) )
            // InternalImperativa1.g:2032:4: (lv_pid_1_0= rulePId )
            {
            // InternalImperativa1.g:2032:4: (lv_pid_1_0= rulePId )
            // InternalImperativa1.g:2033:5: lv_pid_1_0= rulePId
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeclaracaoVariavelAccess().getPidPIdParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_pid_1_0=rulePId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDeclaracaoVariavelRule());
              					}
              					set(
              						current,
              						"pid",
              						lv_pid_1_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.PId");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDeclaracaoVariavelAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalImperativa1.g:2054:3: ( (lv_expressao_3_0= ruleExpressao ) )
            // InternalImperativa1.g:2055:4: (lv_expressao_3_0= ruleExpressao )
            {
            // InternalImperativa1.g:2055:4: (lv_expressao_3_0= ruleExpressao )
            // InternalImperativa1.g:2056:5: lv_expressao_3_0= ruleExpressao
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeclaracaoVariavelAccess().getExpressaoExpressaoParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expressao_3_0=ruleExpressao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDeclaracaoVariavelRule());
              					}
              					set(
              						current,
              						"expressao",
              						lv_expressao_3_0,
              						"br.ufpe.cin.plp.imperativa1.Imperativa1.Expressao");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaracaoVariavel"

    // $ANTLR start synpred1_InternalImperativa1
    public final void synpred1_InternalImperativa1_fragment() throws RecognitionException {   
        // InternalImperativa1.g:116:4: ( ( ruleSequenciaComando ) )
        // InternalImperativa1.g:116:5: ( ruleSequenciaComando )
        {
        // InternalImperativa1.g:116:5: ( ruleSequenciaComando )
        // InternalImperativa1.g:117:5: ruleSequenciaComando
        {
        pushFollow(FOLLOW_2);
        ruleSequenciaComando();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalImperativa1

    // $ANTLR start synpred2_InternalImperativa1
    public final void synpred2_InternalImperativa1_fragment() throws RecognitionException {   
        // InternalImperativa1.g:1556:4: ( ( ruleExpUnaria ) )
        // InternalImperativa1.g:1556:5: ( ruleExpUnaria )
        {
        // InternalImperativa1.g:1556:5: ( ruleExpUnaria )
        // InternalImperativa1.g:1557:5: ruleExpUnaria
        {
        pushFollow(FOLLOW_2);
        ruleExpUnaria();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalImperativa1

    // $ANTLR start synpred3_InternalImperativa1
    public final void synpred3_InternalImperativa1_fragment() throws RecognitionException {   
        // InternalImperativa1.g:1875:4: ( ( ruleDeclaracaoComposta ) )
        // InternalImperativa1.g:1875:5: ( ruleDeclaracaoComposta )
        {
        // InternalImperativa1.g:1875:5: ( ruleDeclaracaoComposta )
        // InternalImperativa1.g:1876:5: ruleDeclaracaoComposta
        {
        pushFollow(FOLLOW_2);
        ruleDeclaracaoComposta();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalImperativa1

    // Delegated rules

    public final boolean synpred1_InternalImperativa1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalImperativa1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalImperativa1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalImperativa1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalImperativa1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalImperativa1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\10\0\2\uffff";
    static final String dfa_3s = "\1\42\10\0\2\uffff";
    static final String dfa_4s = "\11\uffff\1\1\1\2";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\12\uffff\1\6\1\10\1\uffff\1\7\1\5\2\uffff\1\4\1\uffff\1\1\11\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "114:2: ( ( ( ( ruleSequenciaComando ) )=> (lv_sequenciaComando_0_0= ruleSequenciaComando ) ) | ( (lv_comandoSimples_1_0= ruleComandoSimples ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_1 = input.LA(1);

                         
                        int index2_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalImperativa1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalImperativa1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalImperativa1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalImperativa1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalImperativa1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalImperativa1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalImperativa1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_8 = input.LA(1);

                         
                        int index2_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalImperativa1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\4\3\32\6\uffff";
    static final String dfa_9s = "\1\6\3\41\6\uffff";
    static final String dfa_10s = "\4\uffff\1\4\1\1\1\6\1\3\1\2\1\5";
    static final String dfa_11s = "\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\1\1\3",
            "\1\10\2\uffff\1\5\1\4\1\7\1\11\1\6",
            "\1\10\2\uffff\1\5\1\4\1\7\1\11\1\6",
            "\1\10\2\uffff\1\5\1\4\1\7\1\11\1\6",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1050:2: ( ( (lv_somaExpressao_0_0= ruleExpSoma ) ) | ( (lv_subExpressao_1_0= ruleExpSub ) ) | ( (lv_orExpressao_2_0= ruleExpOr ) ) | ( (lv_andExpressao_3_0= ruleExpAnd ) ) | ( (lv_equalsExpressao_4_0= ruleExpEquals ) ) | ( (lv_concatExpressao_5_0= ruleExpConcat ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000004014D8012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000004014D8010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000001C010070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000004016D8010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000004014F8010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000C014D8010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});

}