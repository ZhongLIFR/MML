package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMmlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "';'", "'scikit-learn'", "'R'", "'Weka'", "'linear'", "'polynomial'", "'radial'", "'C-classification'", "'nu-classification'", "'one-classification'", "'recall'", "'precision'", "'F1'", "'End.'", "'datainput'", "'separator'", "'mlframework'", "'algorithm'", "'gamma='", "'C='", "'kernel='", "'classification'", "'.'", "'formula'", "'~'", "'+'", "'{'", "'pourcentageTraining'", "'}'", "'SVM'", "'DT'", "'RandomForest'", "'LogisticRegression'", "'all'", "'PredictorVariables'", "'TrainingTest'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMmlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMmlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMmlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMml.g"; }


    	private MmlGrammarAccess grammarAccess;

    	public void setGrammarAccess(MmlGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMMLModel"
    // InternalMml.g:53:1: entryRuleMMLModel : ruleMMLModel EOF ;
    public final void entryRuleMMLModel() throws RecognitionException {
        try {
            // InternalMml.g:54:1: ( ruleMMLModel EOF )
            // InternalMml.g:55:1: ruleMMLModel EOF
            {
             before(grammarAccess.getMMLModelRule()); 
            pushFollow(FOLLOW_1);
            ruleMMLModel();

            state._fsp--;

             after(grammarAccess.getMMLModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMMLModel"


    // $ANTLR start "ruleMMLModel"
    // InternalMml.g:62:1: ruleMMLModel : ( ( rule__MMLModel__Group__0 ) ) ;
    public final void ruleMMLModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:66:2: ( ( ( rule__MMLModel__Group__0 ) ) )
            // InternalMml.g:67:2: ( ( rule__MMLModel__Group__0 ) )
            {
            // InternalMml.g:67:2: ( ( rule__MMLModel__Group__0 ) )
            // InternalMml.g:68:3: ( rule__MMLModel__Group__0 )
            {
             before(grammarAccess.getMMLModelAccess().getGroup()); 
            // InternalMml.g:69:3: ( rule__MMLModel__Group__0 )
            // InternalMml.g:69:4: rule__MMLModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMMLModelAccess().getGroup()); 

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
    // $ANTLR end "ruleMMLModel"


    // $ANTLR start "entryRuleDataInput"
    // InternalMml.g:78:1: entryRuleDataInput : ruleDataInput EOF ;
    public final void entryRuleDataInput() throws RecognitionException {
        try {
            // InternalMml.g:79:1: ( ruleDataInput EOF )
            // InternalMml.g:80:1: ruleDataInput EOF
            {
             before(grammarAccess.getDataInputRule()); 
            pushFollow(FOLLOW_1);
            ruleDataInput();

            state._fsp--;

             after(grammarAccess.getDataInputRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataInput"


    // $ANTLR start "ruleDataInput"
    // InternalMml.g:87:1: ruleDataInput : ( ( rule__DataInput__Group__0 ) ) ;
    public final void ruleDataInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:91:2: ( ( ( rule__DataInput__Group__0 ) ) )
            // InternalMml.g:92:2: ( ( rule__DataInput__Group__0 ) )
            {
            // InternalMml.g:92:2: ( ( rule__DataInput__Group__0 ) )
            // InternalMml.g:93:3: ( rule__DataInput__Group__0 )
            {
             before(grammarAccess.getDataInputAccess().getGroup()); 
            // InternalMml.g:94:3: ( rule__DataInput__Group__0 )
            // InternalMml.g:94:4: rule__DataInput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataInput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataInputAccess().getGroup()); 

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
    // $ANTLR end "ruleDataInput"


    // $ANTLR start "entryRuleCSVParsingConfiguration"
    // InternalMml.g:103:1: entryRuleCSVParsingConfiguration : ruleCSVParsingConfiguration EOF ;
    public final void entryRuleCSVParsingConfiguration() throws RecognitionException {
        try {
            // InternalMml.g:104:1: ( ruleCSVParsingConfiguration EOF )
            // InternalMml.g:105:1: ruleCSVParsingConfiguration EOF
            {
             before(grammarAccess.getCSVParsingConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleCSVParsingConfiguration();

            state._fsp--;

             after(grammarAccess.getCSVParsingConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCSVParsingConfiguration"


    // $ANTLR start "ruleCSVParsingConfiguration"
    // InternalMml.g:112:1: ruleCSVParsingConfiguration : ( ( rule__CSVParsingConfiguration__Group__0 ) ) ;
    public final void ruleCSVParsingConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:116:2: ( ( ( rule__CSVParsingConfiguration__Group__0 ) ) )
            // InternalMml.g:117:2: ( ( rule__CSVParsingConfiguration__Group__0 ) )
            {
            // InternalMml.g:117:2: ( ( rule__CSVParsingConfiguration__Group__0 ) )
            // InternalMml.g:118:3: ( rule__CSVParsingConfiguration__Group__0 )
            {
             before(grammarAccess.getCSVParsingConfigurationAccess().getGroup()); 
            // InternalMml.g:119:3: ( rule__CSVParsingConfiguration__Group__0 )
            // InternalMml.g:119:4: rule__CSVParsingConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSVParsingConfiguration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCSVParsingConfigurationAccess().getGroup()); 

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
    // $ANTLR end "ruleCSVParsingConfiguration"


    // $ANTLR start "entryRuleMLChoiceAlgorithm"
    // InternalMml.g:128:1: entryRuleMLChoiceAlgorithm : ruleMLChoiceAlgorithm EOF ;
    public final void entryRuleMLChoiceAlgorithm() throws RecognitionException {
        try {
            // InternalMml.g:129:1: ( ruleMLChoiceAlgorithm EOF )
            // InternalMml.g:130:1: ruleMLChoiceAlgorithm EOF
            {
             before(grammarAccess.getMLChoiceAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            ruleMLChoiceAlgorithm();

            state._fsp--;

             after(grammarAccess.getMLChoiceAlgorithmRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMLChoiceAlgorithm"


    // $ANTLR start "ruleMLChoiceAlgorithm"
    // InternalMml.g:137:1: ruleMLChoiceAlgorithm : ( ( rule__MLChoiceAlgorithm__Group__0 ) ) ;
    public final void ruleMLChoiceAlgorithm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:141:2: ( ( ( rule__MLChoiceAlgorithm__Group__0 ) ) )
            // InternalMml.g:142:2: ( ( rule__MLChoiceAlgorithm__Group__0 ) )
            {
            // InternalMml.g:142:2: ( ( rule__MLChoiceAlgorithm__Group__0 ) )
            // InternalMml.g:143:3: ( rule__MLChoiceAlgorithm__Group__0 )
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getGroup()); 
            // InternalMml.g:144:3: ( rule__MLChoiceAlgorithm__Group__0 )
            // InternalMml.g:144:4: rule__MLChoiceAlgorithm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMLChoiceAlgorithmAccess().getGroup()); 

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
    // $ANTLR end "ruleMLChoiceAlgorithm"


    // $ANTLR start "entryRuleMLAlgorithm"
    // InternalMml.g:153:1: entryRuleMLAlgorithm : ruleMLAlgorithm EOF ;
    public final void entryRuleMLAlgorithm() throws RecognitionException {
        try {
            // InternalMml.g:154:1: ( ruleMLAlgorithm EOF )
            // InternalMml.g:155:1: ruleMLAlgorithm EOF
            {
             before(grammarAccess.getMLAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            ruleMLAlgorithm();

            state._fsp--;

             after(grammarAccess.getMLAlgorithmRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMLAlgorithm"


    // $ANTLR start "ruleMLAlgorithm"
    // InternalMml.g:162:1: ruleMLAlgorithm : ( ( rule__MLAlgorithm__Alternatives ) ) ;
    public final void ruleMLAlgorithm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:166:2: ( ( ( rule__MLAlgorithm__Alternatives ) ) )
            // InternalMml.g:167:2: ( ( rule__MLAlgorithm__Alternatives ) )
            {
            // InternalMml.g:167:2: ( ( rule__MLAlgorithm__Alternatives ) )
            // InternalMml.g:168:3: ( rule__MLAlgorithm__Alternatives )
            {
             before(grammarAccess.getMLAlgorithmAccess().getAlternatives()); 
            // InternalMml.g:169:3: ( rule__MLAlgorithm__Alternatives )
            // InternalMml.g:169:4: rule__MLAlgorithm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MLAlgorithm__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMLAlgorithmAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMLAlgorithm"


    // $ANTLR start "entryRuleSVM"
    // InternalMml.g:178:1: entryRuleSVM : ruleSVM EOF ;
    public final void entryRuleSVM() throws RecognitionException {
        try {
            // InternalMml.g:179:1: ( ruleSVM EOF )
            // InternalMml.g:180:1: ruleSVM EOF
            {
             before(grammarAccess.getSVMRule()); 
            pushFollow(FOLLOW_1);
            ruleSVM();

            state._fsp--;

             after(grammarAccess.getSVMRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSVM"


    // $ANTLR start "ruleSVM"
    // InternalMml.g:187:1: ruleSVM : ( ( rule__SVM__Group__0 ) ) ;
    public final void ruleSVM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:191:2: ( ( ( rule__SVM__Group__0 ) ) )
            // InternalMml.g:192:2: ( ( rule__SVM__Group__0 ) )
            {
            // InternalMml.g:192:2: ( ( rule__SVM__Group__0 ) )
            // InternalMml.g:193:3: ( rule__SVM__Group__0 )
            {
             before(grammarAccess.getSVMAccess().getGroup()); 
            // InternalMml.g:194:3: ( rule__SVM__Group__0 )
            // InternalMml.g:194:4: rule__SVM__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SVM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSVMAccess().getGroup()); 

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
    // $ANTLR end "ruleSVM"


    // $ANTLR start "entryRuleDT"
    // InternalMml.g:203:1: entryRuleDT : ruleDT EOF ;
    public final void entryRuleDT() throws RecognitionException {
        try {
            // InternalMml.g:204:1: ( ruleDT EOF )
            // InternalMml.g:205:1: ruleDT EOF
            {
             before(grammarAccess.getDTRule()); 
            pushFollow(FOLLOW_1);
            ruleDT();

            state._fsp--;

             after(grammarAccess.getDTRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDT"


    // $ANTLR start "ruleDT"
    // InternalMml.g:212:1: ruleDT : ( ( rule__DT__Group__0 ) ) ;
    public final void ruleDT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:216:2: ( ( ( rule__DT__Group__0 ) ) )
            // InternalMml.g:217:2: ( ( rule__DT__Group__0 ) )
            {
            // InternalMml.g:217:2: ( ( rule__DT__Group__0 ) )
            // InternalMml.g:218:3: ( rule__DT__Group__0 )
            {
             before(grammarAccess.getDTAccess().getGroup()); 
            // InternalMml.g:219:3: ( rule__DT__Group__0 )
            // InternalMml.g:219:4: rule__DT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDTAccess().getGroup()); 

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
    // $ANTLR end "ruleDT"


    // $ANTLR start "entryRuleRandomForest"
    // InternalMml.g:228:1: entryRuleRandomForest : ruleRandomForest EOF ;
    public final void entryRuleRandomForest() throws RecognitionException {
        try {
            // InternalMml.g:229:1: ( ruleRandomForest EOF )
            // InternalMml.g:230:1: ruleRandomForest EOF
            {
             before(grammarAccess.getRandomForestRule()); 
            pushFollow(FOLLOW_1);
            ruleRandomForest();

            state._fsp--;

             after(grammarAccess.getRandomForestRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRandomForest"


    // $ANTLR start "ruleRandomForest"
    // InternalMml.g:237:1: ruleRandomForest : ( ( rule__RandomForest__NameAssignment ) ) ;
    public final void ruleRandomForest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:241:2: ( ( ( rule__RandomForest__NameAssignment ) ) )
            // InternalMml.g:242:2: ( ( rule__RandomForest__NameAssignment ) )
            {
            // InternalMml.g:242:2: ( ( rule__RandomForest__NameAssignment ) )
            // InternalMml.g:243:3: ( rule__RandomForest__NameAssignment )
            {
             before(grammarAccess.getRandomForestAccess().getNameAssignment()); 
            // InternalMml.g:244:3: ( rule__RandomForest__NameAssignment )
            // InternalMml.g:244:4: rule__RandomForest__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RandomForest__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRandomForestAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleRandomForest"


    // $ANTLR start "entryRuleLogisticRegression"
    // InternalMml.g:253:1: entryRuleLogisticRegression : ruleLogisticRegression EOF ;
    public final void entryRuleLogisticRegression() throws RecognitionException {
        try {
            // InternalMml.g:254:1: ( ruleLogisticRegression EOF )
            // InternalMml.g:255:1: ruleLogisticRegression EOF
            {
             before(grammarAccess.getLogisticRegressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLogisticRegression();

            state._fsp--;

             after(grammarAccess.getLogisticRegressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogisticRegression"


    // $ANTLR start "ruleLogisticRegression"
    // InternalMml.g:262:1: ruleLogisticRegression : ( ( rule__LogisticRegression__NameAssignment ) ) ;
    public final void ruleLogisticRegression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:266:2: ( ( ( rule__LogisticRegression__NameAssignment ) ) )
            // InternalMml.g:267:2: ( ( rule__LogisticRegression__NameAssignment ) )
            {
            // InternalMml.g:267:2: ( ( rule__LogisticRegression__NameAssignment ) )
            // InternalMml.g:268:3: ( rule__LogisticRegression__NameAssignment )
            {
             before(grammarAccess.getLogisticRegressionAccess().getNameAssignment()); 
            // InternalMml.g:269:3: ( rule__LogisticRegression__NameAssignment )
            // InternalMml.g:269:4: rule__LogisticRegression__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LogisticRegression__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLogisticRegressionAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleLogisticRegression"


    // $ANTLR start "entryRuleFLOAT"
    // InternalMml.g:278:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalMml.g:279:1: ( ruleFLOAT EOF )
            // InternalMml.g:280:1: ruleFLOAT EOF
            {
             before(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getFLOATRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalMml.g:287:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:291:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalMml.g:292:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalMml.g:292:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalMml.g:293:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalMml.g:294:3: ( rule__FLOAT__Group__0 )
            // InternalMml.g:294:4: rule__FLOAT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFLOATAccess().getGroup()); 

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
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleRFormula"
    // InternalMml.g:303:1: entryRuleRFormula : ruleRFormula EOF ;
    public final void entryRuleRFormula() throws RecognitionException {
        try {
            // InternalMml.g:304:1: ( ruleRFormula EOF )
            // InternalMml.g:305:1: ruleRFormula EOF
            {
             before(grammarAccess.getRFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleRFormula();

            state._fsp--;

             after(grammarAccess.getRFormulaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRFormula"


    // $ANTLR start "ruleRFormula"
    // InternalMml.g:312:1: ruleRFormula : ( ( rule__RFormula__Group__0 ) ) ;
    public final void ruleRFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:316:2: ( ( ( rule__RFormula__Group__0 ) ) )
            // InternalMml.g:317:2: ( ( rule__RFormula__Group__0 ) )
            {
            // InternalMml.g:317:2: ( ( rule__RFormula__Group__0 ) )
            // InternalMml.g:318:3: ( rule__RFormula__Group__0 )
            {
             before(grammarAccess.getRFormulaAccess().getGroup()); 
            // InternalMml.g:319:3: ( rule__RFormula__Group__0 )
            // InternalMml.g:319:4: rule__RFormula__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RFormula__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRFormulaAccess().getGroup()); 

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
    // $ANTLR end "ruleRFormula"


    // $ANTLR start "entryRuleXFormula"
    // InternalMml.g:328:1: entryRuleXFormula : ruleXFormula EOF ;
    public final void entryRuleXFormula() throws RecognitionException {
        try {
            // InternalMml.g:329:1: ( ruleXFormula EOF )
            // InternalMml.g:330:1: ruleXFormula EOF
            {
             before(grammarAccess.getXFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleXFormula();

            state._fsp--;

             after(grammarAccess.getXFormulaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleXFormula"


    // $ANTLR start "ruleXFormula"
    // InternalMml.g:337:1: ruleXFormula : ( ( rule__XFormula__Alternatives ) ) ;
    public final void ruleXFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:341:2: ( ( ( rule__XFormula__Alternatives ) ) )
            // InternalMml.g:342:2: ( ( rule__XFormula__Alternatives ) )
            {
            // InternalMml.g:342:2: ( ( rule__XFormula__Alternatives ) )
            // InternalMml.g:343:3: ( rule__XFormula__Alternatives )
            {
             before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            // InternalMml.g:344:3: ( rule__XFormula__Alternatives )
            // InternalMml.g:344:4: rule__XFormula__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XFormula__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXFormulaAccess().getAlternatives()); 

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
    // $ANTLR end "ruleXFormula"


    // $ANTLR start "entryRuleAllVariables"
    // InternalMml.g:353:1: entryRuleAllVariables : ruleAllVariables EOF ;
    public final void entryRuleAllVariables() throws RecognitionException {
        try {
            // InternalMml.g:354:1: ( ruleAllVariables EOF )
            // InternalMml.g:355:1: ruleAllVariables EOF
            {
             before(grammarAccess.getAllVariablesRule()); 
            pushFollow(FOLLOW_1);
            ruleAllVariables();

            state._fsp--;

             after(grammarAccess.getAllVariablesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAllVariables"


    // $ANTLR start "ruleAllVariables"
    // InternalMml.g:362:1: ruleAllVariables : ( ( rule__AllVariables__Group__0 ) ) ;
    public final void ruleAllVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:366:2: ( ( ( rule__AllVariables__Group__0 ) ) )
            // InternalMml.g:367:2: ( ( rule__AllVariables__Group__0 ) )
            {
            // InternalMml.g:367:2: ( ( rule__AllVariables__Group__0 ) )
            // InternalMml.g:368:3: ( rule__AllVariables__Group__0 )
            {
             before(grammarAccess.getAllVariablesAccess().getGroup()); 
            // InternalMml.g:369:3: ( rule__AllVariables__Group__0 )
            // InternalMml.g:369:4: rule__AllVariables__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllVariables__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllVariablesAccess().getGroup()); 

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
    // $ANTLR end "ruleAllVariables"


    // $ANTLR start "entryRulePredictorVariables"
    // InternalMml.g:378:1: entryRulePredictorVariables : rulePredictorVariables EOF ;
    public final void entryRulePredictorVariables() throws RecognitionException {
        try {
            // InternalMml.g:379:1: ( rulePredictorVariables EOF )
            // InternalMml.g:380:1: rulePredictorVariables EOF
            {
             before(grammarAccess.getPredictorVariablesRule()); 
            pushFollow(FOLLOW_1);
            rulePredictorVariables();

            state._fsp--;

             after(grammarAccess.getPredictorVariablesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePredictorVariables"


    // $ANTLR start "rulePredictorVariables"
    // InternalMml.g:387:1: rulePredictorVariables : ( ( rule__PredictorVariables__Group__0 ) ) ;
    public final void rulePredictorVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:391:2: ( ( ( rule__PredictorVariables__Group__0 ) ) )
            // InternalMml.g:392:2: ( ( rule__PredictorVariables__Group__0 ) )
            {
            // InternalMml.g:392:2: ( ( rule__PredictorVariables__Group__0 ) )
            // InternalMml.g:393:3: ( rule__PredictorVariables__Group__0 )
            {
             before(grammarAccess.getPredictorVariablesAccess().getGroup()); 
            // InternalMml.g:394:3: ( rule__PredictorVariables__Group__0 )
            // InternalMml.g:394:4: rule__PredictorVariables__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PredictorVariables__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredictorVariablesAccess().getGroup()); 

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
    // $ANTLR end "rulePredictorVariables"


    // $ANTLR start "entryRuleFormulaItem"
    // InternalMml.g:403:1: entryRuleFormulaItem : ruleFormulaItem EOF ;
    public final void entryRuleFormulaItem() throws RecognitionException {
        try {
            // InternalMml.g:404:1: ( ruleFormulaItem EOF )
            // InternalMml.g:405:1: ruleFormulaItem EOF
            {
             before(grammarAccess.getFormulaItemRule()); 
            pushFollow(FOLLOW_1);
            ruleFormulaItem();

            state._fsp--;

             after(grammarAccess.getFormulaItemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFormulaItem"


    // $ANTLR start "ruleFormulaItem"
    // InternalMml.g:412:1: ruleFormulaItem : ( ( rule__FormulaItem__Alternatives ) ) ;
    public final void ruleFormulaItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:416:2: ( ( ( rule__FormulaItem__Alternatives ) ) )
            // InternalMml.g:417:2: ( ( rule__FormulaItem__Alternatives ) )
            {
            // InternalMml.g:417:2: ( ( rule__FormulaItem__Alternatives ) )
            // InternalMml.g:418:3: ( rule__FormulaItem__Alternatives )
            {
             before(grammarAccess.getFormulaItemAccess().getAlternatives()); 
            // InternalMml.g:419:3: ( rule__FormulaItem__Alternatives )
            // InternalMml.g:419:4: rule__FormulaItem__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FormulaItem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormulaItemAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFormulaItem"


    // $ANTLR start "entryRuleValidation"
    // InternalMml.g:428:1: entryRuleValidation : ruleValidation EOF ;
    public final void entryRuleValidation() throws RecognitionException {
        try {
            // InternalMml.g:429:1: ( ruleValidation EOF )
            // InternalMml.g:430:1: ruleValidation EOF
            {
             before(grammarAccess.getValidationRule()); 
            pushFollow(FOLLOW_1);
            ruleValidation();

            state._fsp--;

             after(grammarAccess.getValidationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValidation"


    // $ANTLR start "ruleValidation"
    // InternalMml.g:437:1: ruleValidation : ( ( rule__Validation__Group__0 ) ) ;
    public final void ruleValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:441:2: ( ( ( rule__Validation__Group__0 ) ) )
            // InternalMml.g:442:2: ( ( rule__Validation__Group__0 ) )
            {
            // InternalMml.g:442:2: ( ( rule__Validation__Group__0 ) )
            // InternalMml.g:443:3: ( rule__Validation__Group__0 )
            {
             before(grammarAccess.getValidationAccess().getGroup()); 
            // InternalMml.g:444:3: ( rule__Validation__Group__0 )
            // InternalMml.g:444:4: rule__Validation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Validation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getGroup()); 

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
    // $ANTLR end "ruleValidation"


    // $ANTLR start "entryRuleStratificationMethod"
    // InternalMml.g:453:1: entryRuleStratificationMethod : ruleStratificationMethod EOF ;
    public final void entryRuleStratificationMethod() throws RecognitionException {
        try {
            // InternalMml.g:454:1: ( ruleStratificationMethod EOF )
            // InternalMml.g:455:1: ruleStratificationMethod EOF
            {
             before(grammarAccess.getStratificationMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleStratificationMethod();

            state._fsp--;

             after(grammarAccess.getStratificationMethodRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStratificationMethod"


    // $ANTLR start "ruleStratificationMethod"
    // InternalMml.g:462:1: ruleStratificationMethod : ( ruleTrainingTest ) ;
    public final void ruleStratificationMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:466:2: ( ( ruleTrainingTest ) )
            // InternalMml.g:467:2: ( ruleTrainingTest )
            {
            // InternalMml.g:467:2: ( ruleTrainingTest )
            // InternalMml.g:468:3: ruleTrainingTest
            {
             before(grammarAccess.getStratificationMethodAccess().getTrainingTestParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleTrainingTest();

            state._fsp--;

             after(grammarAccess.getStratificationMethodAccess().getTrainingTestParserRuleCall()); 

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
    // $ANTLR end "ruleStratificationMethod"


    // $ANTLR start "entryRuleTrainingTest"
    // InternalMml.g:478:1: entryRuleTrainingTest : ruleTrainingTest EOF ;
    public final void entryRuleTrainingTest() throws RecognitionException {
        try {
            // InternalMml.g:479:1: ( ruleTrainingTest EOF )
            // InternalMml.g:480:1: ruleTrainingTest EOF
            {
             before(grammarAccess.getTrainingTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTrainingTest();

            state._fsp--;

             after(grammarAccess.getTrainingTestRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTrainingTest"


    // $ANTLR start "ruleTrainingTest"
    // InternalMml.g:487:1: ruleTrainingTest : ( ( rule__TrainingTest__Group__0 ) ) ;
    public final void ruleTrainingTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:491:2: ( ( ( rule__TrainingTest__Group__0 ) ) )
            // InternalMml.g:492:2: ( ( rule__TrainingTest__Group__0 ) )
            {
            // InternalMml.g:492:2: ( ( rule__TrainingTest__Group__0 ) )
            // InternalMml.g:493:3: ( rule__TrainingTest__Group__0 )
            {
             before(grammarAccess.getTrainingTestAccess().getGroup()); 
            // InternalMml.g:494:3: ( rule__TrainingTest__Group__0 )
            // InternalMml.g:494:4: rule__TrainingTest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingTestAccess().getGroup()); 

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
    // $ANTLR end "ruleTrainingTest"


    // $ANTLR start "ruleCSVSeparator"
    // InternalMml.g:503:1: ruleCSVSeparator : ( ( rule__CSVSeparator__Alternatives ) ) ;
    public final void ruleCSVSeparator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:507:1: ( ( ( rule__CSVSeparator__Alternatives ) ) )
            // InternalMml.g:508:2: ( ( rule__CSVSeparator__Alternatives ) )
            {
            // InternalMml.g:508:2: ( ( rule__CSVSeparator__Alternatives ) )
            // InternalMml.g:509:3: ( rule__CSVSeparator__Alternatives )
            {
             before(grammarAccess.getCSVSeparatorAccess().getAlternatives()); 
            // InternalMml.g:510:3: ( rule__CSVSeparator__Alternatives )
            // InternalMml.g:510:4: rule__CSVSeparator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CSVSeparator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCSVSeparatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCSVSeparator"


    // $ANTLR start "ruleFrameworkLang"
    // InternalMml.g:519:1: ruleFrameworkLang : ( ( rule__FrameworkLang__Alternatives ) ) ;
    public final void ruleFrameworkLang() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:523:1: ( ( ( rule__FrameworkLang__Alternatives ) ) )
            // InternalMml.g:524:2: ( ( rule__FrameworkLang__Alternatives ) )
            {
            // InternalMml.g:524:2: ( ( rule__FrameworkLang__Alternatives ) )
            // InternalMml.g:525:3: ( rule__FrameworkLang__Alternatives )
            {
             before(grammarAccess.getFrameworkLangAccess().getAlternatives()); 
            // InternalMml.g:526:3: ( rule__FrameworkLang__Alternatives )
            // InternalMml.g:526:4: rule__FrameworkLang__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FrameworkLang__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFrameworkLangAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFrameworkLang"


    // $ANTLR start "ruleSVMKernel"
    // InternalMml.g:535:1: ruleSVMKernel : ( ( rule__SVMKernel__Alternatives ) ) ;
    public final void ruleSVMKernel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:539:1: ( ( ( rule__SVMKernel__Alternatives ) ) )
            // InternalMml.g:540:2: ( ( rule__SVMKernel__Alternatives ) )
            {
            // InternalMml.g:540:2: ( ( rule__SVMKernel__Alternatives ) )
            // InternalMml.g:541:3: ( rule__SVMKernel__Alternatives )
            {
             before(grammarAccess.getSVMKernelAccess().getAlternatives()); 
            // InternalMml.g:542:3: ( rule__SVMKernel__Alternatives )
            // InternalMml.g:542:4: rule__SVMKernel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SVMKernel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSVMKernelAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSVMKernel"


    // $ANTLR start "ruleSVMClassification"
    // InternalMml.g:551:1: ruleSVMClassification : ( ( rule__SVMClassification__Alternatives ) ) ;
    public final void ruleSVMClassification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:555:1: ( ( ( rule__SVMClassification__Alternatives ) ) )
            // InternalMml.g:556:2: ( ( rule__SVMClassification__Alternatives ) )
            {
            // InternalMml.g:556:2: ( ( rule__SVMClassification__Alternatives ) )
            // InternalMml.g:557:3: ( rule__SVMClassification__Alternatives )
            {
             before(grammarAccess.getSVMClassificationAccess().getAlternatives()); 
            // InternalMml.g:558:3: ( rule__SVMClassification__Alternatives )
            // InternalMml.g:558:4: rule__SVMClassification__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SVMClassification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSVMClassificationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSVMClassification"


    // $ANTLR start "ruleValidationMetric"
    // InternalMml.g:567:1: ruleValidationMetric : ( ( rule__ValidationMetric__Alternatives ) ) ;
    public final void ruleValidationMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:571:1: ( ( ( rule__ValidationMetric__Alternatives ) ) )
            // InternalMml.g:572:2: ( ( rule__ValidationMetric__Alternatives ) )
            {
            // InternalMml.g:572:2: ( ( rule__ValidationMetric__Alternatives ) )
            // InternalMml.g:573:3: ( rule__ValidationMetric__Alternatives )
            {
             before(grammarAccess.getValidationMetricAccess().getAlternatives()); 
            // InternalMml.g:574:3: ( rule__ValidationMetric__Alternatives )
            // InternalMml.g:574:4: rule__ValidationMetric__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValidationMetric__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValidationMetricAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValidationMetric"


    // $ANTLR start "rule__MLAlgorithm__Alternatives"
    // InternalMml.g:582:1: rule__MLAlgorithm__Alternatives : ( ( ruleSVM ) | ( ruleDT ) | ( ruleRandomForest ) | ( ruleLogisticRegression ) );
    public final void rule__MLAlgorithm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:586:1: ( ( ruleSVM ) | ( ruleDT ) | ( ruleRandomForest ) | ( ruleLogisticRegression ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt1=1;
                }
                break;
            case 42:
                {
                alt1=2;
                }
                break;
            case 43:
                {
                alt1=3;
                }
                break;
            case 44:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMml.g:587:2: ( ruleSVM )
                    {
                    // InternalMml.g:587:2: ( ruleSVM )
                    // InternalMml.g:588:3: ruleSVM
                    {
                     before(grammarAccess.getMLAlgorithmAccess().getSVMParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSVM();

                    state._fsp--;

                     after(grammarAccess.getMLAlgorithmAccess().getSVMParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:593:2: ( ruleDT )
                    {
                    // InternalMml.g:593:2: ( ruleDT )
                    // InternalMml.g:594:3: ruleDT
                    {
                     before(grammarAccess.getMLAlgorithmAccess().getDTParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDT();

                    state._fsp--;

                     after(grammarAccess.getMLAlgorithmAccess().getDTParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:599:2: ( ruleRandomForest )
                    {
                    // InternalMml.g:599:2: ( ruleRandomForest )
                    // InternalMml.g:600:3: ruleRandomForest
                    {
                     before(grammarAccess.getMLAlgorithmAccess().getRandomForestParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRandomForest();

                    state._fsp--;

                     after(grammarAccess.getMLAlgorithmAccess().getRandomForestParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMml.g:605:2: ( ruleLogisticRegression )
                    {
                    // InternalMml.g:605:2: ( ruleLogisticRegression )
                    // InternalMml.g:606:3: ruleLogisticRegression
                    {
                     before(grammarAccess.getMLAlgorithmAccess().getLogisticRegressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLogisticRegression();

                    state._fsp--;

                     after(grammarAccess.getMLAlgorithmAccess().getLogisticRegressionParserRuleCall_3()); 

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
    // $ANTLR end "rule__MLAlgorithm__Alternatives"


    // $ANTLR start "rule__XFormula__Alternatives"
    // InternalMml.g:615:1: rule__XFormula__Alternatives : ( ( ruleAllVariables ) | ( rulePredictorVariables ) );
    public final void rule__XFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:619:1: ( ( ruleAllVariables ) | ( rulePredictorVariables ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==45) ) {
                alt2=1;
            }
            else if ( (LA2_0==46) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMml.g:620:2: ( ruleAllVariables )
                    {
                    // InternalMml.g:620:2: ( ruleAllVariables )
                    // InternalMml.g:621:3: ruleAllVariables
                    {
                     before(grammarAccess.getXFormulaAccess().getAllVariablesParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAllVariables();

                    state._fsp--;

                     after(grammarAccess.getXFormulaAccess().getAllVariablesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:626:2: ( rulePredictorVariables )
                    {
                    // InternalMml.g:626:2: ( rulePredictorVariables )
                    // InternalMml.g:627:3: rulePredictorVariables
                    {
                     before(grammarAccess.getXFormulaAccess().getPredictorVariablesParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePredictorVariables();

                    state._fsp--;

                     after(grammarAccess.getXFormulaAccess().getPredictorVariablesParserRuleCall_1()); 

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
    // $ANTLR end "rule__XFormula__Alternatives"


    // $ANTLR start "rule__FormulaItem__Alternatives"
    // InternalMml.g:636:1: rule__FormulaItem__Alternatives : ( ( ( rule__FormulaItem__ColumnAssignment_0 ) ) | ( ( rule__FormulaItem__ColNameAssignment_1 ) ) );
    public final void rule__FormulaItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:640:1: ( ( ( rule__FormulaItem__ColumnAssignment_0 ) ) | ( ( rule__FormulaItem__ColNameAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMml.g:641:2: ( ( rule__FormulaItem__ColumnAssignment_0 ) )
                    {
                    // InternalMml.g:641:2: ( ( rule__FormulaItem__ColumnAssignment_0 ) )
                    // InternalMml.g:642:3: ( rule__FormulaItem__ColumnAssignment_0 )
                    {
                     before(grammarAccess.getFormulaItemAccess().getColumnAssignment_0()); 
                    // InternalMml.g:643:3: ( rule__FormulaItem__ColumnAssignment_0 )
                    // InternalMml.g:643:4: rule__FormulaItem__ColumnAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormulaItem__ColumnAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaItemAccess().getColumnAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:647:2: ( ( rule__FormulaItem__ColNameAssignment_1 ) )
                    {
                    // InternalMml.g:647:2: ( ( rule__FormulaItem__ColNameAssignment_1 ) )
                    // InternalMml.g:648:3: ( rule__FormulaItem__ColNameAssignment_1 )
                    {
                     before(grammarAccess.getFormulaItemAccess().getColNameAssignment_1()); 
                    // InternalMml.g:649:3: ( rule__FormulaItem__ColNameAssignment_1 )
                    // InternalMml.g:649:4: rule__FormulaItem__ColNameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormulaItem__ColNameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaItemAccess().getColNameAssignment_1()); 

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
    // $ANTLR end "rule__FormulaItem__Alternatives"


    // $ANTLR start "rule__CSVSeparator__Alternatives"
    // InternalMml.g:657:1: rule__CSVSeparator__Alternatives : ( ( ( ',' ) ) | ( ( ';' ) ) );
    public final void rule__CSVSeparator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:661:1: ( ( ( ',' ) ) | ( ( ';' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMml.g:662:2: ( ( ',' ) )
                    {
                    // InternalMml.g:662:2: ( ( ',' ) )
                    // InternalMml.g:663:3: ( ',' )
                    {
                     before(grammarAccess.getCSVSeparatorAccess().getCOMMAEnumLiteralDeclaration_0()); 
                    // InternalMml.g:664:3: ( ',' )
                    // InternalMml.g:664:4: ','
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getCSVSeparatorAccess().getCOMMAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:668:2: ( ( ';' ) )
                    {
                    // InternalMml.g:668:2: ( ( ';' ) )
                    // InternalMml.g:669:3: ( ';' )
                    {
                     before(grammarAccess.getCSVSeparatorAccess().getSEMI_COLONEnumLiteralDeclaration_1()); 
                    // InternalMml.g:670:3: ( ';' )
                    // InternalMml.g:670:4: ';'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCSVSeparatorAccess().getSEMI_COLONEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__CSVSeparator__Alternatives"


    // $ANTLR start "rule__FrameworkLang__Alternatives"
    // InternalMml.g:678:1: rule__FrameworkLang__Alternatives : ( ( ( 'scikit-learn' ) ) | ( ( 'R' ) ) | ( ( 'Weka' ) ) );
    public final void rule__FrameworkLang__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:682:1: ( ( ( 'scikit-learn' ) ) | ( ( 'R' ) ) | ( ( 'Weka' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMml.g:683:2: ( ( 'scikit-learn' ) )
                    {
                    // InternalMml.g:683:2: ( ( 'scikit-learn' ) )
                    // InternalMml.g:684:3: ( 'scikit-learn' )
                    {
                     before(grammarAccess.getFrameworkLangAccess().getSCIKITEnumLiteralDeclaration_0()); 
                    // InternalMml.g:685:3: ( 'scikit-learn' )
                    // InternalMml.g:685:4: 'scikit-learn'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getFrameworkLangAccess().getSCIKITEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:689:2: ( ( 'R' ) )
                    {
                    // InternalMml.g:689:2: ( ( 'R' ) )
                    // InternalMml.g:690:3: ( 'R' )
                    {
                     before(grammarAccess.getFrameworkLangAccess().getREnumLiteralDeclaration_1()); 
                    // InternalMml.g:691:3: ( 'R' )
                    // InternalMml.g:691:4: 'R'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getFrameworkLangAccess().getREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:695:2: ( ( 'Weka' ) )
                    {
                    // InternalMml.g:695:2: ( ( 'Weka' ) )
                    // InternalMml.g:696:3: ( 'Weka' )
                    {
                     before(grammarAccess.getFrameworkLangAccess().getJavaWekaEnumLiteralDeclaration_2()); 
                    // InternalMml.g:697:3: ( 'Weka' )
                    // InternalMml.g:697:4: 'Weka'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getFrameworkLangAccess().getJavaWekaEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__FrameworkLang__Alternatives"


    // $ANTLR start "rule__SVMKernel__Alternatives"
    // InternalMml.g:705:1: rule__SVMKernel__Alternatives : ( ( ( 'linear' ) ) | ( ( 'polynomial' ) ) | ( ( 'radial' ) ) );
    public final void rule__SVMKernel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:709:1: ( ( ( 'linear' ) ) | ( ( 'polynomial' ) ) | ( ( 'radial' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMml.g:710:2: ( ( 'linear' ) )
                    {
                    // InternalMml.g:710:2: ( ( 'linear' ) )
                    // InternalMml.g:711:3: ( 'linear' )
                    {
                     before(grammarAccess.getSVMKernelAccess().getLinearEnumLiteralDeclaration_0()); 
                    // InternalMml.g:712:3: ( 'linear' )
                    // InternalMml.g:712:4: 'linear'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMKernelAccess().getLinearEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:716:2: ( ( 'polynomial' ) )
                    {
                    // InternalMml.g:716:2: ( ( 'polynomial' ) )
                    // InternalMml.g:717:3: ( 'polynomial' )
                    {
                     before(grammarAccess.getSVMKernelAccess().getPolyEnumLiteralDeclaration_1()); 
                    // InternalMml.g:718:3: ( 'polynomial' )
                    // InternalMml.g:718:4: 'polynomial'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMKernelAccess().getPolyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:722:2: ( ( 'radial' ) )
                    {
                    // InternalMml.g:722:2: ( ( 'radial' ) )
                    // InternalMml.g:723:3: ( 'radial' )
                    {
                     before(grammarAccess.getSVMKernelAccess().getRadialEnumLiteralDeclaration_2()); 
                    // InternalMml.g:724:3: ( 'radial' )
                    // InternalMml.g:724:4: 'radial'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMKernelAccess().getRadialEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__SVMKernel__Alternatives"


    // $ANTLR start "rule__SVMClassification__Alternatives"
    // InternalMml.g:732:1: rule__SVMClassification__Alternatives : ( ( ( 'C-classification' ) ) | ( ( 'nu-classification' ) ) | ( ( 'one-classification' ) ) );
    public final void rule__SVMClassification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:736:1: ( ( ( 'C-classification' ) ) | ( ( 'nu-classification' ) ) | ( ( 'one-classification' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMml.g:737:2: ( ( 'C-classification' ) )
                    {
                    // InternalMml.g:737:2: ( ( 'C-classification' ) )
                    // InternalMml.g:738:3: ( 'C-classification' )
                    {
                     before(grammarAccess.getSVMClassificationAccess().getCClassEnumLiteralDeclaration_0()); 
                    // InternalMml.g:739:3: ( 'C-classification' )
                    // InternalMml.g:739:4: 'C-classification'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMClassificationAccess().getCClassEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:743:2: ( ( 'nu-classification' ) )
                    {
                    // InternalMml.g:743:2: ( ( 'nu-classification' ) )
                    // InternalMml.g:744:3: ( 'nu-classification' )
                    {
                     before(grammarAccess.getSVMClassificationAccess().getNuClassEnumLiteralDeclaration_1()); 
                    // InternalMml.g:745:3: ( 'nu-classification' )
                    // InternalMml.g:745:4: 'nu-classification'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMClassificationAccess().getNuClassEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:749:2: ( ( 'one-classification' ) )
                    {
                    // InternalMml.g:749:2: ( ( 'one-classification' ) )
                    // InternalMml.g:750:3: ( 'one-classification' )
                    {
                     before(grammarAccess.getSVMClassificationAccess().getOneClassEnumLiteralDeclaration_2()); 
                    // InternalMml.g:751:3: ( 'one-classification' )
                    // InternalMml.g:751:4: 'one-classification'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMClassificationAccess().getOneClassEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__SVMClassification__Alternatives"


    // $ANTLR start "rule__ValidationMetric__Alternatives"
    // InternalMml.g:759:1: rule__ValidationMetric__Alternatives : ( ( ( 'recall' ) ) | ( ( 'precision' ) ) | ( ( 'F1' ) ) );
    public final void rule__ValidationMetric__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:763:1: ( ( ( 'recall' ) ) | ( ( 'precision' ) ) | ( ( 'F1' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMml.g:764:2: ( ( 'recall' ) )
                    {
                    // InternalMml.g:764:2: ( ( 'recall' ) )
                    // InternalMml.g:765:3: ( 'recall' )
                    {
                     before(grammarAccess.getValidationMetricAccess().getRECALLEnumLiteralDeclaration_0()); 
                    // InternalMml.g:766:3: ( 'recall' )
                    // InternalMml.g:766:4: 'recall'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationMetricAccess().getRECALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:770:2: ( ( 'precision' ) )
                    {
                    // InternalMml.g:770:2: ( ( 'precision' ) )
                    // InternalMml.g:771:3: ( 'precision' )
                    {
                     before(grammarAccess.getValidationMetricAccess().getPRECISIONEnumLiteralDeclaration_1()); 
                    // InternalMml.g:772:3: ( 'precision' )
                    // InternalMml.g:772:4: 'precision'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationMetricAccess().getPRECISIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:776:2: ( ( 'F1' ) )
                    {
                    // InternalMml.g:776:2: ( ( 'F1' ) )
                    // InternalMml.g:777:3: ( 'F1' )
                    {
                     before(grammarAccess.getValidationMetricAccess().getF1EnumLiteralDeclaration_2()); 
                    // InternalMml.g:778:3: ( 'F1' )
                    // InternalMml.g:778:4: 'F1'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationMetricAccess().getF1EnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ValidationMetric__Alternatives"


    // $ANTLR start "rule__MMLModel__Group__0"
    // InternalMml.g:786:1: rule__MMLModel__Group__0 : rule__MMLModel__Group__0__Impl rule__MMLModel__Group__1 ;
    public final void rule__MMLModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:790:1: ( rule__MMLModel__Group__0__Impl rule__MMLModel__Group__1 )
            // InternalMml.g:791:2: rule__MMLModel__Group__0__Impl rule__MMLModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MMLModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__MMLModel__Group__0"


    // $ANTLR start "rule__MMLModel__Group__0__Impl"
    // InternalMml.g:798:1: rule__MMLModel__Group__0__Impl : ( ( rule__MMLModel__InputAssignment_0 ) ) ;
    public final void rule__MMLModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:802:1: ( ( ( rule__MMLModel__InputAssignment_0 ) ) )
            // InternalMml.g:803:1: ( ( rule__MMLModel__InputAssignment_0 ) )
            {
            // InternalMml.g:803:1: ( ( rule__MMLModel__InputAssignment_0 ) )
            // InternalMml.g:804:2: ( rule__MMLModel__InputAssignment_0 )
            {
             before(grammarAccess.getMMLModelAccess().getInputAssignment_0()); 
            // InternalMml.g:805:2: ( rule__MMLModel__InputAssignment_0 )
            // InternalMml.g:805:3: rule__MMLModel__InputAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MMLModel__InputAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMMLModelAccess().getInputAssignment_0()); 

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
    // $ANTLR end "rule__MMLModel__Group__0__Impl"


    // $ANTLR start "rule__MMLModel__Group__1"
    // InternalMml.g:813:1: rule__MMLModel__Group__1 : rule__MMLModel__Group__1__Impl rule__MMLModel__Group__2 ;
    public final void rule__MMLModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:817:1: ( rule__MMLModel__Group__1__Impl rule__MMLModel__Group__2 )
            // InternalMml.g:818:2: rule__MMLModel__Group__1__Impl rule__MMLModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MMLModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__MMLModel__Group__1"


    // $ANTLR start "rule__MMLModel__Group__1__Impl"
    // InternalMml.g:825:1: rule__MMLModel__Group__1__Impl : ( ( rule__MMLModel__AlgorithmAssignment_1 ) ) ;
    public final void rule__MMLModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:829:1: ( ( ( rule__MMLModel__AlgorithmAssignment_1 ) ) )
            // InternalMml.g:830:1: ( ( rule__MMLModel__AlgorithmAssignment_1 ) )
            {
            // InternalMml.g:830:1: ( ( rule__MMLModel__AlgorithmAssignment_1 ) )
            // InternalMml.g:831:2: ( rule__MMLModel__AlgorithmAssignment_1 )
            {
             before(grammarAccess.getMMLModelAccess().getAlgorithmAssignment_1()); 
            // InternalMml.g:832:2: ( rule__MMLModel__AlgorithmAssignment_1 )
            // InternalMml.g:832:3: rule__MMLModel__AlgorithmAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MMLModel__AlgorithmAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMMLModelAccess().getAlgorithmAssignment_1()); 

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
    // $ANTLR end "rule__MMLModel__Group__1__Impl"


    // $ANTLR start "rule__MMLModel__Group__2"
    // InternalMml.g:840:1: rule__MMLModel__Group__2 : rule__MMLModel__Group__2__Impl rule__MMLModel__Group__3 ;
    public final void rule__MMLModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:844:1: ( rule__MMLModel__Group__2__Impl rule__MMLModel__Group__3 )
            // InternalMml.g:845:2: rule__MMLModel__Group__2__Impl rule__MMLModel__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__MMLModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__MMLModel__Group__2"


    // $ANTLR start "rule__MMLModel__Group__2__Impl"
    // InternalMml.g:852:1: rule__MMLModel__Group__2__Impl : ( ( rule__MMLModel__FormulaAssignment_2 )? ) ;
    public final void rule__MMLModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:856:1: ( ( ( rule__MMLModel__FormulaAssignment_2 )? ) )
            // InternalMml.g:857:1: ( ( rule__MMLModel__FormulaAssignment_2 )? )
            {
            // InternalMml.g:857:1: ( ( rule__MMLModel__FormulaAssignment_2 )? )
            // InternalMml.g:858:2: ( rule__MMLModel__FormulaAssignment_2 )?
            {
             before(grammarAccess.getMMLModelAccess().getFormulaAssignment_2()); 
            // InternalMml.g:859:2: ( rule__MMLModel__FormulaAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMml.g:859:3: rule__MMLModel__FormulaAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MMLModel__FormulaAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMMLModelAccess().getFormulaAssignment_2()); 

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
    // $ANTLR end "rule__MMLModel__Group__2__Impl"


    // $ANTLR start "rule__MMLModel__Group__3"
    // InternalMml.g:867:1: rule__MMLModel__Group__3 : rule__MMLModel__Group__3__Impl rule__MMLModel__Group__4 ;
    public final void rule__MMLModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:871:1: ( rule__MMLModel__Group__3__Impl rule__MMLModel__Group__4 )
            // InternalMml.g:872:2: rule__MMLModel__Group__3__Impl rule__MMLModel__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__MMLModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__MMLModel__Group__3"


    // $ANTLR start "rule__MMLModel__Group__3__Impl"
    // InternalMml.g:879:1: rule__MMLModel__Group__3__Impl : ( ( rule__MMLModel__ValidationAssignment_3 ) ) ;
    public final void rule__MMLModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:883:1: ( ( ( rule__MMLModel__ValidationAssignment_3 ) ) )
            // InternalMml.g:884:1: ( ( rule__MMLModel__ValidationAssignment_3 ) )
            {
            // InternalMml.g:884:1: ( ( rule__MMLModel__ValidationAssignment_3 ) )
            // InternalMml.g:885:2: ( rule__MMLModel__ValidationAssignment_3 )
            {
             before(grammarAccess.getMMLModelAccess().getValidationAssignment_3()); 
            // InternalMml.g:886:2: ( rule__MMLModel__ValidationAssignment_3 )
            // InternalMml.g:886:3: rule__MMLModel__ValidationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MMLModel__ValidationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMMLModelAccess().getValidationAssignment_3()); 

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
    // $ANTLR end "rule__MMLModel__Group__3__Impl"


    // $ANTLR start "rule__MMLModel__Group__4"
    // InternalMml.g:894:1: rule__MMLModel__Group__4 : rule__MMLModel__Group__4__Impl ;
    public final void rule__MMLModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:898:1: ( rule__MMLModel__Group__4__Impl )
            // InternalMml.g:899:2: rule__MMLModel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__MMLModel__Group__4"


    // $ANTLR start "rule__MMLModel__Group__4__Impl"
    // InternalMml.g:905:1: rule__MMLModel__Group__4__Impl : ( 'End.' ) ;
    public final void rule__MMLModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:909:1: ( ( 'End.' ) )
            // InternalMml.g:910:1: ( 'End.' )
            {
            // InternalMml.g:910:1: ( 'End.' )
            // InternalMml.g:911:2: 'End.'
            {
             before(grammarAccess.getMMLModelAccess().getEndKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMMLModelAccess().getEndKeyword_4()); 

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
    // $ANTLR end "rule__MMLModel__Group__4__Impl"


    // $ANTLR start "rule__DataInput__Group__0"
    // InternalMml.g:921:1: rule__DataInput__Group__0 : rule__DataInput__Group__0__Impl rule__DataInput__Group__1 ;
    public final void rule__DataInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:925:1: ( rule__DataInput__Group__0__Impl rule__DataInput__Group__1 )
            // InternalMml.g:926:2: rule__DataInput__Group__0__Impl rule__DataInput__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DataInput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataInput__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__DataInput__Group__0"


    // $ANTLR start "rule__DataInput__Group__0__Impl"
    // InternalMml.g:933:1: rule__DataInput__Group__0__Impl : ( 'datainput' ) ;
    public final void rule__DataInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:937:1: ( ( 'datainput' ) )
            // InternalMml.g:938:1: ( 'datainput' )
            {
            // InternalMml.g:938:1: ( 'datainput' )
            // InternalMml.g:939:2: 'datainput'
            {
             before(grammarAccess.getDataInputAccess().getDatainputKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDataInputAccess().getDatainputKeyword_0()); 

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
    // $ANTLR end "rule__DataInput__Group__0__Impl"


    // $ANTLR start "rule__DataInput__Group__1"
    // InternalMml.g:948:1: rule__DataInput__Group__1 : rule__DataInput__Group__1__Impl rule__DataInput__Group__2 ;
    public final void rule__DataInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:952:1: ( rule__DataInput__Group__1__Impl rule__DataInput__Group__2 )
            // InternalMml.g:953:2: rule__DataInput__Group__1__Impl rule__DataInput__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__DataInput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataInput__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__DataInput__Group__1"


    // $ANTLR start "rule__DataInput__Group__1__Impl"
    // InternalMml.g:960:1: rule__DataInput__Group__1__Impl : ( ( rule__DataInput__FilelocationAssignment_1 ) ) ;
    public final void rule__DataInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:964:1: ( ( ( rule__DataInput__FilelocationAssignment_1 ) ) )
            // InternalMml.g:965:1: ( ( rule__DataInput__FilelocationAssignment_1 ) )
            {
            // InternalMml.g:965:1: ( ( rule__DataInput__FilelocationAssignment_1 ) )
            // InternalMml.g:966:2: ( rule__DataInput__FilelocationAssignment_1 )
            {
             before(grammarAccess.getDataInputAccess().getFilelocationAssignment_1()); 
            // InternalMml.g:967:2: ( rule__DataInput__FilelocationAssignment_1 )
            // InternalMml.g:967:3: rule__DataInput__FilelocationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataInput__FilelocationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataInputAccess().getFilelocationAssignment_1()); 

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
    // $ANTLR end "rule__DataInput__Group__1__Impl"


    // $ANTLR start "rule__DataInput__Group__2"
    // InternalMml.g:975:1: rule__DataInput__Group__2 : rule__DataInput__Group__2__Impl ;
    public final void rule__DataInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:979:1: ( rule__DataInput__Group__2__Impl )
            // InternalMml.g:980:2: rule__DataInput__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataInput__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__DataInput__Group__2"


    // $ANTLR start "rule__DataInput__Group__2__Impl"
    // InternalMml.g:986:1: rule__DataInput__Group__2__Impl : ( ( rule__DataInput__ParsingInstructionAssignment_2 )? ) ;
    public final void rule__DataInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:990:1: ( ( ( rule__DataInput__ParsingInstructionAssignment_2 )? ) )
            // InternalMml.g:991:1: ( ( rule__DataInput__ParsingInstructionAssignment_2 )? )
            {
            // InternalMml.g:991:1: ( ( rule__DataInput__ParsingInstructionAssignment_2 )? )
            // InternalMml.g:992:2: ( rule__DataInput__ParsingInstructionAssignment_2 )?
            {
             before(grammarAccess.getDataInputAccess().getParsingInstructionAssignment_2()); 
            // InternalMml.g:993:2: ( rule__DataInput__ParsingInstructionAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMml.g:993:3: rule__DataInput__ParsingInstructionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataInput__ParsingInstructionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataInputAccess().getParsingInstructionAssignment_2()); 

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
    // $ANTLR end "rule__DataInput__Group__2__Impl"


    // $ANTLR start "rule__CSVParsingConfiguration__Group__0"
    // InternalMml.g:1002:1: rule__CSVParsingConfiguration__Group__0 : rule__CSVParsingConfiguration__Group__0__Impl rule__CSVParsingConfiguration__Group__1 ;
    public final void rule__CSVParsingConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1006:1: ( rule__CSVParsingConfiguration__Group__0__Impl rule__CSVParsingConfiguration__Group__1 )
            // InternalMml.g:1007:2: rule__CSVParsingConfiguration__Group__0__Impl rule__CSVParsingConfiguration__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__CSVParsingConfiguration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CSVParsingConfiguration__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__CSVParsingConfiguration__Group__0"


    // $ANTLR start "rule__CSVParsingConfiguration__Group__0__Impl"
    // InternalMml.g:1014:1: rule__CSVParsingConfiguration__Group__0__Impl : ( 'separator' ) ;
    public final void rule__CSVParsingConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1018:1: ( ( 'separator' ) )
            // InternalMml.g:1019:1: ( 'separator' )
            {
            // InternalMml.g:1019:1: ( 'separator' )
            // InternalMml.g:1020:2: 'separator'
            {
             before(grammarAccess.getCSVParsingConfigurationAccess().getSeparatorKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCSVParsingConfigurationAccess().getSeparatorKeyword_0()); 

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
    // $ANTLR end "rule__CSVParsingConfiguration__Group__0__Impl"


    // $ANTLR start "rule__CSVParsingConfiguration__Group__1"
    // InternalMml.g:1029:1: rule__CSVParsingConfiguration__Group__1 : rule__CSVParsingConfiguration__Group__1__Impl ;
    public final void rule__CSVParsingConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1033:1: ( rule__CSVParsingConfiguration__Group__1__Impl )
            // InternalMml.g:1034:2: rule__CSVParsingConfiguration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSVParsingConfiguration__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__CSVParsingConfiguration__Group__1"


    // $ANTLR start "rule__CSVParsingConfiguration__Group__1__Impl"
    // InternalMml.g:1040:1: rule__CSVParsingConfiguration__Group__1__Impl : ( ( rule__CSVParsingConfiguration__SepAssignment_1 ) ) ;
    public final void rule__CSVParsingConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1044:1: ( ( ( rule__CSVParsingConfiguration__SepAssignment_1 ) ) )
            // InternalMml.g:1045:1: ( ( rule__CSVParsingConfiguration__SepAssignment_1 ) )
            {
            // InternalMml.g:1045:1: ( ( rule__CSVParsingConfiguration__SepAssignment_1 ) )
            // InternalMml.g:1046:2: ( rule__CSVParsingConfiguration__SepAssignment_1 )
            {
             before(grammarAccess.getCSVParsingConfigurationAccess().getSepAssignment_1()); 
            // InternalMml.g:1047:2: ( rule__CSVParsingConfiguration__SepAssignment_1 )
            // InternalMml.g:1047:3: rule__CSVParsingConfiguration__SepAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CSVParsingConfiguration__SepAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCSVParsingConfigurationAccess().getSepAssignment_1()); 

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
    // $ANTLR end "rule__CSVParsingConfiguration__Group__1__Impl"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__0"
    // InternalMml.g:1056:1: rule__MLChoiceAlgorithm__Group__0 : rule__MLChoiceAlgorithm__Group__0__Impl rule__MLChoiceAlgorithm__Group__1 ;
    public final void rule__MLChoiceAlgorithm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1060:1: ( rule__MLChoiceAlgorithm__Group__0__Impl rule__MLChoiceAlgorithm__Group__1 )
            // InternalMml.g:1061:2: rule__MLChoiceAlgorithm__Group__0__Impl rule__MLChoiceAlgorithm__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MLChoiceAlgorithm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__0"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__0__Impl"
    // InternalMml.g:1068:1: rule__MLChoiceAlgorithm__Group__0__Impl : ( 'mlframework' ) ;
    public final void rule__MLChoiceAlgorithm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1072:1: ( ( 'mlframework' ) )
            // InternalMml.g:1073:1: ( 'mlframework' )
            {
            // InternalMml.g:1073:1: ( 'mlframework' )
            // InternalMml.g:1074:2: 'mlframework'
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getMlframeworkKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMLChoiceAlgorithmAccess().getMlframeworkKeyword_0()); 

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
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__0__Impl"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__1"
    // InternalMml.g:1083:1: rule__MLChoiceAlgorithm__Group__1 : rule__MLChoiceAlgorithm__Group__1__Impl rule__MLChoiceAlgorithm__Group__2 ;
    public final void rule__MLChoiceAlgorithm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1087:1: ( rule__MLChoiceAlgorithm__Group__1__Impl rule__MLChoiceAlgorithm__Group__2 )
            // InternalMml.g:1088:2: rule__MLChoiceAlgorithm__Group__1__Impl rule__MLChoiceAlgorithm__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MLChoiceAlgorithm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__1"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__1__Impl"
    // InternalMml.g:1095:1: rule__MLChoiceAlgorithm__Group__1__Impl : ( ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 ) ) ;
    public final void rule__MLChoiceAlgorithm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1099:1: ( ( ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 ) ) )
            // InternalMml.g:1100:1: ( ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 ) )
            {
            // InternalMml.g:1100:1: ( ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 ) )
            // InternalMml.g:1101:2: ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 )
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkAssignment_1()); 
            // InternalMml.g:1102:2: ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 )
            // InternalMml.g:1102:3: rule__MLChoiceAlgorithm__FrameworkAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__FrameworkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkAssignment_1()); 

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
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__1__Impl"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__2"
    // InternalMml.g:1110:1: rule__MLChoiceAlgorithm__Group__2 : rule__MLChoiceAlgorithm__Group__2__Impl rule__MLChoiceAlgorithm__Group__3 ;
    public final void rule__MLChoiceAlgorithm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1114:1: ( rule__MLChoiceAlgorithm__Group__2__Impl rule__MLChoiceAlgorithm__Group__3 )
            // InternalMml.g:1115:2: rule__MLChoiceAlgorithm__Group__2__Impl rule__MLChoiceAlgorithm__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__MLChoiceAlgorithm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__2"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__2__Impl"
    // InternalMml.g:1122:1: rule__MLChoiceAlgorithm__Group__2__Impl : ( 'algorithm' ) ;
    public final void rule__MLChoiceAlgorithm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1126:1: ( ( 'algorithm' ) )
            // InternalMml.g:1127:1: ( 'algorithm' )
            {
            // InternalMml.g:1127:1: ( 'algorithm' )
            // InternalMml.g:1128:2: 'algorithm'
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmKeyword_2()); 

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
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__2__Impl"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__3"
    // InternalMml.g:1137:1: rule__MLChoiceAlgorithm__Group__3 : rule__MLChoiceAlgorithm__Group__3__Impl ;
    public final void rule__MLChoiceAlgorithm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1141:1: ( rule__MLChoiceAlgorithm__Group__3__Impl )
            // InternalMml.g:1142:2: rule__MLChoiceAlgorithm__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__Group__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__3"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__3__Impl"
    // InternalMml.g:1148:1: rule__MLChoiceAlgorithm__Group__3__Impl : ( ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 ) ) ;
    public final void rule__MLChoiceAlgorithm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1152:1: ( ( ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 ) ) )
            // InternalMml.g:1153:1: ( ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 ) )
            {
            // InternalMml.g:1153:1: ( ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 ) )
            // InternalMml.g:1154:2: ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 )
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmAssignment_3()); 
            // InternalMml.g:1155:2: ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 )
            // InternalMml.g:1155:3: rule__MLChoiceAlgorithm__AlgorithmAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__AlgorithmAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmAssignment_3()); 

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
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__3__Impl"


    // $ANTLR start "rule__SVM__Group__0"
    // InternalMml.g:1164:1: rule__SVM__Group__0 : rule__SVM__Group__0__Impl rule__SVM__Group__1 ;
    public final void rule__SVM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1168:1: ( rule__SVM__Group__0__Impl rule__SVM__Group__1 )
            // InternalMml.g:1169:2: rule__SVM__Group__0__Impl rule__SVM__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__SVM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__SVM__Group__0"


    // $ANTLR start "rule__SVM__Group__0__Impl"
    // InternalMml.g:1176:1: rule__SVM__Group__0__Impl : ( ( rule__SVM__NameAssignment_0 ) ) ;
    public final void rule__SVM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1180:1: ( ( ( rule__SVM__NameAssignment_0 ) ) )
            // InternalMml.g:1181:1: ( ( rule__SVM__NameAssignment_0 ) )
            {
            // InternalMml.g:1181:1: ( ( rule__SVM__NameAssignment_0 ) )
            // InternalMml.g:1182:2: ( rule__SVM__NameAssignment_0 )
            {
             before(grammarAccess.getSVMAccess().getNameAssignment_0()); 
            // InternalMml.g:1183:2: ( rule__SVM__NameAssignment_0 )
            // InternalMml.g:1183:3: rule__SVM__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SVM__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSVMAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__SVM__Group__0__Impl"


    // $ANTLR start "rule__SVM__Group__1"
    // InternalMml.g:1191:1: rule__SVM__Group__1 : rule__SVM__Group__1__Impl rule__SVM__Group__2 ;
    public final void rule__SVM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1195:1: ( rule__SVM__Group__1__Impl rule__SVM__Group__2 )
            // InternalMml.g:1196:2: rule__SVM__Group__1__Impl rule__SVM__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__SVM__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__SVM__Group__1"


    // $ANTLR start "rule__SVM__Group__1__Impl"
    // InternalMml.g:1203:1: rule__SVM__Group__1__Impl : ( ( rule__SVM__Group_1__0 )? ) ;
    public final void rule__SVM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1207:1: ( ( ( rule__SVM__Group_1__0 )? ) )
            // InternalMml.g:1208:1: ( ( rule__SVM__Group_1__0 )? )
            {
            // InternalMml.g:1208:1: ( ( rule__SVM__Group_1__0 )? )
            // InternalMml.g:1209:2: ( rule__SVM__Group_1__0 )?
            {
             before(grammarAccess.getSVMAccess().getGroup_1()); 
            // InternalMml.g:1210:2: ( rule__SVM__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMml.g:1210:3: rule__SVM__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVM__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVMAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SVM__Group__1__Impl"


    // $ANTLR start "rule__SVM__Group__2"
    // InternalMml.g:1218:1: rule__SVM__Group__2 : rule__SVM__Group__2__Impl rule__SVM__Group__3 ;
    public final void rule__SVM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1222:1: ( rule__SVM__Group__2__Impl rule__SVM__Group__3 )
            // InternalMml.g:1223:2: rule__SVM__Group__2__Impl rule__SVM__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__SVM__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__SVM__Group__2"


    // $ANTLR start "rule__SVM__Group__2__Impl"
    // InternalMml.g:1230:1: rule__SVM__Group__2__Impl : ( ( rule__SVM__Group_2__0 )? ) ;
    public final void rule__SVM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1234:1: ( ( ( rule__SVM__Group_2__0 )? ) )
            // InternalMml.g:1235:1: ( ( rule__SVM__Group_2__0 )? )
            {
            // InternalMml.g:1235:1: ( ( rule__SVM__Group_2__0 )? )
            // InternalMml.g:1236:2: ( rule__SVM__Group_2__0 )?
            {
             before(grammarAccess.getSVMAccess().getGroup_2()); 
            // InternalMml.g:1237:2: ( rule__SVM__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMml.g:1237:3: rule__SVM__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVM__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVMAccess().getGroup_2()); 

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
    // $ANTLR end "rule__SVM__Group__2__Impl"


    // $ANTLR start "rule__SVM__Group__3"
    // InternalMml.g:1245:1: rule__SVM__Group__3 : rule__SVM__Group__3__Impl rule__SVM__Group__4 ;
    public final void rule__SVM__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1249:1: ( rule__SVM__Group__3__Impl rule__SVM__Group__4 )
            // InternalMml.g:1250:2: rule__SVM__Group__3__Impl rule__SVM__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__SVM__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__SVM__Group__3"


    // $ANTLR start "rule__SVM__Group__3__Impl"
    // InternalMml.g:1257:1: rule__SVM__Group__3__Impl : ( ( rule__SVM__Group_3__0 )? ) ;
    public final void rule__SVM__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1261:1: ( ( ( rule__SVM__Group_3__0 )? ) )
            // InternalMml.g:1262:1: ( ( rule__SVM__Group_3__0 )? )
            {
            // InternalMml.g:1262:1: ( ( rule__SVM__Group_3__0 )? )
            // InternalMml.g:1263:2: ( rule__SVM__Group_3__0 )?
            {
             before(grammarAccess.getSVMAccess().getGroup_3()); 
            // InternalMml.g:1264:2: ( rule__SVM__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMml.g:1264:3: rule__SVM__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVM__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVMAccess().getGroup_3()); 

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
    // $ANTLR end "rule__SVM__Group__3__Impl"


    // $ANTLR start "rule__SVM__Group__4"
    // InternalMml.g:1272:1: rule__SVM__Group__4 : rule__SVM__Group__4__Impl ;
    public final void rule__SVM__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1276:1: ( rule__SVM__Group__4__Impl )
            // InternalMml.g:1277:2: rule__SVM__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVM__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__SVM__Group__4"


    // $ANTLR start "rule__SVM__Group__4__Impl"
    // InternalMml.g:1283:1: rule__SVM__Group__4__Impl : ( ( rule__SVM__Group_4__0 )? ) ;
    public final void rule__SVM__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1287:1: ( ( ( rule__SVM__Group_4__0 )? ) )
            // InternalMml.g:1288:1: ( ( rule__SVM__Group_4__0 )? )
            {
            // InternalMml.g:1288:1: ( ( rule__SVM__Group_4__0 )? )
            // InternalMml.g:1289:2: ( rule__SVM__Group_4__0 )?
            {
             before(grammarAccess.getSVMAccess().getGroup_4()); 
            // InternalMml.g:1290:2: ( rule__SVM__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMml.g:1290:3: rule__SVM__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVM__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVMAccess().getGroup_4()); 

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
    // $ANTLR end "rule__SVM__Group__4__Impl"


    // $ANTLR start "rule__SVM__Group_1__0"
    // InternalMml.g:1299:1: rule__SVM__Group_1__0 : rule__SVM__Group_1__0__Impl rule__SVM__Group_1__1 ;
    public final void rule__SVM__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1303:1: ( rule__SVM__Group_1__0__Impl rule__SVM__Group_1__1 )
            // InternalMml.g:1304:2: rule__SVM__Group_1__0__Impl rule__SVM__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__SVM__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__SVM__Group_1__0"


    // $ANTLR start "rule__SVM__Group_1__0__Impl"
    // InternalMml.g:1311:1: rule__SVM__Group_1__0__Impl : ( 'gamma=' ) ;
    public final void rule__SVM__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1315:1: ( ( 'gamma=' ) )
            // InternalMml.g:1316:1: ( 'gamma=' )
            {
            // InternalMml.g:1316:1: ( 'gamma=' )
            // InternalMml.g:1317:2: 'gamma='
            {
             before(grammarAccess.getSVMAccess().getGammaKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSVMAccess().getGammaKeyword_1_0()); 

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
    // $ANTLR end "rule__SVM__Group_1__0__Impl"


    // $ANTLR start "rule__SVM__Group_1__1"
    // InternalMml.g:1326:1: rule__SVM__Group_1__1 : rule__SVM__Group_1__1__Impl ;
    public final void rule__SVM__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1330:1: ( rule__SVM__Group_1__1__Impl )
            // InternalMml.g:1331:2: rule__SVM__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVM__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__SVM__Group_1__1"


    // $ANTLR start "rule__SVM__Group_1__1__Impl"
    // InternalMml.g:1337:1: rule__SVM__Group_1__1__Impl : ( ( rule__SVM__GammaAssignment_1_1 ) ) ;
    public final void rule__SVM__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1341:1: ( ( ( rule__SVM__GammaAssignment_1_1 ) ) )
            // InternalMml.g:1342:1: ( ( rule__SVM__GammaAssignment_1_1 ) )
            {
            // InternalMml.g:1342:1: ( ( rule__SVM__GammaAssignment_1_1 ) )
            // InternalMml.g:1343:2: ( rule__SVM__GammaAssignment_1_1 )
            {
             before(grammarAccess.getSVMAccess().getGammaAssignment_1_1()); 
            // InternalMml.g:1344:2: ( rule__SVM__GammaAssignment_1_1 )
            // InternalMml.g:1344:3: rule__SVM__GammaAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SVM__GammaAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSVMAccess().getGammaAssignment_1_1()); 

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
    // $ANTLR end "rule__SVM__Group_1__1__Impl"


    // $ANTLR start "rule__SVM__Group_2__0"
    // InternalMml.g:1353:1: rule__SVM__Group_2__0 : rule__SVM__Group_2__0__Impl rule__SVM__Group_2__1 ;
    public final void rule__SVM__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1357:1: ( rule__SVM__Group_2__0__Impl rule__SVM__Group_2__1 )
            // InternalMml.g:1358:2: rule__SVM__Group_2__0__Impl rule__SVM__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__SVM__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM__Group_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__SVM__Group_2__0"


    // $ANTLR start "rule__SVM__Group_2__0__Impl"
    // InternalMml.g:1365:1: rule__SVM__Group_2__0__Impl : ( 'C=' ) ;
    public final void rule__SVM__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1369:1: ( ( 'C=' ) )
            // InternalMml.g:1370:1: ( 'C=' )
            {
            // InternalMml.g:1370:1: ( 'C=' )
            // InternalMml.g:1371:2: 'C='
            {
             before(grammarAccess.getSVMAccess().getCKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSVMAccess().getCKeyword_2_0()); 

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
    // $ANTLR end "rule__SVM__Group_2__0__Impl"


    // $ANTLR start "rule__SVM__Group_2__1"
    // InternalMml.g:1380:1: rule__SVM__Group_2__1 : rule__SVM__Group_2__1__Impl ;
    public final void rule__SVM__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1384:1: ( rule__SVM__Group_2__1__Impl )
            // InternalMml.g:1385:2: rule__SVM__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVM__Group_2__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__SVM__Group_2__1"


    // $ANTLR start "rule__SVM__Group_2__1__Impl"
    // InternalMml.g:1391:1: rule__SVM__Group_2__1__Impl : ( ( rule__SVM__CAssignment_2_1 ) ) ;
    public final void rule__SVM__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1395:1: ( ( ( rule__SVM__CAssignment_2_1 ) ) )
            // InternalMml.g:1396:1: ( ( rule__SVM__CAssignment_2_1 ) )
            {
            // InternalMml.g:1396:1: ( ( rule__SVM__CAssignment_2_1 ) )
            // InternalMml.g:1397:2: ( rule__SVM__CAssignment_2_1 )
            {
             before(grammarAccess.getSVMAccess().getCAssignment_2_1()); 
            // InternalMml.g:1398:2: ( rule__SVM__CAssignment_2_1 )
            // InternalMml.g:1398:3: rule__SVM__CAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SVM__CAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSVMAccess().getCAssignment_2_1()); 

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
    // $ANTLR end "rule__SVM__Group_2__1__Impl"


    // $ANTLR start "rule__SVM__Group_3__0"
    // InternalMml.g:1407:1: rule__SVM__Group_3__0 : rule__SVM__Group_3__0__Impl rule__SVM__Group_3__1 ;
    public final void rule__SVM__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1411:1: ( rule__SVM__Group_3__0__Impl rule__SVM__Group_3__1 )
            // InternalMml.g:1412:2: rule__SVM__Group_3__0__Impl rule__SVM__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__SVM__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM__Group_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__SVM__Group_3__0"


    // $ANTLR start "rule__SVM__Group_3__0__Impl"
    // InternalMml.g:1419:1: rule__SVM__Group_3__0__Impl : ( 'kernel=' ) ;
    public final void rule__SVM__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1423:1: ( ( 'kernel=' ) )
            // InternalMml.g:1424:1: ( 'kernel=' )
            {
            // InternalMml.g:1424:1: ( 'kernel=' )
            // InternalMml.g:1425:2: 'kernel='
            {
             before(grammarAccess.getSVMAccess().getKernelKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSVMAccess().getKernelKeyword_3_0()); 

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
    // $ANTLR end "rule__SVM__Group_3__0__Impl"


    // $ANTLR start "rule__SVM__Group_3__1"
    // InternalMml.g:1434:1: rule__SVM__Group_3__1 : rule__SVM__Group_3__1__Impl ;
    public final void rule__SVM__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1438:1: ( rule__SVM__Group_3__1__Impl )
            // InternalMml.g:1439:2: rule__SVM__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVM__Group_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__SVM__Group_3__1"


    // $ANTLR start "rule__SVM__Group_3__1__Impl"
    // InternalMml.g:1445:1: rule__SVM__Group_3__1__Impl : ( ( rule__SVM__KernelAssignment_3_1 ) ) ;
    public final void rule__SVM__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1449:1: ( ( ( rule__SVM__KernelAssignment_3_1 ) ) )
            // InternalMml.g:1450:1: ( ( rule__SVM__KernelAssignment_3_1 ) )
            {
            // InternalMml.g:1450:1: ( ( rule__SVM__KernelAssignment_3_1 ) )
            // InternalMml.g:1451:2: ( rule__SVM__KernelAssignment_3_1 )
            {
             before(grammarAccess.getSVMAccess().getKernelAssignment_3_1()); 
            // InternalMml.g:1452:2: ( rule__SVM__KernelAssignment_3_1 )
            // InternalMml.g:1452:3: rule__SVM__KernelAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SVM__KernelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSVMAccess().getKernelAssignment_3_1()); 

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
    // $ANTLR end "rule__SVM__Group_3__1__Impl"


    // $ANTLR start "rule__SVM__Group_4__0"
    // InternalMml.g:1461:1: rule__SVM__Group_4__0 : rule__SVM__Group_4__0__Impl rule__SVM__Group_4__1 ;
    public final void rule__SVM__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1465:1: ( rule__SVM__Group_4__0__Impl rule__SVM__Group_4__1 )
            // InternalMml.g:1466:2: rule__SVM__Group_4__0__Impl rule__SVM__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__SVM__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM__Group_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__SVM__Group_4__0"


    // $ANTLR start "rule__SVM__Group_4__0__Impl"
    // InternalMml.g:1473:1: rule__SVM__Group_4__0__Impl : ( 'classification' ) ;
    public final void rule__SVM__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1477:1: ( ( 'classification' ) )
            // InternalMml.g:1478:1: ( 'classification' )
            {
            // InternalMml.g:1478:1: ( 'classification' )
            // InternalMml.g:1479:2: 'classification'
            {
             before(grammarAccess.getSVMAccess().getClassificationKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSVMAccess().getClassificationKeyword_4_0()); 

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
    // $ANTLR end "rule__SVM__Group_4__0__Impl"


    // $ANTLR start "rule__SVM__Group_4__1"
    // InternalMml.g:1488:1: rule__SVM__Group_4__1 : rule__SVM__Group_4__1__Impl ;
    public final void rule__SVM__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1492:1: ( rule__SVM__Group_4__1__Impl )
            // InternalMml.g:1493:2: rule__SVM__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVM__Group_4__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__SVM__Group_4__1"


    // $ANTLR start "rule__SVM__Group_4__1__Impl"
    // InternalMml.g:1499:1: rule__SVM__Group_4__1__Impl : ( ( rule__SVM__SvmclassificationAssignment_4_1 ) ) ;
    public final void rule__SVM__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1503:1: ( ( ( rule__SVM__SvmclassificationAssignment_4_1 ) ) )
            // InternalMml.g:1504:1: ( ( rule__SVM__SvmclassificationAssignment_4_1 ) )
            {
            // InternalMml.g:1504:1: ( ( rule__SVM__SvmclassificationAssignment_4_1 ) )
            // InternalMml.g:1505:2: ( rule__SVM__SvmclassificationAssignment_4_1 )
            {
             before(grammarAccess.getSVMAccess().getSvmclassificationAssignment_4_1()); 
            // InternalMml.g:1506:2: ( rule__SVM__SvmclassificationAssignment_4_1 )
            // InternalMml.g:1506:3: rule__SVM__SvmclassificationAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SVM__SvmclassificationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSVMAccess().getSvmclassificationAssignment_4_1()); 

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
    // $ANTLR end "rule__SVM__Group_4__1__Impl"


    // $ANTLR start "rule__DT__Group__0"
    // InternalMml.g:1515:1: rule__DT__Group__0 : rule__DT__Group__0__Impl rule__DT__Group__1 ;
    public final void rule__DT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1519:1: ( rule__DT__Group__0__Impl rule__DT__Group__1 )
            // InternalMml.g:1520:2: rule__DT__Group__0__Impl rule__DT__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__DT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DT__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__DT__Group__0"


    // $ANTLR start "rule__DT__Group__0__Impl"
    // InternalMml.g:1527:1: rule__DT__Group__0__Impl : ( ( rule__DT__NameAssignment_0 ) ) ;
    public final void rule__DT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1531:1: ( ( ( rule__DT__NameAssignment_0 ) ) )
            // InternalMml.g:1532:1: ( ( rule__DT__NameAssignment_0 ) )
            {
            // InternalMml.g:1532:1: ( ( rule__DT__NameAssignment_0 ) )
            // InternalMml.g:1533:2: ( rule__DT__NameAssignment_0 )
            {
             before(grammarAccess.getDTAccess().getNameAssignment_0()); 
            // InternalMml.g:1534:2: ( rule__DT__NameAssignment_0 )
            // InternalMml.g:1534:3: rule__DT__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DT__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDTAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__DT__Group__0__Impl"


    // $ANTLR start "rule__DT__Group__1"
    // InternalMml.g:1542:1: rule__DT__Group__1 : rule__DT__Group__1__Impl ;
    public final void rule__DT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1546:1: ( rule__DT__Group__1__Impl )
            // InternalMml.g:1547:2: rule__DT__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DT__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__DT__Group__1"


    // $ANTLR start "rule__DT__Group__1__Impl"
    // InternalMml.g:1553:1: rule__DT__Group__1__Impl : ( ( rule__DT__Max_depthAssignment_1 )? ) ;
    public final void rule__DT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1557:1: ( ( ( rule__DT__Max_depthAssignment_1 )? ) )
            // InternalMml.g:1558:1: ( ( rule__DT__Max_depthAssignment_1 )? )
            {
            // InternalMml.g:1558:1: ( ( rule__DT__Max_depthAssignment_1 )? )
            // InternalMml.g:1559:2: ( rule__DT__Max_depthAssignment_1 )?
            {
             before(grammarAccess.getDTAccess().getMax_depthAssignment_1()); 
            // InternalMml.g:1560:2: ( rule__DT__Max_depthAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMml.g:1560:3: rule__DT__Max_depthAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DT__Max_depthAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDTAccess().getMax_depthAssignment_1()); 

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
    // $ANTLR end "rule__DT__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalMml.g:1569:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1573:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalMml.g:1574:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__FLOAT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__FLOAT__Group__0"


    // $ANTLR start "rule__FLOAT__Group__0__Impl"
    // InternalMml.g:1581:1: rule__FLOAT__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1585:1: ( ( RULE_INT ) )
            // InternalMml.g:1586:1: ( RULE_INT )
            {
            // InternalMml.g:1586:1: ( RULE_INT )
            // InternalMml.g:1587:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__FLOAT__Group__0__Impl"


    // $ANTLR start "rule__FLOAT__Group__1"
    // InternalMml.g:1596:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1600:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // InternalMml.g:1601:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__FLOAT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__FLOAT__Group__1"


    // $ANTLR start "rule__FLOAT__Group__1__Impl"
    // InternalMml.g:1608:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1612:1: ( ( '.' ) )
            // InternalMml.g:1613:1: ( '.' )
            {
            // InternalMml.g:1613:1: ( '.' )
            // InternalMml.g:1614:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__FLOAT__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__2"
    // InternalMml.g:1623:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1627:1: ( rule__FLOAT__Group__2__Impl )
            // InternalMml.g:1628:2: rule__FLOAT__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__FLOAT__Group__2"


    // $ANTLR start "rule__FLOAT__Group__2__Impl"
    // InternalMml.g:1634:1: rule__FLOAT__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1638:1: ( ( RULE_INT ) )
            // InternalMml.g:1639:1: ( RULE_INT )
            {
            // InternalMml.g:1639:1: ( RULE_INT )
            // InternalMml.g:1640:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__FLOAT__Group__2__Impl"


    // $ANTLR start "rule__RFormula__Group__0"
    // InternalMml.g:1650:1: rule__RFormula__Group__0 : rule__RFormula__Group__0__Impl rule__RFormula__Group__1 ;
    public final void rule__RFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1654:1: ( rule__RFormula__Group__0__Impl rule__RFormula__Group__1 )
            // InternalMml.g:1655:2: rule__RFormula__Group__0__Impl rule__RFormula__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__RFormula__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RFormula__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__RFormula__Group__0"


    // $ANTLR start "rule__RFormula__Group__0__Impl"
    // InternalMml.g:1662:1: rule__RFormula__Group__0__Impl : ( 'formula' ) ;
    public final void rule__RFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1666:1: ( ( 'formula' ) )
            // InternalMml.g:1667:1: ( 'formula' )
            {
            // InternalMml.g:1667:1: ( 'formula' )
            // InternalMml.g:1668:2: 'formula'
            {
             before(grammarAccess.getRFormulaAccess().getFormulaKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRFormulaAccess().getFormulaKeyword_0()); 

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
    // $ANTLR end "rule__RFormula__Group__0__Impl"


    // $ANTLR start "rule__RFormula__Group__1"
    // InternalMml.g:1677:1: rule__RFormula__Group__1 : rule__RFormula__Group__1__Impl rule__RFormula__Group__2 ;
    public final void rule__RFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1681:1: ( rule__RFormula__Group__1__Impl rule__RFormula__Group__2 )
            // InternalMml.g:1682:2: rule__RFormula__Group__1__Impl rule__RFormula__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__RFormula__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RFormula__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__RFormula__Group__1"


    // $ANTLR start "rule__RFormula__Group__1__Impl"
    // InternalMml.g:1689:1: rule__RFormula__Group__1__Impl : ( ( rule__RFormula__Group_1__0 )? ) ;
    public final void rule__RFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1693:1: ( ( ( rule__RFormula__Group_1__0 )? ) )
            // InternalMml.g:1694:1: ( ( rule__RFormula__Group_1__0 )? )
            {
            // InternalMml.g:1694:1: ( ( rule__RFormula__Group_1__0 )? )
            // InternalMml.g:1695:2: ( rule__RFormula__Group_1__0 )?
            {
             before(grammarAccess.getRFormulaAccess().getGroup_1()); 
            // InternalMml.g:1696:2: ( rule__RFormula__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_INT && LA16_0<=RULE_STRING)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMml.g:1696:3: rule__RFormula__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RFormula__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRFormulaAccess().getGroup_1()); 

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
    // $ANTLR end "rule__RFormula__Group__1__Impl"


    // $ANTLR start "rule__RFormula__Group__2"
    // InternalMml.g:1704:1: rule__RFormula__Group__2 : rule__RFormula__Group__2__Impl ;
    public final void rule__RFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1708:1: ( rule__RFormula__Group__2__Impl )
            // InternalMml.g:1709:2: rule__RFormula__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RFormula__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__RFormula__Group__2"


    // $ANTLR start "rule__RFormula__Group__2__Impl"
    // InternalMml.g:1715:1: rule__RFormula__Group__2__Impl : ( ( rule__RFormula__PredictorsAssignment_2 ) ) ;
    public final void rule__RFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1719:1: ( ( ( rule__RFormula__PredictorsAssignment_2 ) ) )
            // InternalMml.g:1720:1: ( ( rule__RFormula__PredictorsAssignment_2 ) )
            {
            // InternalMml.g:1720:1: ( ( rule__RFormula__PredictorsAssignment_2 ) )
            // InternalMml.g:1721:2: ( rule__RFormula__PredictorsAssignment_2 )
            {
             before(grammarAccess.getRFormulaAccess().getPredictorsAssignment_2()); 
            // InternalMml.g:1722:2: ( rule__RFormula__PredictorsAssignment_2 )
            // InternalMml.g:1722:3: rule__RFormula__PredictorsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RFormula__PredictorsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRFormulaAccess().getPredictorsAssignment_2()); 

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
    // $ANTLR end "rule__RFormula__Group__2__Impl"


    // $ANTLR start "rule__RFormula__Group_1__0"
    // InternalMml.g:1731:1: rule__RFormula__Group_1__0 : rule__RFormula__Group_1__0__Impl rule__RFormula__Group_1__1 ;
    public final void rule__RFormula__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1735:1: ( rule__RFormula__Group_1__0__Impl rule__RFormula__Group_1__1 )
            // InternalMml.g:1736:2: rule__RFormula__Group_1__0__Impl rule__RFormula__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__RFormula__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RFormula__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__RFormula__Group_1__0"


    // $ANTLR start "rule__RFormula__Group_1__0__Impl"
    // InternalMml.g:1743:1: rule__RFormula__Group_1__0__Impl : ( ( rule__RFormula__PredictiveAssignment_1_0 ) ) ;
    public final void rule__RFormula__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1747:1: ( ( ( rule__RFormula__PredictiveAssignment_1_0 ) ) )
            // InternalMml.g:1748:1: ( ( rule__RFormula__PredictiveAssignment_1_0 ) )
            {
            // InternalMml.g:1748:1: ( ( rule__RFormula__PredictiveAssignment_1_0 ) )
            // InternalMml.g:1749:2: ( rule__RFormula__PredictiveAssignment_1_0 )
            {
             before(grammarAccess.getRFormulaAccess().getPredictiveAssignment_1_0()); 
            // InternalMml.g:1750:2: ( rule__RFormula__PredictiveAssignment_1_0 )
            // InternalMml.g:1750:3: rule__RFormula__PredictiveAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RFormula__PredictiveAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRFormulaAccess().getPredictiveAssignment_1_0()); 

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
    // $ANTLR end "rule__RFormula__Group_1__0__Impl"


    // $ANTLR start "rule__RFormula__Group_1__1"
    // InternalMml.g:1758:1: rule__RFormula__Group_1__1 : rule__RFormula__Group_1__1__Impl ;
    public final void rule__RFormula__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1762:1: ( rule__RFormula__Group_1__1__Impl )
            // InternalMml.g:1763:2: rule__RFormula__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RFormula__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__RFormula__Group_1__1"


    // $ANTLR start "rule__RFormula__Group_1__1__Impl"
    // InternalMml.g:1769:1: rule__RFormula__Group_1__1__Impl : ( '~' ) ;
    public final void rule__RFormula__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1773:1: ( ( '~' ) )
            // InternalMml.g:1774:1: ( '~' )
            {
            // InternalMml.g:1774:1: ( '~' )
            // InternalMml.g:1775:2: '~'
            {
             before(grammarAccess.getRFormulaAccess().getTildeKeyword_1_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRFormulaAccess().getTildeKeyword_1_1()); 

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
    // $ANTLR end "rule__RFormula__Group_1__1__Impl"


    // $ANTLR start "rule__AllVariables__Group__0"
    // InternalMml.g:1785:1: rule__AllVariables__Group__0 : rule__AllVariables__Group__0__Impl rule__AllVariables__Group__1 ;
    public final void rule__AllVariables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1789:1: ( rule__AllVariables__Group__0__Impl rule__AllVariables__Group__1 )
            // InternalMml.g:1790:2: rule__AllVariables__Group__0__Impl rule__AllVariables__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__AllVariables__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllVariables__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__AllVariables__Group__0"


    // $ANTLR start "rule__AllVariables__Group__0__Impl"
    // InternalMml.g:1797:1: rule__AllVariables__Group__0__Impl : ( ( rule__AllVariables__NameAssignment_0 ) ) ;
    public final void rule__AllVariables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1801:1: ( ( ( rule__AllVariables__NameAssignment_0 ) ) )
            // InternalMml.g:1802:1: ( ( rule__AllVariables__NameAssignment_0 ) )
            {
            // InternalMml.g:1802:1: ( ( rule__AllVariables__NameAssignment_0 ) )
            // InternalMml.g:1803:2: ( rule__AllVariables__NameAssignment_0 )
            {
             before(grammarAccess.getAllVariablesAccess().getNameAssignment_0()); 
            // InternalMml.g:1804:2: ( rule__AllVariables__NameAssignment_0 )
            // InternalMml.g:1804:3: rule__AllVariables__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AllVariables__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAllVariablesAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__AllVariables__Group__0__Impl"


    // $ANTLR start "rule__AllVariables__Group__1"
    // InternalMml.g:1812:1: rule__AllVariables__Group__1 : rule__AllVariables__Group__1__Impl ;
    public final void rule__AllVariables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1816:1: ( rule__AllVariables__Group__1__Impl )
            // InternalMml.g:1817:2: rule__AllVariables__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllVariables__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AllVariables__Group__1"


    // $ANTLR start "rule__AllVariables__Group__1__Impl"
    // InternalMml.g:1823:1: rule__AllVariables__Group__1__Impl : ( ( rule__AllVariables__AllAssignment_1 ) ) ;
    public final void rule__AllVariables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1827:1: ( ( ( rule__AllVariables__AllAssignment_1 ) ) )
            // InternalMml.g:1828:1: ( ( rule__AllVariables__AllAssignment_1 ) )
            {
            // InternalMml.g:1828:1: ( ( rule__AllVariables__AllAssignment_1 ) )
            // InternalMml.g:1829:2: ( rule__AllVariables__AllAssignment_1 )
            {
             before(grammarAccess.getAllVariablesAccess().getAllAssignment_1()); 
            // InternalMml.g:1830:2: ( rule__AllVariables__AllAssignment_1 )
            // InternalMml.g:1830:3: rule__AllVariables__AllAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AllVariables__AllAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAllVariablesAccess().getAllAssignment_1()); 

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
    // $ANTLR end "rule__AllVariables__Group__1__Impl"


    // $ANTLR start "rule__PredictorVariables__Group__0"
    // InternalMml.g:1839:1: rule__PredictorVariables__Group__0 : rule__PredictorVariables__Group__0__Impl rule__PredictorVariables__Group__1 ;
    public final void rule__PredictorVariables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1843:1: ( rule__PredictorVariables__Group__0__Impl rule__PredictorVariables__Group__1 )
            // InternalMml.g:1844:2: rule__PredictorVariables__Group__0__Impl rule__PredictorVariables__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__PredictorVariables__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictorVariables__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__PredictorVariables__Group__0"


    // $ANTLR start "rule__PredictorVariables__Group__0__Impl"
    // InternalMml.g:1851:1: rule__PredictorVariables__Group__0__Impl : ( ( rule__PredictorVariables__NameAssignment_0 ) ) ;
    public final void rule__PredictorVariables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1855:1: ( ( ( rule__PredictorVariables__NameAssignment_0 ) ) )
            // InternalMml.g:1856:1: ( ( rule__PredictorVariables__NameAssignment_0 ) )
            {
            // InternalMml.g:1856:1: ( ( rule__PredictorVariables__NameAssignment_0 ) )
            // InternalMml.g:1857:2: ( rule__PredictorVariables__NameAssignment_0 )
            {
             before(grammarAccess.getPredictorVariablesAccess().getNameAssignment_0()); 
            // InternalMml.g:1858:2: ( rule__PredictorVariables__NameAssignment_0 )
            // InternalMml.g:1858:3: rule__PredictorVariables__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PredictorVariables__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPredictorVariablesAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__PredictorVariables__Group__0__Impl"


    // $ANTLR start "rule__PredictorVariables__Group__1"
    // InternalMml.g:1866:1: rule__PredictorVariables__Group__1 : rule__PredictorVariables__Group__1__Impl ;
    public final void rule__PredictorVariables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1870:1: ( rule__PredictorVariables__Group__1__Impl )
            // InternalMml.g:1871:2: rule__PredictorVariables__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredictorVariables__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PredictorVariables__Group__1"


    // $ANTLR start "rule__PredictorVariables__Group__1__Impl"
    // InternalMml.g:1877:1: rule__PredictorVariables__Group__1__Impl : ( ( rule__PredictorVariables__Group_1__0 ) ) ;
    public final void rule__PredictorVariables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1881:1: ( ( ( rule__PredictorVariables__Group_1__0 ) ) )
            // InternalMml.g:1882:1: ( ( rule__PredictorVariables__Group_1__0 ) )
            {
            // InternalMml.g:1882:1: ( ( rule__PredictorVariables__Group_1__0 ) )
            // InternalMml.g:1883:2: ( rule__PredictorVariables__Group_1__0 )
            {
             before(grammarAccess.getPredictorVariablesAccess().getGroup_1()); 
            // InternalMml.g:1884:2: ( rule__PredictorVariables__Group_1__0 )
            // InternalMml.g:1884:3: rule__PredictorVariables__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__PredictorVariables__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getPredictorVariablesAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PredictorVariables__Group__1__Impl"


    // $ANTLR start "rule__PredictorVariables__Group_1__0"
    // InternalMml.g:1893:1: rule__PredictorVariables__Group_1__0 : rule__PredictorVariables__Group_1__0__Impl rule__PredictorVariables__Group_1__1 ;
    public final void rule__PredictorVariables__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1897:1: ( rule__PredictorVariables__Group_1__0__Impl rule__PredictorVariables__Group_1__1 )
            // InternalMml.g:1898:2: rule__PredictorVariables__Group_1__0__Impl rule__PredictorVariables__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__PredictorVariables__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictorVariables__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__PredictorVariables__Group_1__0"


    // $ANTLR start "rule__PredictorVariables__Group_1__0__Impl"
    // InternalMml.g:1905:1: rule__PredictorVariables__Group_1__0__Impl : ( ( rule__PredictorVariables__VarsAssignment_1_0 ) ) ;
    public final void rule__PredictorVariables__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1909:1: ( ( ( rule__PredictorVariables__VarsAssignment_1_0 ) ) )
            // InternalMml.g:1910:1: ( ( rule__PredictorVariables__VarsAssignment_1_0 ) )
            {
            // InternalMml.g:1910:1: ( ( rule__PredictorVariables__VarsAssignment_1_0 ) )
            // InternalMml.g:1911:2: ( rule__PredictorVariables__VarsAssignment_1_0 )
            {
             before(grammarAccess.getPredictorVariablesAccess().getVarsAssignment_1_0()); 
            // InternalMml.g:1912:2: ( rule__PredictorVariables__VarsAssignment_1_0 )
            // InternalMml.g:1912:3: rule__PredictorVariables__VarsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PredictorVariables__VarsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPredictorVariablesAccess().getVarsAssignment_1_0()); 

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
    // $ANTLR end "rule__PredictorVariables__Group_1__0__Impl"


    // $ANTLR start "rule__PredictorVariables__Group_1__1"
    // InternalMml.g:1920:1: rule__PredictorVariables__Group_1__1 : rule__PredictorVariables__Group_1__1__Impl ;
    public final void rule__PredictorVariables__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1924:1: ( rule__PredictorVariables__Group_1__1__Impl )
            // InternalMml.g:1925:2: rule__PredictorVariables__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredictorVariables__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PredictorVariables__Group_1__1"


    // $ANTLR start "rule__PredictorVariables__Group_1__1__Impl"
    // InternalMml.g:1931:1: rule__PredictorVariables__Group_1__1__Impl : ( ( rule__PredictorVariables__Group_1_1__0 )* ) ;
    public final void rule__PredictorVariables__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1935:1: ( ( ( rule__PredictorVariables__Group_1_1__0 )* ) )
            // InternalMml.g:1936:1: ( ( rule__PredictorVariables__Group_1_1__0 )* )
            {
            // InternalMml.g:1936:1: ( ( rule__PredictorVariables__Group_1_1__0 )* )
            // InternalMml.g:1937:2: ( rule__PredictorVariables__Group_1_1__0 )*
            {
             before(grammarAccess.getPredictorVariablesAccess().getGroup_1_1()); 
            // InternalMml.g:1938:2: ( rule__PredictorVariables__Group_1_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==37) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMml.g:1938:3: rule__PredictorVariables__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__PredictorVariables__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPredictorVariablesAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__PredictorVariables__Group_1__1__Impl"


    // $ANTLR start "rule__PredictorVariables__Group_1_1__0"
    // InternalMml.g:1947:1: rule__PredictorVariables__Group_1_1__0 : rule__PredictorVariables__Group_1_1__0__Impl rule__PredictorVariables__Group_1_1__1 ;
    public final void rule__PredictorVariables__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1951:1: ( rule__PredictorVariables__Group_1_1__0__Impl rule__PredictorVariables__Group_1_1__1 )
            // InternalMml.g:1952:2: rule__PredictorVariables__Group_1_1__0__Impl rule__PredictorVariables__Group_1_1__1
            {
            pushFollow(FOLLOW_19);
            rule__PredictorVariables__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictorVariables__Group_1_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__PredictorVariables__Group_1_1__0"


    // $ANTLR start "rule__PredictorVariables__Group_1_1__0__Impl"
    // InternalMml.g:1959:1: rule__PredictorVariables__Group_1_1__0__Impl : ( '+' ) ;
    public final void rule__PredictorVariables__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1963:1: ( ( '+' ) )
            // InternalMml.g:1964:1: ( '+' )
            {
            // InternalMml.g:1964:1: ( '+' )
            // InternalMml.g:1965:2: '+'
            {
             before(grammarAccess.getPredictorVariablesAccess().getPlusSignKeyword_1_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPredictorVariablesAccess().getPlusSignKeyword_1_1_0()); 

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
    // $ANTLR end "rule__PredictorVariables__Group_1_1__0__Impl"


    // $ANTLR start "rule__PredictorVariables__Group_1_1__1"
    // InternalMml.g:1974:1: rule__PredictorVariables__Group_1_1__1 : rule__PredictorVariables__Group_1_1__1__Impl ;
    public final void rule__PredictorVariables__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1978:1: ( rule__PredictorVariables__Group_1_1__1__Impl )
            // InternalMml.g:1979:2: rule__PredictorVariables__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredictorVariables__Group_1_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__PredictorVariables__Group_1_1__1"


    // $ANTLR start "rule__PredictorVariables__Group_1_1__1__Impl"
    // InternalMml.g:1985:1: rule__PredictorVariables__Group_1_1__1__Impl : ( ( rule__PredictorVariables__VarsAssignment_1_1_1 ) ) ;
    public final void rule__PredictorVariables__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1989:1: ( ( ( rule__PredictorVariables__VarsAssignment_1_1_1 ) ) )
            // InternalMml.g:1990:1: ( ( rule__PredictorVariables__VarsAssignment_1_1_1 ) )
            {
            // InternalMml.g:1990:1: ( ( rule__PredictorVariables__VarsAssignment_1_1_1 ) )
            // InternalMml.g:1991:2: ( rule__PredictorVariables__VarsAssignment_1_1_1 )
            {
             before(grammarAccess.getPredictorVariablesAccess().getVarsAssignment_1_1_1()); 
            // InternalMml.g:1992:2: ( rule__PredictorVariables__VarsAssignment_1_1_1 )
            // InternalMml.g:1992:3: rule__PredictorVariables__VarsAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PredictorVariables__VarsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPredictorVariablesAccess().getVarsAssignment_1_1_1()); 

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
    // $ANTLR end "rule__PredictorVariables__Group_1_1__1__Impl"


    // $ANTLR start "rule__Validation__Group__0"
    // InternalMml.g:2001:1: rule__Validation__Group__0 : rule__Validation__Group__0__Impl rule__Validation__Group__1 ;
    public final void rule__Validation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2005:1: ( rule__Validation__Group__0__Impl rule__Validation__Group__1 )
            // InternalMml.g:2006:2: rule__Validation__Group__0__Impl rule__Validation__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Validation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Validation__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Validation__Group__0"


    // $ANTLR start "rule__Validation__Group__0__Impl"
    // InternalMml.g:2013:1: rule__Validation__Group__0__Impl : ( ( rule__Validation__StratificationAssignment_0 ) ) ;
    public final void rule__Validation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2017:1: ( ( ( rule__Validation__StratificationAssignment_0 ) ) )
            // InternalMml.g:2018:1: ( ( rule__Validation__StratificationAssignment_0 ) )
            {
            // InternalMml.g:2018:1: ( ( rule__Validation__StratificationAssignment_0 ) )
            // InternalMml.g:2019:2: ( rule__Validation__StratificationAssignment_0 )
            {
             before(grammarAccess.getValidationAccess().getStratificationAssignment_0()); 
            // InternalMml.g:2020:2: ( rule__Validation__StratificationAssignment_0 )
            // InternalMml.g:2020:3: rule__Validation__StratificationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Validation__StratificationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getStratificationAssignment_0()); 

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
    // $ANTLR end "rule__Validation__Group__0__Impl"


    // $ANTLR start "rule__Validation__Group__1"
    // InternalMml.g:2028:1: rule__Validation__Group__1 : rule__Validation__Group__1__Impl ;
    public final void rule__Validation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2032:1: ( rule__Validation__Group__1__Impl )
            // InternalMml.g:2033:2: rule__Validation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Validation__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Validation__Group__1"


    // $ANTLR start "rule__Validation__Group__1__Impl"
    // InternalMml.g:2039:1: rule__Validation__Group__1__Impl : ( ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* ) ) ;
    public final void rule__Validation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2043:1: ( ( ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* ) ) )
            // InternalMml.g:2044:1: ( ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* ) )
            {
            // InternalMml.g:2044:1: ( ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* ) )
            // InternalMml.g:2045:2: ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* )
            {
            // InternalMml.g:2045:2: ( ( rule__Validation__MetricAssignment_1 ) )
            // InternalMml.g:2046:3: ( rule__Validation__MetricAssignment_1 )
            {
             before(grammarAccess.getValidationAccess().getMetricAssignment_1()); 
            // InternalMml.g:2047:3: ( rule__Validation__MetricAssignment_1 )
            // InternalMml.g:2047:4: rule__Validation__MetricAssignment_1
            {
            pushFollow(FOLLOW_23);
            rule__Validation__MetricAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getMetricAssignment_1()); 

            }

            // InternalMml.g:2050:2: ( ( rule__Validation__MetricAssignment_1 )* )
            // InternalMml.g:2051:3: ( rule__Validation__MetricAssignment_1 )*
            {
             before(grammarAccess.getValidationAccess().getMetricAssignment_1()); 
            // InternalMml.g:2052:3: ( rule__Validation__MetricAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=22 && LA18_0<=24)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMml.g:2052:4: rule__Validation__MetricAssignment_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Validation__MetricAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getValidationAccess().getMetricAssignment_1()); 

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
    // $ANTLR end "rule__Validation__Group__1__Impl"


    // $ANTLR start "rule__TrainingTest__Group__0"
    // InternalMml.g:2062:1: rule__TrainingTest__Group__0 : rule__TrainingTest__Group__0__Impl rule__TrainingTest__Group__1 ;
    public final void rule__TrainingTest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2066:1: ( rule__TrainingTest__Group__0__Impl rule__TrainingTest__Group__1 )
            // InternalMml.g:2067:2: rule__TrainingTest__Group__0__Impl rule__TrainingTest__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__TrainingTest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__TrainingTest__Group__0"


    // $ANTLR start "rule__TrainingTest__Group__0__Impl"
    // InternalMml.g:2074:1: rule__TrainingTest__Group__0__Impl : ( ( rule__TrainingTest__NameAssignment_0 ) ) ;
    public final void rule__TrainingTest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2078:1: ( ( ( rule__TrainingTest__NameAssignment_0 ) ) )
            // InternalMml.g:2079:1: ( ( rule__TrainingTest__NameAssignment_0 ) )
            {
            // InternalMml.g:2079:1: ( ( rule__TrainingTest__NameAssignment_0 ) )
            // InternalMml.g:2080:2: ( rule__TrainingTest__NameAssignment_0 )
            {
             before(grammarAccess.getTrainingTestAccess().getNameAssignment_0()); 
            // InternalMml.g:2081:2: ( rule__TrainingTest__NameAssignment_0 )
            // InternalMml.g:2081:3: rule__TrainingTest__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TrainingTest__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingTestAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__TrainingTest__Group__0__Impl"


    // $ANTLR start "rule__TrainingTest__Group__1"
    // InternalMml.g:2089:1: rule__TrainingTest__Group__1 : rule__TrainingTest__Group__1__Impl rule__TrainingTest__Group__2 ;
    public final void rule__TrainingTest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2093:1: ( rule__TrainingTest__Group__1__Impl rule__TrainingTest__Group__2 )
            // InternalMml.g:2094:2: rule__TrainingTest__Group__1__Impl rule__TrainingTest__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__TrainingTest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__TrainingTest__Group__1"


    // $ANTLR start "rule__TrainingTest__Group__1__Impl"
    // InternalMml.g:2101:1: rule__TrainingTest__Group__1__Impl : ( '{' ) ;
    public final void rule__TrainingTest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2105:1: ( ( '{' ) )
            // InternalMml.g:2106:1: ( '{' )
            {
            // InternalMml.g:2106:1: ( '{' )
            // InternalMml.g:2107:2: '{'
            {
             before(grammarAccess.getTrainingTestAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTrainingTestAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__TrainingTest__Group__1__Impl"


    // $ANTLR start "rule__TrainingTest__Group__2"
    // InternalMml.g:2116:1: rule__TrainingTest__Group__2 : rule__TrainingTest__Group__2__Impl rule__TrainingTest__Group__3 ;
    public final void rule__TrainingTest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2120:1: ( rule__TrainingTest__Group__2__Impl rule__TrainingTest__Group__3 )
            // InternalMml.g:2121:2: rule__TrainingTest__Group__2__Impl rule__TrainingTest__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__TrainingTest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__TrainingTest__Group__2"


    // $ANTLR start "rule__TrainingTest__Group__2__Impl"
    // InternalMml.g:2128:1: rule__TrainingTest__Group__2__Impl : ( 'pourcentageTraining' ) ;
    public final void rule__TrainingTest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2132:1: ( ( 'pourcentageTraining' ) )
            // InternalMml.g:2133:1: ( 'pourcentageTraining' )
            {
            // InternalMml.g:2133:1: ( 'pourcentageTraining' )
            // InternalMml.g:2134:2: 'pourcentageTraining'
            {
             before(grammarAccess.getTrainingTestAccess().getPourcentageTrainingKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTrainingTestAccess().getPourcentageTrainingKeyword_2()); 

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
    // $ANTLR end "rule__TrainingTest__Group__2__Impl"


    // $ANTLR start "rule__TrainingTest__Group__3"
    // InternalMml.g:2143:1: rule__TrainingTest__Group__3 : rule__TrainingTest__Group__3__Impl rule__TrainingTest__Group__4 ;
    public final void rule__TrainingTest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2147:1: ( rule__TrainingTest__Group__3__Impl rule__TrainingTest__Group__4 )
            // InternalMml.g:2148:2: rule__TrainingTest__Group__3__Impl rule__TrainingTest__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__TrainingTest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__TrainingTest__Group__3"


    // $ANTLR start "rule__TrainingTest__Group__3__Impl"
    // InternalMml.g:2155:1: rule__TrainingTest__Group__3__Impl : ( ( rule__TrainingTest__NumberAssignment_3 ) ) ;
    public final void rule__TrainingTest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2159:1: ( ( ( rule__TrainingTest__NumberAssignment_3 ) ) )
            // InternalMml.g:2160:1: ( ( rule__TrainingTest__NumberAssignment_3 ) )
            {
            // InternalMml.g:2160:1: ( ( rule__TrainingTest__NumberAssignment_3 ) )
            // InternalMml.g:2161:2: ( rule__TrainingTest__NumberAssignment_3 )
            {
             before(grammarAccess.getTrainingTestAccess().getNumberAssignment_3()); 
            // InternalMml.g:2162:2: ( rule__TrainingTest__NumberAssignment_3 )
            // InternalMml.g:2162:3: rule__TrainingTest__NumberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TrainingTest__NumberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTrainingTestAccess().getNumberAssignment_3()); 

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
    // $ANTLR end "rule__TrainingTest__Group__3__Impl"


    // $ANTLR start "rule__TrainingTest__Group__4"
    // InternalMml.g:2170:1: rule__TrainingTest__Group__4 : rule__TrainingTest__Group__4__Impl ;
    public final void rule__TrainingTest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2174:1: ( rule__TrainingTest__Group__4__Impl )
            // InternalMml.g:2175:2: rule__TrainingTest__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__TrainingTest__Group__4"


    // $ANTLR start "rule__TrainingTest__Group__4__Impl"
    // InternalMml.g:2181:1: rule__TrainingTest__Group__4__Impl : ( '}' ) ;
    public final void rule__TrainingTest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2185:1: ( ( '}' ) )
            // InternalMml.g:2186:1: ( '}' )
            {
            // InternalMml.g:2186:1: ( '}' )
            // InternalMml.g:2187:2: '}'
            {
             before(grammarAccess.getTrainingTestAccess().getRightCurlyBracketKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTrainingTestAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__TrainingTest__Group__4__Impl"


    // $ANTLR start "rule__MMLModel__InputAssignment_0"
    // InternalMml.g:2197:1: rule__MMLModel__InputAssignment_0 : ( ruleDataInput ) ;
    public final void rule__MMLModel__InputAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2201:1: ( ( ruleDataInput ) )
            // InternalMml.g:2202:2: ( ruleDataInput )
            {
            // InternalMml.g:2202:2: ( ruleDataInput )
            // InternalMml.g:2203:3: ruleDataInput
            {
             before(grammarAccess.getMMLModelAccess().getInputDataInputParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataInput();

            state._fsp--;

             after(grammarAccess.getMMLModelAccess().getInputDataInputParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__MMLModel__InputAssignment_0"


    // $ANTLR start "rule__MMLModel__AlgorithmAssignment_1"
    // InternalMml.g:2212:1: rule__MMLModel__AlgorithmAssignment_1 : ( ruleMLChoiceAlgorithm ) ;
    public final void rule__MMLModel__AlgorithmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2216:1: ( ( ruleMLChoiceAlgorithm ) )
            // InternalMml.g:2217:2: ( ruleMLChoiceAlgorithm )
            {
            // InternalMml.g:2217:2: ( ruleMLChoiceAlgorithm )
            // InternalMml.g:2218:3: ruleMLChoiceAlgorithm
            {
             before(grammarAccess.getMMLModelAccess().getAlgorithmMLChoiceAlgorithmParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMLChoiceAlgorithm();

            state._fsp--;

             after(grammarAccess.getMMLModelAccess().getAlgorithmMLChoiceAlgorithmParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MMLModel__AlgorithmAssignment_1"


    // $ANTLR start "rule__MMLModel__FormulaAssignment_2"
    // InternalMml.g:2227:1: rule__MMLModel__FormulaAssignment_2 : ( ruleRFormula ) ;
    public final void rule__MMLModel__FormulaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2231:1: ( ( ruleRFormula ) )
            // InternalMml.g:2232:2: ( ruleRFormula )
            {
            // InternalMml.g:2232:2: ( ruleRFormula )
            // InternalMml.g:2233:3: ruleRFormula
            {
             before(grammarAccess.getMMLModelAccess().getFormulaRFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRFormula();

            state._fsp--;

             after(grammarAccess.getMMLModelAccess().getFormulaRFormulaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MMLModel__FormulaAssignment_2"


    // $ANTLR start "rule__MMLModel__ValidationAssignment_3"
    // InternalMml.g:2242:1: rule__MMLModel__ValidationAssignment_3 : ( ruleValidation ) ;
    public final void rule__MMLModel__ValidationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2246:1: ( ( ruleValidation ) )
            // InternalMml.g:2247:2: ( ruleValidation )
            {
            // InternalMml.g:2247:2: ( ruleValidation )
            // InternalMml.g:2248:3: ruleValidation
            {
             before(grammarAccess.getMMLModelAccess().getValidationValidationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValidation();

            state._fsp--;

             after(grammarAccess.getMMLModelAccess().getValidationValidationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MMLModel__ValidationAssignment_3"


    // $ANTLR start "rule__DataInput__FilelocationAssignment_1"
    // InternalMml.g:2257:1: rule__DataInput__FilelocationAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DataInput__FilelocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2261:1: ( ( RULE_STRING ) )
            // InternalMml.g:2262:2: ( RULE_STRING )
            {
            // InternalMml.g:2262:2: ( RULE_STRING )
            // InternalMml.g:2263:3: RULE_STRING
            {
             before(grammarAccess.getDataInputAccess().getFilelocationSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataInputAccess().getFilelocationSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataInput__FilelocationAssignment_1"


    // $ANTLR start "rule__DataInput__ParsingInstructionAssignment_2"
    // InternalMml.g:2272:1: rule__DataInput__ParsingInstructionAssignment_2 : ( ruleCSVParsingConfiguration ) ;
    public final void rule__DataInput__ParsingInstructionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2276:1: ( ( ruleCSVParsingConfiguration ) )
            // InternalMml.g:2277:2: ( ruleCSVParsingConfiguration )
            {
            // InternalMml.g:2277:2: ( ruleCSVParsingConfiguration )
            // InternalMml.g:2278:3: ruleCSVParsingConfiguration
            {
             before(grammarAccess.getDataInputAccess().getParsingInstructionCSVParsingConfigurationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCSVParsingConfiguration();

            state._fsp--;

             after(grammarAccess.getDataInputAccess().getParsingInstructionCSVParsingConfigurationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DataInput__ParsingInstructionAssignment_2"


    // $ANTLR start "rule__CSVParsingConfiguration__SepAssignment_1"
    // InternalMml.g:2287:1: rule__CSVParsingConfiguration__SepAssignment_1 : ( ruleCSVSeparator ) ;
    public final void rule__CSVParsingConfiguration__SepAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2291:1: ( ( ruleCSVSeparator ) )
            // InternalMml.g:2292:2: ( ruleCSVSeparator )
            {
            // InternalMml.g:2292:2: ( ruleCSVSeparator )
            // InternalMml.g:2293:3: ruleCSVSeparator
            {
             before(grammarAccess.getCSVParsingConfigurationAccess().getSepCSVSeparatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCSVSeparator();

            state._fsp--;

             after(grammarAccess.getCSVParsingConfigurationAccess().getSepCSVSeparatorEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__CSVParsingConfiguration__SepAssignment_1"


    // $ANTLR start "rule__MLChoiceAlgorithm__FrameworkAssignment_1"
    // InternalMml.g:2302:1: rule__MLChoiceAlgorithm__FrameworkAssignment_1 : ( ruleFrameworkLang ) ;
    public final void rule__MLChoiceAlgorithm__FrameworkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2306:1: ( ( ruleFrameworkLang ) )
            // InternalMml.g:2307:2: ( ruleFrameworkLang )
            {
            // InternalMml.g:2307:2: ( ruleFrameworkLang )
            // InternalMml.g:2308:3: ruleFrameworkLang
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkFrameworkLangEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFrameworkLang();

            state._fsp--;

             after(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkFrameworkLangEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__MLChoiceAlgorithm__FrameworkAssignment_1"


    // $ANTLR start "rule__MLChoiceAlgorithm__AlgorithmAssignment_3"
    // InternalMml.g:2317:1: rule__MLChoiceAlgorithm__AlgorithmAssignment_3 : ( ruleMLAlgorithm ) ;
    public final void rule__MLChoiceAlgorithm__AlgorithmAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2321:1: ( ( ruleMLAlgorithm ) )
            // InternalMml.g:2322:2: ( ruleMLAlgorithm )
            {
            // InternalMml.g:2322:2: ( ruleMLAlgorithm )
            // InternalMml.g:2323:3: ruleMLAlgorithm
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmMLAlgorithmParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMLAlgorithm();

            state._fsp--;

             after(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmMLAlgorithmParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MLChoiceAlgorithm__AlgorithmAssignment_3"


    // $ANTLR start "rule__SVM__NameAssignment_0"
    // InternalMml.g:2332:1: rule__SVM__NameAssignment_0 : ( ( 'SVM' ) ) ;
    public final void rule__SVM__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2336:1: ( ( ( 'SVM' ) ) )
            // InternalMml.g:2337:2: ( ( 'SVM' ) )
            {
            // InternalMml.g:2337:2: ( ( 'SVM' ) )
            // InternalMml.g:2338:3: ( 'SVM' )
            {
             before(grammarAccess.getSVMAccess().getNameSVMKeyword_0_0()); 
            // InternalMml.g:2339:3: ( 'SVM' )
            // InternalMml.g:2340:4: 'SVM'
            {
             before(grammarAccess.getSVMAccess().getNameSVMKeyword_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSVMAccess().getNameSVMKeyword_0_0()); 

            }

             after(grammarAccess.getSVMAccess().getNameSVMKeyword_0_0()); 

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
    // $ANTLR end "rule__SVM__NameAssignment_0"


    // $ANTLR start "rule__SVM__GammaAssignment_1_1"
    // InternalMml.g:2351:1: rule__SVM__GammaAssignment_1_1 : ( ruleFLOAT ) ;
    public final void rule__SVM__GammaAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2355:1: ( ( ruleFLOAT ) )
            // InternalMml.g:2356:2: ( ruleFLOAT )
            {
            // InternalMml.g:2356:2: ( ruleFLOAT )
            // InternalMml.g:2357:3: ruleFLOAT
            {
             before(grammarAccess.getSVMAccess().getGammaFLOATParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSVMAccess().getGammaFLOATParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__SVM__GammaAssignment_1_1"


    // $ANTLR start "rule__SVM__CAssignment_2_1"
    // InternalMml.g:2366:1: rule__SVM__CAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__SVM__CAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2370:1: ( ( ruleFLOAT ) )
            // InternalMml.g:2371:2: ( ruleFLOAT )
            {
            // InternalMml.g:2371:2: ( ruleFLOAT )
            // InternalMml.g:2372:3: ruleFLOAT
            {
             before(grammarAccess.getSVMAccess().getCFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSVMAccess().getCFLOATParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__SVM__CAssignment_2_1"


    // $ANTLR start "rule__SVM__KernelAssignment_3_1"
    // InternalMml.g:2381:1: rule__SVM__KernelAssignment_3_1 : ( ruleSVMKernel ) ;
    public final void rule__SVM__KernelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2385:1: ( ( ruleSVMKernel ) )
            // InternalMml.g:2386:2: ( ruleSVMKernel )
            {
            // InternalMml.g:2386:2: ( ruleSVMKernel )
            // InternalMml.g:2387:3: ruleSVMKernel
            {
             before(grammarAccess.getSVMAccess().getKernelSVMKernelEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSVMKernel();

            state._fsp--;

             after(grammarAccess.getSVMAccess().getKernelSVMKernelEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__SVM__KernelAssignment_3_1"


    // $ANTLR start "rule__SVM__SvmclassificationAssignment_4_1"
    // InternalMml.g:2396:1: rule__SVM__SvmclassificationAssignment_4_1 : ( ruleSVMClassification ) ;
    public final void rule__SVM__SvmclassificationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2400:1: ( ( ruleSVMClassification ) )
            // InternalMml.g:2401:2: ( ruleSVMClassification )
            {
            // InternalMml.g:2401:2: ( ruleSVMClassification )
            // InternalMml.g:2402:3: ruleSVMClassification
            {
             before(grammarAccess.getSVMAccess().getSvmclassificationSVMClassificationEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSVMClassification();

            state._fsp--;

             after(grammarAccess.getSVMAccess().getSvmclassificationSVMClassificationEnumRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__SVM__SvmclassificationAssignment_4_1"


    // $ANTLR start "rule__DT__NameAssignment_0"
    // InternalMml.g:2411:1: rule__DT__NameAssignment_0 : ( ( 'DT' ) ) ;
    public final void rule__DT__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2415:1: ( ( ( 'DT' ) ) )
            // InternalMml.g:2416:2: ( ( 'DT' ) )
            {
            // InternalMml.g:2416:2: ( ( 'DT' ) )
            // InternalMml.g:2417:3: ( 'DT' )
            {
             before(grammarAccess.getDTAccess().getNameDTKeyword_0_0()); 
            // InternalMml.g:2418:3: ( 'DT' )
            // InternalMml.g:2419:4: 'DT'
            {
             before(grammarAccess.getDTAccess().getNameDTKeyword_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDTAccess().getNameDTKeyword_0_0()); 

            }

             after(grammarAccess.getDTAccess().getNameDTKeyword_0_0()); 

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
    // $ANTLR end "rule__DT__NameAssignment_0"


    // $ANTLR start "rule__DT__Max_depthAssignment_1"
    // InternalMml.g:2430:1: rule__DT__Max_depthAssignment_1 : ( RULE_INT ) ;
    public final void rule__DT__Max_depthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2434:1: ( ( RULE_INT ) )
            // InternalMml.g:2435:2: ( RULE_INT )
            {
            // InternalMml.g:2435:2: ( RULE_INT )
            // InternalMml.g:2436:3: RULE_INT
            {
             before(grammarAccess.getDTAccess().getMax_depthINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDTAccess().getMax_depthINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DT__Max_depthAssignment_1"


    // $ANTLR start "rule__RandomForest__NameAssignment"
    // InternalMml.g:2445:1: rule__RandomForest__NameAssignment : ( ( 'RandomForest' ) ) ;
    public final void rule__RandomForest__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2449:1: ( ( ( 'RandomForest' ) ) )
            // InternalMml.g:2450:2: ( ( 'RandomForest' ) )
            {
            // InternalMml.g:2450:2: ( ( 'RandomForest' ) )
            // InternalMml.g:2451:3: ( 'RandomForest' )
            {
             before(grammarAccess.getRandomForestAccess().getNameRandomForestKeyword_0()); 
            // InternalMml.g:2452:3: ( 'RandomForest' )
            // InternalMml.g:2453:4: 'RandomForest'
            {
             before(grammarAccess.getRandomForestAccess().getNameRandomForestKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getRandomForestAccess().getNameRandomForestKeyword_0()); 

            }

             after(grammarAccess.getRandomForestAccess().getNameRandomForestKeyword_0()); 

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
    // $ANTLR end "rule__RandomForest__NameAssignment"


    // $ANTLR start "rule__LogisticRegression__NameAssignment"
    // InternalMml.g:2464:1: rule__LogisticRegression__NameAssignment : ( ( 'LogisticRegression' ) ) ;
    public final void rule__LogisticRegression__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2468:1: ( ( ( 'LogisticRegression' ) ) )
            // InternalMml.g:2469:2: ( ( 'LogisticRegression' ) )
            {
            // InternalMml.g:2469:2: ( ( 'LogisticRegression' ) )
            // InternalMml.g:2470:3: ( 'LogisticRegression' )
            {
             before(grammarAccess.getLogisticRegressionAccess().getNameLogisticRegressionKeyword_0()); 
            // InternalMml.g:2471:3: ( 'LogisticRegression' )
            // InternalMml.g:2472:4: 'LogisticRegression'
            {
             before(grammarAccess.getLogisticRegressionAccess().getNameLogisticRegressionKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getLogisticRegressionAccess().getNameLogisticRegressionKeyword_0()); 

            }

             after(grammarAccess.getLogisticRegressionAccess().getNameLogisticRegressionKeyword_0()); 

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
    // $ANTLR end "rule__LogisticRegression__NameAssignment"


    // $ANTLR start "rule__RFormula__PredictiveAssignment_1_0"
    // InternalMml.g:2483:1: rule__RFormula__PredictiveAssignment_1_0 : ( ruleFormulaItem ) ;
    public final void rule__RFormula__PredictiveAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2487:1: ( ( ruleFormulaItem ) )
            // InternalMml.g:2488:2: ( ruleFormulaItem )
            {
            // InternalMml.g:2488:2: ( ruleFormulaItem )
            // InternalMml.g:2489:3: ruleFormulaItem
            {
             before(grammarAccess.getRFormulaAccess().getPredictiveFormulaItemParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFormulaItem();

            state._fsp--;

             after(grammarAccess.getRFormulaAccess().getPredictiveFormulaItemParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__RFormula__PredictiveAssignment_1_0"


    // $ANTLR start "rule__RFormula__PredictorsAssignment_2"
    // InternalMml.g:2498:1: rule__RFormula__PredictorsAssignment_2 : ( ruleXFormula ) ;
    public final void rule__RFormula__PredictorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2502:1: ( ( ruleXFormula ) )
            // InternalMml.g:2503:2: ( ruleXFormula )
            {
            // InternalMml.g:2503:2: ( ruleXFormula )
            // InternalMml.g:2504:3: ruleXFormula
            {
             before(grammarAccess.getRFormulaAccess().getPredictorsXFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;

             after(grammarAccess.getRFormulaAccess().getPredictorsXFormulaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RFormula__PredictorsAssignment_2"


    // $ANTLR start "rule__AllVariables__NameAssignment_0"
    // InternalMml.g:2513:1: rule__AllVariables__NameAssignment_0 : ( ( 'all' ) ) ;
    public final void rule__AllVariables__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2517:1: ( ( ( 'all' ) ) )
            // InternalMml.g:2518:2: ( ( 'all' ) )
            {
            // InternalMml.g:2518:2: ( ( 'all' ) )
            // InternalMml.g:2519:3: ( 'all' )
            {
             before(grammarAccess.getAllVariablesAccess().getNameAllKeyword_0_0()); 
            // InternalMml.g:2520:3: ( 'all' )
            // InternalMml.g:2521:4: 'all'
            {
             before(grammarAccess.getAllVariablesAccess().getNameAllKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAllVariablesAccess().getNameAllKeyword_0_0()); 

            }

             after(grammarAccess.getAllVariablesAccess().getNameAllKeyword_0_0()); 

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
    // $ANTLR end "rule__AllVariables__NameAssignment_0"


    // $ANTLR start "rule__AllVariables__AllAssignment_1"
    // InternalMml.g:2532:1: rule__AllVariables__AllAssignment_1 : ( ( '.' ) ) ;
    public final void rule__AllVariables__AllAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2536:1: ( ( ( '.' ) ) )
            // InternalMml.g:2537:2: ( ( '.' ) )
            {
            // InternalMml.g:2537:2: ( ( '.' ) )
            // InternalMml.g:2538:3: ( '.' )
            {
             before(grammarAccess.getAllVariablesAccess().getAllFullStopKeyword_1_0()); 
            // InternalMml.g:2539:3: ( '.' )
            // InternalMml.g:2540:4: '.'
            {
             before(grammarAccess.getAllVariablesAccess().getAllFullStopKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAllVariablesAccess().getAllFullStopKeyword_1_0()); 

            }

             after(grammarAccess.getAllVariablesAccess().getAllFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__AllVariables__AllAssignment_1"


    // $ANTLR start "rule__PredictorVariables__NameAssignment_0"
    // InternalMml.g:2551:1: rule__PredictorVariables__NameAssignment_0 : ( ( 'PredictorVariables' ) ) ;
    public final void rule__PredictorVariables__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2555:1: ( ( ( 'PredictorVariables' ) ) )
            // InternalMml.g:2556:2: ( ( 'PredictorVariables' ) )
            {
            // InternalMml.g:2556:2: ( ( 'PredictorVariables' ) )
            // InternalMml.g:2557:3: ( 'PredictorVariables' )
            {
             before(grammarAccess.getPredictorVariablesAccess().getNamePredictorVariablesKeyword_0_0()); 
            // InternalMml.g:2558:3: ( 'PredictorVariables' )
            // InternalMml.g:2559:4: 'PredictorVariables'
            {
             before(grammarAccess.getPredictorVariablesAccess().getNamePredictorVariablesKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPredictorVariablesAccess().getNamePredictorVariablesKeyword_0_0()); 

            }

             after(grammarAccess.getPredictorVariablesAccess().getNamePredictorVariablesKeyword_0_0()); 

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
    // $ANTLR end "rule__PredictorVariables__NameAssignment_0"


    // $ANTLR start "rule__PredictorVariables__VarsAssignment_1_0"
    // InternalMml.g:2570:1: rule__PredictorVariables__VarsAssignment_1_0 : ( ruleFormulaItem ) ;
    public final void rule__PredictorVariables__VarsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2574:1: ( ( ruleFormulaItem ) )
            // InternalMml.g:2575:2: ( ruleFormulaItem )
            {
            // InternalMml.g:2575:2: ( ruleFormulaItem )
            // InternalMml.g:2576:3: ruleFormulaItem
            {
             before(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFormulaItem();

            state._fsp--;

             after(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__PredictorVariables__VarsAssignment_1_0"


    // $ANTLR start "rule__PredictorVariables__VarsAssignment_1_1_1"
    // InternalMml.g:2585:1: rule__PredictorVariables__VarsAssignment_1_1_1 : ( ruleFormulaItem ) ;
    public final void rule__PredictorVariables__VarsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2589:1: ( ( ruleFormulaItem ) )
            // InternalMml.g:2590:2: ( ruleFormulaItem )
            {
            // InternalMml.g:2590:2: ( ruleFormulaItem )
            // InternalMml.g:2591:3: ruleFormulaItem
            {
             before(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormulaItem();

            state._fsp--;

             after(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__PredictorVariables__VarsAssignment_1_1_1"


    // $ANTLR start "rule__FormulaItem__ColumnAssignment_0"
    // InternalMml.g:2600:1: rule__FormulaItem__ColumnAssignment_0 : ( RULE_INT ) ;
    public final void rule__FormulaItem__ColumnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2604:1: ( ( RULE_INT ) )
            // InternalMml.g:2605:2: ( RULE_INT )
            {
            // InternalMml.g:2605:2: ( RULE_INT )
            // InternalMml.g:2606:3: RULE_INT
            {
             before(grammarAccess.getFormulaItemAccess().getColumnINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFormulaItemAccess().getColumnINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__FormulaItem__ColumnAssignment_0"


    // $ANTLR start "rule__FormulaItem__ColNameAssignment_1"
    // InternalMml.g:2615:1: rule__FormulaItem__ColNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FormulaItem__ColNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2619:1: ( ( RULE_STRING ) )
            // InternalMml.g:2620:2: ( RULE_STRING )
            {
            // InternalMml.g:2620:2: ( RULE_STRING )
            // InternalMml.g:2621:3: RULE_STRING
            {
             before(grammarAccess.getFormulaItemAccess().getColNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFormulaItemAccess().getColNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FormulaItem__ColNameAssignment_1"


    // $ANTLR start "rule__Validation__StratificationAssignment_0"
    // InternalMml.g:2630:1: rule__Validation__StratificationAssignment_0 : ( ruleStratificationMethod ) ;
    public final void rule__Validation__StratificationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2634:1: ( ( ruleStratificationMethod ) )
            // InternalMml.g:2635:2: ( ruleStratificationMethod )
            {
            // InternalMml.g:2635:2: ( ruleStratificationMethod )
            // InternalMml.g:2636:3: ruleStratificationMethod
            {
             before(grammarAccess.getValidationAccess().getStratificationStratificationMethodParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStratificationMethod();

            state._fsp--;

             after(grammarAccess.getValidationAccess().getStratificationStratificationMethodParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Validation__StratificationAssignment_0"


    // $ANTLR start "rule__Validation__MetricAssignment_1"
    // InternalMml.g:2645:1: rule__Validation__MetricAssignment_1 : ( ruleValidationMetric ) ;
    public final void rule__Validation__MetricAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2649:1: ( ( ruleValidationMetric ) )
            // InternalMml.g:2650:2: ( ruleValidationMetric )
            {
            // InternalMml.g:2650:2: ( ruleValidationMetric )
            // InternalMml.g:2651:3: ruleValidationMetric
            {
             before(grammarAccess.getValidationAccess().getMetricValidationMetricEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValidationMetric();

            state._fsp--;

             after(grammarAccess.getValidationAccess().getMetricValidationMetricEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Validation__MetricAssignment_1"


    // $ANTLR start "rule__TrainingTest__NameAssignment_0"
    // InternalMml.g:2660:1: rule__TrainingTest__NameAssignment_0 : ( ( 'TrainingTest' ) ) ;
    public final void rule__TrainingTest__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2664:1: ( ( ( 'TrainingTest' ) ) )
            // InternalMml.g:2665:2: ( ( 'TrainingTest' ) )
            {
            // InternalMml.g:2665:2: ( ( 'TrainingTest' ) )
            // InternalMml.g:2666:3: ( 'TrainingTest' )
            {
             before(grammarAccess.getTrainingTestAccess().getNameTrainingTestKeyword_0_0()); 
            // InternalMml.g:2667:3: ( 'TrainingTest' )
            // InternalMml.g:2668:4: 'TrainingTest'
            {
             before(grammarAccess.getTrainingTestAccess().getNameTrainingTestKeyword_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTrainingTestAccess().getNameTrainingTestKeyword_0_0()); 

            }

             after(grammarAccess.getTrainingTestAccess().getNameTrainingTestKeyword_0_0()); 

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
    // $ANTLR end "rule__TrainingTest__NameAssignment_0"


    // $ANTLR start "rule__TrainingTest__NumberAssignment_3"
    // InternalMml.g:2679:1: rule__TrainingTest__NumberAssignment_3 : ( ruleFLOAT ) ;
    public final void rule__TrainingTest__NumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2683:1: ( ( ruleFLOAT ) )
            // InternalMml.g:2684:2: ( ruleFLOAT )
            {
            // InternalMml.g:2684:2: ( ruleFLOAT )
            // InternalMml.g:2685:3: ruleFLOAT
            {
             before(grammarAccess.getTrainingTestAccess().getNumberFLOATParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getTrainingTestAccess().getNumberFLOATParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__TrainingTest__NumberAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00001E0000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000600000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});

}