package br.ufpe.cin.plp.imperativa1.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import br.ufpe.cin.plp.imperativa1.services.Imperativa1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalImperativa1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VALORSTRING", "RULE_VALORINTEIRO", "RULE_VALORBOOLEANO", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'read'", "'('", "')'", "'write'", "'if'", "'then'", "'else'", "'while'", "'do'", "':='", "'-'", "'not'", "'length'", "'+'", "'and'", "'or'", "'=='", "'++'", "'{'", "'}'", "','", "'var'", "'='", "'skip'"
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

    	public void setGrammarAccess(Imperativa1GrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalImperativa1.g:54:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalImperativa1.g:55:1: ( ruleModel EOF )
            // InternalImperativa1.g:56:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalImperativa1.g:63:1: ruleModel : ( ( rule__Model__ComandosAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:67:2: ( ( ( rule__Model__ComandosAssignment )* ) )
            // InternalImperativa1.g:68:2: ( ( rule__Model__ComandosAssignment )* )
            {
            // InternalImperativa1.g:68:2: ( ( rule__Model__ComandosAssignment )* )
            // InternalImperativa1.g:69:3: ( rule__Model__ComandosAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getComandosAssignment()); 
            }
            // InternalImperativa1.g:70:3: ( rule__Model__ComandosAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_VALORSTRING||(LA1_0>=15 && LA1_0<=16)||(LA1_0>=18 && LA1_0<=19)||LA1_0==22||LA1_0==33||LA1_0==38) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalImperativa1.g:70:4: rule__Model__ComandosAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ComandosAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getComandosAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleComando"
    // InternalImperativa1.g:79:1: entryRuleComando : ruleComando EOF ;
    public final void entryRuleComando() throws RecognitionException {
        try {
            // InternalImperativa1.g:80:1: ( ruleComando EOF )
            // InternalImperativa1.g:81:1: ruleComando EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComando();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComando"


    // $ANTLR start "ruleComando"
    // InternalImperativa1.g:88:1: ruleComando : ( ( rule__Comando__Alternatives ) ) ;
    public final void ruleComando() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:92:2: ( ( ( rule__Comando__Alternatives ) ) )
            // InternalImperativa1.g:93:2: ( ( rule__Comando__Alternatives ) )
            {
            // InternalImperativa1.g:93:2: ( ( rule__Comando__Alternatives ) )
            // InternalImperativa1.g:94:3: ( rule__Comando__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoAccess().getAlternatives()); 
            }
            // InternalImperativa1.g:95:3: ( rule__Comando__Alternatives )
            // InternalImperativa1.g:95:4: rule__Comando__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Comando__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComando"


    // $ANTLR start "entryRuleSequenciaComando"
    // InternalImperativa1.g:104:1: entryRuleSequenciaComando : ruleSequenciaComando EOF ;
    public final void entryRuleSequenciaComando() throws RecognitionException {
        try {
            // InternalImperativa1.g:105:1: ( ruleSequenciaComando EOF )
            // InternalImperativa1.g:106:1: ruleSequenciaComando EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenciaComandoRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSequenciaComando();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenciaComandoRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSequenciaComando"


    // $ANTLR start "ruleSequenciaComando"
    // InternalImperativa1.g:113:1: ruleSequenciaComando : ( ( rule__SequenciaComando__Group__0 ) ) ;
    public final void ruleSequenciaComando() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:117:2: ( ( ( rule__SequenciaComando__Group__0 ) ) )
            // InternalImperativa1.g:118:2: ( ( rule__SequenciaComando__Group__0 ) )
            {
            // InternalImperativa1.g:118:2: ( ( rule__SequenciaComando__Group__0 ) )
            // InternalImperativa1.g:119:3: ( rule__SequenciaComando__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenciaComandoAccess().getGroup()); 
            }
            // InternalImperativa1.g:120:3: ( rule__SequenciaComando__Group__0 )
            // InternalImperativa1.g:120:4: rule__SequenciaComando__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SequenciaComando__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenciaComandoAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenciaComando"


    // $ANTLR start "entryRuleIO"
    // InternalImperativa1.g:129:1: entryRuleIO : ruleIO EOF ;
    public final void entryRuleIO() throws RecognitionException {
        try {
            // InternalImperativa1.g:130:1: ( ruleIO EOF )
            // InternalImperativa1.g:131:1: ruleIO EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIORule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIO();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIORule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIO"


    // $ANTLR start "ruleIO"
    // InternalImperativa1.g:138:1: ruleIO : ( ( rule__IO__Alternatives ) ) ;
    public final void ruleIO() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:142:2: ( ( ( rule__IO__Alternatives ) ) )
            // InternalImperativa1.g:143:2: ( ( rule__IO__Alternatives ) )
            {
            // InternalImperativa1.g:143:2: ( ( rule__IO__Alternatives ) )
            // InternalImperativa1.g:144:3: ( rule__IO__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIOAccess().getAlternatives()); 
            }
            // InternalImperativa1.g:145:3: ( rule__IO__Alternatives )
            // InternalImperativa1.g:145:4: rule__IO__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IO__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIOAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIO"


    // $ANTLR start "entryRuleRead"
    // InternalImperativa1.g:154:1: entryRuleRead : ruleRead EOF ;
    public final void entryRuleRead() throws RecognitionException {
        try {
            // InternalImperativa1.g:155:1: ( ruleRead EOF )
            // InternalImperativa1.g:156:1: ruleRead EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRead();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReadRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // InternalImperativa1.g:163:1: ruleRead : ( ( rule__Read__Group__0 ) ) ;
    public final void ruleRead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:167:2: ( ( ( rule__Read__Group__0 ) ) )
            // InternalImperativa1.g:168:2: ( ( rule__Read__Group__0 ) )
            {
            // InternalImperativa1.g:168:2: ( ( rule__Read__Group__0 ) )
            // InternalImperativa1.g:169:3: ( rule__Read__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadAccess().getGroup()); 
            }
            // InternalImperativa1.g:170:3: ( rule__Read__Group__0 )
            // InternalImperativa1.g:170:4: rule__Read__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Read__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReadAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleWrite"
    // InternalImperativa1.g:179:1: entryRuleWrite : ruleWrite EOF ;
    public final void entryRuleWrite() throws RecognitionException {
        try {
            // InternalImperativa1.g:180:1: ( ruleWrite EOF )
            // InternalImperativa1.g:181:1: ruleWrite EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWrite();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleWrite"


    // $ANTLR start "ruleWrite"
    // InternalImperativa1.g:188:1: ruleWrite : ( ( rule__Write__Group__0 ) ) ;
    public final void ruleWrite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:192:2: ( ( ( rule__Write__Group__0 ) ) )
            // InternalImperativa1.g:193:2: ( ( rule__Write__Group__0 ) )
            {
            // InternalImperativa1.g:193:2: ( ( rule__Write__Group__0 ) )
            // InternalImperativa1.g:194:3: ( rule__Write__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteAccess().getGroup()); 
            }
            // InternalImperativa1.g:195:3: ( rule__Write__Group__0 )
            // InternalImperativa1.g:195:4: rule__Write__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Write__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWrite"


    // $ANTLR start "entryRuleIfThenElse"
    // InternalImperativa1.g:204:1: entryRuleIfThenElse : ruleIfThenElse EOF ;
    public final void entryRuleIfThenElse() throws RecognitionException {
        try {
            // InternalImperativa1.g:205:1: ( ruleIfThenElse EOF )
            // InternalImperativa1.g:206:1: ruleIfThenElse EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfThenElse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIfThenElse"


    // $ANTLR start "ruleIfThenElse"
    // InternalImperativa1.g:213:1: ruleIfThenElse : ( ( rule__IfThenElse__Group__0 ) ) ;
    public final void ruleIfThenElse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:217:2: ( ( ( rule__IfThenElse__Group__0 ) ) )
            // InternalImperativa1.g:218:2: ( ( rule__IfThenElse__Group__0 ) )
            {
            // InternalImperativa1.g:218:2: ( ( rule__IfThenElse__Group__0 ) )
            // InternalImperativa1.g:219:3: ( rule__IfThenElse__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getGroup()); 
            }
            // InternalImperativa1.g:220:3: ( rule__IfThenElse__Group__0 )
            // InternalImperativa1.g:220:4: rule__IfThenElse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfThenElse__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfThenElse"


    // $ANTLR start "entryRuleWhile"
    // InternalImperativa1.g:229:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // InternalImperativa1.g:230:1: ( ruleWhile EOF )
            // InternalImperativa1.g:231:1: ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalImperativa1.g:238:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:242:2: ( ( ( rule__While__Group__0 ) ) )
            // InternalImperativa1.g:243:2: ( ( rule__While__Group__0 ) )
            {
            // InternalImperativa1.g:243:2: ( ( rule__While__Group__0 ) )
            // InternalImperativa1.g:244:3: ( rule__While__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getGroup()); 
            }
            // InternalImperativa1.g:245:3: ( rule__While__Group__0 )
            // InternalImperativa1.g:245:4: rule__While__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleSkip"
    // InternalImperativa1.g:254:1: entryRuleSkip : ruleSkip EOF ;
    public final void entryRuleSkip() throws RecognitionException {
        try {
            // InternalImperativa1.g:255:1: ( ruleSkip EOF )
            // InternalImperativa1.g:256:1: ruleSkip EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSkip();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkipRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSkip"


    // $ANTLR start "ruleSkip"
    // InternalImperativa1.g:263:1: ruleSkip : ( ( rule__Skip__SkipAssignment ) ) ;
    public final void ruleSkip() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:267:2: ( ( ( rule__Skip__SkipAssignment ) ) )
            // InternalImperativa1.g:268:2: ( ( rule__Skip__SkipAssignment ) )
            {
            // InternalImperativa1.g:268:2: ( ( rule__Skip__SkipAssignment ) )
            // InternalImperativa1.g:269:3: ( rule__Skip__SkipAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSkipAssignment()); 
            }
            // InternalImperativa1.g:270:3: ( rule__Skip__SkipAssignment )
            // InternalImperativa1.g:270:4: rule__Skip__SkipAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Skip__SkipAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkipAccess().getSkipAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSkip"


    // $ANTLR start "entryRuleAtribuicao"
    // InternalImperativa1.g:279:1: entryRuleAtribuicao : ruleAtribuicao EOF ;
    public final void entryRuleAtribuicao() throws RecognitionException {
        try {
            // InternalImperativa1.g:280:1: ( ruleAtribuicao EOF )
            // InternalImperativa1.g:281:1: ruleAtribuicao EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribuicaoRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAtribuicao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtribuicaoRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAtribuicao"


    // $ANTLR start "ruleAtribuicao"
    // InternalImperativa1.g:288:1: ruleAtribuicao : ( ( rule__Atribuicao__Group__0 ) ) ;
    public final void ruleAtribuicao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:292:2: ( ( ( rule__Atribuicao__Group__0 ) ) )
            // InternalImperativa1.g:293:2: ( ( rule__Atribuicao__Group__0 ) )
            {
            // InternalImperativa1.g:293:2: ( ( rule__Atribuicao__Group__0 ) )
            // InternalImperativa1.g:294:3: ( rule__Atribuicao__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribuicaoAccess().getGroup()); 
            }
            // InternalImperativa1.g:295:3: ( rule__Atribuicao__Group__0 )
            // InternalImperativa1.g:295:4: rule__Atribuicao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atribuicao__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtribuicaoAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtribuicao"


    // $ANTLR start "entryRulePId"
    // InternalImperativa1.g:304:1: entryRulePId : rulePId EOF ;
    public final void entryRulePId() throws RecognitionException {
        try {
            // InternalImperativa1.g:305:1: ( rulePId EOF )
            // InternalImperativa1.g:306:1: rulePId EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPIdRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPIdRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePId"


    // $ANTLR start "rulePId"
    // InternalImperativa1.g:313:1: rulePId : ( ( rule__PId__Group__0 ) ) ;
    public final void rulePId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:317:2: ( ( ( rule__PId__Group__0 ) ) )
            // InternalImperativa1.g:318:2: ( ( rule__PId__Group__0 ) )
            {
            // InternalImperativa1.g:318:2: ( ( rule__PId__Group__0 ) )
            // InternalImperativa1.g:319:3: ( rule__PId__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPIdAccess().getGroup()); 
            }
            // InternalImperativa1.g:320:3: ( rule__PId__Group__0 )
            // InternalImperativa1.g:320:4: rule__PId__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PId__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPIdAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePId"


    // $ANTLR start "entryRuleValor"
    // InternalImperativa1.g:329:1: entryRuleValor : ruleValor EOF ;
    public final void entryRuleValor() throws RecognitionException {
        try {
            // InternalImperativa1.g:330:1: ( ruleValor EOF )
            // InternalImperativa1.g:331:1: ruleValor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleValor"


    // $ANTLR start "ruleValor"
    // InternalImperativa1.g:338:1: ruleValor : ( ( rule__Valor__Alternatives ) ) ;
    public final void ruleValor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:342:2: ( ( ( rule__Valor__Alternatives ) ) )
            // InternalImperativa1.g:343:2: ( ( rule__Valor__Alternatives ) )
            {
            // InternalImperativa1.g:343:2: ( ( rule__Valor__Alternatives ) )
            // InternalImperativa1.g:344:3: ( rule__Valor__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValorAccess().getAlternatives()); 
            }
            // InternalImperativa1.g:345:3: ( rule__Valor__Alternatives )
            // InternalImperativa1.g:345:4: rule__Valor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Valor__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValor"


    // $ANTLR start "entryRuleExpMenos"
    // InternalImperativa1.g:354:1: entryRuleExpMenos : ruleExpMenos EOF ;
    public final void entryRuleExpMenos() throws RecognitionException {
        try {
            // InternalImperativa1.g:355:1: ( ruleExpMenos EOF )
            // InternalImperativa1.g:356:1: ruleExpMenos EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpMenosRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpMenos();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpMenosRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpMenos"


    // $ANTLR start "ruleExpMenos"
    // InternalImperativa1.g:363:1: ruleExpMenos : ( ( rule__ExpMenos__Group__0 ) ) ;
    public final void ruleExpMenos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:367:2: ( ( ( rule__ExpMenos__Group__0 ) ) )
            // InternalImperativa1.g:368:2: ( ( rule__ExpMenos__Group__0 ) )
            {
            // InternalImperativa1.g:368:2: ( ( rule__ExpMenos__Group__0 ) )
            // InternalImperativa1.g:369:3: ( rule__ExpMenos__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpMenosAccess().getGroup()); 
            }
            // InternalImperativa1.g:370:3: ( rule__ExpMenos__Group__0 )
            // InternalImperativa1.g:370:4: rule__ExpMenos__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpMenos__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpMenosAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpMenos"


    // $ANTLR start "entryRuleExpNot"
    // InternalImperativa1.g:379:1: entryRuleExpNot : ruleExpNot EOF ;
    public final void entryRuleExpNot() throws RecognitionException {
        try {
            // InternalImperativa1.g:380:1: ( ruleExpNot EOF )
            // InternalImperativa1.g:381:1: ruleExpNot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpNotRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpNotRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpNot"


    // $ANTLR start "ruleExpNot"
    // InternalImperativa1.g:388:1: ruleExpNot : ( ( rule__ExpNot__Group__0 ) ) ;
    public final void ruleExpNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:392:2: ( ( ( rule__ExpNot__Group__0 ) ) )
            // InternalImperativa1.g:393:2: ( ( rule__ExpNot__Group__0 ) )
            {
            // InternalImperativa1.g:393:2: ( ( rule__ExpNot__Group__0 ) )
            // InternalImperativa1.g:394:3: ( rule__ExpNot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpNotAccess().getGroup()); 
            }
            // InternalImperativa1.g:395:3: ( rule__ExpNot__Group__0 )
            // InternalImperativa1.g:395:4: rule__ExpNot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpNot__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpNotAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpNot"


    // $ANTLR start "entryRuleExpLenght"
    // InternalImperativa1.g:404:1: entryRuleExpLenght : ruleExpLenght EOF ;
    public final void entryRuleExpLenght() throws RecognitionException {
        try {
            // InternalImperativa1.g:405:1: ( ruleExpLenght EOF )
            // InternalImperativa1.g:406:1: ruleExpLenght EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpLenghtRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpLenght();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpLenghtRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpLenght"


    // $ANTLR start "ruleExpLenght"
    // InternalImperativa1.g:413:1: ruleExpLenght : ( ( rule__ExpLenght__Group__0 ) ) ;
    public final void ruleExpLenght() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:417:2: ( ( ( rule__ExpLenght__Group__0 ) ) )
            // InternalImperativa1.g:418:2: ( ( rule__ExpLenght__Group__0 ) )
            {
            // InternalImperativa1.g:418:2: ( ( rule__ExpLenght__Group__0 ) )
            // InternalImperativa1.g:419:3: ( rule__ExpLenght__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpLenghtAccess().getGroup()); 
            }
            // InternalImperativa1.g:420:3: ( rule__ExpLenght__Group__0 )
            // InternalImperativa1.g:420:4: rule__ExpLenght__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpLenght__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpLenghtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpLenght"


    // $ANTLR start "entryRuleExpPrimaria"
    // InternalImperativa1.g:429:1: entryRuleExpPrimaria : ruleExpPrimaria EOF ;
    public final void entryRuleExpPrimaria() throws RecognitionException {
        try {
            // InternalImperativa1.g:430:1: ( ruleExpPrimaria EOF )
            // InternalImperativa1.g:431:1: ruleExpPrimaria EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpPrimariaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpPrimaria();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpPrimariaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpPrimaria"


    // $ANTLR start "ruleExpPrimaria"
    // InternalImperativa1.g:438:1: ruleExpPrimaria : ( ( rule__ExpPrimaria__Alternatives ) ) ;
    public final void ruleExpPrimaria() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:442:2: ( ( ( rule__ExpPrimaria__Alternatives ) ) )
            // InternalImperativa1.g:443:2: ( ( rule__ExpPrimaria__Alternatives ) )
            {
            // InternalImperativa1.g:443:2: ( ( rule__ExpPrimaria__Alternatives ) )
            // InternalImperativa1.g:444:3: ( rule__ExpPrimaria__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpPrimariaAccess().getAlternatives()); 
            }
            // InternalImperativa1.g:445:3: ( rule__ExpPrimaria__Alternatives )
            // InternalImperativa1.g:445:4: rule__ExpPrimaria__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpPrimaria__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpPrimariaAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpPrimaria"


    // $ANTLR start "entryRuleExpUnaria"
    // InternalImperativa1.g:454:1: entryRuleExpUnaria : ruleExpUnaria EOF ;
    public final void entryRuleExpUnaria() throws RecognitionException {
        try {
            // InternalImperativa1.g:455:1: ( ruleExpUnaria EOF )
            // InternalImperativa1.g:456:1: ruleExpUnaria EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpUnariaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpUnaria();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpUnariaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpUnaria"


    // $ANTLR start "ruleExpUnaria"
    // InternalImperativa1.g:463:1: ruleExpUnaria : ( ( rule__ExpUnaria__Alternatives ) ) ;
    public final void ruleExpUnaria() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:467:2: ( ( ( rule__ExpUnaria__Alternatives ) ) )
            // InternalImperativa1.g:468:2: ( ( rule__ExpUnaria__Alternatives ) )
            {
            // InternalImperativa1.g:468:2: ( ( rule__ExpUnaria__Alternatives ) )
            // InternalImperativa1.g:469:3: ( rule__ExpUnaria__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpUnariaAccess().getAlternatives()); 
            }
            // InternalImperativa1.g:470:3: ( rule__ExpUnaria__Alternatives )
            // InternalImperativa1.g:470:4: rule__ExpUnaria__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpUnaria__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpUnariaAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpUnaria"


    // $ANTLR start "entryRuleExpBinaria"
    // InternalImperativa1.g:479:1: entryRuleExpBinaria : ruleExpBinaria EOF ;
    public final void entryRuleExpBinaria() throws RecognitionException {
        try {
            // InternalImperativa1.g:480:1: ( ruleExpBinaria EOF )
            // InternalImperativa1.g:481:1: ruleExpBinaria EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpBinariaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpBinaria();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpBinariaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpBinaria"


    // $ANTLR start "ruleExpBinaria"
    // InternalImperativa1.g:488:1: ruleExpBinaria : ( ( rule__ExpBinaria__Alternatives ) ) ;
    public final void ruleExpBinaria() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:492:2: ( ( ( rule__ExpBinaria__Alternatives ) ) )
            // InternalImperativa1.g:493:2: ( ( rule__ExpBinaria__Alternatives ) )
            {
            // InternalImperativa1.g:493:2: ( ( rule__ExpBinaria__Alternatives ) )
            // InternalImperativa1.g:494:3: ( rule__ExpBinaria__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpBinariaAccess().getAlternatives()); 
            }
            // InternalImperativa1.g:495:3: ( rule__ExpBinaria__Alternatives )
            // InternalImperativa1.g:495:4: rule__ExpBinaria__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpBinaria__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpBinariaAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpBinaria"


    // $ANTLR start "entryRuleExpSoma"
    // InternalImperativa1.g:504:1: entryRuleExpSoma : ruleExpSoma EOF ;
    public final void entryRuleExpSoma() throws RecognitionException {
        try {
            // InternalImperativa1.g:505:1: ( ruleExpSoma EOF )
            // InternalImperativa1.g:506:1: ruleExpSoma EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpSomaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpSoma();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpSomaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpSoma"


    // $ANTLR start "ruleExpSoma"
    // InternalImperativa1.g:513:1: ruleExpSoma : ( ( rule__ExpSoma__Group__0 ) ) ;
    public final void ruleExpSoma() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:517:2: ( ( ( rule__ExpSoma__Group__0 ) ) )
            // InternalImperativa1.g:518:2: ( ( rule__ExpSoma__Group__0 ) )
            {
            // InternalImperativa1.g:518:2: ( ( rule__ExpSoma__Group__0 ) )
            // InternalImperativa1.g:519:3: ( rule__ExpSoma__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpSomaAccess().getGroup()); 
            }
            // InternalImperativa1.g:520:3: ( rule__ExpSoma__Group__0 )
            // InternalImperativa1.g:520:4: rule__ExpSoma__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpSoma__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpSomaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpSoma"


    // $ANTLR start "entryRuleExpSub"
    // InternalImperativa1.g:529:1: entryRuleExpSub : ruleExpSub EOF ;
    public final void entryRuleExpSub() throws RecognitionException {
        try {
            // InternalImperativa1.g:530:1: ( ruleExpSub EOF )
            // InternalImperativa1.g:531:1: ruleExpSub EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpSubRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpSub();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpSubRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpSub"


    // $ANTLR start "ruleExpSub"
    // InternalImperativa1.g:538:1: ruleExpSub : ( ( rule__ExpSub__Group__0 ) ) ;
    public final void ruleExpSub() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:542:2: ( ( ( rule__ExpSub__Group__0 ) ) )
            // InternalImperativa1.g:543:2: ( ( rule__ExpSub__Group__0 ) )
            {
            // InternalImperativa1.g:543:2: ( ( rule__ExpSub__Group__0 ) )
            // InternalImperativa1.g:544:3: ( rule__ExpSub__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpSubAccess().getGroup()); 
            }
            // InternalImperativa1.g:545:3: ( rule__ExpSub__Group__0 )
            // InternalImperativa1.g:545:4: rule__ExpSub__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpSub__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpSubAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpSub"


    // $ANTLR start "entryRuleExpAnd"
    // InternalImperativa1.g:554:1: entryRuleExpAnd : ruleExpAnd EOF ;
    public final void entryRuleExpAnd() throws RecognitionException {
        try {
            // InternalImperativa1.g:555:1: ( ruleExpAnd EOF )
            // InternalImperativa1.g:556:1: ruleExpAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpAndRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpAndRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpAnd"


    // $ANTLR start "ruleExpAnd"
    // InternalImperativa1.g:563:1: ruleExpAnd : ( ( rule__ExpAnd__Group__0 ) ) ;
    public final void ruleExpAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:567:2: ( ( ( rule__ExpAnd__Group__0 ) ) )
            // InternalImperativa1.g:568:2: ( ( rule__ExpAnd__Group__0 ) )
            {
            // InternalImperativa1.g:568:2: ( ( rule__ExpAnd__Group__0 ) )
            // InternalImperativa1.g:569:3: ( rule__ExpAnd__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpAndAccess().getGroup()); 
            }
            // InternalImperativa1.g:570:3: ( rule__ExpAnd__Group__0 )
            // InternalImperativa1.g:570:4: rule__ExpAnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpAnd__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpAndAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpAnd"


    // $ANTLR start "entryRuleExpOr"
    // InternalImperativa1.g:579:1: entryRuleExpOr : ruleExpOr EOF ;
    public final void entryRuleExpOr() throws RecognitionException {
        try {
            // InternalImperativa1.g:580:1: ( ruleExpOr EOF )
            // InternalImperativa1.g:581:1: ruleExpOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpOrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpOrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpOr"


    // $ANTLR start "ruleExpOr"
    // InternalImperativa1.g:588:1: ruleExpOr : ( ( rule__ExpOr__Group__0 ) ) ;
    public final void ruleExpOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:592:2: ( ( ( rule__ExpOr__Group__0 ) ) )
            // InternalImperativa1.g:593:2: ( ( rule__ExpOr__Group__0 ) )
            {
            // InternalImperativa1.g:593:2: ( ( rule__ExpOr__Group__0 ) )
            // InternalImperativa1.g:594:3: ( rule__ExpOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpOrAccess().getGroup()); 
            }
            // InternalImperativa1.g:595:3: ( rule__ExpOr__Group__0 )
            // InternalImperativa1.g:595:4: rule__ExpOr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpOr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpOrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpOr"


    // $ANTLR start "entryRuleExpEquals"
    // InternalImperativa1.g:604:1: entryRuleExpEquals : ruleExpEquals EOF ;
    public final void entryRuleExpEquals() throws RecognitionException {
        try {
            // InternalImperativa1.g:605:1: ( ruleExpEquals EOF )
            // InternalImperativa1.g:606:1: ruleExpEquals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpEqualsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpEqualsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpEquals"


    // $ANTLR start "ruleExpEquals"
    // InternalImperativa1.g:613:1: ruleExpEquals : ( ( rule__ExpEquals__Group__0 ) ) ;
    public final void ruleExpEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:617:2: ( ( ( rule__ExpEquals__Group__0 ) ) )
            // InternalImperativa1.g:618:2: ( ( rule__ExpEquals__Group__0 ) )
            {
            // InternalImperativa1.g:618:2: ( ( rule__ExpEquals__Group__0 ) )
            // InternalImperativa1.g:619:3: ( rule__ExpEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpEqualsAccess().getGroup()); 
            }
            // InternalImperativa1.g:620:3: ( rule__ExpEquals__Group__0 )
            // InternalImperativa1.g:620:4: rule__ExpEquals__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpEquals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpEqualsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpEquals"


    // $ANTLR start "entryRuleExpConcat"
    // InternalImperativa1.g:629:1: entryRuleExpConcat : ruleExpConcat EOF ;
    public final void entryRuleExpConcat() throws RecognitionException {
        try {
            // InternalImperativa1.g:630:1: ( ruleExpConcat EOF )
            // InternalImperativa1.g:631:1: ruleExpConcat EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpConcatRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpConcatRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpConcat"


    // $ANTLR start "ruleExpConcat"
    // InternalImperativa1.g:638:1: ruleExpConcat : ( ( rule__ExpConcat__Group__0 ) ) ;
    public final void ruleExpConcat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:642:2: ( ( ( rule__ExpConcat__Group__0 ) ) )
            // InternalImperativa1.g:643:2: ( ( rule__ExpConcat__Group__0 ) )
            {
            // InternalImperativa1.g:643:2: ( ( rule__ExpConcat__Group__0 ) )
            // InternalImperativa1.g:644:3: ( rule__ExpConcat__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpConcatAccess().getGroup()); 
            }
            // InternalImperativa1.g:645:3: ( rule__ExpConcat__Group__0 )
            // InternalImperativa1.g:645:4: rule__ExpConcat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpConcat__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpConcatAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpConcat"


    // $ANTLR start "entryRuleExpressao"
    // InternalImperativa1.g:654:1: entryRuleExpressao : ruleExpressao EOF ;
    public final void entryRuleExpressao() throws RecognitionException {
        try {
            // InternalImperativa1.g:655:1: ( ruleExpressao EOF )
            // InternalImperativa1.g:656:1: ruleExpressao EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressaoRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressaoRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressao"


    // $ANTLR start "ruleExpressao"
    // InternalImperativa1.g:663:1: ruleExpressao : ( ( rule__Expressao__Alternatives ) ) ;
    public final void ruleExpressao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:667:2: ( ( ( rule__Expressao__Alternatives ) ) )
            // InternalImperativa1.g:668:2: ( ( rule__Expressao__Alternatives ) )
            {
            // InternalImperativa1.g:668:2: ( ( rule__Expressao__Alternatives ) )
            // InternalImperativa1.g:669:3: ( rule__Expressao__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressaoAccess().getAlternatives()); 
            }
            // InternalImperativa1.g:670:3: ( rule__Expressao__Alternatives )
            // InternalImperativa1.g:670:4: rule__Expressao__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expressao__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressaoAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressao"


    // $ANTLR start "entryRuleComandoSimples"
    // InternalImperativa1.g:679:1: entryRuleComandoSimples : ruleComandoSimples EOF ;
    public final void entryRuleComandoSimples() throws RecognitionException {
        try {
            // InternalImperativa1.g:680:1: ( ruleComandoSimples EOF )
            // InternalImperativa1.g:681:1: ruleComandoSimples EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoSimplesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComandoSimples();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoSimplesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComandoSimples"


    // $ANTLR start "ruleComandoSimples"
    // InternalImperativa1.g:688:1: ruleComandoSimples : ( ( rule__ComandoSimples__Alternatives ) ) ;
    public final void ruleComandoSimples() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:692:2: ( ( ( rule__ComandoSimples__Alternatives ) ) )
            // InternalImperativa1.g:693:2: ( ( rule__ComandoSimples__Alternatives ) )
            {
            // InternalImperativa1.g:693:2: ( ( rule__ComandoSimples__Alternatives ) )
            // InternalImperativa1.g:694:3: ( rule__ComandoSimples__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoSimplesAccess().getAlternatives()); 
            }
            // InternalImperativa1.g:695:3: ( rule__ComandoSimples__Alternatives )
            // InternalImperativa1.g:695:4: rule__ComandoSimples__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComandoSimples__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoSimplesAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandoSimples"


    // $ANTLR start "entryRuleComandoDeclaracao"
    // InternalImperativa1.g:704:1: entryRuleComandoDeclaracao : ruleComandoDeclaracao EOF ;
    public final void entryRuleComandoDeclaracao() throws RecognitionException {
        try {
            // InternalImperativa1.g:705:1: ( ruleComandoDeclaracao EOF )
            // InternalImperativa1.g:706:1: ruleComandoDeclaracao EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoDeclaracaoRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComandoDeclaracao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoDeclaracaoRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComandoDeclaracao"


    // $ANTLR start "ruleComandoDeclaracao"
    // InternalImperativa1.g:713:1: ruleComandoDeclaracao : ( ( rule__ComandoDeclaracao__Group__0 ) ) ;
    public final void ruleComandoDeclaracao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:717:2: ( ( ( rule__ComandoDeclaracao__Group__0 ) ) )
            // InternalImperativa1.g:718:2: ( ( rule__ComandoDeclaracao__Group__0 ) )
            {
            // InternalImperativa1.g:718:2: ( ( rule__ComandoDeclaracao__Group__0 ) )
            // InternalImperativa1.g:719:3: ( rule__ComandoDeclaracao__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoDeclaracaoAccess().getGroup()); 
            }
            // InternalImperativa1.g:720:3: ( rule__ComandoDeclaracao__Group__0 )
            // InternalImperativa1.g:720:4: rule__ComandoDeclaracao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoDeclaracao__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoDeclaracaoAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandoDeclaracao"


    // $ANTLR start "entryRuleDeclaracao"
    // InternalImperativa1.g:729:1: entryRuleDeclaracao : ruleDeclaracao EOF ;
    public final void entryRuleDeclaracao() throws RecognitionException {
        try {
            // InternalImperativa1.g:730:1: ( ruleDeclaracao EOF )
            // InternalImperativa1.g:731:1: ruleDeclaracao EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDeclaracao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDeclaracao"


    // $ANTLR start "ruleDeclaracao"
    // InternalImperativa1.g:738:1: ruleDeclaracao : ( ( rule__Declaracao__Alternatives ) ) ;
    public final void ruleDeclaracao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:742:2: ( ( ( rule__Declaracao__Alternatives ) ) )
            // InternalImperativa1.g:743:2: ( ( rule__Declaracao__Alternatives ) )
            {
            // InternalImperativa1.g:743:2: ( ( rule__Declaracao__Alternatives ) )
            // InternalImperativa1.g:744:3: ( rule__Declaracao__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoAccess().getAlternatives()); 
            }
            // InternalImperativa1.g:745:3: ( rule__Declaracao__Alternatives )
            // InternalImperativa1.g:745:4: rule__Declaracao__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaracao__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaracao"


    // $ANTLR start "entryRuleDeclaracaoComposta"
    // InternalImperativa1.g:754:1: entryRuleDeclaracaoComposta : ruleDeclaracaoComposta EOF ;
    public final void entryRuleDeclaracaoComposta() throws RecognitionException {
        try {
            // InternalImperativa1.g:755:1: ( ruleDeclaracaoComposta EOF )
            // InternalImperativa1.g:756:1: ruleDeclaracaoComposta EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoCompostaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDeclaracaoComposta();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoCompostaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDeclaracaoComposta"


    // $ANTLR start "ruleDeclaracaoComposta"
    // InternalImperativa1.g:763:1: ruleDeclaracaoComposta : ( ( rule__DeclaracaoComposta__Group__0 ) ) ;
    public final void ruleDeclaracaoComposta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:767:2: ( ( ( rule__DeclaracaoComposta__Group__0 ) ) )
            // InternalImperativa1.g:768:2: ( ( rule__DeclaracaoComposta__Group__0 ) )
            {
            // InternalImperativa1.g:768:2: ( ( rule__DeclaracaoComposta__Group__0 ) )
            // InternalImperativa1.g:769:3: ( rule__DeclaracaoComposta__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoCompostaAccess().getGroup()); 
            }
            // InternalImperativa1.g:770:3: ( rule__DeclaracaoComposta__Group__0 )
            // InternalImperativa1.g:770:4: rule__DeclaracaoComposta__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoComposta__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoCompostaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaracaoComposta"


    // $ANTLR start "entryRuleDeclaracaoVariavel"
    // InternalImperativa1.g:779:1: entryRuleDeclaracaoVariavel : ruleDeclaracaoVariavel EOF ;
    public final void entryRuleDeclaracaoVariavel() throws RecognitionException {
        try {
            // InternalImperativa1.g:780:1: ( ruleDeclaracaoVariavel EOF )
            // InternalImperativa1.g:781:1: ruleDeclaracaoVariavel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoVariavelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDeclaracaoVariavel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoVariavelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDeclaracaoVariavel"


    // $ANTLR start "ruleDeclaracaoVariavel"
    // InternalImperativa1.g:788:1: ruleDeclaracaoVariavel : ( ( rule__DeclaracaoVariavel__Group__0 ) ) ;
    public final void ruleDeclaracaoVariavel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:792:2: ( ( ( rule__DeclaracaoVariavel__Group__0 ) ) )
            // InternalImperativa1.g:793:2: ( ( rule__DeclaracaoVariavel__Group__0 ) )
            {
            // InternalImperativa1.g:793:2: ( ( rule__DeclaracaoVariavel__Group__0 ) )
            // InternalImperativa1.g:794:3: ( rule__DeclaracaoVariavel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoVariavelAccess().getGroup()); 
            }
            // InternalImperativa1.g:795:3: ( rule__DeclaracaoVariavel__Group__0 )
            // InternalImperativa1.g:795:4: rule__DeclaracaoVariavel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoVariavel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoVariavelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaracaoVariavel"


    // $ANTLR start "rule__Comando__Alternatives"
    // InternalImperativa1.g:803:1: rule__Comando__Alternatives : ( ( ( rule__Comando__SequenciaComandoAssignment_0 ) ) | ( ( rule__Comando__ComandoSimplesAssignment_1 ) ) );
    public final void rule__Comando__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:807:1: ( ( ( rule__Comando__SequenciaComandoAssignment_0 ) ) | ( ( rule__Comando__ComandoSimplesAssignment_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalImperativa1.g:808:2: ( ( rule__Comando__SequenciaComandoAssignment_0 ) )
                    {
                    // InternalImperativa1.g:808:2: ( ( rule__Comando__SequenciaComandoAssignment_0 ) )
                    // InternalImperativa1.g:809:3: ( rule__Comando__SequenciaComandoAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComandoAccess().getSequenciaComandoAssignment_0()); 
                    }
                    // InternalImperativa1.g:810:3: ( rule__Comando__SequenciaComandoAssignment_0 )
                    // InternalImperativa1.g:810:4: rule__Comando__SequenciaComandoAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comando__SequenciaComandoAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComandoAccess().getSequenciaComandoAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:814:2: ( ( rule__Comando__ComandoSimplesAssignment_1 ) )
                    {
                    // InternalImperativa1.g:814:2: ( ( rule__Comando__ComandoSimplesAssignment_1 ) )
                    // InternalImperativa1.g:815:3: ( rule__Comando__ComandoSimplesAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComandoAccess().getComandoSimplesAssignment_1()); 
                    }
                    // InternalImperativa1.g:816:3: ( rule__Comando__ComandoSimplesAssignment_1 )
                    // InternalImperativa1.g:816:4: rule__Comando__ComandoSimplesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comando__ComandoSimplesAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComandoAccess().getComandoSimplesAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comando__Alternatives"


    // $ANTLR start "rule__IO__Alternatives"
    // InternalImperativa1.g:824:1: rule__IO__Alternatives : ( ( ( rule__IO__ReadAssignment_0 ) ) | ( ( rule__IO__WriteAssignment_1 ) ) );
    public final void rule__IO__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:828:1: ( ( ( rule__IO__ReadAssignment_0 ) ) | ( ( rule__IO__WriteAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalImperativa1.g:829:2: ( ( rule__IO__ReadAssignment_0 ) )
                    {
                    // InternalImperativa1.g:829:2: ( ( rule__IO__ReadAssignment_0 ) )
                    // InternalImperativa1.g:830:3: ( rule__IO__ReadAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIOAccess().getReadAssignment_0()); 
                    }
                    // InternalImperativa1.g:831:3: ( rule__IO__ReadAssignment_0 )
                    // InternalImperativa1.g:831:4: rule__IO__ReadAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IO__ReadAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIOAccess().getReadAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:835:2: ( ( rule__IO__WriteAssignment_1 ) )
                    {
                    // InternalImperativa1.g:835:2: ( ( rule__IO__WriteAssignment_1 ) )
                    // InternalImperativa1.g:836:3: ( rule__IO__WriteAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIOAccess().getWriteAssignment_1()); 
                    }
                    // InternalImperativa1.g:837:3: ( rule__IO__WriteAssignment_1 )
                    // InternalImperativa1.g:837:4: rule__IO__WriteAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__IO__WriteAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIOAccess().getWriteAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IO__Alternatives"


    // $ANTLR start "rule__PId__Alternatives_1"
    // InternalImperativa1.g:845:1: rule__PId__Alternatives_1 : ( ( RULE_VALORSTRING ) | ( RULE_VALORINTEIRO ) );
    public final void rule__PId__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:849:1: ( ( RULE_VALORSTRING ) | ( RULE_VALORINTEIRO ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_VALORSTRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_VALORINTEIRO) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalImperativa1.g:850:2: ( RULE_VALORSTRING )
                    {
                    // InternalImperativa1.g:850:2: ( RULE_VALORSTRING )
                    // InternalImperativa1.g:851:3: RULE_VALORSTRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPIdAccess().getVALORSTRINGTerminalRuleCall_1_0()); 
                    }
                    match(input,RULE_VALORSTRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPIdAccess().getVALORSTRINGTerminalRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:856:2: ( RULE_VALORINTEIRO )
                    {
                    // InternalImperativa1.g:856:2: ( RULE_VALORINTEIRO )
                    // InternalImperativa1.g:857:3: RULE_VALORINTEIRO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPIdAccess().getVALORINTEIROTerminalRuleCall_1_1()); 
                    }
                    match(input,RULE_VALORINTEIRO,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPIdAccess().getVALORINTEIROTerminalRuleCall_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PId__Alternatives_1"


    // $ANTLR start "rule__Valor__Alternatives"
    // InternalImperativa1.g:866:1: rule__Valor__Alternatives : ( ( ( rule__Valor__IntTypeAssignment_0 ) ) | ( ( rule__Valor__StringTypeAssignment_1 ) ) | ( ( rule__Valor__BoolTypeAssignment_2 ) ) );
    public final void rule__Valor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:870:1: ( ( ( rule__Valor__IntTypeAssignment_0 ) ) | ( ( rule__Valor__StringTypeAssignment_1 ) ) | ( ( rule__Valor__BoolTypeAssignment_2 ) ) )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalImperativa1.g:871:2: ( ( rule__Valor__IntTypeAssignment_0 ) )
                    {
                    // InternalImperativa1.g:871:2: ( ( rule__Valor__IntTypeAssignment_0 ) )
                    // InternalImperativa1.g:872:3: ( rule__Valor__IntTypeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValorAccess().getIntTypeAssignment_0()); 
                    }
                    // InternalImperativa1.g:873:3: ( rule__Valor__IntTypeAssignment_0 )
                    // InternalImperativa1.g:873:4: rule__Valor__IntTypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Valor__IntTypeAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValorAccess().getIntTypeAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:877:2: ( ( rule__Valor__StringTypeAssignment_1 ) )
                    {
                    // InternalImperativa1.g:877:2: ( ( rule__Valor__StringTypeAssignment_1 ) )
                    // InternalImperativa1.g:878:3: ( rule__Valor__StringTypeAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValorAccess().getStringTypeAssignment_1()); 
                    }
                    // InternalImperativa1.g:879:3: ( rule__Valor__StringTypeAssignment_1 )
                    // InternalImperativa1.g:879:4: rule__Valor__StringTypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Valor__StringTypeAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValorAccess().getStringTypeAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalImperativa1.g:883:2: ( ( rule__Valor__BoolTypeAssignment_2 ) )
                    {
                    // InternalImperativa1.g:883:2: ( ( rule__Valor__BoolTypeAssignment_2 ) )
                    // InternalImperativa1.g:884:3: ( rule__Valor__BoolTypeAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValorAccess().getBoolTypeAssignment_2()); 
                    }
                    // InternalImperativa1.g:885:3: ( rule__Valor__BoolTypeAssignment_2 )
                    // InternalImperativa1.g:885:4: rule__Valor__BoolTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Valor__BoolTypeAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValorAccess().getBoolTypeAssignment_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Valor__Alternatives"


    // $ANTLR start "rule__ExpPrimaria__Alternatives"
    // InternalImperativa1.g:893:1: rule__ExpPrimaria__Alternatives : ( ( ( rule__ExpPrimaria__PidAssignment_0 ) ) | ( ( rule__ExpPrimaria__ValorAssignment_1 ) ) | ( ( rule__ExpPrimaria__Group_2__0 ) ) );
    public final void rule__ExpPrimaria__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:897:1: ( ( ( rule__ExpPrimaria__PidAssignment_0 ) ) | ( ( rule__ExpPrimaria__ValorAssignment_1 ) ) | ( ( rule__ExpPrimaria__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_VALORSTRING:
                {
                int LA6_1 = input.LA(2);

                if ( (synpred7_InternalImperativa1()) ) {
                    alt6=1;
                }
                else if ( (synpred8_InternalImperativa1()) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalImperativa1.g:898:2: ( ( rule__ExpPrimaria__PidAssignment_0 ) )
                    {
                    // InternalImperativa1.g:898:2: ( ( rule__ExpPrimaria__PidAssignment_0 ) )
                    // InternalImperativa1.g:899:3: ( rule__ExpPrimaria__PidAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpPrimariaAccess().getPidAssignment_0()); 
                    }
                    // InternalImperativa1.g:900:3: ( rule__ExpPrimaria__PidAssignment_0 )
                    // InternalImperativa1.g:900:4: rule__ExpPrimaria__PidAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpPrimaria__PidAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpPrimariaAccess().getPidAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:904:2: ( ( rule__ExpPrimaria__ValorAssignment_1 ) )
                    {
                    // InternalImperativa1.g:904:2: ( ( rule__ExpPrimaria__ValorAssignment_1 ) )
                    // InternalImperativa1.g:905:3: ( rule__ExpPrimaria__ValorAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpPrimariaAccess().getValorAssignment_1()); 
                    }
                    // InternalImperativa1.g:906:3: ( rule__ExpPrimaria__ValorAssignment_1 )
                    // InternalImperativa1.g:906:4: rule__ExpPrimaria__ValorAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpPrimaria__ValorAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpPrimariaAccess().getValorAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalImperativa1.g:910:2: ( ( rule__ExpPrimaria__Group_2__0 ) )
                    {
                    // InternalImperativa1.g:910:2: ( ( rule__ExpPrimaria__Group_2__0 ) )
                    // InternalImperativa1.g:911:3: ( rule__ExpPrimaria__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpPrimariaAccess().getGroup_2()); 
                    }
                    // InternalImperativa1.g:912:3: ( rule__ExpPrimaria__Group_2__0 )
                    // InternalImperativa1.g:912:4: rule__ExpPrimaria__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpPrimaria__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpPrimariaAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpPrimaria__Alternatives"


    // $ANTLR start "rule__ExpUnaria__Alternatives"
    // InternalImperativa1.g:920:1: rule__ExpUnaria__Alternatives : ( ( ( rule__ExpUnaria__MenosExpressaoAssignment_0 ) ) | ( ( rule__ExpUnaria__NotExpressaoAssignment_1 ) ) | ( ( rule__ExpUnaria__LengthExpressaoAssignment_2 ) ) );
    public final void rule__ExpUnaria__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:924:1: ( ( ( rule__ExpUnaria__MenosExpressaoAssignment_0 ) ) | ( ( rule__ExpUnaria__NotExpressaoAssignment_1 ) ) | ( ( rule__ExpUnaria__LengthExpressaoAssignment_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalImperativa1.g:925:2: ( ( rule__ExpUnaria__MenosExpressaoAssignment_0 ) )
                    {
                    // InternalImperativa1.g:925:2: ( ( rule__ExpUnaria__MenosExpressaoAssignment_0 ) )
                    // InternalImperativa1.g:926:3: ( rule__ExpUnaria__MenosExpressaoAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpUnariaAccess().getMenosExpressaoAssignment_0()); 
                    }
                    // InternalImperativa1.g:927:3: ( rule__ExpUnaria__MenosExpressaoAssignment_0 )
                    // InternalImperativa1.g:927:4: rule__ExpUnaria__MenosExpressaoAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpUnaria__MenosExpressaoAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpUnariaAccess().getMenosExpressaoAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:931:2: ( ( rule__ExpUnaria__NotExpressaoAssignment_1 ) )
                    {
                    // InternalImperativa1.g:931:2: ( ( rule__ExpUnaria__NotExpressaoAssignment_1 ) )
                    // InternalImperativa1.g:932:3: ( rule__ExpUnaria__NotExpressaoAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpUnariaAccess().getNotExpressaoAssignment_1()); 
                    }
                    // InternalImperativa1.g:933:3: ( rule__ExpUnaria__NotExpressaoAssignment_1 )
                    // InternalImperativa1.g:933:4: rule__ExpUnaria__NotExpressaoAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpUnaria__NotExpressaoAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpUnariaAccess().getNotExpressaoAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalImperativa1.g:937:2: ( ( rule__ExpUnaria__LengthExpressaoAssignment_2 ) )
                    {
                    // InternalImperativa1.g:937:2: ( ( rule__ExpUnaria__LengthExpressaoAssignment_2 ) )
                    // InternalImperativa1.g:938:3: ( rule__ExpUnaria__LengthExpressaoAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpUnariaAccess().getLengthExpressaoAssignment_2()); 
                    }
                    // InternalImperativa1.g:939:3: ( rule__ExpUnaria__LengthExpressaoAssignment_2 )
                    // InternalImperativa1.g:939:4: rule__ExpUnaria__LengthExpressaoAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpUnaria__LengthExpressaoAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpUnariaAccess().getLengthExpressaoAssignment_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpUnaria__Alternatives"


    // $ANTLR start "rule__ExpBinaria__Alternatives"
    // InternalImperativa1.g:947:1: rule__ExpBinaria__Alternatives : ( ( ( rule__ExpBinaria__SomaExpressaoAssignment_0 ) ) | ( ( rule__ExpBinaria__SubExpressaoAssignment_1 ) ) | ( ( rule__ExpBinaria__OrExpressaoAssignment_2 ) ) | ( ( rule__ExpBinaria__AndExpressaoAssignment_3 ) ) | ( ( rule__ExpBinaria__EqualsExpressaoAssignment_4 ) ) | ( ( rule__ExpBinaria__ConcatExpressaoAssignment_5 ) ) );
    public final void rule__ExpBinaria__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:951:1: ( ( ( rule__ExpBinaria__SomaExpressaoAssignment_0 ) ) | ( ( rule__ExpBinaria__SubExpressaoAssignment_1 ) ) | ( ( rule__ExpBinaria__OrExpressaoAssignment_2 ) ) | ( ( rule__ExpBinaria__AndExpressaoAssignment_3 ) ) | ( ( rule__ExpBinaria__EqualsExpressaoAssignment_4 ) ) | ( ( rule__ExpBinaria__ConcatExpressaoAssignment_5 ) ) )
            int alt8=6;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalImperativa1.g:952:2: ( ( rule__ExpBinaria__SomaExpressaoAssignment_0 ) )
                    {
                    // InternalImperativa1.g:952:2: ( ( rule__ExpBinaria__SomaExpressaoAssignment_0 ) )
                    // InternalImperativa1.g:953:3: ( rule__ExpBinaria__SomaExpressaoAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpBinariaAccess().getSomaExpressaoAssignment_0()); 
                    }
                    // InternalImperativa1.g:954:3: ( rule__ExpBinaria__SomaExpressaoAssignment_0 )
                    // InternalImperativa1.g:954:4: rule__ExpBinaria__SomaExpressaoAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpBinaria__SomaExpressaoAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpBinariaAccess().getSomaExpressaoAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:958:2: ( ( rule__ExpBinaria__SubExpressaoAssignment_1 ) )
                    {
                    // InternalImperativa1.g:958:2: ( ( rule__ExpBinaria__SubExpressaoAssignment_1 ) )
                    // InternalImperativa1.g:959:3: ( rule__ExpBinaria__SubExpressaoAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpBinariaAccess().getSubExpressaoAssignment_1()); 
                    }
                    // InternalImperativa1.g:960:3: ( rule__ExpBinaria__SubExpressaoAssignment_1 )
                    // InternalImperativa1.g:960:4: rule__ExpBinaria__SubExpressaoAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpBinaria__SubExpressaoAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpBinariaAccess().getSubExpressaoAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalImperativa1.g:964:2: ( ( rule__ExpBinaria__OrExpressaoAssignment_2 ) )
                    {
                    // InternalImperativa1.g:964:2: ( ( rule__ExpBinaria__OrExpressaoAssignment_2 ) )
                    // InternalImperativa1.g:965:3: ( rule__ExpBinaria__OrExpressaoAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpBinariaAccess().getOrExpressaoAssignment_2()); 
                    }
                    // InternalImperativa1.g:966:3: ( rule__ExpBinaria__OrExpressaoAssignment_2 )
                    // InternalImperativa1.g:966:4: rule__ExpBinaria__OrExpressaoAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpBinaria__OrExpressaoAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpBinariaAccess().getOrExpressaoAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalImperativa1.g:970:2: ( ( rule__ExpBinaria__AndExpressaoAssignment_3 ) )
                    {
                    // InternalImperativa1.g:970:2: ( ( rule__ExpBinaria__AndExpressaoAssignment_3 ) )
                    // InternalImperativa1.g:971:3: ( rule__ExpBinaria__AndExpressaoAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpBinariaAccess().getAndExpressaoAssignment_3()); 
                    }
                    // InternalImperativa1.g:972:3: ( rule__ExpBinaria__AndExpressaoAssignment_3 )
                    // InternalImperativa1.g:972:4: rule__ExpBinaria__AndExpressaoAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpBinaria__AndExpressaoAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpBinariaAccess().getAndExpressaoAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalImperativa1.g:976:2: ( ( rule__ExpBinaria__EqualsExpressaoAssignment_4 ) )
                    {
                    // InternalImperativa1.g:976:2: ( ( rule__ExpBinaria__EqualsExpressaoAssignment_4 ) )
                    // InternalImperativa1.g:977:3: ( rule__ExpBinaria__EqualsExpressaoAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpBinariaAccess().getEqualsExpressaoAssignment_4()); 
                    }
                    // InternalImperativa1.g:978:3: ( rule__ExpBinaria__EqualsExpressaoAssignment_4 )
                    // InternalImperativa1.g:978:4: rule__ExpBinaria__EqualsExpressaoAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpBinaria__EqualsExpressaoAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpBinariaAccess().getEqualsExpressaoAssignment_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalImperativa1.g:982:2: ( ( rule__ExpBinaria__ConcatExpressaoAssignment_5 ) )
                    {
                    // InternalImperativa1.g:982:2: ( ( rule__ExpBinaria__ConcatExpressaoAssignment_5 ) )
                    // InternalImperativa1.g:983:3: ( rule__ExpBinaria__ConcatExpressaoAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpBinariaAccess().getConcatExpressaoAssignment_5()); 
                    }
                    // InternalImperativa1.g:984:3: ( rule__ExpBinaria__ConcatExpressaoAssignment_5 )
                    // InternalImperativa1.g:984:4: rule__ExpBinaria__ConcatExpressaoAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpBinaria__ConcatExpressaoAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpBinariaAccess().getConcatExpressaoAssignment_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpBinaria__Alternatives"


    // $ANTLR start "rule__Expressao__Alternatives"
    // InternalImperativa1.g:992:1: rule__Expressao__Alternatives : ( ( ( rule__Expressao__ExpUnariaAssignment_0 ) ) | ( ( rule__Expressao__ExpPrimariaAssignment_1 ) ) | ( ( rule__Expressao__ExpBinariaAssignment_2 ) ) );
    public final void rule__Expressao__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:996:1: ( ( ( rule__Expressao__ExpUnariaAssignment_0 ) ) | ( ( rule__Expressao__ExpPrimariaAssignment_1 ) ) | ( ( rule__Expressao__ExpBinariaAssignment_2 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 25:
            case 26:
            case 27:
                {
                alt9=1;
                }
                break;
            case RULE_VALORSTRING:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==EOF||(LA9_2>=RULE_VALORSTRING && LA9_2<=RULE_VALORINTEIRO)||(LA9_2>=14 && LA9_2<=23)||(LA9_2>=33 && LA9_2<=35)||LA9_2==38) ) {
                    alt9=2;
                }
                else if ( (LA9_2==25||(LA9_2>=28 && LA9_2<=32)) ) {
                    alt9=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VALORINTEIRO:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==EOF||LA9_3==RULE_VALORSTRING||(LA9_3>=14 && LA9_3<=23)||(LA9_3>=33 && LA9_3<=35)||LA9_3==38) ) {
                    alt9=2;
                }
                else if ( (LA9_3==25||(LA9_3>=28 && LA9_3<=32)) ) {
                    alt9=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VALORBOOLEANO:
                {
                int LA9_4 = input.LA(2);

                if ( (LA9_4==EOF||LA9_4==RULE_VALORSTRING||(LA9_4>=14 && LA9_4<=23)||(LA9_4>=33 && LA9_4<=35)||LA9_4==38) ) {
                    alt9=2;
                }
                else if ( (LA9_4==25||(LA9_4>=28 && LA9_4<=32)) ) {
                    alt9=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                alt9=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalImperativa1.g:997:2: ( ( rule__Expressao__ExpUnariaAssignment_0 ) )
                    {
                    // InternalImperativa1.g:997:2: ( ( rule__Expressao__ExpUnariaAssignment_0 ) )
                    // InternalImperativa1.g:998:3: ( rule__Expressao__ExpUnariaAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressaoAccess().getExpUnariaAssignment_0()); 
                    }
                    // InternalImperativa1.g:999:3: ( rule__Expressao__ExpUnariaAssignment_0 )
                    // InternalImperativa1.g:999:4: rule__Expressao__ExpUnariaAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expressao__ExpUnariaAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressaoAccess().getExpUnariaAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:1003:2: ( ( rule__Expressao__ExpPrimariaAssignment_1 ) )
                    {
                    // InternalImperativa1.g:1003:2: ( ( rule__Expressao__ExpPrimariaAssignment_1 ) )
                    // InternalImperativa1.g:1004:3: ( rule__Expressao__ExpPrimariaAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressaoAccess().getExpPrimariaAssignment_1()); 
                    }
                    // InternalImperativa1.g:1005:3: ( rule__Expressao__ExpPrimariaAssignment_1 )
                    // InternalImperativa1.g:1005:4: rule__Expressao__ExpPrimariaAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expressao__ExpPrimariaAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressaoAccess().getExpPrimariaAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalImperativa1.g:1009:2: ( ( rule__Expressao__ExpBinariaAssignment_2 ) )
                    {
                    // InternalImperativa1.g:1009:2: ( ( rule__Expressao__ExpBinariaAssignment_2 ) )
                    // InternalImperativa1.g:1010:3: ( rule__Expressao__ExpBinariaAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressaoAccess().getExpBinariaAssignment_2()); 
                    }
                    // InternalImperativa1.g:1011:3: ( rule__Expressao__ExpBinariaAssignment_2 )
                    // InternalImperativa1.g:1011:4: rule__Expressao__ExpBinariaAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expressao__ExpBinariaAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressaoAccess().getExpBinariaAssignment_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Alternatives"


    // $ANTLR start "rule__ComandoSimples__Alternatives"
    // InternalImperativa1.g:1019:1: rule__ComandoSimples__Alternatives : ( ( ( rule__ComandoSimples__SkipAssignment_0 ) ) | ( ( rule__ComandoSimples__AtribuicaoAssignment_1 ) ) | ( ( rule__ComandoSimples__ComandoDeclaracaoAssignment_2 ) ) | ( ( rule__ComandoSimples__WhileAssignment_3 ) ) | ( ( rule__ComandoSimples__IfThenElseAssignment_4 ) ) | ( ( rule__ComandoSimples__IoAssignment_5 ) ) | ( ( rule__ComandoSimples__Group_6__0 ) ) );
    public final void rule__ComandoSimples__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1023:1: ( ( ( rule__ComandoSimples__SkipAssignment_0 ) ) | ( ( rule__ComandoSimples__AtribuicaoAssignment_1 ) ) | ( ( rule__ComandoSimples__ComandoDeclaracaoAssignment_2 ) ) | ( ( rule__ComandoSimples__WhileAssignment_3 ) ) | ( ( rule__ComandoSimples__IfThenElseAssignment_4 ) ) | ( ( rule__ComandoSimples__IoAssignment_5 ) ) | ( ( rule__ComandoSimples__Group_6__0 ) ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt10=1;
                }
                break;
            case RULE_VALORSTRING:
                {
                alt10=2;
                }
                break;
            case 33:
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalImperativa1.g:1024:2: ( ( rule__ComandoSimples__SkipAssignment_0 ) )
                    {
                    // InternalImperativa1.g:1024:2: ( ( rule__ComandoSimples__SkipAssignment_0 ) )
                    // InternalImperativa1.g:1025:3: ( rule__ComandoSimples__SkipAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComandoSimplesAccess().getSkipAssignment_0()); 
                    }
                    // InternalImperativa1.g:1026:3: ( rule__ComandoSimples__SkipAssignment_0 )
                    // InternalImperativa1.g:1026:4: rule__ComandoSimples__SkipAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComandoSimples__SkipAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComandoSimplesAccess().getSkipAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:1030:2: ( ( rule__ComandoSimples__AtribuicaoAssignment_1 ) )
                    {
                    // InternalImperativa1.g:1030:2: ( ( rule__ComandoSimples__AtribuicaoAssignment_1 ) )
                    // InternalImperativa1.g:1031:3: ( rule__ComandoSimples__AtribuicaoAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComandoSimplesAccess().getAtribuicaoAssignment_1()); 
                    }
                    // InternalImperativa1.g:1032:3: ( rule__ComandoSimples__AtribuicaoAssignment_1 )
                    // InternalImperativa1.g:1032:4: rule__ComandoSimples__AtribuicaoAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComandoSimples__AtribuicaoAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComandoSimplesAccess().getAtribuicaoAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalImperativa1.g:1036:2: ( ( rule__ComandoSimples__ComandoDeclaracaoAssignment_2 ) )
                    {
                    // InternalImperativa1.g:1036:2: ( ( rule__ComandoSimples__ComandoDeclaracaoAssignment_2 ) )
                    // InternalImperativa1.g:1037:3: ( rule__ComandoSimples__ComandoDeclaracaoAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComandoSimplesAccess().getComandoDeclaracaoAssignment_2()); 
                    }
                    // InternalImperativa1.g:1038:3: ( rule__ComandoSimples__ComandoDeclaracaoAssignment_2 )
                    // InternalImperativa1.g:1038:4: rule__ComandoSimples__ComandoDeclaracaoAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComandoSimples__ComandoDeclaracaoAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComandoSimplesAccess().getComandoDeclaracaoAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalImperativa1.g:1042:2: ( ( rule__ComandoSimples__WhileAssignment_3 ) )
                    {
                    // InternalImperativa1.g:1042:2: ( ( rule__ComandoSimples__WhileAssignment_3 ) )
                    // InternalImperativa1.g:1043:3: ( rule__ComandoSimples__WhileAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComandoSimplesAccess().getWhileAssignment_3()); 
                    }
                    // InternalImperativa1.g:1044:3: ( rule__ComandoSimples__WhileAssignment_3 )
                    // InternalImperativa1.g:1044:4: rule__ComandoSimples__WhileAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComandoSimples__WhileAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComandoSimplesAccess().getWhileAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalImperativa1.g:1048:2: ( ( rule__ComandoSimples__IfThenElseAssignment_4 ) )
                    {
                    // InternalImperativa1.g:1048:2: ( ( rule__ComandoSimples__IfThenElseAssignment_4 ) )
                    // InternalImperativa1.g:1049:3: ( rule__ComandoSimples__IfThenElseAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComandoSimplesAccess().getIfThenElseAssignment_4()); 
                    }
                    // InternalImperativa1.g:1050:3: ( rule__ComandoSimples__IfThenElseAssignment_4 )
                    // InternalImperativa1.g:1050:4: rule__ComandoSimples__IfThenElseAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComandoSimples__IfThenElseAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComandoSimplesAccess().getIfThenElseAssignment_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalImperativa1.g:1054:2: ( ( rule__ComandoSimples__IoAssignment_5 ) )
                    {
                    // InternalImperativa1.g:1054:2: ( ( rule__ComandoSimples__IoAssignment_5 ) )
                    // InternalImperativa1.g:1055:3: ( rule__ComandoSimples__IoAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComandoSimplesAccess().getIoAssignment_5()); 
                    }
                    // InternalImperativa1.g:1056:3: ( rule__ComandoSimples__IoAssignment_5 )
                    // InternalImperativa1.g:1056:4: rule__ComandoSimples__IoAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComandoSimples__IoAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComandoSimplesAccess().getIoAssignment_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalImperativa1.g:1060:2: ( ( rule__ComandoSimples__Group_6__0 ) )
                    {
                    // InternalImperativa1.g:1060:2: ( ( rule__ComandoSimples__Group_6__0 ) )
                    // InternalImperativa1.g:1061:3: ( rule__ComandoSimples__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComandoSimplesAccess().getGroup_6()); 
                    }
                    // InternalImperativa1.g:1062:3: ( rule__ComandoSimples__Group_6__0 )
                    // InternalImperativa1.g:1062:4: rule__ComandoSimples__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComandoSimples__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComandoSimplesAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSimples__Alternatives"


    // $ANTLR start "rule__Declaracao__Alternatives"
    // InternalImperativa1.g:1070:1: rule__Declaracao__Alternatives : ( ( ( rule__Declaracao__DecCompostaAssignment_0 ) ) | ( ( rule__Declaracao__DecVariavelAssignment_1 ) ) | ( ( rule__Declaracao__Group_2__0 ) ) );
    public final void rule__Declaracao__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1074:1: ( ( ( rule__Declaracao__DecCompostaAssignment_0 ) ) | ( ( rule__Declaracao__DecVariavelAssignment_1 ) ) | ( ( rule__Declaracao__Group_2__0 ) ) )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred24_InternalImperativa1()) ) {
                    alt11=1;
                }
                else if ( (synpred25_InternalImperativa1()) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==16) ) {
                alt11=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalImperativa1.g:1075:2: ( ( rule__Declaracao__DecCompostaAssignment_0 ) )
                    {
                    // InternalImperativa1.g:1075:2: ( ( rule__Declaracao__DecCompostaAssignment_0 ) )
                    // InternalImperativa1.g:1076:3: ( rule__Declaracao__DecCompostaAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclaracaoAccess().getDecCompostaAssignment_0()); 
                    }
                    // InternalImperativa1.g:1077:3: ( rule__Declaracao__DecCompostaAssignment_0 )
                    // InternalImperativa1.g:1077:4: rule__Declaracao__DecCompostaAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaracao__DecCompostaAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclaracaoAccess().getDecCompostaAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalImperativa1.g:1081:2: ( ( rule__Declaracao__DecVariavelAssignment_1 ) )
                    {
                    // InternalImperativa1.g:1081:2: ( ( rule__Declaracao__DecVariavelAssignment_1 ) )
                    // InternalImperativa1.g:1082:3: ( rule__Declaracao__DecVariavelAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclaracaoAccess().getDecVariavelAssignment_1()); 
                    }
                    // InternalImperativa1.g:1083:3: ( rule__Declaracao__DecVariavelAssignment_1 )
                    // InternalImperativa1.g:1083:4: rule__Declaracao__DecVariavelAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaracao__DecVariavelAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclaracaoAccess().getDecVariavelAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalImperativa1.g:1087:2: ( ( rule__Declaracao__Group_2__0 ) )
                    {
                    // InternalImperativa1.g:1087:2: ( ( rule__Declaracao__Group_2__0 ) )
                    // InternalImperativa1.g:1088:3: ( rule__Declaracao__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclaracaoAccess().getGroup_2()); 
                    }
                    // InternalImperativa1.g:1089:3: ( rule__Declaracao__Group_2__0 )
                    // InternalImperativa1.g:1089:4: rule__Declaracao__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Declaracao__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclaracaoAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaracao__Alternatives"


    // $ANTLR start "rule__SequenciaComando__Group__0"
    // InternalImperativa1.g:1097:1: rule__SequenciaComando__Group__0 : rule__SequenciaComando__Group__0__Impl rule__SequenciaComando__Group__1 ;
    public final void rule__SequenciaComando__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1101:1: ( rule__SequenciaComando__Group__0__Impl rule__SequenciaComando__Group__1 )
            // InternalImperativa1.g:1102:2: rule__SequenciaComando__Group__0__Impl rule__SequenciaComando__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SequenciaComando__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenciaComando__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenciaComando__Group__0"


    // $ANTLR start "rule__SequenciaComando__Group__0__Impl"
    // InternalImperativa1.g:1109:1: rule__SequenciaComando__Group__0__Impl : ( ( rule__SequenciaComando__ComandoSimplesAssignment_0 ) ) ;
    public final void rule__SequenciaComando__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1113:1: ( ( ( rule__SequenciaComando__ComandoSimplesAssignment_0 ) ) )
            // InternalImperativa1.g:1114:1: ( ( rule__SequenciaComando__ComandoSimplesAssignment_0 ) )
            {
            // InternalImperativa1.g:1114:1: ( ( rule__SequenciaComando__ComandoSimplesAssignment_0 ) )
            // InternalImperativa1.g:1115:2: ( rule__SequenciaComando__ComandoSimplesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenciaComandoAccess().getComandoSimplesAssignment_0()); 
            }
            // InternalImperativa1.g:1116:2: ( rule__SequenciaComando__ComandoSimplesAssignment_0 )
            // InternalImperativa1.g:1116:3: rule__SequenciaComando__ComandoSimplesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SequenciaComando__ComandoSimplesAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenciaComandoAccess().getComandoSimplesAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenciaComando__Group__0__Impl"


    // $ANTLR start "rule__SequenciaComando__Group__1"
    // InternalImperativa1.g:1124:1: rule__SequenciaComando__Group__1 : rule__SequenciaComando__Group__1__Impl rule__SequenciaComando__Group__2 ;
    public final void rule__SequenciaComando__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1128:1: ( rule__SequenciaComando__Group__1__Impl rule__SequenciaComando__Group__2 )
            // InternalImperativa1.g:1129:2: rule__SequenciaComando__Group__1__Impl rule__SequenciaComando__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SequenciaComando__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SequenciaComando__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenciaComando__Group__1"


    // $ANTLR start "rule__SequenciaComando__Group__1__Impl"
    // InternalImperativa1.g:1136:1: rule__SequenciaComando__Group__1__Impl : ( ';' ) ;
    public final void rule__SequenciaComando__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1140:1: ( ( ';' ) )
            // InternalImperativa1.g:1141:1: ( ';' )
            {
            // InternalImperativa1.g:1141:1: ( ';' )
            // InternalImperativa1.g:1142:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenciaComandoAccess().getSemicolonKeyword_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenciaComandoAccess().getSemicolonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenciaComando__Group__1__Impl"


    // $ANTLR start "rule__SequenciaComando__Group__2"
    // InternalImperativa1.g:1151:1: rule__SequenciaComando__Group__2 : rule__SequenciaComando__Group__2__Impl ;
    public final void rule__SequenciaComando__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1155:1: ( rule__SequenciaComando__Group__2__Impl )
            // InternalImperativa1.g:1156:2: rule__SequenciaComando__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenciaComando__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenciaComando__Group__2"


    // $ANTLR start "rule__SequenciaComando__Group__2__Impl"
    // InternalImperativa1.g:1162:1: rule__SequenciaComando__Group__2__Impl : ( ( rule__SequenciaComando__ComandoAssignment_2 ) ) ;
    public final void rule__SequenciaComando__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1166:1: ( ( ( rule__SequenciaComando__ComandoAssignment_2 ) ) )
            // InternalImperativa1.g:1167:1: ( ( rule__SequenciaComando__ComandoAssignment_2 ) )
            {
            // InternalImperativa1.g:1167:1: ( ( rule__SequenciaComando__ComandoAssignment_2 ) )
            // InternalImperativa1.g:1168:2: ( rule__SequenciaComando__ComandoAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenciaComandoAccess().getComandoAssignment_2()); 
            }
            // InternalImperativa1.g:1169:2: ( rule__SequenciaComando__ComandoAssignment_2 )
            // InternalImperativa1.g:1169:3: rule__SequenciaComando__ComandoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenciaComando__ComandoAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenciaComandoAccess().getComandoAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenciaComando__Group__2__Impl"


    // $ANTLR start "rule__Read__Group__0"
    // InternalImperativa1.g:1178:1: rule__Read__Group__0 : rule__Read__Group__0__Impl rule__Read__Group__1 ;
    public final void rule__Read__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1182:1: ( rule__Read__Group__0__Impl rule__Read__Group__1 )
            // InternalImperativa1.g:1183:2: rule__Read__Group__0__Impl rule__Read__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Read__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Read__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__0"


    // $ANTLR start "rule__Read__Group__0__Impl"
    // InternalImperativa1.g:1190:1: rule__Read__Group__0__Impl : ( 'read' ) ;
    public final void rule__Read__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1194:1: ( ( 'read' ) )
            // InternalImperativa1.g:1195:1: ( 'read' )
            {
            // InternalImperativa1.g:1195:1: ( 'read' )
            // InternalImperativa1.g:1196:2: 'read'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadAccess().getReadKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReadAccess().getReadKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__0__Impl"


    // $ANTLR start "rule__Read__Group__1"
    // InternalImperativa1.g:1205:1: rule__Read__Group__1 : rule__Read__Group__1__Impl rule__Read__Group__2 ;
    public final void rule__Read__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1209:1: ( rule__Read__Group__1__Impl rule__Read__Group__2 )
            // InternalImperativa1.g:1210:2: rule__Read__Group__1__Impl rule__Read__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Read__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Read__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__1"


    // $ANTLR start "rule__Read__Group__1__Impl"
    // InternalImperativa1.g:1217:1: rule__Read__Group__1__Impl : ( '(' ) ;
    public final void rule__Read__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1221:1: ( ( '(' ) )
            // InternalImperativa1.g:1222:1: ( '(' )
            {
            // InternalImperativa1.g:1222:1: ( '(' )
            // InternalImperativa1.g:1223:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReadAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__1__Impl"


    // $ANTLR start "rule__Read__Group__2"
    // InternalImperativa1.g:1232:1: rule__Read__Group__2 : rule__Read__Group__2__Impl rule__Read__Group__3 ;
    public final void rule__Read__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1236:1: ( rule__Read__Group__2__Impl rule__Read__Group__3 )
            // InternalImperativa1.g:1237:2: rule__Read__Group__2__Impl rule__Read__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Read__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Read__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__2"


    // $ANTLR start "rule__Read__Group__2__Impl"
    // InternalImperativa1.g:1244:1: rule__Read__Group__2__Impl : ( ( rule__Read__PidAssignment_2 ) ) ;
    public final void rule__Read__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1248:1: ( ( ( rule__Read__PidAssignment_2 ) ) )
            // InternalImperativa1.g:1249:1: ( ( rule__Read__PidAssignment_2 ) )
            {
            // InternalImperativa1.g:1249:1: ( ( rule__Read__PidAssignment_2 ) )
            // InternalImperativa1.g:1250:2: ( rule__Read__PidAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadAccess().getPidAssignment_2()); 
            }
            // InternalImperativa1.g:1251:2: ( rule__Read__PidAssignment_2 )
            // InternalImperativa1.g:1251:3: rule__Read__PidAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Read__PidAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReadAccess().getPidAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__2__Impl"


    // $ANTLR start "rule__Read__Group__3"
    // InternalImperativa1.g:1259:1: rule__Read__Group__3 : rule__Read__Group__3__Impl ;
    public final void rule__Read__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1263:1: ( rule__Read__Group__3__Impl )
            // InternalImperativa1.g:1264:2: rule__Read__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Read__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__3"


    // $ANTLR start "rule__Read__Group__3__Impl"
    // InternalImperativa1.g:1270:1: rule__Read__Group__3__Impl : ( ')' ) ;
    public final void rule__Read__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1274:1: ( ( ')' ) )
            // InternalImperativa1.g:1275:1: ( ')' )
            {
            // InternalImperativa1.g:1275:1: ( ')' )
            // InternalImperativa1.g:1276:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReadAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__3__Impl"


    // $ANTLR start "rule__Write__Group__0"
    // InternalImperativa1.g:1286:1: rule__Write__Group__0 : rule__Write__Group__0__Impl rule__Write__Group__1 ;
    public final void rule__Write__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1290:1: ( rule__Write__Group__0__Impl rule__Write__Group__1 )
            // InternalImperativa1.g:1291:2: rule__Write__Group__0__Impl rule__Write__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Write__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Write__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__0"


    // $ANTLR start "rule__Write__Group__0__Impl"
    // InternalImperativa1.g:1298:1: rule__Write__Group__0__Impl : ( 'write' ) ;
    public final void rule__Write__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1302:1: ( ( 'write' ) )
            // InternalImperativa1.g:1303:1: ( 'write' )
            {
            // InternalImperativa1.g:1303:1: ( 'write' )
            // InternalImperativa1.g:1304:2: 'write'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteAccess().getWriteKeyword_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteAccess().getWriteKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__0__Impl"


    // $ANTLR start "rule__Write__Group__1"
    // InternalImperativa1.g:1313:1: rule__Write__Group__1 : rule__Write__Group__1__Impl rule__Write__Group__2 ;
    public final void rule__Write__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1317:1: ( rule__Write__Group__1__Impl rule__Write__Group__2 )
            // InternalImperativa1.g:1318:2: rule__Write__Group__1__Impl rule__Write__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Write__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Write__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__1"


    // $ANTLR start "rule__Write__Group__1__Impl"
    // InternalImperativa1.g:1325:1: rule__Write__Group__1__Impl : ( '(' ) ;
    public final void rule__Write__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1329:1: ( ( '(' ) )
            // InternalImperativa1.g:1330:1: ( '(' )
            {
            // InternalImperativa1.g:1330:1: ( '(' )
            // InternalImperativa1.g:1331:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__1__Impl"


    // $ANTLR start "rule__Write__Group__2"
    // InternalImperativa1.g:1340:1: rule__Write__Group__2 : rule__Write__Group__2__Impl rule__Write__Group__3 ;
    public final void rule__Write__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1344:1: ( rule__Write__Group__2__Impl rule__Write__Group__3 )
            // InternalImperativa1.g:1345:2: rule__Write__Group__2__Impl rule__Write__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Write__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Write__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__2"


    // $ANTLR start "rule__Write__Group__2__Impl"
    // InternalImperativa1.g:1352:1: rule__Write__Group__2__Impl : ( ( rule__Write__ExpressaoAssignment_2 ) ) ;
    public final void rule__Write__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1356:1: ( ( ( rule__Write__ExpressaoAssignment_2 ) ) )
            // InternalImperativa1.g:1357:1: ( ( rule__Write__ExpressaoAssignment_2 ) )
            {
            // InternalImperativa1.g:1357:1: ( ( rule__Write__ExpressaoAssignment_2 ) )
            // InternalImperativa1.g:1358:2: ( rule__Write__ExpressaoAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteAccess().getExpressaoAssignment_2()); 
            }
            // InternalImperativa1.g:1359:2: ( rule__Write__ExpressaoAssignment_2 )
            // InternalImperativa1.g:1359:3: rule__Write__ExpressaoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Write__ExpressaoAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteAccess().getExpressaoAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__2__Impl"


    // $ANTLR start "rule__Write__Group__3"
    // InternalImperativa1.g:1367:1: rule__Write__Group__3 : rule__Write__Group__3__Impl ;
    public final void rule__Write__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1371:1: ( rule__Write__Group__3__Impl )
            // InternalImperativa1.g:1372:2: rule__Write__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Write__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__3"


    // $ANTLR start "rule__Write__Group__3__Impl"
    // InternalImperativa1.g:1378:1: rule__Write__Group__3__Impl : ( ')' ) ;
    public final void rule__Write__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1382:1: ( ( ')' ) )
            // InternalImperativa1.g:1383:1: ( ')' )
            {
            // InternalImperativa1.g:1383:1: ( ')' )
            // InternalImperativa1.g:1384:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__3__Impl"


    // $ANTLR start "rule__IfThenElse__Group__0"
    // InternalImperativa1.g:1394:1: rule__IfThenElse__Group__0 : rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 ;
    public final void rule__IfThenElse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1398:1: ( rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 )
            // InternalImperativa1.g:1399:2: rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__IfThenElse__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfThenElse__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__0"


    // $ANTLR start "rule__IfThenElse__Group__0__Impl"
    // InternalImperativa1.g:1406:1: rule__IfThenElse__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfThenElse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1410:1: ( ( 'if' ) )
            // InternalImperativa1.g:1411:1: ( 'if' )
            {
            // InternalImperativa1.g:1411:1: ( 'if' )
            // InternalImperativa1.g:1412:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getIfKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__0__Impl"


    // $ANTLR start "rule__IfThenElse__Group__1"
    // InternalImperativa1.g:1421:1: rule__IfThenElse__Group__1 : rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 ;
    public final void rule__IfThenElse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1425:1: ( rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 )
            // InternalImperativa1.g:1426:2: rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__IfThenElse__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfThenElse__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__1"


    // $ANTLR start "rule__IfThenElse__Group__1__Impl"
    // InternalImperativa1.g:1433:1: rule__IfThenElse__Group__1__Impl : ( ( rule__IfThenElse__ExpressaoAssignment_1 ) ) ;
    public final void rule__IfThenElse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1437:1: ( ( ( rule__IfThenElse__ExpressaoAssignment_1 ) ) )
            // InternalImperativa1.g:1438:1: ( ( rule__IfThenElse__ExpressaoAssignment_1 ) )
            {
            // InternalImperativa1.g:1438:1: ( ( rule__IfThenElse__ExpressaoAssignment_1 ) )
            // InternalImperativa1.g:1439:2: ( rule__IfThenElse__ExpressaoAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getExpressaoAssignment_1()); 
            }
            // InternalImperativa1.g:1440:2: ( rule__IfThenElse__ExpressaoAssignment_1 )
            // InternalImperativa1.g:1440:3: rule__IfThenElse__ExpressaoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfThenElse__ExpressaoAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getExpressaoAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__1__Impl"


    // $ANTLR start "rule__IfThenElse__Group__2"
    // InternalImperativa1.g:1448:1: rule__IfThenElse__Group__2 : rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 ;
    public final void rule__IfThenElse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1452:1: ( rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 )
            // InternalImperativa1.g:1453:2: rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__IfThenElse__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfThenElse__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__2"


    // $ANTLR start "rule__IfThenElse__Group__2__Impl"
    // InternalImperativa1.g:1460:1: rule__IfThenElse__Group__2__Impl : ( 'then' ) ;
    public final void rule__IfThenElse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1464:1: ( ( 'then' ) )
            // InternalImperativa1.g:1465:1: ( 'then' )
            {
            // InternalImperativa1.g:1465:1: ( 'then' )
            // InternalImperativa1.g:1466:2: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getThenKeyword_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getThenKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__2__Impl"


    // $ANTLR start "rule__IfThenElse__Group__3"
    // InternalImperativa1.g:1475:1: rule__IfThenElse__Group__3 : rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 ;
    public final void rule__IfThenElse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1479:1: ( rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 )
            // InternalImperativa1.g:1480:2: rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__IfThenElse__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfThenElse__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__3"


    // $ANTLR start "rule__IfThenElse__Group__3__Impl"
    // InternalImperativa1.g:1487:1: rule__IfThenElse__Group__3__Impl : ( ( rule__IfThenElse__ComandoAssignment_3 ) ) ;
    public final void rule__IfThenElse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1491:1: ( ( ( rule__IfThenElse__ComandoAssignment_3 ) ) )
            // InternalImperativa1.g:1492:1: ( ( rule__IfThenElse__ComandoAssignment_3 ) )
            {
            // InternalImperativa1.g:1492:1: ( ( rule__IfThenElse__ComandoAssignment_3 ) )
            // InternalImperativa1.g:1493:2: ( rule__IfThenElse__ComandoAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getComandoAssignment_3()); 
            }
            // InternalImperativa1.g:1494:2: ( rule__IfThenElse__ComandoAssignment_3 )
            // InternalImperativa1.g:1494:3: rule__IfThenElse__ComandoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IfThenElse__ComandoAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getComandoAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__3__Impl"


    // $ANTLR start "rule__IfThenElse__Group__4"
    // InternalImperativa1.g:1502:1: rule__IfThenElse__Group__4 : rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 ;
    public final void rule__IfThenElse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1506:1: ( rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 )
            // InternalImperativa1.g:1507:2: rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__IfThenElse__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfThenElse__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__4"


    // $ANTLR start "rule__IfThenElse__Group__4__Impl"
    // InternalImperativa1.g:1514:1: rule__IfThenElse__Group__4__Impl : ( 'else' ) ;
    public final void rule__IfThenElse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1518:1: ( ( 'else' ) )
            // InternalImperativa1.g:1519:1: ( 'else' )
            {
            // InternalImperativa1.g:1519:1: ( 'else' )
            // InternalImperativa1.g:1520:2: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getElseKeyword_4()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getElseKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__4__Impl"


    // $ANTLR start "rule__IfThenElse__Group__5"
    // InternalImperativa1.g:1529:1: rule__IfThenElse__Group__5 : rule__IfThenElse__Group__5__Impl ;
    public final void rule__IfThenElse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1533:1: ( rule__IfThenElse__Group__5__Impl )
            // InternalImperativa1.g:1534:2: rule__IfThenElse__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfThenElse__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__5"


    // $ANTLR start "rule__IfThenElse__Group__5__Impl"
    // InternalImperativa1.g:1540:1: rule__IfThenElse__Group__5__Impl : ( ( rule__IfThenElse__ComandoAssignment_5 ) ) ;
    public final void rule__IfThenElse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1544:1: ( ( ( rule__IfThenElse__ComandoAssignment_5 ) ) )
            // InternalImperativa1.g:1545:1: ( ( rule__IfThenElse__ComandoAssignment_5 ) )
            {
            // InternalImperativa1.g:1545:1: ( ( rule__IfThenElse__ComandoAssignment_5 ) )
            // InternalImperativa1.g:1546:2: ( rule__IfThenElse__ComandoAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getComandoAssignment_5()); 
            }
            // InternalImperativa1.g:1547:2: ( rule__IfThenElse__ComandoAssignment_5 )
            // InternalImperativa1.g:1547:3: rule__IfThenElse__ComandoAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__IfThenElse__ComandoAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getComandoAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__5__Impl"


    // $ANTLR start "rule__While__Group__0"
    // InternalImperativa1.g:1556:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1560:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // InternalImperativa1.g:1561:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__While__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0"


    // $ANTLR start "rule__While__Group__0__Impl"
    // InternalImperativa1.g:1568:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1572:1: ( ( 'while' ) )
            // InternalImperativa1.g:1573:1: ( 'while' )
            {
            // InternalImperativa1.g:1573:1: ( 'while' )
            // InternalImperativa1.g:1574:2: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0__Impl"


    // $ANTLR start "rule__While__Group__1"
    // InternalImperativa1.g:1583:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1587:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // InternalImperativa1.g:1588:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__While__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1"


    // $ANTLR start "rule__While__Group__1__Impl"
    // InternalImperativa1.g:1595:1: rule__While__Group__1__Impl : ( ( rule__While__ExpressaoAssignment_1 ) ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1599:1: ( ( ( rule__While__ExpressaoAssignment_1 ) ) )
            // InternalImperativa1.g:1600:1: ( ( rule__While__ExpressaoAssignment_1 ) )
            {
            // InternalImperativa1.g:1600:1: ( ( rule__While__ExpressaoAssignment_1 ) )
            // InternalImperativa1.g:1601:2: ( rule__While__ExpressaoAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getExpressaoAssignment_1()); 
            }
            // InternalImperativa1.g:1602:2: ( rule__While__ExpressaoAssignment_1 )
            // InternalImperativa1.g:1602:3: rule__While__ExpressaoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__While__ExpressaoAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getExpressaoAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1__Impl"


    // $ANTLR start "rule__While__Group__2"
    // InternalImperativa1.g:1610:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1614:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // InternalImperativa1.g:1615:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__While__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2"


    // $ANTLR start "rule__While__Group__2__Impl"
    // InternalImperativa1.g:1622:1: rule__While__Group__2__Impl : ( 'do' ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1626:1: ( ( 'do' ) )
            // InternalImperativa1.g:1627:1: ( 'do' )
            {
            // InternalImperativa1.g:1627:1: ( 'do' )
            // InternalImperativa1.g:1628:2: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getDoKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getDoKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2__Impl"


    // $ANTLR start "rule__While__Group__3"
    // InternalImperativa1.g:1637:1: rule__While__Group__3 : rule__While__Group__3__Impl ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1641:1: ( rule__While__Group__3__Impl )
            // InternalImperativa1.g:1642:2: rule__While__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__3"


    // $ANTLR start "rule__While__Group__3__Impl"
    // InternalImperativa1.g:1648:1: rule__While__Group__3__Impl : ( ( rule__While__ComandoAssignment_3 ) ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1652:1: ( ( ( rule__While__ComandoAssignment_3 ) ) )
            // InternalImperativa1.g:1653:1: ( ( rule__While__ComandoAssignment_3 ) )
            {
            // InternalImperativa1.g:1653:1: ( ( rule__While__ComandoAssignment_3 ) )
            // InternalImperativa1.g:1654:2: ( rule__While__ComandoAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getComandoAssignment_3()); 
            }
            // InternalImperativa1.g:1655:2: ( rule__While__ComandoAssignment_3 )
            // InternalImperativa1.g:1655:3: rule__While__ComandoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__While__ComandoAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getComandoAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__3__Impl"


    // $ANTLR start "rule__Atribuicao__Group__0"
    // InternalImperativa1.g:1664:1: rule__Atribuicao__Group__0 : rule__Atribuicao__Group__0__Impl rule__Atribuicao__Group__1 ;
    public final void rule__Atribuicao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1668:1: ( rule__Atribuicao__Group__0__Impl rule__Atribuicao__Group__1 )
            // InternalImperativa1.g:1669:2: rule__Atribuicao__Group__0__Impl rule__Atribuicao__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Atribuicao__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atribuicao__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuicao__Group__0"


    // $ANTLR start "rule__Atribuicao__Group__0__Impl"
    // InternalImperativa1.g:1676:1: rule__Atribuicao__Group__0__Impl : ( ( rule__Atribuicao__PidAssignment_0 ) ) ;
    public final void rule__Atribuicao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1680:1: ( ( ( rule__Atribuicao__PidAssignment_0 ) ) )
            // InternalImperativa1.g:1681:1: ( ( rule__Atribuicao__PidAssignment_0 ) )
            {
            // InternalImperativa1.g:1681:1: ( ( rule__Atribuicao__PidAssignment_0 ) )
            // InternalImperativa1.g:1682:2: ( rule__Atribuicao__PidAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribuicaoAccess().getPidAssignment_0()); 
            }
            // InternalImperativa1.g:1683:2: ( rule__Atribuicao__PidAssignment_0 )
            // InternalImperativa1.g:1683:3: rule__Atribuicao__PidAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Atribuicao__PidAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtribuicaoAccess().getPidAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuicao__Group__0__Impl"


    // $ANTLR start "rule__Atribuicao__Group__1"
    // InternalImperativa1.g:1691:1: rule__Atribuicao__Group__1 : rule__Atribuicao__Group__1__Impl rule__Atribuicao__Group__2 ;
    public final void rule__Atribuicao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1695:1: ( rule__Atribuicao__Group__1__Impl rule__Atribuicao__Group__2 )
            // InternalImperativa1.g:1696:2: rule__Atribuicao__Group__1__Impl rule__Atribuicao__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Atribuicao__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atribuicao__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuicao__Group__1"


    // $ANTLR start "rule__Atribuicao__Group__1__Impl"
    // InternalImperativa1.g:1703:1: rule__Atribuicao__Group__1__Impl : ( ':=' ) ;
    public final void rule__Atribuicao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1707:1: ( ( ':=' ) )
            // InternalImperativa1.g:1708:1: ( ':=' )
            {
            // InternalImperativa1.g:1708:1: ( ':=' )
            // InternalImperativa1.g:1709:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribuicaoAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtribuicaoAccess().getColonEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuicao__Group__1__Impl"


    // $ANTLR start "rule__Atribuicao__Group__2"
    // InternalImperativa1.g:1718:1: rule__Atribuicao__Group__2 : rule__Atribuicao__Group__2__Impl ;
    public final void rule__Atribuicao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1722:1: ( rule__Atribuicao__Group__2__Impl )
            // InternalImperativa1.g:1723:2: rule__Atribuicao__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atribuicao__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuicao__Group__2"


    // $ANTLR start "rule__Atribuicao__Group__2__Impl"
    // InternalImperativa1.g:1729:1: rule__Atribuicao__Group__2__Impl : ( ( rule__Atribuicao__ExpressaoAssignment_2 ) ) ;
    public final void rule__Atribuicao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1733:1: ( ( ( rule__Atribuicao__ExpressaoAssignment_2 ) ) )
            // InternalImperativa1.g:1734:1: ( ( rule__Atribuicao__ExpressaoAssignment_2 ) )
            {
            // InternalImperativa1.g:1734:1: ( ( rule__Atribuicao__ExpressaoAssignment_2 ) )
            // InternalImperativa1.g:1735:2: ( rule__Atribuicao__ExpressaoAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribuicaoAccess().getExpressaoAssignment_2()); 
            }
            // InternalImperativa1.g:1736:2: ( rule__Atribuicao__ExpressaoAssignment_2 )
            // InternalImperativa1.g:1736:3: rule__Atribuicao__ExpressaoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Atribuicao__ExpressaoAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtribuicaoAccess().getExpressaoAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuicao__Group__2__Impl"


    // $ANTLR start "rule__PId__Group__0"
    // InternalImperativa1.g:1745:1: rule__PId__Group__0 : rule__PId__Group__0__Impl rule__PId__Group__1 ;
    public final void rule__PId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1749:1: ( rule__PId__Group__0__Impl rule__PId__Group__1 )
            // InternalImperativa1.g:1750:2: rule__PId__Group__0__Impl rule__PId__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__PId__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PId__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PId__Group__0"


    // $ANTLR start "rule__PId__Group__0__Impl"
    // InternalImperativa1.g:1757:1: rule__PId__Group__0__Impl : ( RULE_VALORSTRING ) ;
    public final void rule__PId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1761:1: ( ( RULE_VALORSTRING ) )
            // InternalImperativa1.g:1762:1: ( RULE_VALORSTRING )
            {
            // InternalImperativa1.g:1762:1: ( RULE_VALORSTRING )
            // InternalImperativa1.g:1763:2: RULE_VALORSTRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPIdAccess().getVALORSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_VALORSTRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPIdAccess().getVALORSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PId__Group__0__Impl"


    // $ANTLR start "rule__PId__Group__1"
    // InternalImperativa1.g:1772:1: rule__PId__Group__1 : rule__PId__Group__1__Impl ;
    public final void rule__PId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1776:1: ( rule__PId__Group__1__Impl )
            // InternalImperativa1.g:1777:2: rule__PId__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PId__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PId__Group__1"


    // $ANTLR start "rule__PId__Group__1__Impl"
    // InternalImperativa1.g:1783:1: rule__PId__Group__1__Impl : ( ( rule__PId__Alternatives_1 )* ) ;
    public final void rule__PId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1787:1: ( ( ( rule__PId__Alternatives_1 )* ) )
            // InternalImperativa1.g:1788:1: ( ( rule__PId__Alternatives_1 )* )
            {
            // InternalImperativa1.g:1788:1: ( ( rule__PId__Alternatives_1 )* )
            // InternalImperativa1.g:1789:2: ( rule__PId__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPIdAccess().getAlternatives_1()); 
            }
            // InternalImperativa1.g:1790:2: ( rule__PId__Alternatives_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_VALORSTRING) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred26_InternalImperativa1()) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==RULE_VALORINTEIRO) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalImperativa1.g:1790:3: rule__PId__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__PId__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPIdAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PId__Group__1__Impl"


    // $ANTLR start "rule__ExpMenos__Group__0"
    // InternalImperativa1.g:1799:1: rule__ExpMenos__Group__0 : rule__ExpMenos__Group__0__Impl rule__ExpMenos__Group__1 ;
    public final void rule__ExpMenos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1803:1: ( rule__ExpMenos__Group__0__Impl rule__ExpMenos__Group__1 )
            // InternalImperativa1.g:1804:2: rule__ExpMenos__Group__0__Impl rule__ExpMenos__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ExpMenos__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpMenos__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpMenos__Group__0"


    // $ANTLR start "rule__ExpMenos__Group__0__Impl"
    // InternalImperativa1.g:1811:1: rule__ExpMenos__Group__0__Impl : ( '-' ) ;
    public final void rule__ExpMenos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1815:1: ( ( '-' ) )
            // InternalImperativa1.g:1816:1: ( '-' )
            {
            // InternalImperativa1.g:1816:1: ( '-' )
            // InternalImperativa1.g:1817:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpMenosAccess().getHyphenMinusKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpMenosAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpMenos__Group__0__Impl"


    // $ANTLR start "rule__ExpMenos__Group__1"
    // InternalImperativa1.g:1826:1: rule__ExpMenos__Group__1 : rule__ExpMenos__Group__1__Impl ;
    public final void rule__ExpMenos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1830:1: ( rule__ExpMenos__Group__1__Impl )
            // InternalImperativa1.g:1831:2: rule__ExpMenos__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpMenos__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpMenos__Group__1"


    // $ANTLR start "rule__ExpMenos__Group__1__Impl"
    // InternalImperativa1.g:1837:1: rule__ExpMenos__Group__1__Impl : ( ( rule__ExpMenos__MenosExpressaoAssignment_1 ) ) ;
    public final void rule__ExpMenos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1841:1: ( ( ( rule__ExpMenos__MenosExpressaoAssignment_1 ) ) )
            // InternalImperativa1.g:1842:1: ( ( rule__ExpMenos__MenosExpressaoAssignment_1 ) )
            {
            // InternalImperativa1.g:1842:1: ( ( rule__ExpMenos__MenosExpressaoAssignment_1 ) )
            // InternalImperativa1.g:1843:2: ( rule__ExpMenos__MenosExpressaoAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpMenosAccess().getMenosExpressaoAssignment_1()); 
            }
            // InternalImperativa1.g:1844:2: ( rule__ExpMenos__MenosExpressaoAssignment_1 )
            // InternalImperativa1.g:1844:3: rule__ExpMenos__MenosExpressaoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpMenos__MenosExpressaoAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpMenosAccess().getMenosExpressaoAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpMenos__Group__1__Impl"


    // $ANTLR start "rule__ExpNot__Group__0"
    // InternalImperativa1.g:1853:1: rule__ExpNot__Group__0 : rule__ExpNot__Group__0__Impl rule__ExpNot__Group__1 ;
    public final void rule__ExpNot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1857:1: ( rule__ExpNot__Group__0__Impl rule__ExpNot__Group__1 )
            // InternalImperativa1.g:1858:2: rule__ExpNot__Group__0__Impl rule__ExpNot__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ExpNot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpNot__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpNot__Group__0"


    // $ANTLR start "rule__ExpNot__Group__0__Impl"
    // InternalImperativa1.g:1865:1: rule__ExpNot__Group__0__Impl : ( 'not' ) ;
    public final void rule__ExpNot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1869:1: ( ( 'not' ) )
            // InternalImperativa1.g:1870:1: ( 'not' )
            {
            // InternalImperativa1.g:1870:1: ( 'not' )
            // InternalImperativa1.g:1871:2: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpNotAccess().getNotKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpNotAccess().getNotKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpNot__Group__0__Impl"


    // $ANTLR start "rule__ExpNot__Group__1"
    // InternalImperativa1.g:1880:1: rule__ExpNot__Group__1 : rule__ExpNot__Group__1__Impl ;
    public final void rule__ExpNot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1884:1: ( rule__ExpNot__Group__1__Impl )
            // InternalImperativa1.g:1885:2: rule__ExpNot__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpNot__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpNot__Group__1"


    // $ANTLR start "rule__ExpNot__Group__1__Impl"
    // InternalImperativa1.g:1891:1: rule__ExpNot__Group__1__Impl : ( ( rule__ExpNot__NotExpressaoAssignment_1 ) ) ;
    public final void rule__ExpNot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1895:1: ( ( ( rule__ExpNot__NotExpressaoAssignment_1 ) ) )
            // InternalImperativa1.g:1896:1: ( ( rule__ExpNot__NotExpressaoAssignment_1 ) )
            {
            // InternalImperativa1.g:1896:1: ( ( rule__ExpNot__NotExpressaoAssignment_1 ) )
            // InternalImperativa1.g:1897:2: ( rule__ExpNot__NotExpressaoAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpNotAccess().getNotExpressaoAssignment_1()); 
            }
            // InternalImperativa1.g:1898:2: ( rule__ExpNot__NotExpressaoAssignment_1 )
            // InternalImperativa1.g:1898:3: rule__ExpNot__NotExpressaoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpNot__NotExpressaoAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpNotAccess().getNotExpressaoAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpNot__Group__1__Impl"


    // $ANTLR start "rule__ExpLenght__Group__0"
    // InternalImperativa1.g:1907:1: rule__ExpLenght__Group__0 : rule__ExpLenght__Group__0__Impl rule__ExpLenght__Group__1 ;
    public final void rule__ExpLenght__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1911:1: ( rule__ExpLenght__Group__0__Impl rule__ExpLenght__Group__1 )
            // InternalImperativa1.g:1912:2: rule__ExpLenght__Group__0__Impl rule__ExpLenght__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ExpLenght__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpLenght__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpLenght__Group__0"


    // $ANTLR start "rule__ExpLenght__Group__0__Impl"
    // InternalImperativa1.g:1919:1: rule__ExpLenght__Group__0__Impl : ( 'length' ) ;
    public final void rule__ExpLenght__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1923:1: ( ( 'length' ) )
            // InternalImperativa1.g:1924:1: ( 'length' )
            {
            // InternalImperativa1.g:1924:1: ( 'length' )
            // InternalImperativa1.g:1925:2: 'length'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpLenghtAccess().getLengthKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpLenghtAccess().getLengthKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpLenght__Group__0__Impl"


    // $ANTLR start "rule__ExpLenght__Group__1"
    // InternalImperativa1.g:1934:1: rule__ExpLenght__Group__1 : rule__ExpLenght__Group__1__Impl ;
    public final void rule__ExpLenght__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1938:1: ( rule__ExpLenght__Group__1__Impl )
            // InternalImperativa1.g:1939:2: rule__ExpLenght__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpLenght__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpLenght__Group__1"


    // $ANTLR start "rule__ExpLenght__Group__1__Impl"
    // InternalImperativa1.g:1945:1: rule__ExpLenght__Group__1__Impl : ( ( rule__ExpLenght__LengthExpressaoAssignment_1 ) ) ;
    public final void rule__ExpLenght__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1949:1: ( ( ( rule__ExpLenght__LengthExpressaoAssignment_1 ) ) )
            // InternalImperativa1.g:1950:1: ( ( rule__ExpLenght__LengthExpressaoAssignment_1 ) )
            {
            // InternalImperativa1.g:1950:1: ( ( rule__ExpLenght__LengthExpressaoAssignment_1 ) )
            // InternalImperativa1.g:1951:2: ( rule__ExpLenght__LengthExpressaoAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpLenghtAccess().getLengthExpressaoAssignment_1()); 
            }
            // InternalImperativa1.g:1952:2: ( rule__ExpLenght__LengthExpressaoAssignment_1 )
            // InternalImperativa1.g:1952:3: rule__ExpLenght__LengthExpressaoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpLenght__LengthExpressaoAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpLenghtAccess().getLengthExpressaoAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpLenght__Group__1__Impl"


    // $ANTLR start "rule__ExpPrimaria__Group_2__0"
    // InternalImperativa1.g:1961:1: rule__ExpPrimaria__Group_2__0 : rule__ExpPrimaria__Group_2__0__Impl rule__ExpPrimaria__Group_2__1 ;
    public final void rule__ExpPrimaria__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1965:1: ( rule__ExpPrimaria__Group_2__0__Impl rule__ExpPrimaria__Group_2__1 )
            // InternalImperativa1.g:1966:2: rule__ExpPrimaria__Group_2__0__Impl rule__ExpPrimaria__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__ExpPrimaria__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpPrimaria__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpPrimaria__Group_2__0"


    // $ANTLR start "rule__ExpPrimaria__Group_2__0__Impl"
    // InternalImperativa1.g:1973:1: rule__ExpPrimaria__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ExpPrimaria__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1977:1: ( ( '(' ) )
            // InternalImperativa1.g:1978:1: ( '(' )
            {
            // InternalImperativa1.g:1978:1: ( '(' )
            // InternalImperativa1.g:1979:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpPrimariaAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpPrimariaAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpPrimaria__Group_2__0__Impl"


    // $ANTLR start "rule__ExpPrimaria__Group_2__1"
    // InternalImperativa1.g:1988:1: rule__ExpPrimaria__Group_2__1 : rule__ExpPrimaria__Group_2__1__Impl rule__ExpPrimaria__Group_2__2 ;
    public final void rule__ExpPrimaria__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:1992:1: ( rule__ExpPrimaria__Group_2__1__Impl rule__ExpPrimaria__Group_2__2 )
            // InternalImperativa1.g:1993:2: rule__ExpPrimaria__Group_2__1__Impl rule__ExpPrimaria__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__ExpPrimaria__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpPrimaria__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpPrimaria__Group_2__1"


    // $ANTLR start "rule__ExpPrimaria__Group_2__1__Impl"
    // InternalImperativa1.g:2000:1: rule__ExpPrimaria__Group_2__1__Impl : ( ( rule__ExpPrimaria__ExpressaoAssignment_2_1 ) ) ;
    public final void rule__ExpPrimaria__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2004:1: ( ( ( rule__ExpPrimaria__ExpressaoAssignment_2_1 ) ) )
            // InternalImperativa1.g:2005:1: ( ( rule__ExpPrimaria__ExpressaoAssignment_2_1 ) )
            {
            // InternalImperativa1.g:2005:1: ( ( rule__ExpPrimaria__ExpressaoAssignment_2_1 ) )
            // InternalImperativa1.g:2006:2: ( rule__ExpPrimaria__ExpressaoAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpPrimariaAccess().getExpressaoAssignment_2_1()); 
            }
            // InternalImperativa1.g:2007:2: ( rule__ExpPrimaria__ExpressaoAssignment_2_1 )
            // InternalImperativa1.g:2007:3: rule__ExpPrimaria__ExpressaoAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpPrimaria__ExpressaoAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpPrimariaAccess().getExpressaoAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpPrimaria__Group_2__1__Impl"


    // $ANTLR start "rule__ExpPrimaria__Group_2__2"
    // InternalImperativa1.g:2015:1: rule__ExpPrimaria__Group_2__2 : rule__ExpPrimaria__Group_2__2__Impl ;
    public final void rule__ExpPrimaria__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2019:1: ( rule__ExpPrimaria__Group_2__2__Impl )
            // InternalImperativa1.g:2020:2: rule__ExpPrimaria__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpPrimaria__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpPrimaria__Group_2__2"


    // $ANTLR start "rule__ExpPrimaria__Group_2__2__Impl"
    // InternalImperativa1.g:2026:1: rule__ExpPrimaria__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ExpPrimaria__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2030:1: ( ( ')' ) )
            // InternalImperativa1.g:2031:1: ( ')' )
            {
            // InternalImperativa1.g:2031:1: ( ')' )
            // InternalImperativa1.g:2032:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpPrimariaAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpPrimariaAccess().getRightParenthesisKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpPrimaria__Group_2__2__Impl"


    // $ANTLR start "rule__ExpSoma__Group__0"
    // InternalImperativa1.g:2042:1: rule__ExpSoma__Group__0 : rule__ExpSoma__Group__0__Impl rule__ExpSoma__Group__1 ;
    public final void rule__ExpSoma__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2046:1: ( rule__ExpSoma__Group__0__Impl rule__ExpSoma__Group__1 )
            // InternalImperativa1.g:2047:2: rule__ExpSoma__Group__0__Impl rule__ExpSoma__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ExpSoma__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpSoma__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpSoma__Group__0"


    // $ANTLR start "rule__ExpSoma__Group__0__Impl"
    // InternalImperativa1.g:2054:1: rule__ExpSoma__Group__0__Impl : ( ( rule__ExpSoma__ValorAssignment_0 ) ) ;
    public final void rule__ExpSoma__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2058:1: ( ( ( rule__ExpSoma__ValorAssignment_0 ) ) )
            // InternalImperativa1.g:2059:1: ( ( rule__ExpSoma__ValorAssignment_0 ) )
            {
            // InternalImperativa1.g:2059:1: ( ( rule__ExpSoma__ValorAssignment_0 ) )
            // InternalImperativa1.g:2060:2: ( rule__ExpSoma__ValorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpSomaAccess().getValorAssignment_0()); 
            }
            // InternalImperativa1.g:2061:2: ( rule__ExpSoma__ValorAssignment_0 )
            // InternalImperativa1.g:2061:3: rule__ExpSoma__ValorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpSoma__ValorAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpSomaAccess().getValorAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpSoma__Group__0__Impl"


    // $ANTLR start "rule__ExpSoma__Group__1"
    // InternalImperativa1.g:2069:1: rule__ExpSoma__Group__1 : rule__ExpSoma__Group__1__Impl rule__ExpSoma__Group__2 ;
    public final void rule__ExpSoma__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2073:1: ( rule__ExpSoma__Group__1__Impl rule__ExpSoma__Group__2 )
            // InternalImperativa1.g:2074:2: rule__ExpSoma__Group__1__Impl rule__ExpSoma__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ExpSoma__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpSoma__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpSoma__Group__1"


    // $ANTLR start "rule__ExpSoma__Group__1__Impl"
    // InternalImperativa1.g:2081:1: rule__ExpSoma__Group__1__Impl : ( '+' ) ;
    public final void rule__ExpSoma__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2085:1: ( ( '+' ) )
            // InternalImperativa1.g:2086:1: ( '+' )
            {
            // InternalImperativa1.g:2086:1: ( '+' )
            // InternalImperativa1.g:2087:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpSomaAccess().getPlusSignKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpSomaAccess().getPlusSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpSoma__Group__1__Impl"


    // $ANTLR start "rule__ExpSoma__Group__2"
    // InternalImperativa1.g:2096:1: rule__ExpSoma__Group__2 : rule__ExpSoma__Group__2__Impl ;
    public final void rule__ExpSoma__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2100:1: ( rule__ExpSoma__Group__2__Impl )
            // InternalImperativa1.g:2101:2: rule__ExpSoma__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpSoma__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpSoma__Group__2"


    // $ANTLR start "rule__ExpSoma__Group__2__Impl"
    // InternalImperativa1.g:2107:1: rule__ExpSoma__Group__2__Impl : ( ( rule__ExpSoma__ExpressaoAssignment_2 ) ) ;
    public final void rule__ExpSoma__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2111:1: ( ( ( rule__ExpSoma__ExpressaoAssignment_2 ) ) )
            // InternalImperativa1.g:2112:1: ( ( rule__ExpSoma__ExpressaoAssignment_2 ) )
            {
            // InternalImperativa1.g:2112:1: ( ( rule__ExpSoma__ExpressaoAssignment_2 ) )
            // InternalImperativa1.g:2113:2: ( rule__ExpSoma__ExpressaoAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpSomaAccess().getExpressaoAssignment_2()); 
            }
            // InternalImperativa1.g:2114:2: ( rule__ExpSoma__ExpressaoAssignment_2 )
            // InternalImperativa1.g:2114:3: rule__ExpSoma__ExpressaoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpSoma__ExpressaoAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpSomaAccess().getExpressaoAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpSoma__Group__2__Impl"


    // $ANTLR start "rule__ExpSub__Group__0"
    // InternalImperativa1.g:2123:1: rule__ExpSub__Group__0 : rule__ExpSub__Group__0__Impl rule__ExpSub__Group__1 ;
    public final void rule__ExpSub__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2127:1: ( rule__ExpSub__Group__0__Impl rule__ExpSub__Group__1 )
            // InternalImperativa1.g:2128:2: rule__ExpSub__Group__0__Impl rule__ExpSub__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ExpSub__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpSub__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpSub__Group__0"


    // $ANTLR start "rule__ExpSub__Group__0__Impl"
    // InternalImperativa1.g:2135:1: rule__ExpSub__Group__0__Impl : ( ( rule__ExpSub__ValorAssignment_0 ) ) ;
    public final void rule__ExpSub__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2139:1: ( ( ( rule__ExpSub__ValorAssignment_0 ) ) )
            // InternalImperativa1.g:2140:1: ( ( rule__ExpSub__ValorAssignment_0 ) )
            {
            // InternalImperativa1.g:2140:1: ( ( rule__ExpSub__ValorAssignment_0 ) )
            // InternalImperativa1.g:2141:2: ( rule__ExpSub__ValorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpSubAccess().getValorAssignment_0()); 
            }
            // InternalImperativa1.g:2142:2: ( rule__ExpSub__ValorAssignment_0 )
            // InternalImperativa1.g:2142:3: rule__ExpSub__ValorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpSub__ValorAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpSubAccess().getValorAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpSub__Group__0__Impl"


    // $ANTLR start "rule__ExpSub__Group__1"
    // InternalImperativa1.g:2150:1: rule__ExpSub__Group__1 : rule__ExpSub__Group__1__Impl rule__ExpSub__Group__2 ;
    public final void rule__ExpSub__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2154:1: ( rule__ExpSub__Group__1__Impl rule__ExpSub__Group__2 )
            // InternalImperativa1.g:2155:2: rule__ExpSub__Group__1__Impl rule__ExpSub__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ExpSub__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpSub__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpSub__Group__1"


    // $ANTLR start "rule__ExpSub__Group__1__Impl"
    // InternalImperativa1.g:2162:1: rule__ExpSub__Group__1__Impl : ( '-' ) ;
    public final void rule__ExpSub__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2166:1: ( ( '-' ) )
            // InternalImperativa1.g:2167:1: ( '-' )
            {
            // InternalImperativa1.g:2167:1: ( '-' )
            // InternalImperativa1.g:2168:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpSubAccess().getHyphenMinusKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpSubAccess().getHyphenMinusKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpSub__Group__1__Impl"


    // $ANTLR start "rule__ExpSub__Group__2"
    // InternalImperativa1.g:2177:1: rule__ExpSub__Group__2 : rule__ExpSub__Group__2__Impl ;
    public final void rule__ExpSub__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2181:1: ( rule__ExpSub__Group__2__Impl )
            // InternalImperativa1.g:2182:2: rule__ExpSub__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpSub__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpSub__Group__2"


    // $ANTLR start "rule__ExpSub__Group__2__Impl"
    // InternalImperativa1.g:2188:1: rule__ExpSub__Group__2__Impl : ( ( rule__ExpSub__ExpressaoAssignment_2 ) ) ;
    public final void rule__ExpSub__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2192:1: ( ( ( rule__ExpSub__ExpressaoAssignment_2 ) ) )
            // InternalImperativa1.g:2193:1: ( ( rule__ExpSub__ExpressaoAssignment_2 ) )
            {
            // InternalImperativa1.g:2193:1: ( ( rule__ExpSub__ExpressaoAssignment_2 ) )
            // InternalImperativa1.g:2194:2: ( rule__ExpSub__ExpressaoAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpSubAccess().getExpressaoAssignment_2()); 
            }
            // InternalImperativa1.g:2195:2: ( rule__ExpSub__ExpressaoAssignment_2 )
            // InternalImperativa1.g:2195:3: rule__ExpSub__ExpressaoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpSub__ExpressaoAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpSubAccess().getExpressaoAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpSub__Group__2__Impl"


    // $ANTLR start "rule__ExpAnd__Group__0"
    // InternalImperativa1.g:2204:1: rule__ExpAnd__Group__0 : rule__ExpAnd__Group__0__Impl rule__ExpAnd__Group__1 ;
    public final void rule__ExpAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2208:1: ( rule__ExpAnd__Group__0__Impl rule__ExpAnd__Group__1 )
            // InternalImperativa1.g:2209:2: rule__ExpAnd__Group__0__Impl rule__ExpAnd__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ExpAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpAnd__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAnd__Group__0"


    // $ANTLR start "rule__ExpAnd__Group__0__Impl"
    // InternalImperativa1.g:2216:1: rule__ExpAnd__Group__0__Impl : ( ( rule__ExpAnd__ValorAssignment_0 ) ) ;
    public final void rule__ExpAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2220:1: ( ( ( rule__ExpAnd__ValorAssignment_0 ) ) )
            // InternalImperativa1.g:2221:1: ( ( rule__ExpAnd__ValorAssignment_0 ) )
            {
            // InternalImperativa1.g:2221:1: ( ( rule__ExpAnd__ValorAssignment_0 ) )
            // InternalImperativa1.g:2222:2: ( rule__ExpAnd__ValorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpAndAccess().getValorAssignment_0()); 
            }
            // InternalImperativa1.g:2223:2: ( rule__ExpAnd__ValorAssignment_0 )
            // InternalImperativa1.g:2223:3: rule__ExpAnd__ValorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpAnd__ValorAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpAndAccess().getValorAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAnd__Group__0__Impl"


    // $ANTLR start "rule__ExpAnd__Group__1"
    // InternalImperativa1.g:2231:1: rule__ExpAnd__Group__1 : rule__ExpAnd__Group__1__Impl rule__ExpAnd__Group__2 ;
    public final void rule__ExpAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2235:1: ( rule__ExpAnd__Group__1__Impl rule__ExpAnd__Group__2 )
            // InternalImperativa1.g:2236:2: rule__ExpAnd__Group__1__Impl rule__ExpAnd__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ExpAnd__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpAnd__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAnd__Group__1"


    // $ANTLR start "rule__ExpAnd__Group__1__Impl"
    // InternalImperativa1.g:2243:1: rule__ExpAnd__Group__1__Impl : ( 'and' ) ;
    public final void rule__ExpAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2247:1: ( ( 'and' ) )
            // InternalImperativa1.g:2248:1: ( 'and' )
            {
            // InternalImperativa1.g:2248:1: ( 'and' )
            // InternalImperativa1.g:2249:2: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpAndAccess().getAndKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpAndAccess().getAndKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAnd__Group__1__Impl"


    // $ANTLR start "rule__ExpAnd__Group__2"
    // InternalImperativa1.g:2258:1: rule__ExpAnd__Group__2 : rule__ExpAnd__Group__2__Impl ;
    public final void rule__ExpAnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2262:1: ( rule__ExpAnd__Group__2__Impl )
            // InternalImperativa1.g:2263:2: rule__ExpAnd__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpAnd__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAnd__Group__2"


    // $ANTLR start "rule__ExpAnd__Group__2__Impl"
    // InternalImperativa1.g:2269:1: rule__ExpAnd__Group__2__Impl : ( ( rule__ExpAnd__ExpressaoAssignment_2 ) ) ;
    public final void rule__ExpAnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2273:1: ( ( ( rule__ExpAnd__ExpressaoAssignment_2 ) ) )
            // InternalImperativa1.g:2274:1: ( ( rule__ExpAnd__ExpressaoAssignment_2 ) )
            {
            // InternalImperativa1.g:2274:1: ( ( rule__ExpAnd__ExpressaoAssignment_2 ) )
            // InternalImperativa1.g:2275:2: ( rule__ExpAnd__ExpressaoAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpAndAccess().getExpressaoAssignment_2()); 
            }
            // InternalImperativa1.g:2276:2: ( rule__ExpAnd__ExpressaoAssignment_2 )
            // InternalImperativa1.g:2276:3: rule__ExpAnd__ExpressaoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpAnd__ExpressaoAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpAndAccess().getExpressaoAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAnd__Group__2__Impl"


    // $ANTLR start "rule__ExpOr__Group__0"
    // InternalImperativa1.g:2285:1: rule__ExpOr__Group__0 : rule__ExpOr__Group__0__Impl rule__ExpOr__Group__1 ;
    public final void rule__ExpOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2289:1: ( rule__ExpOr__Group__0__Impl rule__ExpOr__Group__1 )
            // InternalImperativa1.g:2290:2: rule__ExpOr__Group__0__Impl rule__ExpOr__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ExpOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpOr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOr__Group__0"


    // $ANTLR start "rule__ExpOr__Group__0__Impl"
    // InternalImperativa1.g:2297:1: rule__ExpOr__Group__0__Impl : ( ( rule__ExpOr__ValorAssignment_0 ) ) ;
    public final void rule__ExpOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2301:1: ( ( ( rule__ExpOr__ValorAssignment_0 ) ) )
            // InternalImperativa1.g:2302:1: ( ( rule__ExpOr__ValorAssignment_0 ) )
            {
            // InternalImperativa1.g:2302:1: ( ( rule__ExpOr__ValorAssignment_0 ) )
            // InternalImperativa1.g:2303:2: ( rule__ExpOr__ValorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpOrAccess().getValorAssignment_0()); 
            }
            // InternalImperativa1.g:2304:2: ( rule__ExpOr__ValorAssignment_0 )
            // InternalImperativa1.g:2304:3: rule__ExpOr__ValorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpOr__ValorAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpOrAccess().getValorAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOr__Group__0__Impl"


    // $ANTLR start "rule__ExpOr__Group__1"
    // InternalImperativa1.g:2312:1: rule__ExpOr__Group__1 : rule__ExpOr__Group__1__Impl rule__ExpOr__Group__2 ;
    public final void rule__ExpOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2316:1: ( rule__ExpOr__Group__1__Impl rule__ExpOr__Group__2 )
            // InternalImperativa1.g:2317:2: rule__ExpOr__Group__1__Impl rule__ExpOr__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ExpOr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpOr__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOr__Group__1"


    // $ANTLR start "rule__ExpOr__Group__1__Impl"
    // InternalImperativa1.g:2324:1: rule__ExpOr__Group__1__Impl : ( 'or' ) ;
    public final void rule__ExpOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2328:1: ( ( 'or' ) )
            // InternalImperativa1.g:2329:1: ( 'or' )
            {
            // InternalImperativa1.g:2329:1: ( 'or' )
            // InternalImperativa1.g:2330:2: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpOrAccess().getOrKeyword_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpOrAccess().getOrKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOr__Group__1__Impl"


    // $ANTLR start "rule__ExpOr__Group__2"
    // InternalImperativa1.g:2339:1: rule__ExpOr__Group__2 : rule__ExpOr__Group__2__Impl ;
    public final void rule__ExpOr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2343:1: ( rule__ExpOr__Group__2__Impl )
            // InternalImperativa1.g:2344:2: rule__ExpOr__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOr__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOr__Group__2"


    // $ANTLR start "rule__ExpOr__Group__2__Impl"
    // InternalImperativa1.g:2350:1: rule__ExpOr__Group__2__Impl : ( ( rule__ExpOr__ExpressaoAssignment_2 ) ) ;
    public final void rule__ExpOr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2354:1: ( ( ( rule__ExpOr__ExpressaoAssignment_2 ) ) )
            // InternalImperativa1.g:2355:1: ( ( rule__ExpOr__ExpressaoAssignment_2 ) )
            {
            // InternalImperativa1.g:2355:1: ( ( rule__ExpOr__ExpressaoAssignment_2 ) )
            // InternalImperativa1.g:2356:2: ( rule__ExpOr__ExpressaoAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpOrAccess().getExpressaoAssignment_2()); 
            }
            // InternalImperativa1.g:2357:2: ( rule__ExpOr__ExpressaoAssignment_2 )
            // InternalImperativa1.g:2357:3: rule__ExpOr__ExpressaoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpOr__ExpressaoAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpOrAccess().getExpressaoAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOr__Group__2__Impl"


    // $ANTLR start "rule__ExpEquals__Group__0"
    // InternalImperativa1.g:2366:1: rule__ExpEquals__Group__0 : rule__ExpEquals__Group__0__Impl rule__ExpEquals__Group__1 ;
    public final void rule__ExpEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2370:1: ( rule__ExpEquals__Group__0__Impl rule__ExpEquals__Group__1 )
            // InternalImperativa1.g:2371:2: rule__ExpEquals__Group__0__Impl rule__ExpEquals__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ExpEquals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpEquals__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpEquals__Group__0"


    // $ANTLR start "rule__ExpEquals__Group__0__Impl"
    // InternalImperativa1.g:2378:1: rule__ExpEquals__Group__0__Impl : ( ( rule__ExpEquals__ValorAssignment_0 ) ) ;
    public final void rule__ExpEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2382:1: ( ( ( rule__ExpEquals__ValorAssignment_0 ) ) )
            // InternalImperativa1.g:2383:1: ( ( rule__ExpEquals__ValorAssignment_0 ) )
            {
            // InternalImperativa1.g:2383:1: ( ( rule__ExpEquals__ValorAssignment_0 ) )
            // InternalImperativa1.g:2384:2: ( rule__ExpEquals__ValorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpEqualsAccess().getValorAssignment_0()); 
            }
            // InternalImperativa1.g:2385:2: ( rule__ExpEquals__ValorAssignment_0 )
            // InternalImperativa1.g:2385:3: rule__ExpEquals__ValorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpEquals__ValorAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpEqualsAccess().getValorAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpEquals__Group__0__Impl"


    // $ANTLR start "rule__ExpEquals__Group__1"
    // InternalImperativa1.g:2393:1: rule__ExpEquals__Group__1 : rule__ExpEquals__Group__1__Impl rule__ExpEquals__Group__2 ;
    public final void rule__ExpEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2397:1: ( rule__ExpEquals__Group__1__Impl rule__ExpEquals__Group__2 )
            // InternalImperativa1.g:2398:2: rule__ExpEquals__Group__1__Impl rule__ExpEquals__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ExpEquals__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpEquals__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpEquals__Group__1"


    // $ANTLR start "rule__ExpEquals__Group__1__Impl"
    // InternalImperativa1.g:2405:1: rule__ExpEquals__Group__1__Impl : ( '==' ) ;
    public final void rule__ExpEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2409:1: ( ( '==' ) )
            // InternalImperativa1.g:2410:1: ( '==' )
            {
            // InternalImperativa1.g:2410:1: ( '==' )
            // InternalImperativa1.g:2411:2: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpEqualsAccess().getEqualsSignEqualsSignKeyword_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpEqualsAccess().getEqualsSignEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpEquals__Group__1__Impl"


    // $ANTLR start "rule__ExpEquals__Group__2"
    // InternalImperativa1.g:2420:1: rule__ExpEquals__Group__2 : rule__ExpEquals__Group__2__Impl ;
    public final void rule__ExpEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2424:1: ( rule__ExpEquals__Group__2__Impl )
            // InternalImperativa1.g:2425:2: rule__ExpEquals__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpEquals__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpEquals__Group__2"


    // $ANTLR start "rule__ExpEquals__Group__2__Impl"
    // InternalImperativa1.g:2431:1: rule__ExpEquals__Group__2__Impl : ( ( rule__ExpEquals__ExpressaoAssignment_2 ) ) ;
    public final void rule__ExpEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2435:1: ( ( ( rule__ExpEquals__ExpressaoAssignment_2 ) ) )
            // InternalImperativa1.g:2436:1: ( ( rule__ExpEquals__ExpressaoAssignment_2 ) )
            {
            // InternalImperativa1.g:2436:1: ( ( rule__ExpEquals__ExpressaoAssignment_2 ) )
            // InternalImperativa1.g:2437:2: ( rule__ExpEquals__ExpressaoAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpEqualsAccess().getExpressaoAssignment_2()); 
            }
            // InternalImperativa1.g:2438:2: ( rule__ExpEquals__ExpressaoAssignment_2 )
            // InternalImperativa1.g:2438:3: rule__ExpEquals__ExpressaoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpEquals__ExpressaoAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpEqualsAccess().getExpressaoAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpEquals__Group__2__Impl"


    // $ANTLR start "rule__ExpConcat__Group__0"
    // InternalImperativa1.g:2447:1: rule__ExpConcat__Group__0 : rule__ExpConcat__Group__0__Impl rule__ExpConcat__Group__1 ;
    public final void rule__ExpConcat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2451:1: ( rule__ExpConcat__Group__0__Impl rule__ExpConcat__Group__1 )
            // InternalImperativa1.g:2452:2: rule__ExpConcat__Group__0__Impl rule__ExpConcat__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ExpConcat__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpConcat__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpConcat__Group__0"


    // $ANTLR start "rule__ExpConcat__Group__0__Impl"
    // InternalImperativa1.g:2459:1: rule__ExpConcat__Group__0__Impl : ( ( rule__ExpConcat__ValorAssignment_0 ) ) ;
    public final void rule__ExpConcat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2463:1: ( ( ( rule__ExpConcat__ValorAssignment_0 ) ) )
            // InternalImperativa1.g:2464:1: ( ( rule__ExpConcat__ValorAssignment_0 ) )
            {
            // InternalImperativa1.g:2464:1: ( ( rule__ExpConcat__ValorAssignment_0 ) )
            // InternalImperativa1.g:2465:2: ( rule__ExpConcat__ValorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpConcatAccess().getValorAssignment_0()); 
            }
            // InternalImperativa1.g:2466:2: ( rule__ExpConcat__ValorAssignment_0 )
            // InternalImperativa1.g:2466:3: rule__ExpConcat__ValorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpConcat__ValorAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpConcatAccess().getValorAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpConcat__Group__0__Impl"


    // $ANTLR start "rule__ExpConcat__Group__1"
    // InternalImperativa1.g:2474:1: rule__ExpConcat__Group__1 : rule__ExpConcat__Group__1__Impl rule__ExpConcat__Group__2 ;
    public final void rule__ExpConcat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2478:1: ( rule__ExpConcat__Group__1__Impl rule__ExpConcat__Group__2 )
            // InternalImperativa1.g:2479:2: rule__ExpConcat__Group__1__Impl rule__ExpConcat__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ExpConcat__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpConcat__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpConcat__Group__1"


    // $ANTLR start "rule__ExpConcat__Group__1__Impl"
    // InternalImperativa1.g:2486:1: rule__ExpConcat__Group__1__Impl : ( '++' ) ;
    public final void rule__ExpConcat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2490:1: ( ( '++' ) )
            // InternalImperativa1.g:2491:1: ( '++' )
            {
            // InternalImperativa1.g:2491:1: ( '++' )
            // InternalImperativa1.g:2492:2: '++'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpConcatAccess().getPlusSignPlusSignKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpConcatAccess().getPlusSignPlusSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpConcat__Group__1__Impl"


    // $ANTLR start "rule__ExpConcat__Group__2"
    // InternalImperativa1.g:2501:1: rule__ExpConcat__Group__2 : rule__ExpConcat__Group__2__Impl ;
    public final void rule__ExpConcat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2505:1: ( rule__ExpConcat__Group__2__Impl )
            // InternalImperativa1.g:2506:2: rule__ExpConcat__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpConcat__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpConcat__Group__2"


    // $ANTLR start "rule__ExpConcat__Group__2__Impl"
    // InternalImperativa1.g:2512:1: rule__ExpConcat__Group__2__Impl : ( ( rule__ExpConcat__ExpressaoAssignment_2 ) ) ;
    public final void rule__ExpConcat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2516:1: ( ( ( rule__ExpConcat__ExpressaoAssignment_2 ) ) )
            // InternalImperativa1.g:2517:1: ( ( rule__ExpConcat__ExpressaoAssignment_2 ) )
            {
            // InternalImperativa1.g:2517:1: ( ( rule__ExpConcat__ExpressaoAssignment_2 ) )
            // InternalImperativa1.g:2518:2: ( rule__ExpConcat__ExpressaoAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpConcatAccess().getExpressaoAssignment_2()); 
            }
            // InternalImperativa1.g:2519:2: ( rule__ExpConcat__ExpressaoAssignment_2 )
            // InternalImperativa1.g:2519:3: rule__ExpConcat__ExpressaoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpConcat__ExpressaoAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpConcatAccess().getExpressaoAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpConcat__Group__2__Impl"


    // $ANTLR start "rule__ComandoSimples__Group_6__0"
    // InternalImperativa1.g:2528:1: rule__ComandoSimples__Group_6__0 : rule__ComandoSimples__Group_6__0__Impl rule__ComandoSimples__Group_6__1 ;
    public final void rule__ComandoSimples__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2532:1: ( rule__ComandoSimples__Group_6__0__Impl rule__ComandoSimples__Group_6__1 )
            // InternalImperativa1.g:2533:2: rule__ComandoSimples__Group_6__0__Impl rule__ComandoSimples__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__ComandoSimples__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComandoSimples__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSimples__Group_6__0"


    // $ANTLR start "rule__ComandoSimples__Group_6__0__Impl"
    // InternalImperativa1.g:2540:1: rule__ComandoSimples__Group_6__0__Impl : ( '(' ) ;
    public final void rule__ComandoSimples__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2544:1: ( ( '(' ) )
            // InternalImperativa1.g:2545:1: ( '(' )
            {
            // InternalImperativa1.g:2545:1: ( '(' )
            // InternalImperativa1.g:2546:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoSimplesAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoSimplesAccess().getLeftParenthesisKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSimples__Group_6__0__Impl"


    // $ANTLR start "rule__ComandoSimples__Group_6__1"
    // InternalImperativa1.g:2555:1: rule__ComandoSimples__Group_6__1 : rule__ComandoSimples__Group_6__1__Impl rule__ComandoSimples__Group_6__2 ;
    public final void rule__ComandoSimples__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2559:1: ( rule__ComandoSimples__Group_6__1__Impl rule__ComandoSimples__Group_6__2 )
            // InternalImperativa1.g:2560:2: rule__ComandoSimples__Group_6__1__Impl rule__ComandoSimples__Group_6__2
            {
            pushFollow(FOLLOW_8);
            rule__ComandoSimples__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComandoSimples__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSimples__Group_6__1"


    // $ANTLR start "rule__ComandoSimples__Group_6__1__Impl"
    // InternalImperativa1.g:2567:1: rule__ComandoSimples__Group_6__1__Impl : ( ( rule__ComandoSimples__ComandoAssignment_6_1 ) ) ;
    public final void rule__ComandoSimples__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2571:1: ( ( ( rule__ComandoSimples__ComandoAssignment_6_1 ) ) )
            // InternalImperativa1.g:2572:1: ( ( rule__ComandoSimples__ComandoAssignment_6_1 ) )
            {
            // InternalImperativa1.g:2572:1: ( ( rule__ComandoSimples__ComandoAssignment_6_1 ) )
            // InternalImperativa1.g:2573:2: ( rule__ComandoSimples__ComandoAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoSimplesAccess().getComandoAssignment_6_1()); 
            }
            // InternalImperativa1.g:2574:2: ( rule__ComandoSimples__ComandoAssignment_6_1 )
            // InternalImperativa1.g:2574:3: rule__ComandoSimples__ComandoAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ComandoSimples__ComandoAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoSimplesAccess().getComandoAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSimples__Group_6__1__Impl"


    // $ANTLR start "rule__ComandoSimples__Group_6__2"
    // InternalImperativa1.g:2582:1: rule__ComandoSimples__Group_6__2 : rule__ComandoSimples__Group_6__2__Impl ;
    public final void rule__ComandoSimples__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2586:1: ( rule__ComandoSimples__Group_6__2__Impl )
            // InternalImperativa1.g:2587:2: rule__ComandoSimples__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoSimples__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSimples__Group_6__2"


    // $ANTLR start "rule__ComandoSimples__Group_6__2__Impl"
    // InternalImperativa1.g:2593:1: rule__ComandoSimples__Group_6__2__Impl : ( ')' ) ;
    public final void rule__ComandoSimples__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2597:1: ( ( ')' ) )
            // InternalImperativa1.g:2598:1: ( ')' )
            {
            // InternalImperativa1.g:2598:1: ( ')' )
            // InternalImperativa1.g:2599:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoSimplesAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoSimplesAccess().getRightParenthesisKeyword_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSimples__Group_6__2__Impl"


    // $ANTLR start "rule__ComandoDeclaracao__Group__0"
    // InternalImperativa1.g:2609:1: rule__ComandoDeclaracao__Group__0 : rule__ComandoDeclaracao__Group__0__Impl rule__ComandoDeclaracao__Group__1 ;
    public final void rule__ComandoDeclaracao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2613:1: ( rule__ComandoDeclaracao__Group__0__Impl rule__ComandoDeclaracao__Group__1 )
            // InternalImperativa1.g:2614:2: rule__ComandoDeclaracao__Group__0__Impl rule__ComandoDeclaracao__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ComandoDeclaracao__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComandoDeclaracao__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoDeclaracao__Group__0"


    // $ANTLR start "rule__ComandoDeclaracao__Group__0__Impl"
    // InternalImperativa1.g:2621:1: rule__ComandoDeclaracao__Group__0__Impl : ( '{' ) ;
    public final void rule__ComandoDeclaracao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2625:1: ( ( '{' ) )
            // InternalImperativa1.g:2626:1: ( '{' )
            {
            // InternalImperativa1.g:2626:1: ( '{' )
            // InternalImperativa1.g:2627:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoDeclaracaoAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoDeclaracaoAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoDeclaracao__Group__0__Impl"


    // $ANTLR start "rule__ComandoDeclaracao__Group__1"
    // InternalImperativa1.g:2636:1: rule__ComandoDeclaracao__Group__1 : rule__ComandoDeclaracao__Group__1__Impl rule__ComandoDeclaracao__Group__2 ;
    public final void rule__ComandoDeclaracao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2640:1: ( rule__ComandoDeclaracao__Group__1__Impl rule__ComandoDeclaracao__Group__2 )
            // InternalImperativa1.g:2641:2: rule__ComandoDeclaracao__Group__1__Impl rule__ComandoDeclaracao__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComandoDeclaracao__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComandoDeclaracao__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoDeclaracao__Group__1"


    // $ANTLR start "rule__ComandoDeclaracao__Group__1__Impl"
    // InternalImperativa1.g:2648:1: rule__ComandoDeclaracao__Group__1__Impl : ( ( rule__ComandoDeclaracao__DeclaracaoAssignment_1 ) ) ;
    public final void rule__ComandoDeclaracao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2652:1: ( ( ( rule__ComandoDeclaracao__DeclaracaoAssignment_1 ) ) )
            // InternalImperativa1.g:2653:1: ( ( rule__ComandoDeclaracao__DeclaracaoAssignment_1 ) )
            {
            // InternalImperativa1.g:2653:1: ( ( rule__ComandoDeclaracao__DeclaracaoAssignment_1 ) )
            // InternalImperativa1.g:2654:2: ( rule__ComandoDeclaracao__DeclaracaoAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoDeclaracaoAccess().getDeclaracaoAssignment_1()); 
            }
            // InternalImperativa1.g:2655:2: ( rule__ComandoDeclaracao__DeclaracaoAssignment_1 )
            // InternalImperativa1.g:2655:3: rule__ComandoDeclaracao__DeclaracaoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComandoDeclaracao__DeclaracaoAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoDeclaracaoAccess().getDeclaracaoAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoDeclaracao__Group__1__Impl"


    // $ANTLR start "rule__ComandoDeclaracao__Group__2"
    // InternalImperativa1.g:2663:1: rule__ComandoDeclaracao__Group__2 : rule__ComandoDeclaracao__Group__2__Impl rule__ComandoDeclaracao__Group__3 ;
    public final void rule__ComandoDeclaracao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2667:1: ( rule__ComandoDeclaracao__Group__2__Impl rule__ComandoDeclaracao__Group__3 )
            // InternalImperativa1.g:2668:2: rule__ComandoDeclaracao__Group__2__Impl rule__ComandoDeclaracao__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ComandoDeclaracao__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComandoDeclaracao__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoDeclaracao__Group__2"


    // $ANTLR start "rule__ComandoDeclaracao__Group__2__Impl"
    // InternalImperativa1.g:2675:1: rule__ComandoDeclaracao__Group__2__Impl : ( ';' ) ;
    public final void rule__ComandoDeclaracao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2679:1: ( ( ';' ) )
            // InternalImperativa1.g:2680:1: ( ';' )
            {
            // InternalImperativa1.g:2680:1: ( ';' )
            // InternalImperativa1.g:2681:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoDeclaracaoAccess().getSemicolonKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoDeclaracaoAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoDeclaracao__Group__2__Impl"


    // $ANTLR start "rule__ComandoDeclaracao__Group__3"
    // InternalImperativa1.g:2690:1: rule__ComandoDeclaracao__Group__3 : rule__ComandoDeclaracao__Group__3__Impl rule__ComandoDeclaracao__Group__4 ;
    public final void rule__ComandoDeclaracao__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2694:1: ( rule__ComandoDeclaracao__Group__3__Impl rule__ComandoDeclaracao__Group__4 )
            // InternalImperativa1.g:2695:2: rule__ComandoDeclaracao__Group__3__Impl rule__ComandoDeclaracao__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__ComandoDeclaracao__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComandoDeclaracao__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoDeclaracao__Group__3"


    // $ANTLR start "rule__ComandoDeclaracao__Group__3__Impl"
    // InternalImperativa1.g:2702:1: rule__ComandoDeclaracao__Group__3__Impl : ( ( rule__ComandoDeclaracao__ComandoAssignment_3 ) ) ;
    public final void rule__ComandoDeclaracao__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2706:1: ( ( ( rule__ComandoDeclaracao__ComandoAssignment_3 ) ) )
            // InternalImperativa1.g:2707:1: ( ( rule__ComandoDeclaracao__ComandoAssignment_3 ) )
            {
            // InternalImperativa1.g:2707:1: ( ( rule__ComandoDeclaracao__ComandoAssignment_3 ) )
            // InternalImperativa1.g:2708:2: ( rule__ComandoDeclaracao__ComandoAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoDeclaracaoAccess().getComandoAssignment_3()); 
            }
            // InternalImperativa1.g:2709:2: ( rule__ComandoDeclaracao__ComandoAssignment_3 )
            // InternalImperativa1.g:2709:3: rule__ComandoDeclaracao__ComandoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComandoDeclaracao__ComandoAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoDeclaracaoAccess().getComandoAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoDeclaracao__Group__3__Impl"


    // $ANTLR start "rule__ComandoDeclaracao__Group__4"
    // InternalImperativa1.g:2717:1: rule__ComandoDeclaracao__Group__4 : rule__ComandoDeclaracao__Group__4__Impl ;
    public final void rule__ComandoDeclaracao__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2721:1: ( rule__ComandoDeclaracao__Group__4__Impl )
            // InternalImperativa1.g:2722:2: rule__ComandoDeclaracao__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoDeclaracao__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoDeclaracao__Group__4"


    // $ANTLR start "rule__ComandoDeclaracao__Group__4__Impl"
    // InternalImperativa1.g:2728:1: rule__ComandoDeclaracao__Group__4__Impl : ( '}' ) ;
    public final void rule__ComandoDeclaracao__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2732:1: ( ( '}' ) )
            // InternalImperativa1.g:2733:1: ( '}' )
            {
            // InternalImperativa1.g:2733:1: ( '}' )
            // InternalImperativa1.g:2734:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoDeclaracaoAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoDeclaracaoAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoDeclaracao__Group__4__Impl"


    // $ANTLR start "rule__Declaracao__Group_2__0"
    // InternalImperativa1.g:2744:1: rule__Declaracao__Group_2__0 : rule__Declaracao__Group_2__0__Impl rule__Declaracao__Group_2__1 ;
    public final void rule__Declaracao__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2748:1: ( rule__Declaracao__Group_2__0__Impl rule__Declaracao__Group_2__1 )
            // InternalImperativa1.g:2749:2: rule__Declaracao__Group_2__0__Impl rule__Declaracao__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__Declaracao__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Declaracao__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaracao__Group_2__0"


    // $ANTLR start "rule__Declaracao__Group_2__0__Impl"
    // InternalImperativa1.g:2756:1: rule__Declaracao__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Declaracao__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2760:1: ( ( '(' ) )
            // InternalImperativa1.g:2761:1: ( '(' )
            {
            // InternalImperativa1.g:2761:1: ( '(' )
            // InternalImperativa1.g:2762:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaracao__Group_2__0__Impl"


    // $ANTLR start "rule__Declaracao__Group_2__1"
    // InternalImperativa1.g:2771:1: rule__Declaracao__Group_2__1 : rule__Declaracao__Group_2__1__Impl rule__Declaracao__Group_2__2 ;
    public final void rule__Declaracao__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2775:1: ( rule__Declaracao__Group_2__1__Impl rule__Declaracao__Group_2__2 )
            // InternalImperativa1.g:2776:2: rule__Declaracao__Group_2__1__Impl rule__Declaracao__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__Declaracao__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Declaracao__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaracao__Group_2__1"


    // $ANTLR start "rule__Declaracao__Group_2__1__Impl"
    // InternalImperativa1.g:2783:1: rule__Declaracao__Group_2__1__Impl : ( ( rule__Declaracao__DeclaracaoAssignment_2_1 ) ) ;
    public final void rule__Declaracao__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2787:1: ( ( ( rule__Declaracao__DeclaracaoAssignment_2_1 ) ) )
            // InternalImperativa1.g:2788:1: ( ( rule__Declaracao__DeclaracaoAssignment_2_1 ) )
            {
            // InternalImperativa1.g:2788:1: ( ( rule__Declaracao__DeclaracaoAssignment_2_1 ) )
            // InternalImperativa1.g:2789:2: ( rule__Declaracao__DeclaracaoAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoAccess().getDeclaracaoAssignment_2_1()); 
            }
            // InternalImperativa1.g:2790:2: ( rule__Declaracao__DeclaracaoAssignment_2_1 )
            // InternalImperativa1.g:2790:3: rule__Declaracao__DeclaracaoAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaracao__DeclaracaoAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoAccess().getDeclaracaoAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaracao__Group_2__1__Impl"


    // $ANTLR start "rule__Declaracao__Group_2__2"
    // InternalImperativa1.g:2798:1: rule__Declaracao__Group_2__2 : rule__Declaracao__Group_2__2__Impl ;
    public final void rule__Declaracao__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2802:1: ( rule__Declaracao__Group_2__2__Impl )
            // InternalImperativa1.g:2803:2: rule__Declaracao__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaracao__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaracao__Group_2__2"


    // $ANTLR start "rule__Declaracao__Group_2__2__Impl"
    // InternalImperativa1.g:2809:1: rule__Declaracao__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Declaracao__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2813:1: ( ( ')' ) )
            // InternalImperativa1.g:2814:1: ( ')' )
            {
            // InternalImperativa1.g:2814:1: ( ')' )
            // InternalImperativa1.g:2815:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoAccess().getRightParenthesisKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaracao__Group_2__2__Impl"


    // $ANTLR start "rule__DeclaracaoComposta__Group__0"
    // InternalImperativa1.g:2825:1: rule__DeclaracaoComposta__Group__0 : rule__DeclaracaoComposta__Group__0__Impl rule__DeclaracaoComposta__Group__1 ;
    public final void rule__DeclaracaoComposta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2829:1: ( rule__DeclaracaoComposta__Group__0__Impl rule__DeclaracaoComposta__Group__1 )
            // InternalImperativa1.g:2830:2: rule__DeclaracaoComposta__Group__0__Impl rule__DeclaracaoComposta__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__DeclaracaoComposta__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DeclaracaoComposta__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoComposta__Group__0"


    // $ANTLR start "rule__DeclaracaoComposta__Group__0__Impl"
    // InternalImperativa1.g:2837:1: rule__DeclaracaoComposta__Group__0__Impl : ( ( rule__DeclaracaoComposta__DecVariavelAssignment_0 ) ) ;
    public final void rule__DeclaracaoComposta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2841:1: ( ( ( rule__DeclaracaoComposta__DecVariavelAssignment_0 ) ) )
            // InternalImperativa1.g:2842:1: ( ( rule__DeclaracaoComposta__DecVariavelAssignment_0 ) )
            {
            // InternalImperativa1.g:2842:1: ( ( rule__DeclaracaoComposta__DecVariavelAssignment_0 ) )
            // InternalImperativa1.g:2843:2: ( rule__DeclaracaoComposta__DecVariavelAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoCompostaAccess().getDecVariavelAssignment_0()); 
            }
            // InternalImperativa1.g:2844:2: ( rule__DeclaracaoComposta__DecVariavelAssignment_0 )
            // InternalImperativa1.g:2844:3: rule__DeclaracaoComposta__DecVariavelAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoComposta__DecVariavelAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoCompostaAccess().getDecVariavelAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoComposta__Group__0__Impl"


    // $ANTLR start "rule__DeclaracaoComposta__Group__1"
    // InternalImperativa1.g:2852:1: rule__DeclaracaoComposta__Group__1 : rule__DeclaracaoComposta__Group__1__Impl rule__DeclaracaoComposta__Group__2 ;
    public final void rule__DeclaracaoComposta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2856:1: ( rule__DeclaracaoComposta__Group__1__Impl rule__DeclaracaoComposta__Group__2 )
            // InternalImperativa1.g:2857:2: rule__DeclaracaoComposta__Group__1__Impl rule__DeclaracaoComposta__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__DeclaracaoComposta__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DeclaracaoComposta__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoComposta__Group__1"


    // $ANTLR start "rule__DeclaracaoComposta__Group__1__Impl"
    // InternalImperativa1.g:2864:1: rule__DeclaracaoComposta__Group__1__Impl : ( ',' ) ;
    public final void rule__DeclaracaoComposta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2868:1: ( ( ',' ) )
            // InternalImperativa1.g:2869:1: ( ',' )
            {
            // InternalImperativa1.g:2869:1: ( ',' )
            // InternalImperativa1.g:2870:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoCompostaAccess().getCommaKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoCompostaAccess().getCommaKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoComposta__Group__1__Impl"


    // $ANTLR start "rule__DeclaracaoComposta__Group__2"
    // InternalImperativa1.g:2879:1: rule__DeclaracaoComposta__Group__2 : rule__DeclaracaoComposta__Group__2__Impl ;
    public final void rule__DeclaracaoComposta__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2883:1: ( rule__DeclaracaoComposta__Group__2__Impl )
            // InternalImperativa1.g:2884:2: rule__DeclaracaoComposta__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoComposta__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoComposta__Group__2"


    // $ANTLR start "rule__DeclaracaoComposta__Group__2__Impl"
    // InternalImperativa1.g:2890:1: rule__DeclaracaoComposta__Group__2__Impl : ( ( rule__DeclaracaoComposta__DeclaracaoAssignment_2 ) ) ;
    public final void rule__DeclaracaoComposta__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2894:1: ( ( ( rule__DeclaracaoComposta__DeclaracaoAssignment_2 ) ) )
            // InternalImperativa1.g:2895:1: ( ( rule__DeclaracaoComposta__DeclaracaoAssignment_2 ) )
            {
            // InternalImperativa1.g:2895:1: ( ( rule__DeclaracaoComposta__DeclaracaoAssignment_2 ) )
            // InternalImperativa1.g:2896:2: ( rule__DeclaracaoComposta__DeclaracaoAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoCompostaAccess().getDeclaracaoAssignment_2()); 
            }
            // InternalImperativa1.g:2897:2: ( rule__DeclaracaoComposta__DeclaracaoAssignment_2 )
            // InternalImperativa1.g:2897:3: rule__DeclaracaoComposta__DeclaracaoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoComposta__DeclaracaoAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoCompostaAccess().getDeclaracaoAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoComposta__Group__2__Impl"


    // $ANTLR start "rule__DeclaracaoVariavel__Group__0"
    // InternalImperativa1.g:2906:1: rule__DeclaracaoVariavel__Group__0 : rule__DeclaracaoVariavel__Group__0__Impl rule__DeclaracaoVariavel__Group__1 ;
    public final void rule__DeclaracaoVariavel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2910:1: ( rule__DeclaracaoVariavel__Group__0__Impl rule__DeclaracaoVariavel__Group__1 )
            // InternalImperativa1.g:2911:2: rule__DeclaracaoVariavel__Group__0__Impl rule__DeclaracaoVariavel__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__DeclaracaoVariavel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DeclaracaoVariavel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoVariavel__Group__0"


    // $ANTLR start "rule__DeclaracaoVariavel__Group__0__Impl"
    // InternalImperativa1.g:2918:1: rule__DeclaracaoVariavel__Group__0__Impl : ( 'var' ) ;
    public final void rule__DeclaracaoVariavel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2922:1: ( ( 'var' ) )
            // InternalImperativa1.g:2923:1: ( 'var' )
            {
            // InternalImperativa1.g:2923:1: ( 'var' )
            // InternalImperativa1.g:2924:2: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoVariavelAccess().getVarKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoVariavelAccess().getVarKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoVariavel__Group__0__Impl"


    // $ANTLR start "rule__DeclaracaoVariavel__Group__1"
    // InternalImperativa1.g:2933:1: rule__DeclaracaoVariavel__Group__1 : rule__DeclaracaoVariavel__Group__1__Impl rule__DeclaracaoVariavel__Group__2 ;
    public final void rule__DeclaracaoVariavel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2937:1: ( rule__DeclaracaoVariavel__Group__1__Impl rule__DeclaracaoVariavel__Group__2 )
            // InternalImperativa1.g:2938:2: rule__DeclaracaoVariavel__Group__1__Impl rule__DeclaracaoVariavel__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__DeclaracaoVariavel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DeclaracaoVariavel__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoVariavel__Group__1"


    // $ANTLR start "rule__DeclaracaoVariavel__Group__1__Impl"
    // InternalImperativa1.g:2945:1: rule__DeclaracaoVariavel__Group__1__Impl : ( ( rule__DeclaracaoVariavel__PidAssignment_1 ) ) ;
    public final void rule__DeclaracaoVariavel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2949:1: ( ( ( rule__DeclaracaoVariavel__PidAssignment_1 ) ) )
            // InternalImperativa1.g:2950:1: ( ( rule__DeclaracaoVariavel__PidAssignment_1 ) )
            {
            // InternalImperativa1.g:2950:1: ( ( rule__DeclaracaoVariavel__PidAssignment_1 ) )
            // InternalImperativa1.g:2951:2: ( rule__DeclaracaoVariavel__PidAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoVariavelAccess().getPidAssignment_1()); 
            }
            // InternalImperativa1.g:2952:2: ( rule__DeclaracaoVariavel__PidAssignment_1 )
            // InternalImperativa1.g:2952:3: rule__DeclaracaoVariavel__PidAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoVariavel__PidAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoVariavelAccess().getPidAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoVariavel__Group__1__Impl"


    // $ANTLR start "rule__DeclaracaoVariavel__Group__2"
    // InternalImperativa1.g:2960:1: rule__DeclaracaoVariavel__Group__2 : rule__DeclaracaoVariavel__Group__2__Impl rule__DeclaracaoVariavel__Group__3 ;
    public final void rule__DeclaracaoVariavel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2964:1: ( rule__DeclaracaoVariavel__Group__2__Impl rule__DeclaracaoVariavel__Group__3 )
            // InternalImperativa1.g:2965:2: rule__DeclaracaoVariavel__Group__2__Impl rule__DeclaracaoVariavel__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__DeclaracaoVariavel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DeclaracaoVariavel__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoVariavel__Group__2"


    // $ANTLR start "rule__DeclaracaoVariavel__Group__2__Impl"
    // InternalImperativa1.g:2972:1: rule__DeclaracaoVariavel__Group__2__Impl : ( '=' ) ;
    public final void rule__DeclaracaoVariavel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2976:1: ( ( '=' ) )
            // InternalImperativa1.g:2977:1: ( '=' )
            {
            // InternalImperativa1.g:2977:1: ( '=' )
            // InternalImperativa1.g:2978:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoVariavelAccess().getEqualsSignKeyword_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoVariavelAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoVariavel__Group__2__Impl"


    // $ANTLR start "rule__DeclaracaoVariavel__Group__3"
    // InternalImperativa1.g:2987:1: rule__DeclaracaoVariavel__Group__3 : rule__DeclaracaoVariavel__Group__3__Impl ;
    public final void rule__DeclaracaoVariavel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:2991:1: ( rule__DeclaracaoVariavel__Group__3__Impl )
            // InternalImperativa1.g:2992:2: rule__DeclaracaoVariavel__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoVariavel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoVariavel__Group__3"


    // $ANTLR start "rule__DeclaracaoVariavel__Group__3__Impl"
    // InternalImperativa1.g:2998:1: rule__DeclaracaoVariavel__Group__3__Impl : ( ( rule__DeclaracaoVariavel__ExpressaoAssignment_3 ) ) ;
    public final void rule__DeclaracaoVariavel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3002:1: ( ( ( rule__DeclaracaoVariavel__ExpressaoAssignment_3 ) ) )
            // InternalImperativa1.g:3003:1: ( ( rule__DeclaracaoVariavel__ExpressaoAssignment_3 ) )
            {
            // InternalImperativa1.g:3003:1: ( ( rule__DeclaracaoVariavel__ExpressaoAssignment_3 ) )
            // InternalImperativa1.g:3004:2: ( rule__DeclaracaoVariavel__ExpressaoAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoVariavelAccess().getExpressaoAssignment_3()); 
            }
            // InternalImperativa1.g:3005:2: ( rule__DeclaracaoVariavel__ExpressaoAssignment_3 )
            // InternalImperativa1.g:3005:3: rule__DeclaracaoVariavel__ExpressaoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoVariavel__ExpressaoAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoVariavelAccess().getExpressaoAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoVariavel__Group__3__Impl"


    // $ANTLR start "rule__Model__ComandosAssignment"
    // InternalImperativa1.g:3014:1: rule__Model__ComandosAssignment : ( ruleComando ) ;
    public final void rule__Model__ComandosAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3018:1: ( ( ruleComando ) )
            // InternalImperativa1.g:3019:2: ( ruleComando )
            {
            // InternalImperativa1.g:3019:2: ( ruleComando )
            // InternalImperativa1.g:3020:3: ruleComando
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getComandosComandoParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getComandosComandoParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ComandosAssignment"


    // $ANTLR start "rule__Comando__SequenciaComandoAssignment_0"
    // InternalImperativa1.g:3029:1: rule__Comando__SequenciaComandoAssignment_0 : ( ruleSequenciaComando ) ;
    public final void rule__Comando__SequenciaComandoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3033:1: ( ( ruleSequenciaComando ) )
            // InternalImperativa1.g:3034:2: ( ruleSequenciaComando )
            {
            // InternalImperativa1.g:3034:2: ( ruleSequenciaComando )
            // InternalImperativa1.g:3035:3: ruleSequenciaComando
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoAccess().getSequenciaComandoSequenciaComandoParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSequenciaComando();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoAccess().getSequenciaComandoSequenciaComandoParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comando__SequenciaComandoAssignment_0"


    // $ANTLR start "rule__Comando__ComandoSimplesAssignment_1"
    // InternalImperativa1.g:3044:1: rule__Comando__ComandoSimplesAssignment_1 : ( ruleComandoSimples ) ;
    public final void rule__Comando__ComandoSimplesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3048:1: ( ( ruleComandoSimples ) )
            // InternalImperativa1.g:3049:2: ( ruleComandoSimples )
            {
            // InternalImperativa1.g:3049:2: ( ruleComandoSimples )
            // InternalImperativa1.g:3050:3: ruleComandoSimples
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoAccess().getComandoSimplesComandoSimplesParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComandoSimples();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoAccess().getComandoSimplesComandoSimplesParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comando__ComandoSimplesAssignment_1"


    // $ANTLR start "rule__SequenciaComando__ComandoSimplesAssignment_0"
    // InternalImperativa1.g:3059:1: rule__SequenciaComando__ComandoSimplesAssignment_0 : ( ruleComandoSimples ) ;
    public final void rule__SequenciaComando__ComandoSimplesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3063:1: ( ( ruleComandoSimples ) )
            // InternalImperativa1.g:3064:2: ( ruleComandoSimples )
            {
            // InternalImperativa1.g:3064:2: ( ruleComandoSimples )
            // InternalImperativa1.g:3065:3: ruleComandoSimples
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenciaComandoAccess().getComandoSimplesComandoSimplesParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComandoSimples();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenciaComandoAccess().getComandoSimplesComandoSimplesParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenciaComando__ComandoSimplesAssignment_0"


    // $ANTLR start "rule__SequenciaComando__ComandoAssignment_2"
    // InternalImperativa1.g:3074:1: rule__SequenciaComando__ComandoAssignment_2 : ( ruleComando ) ;
    public final void rule__SequenciaComando__ComandoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3078:1: ( ( ruleComando ) )
            // InternalImperativa1.g:3079:2: ( ruleComando )
            {
            // InternalImperativa1.g:3079:2: ( ruleComando )
            // InternalImperativa1.g:3080:3: ruleComando
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenciaComandoAccess().getComandoComandoParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenciaComandoAccess().getComandoComandoParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenciaComando__ComandoAssignment_2"


    // $ANTLR start "rule__IO__ReadAssignment_0"
    // InternalImperativa1.g:3089:1: rule__IO__ReadAssignment_0 : ( ruleRead ) ;
    public final void rule__IO__ReadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3093:1: ( ( ruleRead ) )
            // InternalImperativa1.g:3094:2: ( ruleRead )
            {
            // InternalImperativa1.g:3094:2: ( ruleRead )
            // InternalImperativa1.g:3095:3: ruleRead
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIOAccess().getReadReadParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRead();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIOAccess().getReadReadParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IO__ReadAssignment_0"


    // $ANTLR start "rule__IO__WriteAssignment_1"
    // InternalImperativa1.g:3104:1: rule__IO__WriteAssignment_1 : ( ruleWrite ) ;
    public final void rule__IO__WriteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3108:1: ( ( ruleWrite ) )
            // InternalImperativa1.g:3109:2: ( ruleWrite )
            {
            // InternalImperativa1.g:3109:2: ( ruleWrite )
            // InternalImperativa1.g:3110:3: ruleWrite
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIOAccess().getWriteWriteParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWrite();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIOAccess().getWriteWriteParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IO__WriteAssignment_1"


    // $ANTLR start "rule__Read__PidAssignment_2"
    // InternalImperativa1.g:3119:1: rule__Read__PidAssignment_2 : ( rulePId ) ;
    public final void rule__Read__PidAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3123:1: ( ( rulePId ) )
            // InternalImperativa1.g:3124:2: ( rulePId )
            {
            // InternalImperativa1.g:3124:2: ( rulePId )
            // InternalImperativa1.g:3125:3: rulePId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReadAccess().getPidPIdParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReadAccess().getPidPIdParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__PidAssignment_2"


    // $ANTLR start "rule__Write__ExpressaoAssignment_2"
    // InternalImperativa1.g:3134:1: rule__Write__ExpressaoAssignment_2 : ( ruleExpressao ) ;
    public final void rule__Write__ExpressaoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3138:1: ( ( ruleExpressao ) )
            // InternalImperativa1.g:3139:2: ( ruleExpressao )
            {
            // InternalImperativa1.g:3139:2: ( ruleExpressao )
            // InternalImperativa1.g:3140:3: ruleExpressao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWriteAccess().getExpressaoExpressaoParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWriteAccess().getExpressaoExpressaoParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__ExpressaoAssignment_2"


    // $ANTLR start "rule__IfThenElse__ExpressaoAssignment_1"
    // InternalImperativa1.g:3149:1: rule__IfThenElse__ExpressaoAssignment_1 : ( ruleExpressao ) ;
    public final void rule__IfThenElse__ExpressaoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3153:1: ( ( ruleExpressao ) )
            // InternalImperativa1.g:3154:2: ( ruleExpressao )
            {
            // InternalImperativa1.g:3154:2: ( ruleExpressao )
            // InternalImperativa1.g:3155:3: ruleExpressao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getExpressaoExpressaoParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getExpressaoExpressaoParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__ExpressaoAssignment_1"


    // $ANTLR start "rule__IfThenElse__ComandoAssignment_3"
    // InternalImperativa1.g:3164:1: rule__IfThenElse__ComandoAssignment_3 : ( ruleComando ) ;
    public final void rule__IfThenElse__ComandoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3168:1: ( ( ruleComando ) )
            // InternalImperativa1.g:3169:2: ( ruleComando )
            {
            // InternalImperativa1.g:3169:2: ( ruleComando )
            // InternalImperativa1.g:3170:3: ruleComando
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getComandoComandoParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getComandoComandoParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__ComandoAssignment_3"


    // $ANTLR start "rule__IfThenElse__ComandoAssignment_5"
    // InternalImperativa1.g:3179:1: rule__IfThenElse__ComandoAssignment_5 : ( ruleComando ) ;
    public final void rule__IfThenElse__ComandoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3183:1: ( ( ruleComando ) )
            // InternalImperativa1.g:3184:2: ( ruleComando )
            {
            // InternalImperativa1.g:3184:2: ( ruleComando )
            // InternalImperativa1.g:3185:3: ruleComando
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getComandoComandoParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getComandoComandoParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__ComandoAssignment_5"


    // $ANTLR start "rule__While__ExpressaoAssignment_1"
    // InternalImperativa1.g:3194:1: rule__While__ExpressaoAssignment_1 : ( ruleExpressao ) ;
    public final void rule__While__ExpressaoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3198:1: ( ( ruleExpressao ) )
            // InternalImperativa1.g:3199:2: ( ruleExpressao )
            {
            // InternalImperativa1.g:3199:2: ( ruleExpressao )
            // InternalImperativa1.g:3200:3: ruleExpressao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getExpressaoExpressaoParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getExpressaoExpressaoParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__ExpressaoAssignment_1"


    // $ANTLR start "rule__While__ComandoAssignment_3"
    // InternalImperativa1.g:3209:1: rule__While__ComandoAssignment_3 : ( ruleComando ) ;
    public final void rule__While__ComandoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3213:1: ( ( ruleComando ) )
            // InternalImperativa1.g:3214:2: ( ruleComando )
            {
            // InternalImperativa1.g:3214:2: ( ruleComando )
            // InternalImperativa1.g:3215:3: ruleComando
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getComandoComandoParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getComandoComandoParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__ComandoAssignment_3"


    // $ANTLR start "rule__Skip__SkipAssignment"
    // InternalImperativa1.g:3224:1: rule__Skip__SkipAssignment : ( ( 'skip' ) ) ;
    public final void rule__Skip__SkipAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3228:1: ( ( ( 'skip' ) ) )
            // InternalImperativa1.g:3229:2: ( ( 'skip' ) )
            {
            // InternalImperativa1.g:3229:2: ( ( 'skip' ) )
            // InternalImperativa1.g:3230:3: ( 'skip' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSkipSkipKeyword_0()); 
            }
            // InternalImperativa1.g:3231:3: ( 'skip' )
            // InternalImperativa1.g:3232:4: 'skip'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSkipSkipKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkipAccess().getSkipSkipKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkipAccess().getSkipSkipKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skip__SkipAssignment"


    // $ANTLR start "rule__Atribuicao__PidAssignment_0"
    // InternalImperativa1.g:3243:1: rule__Atribuicao__PidAssignment_0 : ( rulePId ) ;
    public final void rule__Atribuicao__PidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3247:1: ( ( rulePId ) )
            // InternalImperativa1.g:3248:2: ( rulePId )
            {
            // InternalImperativa1.g:3248:2: ( rulePId )
            // InternalImperativa1.g:3249:3: rulePId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribuicaoAccess().getPidPIdParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtribuicaoAccess().getPidPIdParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuicao__PidAssignment_0"


    // $ANTLR start "rule__Atribuicao__ExpressaoAssignment_2"
    // InternalImperativa1.g:3258:1: rule__Atribuicao__ExpressaoAssignment_2 : ( ruleExpressao ) ;
    public final void rule__Atribuicao__ExpressaoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3262:1: ( ( ruleExpressao ) )
            // InternalImperativa1.g:3263:2: ( ruleExpressao )
            {
            // InternalImperativa1.g:3263:2: ( ruleExpressao )
            // InternalImperativa1.g:3264:3: ruleExpressao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtribuicaoAccess().getExpressaoExpressaoParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtribuicaoAccess().getExpressaoExpressaoParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atribuicao__ExpressaoAssignment_2"


    // $ANTLR start "rule__Valor__IntTypeAssignment_0"
    // InternalImperativa1.g:3273:1: rule__Valor__IntTypeAssignment_0 : ( RULE_VALORINTEIRO ) ;
    public final void rule__Valor__IntTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3277:1: ( ( RULE_VALORINTEIRO ) )
            // InternalImperativa1.g:3278:2: ( RULE_VALORINTEIRO )
            {
            // InternalImperativa1.g:3278:2: ( RULE_VALORINTEIRO )
            // InternalImperativa1.g:3279:3: RULE_VALORINTEIRO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValorAccess().getIntTypeVALORINTEIROTerminalRuleCall_0_0()); 
            }
            match(input,RULE_VALORINTEIRO,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValorAccess().getIntTypeVALORINTEIROTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Valor__IntTypeAssignment_0"


    // $ANTLR start "rule__Valor__StringTypeAssignment_1"
    // InternalImperativa1.g:3288:1: rule__Valor__StringTypeAssignment_1 : ( RULE_VALORSTRING ) ;
    public final void rule__Valor__StringTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3292:1: ( ( RULE_VALORSTRING ) )
            // InternalImperativa1.g:3293:2: ( RULE_VALORSTRING )
            {
            // InternalImperativa1.g:3293:2: ( RULE_VALORSTRING )
            // InternalImperativa1.g:3294:3: RULE_VALORSTRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValorAccess().getStringTypeVALORSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_VALORSTRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValorAccess().getStringTypeVALORSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Valor__StringTypeAssignment_1"


    // $ANTLR start "rule__Valor__BoolTypeAssignment_2"
    // InternalImperativa1.g:3303:1: rule__Valor__BoolTypeAssignment_2 : ( RULE_VALORBOOLEANO ) ;
    public final void rule__Valor__BoolTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3307:1: ( ( RULE_VALORBOOLEANO ) )
            // InternalImperativa1.g:3308:2: ( RULE_VALORBOOLEANO )
            {
            // InternalImperativa1.g:3308:2: ( RULE_VALORBOOLEANO )
            // InternalImperativa1.g:3309:3: RULE_VALORBOOLEANO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValorAccess().getBoolTypeVALORBOOLEANOTerminalRuleCall_2_0()); 
            }
            match(input,RULE_VALORBOOLEANO,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValorAccess().getBoolTypeVALORBOOLEANOTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Valor__BoolTypeAssignment_2"


    // $ANTLR start "rule__ExpMenos__MenosExpressaoAssignment_1"
    // InternalImperativa1.g:3318:1: rule__ExpMenos__MenosExpressaoAssignment_1 : ( ruleExpressao ) ;
    public final void rule__ExpMenos__MenosExpressaoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3322:1: ( ( ruleExpressao ) )
            // InternalImperativa1.g:3323:2: ( ruleExpressao )
            {
            // InternalImperativa1.g:3323:2: ( ruleExpressao )
            // InternalImperativa1.g:3324:3: ruleExpressao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpMenosAccess().getMenosExpressaoExpressaoParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpMenosAccess().getMenosExpressaoExpressaoParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpMenos__MenosExpressaoAssignment_1"


    // $ANTLR start "rule__ExpNot__NotExpressaoAssignment_1"
    // InternalImperativa1.g:3333:1: rule__ExpNot__NotExpressaoAssignment_1 : ( ruleExpressao ) ;
    public final void rule__ExpNot__NotExpressaoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3337:1: ( ( ruleExpressao ) )
            // InternalImperativa1.g:3338:2: ( ruleExpressao )
            {
            // InternalImperativa1.g:3338:2: ( ruleExpressao )
            // InternalImperativa1.g:3339:3: ruleExpressao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpNotAccess().getNotExpressaoExpressaoParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpNotAccess().getNotExpressaoExpressaoParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpNot__NotExpressaoAssignment_1"


    // $ANTLR start "rule__ExpLenght__LengthExpressaoAssignment_1"
    // InternalImperativa1.g:3348:1: rule__ExpLenght__LengthExpressaoAssignment_1 : ( ruleExpressao ) ;
    public final void rule__ExpLenght__LengthExpressaoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3352:1: ( ( ruleExpressao ) )
            // InternalImperativa1.g:3353:2: ( ruleExpressao )
            {
            // InternalImperativa1.g:3353:2: ( ruleExpressao )
            // InternalImperativa1.g:3354:3: ruleExpressao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpLenghtAccess().getLengthExpressaoExpressaoParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpLenghtAccess().getLengthExpressaoExpressaoParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpLenght__LengthExpressaoAssignment_1"


    // $ANTLR start "rule__ExpPrimaria__PidAssignment_0"
    // InternalImperativa1.g:3363:1: rule__ExpPrimaria__PidAssignment_0 : ( rulePId ) ;
    public final void rule__ExpPrimaria__PidAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3367:1: ( ( rulePId ) )
            // InternalImperativa1.g:3368:2: ( rulePId )
            {
            // InternalImperativa1.g:3368:2: ( rulePId )
            // InternalImperativa1.g:3369:3: rulePId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpPrimariaAccess().getPidPIdParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpPrimariaAccess().getPidPIdParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpPrimaria__PidAssignment_0"


    // $ANTLR start "rule__ExpPrimaria__ValorAssignment_1"
    // InternalImperativa1.g:3378:1: rule__ExpPrimaria__ValorAssignment_1 : ( ruleValor ) ;
    public final void rule__ExpPrimaria__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3382:1: ( ( ruleValor ) )
            // InternalImperativa1.g:3383:2: ( ruleValor )
            {
            // InternalImperativa1.g:3383:2: ( ruleValor )
            // InternalImperativa1.g:3384:3: ruleValor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpPrimariaAccess().getValorValorParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpPrimariaAccess().getValorValorParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpPrimaria__ValorAssignment_1"


    // $ANTLR start "rule__ExpPrimaria__ExpressaoAssignment_2_1"
    // InternalImperativa1.g:3393:1: rule__ExpPrimaria__ExpressaoAssignment_2_1 : ( ruleExpressao ) ;
    public final void rule__ExpPrimaria__ExpressaoAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3397:1: ( ( ruleExpressao ) )
            // InternalImperativa1.g:3398:2: ( ruleExpressao )
            {
            // InternalImperativa1.g:3398:2: ( ruleExpressao )
            // InternalImperativa1.g:3399:3: ruleExpressao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpPrimariaAccess().getExpressaoExpressaoParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpPrimariaAccess().getExpressaoExpressaoParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpPrimaria__ExpressaoAssignment_2_1"


    // $ANTLR start "rule__ExpUnaria__MenosExpressaoAssignment_0"
    // InternalImperativa1.g:3408:1: rule__ExpUnaria__MenosExpressaoAssignment_0 : ( ruleExpMenos ) ;
    public final void rule__ExpUnaria__MenosExpressaoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3412:1: ( ( ruleExpMenos ) )
            // InternalImperativa1.g:3413:2: ( ruleExpMenos )
            {
            // InternalImperativa1.g:3413:2: ( ruleExpMenos )
            // InternalImperativa1.g:3414:3: ruleExpMenos
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpUnariaAccess().getMenosExpressaoExpMenosParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpMenos();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpUnariaAccess().getMenosExpressaoExpMenosParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpUnaria__MenosExpressaoAssignment_0"


    // $ANTLR start "rule__ExpUnaria__NotExpressaoAssignment_1"
    // InternalImperativa1.g:3423:1: rule__ExpUnaria__NotExpressaoAssignment_1 : ( ruleExpNot ) ;
    public final void rule__ExpUnaria__NotExpressaoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3427:1: ( ( ruleExpNot ) )
            // InternalImperativa1.g:3428:2: ( ruleExpNot )
            {
            // InternalImperativa1.g:3428:2: ( ruleExpNot )
            // InternalImperativa1.g:3429:3: ruleExpNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpUnariaAccess().getNotExpressaoExpNotParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpUnariaAccess().getNotExpressaoExpNotParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpUnaria__NotExpressaoAssignment_1"


    // $ANTLR start "rule__ExpUnaria__LengthExpressaoAssignment_2"
    // InternalImperativa1.g:3438:1: rule__ExpUnaria__LengthExpressaoAssignment_2 : ( ruleExpLenght ) ;
    public final void rule__ExpUnaria__LengthExpressaoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3442:1: ( ( ruleExpLenght ) )
            // InternalImperativa1.g:3443:2: ( ruleExpLenght )
            {
            // InternalImperativa1.g:3443:2: ( ruleExpLenght )
            // InternalImperativa1.g:3444:3: ruleExpLenght
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpUnariaAccess().getLengthExpressaoExpLenghtParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpLenght();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpUnariaAccess().getLengthExpressaoExpLenghtParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpUnaria__LengthExpressaoAssignment_2"


    // $ANTLR start "rule__ExpBinaria__SomaExpressaoAssignment_0"
    // InternalImperativa1.g:3453:1: rule__ExpBinaria__SomaExpressaoAssignment_0 : ( ruleExpSoma ) ;
    public final void rule__ExpBinaria__SomaExpressaoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3457:1: ( ( ruleExpSoma ) )
            // InternalImperativa1.g:3458:2: ( ruleExpSoma )
            {
            // InternalImperativa1.g:3458:2: ( ruleExpSoma )
            // InternalImperativa1.g:3459:3: ruleExpSoma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpBinariaAccess().getSomaExpressaoExpSomaParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpSoma();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpBinariaAccess().getSomaExpressaoExpSomaParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpBinaria__SomaExpressaoAssignment_0"


    // $ANTLR start "rule__ExpBinaria__SubExpressaoAssignment_1"
    // InternalImperativa1.g:3468:1: rule__ExpBinaria__SubExpressaoAssignment_1 : ( ruleExpSub ) ;
    public final void rule__ExpBinaria__SubExpressaoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3472:1: ( ( ruleExpSub ) )
            // InternalImperativa1.g:3473:2: ( ruleExpSub )
            {
            // InternalImperativa1.g:3473:2: ( ruleExpSub )
            // InternalImperativa1.g:3474:3: ruleExpSub
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpBinariaAccess().getSubExpressaoExpSubParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpSub();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpBinariaAccess().getSubExpressaoExpSubParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpBinaria__SubExpressaoAssignment_1"


    // $ANTLR start "rule__ExpBinaria__OrExpressaoAssignment_2"
    // InternalImperativa1.g:3483:1: rule__ExpBinaria__OrExpressaoAssignment_2 : ( ruleExpOr ) ;
    public final void rule__ExpBinaria__OrExpressaoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3487:1: ( ( ruleExpOr ) )
            // InternalImperativa1.g:3488:2: ( ruleExpOr )
            {
            // InternalImperativa1.g:3488:2: ( ruleExpOr )
            // InternalImperativa1.g:3489:3: ruleExpOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpBinariaAccess().getOrExpressaoExpOrParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpBinariaAccess().getOrExpressaoExpOrParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpBinaria__OrExpressaoAssignment_2"


    // $ANTLR start "rule__ExpBinaria__AndExpressaoAssignment_3"
    // InternalImperativa1.g:3498:1: rule__ExpBinaria__AndExpressaoAssignment_3 : ( ruleExpAnd ) ;
    public final void rule__ExpBinaria__AndExpressaoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3502:1: ( ( ruleExpAnd ) )
            // InternalImperativa1.g:3503:2: ( ruleExpAnd )
            {
            // InternalImperativa1.g:3503:2: ( ruleExpAnd )
            // InternalImperativa1.g:3504:3: ruleExpAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpBinariaAccess().getAndExpressaoExpAndParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpBinariaAccess().getAndExpressaoExpAndParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpBinaria__AndExpressaoAssignment_3"


    // $ANTLR start "rule__ExpBinaria__EqualsExpressaoAssignment_4"
    // InternalImperativa1.g:3513:1: rule__ExpBinaria__EqualsExpressaoAssignment_4 : ( ruleExpEquals ) ;
    public final void rule__ExpBinaria__EqualsExpressaoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3517:1: ( ( ruleExpEquals ) )
            // InternalImperativa1.g:3518:2: ( ruleExpEquals )
            {
            // InternalImperativa1.g:3518:2: ( ruleExpEquals )
            // InternalImperativa1.g:3519:3: ruleExpEquals
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpBinariaAccess().getEqualsExpressaoExpEqualsParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpBinariaAccess().getEqualsExpressaoExpEqualsParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpBinaria__EqualsExpressaoAssignment_4"


    // $ANTLR start "rule__ExpBinaria__ConcatExpressaoAssignment_5"
    // InternalImperativa1.g:3528:1: rule__ExpBinaria__ConcatExpressaoAssignment_5 : ( ruleExpConcat ) ;
    public final void rule__ExpBinaria__ConcatExpressaoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3532:1: ( ( ruleExpConcat ) )
            // InternalImperativa1.g:3533:2: ( ruleExpConcat )
            {
            // InternalImperativa1.g:3533:2: ( ruleExpConcat )
            // InternalImperativa1.g:3534:3: ruleExpConcat
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpBinariaAccess().getConcatExpressaoExpConcatParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpConcat();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpBinariaAccess().getConcatExpressaoExpConcatParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpBinaria__ConcatExpressaoAssignment_5"


    // $ANTLR start "rule__ExpSoma__ValorAssignment_0"
    // InternalImperativa1.g:3543:1: rule__ExpSoma__ValorAssignment_0 : ( ruleValor ) ;
    public final void rule__ExpSoma__ValorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3547:1: ( ( ruleValor ) )
            // InternalImperativa1.g:3548:2: ( ruleValor )
            {
            // InternalImperativa1.g:3548:2: ( ruleValor )
            // InternalImperativa1.g:3549:3: ruleValor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpSomaAccess().getValorValorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpSomaAccess().getValorValorParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpSoma__ValorAssignment_0"


    // $ANTLR start "rule__ExpSoma__ExpressaoAssignment_2"
    // InternalImperativa1.g:3558:1: rule__ExpSoma__ExpressaoAssignment_2 : ( ruleExpressao ) ;
    public final void rule__ExpSoma__ExpressaoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3562:1: ( ( ruleExpressao ) )
            // InternalImperativa1.g:3563:2: ( ruleExpressao )
            {
            // InternalImperativa1.g:3563:2: ( ruleExpressao )
            // InternalImperativa1.g:3564:3: ruleExpressao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpSomaAccess().getExpressaoExpressaoParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpSomaAccess().getExpressaoExpressaoParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpSoma__ExpressaoAssignment_2"


    // $ANTLR start "rule__ExpSub__ValorAssignment_0"
    // InternalImperativa1.g:3573:1: rule__ExpSub__ValorAssignment_0 : ( ruleValor ) ;
    public final void rule__ExpSub__ValorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3577:1: ( ( ruleValor ) )
            // InternalImperativa1.g:3578:2: ( ruleValor )
            {
            // InternalImperativa1.g:3578:2: ( ruleValor )
            // InternalImperativa1.g:3579:3: ruleValor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpSubAccess().getValorValorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpSubAccess().getValorValorParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpSub__ValorAssignment_0"


    // $ANTLR start "rule__ExpSub__ExpressaoAssignment_2"
    // InternalImperativa1.g:3588:1: rule__ExpSub__ExpressaoAssignment_2 : ( ruleExpressao ) ;
    public final void rule__ExpSub__ExpressaoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3592:1: ( ( ruleExpressao ) )
            // InternalImperativa1.g:3593:2: ( ruleExpressao )
            {
            // InternalImperativa1.g:3593:2: ( ruleExpressao )
            // InternalImperativa1.g:3594:3: ruleExpressao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpSubAccess().getExpressaoExpressaoParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpSubAccess().getExpressaoExpressaoParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpSub__ExpressaoAssignment_2"


    // $ANTLR start "rule__ExpAnd__ValorAssignment_0"
    // InternalImperativa1.g:3603:1: rule__ExpAnd__ValorAssignment_0 : ( ruleValor ) ;
    public final void rule__ExpAnd__ValorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3607:1: ( ( ruleValor ) )
            // InternalImperativa1.g:3608:2: ( ruleValor )
            {
            // InternalImperativa1.g:3608:2: ( ruleValor )
            // InternalImperativa1.g:3609:3: ruleValor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpAndAccess().getValorValorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpAndAccess().getValorValorParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAnd__ValorAssignment_0"


    // $ANTLR start "rule__ExpAnd__ExpressaoAssignment_2"
    // InternalImperativa1.g:3618:1: rule__ExpAnd__ExpressaoAssignment_2 : ( ruleExpressao ) ;
    public final void rule__ExpAnd__ExpressaoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3622:1: ( ( ruleExpressao ) )
            // InternalImperativa1.g:3623:2: ( ruleExpressao )
            {
            // InternalImperativa1.g:3623:2: ( ruleExpressao )
            // InternalImperativa1.g:3624:3: ruleExpressao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpAndAccess().getExpressaoExpressaoParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpAndAccess().getExpressaoExpressaoParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpAnd__ExpressaoAssignment_2"


    // $ANTLR start "rule__ExpOr__ValorAssignment_0"
    // InternalImperativa1.g:3633:1: rule__ExpOr__ValorAssignment_0 : ( ruleValor ) ;
    public final void rule__ExpOr__ValorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3637:1: ( ( ruleValor ) )
            // InternalImperativa1.g:3638:2: ( ruleValor )
            {
            // InternalImperativa1.g:3638:2: ( ruleValor )
            // InternalImperativa1.g:3639:3: ruleValor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpOrAccess().getValorValorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpOrAccess().getValorValorParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOr__ValorAssignment_0"


    // $ANTLR start "rule__ExpOr__ExpressaoAssignment_2"
    // InternalImperativa1.g:3648:1: rule__ExpOr__ExpressaoAssignment_2 : ( ruleExpressao ) ;
    public final void rule__ExpOr__ExpressaoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3652:1: ( ( ruleExpressao ) )
            // InternalImperativa1.g:3653:2: ( ruleExpressao )
            {
            // InternalImperativa1.g:3653:2: ( ruleExpressao )
            // InternalImperativa1.g:3654:3: ruleExpressao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpOrAccess().getExpressaoExpressaoParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpOrAccess().getExpressaoExpressaoParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOr__ExpressaoAssignment_2"


    // $ANTLR start "rule__ExpEquals__ValorAssignment_0"
    // InternalImperativa1.g:3663:1: rule__ExpEquals__ValorAssignment_0 : ( ruleValor ) ;
    public final void rule__ExpEquals__ValorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3667:1: ( ( ruleValor ) )
            // InternalImperativa1.g:3668:2: ( ruleValor )
            {
            // InternalImperativa1.g:3668:2: ( ruleValor )
            // InternalImperativa1.g:3669:3: ruleValor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpEqualsAccess().getValorValorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpEqualsAccess().getValorValorParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpEquals__ValorAssignment_0"


    // $ANTLR start "rule__ExpEquals__ExpressaoAssignment_2"
    // InternalImperativa1.g:3678:1: rule__ExpEquals__ExpressaoAssignment_2 : ( ruleExpressao ) ;
    public final void rule__ExpEquals__ExpressaoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3682:1: ( ( ruleExpressao ) )
            // InternalImperativa1.g:3683:2: ( ruleExpressao )
            {
            // InternalImperativa1.g:3683:2: ( ruleExpressao )
            // InternalImperativa1.g:3684:3: ruleExpressao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpEqualsAccess().getExpressaoExpressaoParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpEqualsAccess().getExpressaoExpressaoParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpEquals__ExpressaoAssignment_2"


    // $ANTLR start "rule__ExpConcat__ValorAssignment_0"
    // InternalImperativa1.g:3693:1: rule__ExpConcat__ValorAssignment_0 : ( ruleValor ) ;
    public final void rule__ExpConcat__ValorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3697:1: ( ( ruleValor ) )
            // InternalImperativa1.g:3698:2: ( ruleValor )
            {
            // InternalImperativa1.g:3698:2: ( ruleValor )
            // InternalImperativa1.g:3699:3: ruleValor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpConcatAccess().getValorValorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpConcatAccess().getValorValorParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpConcat__ValorAssignment_0"


    // $ANTLR start "rule__ExpConcat__ExpressaoAssignment_2"
    // InternalImperativa1.g:3708:1: rule__ExpConcat__ExpressaoAssignment_2 : ( ruleExpressao ) ;
    public final void rule__ExpConcat__ExpressaoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3712:1: ( ( ruleExpressao ) )
            // InternalImperativa1.g:3713:2: ( ruleExpressao )
            {
            // InternalImperativa1.g:3713:2: ( ruleExpressao )
            // InternalImperativa1.g:3714:3: ruleExpressao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpConcatAccess().getExpressaoExpressaoParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpConcatAccess().getExpressaoExpressaoParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpConcat__ExpressaoAssignment_2"


    // $ANTLR start "rule__Expressao__ExpUnariaAssignment_0"
    // InternalImperativa1.g:3723:1: rule__Expressao__ExpUnariaAssignment_0 : ( ruleExpUnaria ) ;
    public final void rule__Expressao__ExpUnariaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3727:1: ( ( ruleExpUnaria ) )
            // InternalImperativa1.g:3728:2: ( ruleExpUnaria )
            {
            // InternalImperativa1.g:3728:2: ( ruleExpUnaria )
            // InternalImperativa1.g:3729:3: ruleExpUnaria
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressaoAccess().getExpUnariaExpUnariaParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpUnaria();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressaoAccess().getExpUnariaExpUnariaParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__ExpUnariaAssignment_0"


    // $ANTLR start "rule__Expressao__ExpPrimariaAssignment_1"
    // InternalImperativa1.g:3738:1: rule__Expressao__ExpPrimariaAssignment_1 : ( ruleExpPrimaria ) ;
    public final void rule__Expressao__ExpPrimariaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3742:1: ( ( ruleExpPrimaria ) )
            // InternalImperativa1.g:3743:2: ( ruleExpPrimaria )
            {
            // InternalImperativa1.g:3743:2: ( ruleExpPrimaria )
            // InternalImperativa1.g:3744:3: ruleExpPrimaria
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressaoAccess().getExpPrimariaExpPrimariaParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpPrimaria();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressaoAccess().getExpPrimariaExpPrimariaParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__ExpPrimariaAssignment_1"


    // $ANTLR start "rule__Expressao__ExpBinariaAssignment_2"
    // InternalImperativa1.g:3753:1: rule__Expressao__ExpBinariaAssignment_2 : ( ruleExpBinaria ) ;
    public final void rule__Expressao__ExpBinariaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3757:1: ( ( ruleExpBinaria ) )
            // InternalImperativa1.g:3758:2: ( ruleExpBinaria )
            {
            // InternalImperativa1.g:3758:2: ( ruleExpBinaria )
            // InternalImperativa1.g:3759:3: ruleExpBinaria
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressaoAccess().getExpBinariaExpBinariaParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpBinaria();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressaoAccess().getExpBinariaExpBinariaParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__ExpBinariaAssignment_2"


    // $ANTLR start "rule__ComandoSimples__SkipAssignment_0"
    // InternalImperativa1.g:3768:1: rule__ComandoSimples__SkipAssignment_0 : ( ruleSkip ) ;
    public final void rule__ComandoSimples__SkipAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3772:1: ( ( ruleSkip ) )
            // InternalImperativa1.g:3773:2: ( ruleSkip )
            {
            // InternalImperativa1.g:3773:2: ( ruleSkip )
            // InternalImperativa1.g:3774:3: ruleSkip
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoSimplesAccess().getSkipSkipParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSkip();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoSimplesAccess().getSkipSkipParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSimples__SkipAssignment_0"


    // $ANTLR start "rule__ComandoSimples__AtribuicaoAssignment_1"
    // InternalImperativa1.g:3783:1: rule__ComandoSimples__AtribuicaoAssignment_1 : ( ruleAtribuicao ) ;
    public final void rule__ComandoSimples__AtribuicaoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3787:1: ( ( ruleAtribuicao ) )
            // InternalImperativa1.g:3788:2: ( ruleAtribuicao )
            {
            // InternalImperativa1.g:3788:2: ( ruleAtribuicao )
            // InternalImperativa1.g:3789:3: ruleAtribuicao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoSimplesAccess().getAtribuicaoAtribuicaoParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAtribuicao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoSimplesAccess().getAtribuicaoAtribuicaoParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSimples__AtribuicaoAssignment_1"


    // $ANTLR start "rule__ComandoSimples__ComandoDeclaracaoAssignment_2"
    // InternalImperativa1.g:3798:1: rule__ComandoSimples__ComandoDeclaracaoAssignment_2 : ( ruleComandoDeclaracao ) ;
    public final void rule__ComandoSimples__ComandoDeclaracaoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3802:1: ( ( ruleComandoDeclaracao ) )
            // InternalImperativa1.g:3803:2: ( ruleComandoDeclaracao )
            {
            // InternalImperativa1.g:3803:2: ( ruleComandoDeclaracao )
            // InternalImperativa1.g:3804:3: ruleComandoDeclaracao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoSimplesAccess().getComandoDeclaracaoComandoDeclaracaoParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComandoDeclaracao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoSimplesAccess().getComandoDeclaracaoComandoDeclaracaoParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSimples__ComandoDeclaracaoAssignment_2"


    // $ANTLR start "rule__ComandoSimples__WhileAssignment_3"
    // InternalImperativa1.g:3813:1: rule__ComandoSimples__WhileAssignment_3 : ( ruleWhile ) ;
    public final void rule__ComandoSimples__WhileAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3817:1: ( ( ruleWhile ) )
            // InternalImperativa1.g:3818:2: ( ruleWhile )
            {
            // InternalImperativa1.g:3818:2: ( ruleWhile )
            // InternalImperativa1.g:3819:3: ruleWhile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoSimplesAccess().getWhileWhileParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoSimplesAccess().getWhileWhileParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSimples__WhileAssignment_3"


    // $ANTLR start "rule__ComandoSimples__IfThenElseAssignment_4"
    // InternalImperativa1.g:3828:1: rule__ComandoSimples__IfThenElseAssignment_4 : ( ruleIfThenElse ) ;
    public final void rule__ComandoSimples__IfThenElseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3832:1: ( ( ruleIfThenElse ) )
            // InternalImperativa1.g:3833:2: ( ruleIfThenElse )
            {
            // InternalImperativa1.g:3833:2: ( ruleIfThenElse )
            // InternalImperativa1.g:3834:3: ruleIfThenElse
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoSimplesAccess().getIfThenElseIfThenElseParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIfThenElse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoSimplesAccess().getIfThenElseIfThenElseParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSimples__IfThenElseAssignment_4"


    // $ANTLR start "rule__ComandoSimples__IoAssignment_5"
    // InternalImperativa1.g:3843:1: rule__ComandoSimples__IoAssignment_5 : ( ruleIO ) ;
    public final void rule__ComandoSimples__IoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3847:1: ( ( ruleIO ) )
            // InternalImperativa1.g:3848:2: ( ruleIO )
            {
            // InternalImperativa1.g:3848:2: ( ruleIO )
            // InternalImperativa1.g:3849:3: ruleIO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoSimplesAccess().getIoIOParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIO();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoSimplesAccess().getIoIOParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSimples__IoAssignment_5"


    // $ANTLR start "rule__ComandoSimples__ComandoAssignment_6_1"
    // InternalImperativa1.g:3858:1: rule__ComandoSimples__ComandoAssignment_6_1 : ( ruleComando ) ;
    public final void rule__ComandoSimples__ComandoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3862:1: ( ( ruleComando ) )
            // InternalImperativa1.g:3863:2: ( ruleComando )
            {
            // InternalImperativa1.g:3863:2: ( ruleComando )
            // InternalImperativa1.g:3864:3: ruleComando
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoSimplesAccess().getComandoComandoParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoSimplesAccess().getComandoComandoParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSimples__ComandoAssignment_6_1"


    // $ANTLR start "rule__ComandoDeclaracao__DeclaracaoAssignment_1"
    // InternalImperativa1.g:3873:1: rule__ComandoDeclaracao__DeclaracaoAssignment_1 : ( ruleDeclaracao ) ;
    public final void rule__ComandoDeclaracao__DeclaracaoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3877:1: ( ( ruleDeclaracao ) )
            // InternalImperativa1.g:3878:2: ( ruleDeclaracao )
            {
            // InternalImperativa1.g:3878:2: ( ruleDeclaracao )
            // InternalImperativa1.g:3879:3: ruleDeclaracao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoDeclaracaoAccess().getDeclaracaoDeclaracaoParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclaracao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoDeclaracaoAccess().getDeclaracaoDeclaracaoParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoDeclaracao__DeclaracaoAssignment_1"


    // $ANTLR start "rule__ComandoDeclaracao__ComandoAssignment_3"
    // InternalImperativa1.g:3888:1: rule__ComandoDeclaracao__ComandoAssignment_3 : ( ruleComando ) ;
    public final void rule__ComandoDeclaracao__ComandoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3892:1: ( ( ruleComando ) )
            // InternalImperativa1.g:3893:2: ( ruleComando )
            {
            // InternalImperativa1.g:3893:2: ( ruleComando )
            // InternalImperativa1.g:3894:3: ruleComando
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComandoDeclaracaoAccess().getComandoComandoParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComandoDeclaracaoAccess().getComandoComandoParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoDeclaracao__ComandoAssignment_3"


    // $ANTLR start "rule__Declaracao__DecCompostaAssignment_0"
    // InternalImperativa1.g:3903:1: rule__Declaracao__DecCompostaAssignment_0 : ( ruleDeclaracaoComposta ) ;
    public final void rule__Declaracao__DecCompostaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3907:1: ( ( ruleDeclaracaoComposta ) )
            // InternalImperativa1.g:3908:2: ( ruleDeclaracaoComposta )
            {
            // InternalImperativa1.g:3908:2: ( ruleDeclaracaoComposta )
            // InternalImperativa1.g:3909:3: ruleDeclaracaoComposta
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoAccess().getDecCompostaDeclaracaoCompostaParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclaracaoComposta();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoAccess().getDecCompostaDeclaracaoCompostaParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaracao__DecCompostaAssignment_0"


    // $ANTLR start "rule__Declaracao__DecVariavelAssignment_1"
    // InternalImperativa1.g:3918:1: rule__Declaracao__DecVariavelAssignment_1 : ( ruleDeclaracaoVariavel ) ;
    public final void rule__Declaracao__DecVariavelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3922:1: ( ( ruleDeclaracaoVariavel ) )
            // InternalImperativa1.g:3923:2: ( ruleDeclaracaoVariavel )
            {
            // InternalImperativa1.g:3923:2: ( ruleDeclaracaoVariavel )
            // InternalImperativa1.g:3924:3: ruleDeclaracaoVariavel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoAccess().getDecVariavelDeclaracaoVariavelParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclaracaoVariavel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoAccess().getDecVariavelDeclaracaoVariavelParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaracao__DecVariavelAssignment_1"


    // $ANTLR start "rule__Declaracao__DeclaracaoAssignment_2_1"
    // InternalImperativa1.g:3933:1: rule__Declaracao__DeclaracaoAssignment_2_1 : ( ruleDeclaracao ) ;
    public final void rule__Declaracao__DeclaracaoAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3937:1: ( ( ruleDeclaracao ) )
            // InternalImperativa1.g:3938:2: ( ruleDeclaracao )
            {
            // InternalImperativa1.g:3938:2: ( ruleDeclaracao )
            // InternalImperativa1.g:3939:3: ruleDeclaracao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoAccess().getDeclaracaoDeclaracaoParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclaracao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoAccess().getDeclaracaoDeclaracaoParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaracao__DeclaracaoAssignment_2_1"


    // $ANTLR start "rule__DeclaracaoComposta__DecVariavelAssignment_0"
    // InternalImperativa1.g:3948:1: rule__DeclaracaoComposta__DecVariavelAssignment_0 : ( ruleDeclaracaoVariavel ) ;
    public final void rule__DeclaracaoComposta__DecVariavelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3952:1: ( ( ruleDeclaracaoVariavel ) )
            // InternalImperativa1.g:3953:2: ( ruleDeclaracaoVariavel )
            {
            // InternalImperativa1.g:3953:2: ( ruleDeclaracaoVariavel )
            // InternalImperativa1.g:3954:3: ruleDeclaracaoVariavel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoCompostaAccess().getDecVariavelDeclaracaoVariavelParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclaracaoVariavel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoCompostaAccess().getDecVariavelDeclaracaoVariavelParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoComposta__DecVariavelAssignment_0"


    // $ANTLR start "rule__DeclaracaoComposta__DeclaracaoAssignment_2"
    // InternalImperativa1.g:3963:1: rule__DeclaracaoComposta__DeclaracaoAssignment_2 : ( ruleDeclaracao ) ;
    public final void rule__DeclaracaoComposta__DeclaracaoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3967:1: ( ( ruleDeclaracao ) )
            // InternalImperativa1.g:3968:2: ( ruleDeclaracao )
            {
            // InternalImperativa1.g:3968:2: ( ruleDeclaracao )
            // InternalImperativa1.g:3969:3: ruleDeclaracao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoCompostaAccess().getDeclaracaoDeclaracaoParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeclaracao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoCompostaAccess().getDeclaracaoDeclaracaoParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoComposta__DeclaracaoAssignment_2"


    // $ANTLR start "rule__DeclaracaoVariavel__PidAssignment_1"
    // InternalImperativa1.g:3978:1: rule__DeclaracaoVariavel__PidAssignment_1 : ( rulePId ) ;
    public final void rule__DeclaracaoVariavel__PidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3982:1: ( ( rulePId ) )
            // InternalImperativa1.g:3983:2: ( rulePId )
            {
            // InternalImperativa1.g:3983:2: ( rulePId )
            // InternalImperativa1.g:3984:3: rulePId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoVariavelAccess().getPidPIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoVariavelAccess().getPidPIdParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoVariavel__PidAssignment_1"


    // $ANTLR start "rule__DeclaracaoVariavel__ExpressaoAssignment_3"
    // InternalImperativa1.g:3993:1: rule__DeclaracaoVariavel__ExpressaoAssignment_3 : ( ruleExpressao ) ;
    public final void rule__DeclaracaoVariavel__ExpressaoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalImperativa1.g:3997:1: ( ( ruleExpressao ) )
            // InternalImperativa1.g:3998:2: ( ruleExpressao )
            {
            // InternalImperativa1.g:3998:2: ( ruleExpressao )
            // InternalImperativa1.g:3999:3: ruleExpressao
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaracaoVariavelAccess().getExpressaoExpressaoParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaracaoVariavelAccess().getExpressaoExpressaoParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoVariavel__ExpressaoAssignment_3"

    // $ANTLR start synpred2_InternalImperativa1
    public final void synpred2_InternalImperativa1_fragment() throws RecognitionException {   
        // InternalImperativa1.g:808:2: ( ( ( rule__Comando__SequenciaComandoAssignment_0 ) ) )
        // InternalImperativa1.g:808:2: ( ( rule__Comando__SequenciaComandoAssignment_0 ) )
        {
        // InternalImperativa1.g:808:2: ( ( rule__Comando__SequenciaComandoAssignment_0 ) )
        // InternalImperativa1.g:809:3: ( rule__Comando__SequenciaComandoAssignment_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getComandoAccess().getSequenciaComandoAssignment_0()); 
        }
        // InternalImperativa1.g:810:3: ( rule__Comando__SequenciaComandoAssignment_0 )
        // InternalImperativa1.g:810:4: rule__Comando__SequenciaComandoAssignment_0
        {
        pushFollow(FOLLOW_2);
        rule__Comando__SequenciaComandoAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred2_InternalImperativa1

    // $ANTLR start synpred7_InternalImperativa1
    public final void synpred7_InternalImperativa1_fragment() throws RecognitionException {   
        // InternalImperativa1.g:898:2: ( ( ( rule__ExpPrimaria__PidAssignment_0 ) ) )
        // InternalImperativa1.g:898:2: ( ( rule__ExpPrimaria__PidAssignment_0 ) )
        {
        // InternalImperativa1.g:898:2: ( ( rule__ExpPrimaria__PidAssignment_0 ) )
        // InternalImperativa1.g:899:3: ( rule__ExpPrimaria__PidAssignment_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpPrimariaAccess().getPidAssignment_0()); 
        }
        // InternalImperativa1.g:900:3: ( rule__ExpPrimaria__PidAssignment_0 )
        // InternalImperativa1.g:900:4: rule__ExpPrimaria__PidAssignment_0
        {
        pushFollow(FOLLOW_2);
        rule__ExpPrimaria__PidAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalImperativa1

    // $ANTLR start synpred8_InternalImperativa1
    public final void synpred8_InternalImperativa1_fragment() throws RecognitionException {   
        // InternalImperativa1.g:904:2: ( ( ( rule__ExpPrimaria__ValorAssignment_1 ) ) )
        // InternalImperativa1.g:904:2: ( ( rule__ExpPrimaria__ValorAssignment_1 ) )
        {
        // InternalImperativa1.g:904:2: ( ( rule__ExpPrimaria__ValorAssignment_1 ) )
        // InternalImperativa1.g:905:3: ( rule__ExpPrimaria__ValorAssignment_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpPrimariaAccess().getValorAssignment_1()); 
        }
        // InternalImperativa1.g:906:3: ( rule__ExpPrimaria__ValorAssignment_1 )
        // InternalImperativa1.g:906:4: rule__ExpPrimaria__ValorAssignment_1
        {
        pushFollow(FOLLOW_2);
        rule__ExpPrimaria__ValorAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8_InternalImperativa1

    // $ANTLR start synpred24_InternalImperativa1
    public final void synpred24_InternalImperativa1_fragment() throws RecognitionException {   
        // InternalImperativa1.g:1075:2: ( ( ( rule__Declaracao__DecCompostaAssignment_0 ) ) )
        // InternalImperativa1.g:1075:2: ( ( rule__Declaracao__DecCompostaAssignment_0 ) )
        {
        // InternalImperativa1.g:1075:2: ( ( rule__Declaracao__DecCompostaAssignment_0 ) )
        // InternalImperativa1.g:1076:3: ( rule__Declaracao__DecCompostaAssignment_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getDeclaracaoAccess().getDecCompostaAssignment_0()); 
        }
        // InternalImperativa1.g:1077:3: ( rule__Declaracao__DecCompostaAssignment_0 )
        // InternalImperativa1.g:1077:4: rule__Declaracao__DecCompostaAssignment_0
        {
        pushFollow(FOLLOW_2);
        rule__Declaracao__DecCompostaAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred24_InternalImperativa1

    // $ANTLR start synpred25_InternalImperativa1
    public final void synpred25_InternalImperativa1_fragment() throws RecognitionException {   
        // InternalImperativa1.g:1081:2: ( ( ( rule__Declaracao__DecVariavelAssignment_1 ) ) )
        // InternalImperativa1.g:1081:2: ( ( rule__Declaracao__DecVariavelAssignment_1 ) )
        {
        // InternalImperativa1.g:1081:2: ( ( rule__Declaracao__DecVariavelAssignment_1 ) )
        // InternalImperativa1.g:1082:3: ( rule__Declaracao__DecVariavelAssignment_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getDeclaracaoAccess().getDecVariavelAssignment_1()); 
        }
        // InternalImperativa1.g:1083:3: ( rule__Declaracao__DecVariavelAssignment_1 )
        // InternalImperativa1.g:1083:4: rule__Declaracao__DecVariavelAssignment_1
        {
        pushFollow(FOLLOW_2);
        rule__Declaracao__DecVariavelAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred25_InternalImperativa1

    // $ANTLR start synpred26_InternalImperativa1
    public final void synpred26_InternalImperativa1_fragment() throws RecognitionException {   
        // InternalImperativa1.g:1790:3: ( rule__PId__Alternatives_1 )
        // InternalImperativa1.g:1790:3: rule__PId__Alternatives_1
        {
        pushFollow(FOLLOW_2);
        rule__PId__Alternatives_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalImperativa1

    // Delegated rules

    public final boolean synpred25_InternalImperativa1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalImperativa1_fragment(); // can never throw exception
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
    public final boolean synpred7_InternalImperativa1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalImperativa1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalImperativa1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalImperativa1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalImperativa1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalImperativa1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalImperativa1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalImperativa1_fragment(); // can never throw exception
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
    static final String dfa_3s = "\1\46\10\0\2\uffff";
    static final String dfa_4s = "\11\uffff\1\1\1\2";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\12\uffff\1\6\1\10\1\uffff\1\7\1\5\2\uffff\1\4\12\uffff\1\3\4\uffff\1\1",
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
            return "803:1: rule__Comando__Alternatives : ( ( ( rule__Comando__SequenciaComandoAssignment_0 ) ) | ( ( rule__Comando__ComandoSimplesAssignment_1 ) ) );";
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
                        if ( (synpred2_InternalImperativa1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalImperativa1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalImperativa1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalImperativa1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalImperativa1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_6 = input.LA(1);

                         
                        int index2_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalImperativa1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalImperativa1()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_8 = input.LA(1);

                         
                        int index2_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalImperativa1()) ) {s = 9;}

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
    static final String dfa_8s = "\1\4\3\31\6\uffff";
    static final String dfa_9s = "\1\6\3\40\6\uffff";
    static final String dfa_10s = "\4\uffff\1\1\1\4\1\2\1\5\1\6\1\3";
    static final String dfa_11s = "\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\1\1\3",
            "\1\6\2\uffff\1\4\1\5\1\11\1\7\1\10",
            "\1\6\2\uffff\1\4\1\5\1\11\1\7\1\10",
            "\1\6\2\uffff\1\4\1\5\1\11\1\7\1\10",
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
            return "947:1: rule__ExpBinaria__Alternatives : ( ( ( rule__ExpBinaria__SomaExpressaoAssignment_0 ) ) | ( ( rule__ExpBinaria__SubExpressaoAssignment_1 ) ) | ( ( rule__ExpBinaria__OrExpressaoAssignment_2 ) ) | ( ( rule__ExpBinaria__AndExpressaoAssignment_3 ) ) | ( ( rule__ExpBinaria__EqualsExpressaoAssignment_4 ) ) | ( ( rule__ExpBinaria__ConcatExpressaoAssignment_5 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000042004D8012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000042004D8010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000E010070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});

}