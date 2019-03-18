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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "';'", "'scikit-learn'", "'R'", "'linear'", "'polynomial'", "'radial'", "'C-classification'", "'nu-classification'", "'one-classification'", "'binomial'", "'gaussian'", "'poisson'", "'recall'", "'precision'", "'F1'", "'Model:'", "'End.'", "'datainput'", "'separator'", "'mlframework'", "'algorithm'", "'gamma='", "'C='", "'kernel='", "'classification'", "'class='", "'.'", "'formula'", "'~'", "'+'", "'{'", "'pourcentageTraining'", "'}'", "'SVM'", "'DT'", "'RandomForest'", "'LogisticRegression'", "'all'", "'PredictorVariables'", "'TrainingTest'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=6;
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
    public static final int T__48=48;
    public static final int T__49=49;
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


    // $ANTLR start "entryRulePREAMBULE"
    // InternalMml.g:78:1: entryRulePREAMBULE : rulePREAMBULE EOF ;
    public final void entryRulePREAMBULE() throws RecognitionException {
        try {
            // InternalMml.g:79:1: ( rulePREAMBULE EOF )
            // InternalMml.g:80:1: rulePREAMBULE EOF
            {
             before(grammarAccess.getPREAMBULERule()); 
            pushFollow(FOLLOW_1);
            rulePREAMBULE();

            state._fsp--;

             after(grammarAccess.getPREAMBULERule()); 
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
    // $ANTLR end "entryRulePREAMBULE"


    // $ANTLR start "rulePREAMBULE"
    // InternalMml.g:87:1: rulePREAMBULE : ( ( rule__PREAMBULE__NomProgrammeAssignment ) ) ;
    public final void rulePREAMBULE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:91:2: ( ( ( rule__PREAMBULE__NomProgrammeAssignment ) ) )
            // InternalMml.g:92:2: ( ( rule__PREAMBULE__NomProgrammeAssignment ) )
            {
            // InternalMml.g:92:2: ( ( rule__PREAMBULE__NomProgrammeAssignment ) )
            // InternalMml.g:93:3: ( rule__PREAMBULE__NomProgrammeAssignment )
            {
             before(grammarAccess.getPREAMBULEAccess().getNomProgrammeAssignment()); 
            // InternalMml.g:94:3: ( rule__PREAMBULE__NomProgrammeAssignment )
            // InternalMml.g:94:4: rule__PREAMBULE__NomProgrammeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PREAMBULE__NomProgrammeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPREAMBULEAccess().getNomProgrammeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePREAMBULE"


    // $ANTLR start "entryRuleDataInput"
    // InternalMml.g:103:1: entryRuleDataInput : ruleDataInput EOF ;
    public final void entryRuleDataInput() throws RecognitionException {
        try {
            // InternalMml.g:104:1: ( ruleDataInput EOF )
            // InternalMml.g:105:1: ruleDataInput EOF
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
    // InternalMml.g:112:1: ruleDataInput : ( ( rule__DataInput__Group__0 ) ) ;
    public final void ruleDataInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:116:2: ( ( ( rule__DataInput__Group__0 ) ) )
            // InternalMml.g:117:2: ( ( rule__DataInput__Group__0 ) )
            {
            // InternalMml.g:117:2: ( ( rule__DataInput__Group__0 ) )
            // InternalMml.g:118:3: ( rule__DataInput__Group__0 )
            {
             before(grammarAccess.getDataInputAccess().getGroup()); 
            // InternalMml.g:119:3: ( rule__DataInput__Group__0 )
            // InternalMml.g:119:4: rule__DataInput__Group__0
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
    // InternalMml.g:128:1: entryRuleCSVParsingConfiguration : ruleCSVParsingConfiguration EOF ;
    public final void entryRuleCSVParsingConfiguration() throws RecognitionException {
        try {
            // InternalMml.g:129:1: ( ruleCSVParsingConfiguration EOF )
            // InternalMml.g:130:1: ruleCSVParsingConfiguration EOF
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
    // InternalMml.g:137:1: ruleCSVParsingConfiguration : ( ( rule__CSVParsingConfiguration__Group__0 ) ) ;
    public final void ruleCSVParsingConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:141:2: ( ( ( rule__CSVParsingConfiguration__Group__0 ) ) )
            // InternalMml.g:142:2: ( ( rule__CSVParsingConfiguration__Group__0 ) )
            {
            // InternalMml.g:142:2: ( ( rule__CSVParsingConfiguration__Group__0 ) )
            // InternalMml.g:143:3: ( rule__CSVParsingConfiguration__Group__0 )
            {
             before(grammarAccess.getCSVParsingConfigurationAccess().getGroup()); 
            // InternalMml.g:144:3: ( rule__CSVParsingConfiguration__Group__0 )
            // InternalMml.g:144:4: rule__CSVParsingConfiguration__Group__0
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
    // InternalMml.g:153:1: entryRuleMLChoiceAlgorithm : ruleMLChoiceAlgorithm EOF ;
    public final void entryRuleMLChoiceAlgorithm() throws RecognitionException {
        try {
            // InternalMml.g:154:1: ( ruleMLChoiceAlgorithm EOF )
            // InternalMml.g:155:1: ruleMLChoiceAlgorithm EOF
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
    // InternalMml.g:162:1: ruleMLChoiceAlgorithm : ( ( rule__MLChoiceAlgorithm__Group__0 ) ) ;
    public final void ruleMLChoiceAlgorithm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:166:2: ( ( ( rule__MLChoiceAlgorithm__Group__0 ) ) )
            // InternalMml.g:167:2: ( ( rule__MLChoiceAlgorithm__Group__0 ) )
            {
            // InternalMml.g:167:2: ( ( rule__MLChoiceAlgorithm__Group__0 ) )
            // InternalMml.g:168:3: ( rule__MLChoiceAlgorithm__Group__0 )
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getGroup()); 
            // InternalMml.g:169:3: ( rule__MLChoiceAlgorithm__Group__0 )
            // InternalMml.g:169:4: rule__MLChoiceAlgorithm__Group__0
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
    // InternalMml.g:178:1: entryRuleMLAlgorithm : ruleMLAlgorithm EOF ;
    public final void entryRuleMLAlgorithm() throws RecognitionException {
        try {
            // InternalMml.g:179:1: ( ruleMLAlgorithm EOF )
            // InternalMml.g:180:1: ruleMLAlgorithm EOF
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
    // InternalMml.g:187:1: ruleMLAlgorithm : ( ( rule__MLAlgorithm__Alternatives ) ) ;
    public final void ruleMLAlgorithm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:191:2: ( ( ( rule__MLAlgorithm__Alternatives ) ) )
            // InternalMml.g:192:2: ( ( rule__MLAlgorithm__Alternatives ) )
            {
            // InternalMml.g:192:2: ( ( rule__MLAlgorithm__Alternatives ) )
            // InternalMml.g:193:3: ( rule__MLAlgorithm__Alternatives )
            {
             before(grammarAccess.getMLAlgorithmAccess().getAlternatives()); 
            // InternalMml.g:194:3: ( rule__MLAlgorithm__Alternatives )
            // InternalMml.g:194:4: rule__MLAlgorithm__Alternatives
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
    // InternalMml.g:203:1: entryRuleSVM : ruleSVM EOF ;
    public final void entryRuleSVM() throws RecognitionException {
        try {
            // InternalMml.g:204:1: ( ruleSVM EOF )
            // InternalMml.g:205:1: ruleSVM EOF
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
    // InternalMml.g:212:1: ruleSVM : ( ( rule__SVM__Group__0 ) ) ;
    public final void ruleSVM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:216:2: ( ( ( rule__SVM__Group__0 ) ) )
            // InternalMml.g:217:2: ( ( rule__SVM__Group__0 ) )
            {
            // InternalMml.g:217:2: ( ( rule__SVM__Group__0 ) )
            // InternalMml.g:218:3: ( rule__SVM__Group__0 )
            {
             before(grammarAccess.getSVMAccess().getGroup()); 
            // InternalMml.g:219:3: ( rule__SVM__Group__0 )
            // InternalMml.g:219:4: rule__SVM__Group__0
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
    // InternalMml.g:228:1: entryRuleDT : ruleDT EOF ;
    public final void entryRuleDT() throws RecognitionException {
        try {
            // InternalMml.g:229:1: ( ruleDT EOF )
            // InternalMml.g:230:1: ruleDT EOF
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
    // InternalMml.g:237:1: ruleDT : ( ( rule__DT__Group__0 ) ) ;
    public final void ruleDT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:241:2: ( ( ( rule__DT__Group__0 ) ) )
            // InternalMml.g:242:2: ( ( rule__DT__Group__0 ) )
            {
            // InternalMml.g:242:2: ( ( rule__DT__Group__0 ) )
            // InternalMml.g:243:3: ( rule__DT__Group__0 )
            {
             before(grammarAccess.getDTAccess().getGroup()); 
            // InternalMml.g:244:3: ( rule__DT__Group__0 )
            // InternalMml.g:244:4: rule__DT__Group__0
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
    // InternalMml.g:253:1: entryRuleRandomForest : ruleRandomForest EOF ;
    public final void entryRuleRandomForest() throws RecognitionException {
        try {
            // InternalMml.g:254:1: ( ruleRandomForest EOF )
            // InternalMml.g:255:1: ruleRandomForest EOF
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
    // InternalMml.g:262:1: ruleRandomForest : ( ( rule__RandomForest__Group__0 ) ) ;
    public final void ruleRandomForest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:266:2: ( ( ( rule__RandomForest__Group__0 ) ) )
            // InternalMml.g:267:2: ( ( rule__RandomForest__Group__0 ) )
            {
            // InternalMml.g:267:2: ( ( rule__RandomForest__Group__0 ) )
            // InternalMml.g:268:3: ( rule__RandomForest__Group__0 )
            {
             before(grammarAccess.getRandomForestAccess().getGroup()); 
            // InternalMml.g:269:3: ( rule__RandomForest__Group__0 )
            // InternalMml.g:269:4: rule__RandomForest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RandomForest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRandomForestAccess().getGroup()); 

            }


            }

        }
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
    // InternalMml.g:278:1: entryRuleLogisticRegression : ruleLogisticRegression EOF ;
    public final void entryRuleLogisticRegression() throws RecognitionException {
        try {
            // InternalMml.g:279:1: ( ruleLogisticRegression EOF )
            // InternalMml.g:280:1: ruleLogisticRegression EOF
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
    // InternalMml.g:287:1: ruleLogisticRegression : ( ( rule__LogisticRegression__Group__0 ) ) ;
    public final void ruleLogisticRegression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:291:2: ( ( ( rule__LogisticRegression__Group__0 ) ) )
            // InternalMml.g:292:2: ( ( rule__LogisticRegression__Group__0 ) )
            {
            // InternalMml.g:292:2: ( ( rule__LogisticRegression__Group__0 ) )
            // InternalMml.g:293:3: ( rule__LogisticRegression__Group__0 )
            {
             before(grammarAccess.getLogisticRegressionAccess().getGroup()); 
            // InternalMml.g:294:3: ( rule__LogisticRegression__Group__0 )
            // InternalMml.g:294:4: rule__LogisticRegression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogisticRegression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogisticRegressionAccess().getGroup()); 

            }


            }

        }
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
    // InternalMml.g:303:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalMml.g:304:1: ( ruleFLOAT EOF )
            // InternalMml.g:305:1: ruleFLOAT EOF
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
    // InternalMml.g:312:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:316:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalMml.g:317:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalMml.g:317:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalMml.g:318:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalMml.g:319:3: ( rule__FLOAT__Group__0 )
            // InternalMml.g:319:4: rule__FLOAT__Group__0
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
    // InternalMml.g:328:1: entryRuleRFormula : ruleRFormula EOF ;
    public final void entryRuleRFormula() throws RecognitionException {
        try {
            // InternalMml.g:329:1: ( ruleRFormula EOF )
            // InternalMml.g:330:1: ruleRFormula EOF
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
    // InternalMml.g:337:1: ruleRFormula : ( ( rule__RFormula__Group__0 ) ) ;
    public final void ruleRFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:341:2: ( ( ( rule__RFormula__Group__0 ) ) )
            // InternalMml.g:342:2: ( ( rule__RFormula__Group__0 ) )
            {
            // InternalMml.g:342:2: ( ( rule__RFormula__Group__0 ) )
            // InternalMml.g:343:3: ( rule__RFormula__Group__0 )
            {
             before(grammarAccess.getRFormulaAccess().getGroup()); 
            // InternalMml.g:344:3: ( rule__RFormula__Group__0 )
            // InternalMml.g:344:4: rule__RFormula__Group__0
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
    // InternalMml.g:353:1: entryRuleXFormula : ruleXFormula EOF ;
    public final void entryRuleXFormula() throws RecognitionException {
        try {
            // InternalMml.g:354:1: ( ruleXFormula EOF )
            // InternalMml.g:355:1: ruleXFormula EOF
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
    // InternalMml.g:362:1: ruleXFormula : ( ( rule__XFormula__Alternatives ) ) ;
    public final void ruleXFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:366:2: ( ( ( rule__XFormula__Alternatives ) ) )
            // InternalMml.g:367:2: ( ( rule__XFormula__Alternatives ) )
            {
            // InternalMml.g:367:2: ( ( rule__XFormula__Alternatives ) )
            // InternalMml.g:368:3: ( rule__XFormula__Alternatives )
            {
             before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            // InternalMml.g:369:3: ( rule__XFormula__Alternatives )
            // InternalMml.g:369:4: rule__XFormula__Alternatives
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
    // InternalMml.g:378:1: entryRuleAllVariables : ruleAllVariables EOF ;
    public final void entryRuleAllVariables() throws RecognitionException {
        try {
            // InternalMml.g:379:1: ( ruleAllVariables EOF )
            // InternalMml.g:380:1: ruleAllVariables EOF
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
    // InternalMml.g:387:1: ruleAllVariables : ( ( rule__AllVariables__Group__0 ) ) ;
    public final void ruleAllVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:391:2: ( ( ( rule__AllVariables__Group__0 ) ) )
            // InternalMml.g:392:2: ( ( rule__AllVariables__Group__0 ) )
            {
            // InternalMml.g:392:2: ( ( rule__AllVariables__Group__0 ) )
            // InternalMml.g:393:3: ( rule__AllVariables__Group__0 )
            {
             before(grammarAccess.getAllVariablesAccess().getGroup()); 
            // InternalMml.g:394:3: ( rule__AllVariables__Group__0 )
            // InternalMml.g:394:4: rule__AllVariables__Group__0
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
    // InternalMml.g:403:1: entryRulePredictorVariables : rulePredictorVariables EOF ;
    public final void entryRulePredictorVariables() throws RecognitionException {
        try {
            // InternalMml.g:404:1: ( rulePredictorVariables EOF )
            // InternalMml.g:405:1: rulePredictorVariables EOF
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
    // InternalMml.g:412:1: rulePredictorVariables : ( ( rule__PredictorVariables__Group__0 ) ) ;
    public final void rulePredictorVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:416:2: ( ( ( rule__PredictorVariables__Group__0 ) ) )
            // InternalMml.g:417:2: ( ( rule__PredictorVariables__Group__0 ) )
            {
            // InternalMml.g:417:2: ( ( rule__PredictorVariables__Group__0 ) )
            // InternalMml.g:418:3: ( rule__PredictorVariables__Group__0 )
            {
             before(grammarAccess.getPredictorVariablesAccess().getGroup()); 
            // InternalMml.g:419:3: ( rule__PredictorVariables__Group__0 )
            // InternalMml.g:419:4: rule__PredictorVariables__Group__0
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
    // InternalMml.g:428:1: entryRuleFormulaItem : ruleFormulaItem EOF ;
    public final void entryRuleFormulaItem() throws RecognitionException {
        try {
            // InternalMml.g:429:1: ( ruleFormulaItem EOF )
            // InternalMml.g:430:1: ruleFormulaItem EOF
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
    // InternalMml.g:437:1: ruleFormulaItem : ( ( rule__FormulaItem__Alternatives ) ) ;
    public final void ruleFormulaItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:441:2: ( ( ( rule__FormulaItem__Alternatives ) ) )
            // InternalMml.g:442:2: ( ( rule__FormulaItem__Alternatives ) )
            {
            // InternalMml.g:442:2: ( ( rule__FormulaItem__Alternatives ) )
            // InternalMml.g:443:3: ( rule__FormulaItem__Alternatives )
            {
             before(grammarAccess.getFormulaItemAccess().getAlternatives()); 
            // InternalMml.g:444:3: ( rule__FormulaItem__Alternatives )
            // InternalMml.g:444:4: rule__FormulaItem__Alternatives
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
    // InternalMml.g:453:1: entryRuleValidation : ruleValidation EOF ;
    public final void entryRuleValidation() throws RecognitionException {
        try {
            // InternalMml.g:454:1: ( ruleValidation EOF )
            // InternalMml.g:455:1: ruleValidation EOF
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
    // InternalMml.g:462:1: ruleValidation : ( ( rule__Validation__Group__0 ) ) ;
    public final void ruleValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:466:2: ( ( ( rule__Validation__Group__0 ) ) )
            // InternalMml.g:467:2: ( ( rule__Validation__Group__0 ) )
            {
            // InternalMml.g:467:2: ( ( rule__Validation__Group__0 ) )
            // InternalMml.g:468:3: ( rule__Validation__Group__0 )
            {
             before(grammarAccess.getValidationAccess().getGroup()); 
            // InternalMml.g:469:3: ( rule__Validation__Group__0 )
            // InternalMml.g:469:4: rule__Validation__Group__0
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
    // InternalMml.g:478:1: entryRuleStratificationMethod : ruleStratificationMethod EOF ;
    public final void entryRuleStratificationMethod() throws RecognitionException {
        try {
            // InternalMml.g:479:1: ( ruleStratificationMethod EOF )
            // InternalMml.g:480:1: ruleStratificationMethod EOF
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
    // InternalMml.g:487:1: ruleStratificationMethod : ( ruleTrainingTest ) ;
    public final void ruleStratificationMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:491:2: ( ( ruleTrainingTest ) )
            // InternalMml.g:492:2: ( ruleTrainingTest )
            {
            // InternalMml.g:492:2: ( ruleTrainingTest )
            // InternalMml.g:493:3: ruleTrainingTest
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
    // InternalMml.g:503:1: entryRuleTrainingTest : ruleTrainingTest EOF ;
    public final void entryRuleTrainingTest() throws RecognitionException {
        try {
            // InternalMml.g:504:1: ( ruleTrainingTest EOF )
            // InternalMml.g:505:1: ruleTrainingTest EOF
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
    // InternalMml.g:512:1: ruleTrainingTest : ( ( rule__TrainingTest__Group__0 ) ) ;
    public final void ruleTrainingTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:516:2: ( ( ( rule__TrainingTest__Group__0 ) ) )
            // InternalMml.g:517:2: ( ( rule__TrainingTest__Group__0 ) )
            {
            // InternalMml.g:517:2: ( ( rule__TrainingTest__Group__0 ) )
            // InternalMml.g:518:3: ( rule__TrainingTest__Group__0 )
            {
             before(grammarAccess.getTrainingTestAccess().getGroup()); 
            // InternalMml.g:519:3: ( rule__TrainingTest__Group__0 )
            // InternalMml.g:519:4: rule__TrainingTest__Group__0
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
    // InternalMml.g:528:1: ruleCSVSeparator : ( ( rule__CSVSeparator__Alternatives ) ) ;
    public final void ruleCSVSeparator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:532:1: ( ( ( rule__CSVSeparator__Alternatives ) ) )
            // InternalMml.g:533:2: ( ( rule__CSVSeparator__Alternatives ) )
            {
            // InternalMml.g:533:2: ( ( rule__CSVSeparator__Alternatives ) )
            // InternalMml.g:534:3: ( rule__CSVSeparator__Alternatives )
            {
             before(grammarAccess.getCSVSeparatorAccess().getAlternatives()); 
            // InternalMml.g:535:3: ( rule__CSVSeparator__Alternatives )
            // InternalMml.g:535:4: rule__CSVSeparator__Alternatives
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
    // InternalMml.g:544:1: ruleFrameworkLang : ( ( rule__FrameworkLang__Alternatives ) ) ;
    public final void ruleFrameworkLang() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:548:1: ( ( ( rule__FrameworkLang__Alternatives ) ) )
            // InternalMml.g:549:2: ( ( rule__FrameworkLang__Alternatives ) )
            {
            // InternalMml.g:549:2: ( ( rule__FrameworkLang__Alternatives ) )
            // InternalMml.g:550:3: ( rule__FrameworkLang__Alternatives )
            {
             before(grammarAccess.getFrameworkLangAccess().getAlternatives()); 
            // InternalMml.g:551:3: ( rule__FrameworkLang__Alternatives )
            // InternalMml.g:551:4: rule__FrameworkLang__Alternatives
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
    // InternalMml.g:560:1: ruleSVMKernel : ( ( rule__SVMKernel__Alternatives ) ) ;
    public final void ruleSVMKernel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:564:1: ( ( ( rule__SVMKernel__Alternatives ) ) )
            // InternalMml.g:565:2: ( ( rule__SVMKernel__Alternatives ) )
            {
            // InternalMml.g:565:2: ( ( rule__SVMKernel__Alternatives ) )
            // InternalMml.g:566:3: ( rule__SVMKernel__Alternatives )
            {
             before(grammarAccess.getSVMKernelAccess().getAlternatives()); 
            // InternalMml.g:567:3: ( rule__SVMKernel__Alternatives )
            // InternalMml.g:567:4: rule__SVMKernel__Alternatives
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
    // InternalMml.g:576:1: ruleSVMClassification : ( ( rule__SVMClassification__Alternatives ) ) ;
    public final void ruleSVMClassification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:580:1: ( ( ( rule__SVMClassification__Alternatives ) ) )
            // InternalMml.g:581:2: ( ( rule__SVMClassification__Alternatives ) )
            {
            // InternalMml.g:581:2: ( ( rule__SVMClassification__Alternatives ) )
            // InternalMml.g:582:3: ( rule__SVMClassification__Alternatives )
            {
             before(grammarAccess.getSVMClassificationAccess().getAlternatives()); 
            // InternalMml.g:583:3: ( rule__SVMClassification__Alternatives )
            // InternalMml.g:583:4: rule__SVMClassification__Alternatives
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


    // $ANTLR start "ruleCLASS"
    // InternalMml.g:592:1: ruleCLASS : ( ( rule__CLASS__Alternatives ) ) ;
    public final void ruleCLASS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:596:1: ( ( ( rule__CLASS__Alternatives ) ) )
            // InternalMml.g:597:2: ( ( rule__CLASS__Alternatives ) )
            {
            // InternalMml.g:597:2: ( ( rule__CLASS__Alternatives ) )
            // InternalMml.g:598:3: ( rule__CLASS__Alternatives )
            {
             before(grammarAccess.getCLASSAccess().getAlternatives()); 
            // InternalMml.g:599:3: ( rule__CLASS__Alternatives )
            // InternalMml.g:599:4: rule__CLASS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CLASS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCLASSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCLASS"


    // $ANTLR start "ruleValidationMetric"
    // InternalMml.g:608:1: ruleValidationMetric : ( ( rule__ValidationMetric__Alternatives ) ) ;
    public final void ruleValidationMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:612:1: ( ( ( rule__ValidationMetric__Alternatives ) ) )
            // InternalMml.g:613:2: ( ( rule__ValidationMetric__Alternatives ) )
            {
            // InternalMml.g:613:2: ( ( rule__ValidationMetric__Alternatives ) )
            // InternalMml.g:614:3: ( rule__ValidationMetric__Alternatives )
            {
             before(grammarAccess.getValidationMetricAccess().getAlternatives()); 
            // InternalMml.g:615:3: ( rule__ValidationMetric__Alternatives )
            // InternalMml.g:615:4: rule__ValidationMetric__Alternatives
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
    // InternalMml.g:623:1: rule__MLAlgorithm__Alternatives : ( ( ruleSVM ) | ( ruleDT ) | ( ruleRandomForest ) | ( ruleLogisticRegression ) );
    public final void rule__MLAlgorithm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:627:1: ( ( ruleSVM ) | ( ruleDT ) | ( ruleRandomForest ) | ( ruleLogisticRegression ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt1=1;
                }
                break;
            case 46:
                {
                alt1=2;
                }
                break;
            case 47:
                {
                alt1=3;
                }
                break;
            case 48:
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
                    // InternalMml.g:628:2: ( ruleSVM )
                    {
                    // InternalMml.g:628:2: ( ruleSVM )
                    // InternalMml.g:629:3: ruleSVM
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
                    // InternalMml.g:634:2: ( ruleDT )
                    {
                    // InternalMml.g:634:2: ( ruleDT )
                    // InternalMml.g:635:3: ruleDT
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
                    // InternalMml.g:640:2: ( ruleRandomForest )
                    {
                    // InternalMml.g:640:2: ( ruleRandomForest )
                    // InternalMml.g:641:3: ruleRandomForest
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
                    // InternalMml.g:646:2: ( ruleLogisticRegression )
                    {
                    // InternalMml.g:646:2: ( ruleLogisticRegression )
                    // InternalMml.g:647:3: ruleLogisticRegression
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
    // InternalMml.g:656:1: rule__XFormula__Alternatives : ( ( ruleAllVariables ) | ( rulePredictorVariables ) );
    public final void rule__XFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:660:1: ( ( ruleAllVariables ) | ( rulePredictorVariables ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==49) ) {
                alt2=1;
            }
            else if ( (LA2_0==50) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMml.g:661:2: ( ruleAllVariables )
                    {
                    // InternalMml.g:661:2: ( ruleAllVariables )
                    // InternalMml.g:662:3: ruleAllVariables
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
                    // InternalMml.g:667:2: ( rulePredictorVariables )
                    {
                    // InternalMml.g:667:2: ( rulePredictorVariables )
                    // InternalMml.g:668:3: rulePredictorVariables
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
    // InternalMml.g:677:1: rule__FormulaItem__Alternatives : ( ( ( rule__FormulaItem__ColumnAssignment_0 ) ) | ( ( rule__FormulaItem__ColNameAssignment_1 ) ) );
    public final void rule__FormulaItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:681:1: ( ( ( rule__FormulaItem__ColumnAssignment_0 ) ) | ( ( rule__FormulaItem__ColNameAssignment_1 ) ) )
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
                    // InternalMml.g:682:2: ( ( rule__FormulaItem__ColumnAssignment_0 ) )
                    {
                    // InternalMml.g:682:2: ( ( rule__FormulaItem__ColumnAssignment_0 ) )
                    // InternalMml.g:683:3: ( rule__FormulaItem__ColumnAssignment_0 )
                    {
                     before(grammarAccess.getFormulaItemAccess().getColumnAssignment_0()); 
                    // InternalMml.g:684:3: ( rule__FormulaItem__ColumnAssignment_0 )
                    // InternalMml.g:684:4: rule__FormulaItem__ColumnAssignment_0
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
                    // InternalMml.g:688:2: ( ( rule__FormulaItem__ColNameAssignment_1 ) )
                    {
                    // InternalMml.g:688:2: ( ( rule__FormulaItem__ColNameAssignment_1 ) )
                    // InternalMml.g:689:3: ( rule__FormulaItem__ColNameAssignment_1 )
                    {
                     before(grammarAccess.getFormulaItemAccess().getColNameAssignment_1()); 
                    // InternalMml.g:690:3: ( rule__FormulaItem__ColNameAssignment_1 )
                    // InternalMml.g:690:4: rule__FormulaItem__ColNameAssignment_1
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
    // InternalMml.g:698:1: rule__CSVSeparator__Alternatives : ( ( ( ',' ) ) | ( ( ';' ) ) );
    public final void rule__CSVSeparator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:702:1: ( ( ( ',' ) ) | ( ( ';' ) ) )
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
                    // InternalMml.g:703:2: ( ( ',' ) )
                    {
                    // InternalMml.g:703:2: ( ( ',' ) )
                    // InternalMml.g:704:3: ( ',' )
                    {
                     before(grammarAccess.getCSVSeparatorAccess().getCOMMAEnumLiteralDeclaration_0()); 
                    // InternalMml.g:705:3: ( ',' )
                    // InternalMml.g:705:4: ','
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getCSVSeparatorAccess().getCOMMAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:709:2: ( ( ';' ) )
                    {
                    // InternalMml.g:709:2: ( ( ';' ) )
                    // InternalMml.g:710:3: ( ';' )
                    {
                     before(grammarAccess.getCSVSeparatorAccess().getSEMI_COLONEnumLiteralDeclaration_1()); 
                    // InternalMml.g:711:3: ( ';' )
                    // InternalMml.g:711:4: ';'
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
    // InternalMml.g:719:1: rule__FrameworkLang__Alternatives : ( ( ( 'scikit-learn' ) ) | ( ( 'R' ) ) );
    public final void rule__FrameworkLang__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:723:1: ( ( ( 'scikit-learn' ) ) | ( ( 'R' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMml.g:724:2: ( ( 'scikit-learn' ) )
                    {
                    // InternalMml.g:724:2: ( ( 'scikit-learn' ) )
                    // InternalMml.g:725:3: ( 'scikit-learn' )
                    {
                     before(grammarAccess.getFrameworkLangAccess().getSCIKITEnumLiteralDeclaration_0()); 
                    // InternalMml.g:726:3: ( 'scikit-learn' )
                    // InternalMml.g:726:4: 'scikit-learn'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getFrameworkLangAccess().getSCIKITEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:730:2: ( ( 'R' ) )
                    {
                    // InternalMml.g:730:2: ( ( 'R' ) )
                    // InternalMml.g:731:3: ( 'R' )
                    {
                     before(grammarAccess.getFrameworkLangAccess().getREnumLiteralDeclaration_1()); 
                    // InternalMml.g:732:3: ( 'R' )
                    // InternalMml.g:732:4: 'R'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getFrameworkLangAccess().getREnumLiteralDeclaration_1()); 

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
    // InternalMml.g:740:1: rule__SVMKernel__Alternatives : ( ( ( 'linear' ) ) | ( ( 'polynomial' ) ) | ( ( 'radial' ) ) );
    public final void rule__SVMKernel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:744:1: ( ( ( 'linear' ) ) | ( ( 'polynomial' ) ) | ( ( 'radial' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
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
                    // InternalMml.g:745:2: ( ( 'linear' ) )
                    {
                    // InternalMml.g:745:2: ( ( 'linear' ) )
                    // InternalMml.g:746:3: ( 'linear' )
                    {
                     before(grammarAccess.getSVMKernelAccess().getLinearEnumLiteralDeclaration_0()); 
                    // InternalMml.g:747:3: ( 'linear' )
                    // InternalMml.g:747:4: 'linear'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMKernelAccess().getLinearEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:751:2: ( ( 'polynomial' ) )
                    {
                    // InternalMml.g:751:2: ( ( 'polynomial' ) )
                    // InternalMml.g:752:3: ( 'polynomial' )
                    {
                     before(grammarAccess.getSVMKernelAccess().getPolyEnumLiteralDeclaration_1()); 
                    // InternalMml.g:753:3: ( 'polynomial' )
                    // InternalMml.g:753:4: 'polynomial'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMKernelAccess().getPolyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:757:2: ( ( 'radial' ) )
                    {
                    // InternalMml.g:757:2: ( ( 'radial' ) )
                    // InternalMml.g:758:3: ( 'radial' )
                    {
                     before(grammarAccess.getSVMKernelAccess().getRadialEnumLiteralDeclaration_2()); 
                    // InternalMml.g:759:3: ( 'radial' )
                    // InternalMml.g:759:4: 'radial'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalMml.g:767:1: rule__SVMClassification__Alternatives : ( ( ( 'C-classification' ) ) | ( ( 'nu-classification' ) ) | ( ( 'one-classification' ) ) );
    public final void rule__SVMClassification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:771:1: ( ( ( 'C-classification' ) ) | ( ( 'nu-classification' ) ) | ( ( 'one-classification' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
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
                    // InternalMml.g:772:2: ( ( 'C-classification' ) )
                    {
                    // InternalMml.g:772:2: ( ( 'C-classification' ) )
                    // InternalMml.g:773:3: ( 'C-classification' )
                    {
                     before(grammarAccess.getSVMClassificationAccess().getCClassEnumLiteralDeclaration_0()); 
                    // InternalMml.g:774:3: ( 'C-classification' )
                    // InternalMml.g:774:4: 'C-classification'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMClassificationAccess().getCClassEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:778:2: ( ( 'nu-classification' ) )
                    {
                    // InternalMml.g:778:2: ( ( 'nu-classification' ) )
                    // InternalMml.g:779:3: ( 'nu-classification' )
                    {
                     before(grammarAccess.getSVMClassificationAccess().getNuClassEnumLiteralDeclaration_1()); 
                    // InternalMml.g:780:3: ( 'nu-classification' )
                    // InternalMml.g:780:4: 'nu-classification'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMClassificationAccess().getNuClassEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:784:2: ( ( 'one-classification' ) )
                    {
                    // InternalMml.g:784:2: ( ( 'one-classification' ) )
                    // InternalMml.g:785:3: ( 'one-classification' )
                    {
                     before(grammarAccess.getSVMClassificationAccess().getOneClassEnumLiteralDeclaration_2()); 
                    // InternalMml.g:786:3: ( 'one-classification' )
                    // InternalMml.g:786:4: 'one-classification'
                    {
                    match(input,20,FOLLOW_2); 

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


    // $ANTLR start "rule__CLASS__Alternatives"
    // InternalMml.g:794:1: rule__CLASS__Alternatives : ( ( ( 'binomial' ) ) | ( ( 'gaussian' ) ) | ( ( 'poisson' ) ) );
    public final void rule__CLASS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:798:1: ( ( ( 'binomial' ) ) | ( ( 'gaussian' ) ) | ( ( 'poisson' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
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
                    // InternalMml.g:799:2: ( ( 'binomial' ) )
                    {
                    // InternalMml.g:799:2: ( ( 'binomial' ) )
                    // InternalMml.g:800:3: ( 'binomial' )
                    {
                     before(grammarAccess.getCLASSAccess().getBinomialEnumLiteralDeclaration_0()); 
                    // InternalMml.g:801:3: ( 'binomial' )
                    // InternalMml.g:801:4: 'binomial'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getCLASSAccess().getBinomialEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:805:2: ( ( 'gaussian' ) )
                    {
                    // InternalMml.g:805:2: ( ( 'gaussian' ) )
                    // InternalMml.g:806:3: ( 'gaussian' )
                    {
                     before(grammarAccess.getCLASSAccess().getGaussianEnumLiteralDeclaration_1()); 
                    // InternalMml.g:807:3: ( 'gaussian' )
                    // InternalMml.g:807:4: 'gaussian'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getCLASSAccess().getGaussianEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:811:2: ( ( 'poisson' ) )
                    {
                    // InternalMml.g:811:2: ( ( 'poisson' ) )
                    // InternalMml.g:812:3: ( 'poisson' )
                    {
                     before(grammarAccess.getCLASSAccess().getPoissonEnumLiteralDeclaration_2()); 
                    // InternalMml.g:813:3: ( 'poisson' )
                    // InternalMml.g:813:4: 'poisson'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getCLASSAccess().getPoissonEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__CLASS__Alternatives"


    // $ANTLR start "rule__ValidationMetric__Alternatives"
    // InternalMml.g:821:1: rule__ValidationMetric__Alternatives : ( ( ( 'recall' ) ) | ( ( 'precision' ) ) | ( ( 'F1' ) ) );
    public final void rule__ValidationMetric__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:825:1: ( ( ( 'recall' ) ) | ( ( 'precision' ) ) | ( ( 'F1' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMml.g:826:2: ( ( 'recall' ) )
                    {
                    // InternalMml.g:826:2: ( ( 'recall' ) )
                    // InternalMml.g:827:3: ( 'recall' )
                    {
                     before(grammarAccess.getValidationMetricAccess().getRECALLEnumLiteralDeclaration_0()); 
                    // InternalMml.g:828:3: ( 'recall' )
                    // InternalMml.g:828:4: 'recall'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationMetricAccess().getRECALLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:832:2: ( ( 'precision' ) )
                    {
                    // InternalMml.g:832:2: ( ( 'precision' ) )
                    // InternalMml.g:833:3: ( 'precision' )
                    {
                     before(grammarAccess.getValidationMetricAccess().getPRECISIONEnumLiteralDeclaration_1()); 
                    // InternalMml.g:834:3: ( 'precision' )
                    // InternalMml.g:834:4: 'precision'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationMetricAccess().getPRECISIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:838:2: ( ( 'F1' ) )
                    {
                    // InternalMml.g:838:2: ( ( 'F1' ) )
                    // InternalMml.g:839:3: ( 'F1' )
                    {
                     before(grammarAccess.getValidationMetricAccess().getF1EnumLiteralDeclaration_2()); 
                    // InternalMml.g:840:3: ( 'F1' )
                    // InternalMml.g:840:4: 'F1'
                    {
                    match(input,26,FOLLOW_2); 

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
    // InternalMml.g:848:1: rule__MMLModel__Group__0 : rule__MMLModel__Group__0__Impl rule__MMLModel__Group__1 ;
    public final void rule__MMLModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:852:1: ( rule__MMLModel__Group__0__Impl rule__MMLModel__Group__1 )
            // InternalMml.g:853:2: rule__MMLModel__Group__0__Impl rule__MMLModel__Group__1
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
    // InternalMml.g:860:1: rule__MMLModel__Group__0__Impl : ( 'Model:' ) ;
    public final void rule__MMLModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:864:1: ( ( 'Model:' ) )
            // InternalMml.g:865:1: ( 'Model:' )
            {
            // InternalMml.g:865:1: ( 'Model:' )
            // InternalMml.g:866:2: 'Model:'
            {
             before(grammarAccess.getMMLModelAccess().getModelKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMMLModelAccess().getModelKeyword_0()); 

            }


            }

        }
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
    // InternalMml.g:875:1: rule__MMLModel__Group__1 : rule__MMLModel__Group__1__Impl rule__MMLModel__Group__2 ;
    public final void rule__MMLModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:879:1: ( rule__MMLModel__Group__1__Impl rule__MMLModel__Group__2 )
            // InternalMml.g:880:2: rule__MMLModel__Group__1__Impl rule__MMLModel__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMml.g:887:1: rule__MMLModel__Group__1__Impl : ( ( rule__MMLModel__PreamAssignment_1 )? ) ;
    public final void rule__MMLModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:891:1: ( ( ( rule__MMLModel__PreamAssignment_1 )? ) )
            // InternalMml.g:892:1: ( ( rule__MMLModel__PreamAssignment_1 )? )
            {
            // InternalMml.g:892:1: ( ( rule__MMLModel__PreamAssignment_1 )? )
            // InternalMml.g:893:2: ( rule__MMLModel__PreamAssignment_1 )?
            {
             before(grammarAccess.getMMLModelAccess().getPreamAssignment_1()); 
            // InternalMml.g:894:2: ( rule__MMLModel__PreamAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMml.g:894:3: rule__MMLModel__PreamAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MMLModel__PreamAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMMLModelAccess().getPreamAssignment_1()); 

            }


            }

        }
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
    // InternalMml.g:902:1: rule__MMLModel__Group__2 : rule__MMLModel__Group__2__Impl rule__MMLModel__Group__3 ;
    public final void rule__MMLModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:906:1: ( rule__MMLModel__Group__2__Impl rule__MMLModel__Group__3 )
            // InternalMml.g:907:2: rule__MMLModel__Group__2__Impl rule__MMLModel__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalMml.g:914:1: rule__MMLModel__Group__2__Impl : ( ( rule__MMLModel__InputAssignment_2 )? ) ;
    public final void rule__MMLModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:918:1: ( ( ( rule__MMLModel__InputAssignment_2 )? ) )
            // InternalMml.g:919:1: ( ( rule__MMLModel__InputAssignment_2 )? )
            {
            // InternalMml.g:919:1: ( ( rule__MMLModel__InputAssignment_2 )? )
            // InternalMml.g:920:2: ( rule__MMLModel__InputAssignment_2 )?
            {
             before(grammarAccess.getMMLModelAccess().getInputAssignment_2()); 
            // InternalMml.g:921:2: ( rule__MMLModel__InputAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMml.g:921:3: rule__MMLModel__InputAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MMLModel__InputAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMMLModelAccess().getInputAssignment_2()); 

            }


            }

        }
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
    // InternalMml.g:929:1: rule__MMLModel__Group__3 : rule__MMLModel__Group__3__Impl rule__MMLModel__Group__4 ;
    public final void rule__MMLModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:933:1: ( rule__MMLModel__Group__3__Impl rule__MMLModel__Group__4 )
            // InternalMml.g:934:2: rule__MMLModel__Group__3__Impl rule__MMLModel__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalMml.g:941:1: rule__MMLModel__Group__3__Impl : ( ( rule__MMLModel__AlgorithmAssignment_3 )? ) ;
    public final void rule__MMLModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:945:1: ( ( ( rule__MMLModel__AlgorithmAssignment_3 )? ) )
            // InternalMml.g:946:1: ( ( rule__MMLModel__AlgorithmAssignment_3 )? )
            {
            // InternalMml.g:946:1: ( ( rule__MMLModel__AlgorithmAssignment_3 )? )
            // InternalMml.g:947:2: ( rule__MMLModel__AlgorithmAssignment_3 )?
            {
             before(grammarAccess.getMMLModelAccess().getAlgorithmAssignment_3()); 
            // InternalMml.g:948:2: ( rule__MMLModel__AlgorithmAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMml.g:948:3: rule__MMLModel__AlgorithmAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__MMLModel__AlgorithmAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMMLModelAccess().getAlgorithmAssignment_3()); 

            }


            }

        }
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
    // InternalMml.g:956:1: rule__MMLModel__Group__4 : rule__MMLModel__Group__4__Impl rule__MMLModel__Group__5 ;
    public final void rule__MMLModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:960:1: ( rule__MMLModel__Group__4__Impl rule__MMLModel__Group__5 )
            // InternalMml.g:961:2: rule__MMLModel__Group__4__Impl rule__MMLModel__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__MMLModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__5();

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
    // InternalMml.g:968:1: rule__MMLModel__Group__4__Impl : ( ( rule__MMLModel__FormulaAssignment_4 )? ) ;
    public final void rule__MMLModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:972:1: ( ( ( rule__MMLModel__FormulaAssignment_4 )? ) )
            // InternalMml.g:973:1: ( ( rule__MMLModel__FormulaAssignment_4 )? )
            {
            // InternalMml.g:973:1: ( ( rule__MMLModel__FormulaAssignment_4 )? )
            // InternalMml.g:974:2: ( rule__MMLModel__FormulaAssignment_4 )?
            {
             before(grammarAccess.getMMLModelAccess().getFormulaAssignment_4()); 
            // InternalMml.g:975:2: ( rule__MMLModel__FormulaAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMml.g:975:3: rule__MMLModel__FormulaAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__MMLModel__FormulaAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMMLModelAccess().getFormulaAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__MMLModel__Group__5"
    // InternalMml.g:983:1: rule__MMLModel__Group__5 : rule__MMLModel__Group__5__Impl rule__MMLModel__Group__6 ;
    public final void rule__MMLModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:987:1: ( rule__MMLModel__Group__5__Impl rule__MMLModel__Group__6 )
            // InternalMml.g:988:2: rule__MMLModel__Group__5__Impl rule__MMLModel__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__MMLModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__6();

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
    // $ANTLR end "rule__MMLModel__Group__5"


    // $ANTLR start "rule__MMLModel__Group__5__Impl"
    // InternalMml.g:995:1: rule__MMLModel__Group__5__Impl : ( ( rule__MMLModel__ValidationAssignment_5 ) ) ;
    public final void rule__MMLModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:999:1: ( ( ( rule__MMLModel__ValidationAssignment_5 ) ) )
            // InternalMml.g:1000:1: ( ( rule__MMLModel__ValidationAssignment_5 ) )
            {
            // InternalMml.g:1000:1: ( ( rule__MMLModel__ValidationAssignment_5 ) )
            // InternalMml.g:1001:2: ( rule__MMLModel__ValidationAssignment_5 )
            {
             before(grammarAccess.getMMLModelAccess().getValidationAssignment_5()); 
            // InternalMml.g:1002:2: ( rule__MMLModel__ValidationAssignment_5 )
            // InternalMml.g:1002:3: rule__MMLModel__ValidationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MMLModel__ValidationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMMLModelAccess().getValidationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__Group__5__Impl"


    // $ANTLR start "rule__MMLModel__Group__6"
    // InternalMml.g:1010:1: rule__MMLModel__Group__6 : rule__MMLModel__Group__6__Impl ;
    public final void rule__MMLModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1014:1: ( rule__MMLModel__Group__6__Impl )
            // InternalMml.g:1015:2: rule__MMLModel__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__6__Impl();

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
    // $ANTLR end "rule__MMLModel__Group__6"


    // $ANTLR start "rule__MMLModel__Group__6__Impl"
    // InternalMml.g:1021:1: rule__MMLModel__Group__6__Impl : ( 'End.' ) ;
    public final void rule__MMLModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1025:1: ( ( 'End.' ) )
            // InternalMml.g:1026:1: ( 'End.' )
            {
            // InternalMml.g:1026:1: ( 'End.' )
            // InternalMml.g:1027:2: 'End.'
            {
             before(grammarAccess.getMMLModelAccess().getEndKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMMLModelAccess().getEndKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__Group__6__Impl"


    // $ANTLR start "rule__DataInput__Group__0"
    // InternalMml.g:1037:1: rule__DataInput__Group__0 : rule__DataInput__Group__0__Impl rule__DataInput__Group__1 ;
    public final void rule__DataInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1041:1: ( rule__DataInput__Group__0__Impl rule__DataInput__Group__1 )
            // InternalMml.g:1042:2: rule__DataInput__Group__0__Impl rule__DataInput__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMml.g:1049:1: rule__DataInput__Group__0__Impl : ( 'datainput' ) ;
    public final void rule__DataInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1053:1: ( ( 'datainput' ) )
            // InternalMml.g:1054:1: ( 'datainput' )
            {
            // InternalMml.g:1054:1: ( 'datainput' )
            // InternalMml.g:1055:2: 'datainput'
            {
             before(grammarAccess.getDataInputAccess().getDatainputKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMml.g:1064:1: rule__DataInput__Group__1 : rule__DataInput__Group__1__Impl rule__DataInput__Group__2 ;
    public final void rule__DataInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1068:1: ( rule__DataInput__Group__1__Impl rule__DataInput__Group__2 )
            // InternalMml.g:1069:2: rule__DataInput__Group__1__Impl rule__DataInput__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMml.g:1076:1: rule__DataInput__Group__1__Impl : ( ( rule__DataInput__FilelocationAssignment_1 ) ) ;
    public final void rule__DataInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1080:1: ( ( ( rule__DataInput__FilelocationAssignment_1 ) ) )
            // InternalMml.g:1081:1: ( ( rule__DataInput__FilelocationAssignment_1 ) )
            {
            // InternalMml.g:1081:1: ( ( rule__DataInput__FilelocationAssignment_1 ) )
            // InternalMml.g:1082:2: ( rule__DataInput__FilelocationAssignment_1 )
            {
             before(grammarAccess.getDataInputAccess().getFilelocationAssignment_1()); 
            // InternalMml.g:1083:2: ( rule__DataInput__FilelocationAssignment_1 )
            // InternalMml.g:1083:3: rule__DataInput__FilelocationAssignment_1
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
    // InternalMml.g:1091:1: rule__DataInput__Group__2 : rule__DataInput__Group__2__Impl ;
    public final void rule__DataInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1095:1: ( rule__DataInput__Group__2__Impl )
            // InternalMml.g:1096:2: rule__DataInput__Group__2__Impl
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
    // InternalMml.g:1102:1: rule__DataInput__Group__2__Impl : ( ( rule__DataInput__ParsingInstructionAssignment_2 )? ) ;
    public final void rule__DataInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1106:1: ( ( ( rule__DataInput__ParsingInstructionAssignment_2 )? ) )
            // InternalMml.g:1107:1: ( ( rule__DataInput__ParsingInstructionAssignment_2 )? )
            {
            // InternalMml.g:1107:1: ( ( rule__DataInput__ParsingInstructionAssignment_2 )? )
            // InternalMml.g:1108:2: ( rule__DataInput__ParsingInstructionAssignment_2 )?
            {
             before(grammarAccess.getDataInputAccess().getParsingInstructionAssignment_2()); 
            // InternalMml.g:1109:2: ( rule__DataInput__ParsingInstructionAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMml.g:1109:3: rule__DataInput__ParsingInstructionAssignment_2
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
    // InternalMml.g:1118:1: rule__CSVParsingConfiguration__Group__0 : rule__CSVParsingConfiguration__Group__0__Impl rule__CSVParsingConfiguration__Group__1 ;
    public final void rule__CSVParsingConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1122:1: ( rule__CSVParsingConfiguration__Group__0__Impl rule__CSVParsingConfiguration__Group__1 )
            // InternalMml.g:1123:2: rule__CSVParsingConfiguration__Group__0__Impl rule__CSVParsingConfiguration__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMml.g:1130:1: rule__CSVParsingConfiguration__Group__0__Impl : ( 'separator' ) ;
    public final void rule__CSVParsingConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1134:1: ( ( 'separator' ) )
            // InternalMml.g:1135:1: ( 'separator' )
            {
            // InternalMml.g:1135:1: ( 'separator' )
            // InternalMml.g:1136:2: 'separator'
            {
             before(grammarAccess.getCSVParsingConfigurationAccess().getSeparatorKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMml.g:1145:1: rule__CSVParsingConfiguration__Group__1 : rule__CSVParsingConfiguration__Group__1__Impl ;
    public final void rule__CSVParsingConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1149:1: ( rule__CSVParsingConfiguration__Group__1__Impl )
            // InternalMml.g:1150:2: rule__CSVParsingConfiguration__Group__1__Impl
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
    // InternalMml.g:1156:1: rule__CSVParsingConfiguration__Group__1__Impl : ( ( rule__CSVParsingConfiguration__SepAssignment_1 ) ) ;
    public final void rule__CSVParsingConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1160:1: ( ( ( rule__CSVParsingConfiguration__SepAssignment_1 ) ) )
            // InternalMml.g:1161:1: ( ( rule__CSVParsingConfiguration__SepAssignment_1 ) )
            {
            // InternalMml.g:1161:1: ( ( rule__CSVParsingConfiguration__SepAssignment_1 ) )
            // InternalMml.g:1162:2: ( rule__CSVParsingConfiguration__SepAssignment_1 )
            {
             before(grammarAccess.getCSVParsingConfigurationAccess().getSepAssignment_1()); 
            // InternalMml.g:1163:2: ( rule__CSVParsingConfiguration__SepAssignment_1 )
            // InternalMml.g:1163:3: rule__CSVParsingConfiguration__SepAssignment_1
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
    // InternalMml.g:1172:1: rule__MLChoiceAlgorithm__Group__0 : rule__MLChoiceAlgorithm__Group__0__Impl rule__MLChoiceAlgorithm__Group__1 ;
    public final void rule__MLChoiceAlgorithm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1176:1: ( rule__MLChoiceAlgorithm__Group__0__Impl rule__MLChoiceAlgorithm__Group__1 )
            // InternalMml.g:1177:2: rule__MLChoiceAlgorithm__Group__0__Impl rule__MLChoiceAlgorithm__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMml.g:1184:1: rule__MLChoiceAlgorithm__Group__0__Impl : ( 'mlframework' ) ;
    public final void rule__MLChoiceAlgorithm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1188:1: ( ( 'mlframework' ) )
            // InternalMml.g:1189:1: ( 'mlframework' )
            {
            // InternalMml.g:1189:1: ( 'mlframework' )
            // InternalMml.g:1190:2: 'mlframework'
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getMlframeworkKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMml.g:1199:1: rule__MLChoiceAlgorithm__Group__1 : rule__MLChoiceAlgorithm__Group__1__Impl rule__MLChoiceAlgorithm__Group__2 ;
    public final void rule__MLChoiceAlgorithm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1203:1: ( rule__MLChoiceAlgorithm__Group__1__Impl rule__MLChoiceAlgorithm__Group__2 )
            // InternalMml.g:1204:2: rule__MLChoiceAlgorithm__Group__1__Impl rule__MLChoiceAlgorithm__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMml.g:1211:1: rule__MLChoiceAlgorithm__Group__1__Impl : ( ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 ) ) ;
    public final void rule__MLChoiceAlgorithm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1215:1: ( ( ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 ) ) )
            // InternalMml.g:1216:1: ( ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 ) )
            {
            // InternalMml.g:1216:1: ( ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 ) )
            // InternalMml.g:1217:2: ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 )
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkAssignment_1()); 
            // InternalMml.g:1218:2: ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 )
            // InternalMml.g:1218:3: rule__MLChoiceAlgorithm__FrameworkAssignment_1
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
    // InternalMml.g:1226:1: rule__MLChoiceAlgorithm__Group__2 : rule__MLChoiceAlgorithm__Group__2__Impl rule__MLChoiceAlgorithm__Group__3 ;
    public final void rule__MLChoiceAlgorithm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1230:1: ( rule__MLChoiceAlgorithm__Group__2__Impl rule__MLChoiceAlgorithm__Group__3 )
            // InternalMml.g:1231:2: rule__MLChoiceAlgorithm__Group__2__Impl rule__MLChoiceAlgorithm__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMml.g:1238:1: rule__MLChoiceAlgorithm__Group__2__Impl : ( 'algorithm' ) ;
    public final void rule__MLChoiceAlgorithm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1242:1: ( ( 'algorithm' ) )
            // InternalMml.g:1243:1: ( 'algorithm' )
            {
            // InternalMml.g:1243:1: ( 'algorithm' )
            // InternalMml.g:1244:2: 'algorithm'
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMml.g:1253:1: rule__MLChoiceAlgorithm__Group__3 : rule__MLChoiceAlgorithm__Group__3__Impl ;
    public final void rule__MLChoiceAlgorithm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1257:1: ( rule__MLChoiceAlgorithm__Group__3__Impl )
            // InternalMml.g:1258:2: rule__MLChoiceAlgorithm__Group__3__Impl
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
    // InternalMml.g:1264:1: rule__MLChoiceAlgorithm__Group__3__Impl : ( ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 ) ) ;
    public final void rule__MLChoiceAlgorithm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1268:1: ( ( ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 ) ) )
            // InternalMml.g:1269:1: ( ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 ) )
            {
            // InternalMml.g:1269:1: ( ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 ) )
            // InternalMml.g:1270:2: ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 )
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmAssignment_3()); 
            // InternalMml.g:1271:2: ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 )
            // InternalMml.g:1271:3: rule__MLChoiceAlgorithm__AlgorithmAssignment_3
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
    // InternalMml.g:1280:1: rule__SVM__Group__0 : rule__SVM__Group__0__Impl rule__SVM__Group__1 ;
    public final void rule__SVM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1284:1: ( rule__SVM__Group__0__Impl rule__SVM__Group__1 )
            // InternalMml.g:1285:2: rule__SVM__Group__0__Impl rule__SVM__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMml.g:1292:1: rule__SVM__Group__0__Impl : ( ( rule__SVM__NameAssignment_0 ) ) ;
    public final void rule__SVM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1296:1: ( ( ( rule__SVM__NameAssignment_0 ) ) )
            // InternalMml.g:1297:1: ( ( rule__SVM__NameAssignment_0 ) )
            {
            // InternalMml.g:1297:1: ( ( rule__SVM__NameAssignment_0 ) )
            // InternalMml.g:1298:2: ( rule__SVM__NameAssignment_0 )
            {
             before(grammarAccess.getSVMAccess().getNameAssignment_0()); 
            // InternalMml.g:1299:2: ( rule__SVM__NameAssignment_0 )
            // InternalMml.g:1299:3: rule__SVM__NameAssignment_0
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
    // InternalMml.g:1307:1: rule__SVM__Group__1 : rule__SVM__Group__1__Impl rule__SVM__Group__2 ;
    public final void rule__SVM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1311:1: ( rule__SVM__Group__1__Impl rule__SVM__Group__2 )
            // InternalMml.g:1312:2: rule__SVM__Group__1__Impl rule__SVM__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMml.g:1319:1: rule__SVM__Group__1__Impl : ( ( rule__SVM__Group_1__0 )? ) ;
    public final void rule__SVM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1323:1: ( ( ( rule__SVM__Group_1__0 )? ) )
            // InternalMml.g:1324:1: ( ( rule__SVM__Group_1__0 )? )
            {
            // InternalMml.g:1324:1: ( ( rule__SVM__Group_1__0 )? )
            // InternalMml.g:1325:2: ( rule__SVM__Group_1__0 )?
            {
             before(grammarAccess.getSVMAccess().getGroup_1()); 
            // InternalMml.g:1326:2: ( rule__SVM__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMml.g:1326:3: rule__SVM__Group_1__0
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
    // InternalMml.g:1334:1: rule__SVM__Group__2 : rule__SVM__Group__2__Impl rule__SVM__Group__3 ;
    public final void rule__SVM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1338:1: ( rule__SVM__Group__2__Impl rule__SVM__Group__3 )
            // InternalMml.g:1339:2: rule__SVM__Group__2__Impl rule__SVM__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalMml.g:1346:1: rule__SVM__Group__2__Impl : ( ( rule__SVM__Group_2__0 )? ) ;
    public final void rule__SVM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1350:1: ( ( ( rule__SVM__Group_2__0 )? ) )
            // InternalMml.g:1351:1: ( ( rule__SVM__Group_2__0 )? )
            {
            // InternalMml.g:1351:1: ( ( rule__SVM__Group_2__0 )? )
            // InternalMml.g:1352:2: ( rule__SVM__Group_2__0 )?
            {
             before(grammarAccess.getSVMAccess().getGroup_2()); 
            // InternalMml.g:1353:2: ( rule__SVM__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMml.g:1353:3: rule__SVM__Group_2__0
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
    // InternalMml.g:1361:1: rule__SVM__Group__3 : rule__SVM__Group__3__Impl rule__SVM__Group__4 ;
    public final void rule__SVM__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1365:1: ( rule__SVM__Group__3__Impl rule__SVM__Group__4 )
            // InternalMml.g:1366:2: rule__SVM__Group__3__Impl rule__SVM__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalMml.g:1373:1: rule__SVM__Group__3__Impl : ( ( rule__SVM__Group_3__0 )? ) ;
    public final void rule__SVM__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1377:1: ( ( ( rule__SVM__Group_3__0 )? ) )
            // InternalMml.g:1378:1: ( ( rule__SVM__Group_3__0 )? )
            {
            // InternalMml.g:1378:1: ( ( rule__SVM__Group_3__0 )? )
            // InternalMml.g:1379:2: ( rule__SVM__Group_3__0 )?
            {
             before(grammarAccess.getSVMAccess().getGroup_3()); 
            // InternalMml.g:1380:2: ( rule__SVM__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMml.g:1380:3: rule__SVM__Group_3__0
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
    // InternalMml.g:1388:1: rule__SVM__Group__4 : rule__SVM__Group__4__Impl ;
    public final void rule__SVM__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1392:1: ( rule__SVM__Group__4__Impl )
            // InternalMml.g:1393:2: rule__SVM__Group__4__Impl
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
    // InternalMml.g:1399:1: rule__SVM__Group__4__Impl : ( ( rule__SVM__Group_4__0 )? ) ;
    public final void rule__SVM__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1403:1: ( ( ( rule__SVM__Group_4__0 )? ) )
            // InternalMml.g:1404:1: ( ( rule__SVM__Group_4__0 )? )
            {
            // InternalMml.g:1404:1: ( ( rule__SVM__Group_4__0 )? )
            // InternalMml.g:1405:2: ( rule__SVM__Group_4__0 )?
            {
             before(grammarAccess.getSVMAccess().getGroup_4()); 
            // InternalMml.g:1406:2: ( rule__SVM__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMml.g:1406:3: rule__SVM__Group_4__0
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
    // InternalMml.g:1415:1: rule__SVM__Group_1__0 : rule__SVM__Group_1__0__Impl rule__SVM__Group_1__1 ;
    public final void rule__SVM__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1419:1: ( rule__SVM__Group_1__0__Impl rule__SVM__Group_1__1 )
            // InternalMml.g:1420:2: rule__SVM__Group_1__0__Impl rule__SVM__Group_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMml.g:1427:1: rule__SVM__Group_1__0__Impl : ( 'gamma=' ) ;
    public final void rule__SVM__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1431:1: ( ( 'gamma=' ) )
            // InternalMml.g:1432:1: ( 'gamma=' )
            {
            // InternalMml.g:1432:1: ( 'gamma=' )
            // InternalMml.g:1433:2: 'gamma='
            {
             before(grammarAccess.getSVMAccess().getGammaKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMml.g:1442:1: rule__SVM__Group_1__1 : rule__SVM__Group_1__1__Impl ;
    public final void rule__SVM__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1446:1: ( rule__SVM__Group_1__1__Impl )
            // InternalMml.g:1447:2: rule__SVM__Group_1__1__Impl
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
    // InternalMml.g:1453:1: rule__SVM__Group_1__1__Impl : ( ( rule__SVM__GammaAssignment_1_1 ) ) ;
    public final void rule__SVM__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1457:1: ( ( ( rule__SVM__GammaAssignment_1_1 ) ) )
            // InternalMml.g:1458:1: ( ( rule__SVM__GammaAssignment_1_1 ) )
            {
            // InternalMml.g:1458:1: ( ( rule__SVM__GammaAssignment_1_1 ) )
            // InternalMml.g:1459:2: ( rule__SVM__GammaAssignment_1_1 )
            {
             before(grammarAccess.getSVMAccess().getGammaAssignment_1_1()); 
            // InternalMml.g:1460:2: ( rule__SVM__GammaAssignment_1_1 )
            // InternalMml.g:1460:3: rule__SVM__GammaAssignment_1_1
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
    // InternalMml.g:1469:1: rule__SVM__Group_2__0 : rule__SVM__Group_2__0__Impl rule__SVM__Group_2__1 ;
    public final void rule__SVM__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1473:1: ( rule__SVM__Group_2__0__Impl rule__SVM__Group_2__1 )
            // InternalMml.g:1474:2: rule__SVM__Group_2__0__Impl rule__SVM__Group_2__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMml.g:1481:1: rule__SVM__Group_2__0__Impl : ( 'C=' ) ;
    public final void rule__SVM__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1485:1: ( ( 'C=' ) )
            // InternalMml.g:1486:1: ( 'C=' )
            {
            // InternalMml.g:1486:1: ( 'C=' )
            // InternalMml.g:1487:2: 'C='
            {
             before(grammarAccess.getSVMAccess().getCKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMml.g:1496:1: rule__SVM__Group_2__1 : rule__SVM__Group_2__1__Impl ;
    public final void rule__SVM__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1500:1: ( rule__SVM__Group_2__1__Impl )
            // InternalMml.g:1501:2: rule__SVM__Group_2__1__Impl
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
    // InternalMml.g:1507:1: rule__SVM__Group_2__1__Impl : ( ( rule__SVM__CAssignment_2_1 ) ) ;
    public final void rule__SVM__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1511:1: ( ( ( rule__SVM__CAssignment_2_1 ) ) )
            // InternalMml.g:1512:1: ( ( rule__SVM__CAssignment_2_1 ) )
            {
            // InternalMml.g:1512:1: ( ( rule__SVM__CAssignment_2_1 ) )
            // InternalMml.g:1513:2: ( rule__SVM__CAssignment_2_1 )
            {
             before(grammarAccess.getSVMAccess().getCAssignment_2_1()); 
            // InternalMml.g:1514:2: ( rule__SVM__CAssignment_2_1 )
            // InternalMml.g:1514:3: rule__SVM__CAssignment_2_1
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
    // InternalMml.g:1523:1: rule__SVM__Group_3__0 : rule__SVM__Group_3__0__Impl rule__SVM__Group_3__1 ;
    public final void rule__SVM__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1527:1: ( rule__SVM__Group_3__0__Impl rule__SVM__Group_3__1 )
            // InternalMml.g:1528:2: rule__SVM__Group_3__0__Impl rule__SVM__Group_3__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMml.g:1535:1: rule__SVM__Group_3__0__Impl : ( 'kernel=' ) ;
    public final void rule__SVM__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1539:1: ( ( 'kernel=' ) )
            // InternalMml.g:1540:1: ( 'kernel=' )
            {
            // InternalMml.g:1540:1: ( 'kernel=' )
            // InternalMml.g:1541:2: 'kernel='
            {
             before(grammarAccess.getSVMAccess().getKernelKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMml.g:1550:1: rule__SVM__Group_3__1 : rule__SVM__Group_3__1__Impl ;
    public final void rule__SVM__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1554:1: ( rule__SVM__Group_3__1__Impl )
            // InternalMml.g:1555:2: rule__SVM__Group_3__1__Impl
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
    // InternalMml.g:1561:1: rule__SVM__Group_3__1__Impl : ( ( rule__SVM__KernelAssignment_3_1 ) ) ;
    public final void rule__SVM__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1565:1: ( ( ( rule__SVM__KernelAssignment_3_1 ) ) )
            // InternalMml.g:1566:1: ( ( rule__SVM__KernelAssignment_3_1 ) )
            {
            // InternalMml.g:1566:1: ( ( rule__SVM__KernelAssignment_3_1 ) )
            // InternalMml.g:1567:2: ( rule__SVM__KernelAssignment_3_1 )
            {
             before(grammarAccess.getSVMAccess().getKernelAssignment_3_1()); 
            // InternalMml.g:1568:2: ( rule__SVM__KernelAssignment_3_1 )
            // InternalMml.g:1568:3: rule__SVM__KernelAssignment_3_1
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
    // InternalMml.g:1577:1: rule__SVM__Group_4__0 : rule__SVM__Group_4__0__Impl rule__SVM__Group_4__1 ;
    public final void rule__SVM__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1581:1: ( rule__SVM__Group_4__0__Impl rule__SVM__Group_4__1 )
            // InternalMml.g:1582:2: rule__SVM__Group_4__0__Impl rule__SVM__Group_4__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMml.g:1589:1: rule__SVM__Group_4__0__Impl : ( 'classification' ) ;
    public final void rule__SVM__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1593:1: ( ( 'classification' ) )
            // InternalMml.g:1594:1: ( 'classification' )
            {
            // InternalMml.g:1594:1: ( 'classification' )
            // InternalMml.g:1595:2: 'classification'
            {
             before(grammarAccess.getSVMAccess().getClassificationKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMml.g:1604:1: rule__SVM__Group_4__1 : rule__SVM__Group_4__1__Impl ;
    public final void rule__SVM__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1608:1: ( rule__SVM__Group_4__1__Impl )
            // InternalMml.g:1609:2: rule__SVM__Group_4__1__Impl
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
    // InternalMml.g:1615:1: rule__SVM__Group_4__1__Impl : ( ( rule__SVM__SvmclassificationAssignment_4_1 ) ) ;
    public final void rule__SVM__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1619:1: ( ( ( rule__SVM__SvmclassificationAssignment_4_1 ) ) )
            // InternalMml.g:1620:1: ( ( rule__SVM__SvmclassificationAssignment_4_1 ) )
            {
            // InternalMml.g:1620:1: ( ( rule__SVM__SvmclassificationAssignment_4_1 ) )
            // InternalMml.g:1621:2: ( rule__SVM__SvmclassificationAssignment_4_1 )
            {
             before(grammarAccess.getSVMAccess().getSvmclassificationAssignment_4_1()); 
            // InternalMml.g:1622:2: ( rule__SVM__SvmclassificationAssignment_4_1 )
            // InternalMml.g:1622:3: rule__SVM__SvmclassificationAssignment_4_1
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
    // InternalMml.g:1631:1: rule__DT__Group__0 : rule__DT__Group__0__Impl rule__DT__Group__1 ;
    public final void rule__DT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1635:1: ( rule__DT__Group__0__Impl rule__DT__Group__1 )
            // InternalMml.g:1636:2: rule__DT__Group__0__Impl rule__DT__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMml.g:1643:1: rule__DT__Group__0__Impl : ( ( rule__DT__NameAssignment_0 ) ) ;
    public final void rule__DT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1647:1: ( ( ( rule__DT__NameAssignment_0 ) ) )
            // InternalMml.g:1648:1: ( ( rule__DT__NameAssignment_0 ) )
            {
            // InternalMml.g:1648:1: ( ( rule__DT__NameAssignment_0 ) )
            // InternalMml.g:1649:2: ( rule__DT__NameAssignment_0 )
            {
             before(grammarAccess.getDTAccess().getNameAssignment_0()); 
            // InternalMml.g:1650:2: ( rule__DT__NameAssignment_0 )
            // InternalMml.g:1650:3: rule__DT__NameAssignment_0
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
    // InternalMml.g:1658:1: rule__DT__Group__1 : rule__DT__Group__1__Impl ;
    public final void rule__DT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1662:1: ( rule__DT__Group__1__Impl )
            // InternalMml.g:1663:2: rule__DT__Group__1__Impl
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
    // InternalMml.g:1669:1: rule__DT__Group__1__Impl : ( ( rule__DT__Max_depthAssignment_1 )? ) ;
    public final void rule__DT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1673:1: ( ( ( rule__DT__Max_depthAssignment_1 )? ) )
            // InternalMml.g:1674:1: ( ( rule__DT__Max_depthAssignment_1 )? )
            {
            // InternalMml.g:1674:1: ( ( rule__DT__Max_depthAssignment_1 )? )
            // InternalMml.g:1675:2: ( rule__DT__Max_depthAssignment_1 )?
            {
             before(grammarAccess.getDTAccess().getMax_depthAssignment_1()); 
            // InternalMml.g:1676:2: ( rule__DT__Max_depthAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMml.g:1676:3: rule__DT__Max_depthAssignment_1
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


    // $ANTLR start "rule__RandomForest__Group__0"
    // InternalMml.g:1685:1: rule__RandomForest__Group__0 : rule__RandomForest__Group__0__Impl rule__RandomForest__Group__1 ;
    public final void rule__RandomForest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1689:1: ( rule__RandomForest__Group__0__Impl rule__RandomForest__Group__1 )
            // InternalMml.g:1690:2: rule__RandomForest__Group__0__Impl rule__RandomForest__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__RandomForest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RandomForest__Group__1();

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
    // $ANTLR end "rule__RandomForest__Group__0"


    // $ANTLR start "rule__RandomForest__Group__0__Impl"
    // InternalMml.g:1697:1: rule__RandomForest__Group__0__Impl : ( ( rule__RandomForest__NameAssignment_0 ) ) ;
    public final void rule__RandomForest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1701:1: ( ( ( rule__RandomForest__NameAssignment_0 ) ) )
            // InternalMml.g:1702:1: ( ( rule__RandomForest__NameAssignment_0 ) )
            {
            // InternalMml.g:1702:1: ( ( rule__RandomForest__NameAssignment_0 ) )
            // InternalMml.g:1703:2: ( rule__RandomForest__NameAssignment_0 )
            {
             before(grammarAccess.getRandomForestAccess().getNameAssignment_0()); 
            // InternalMml.g:1704:2: ( rule__RandomForest__NameAssignment_0 )
            // InternalMml.g:1704:3: rule__RandomForest__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RandomForest__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRandomForestAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomForest__Group__0__Impl"


    // $ANTLR start "rule__RandomForest__Group__1"
    // InternalMml.g:1712:1: rule__RandomForest__Group__1 : rule__RandomForest__Group__1__Impl ;
    public final void rule__RandomForest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1716:1: ( rule__RandomForest__Group__1__Impl )
            // InternalMml.g:1717:2: rule__RandomForest__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RandomForest__Group__1__Impl();

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
    // $ANTLR end "rule__RandomForest__Group__1"


    // $ANTLR start "rule__RandomForest__Group__1__Impl"
    // InternalMml.g:1723:1: rule__RandomForest__Group__1__Impl : ( ( rule__RandomForest__NtreeAssignment_1 ) ) ;
    public final void rule__RandomForest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1727:1: ( ( ( rule__RandomForest__NtreeAssignment_1 ) ) )
            // InternalMml.g:1728:1: ( ( rule__RandomForest__NtreeAssignment_1 ) )
            {
            // InternalMml.g:1728:1: ( ( rule__RandomForest__NtreeAssignment_1 ) )
            // InternalMml.g:1729:2: ( rule__RandomForest__NtreeAssignment_1 )
            {
             before(grammarAccess.getRandomForestAccess().getNtreeAssignment_1()); 
            // InternalMml.g:1730:2: ( rule__RandomForest__NtreeAssignment_1 )
            // InternalMml.g:1730:3: rule__RandomForest__NtreeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RandomForest__NtreeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRandomForestAccess().getNtreeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomForest__Group__1__Impl"


    // $ANTLR start "rule__LogisticRegression__Group__0"
    // InternalMml.g:1739:1: rule__LogisticRegression__Group__0 : rule__LogisticRegression__Group__0__Impl rule__LogisticRegression__Group__1 ;
    public final void rule__LogisticRegression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1743:1: ( rule__LogisticRegression__Group__0__Impl rule__LogisticRegression__Group__1 )
            // InternalMml.g:1744:2: rule__LogisticRegression__Group__0__Impl rule__LogisticRegression__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__LogisticRegression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogisticRegression__Group__1();

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
    // $ANTLR end "rule__LogisticRegression__Group__0"


    // $ANTLR start "rule__LogisticRegression__Group__0__Impl"
    // InternalMml.g:1751:1: rule__LogisticRegression__Group__0__Impl : ( ( rule__LogisticRegression__NameAssignment_0 ) ) ;
    public final void rule__LogisticRegression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1755:1: ( ( ( rule__LogisticRegression__NameAssignment_0 ) ) )
            // InternalMml.g:1756:1: ( ( rule__LogisticRegression__NameAssignment_0 ) )
            {
            // InternalMml.g:1756:1: ( ( rule__LogisticRegression__NameAssignment_0 ) )
            // InternalMml.g:1757:2: ( rule__LogisticRegression__NameAssignment_0 )
            {
             before(grammarAccess.getLogisticRegressionAccess().getNameAssignment_0()); 
            // InternalMml.g:1758:2: ( rule__LogisticRegression__NameAssignment_0 )
            // InternalMml.g:1758:3: rule__LogisticRegression__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LogisticRegression__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLogisticRegressionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogisticRegression__Group__0__Impl"


    // $ANTLR start "rule__LogisticRegression__Group__1"
    // InternalMml.g:1766:1: rule__LogisticRegression__Group__1 : rule__LogisticRegression__Group__1__Impl rule__LogisticRegression__Group__2 ;
    public final void rule__LogisticRegression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1770:1: ( rule__LogisticRegression__Group__1__Impl rule__LogisticRegression__Group__2 )
            // InternalMml.g:1771:2: rule__LogisticRegression__Group__1__Impl rule__LogisticRegression__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__LogisticRegression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogisticRegression__Group__2();

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
    // $ANTLR end "rule__LogisticRegression__Group__1"


    // $ANTLR start "rule__LogisticRegression__Group__1__Impl"
    // InternalMml.g:1778:1: rule__LogisticRegression__Group__1__Impl : ( 'class=' ) ;
    public final void rule__LogisticRegression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1782:1: ( ( 'class=' ) )
            // InternalMml.g:1783:1: ( 'class=' )
            {
            // InternalMml.g:1783:1: ( 'class=' )
            // InternalMml.g:1784:2: 'class='
            {
             before(grammarAccess.getLogisticRegressionAccess().getClassKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLogisticRegressionAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogisticRegression__Group__1__Impl"


    // $ANTLR start "rule__LogisticRegression__Group__2"
    // InternalMml.g:1793:1: rule__LogisticRegression__Group__2 : rule__LogisticRegression__Group__2__Impl ;
    public final void rule__LogisticRegression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1797:1: ( rule__LogisticRegression__Group__2__Impl )
            // InternalMml.g:1798:2: rule__LogisticRegression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogisticRegression__Group__2__Impl();

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
    // $ANTLR end "rule__LogisticRegression__Group__2"


    // $ANTLR start "rule__LogisticRegression__Group__2__Impl"
    // InternalMml.g:1804:1: rule__LogisticRegression__Group__2__Impl : ( ( rule__LogisticRegression__ClassAssignment_2 ) ) ;
    public final void rule__LogisticRegression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1808:1: ( ( ( rule__LogisticRegression__ClassAssignment_2 ) ) )
            // InternalMml.g:1809:1: ( ( rule__LogisticRegression__ClassAssignment_2 ) )
            {
            // InternalMml.g:1809:1: ( ( rule__LogisticRegression__ClassAssignment_2 ) )
            // InternalMml.g:1810:2: ( rule__LogisticRegression__ClassAssignment_2 )
            {
             before(grammarAccess.getLogisticRegressionAccess().getClassAssignment_2()); 
            // InternalMml.g:1811:2: ( rule__LogisticRegression__ClassAssignment_2 )
            // InternalMml.g:1811:3: rule__LogisticRegression__ClassAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LogisticRegression__ClassAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLogisticRegressionAccess().getClassAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogisticRegression__Group__2__Impl"


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalMml.g:1820:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1824:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalMml.g:1825:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMml.g:1832:1: rule__FLOAT__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1836:1: ( ( RULE_INT ) )
            // InternalMml.g:1837:1: ( RULE_INT )
            {
            // InternalMml.g:1837:1: ( RULE_INT )
            // InternalMml.g:1838:2: RULE_INT
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
    // InternalMml.g:1847:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1851:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // InternalMml.g:1852:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMml.g:1859:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1863:1: ( ( '.' ) )
            // InternalMml.g:1864:1: ( '.' )
            {
            // InternalMml.g:1864:1: ( '.' )
            // InternalMml.g:1865:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMml.g:1874:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1878:1: ( rule__FLOAT__Group__2__Impl )
            // InternalMml.g:1879:2: rule__FLOAT__Group__2__Impl
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
    // InternalMml.g:1885:1: rule__FLOAT__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1889:1: ( ( RULE_INT ) )
            // InternalMml.g:1890:1: ( RULE_INT )
            {
            // InternalMml.g:1890:1: ( RULE_INT )
            // InternalMml.g:1891:2: RULE_INT
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
    // InternalMml.g:1901:1: rule__RFormula__Group__0 : rule__RFormula__Group__0__Impl rule__RFormula__Group__1 ;
    public final void rule__RFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1905:1: ( rule__RFormula__Group__0__Impl rule__RFormula__Group__1 )
            // InternalMml.g:1906:2: rule__RFormula__Group__0__Impl rule__RFormula__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMml.g:1913:1: rule__RFormula__Group__0__Impl : ( 'formula' ) ;
    public final void rule__RFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1917:1: ( ( 'formula' ) )
            // InternalMml.g:1918:1: ( 'formula' )
            {
            // InternalMml.g:1918:1: ( 'formula' )
            // InternalMml.g:1919:2: 'formula'
            {
             before(grammarAccess.getRFormulaAccess().getFormulaKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMml.g:1928:1: rule__RFormula__Group__1 : rule__RFormula__Group__1__Impl rule__RFormula__Group__2 ;
    public final void rule__RFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1932:1: ( rule__RFormula__Group__1__Impl rule__RFormula__Group__2 )
            // InternalMml.g:1933:2: rule__RFormula__Group__1__Impl rule__RFormula__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMml.g:1940:1: rule__RFormula__Group__1__Impl : ( ( rule__RFormula__Group_1__0 )? ) ;
    public final void rule__RFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1944:1: ( ( ( rule__RFormula__Group_1__0 )? ) )
            // InternalMml.g:1945:1: ( ( rule__RFormula__Group_1__0 )? )
            {
            // InternalMml.g:1945:1: ( ( rule__RFormula__Group_1__0 )? )
            // InternalMml.g:1946:2: ( rule__RFormula__Group_1__0 )?
            {
             before(grammarAccess.getRFormulaAccess().getGroup_1()); 
            // InternalMml.g:1947:2: ( rule__RFormula__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT||LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMml.g:1947:3: rule__RFormula__Group_1__0
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
    // InternalMml.g:1955:1: rule__RFormula__Group__2 : rule__RFormula__Group__2__Impl ;
    public final void rule__RFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1959:1: ( rule__RFormula__Group__2__Impl )
            // InternalMml.g:1960:2: rule__RFormula__Group__2__Impl
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
    // InternalMml.g:1966:1: rule__RFormula__Group__2__Impl : ( ( rule__RFormula__PredictorsAssignment_2 ) ) ;
    public final void rule__RFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1970:1: ( ( ( rule__RFormula__PredictorsAssignment_2 ) ) )
            // InternalMml.g:1971:1: ( ( rule__RFormula__PredictorsAssignment_2 ) )
            {
            // InternalMml.g:1971:1: ( ( rule__RFormula__PredictorsAssignment_2 ) )
            // InternalMml.g:1972:2: ( rule__RFormula__PredictorsAssignment_2 )
            {
             before(grammarAccess.getRFormulaAccess().getPredictorsAssignment_2()); 
            // InternalMml.g:1973:2: ( rule__RFormula__PredictorsAssignment_2 )
            // InternalMml.g:1973:3: rule__RFormula__PredictorsAssignment_2
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
    // InternalMml.g:1982:1: rule__RFormula__Group_1__0 : rule__RFormula__Group_1__0__Impl rule__RFormula__Group_1__1 ;
    public final void rule__RFormula__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1986:1: ( rule__RFormula__Group_1__0__Impl rule__RFormula__Group_1__1 )
            // InternalMml.g:1987:2: rule__RFormula__Group_1__0__Impl rule__RFormula__Group_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMml.g:1994:1: rule__RFormula__Group_1__0__Impl : ( ( rule__RFormula__PredictiveAssignment_1_0 ) ) ;
    public final void rule__RFormula__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1998:1: ( ( ( rule__RFormula__PredictiveAssignment_1_0 ) ) )
            // InternalMml.g:1999:1: ( ( rule__RFormula__PredictiveAssignment_1_0 ) )
            {
            // InternalMml.g:1999:1: ( ( rule__RFormula__PredictiveAssignment_1_0 ) )
            // InternalMml.g:2000:2: ( rule__RFormula__PredictiveAssignment_1_0 )
            {
             before(grammarAccess.getRFormulaAccess().getPredictiveAssignment_1_0()); 
            // InternalMml.g:2001:2: ( rule__RFormula__PredictiveAssignment_1_0 )
            // InternalMml.g:2001:3: rule__RFormula__PredictiveAssignment_1_0
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
    // InternalMml.g:2009:1: rule__RFormula__Group_1__1 : rule__RFormula__Group_1__1__Impl ;
    public final void rule__RFormula__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2013:1: ( rule__RFormula__Group_1__1__Impl )
            // InternalMml.g:2014:2: rule__RFormula__Group_1__1__Impl
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
    // InternalMml.g:2020:1: rule__RFormula__Group_1__1__Impl : ( '~' ) ;
    public final void rule__RFormula__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2024:1: ( ( '~' ) )
            // InternalMml.g:2025:1: ( '~' )
            {
            // InternalMml.g:2025:1: ( '~' )
            // InternalMml.g:2026:2: '~'
            {
             before(grammarAccess.getRFormulaAccess().getTildeKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMml.g:2036:1: rule__AllVariables__Group__0 : rule__AllVariables__Group__0__Impl rule__AllVariables__Group__1 ;
    public final void rule__AllVariables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2040:1: ( rule__AllVariables__Group__0__Impl rule__AllVariables__Group__1 )
            // InternalMml.g:2041:2: rule__AllVariables__Group__0__Impl rule__AllVariables__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMml.g:2048:1: rule__AllVariables__Group__0__Impl : ( ( rule__AllVariables__NameAssignment_0 ) ) ;
    public final void rule__AllVariables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2052:1: ( ( ( rule__AllVariables__NameAssignment_0 ) ) )
            // InternalMml.g:2053:1: ( ( rule__AllVariables__NameAssignment_0 ) )
            {
            // InternalMml.g:2053:1: ( ( rule__AllVariables__NameAssignment_0 ) )
            // InternalMml.g:2054:2: ( rule__AllVariables__NameAssignment_0 )
            {
             before(grammarAccess.getAllVariablesAccess().getNameAssignment_0()); 
            // InternalMml.g:2055:2: ( rule__AllVariables__NameAssignment_0 )
            // InternalMml.g:2055:3: rule__AllVariables__NameAssignment_0
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
    // InternalMml.g:2063:1: rule__AllVariables__Group__1 : rule__AllVariables__Group__1__Impl ;
    public final void rule__AllVariables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2067:1: ( rule__AllVariables__Group__1__Impl )
            // InternalMml.g:2068:2: rule__AllVariables__Group__1__Impl
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
    // InternalMml.g:2074:1: rule__AllVariables__Group__1__Impl : ( ( rule__AllVariables__AllAssignment_1 ) ) ;
    public final void rule__AllVariables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2078:1: ( ( ( rule__AllVariables__AllAssignment_1 ) ) )
            // InternalMml.g:2079:1: ( ( rule__AllVariables__AllAssignment_1 ) )
            {
            // InternalMml.g:2079:1: ( ( rule__AllVariables__AllAssignment_1 ) )
            // InternalMml.g:2080:2: ( rule__AllVariables__AllAssignment_1 )
            {
             before(grammarAccess.getAllVariablesAccess().getAllAssignment_1()); 
            // InternalMml.g:2081:2: ( rule__AllVariables__AllAssignment_1 )
            // InternalMml.g:2081:3: rule__AllVariables__AllAssignment_1
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
    // InternalMml.g:2090:1: rule__PredictorVariables__Group__0 : rule__PredictorVariables__Group__0__Impl rule__PredictorVariables__Group__1 ;
    public final void rule__PredictorVariables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2094:1: ( rule__PredictorVariables__Group__0__Impl rule__PredictorVariables__Group__1 )
            // InternalMml.g:2095:2: rule__PredictorVariables__Group__0__Impl rule__PredictorVariables__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMml.g:2102:1: rule__PredictorVariables__Group__0__Impl : ( ( rule__PredictorVariables__NameAssignment_0 ) ) ;
    public final void rule__PredictorVariables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2106:1: ( ( ( rule__PredictorVariables__NameAssignment_0 ) ) )
            // InternalMml.g:2107:1: ( ( rule__PredictorVariables__NameAssignment_0 ) )
            {
            // InternalMml.g:2107:1: ( ( rule__PredictorVariables__NameAssignment_0 ) )
            // InternalMml.g:2108:2: ( rule__PredictorVariables__NameAssignment_0 )
            {
             before(grammarAccess.getPredictorVariablesAccess().getNameAssignment_0()); 
            // InternalMml.g:2109:2: ( rule__PredictorVariables__NameAssignment_0 )
            // InternalMml.g:2109:3: rule__PredictorVariables__NameAssignment_0
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
    // InternalMml.g:2117:1: rule__PredictorVariables__Group__1 : rule__PredictorVariables__Group__1__Impl ;
    public final void rule__PredictorVariables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2121:1: ( rule__PredictorVariables__Group__1__Impl )
            // InternalMml.g:2122:2: rule__PredictorVariables__Group__1__Impl
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
    // InternalMml.g:2128:1: rule__PredictorVariables__Group__1__Impl : ( ( rule__PredictorVariables__Group_1__0 ) ) ;
    public final void rule__PredictorVariables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2132:1: ( ( ( rule__PredictorVariables__Group_1__0 ) ) )
            // InternalMml.g:2133:1: ( ( rule__PredictorVariables__Group_1__0 ) )
            {
            // InternalMml.g:2133:1: ( ( rule__PredictorVariables__Group_1__0 ) )
            // InternalMml.g:2134:2: ( rule__PredictorVariables__Group_1__0 )
            {
             before(grammarAccess.getPredictorVariablesAccess().getGroup_1()); 
            // InternalMml.g:2135:2: ( rule__PredictorVariables__Group_1__0 )
            // InternalMml.g:2135:3: rule__PredictorVariables__Group_1__0
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
    // InternalMml.g:2144:1: rule__PredictorVariables__Group_1__0 : rule__PredictorVariables__Group_1__0__Impl rule__PredictorVariables__Group_1__1 ;
    public final void rule__PredictorVariables__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2148:1: ( rule__PredictorVariables__Group_1__0__Impl rule__PredictorVariables__Group_1__1 )
            // InternalMml.g:2149:2: rule__PredictorVariables__Group_1__0__Impl rule__PredictorVariables__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMml.g:2156:1: rule__PredictorVariables__Group_1__0__Impl : ( ( rule__PredictorVariables__VarsAssignment_1_0 ) ) ;
    public final void rule__PredictorVariables__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2160:1: ( ( ( rule__PredictorVariables__VarsAssignment_1_0 ) ) )
            // InternalMml.g:2161:1: ( ( rule__PredictorVariables__VarsAssignment_1_0 ) )
            {
            // InternalMml.g:2161:1: ( ( rule__PredictorVariables__VarsAssignment_1_0 ) )
            // InternalMml.g:2162:2: ( rule__PredictorVariables__VarsAssignment_1_0 )
            {
             before(grammarAccess.getPredictorVariablesAccess().getVarsAssignment_1_0()); 
            // InternalMml.g:2163:2: ( rule__PredictorVariables__VarsAssignment_1_0 )
            // InternalMml.g:2163:3: rule__PredictorVariables__VarsAssignment_1_0
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
    // InternalMml.g:2171:1: rule__PredictorVariables__Group_1__1 : rule__PredictorVariables__Group_1__1__Impl ;
    public final void rule__PredictorVariables__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2175:1: ( rule__PredictorVariables__Group_1__1__Impl )
            // InternalMml.g:2176:2: rule__PredictorVariables__Group_1__1__Impl
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
    // InternalMml.g:2182:1: rule__PredictorVariables__Group_1__1__Impl : ( ( rule__PredictorVariables__Group_1_1__0 )* ) ;
    public final void rule__PredictorVariables__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2186:1: ( ( ( rule__PredictorVariables__Group_1_1__0 )* ) )
            // InternalMml.g:2187:1: ( ( rule__PredictorVariables__Group_1_1__0 )* )
            {
            // InternalMml.g:2187:1: ( ( rule__PredictorVariables__Group_1_1__0 )* )
            // InternalMml.g:2188:2: ( rule__PredictorVariables__Group_1_1__0 )*
            {
             before(grammarAccess.getPredictorVariablesAccess().getGroup_1_1()); 
            // InternalMml.g:2189:2: ( rule__PredictorVariables__Group_1_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==41) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMml.g:2189:3: rule__PredictorVariables__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__PredictorVariables__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMml.g:2198:1: rule__PredictorVariables__Group_1_1__0 : rule__PredictorVariables__Group_1_1__0__Impl rule__PredictorVariables__Group_1_1__1 ;
    public final void rule__PredictorVariables__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2202:1: ( rule__PredictorVariables__Group_1_1__0__Impl rule__PredictorVariables__Group_1_1__1 )
            // InternalMml.g:2203:2: rule__PredictorVariables__Group_1_1__0__Impl rule__PredictorVariables__Group_1_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMml.g:2210:1: rule__PredictorVariables__Group_1_1__0__Impl : ( '+' ) ;
    public final void rule__PredictorVariables__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2214:1: ( ( '+' ) )
            // InternalMml.g:2215:1: ( '+' )
            {
            // InternalMml.g:2215:1: ( '+' )
            // InternalMml.g:2216:2: '+'
            {
             before(grammarAccess.getPredictorVariablesAccess().getPlusSignKeyword_1_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMml.g:2225:1: rule__PredictorVariables__Group_1_1__1 : rule__PredictorVariables__Group_1_1__1__Impl ;
    public final void rule__PredictorVariables__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2229:1: ( rule__PredictorVariables__Group_1_1__1__Impl )
            // InternalMml.g:2230:2: rule__PredictorVariables__Group_1_1__1__Impl
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
    // InternalMml.g:2236:1: rule__PredictorVariables__Group_1_1__1__Impl : ( ( rule__PredictorVariables__VarsAssignment_1_1_1 ) ) ;
    public final void rule__PredictorVariables__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2240:1: ( ( ( rule__PredictorVariables__VarsAssignment_1_1_1 ) ) )
            // InternalMml.g:2241:1: ( ( rule__PredictorVariables__VarsAssignment_1_1_1 ) )
            {
            // InternalMml.g:2241:1: ( ( rule__PredictorVariables__VarsAssignment_1_1_1 ) )
            // InternalMml.g:2242:2: ( rule__PredictorVariables__VarsAssignment_1_1_1 )
            {
             before(grammarAccess.getPredictorVariablesAccess().getVarsAssignment_1_1_1()); 
            // InternalMml.g:2243:2: ( rule__PredictorVariables__VarsAssignment_1_1_1 )
            // InternalMml.g:2243:3: rule__PredictorVariables__VarsAssignment_1_1_1
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
    // InternalMml.g:2252:1: rule__Validation__Group__0 : rule__Validation__Group__0__Impl rule__Validation__Group__1 ;
    public final void rule__Validation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2256:1: ( rule__Validation__Group__0__Impl rule__Validation__Group__1 )
            // InternalMml.g:2257:2: rule__Validation__Group__0__Impl rule__Validation__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMml.g:2264:1: rule__Validation__Group__0__Impl : ( ( rule__Validation__StratificationAssignment_0 ) ) ;
    public final void rule__Validation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2268:1: ( ( ( rule__Validation__StratificationAssignment_0 ) ) )
            // InternalMml.g:2269:1: ( ( rule__Validation__StratificationAssignment_0 ) )
            {
            // InternalMml.g:2269:1: ( ( rule__Validation__StratificationAssignment_0 ) )
            // InternalMml.g:2270:2: ( rule__Validation__StratificationAssignment_0 )
            {
             before(grammarAccess.getValidationAccess().getStratificationAssignment_0()); 
            // InternalMml.g:2271:2: ( rule__Validation__StratificationAssignment_0 )
            // InternalMml.g:2271:3: rule__Validation__StratificationAssignment_0
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
    // InternalMml.g:2279:1: rule__Validation__Group__1 : rule__Validation__Group__1__Impl ;
    public final void rule__Validation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2283:1: ( rule__Validation__Group__1__Impl )
            // InternalMml.g:2284:2: rule__Validation__Group__1__Impl
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
    // InternalMml.g:2290:1: rule__Validation__Group__1__Impl : ( ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* ) ) ;
    public final void rule__Validation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2294:1: ( ( ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* ) ) )
            // InternalMml.g:2295:1: ( ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* ) )
            {
            // InternalMml.g:2295:1: ( ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* ) )
            // InternalMml.g:2296:2: ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* )
            {
            // InternalMml.g:2296:2: ( ( rule__Validation__MetricAssignment_1 ) )
            // InternalMml.g:2297:3: ( rule__Validation__MetricAssignment_1 )
            {
             before(grammarAccess.getValidationAccess().getMetricAssignment_1()); 
            // InternalMml.g:2298:3: ( rule__Validation__MetricAssignment_1 )
            // InternalMml.g:2298:4: rule__Validation__MetricAssignment_1
            {
            pushFollow(FOLLOW_24);
            rule__Validation__MetricAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getMetricAssignment_1()); 

            }

            // InternalMml.g:2301:2: ( ( rule__Validation__MetricAssignment_1 )* )
            // InternalMml.g:2302:3: ( rule__Validation__MetricAssignment_1 )*
            {
             before(grammarAccess.getValidationAccess().getMetricAssignment_1()); 
            // InternalMml.g:2303:3: ( rule__Validation__MetricAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=24 && LA22_0<=26)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMml.g:2303:4: rule__Validation__MetricAssignment_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Validation__MetricAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalMml.g:2313:1: rule__TrainingTest__Group__0 : rule__TrainingTest__Group__0__Impl rule__TrainingTest__Group__1 ;
    public final void rule__TrainingTest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2317:1: ( rule__TrainingTest__Group__0__Impl rule__TrainingTest__Group__1 )
            // InternalMml.g:2318:2: rule__TrainingTest__Group__0__Impl rule__TrainingTest__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMml.g:2325:1: rule__TrainingTest__Group__0__Impl : ( ( rule__TrainingTest__NameAssignment_0 ) ) ;
    public final void rule__TrainingTest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2329:1: ( ( ( rule__TrainingTest__NameAssignment_0 ) ) )
            // InternalMml.g:2330:1: ( ( rule__TrainingTest__NameAssignment_0 ) )
            {
            // InternalMml.g:2330:1: ( ( rule__TrainingTest__NameAssignment_0 ) )
            // InternalMml.g:2331:2: ( rule__TrainingTest__NameAssignment_0 )
            {
             before(grammarAccess.getTrainingTestAccess().getNameAssignment_0()); 
            // InternalMml.g:2332:2: ( rule__TrainingTest__NameAssignment_0 )
            // InternalMml.g:2332:3: rule__TrainingTest__NameAssignment_0
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
    // InternalMml.g:2340:1: rule__TrainingTest__Group__1 : rule__TrainingTest__Group__1__Impl rule__TrainingTest__Group__2 ;
    public final void rule__TrainingTest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2344:1: ( rule__TrainingTest__Group__1__Impl rule__TrainingTest__Group__2 )
            // InternalMml.g:2345:2: rule__TrainingTest__Group__1__Impl rule__TrainingTest__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMml.g:2352:1: rule__TrainingTest__Group__1__Impl : ( '{' ) ;
    public final void rule__TrainingTest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2356:1: ( ( '{' ) )
            // InternalMml.g:2357:1: ( '{' )
            {
            // InternalMml.g:2357:1: ( '{' )
            // InternalMml.g:2358:2: '{'
            {
             before(grammarAccess.getTrainingTestAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMml.g:2367:1: rule__TrainingTest__Group__2 : rule__TrainingTest__Group__2__Impl rule__TrainingTest__Group__3 ;
    public final void rule__TrainingTest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2371:1: ( rule__TrainingTest__Group__2__Impl rule__TrainingTest__Group__3 )
            // InternalMml.g:2372:2: rule__TrainingTest__Group__2__Impl rule__TrainingTest__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMml.g:2379:1: rule__TrainingTest__Group__2__Impl : ( 'pourcentageTraining' ) ;
    public final void rule__TrainingTest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2383:1: ( ( 'pourcentageTraining' ) )
            // InternalMml.g:2384:1: ( 'pourcentageTraining' )
            {
            // InternalMml.g:2384:1: ( 'pourcentageTraining' )
            // InternalMml.g:2385:2: 'pourcentageTraining'
            {
             before(grammarAccess.getTrainingTestAccess().getPourcentageTrainingKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMml.g:2394:1: rule__TrainingTest__Group__3 : rule__TrainingTest__Group__3__Impl rule__TrainingTest__Group__4 ;
    public final void rule__TrainingTest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2398:1: ( rule__TrainingTest__Group__3__Impl rule__TrainingTest__Group__4 )
            // InternalMml.g:2399:2: rule__TrainingTest__Group__3__Impl rule__TrainingTest__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalMml.g:2406:1: rule__TrainingTest__Group__3__Impl : ( ( rule__TrainingTest__NumberAssignment_3 ) ) ;
    public final void rule__TrainingTest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2410:1: ( ( ( rule__TrainingTest__NumberAssignment_3 ) ) )
            // InternalMml.g:2411:1: ( ( rule__TrainingTest__NumberAssignment_3 ) )
            {
            // InternalMml.g:2411:1: ( ( rule__TrainingTest__NumberAssignment_3 ) )
            // InternalMml.g:2412:2: ( rule__TrainingTest__NumberAssignment_3 )
            {
             before(grammarAccess.getTrainingTestAccess().getNumberAssignment_3()); 
            // InternalMml.g:2413:2: ( rule__TrainingTest__NumberAssignment_3 )
            // InternalMml.g:2413:3: rule__TrainingTest__NumberAssignment_3
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
    // InternalMml.g:2421:1: rule__TrainingTest__Group__4 : rule__TrainingTest__Group__4__Impl ;
    public final void rule__TrainingTest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2425:1: ( rule__TrainingTest__Group__4__Impl )
            // InternalMml.g:2426:2: rule__TrainingTest__Group__4__Impl
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
    // InternalMml.g:2432:1: rule__TrainingTest__Group__4__Impl : ( '}' ) ;
    public final void rule__TrainingTest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2436:1: ( ( '}' ) )
            // InternalMml.g:2437:1: ( '}' )
            {
            // InternalMml.g:2437:1: ( '}' )
            // InternalMml.g:2438:2: '}'
            {
             before(grammarAccess.getTrainingTestAccess().getRightCurlyBracketKeyword_4()); 
            match(input,44,FOLLOW_2); 
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


    // $ANTLR start "rule__MMLModel__PreamAssignment_1"
    // InternalMml.g:2448:1: rule__MMLModel__PreamAssignment_1 : ( rulePREAMBULE ) ;
    public final void rule__MMLModel__PreamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2452:1: ( ( rulePREAMBULE ) )
            // InternalMml.g:2453:2: ( rulePREAMBULE )
            {
            // InternalMml.g:2453:2: ( rulePREAMBULE )
            // InternalMml.g:2454:3: rulePREAMBULE
            {
             before(grammarAccess.getMMLModelAccess().getPreamPREAMBULEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePREAMBULE();

            state._fsp--;

             after(grammarAccess.getMMLModelAccess().getPreamPREAMBULEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__PreamAssignment_1"


    // $ANTLR start "rule__MMLModel__InputAssignment_2"
    // InternalMml.g:2463:1: rule__MMLModel__InputAssignment_2 : ( ruleDataInput ) ;
    public final void rule__MMLModel__InputAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2467:1: ( ( ruleDataInput ) )
            // InternalMml.g:2468:2: ( ruleDataInput )
            {
            // InternalMml.g:2468:2: ( ruleDataInput )
            // InternalMml.g:2469:3: ruleDataInput
            {
             before(grammarAccess.getMMLModelAccess().getInputDataInputParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataInput();

            state._fsp--;

             after(grammarAccess.getMMLModelAccess().getInputDataInputParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__InputAssignment_2"


    // $ANTLR start "rule__MMLModel__AlgorithmAssignment_3"
    // InternalMml.g:2478:1: rule__MMLModel__AlgorithmAssignment_3 : ( ruleMLChoiceAlgorithm ) ;
    public final void rule__MMLModel__AlgorithmAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2482:1: ( ( ruleMLChoiceAlgorithm ) )
            // InternalMml.g:2483:2: ( ruleMLChoiceAlgorithm )
            {
            // InternalMml.g:2483:2: ( ruleMLChoiceAlgorithm )
            // InternalMml.g:2484:3: ruleMLChoiceAlgorithm
            {
             before(grammarAccess.getMMLModelAccess().getAlgorithmMLChoiceAlgorithmParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMLChoiceAlgorithm();

            state._fsp--;

             after(grammarAccess.getMMLModelAccess().getAlgorithmMLChoiceAlgorithmParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__AlgorithmAssignment_3"


    // $ANTLR start "rule__MMLModel__FormulaAssignment_4"
    // InternalMml.g:2493:1: rule__MMLModel__FormulaAssignment_4 : ( ruleRFormula ) ;
    public final void rule__MMLModel__FormulaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2497:1: ( ( ruleRFormula ) )
            // InternalMml.g:2498:2: ( ruleRFormula )
            {
            // InternalMml.g:2498:2: ( ruleRFormula )
            // InternalMml.g:2499:3: ruleRFormula
            {
             before(grammarAccess.getMMLModelAccess().getFormulaRFormulaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRFormula();

            state._fsp--;

             after(grammarAccess.getMMLModelAccess().getFormulaRFormulaParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__FormulaAssignment_4"


    // $ANTLR start "rule__MMLModel__ValidationAssignment_5"
    // InternalMml.g:2508:1: rule__MMLModel__ValidationAssignment_5 : ( ruleValidation ) ;
    public final void rule__MMLModel__ValidationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2512:1: ( ( ruleValidation ) )
            // InternalMml.g:2513:2: ( ruleValidation )
            {
            // InternalMml.g:2513:2: ( ruleValidation )
            // InternalMml.g:2514:3: ruleValidation
            {
             before(grammarAccess.getMMLModelAccess().getValidationValidationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleValidation();

            state._fsp--;

             after(grammarAccess.getMMLModelAccess().getValidationValidationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__ValidationAssignment_5"


    // $ANTLR start "rule__PREAMBULE__NomProgrammeAssignment"
    // InternalMml.g:2523:1: rule__PREAMBULE__NomProgrammeAssignment : ( RULE_ID ) ;
    public final void rule__PREAMBULE__NomProgrammeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2527:1: ( ( RULE_ID ) )
            // InternalMml.g:2528:2: ( RULE_ID )
            {
            // InternalMml.g:2528:2: ( RULE_ID )
            // InternalMml.g:2529:3: RULE_ID
            {
             before(grammarAccess.getPREAMBULEAccess().getNomProgrammeIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPREAMBULEAccess().getNomProgrammeIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PREAMBULE__NomProgrammeAssignment"


    // $ANTLR start "rule__DataInput__FilelocationAssignment_1"
    // InternalMml.g:2538:1: rule__DataInput__FilelocationAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DataInput__FilelocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2542:1: ( ( RULE_STRING ) )
            // InternalMml.g:2543:2: ( RULE_STRING )
            {
            // InternalMml.g:2543:2: ( RULE_STRING )
            // InternalMml.g:2544:3: RULE_STRING
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
    // InternalMml.g:2553:1: rule__DataInput__ParsingInstructionAssignment_2 : ( ruleCSVParsingConfiguration ) ;
    public final void rule__DataInput__ParsingInstructionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2557:1: ( ( ruleCSVParsingConfiguration ) )
            // InternalMml.g:2558:2: ( ruleCSVParsingConfiguration )
            {
            // InternalMml.g:2558:2: ( ruleCSVParsingConfiguration )
            // InternalMml.g:2559:3: ruleCSVParsingConfiguration
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
    // InternalMml.g:2568:1: rule__CSVParsingConfiguration__SepAssignment_1 : ( ruleCSVSeparator ) ;
    public final void rule__CSVParsingConfiguration__SepAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2572:1: ( ( ruleCSVSeparator ) )
            // InternalMml.g:2573:2: ( ruleCSVSeparator )
            {
            // InternalMml.g:2573:2: ( ruleCSVSeparator )
            // InternalMml.g:2574:3: ruleCSVSeparator
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
    // InternalMml.g:2583:1: rule__MLChoiceAlgorithm__FrameworkAssignment_1 : ( ruleFrameworkLang ) ;
    public final void rule__MLChoiceAlgorithm__FrameworkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2587:1: ( ( ruleFrameworkLang ) )
            // InternalMml.g:2588:2: ( ruleFrameworkLang )
            {
            // InternalMml.g:2588:2: ( ruleFrameworkLang )
            // InternalMml.g:2589:3: ruleFrameworkLang
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
    // InternalMml.g:2598:1: rule__MLChoiceAlgorithm__AlgorithmAssignment_3 : ( ruleMLAlgorithm ) ;
    public final void rule__MLChoiceAlgorithm__AlgorithmAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2602:1: ( ( ruleMLAlgorithm ) )
            // InternalMml.g:2603:2: ( ruleMLAlgorithm )
            {
            // InternalMml.g:2603:2: ( ruleMLAlgorithm )
            // InternalMml.g:2604:3: ruleMLAlgorithm
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
    // InternalMml.g:2613:1: rule__SVM__NameAssignment_0 : ( ( 'SVM' ) ) ;
    public final void rule__SVM__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2617:1: ( ( ( 'SVM' ) ) )
            // InternalMml.g:2618:2: ( ( 'SVM' ) )
            {
            // InternalMml.g:2618:2: ( ( 'SVM' ) )
            // InternalMml.g:2619:3: ( 'SVM' )
            {
             before(grammarAccess.getSVMAccess().getNameSVMKeyword_0_0()); 
            // InternalMml.g:2620:3: ( 'SVM' )
            // InternalMml.g:2621:4: 'SVM'
            {
             before(grammarAccess.getSVMAccess().getNameSVMKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMml.g:2632:1: rule__SVM__GammaAssignment_1_1 : ( ruleFLOAT ) ;
    public final void rule__SVM__GammaAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2636:1: ( ( ruleFLOAT ) )
            // InternalMml.g:2637:2: ( ruleFLOAT )
            {
            // InternalMml.g:2637:2: ( ruleFLOAT )
            // InternalMml.g:2638:3: ruleFLOAT
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
    // InternalMml.g:2647:1: rule__SVM__CAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__SVM__CAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2651:1: ( ( ruleFLOAT ) )
            // InternalMml.g:2652:2: ( ruleFLOAT )
            {
            // InternalMml.g:2652:2: ( ruleFLOAT )
            // InternalMml.g:2653:3: ruleFLOAT
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
    // InternalMml.g:2662:1: rule__SVM__KernelAssignment_3_1 : ( ruleSVMKernel ) ;
    public final void rule__SVM__KernelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2666:1: ( ( ruleSVMKernel ) )
            // InternalMml.g:2667:2: ( ruleSVMKernel )
            {
            // InternalMml.g:2667:2: ( ruleSVMKernel )
            // InternalMml.g:2668:3: ruleSVMKernel
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
    // InternalMml.g:2677:1: rule__SVM__SvmclassificationAssignment_4_1 : ( ruleSVMClassification ) ;
    public final void rule__SVM__SvmclassificationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2681:1: ( ( ruleSVMClassification ) )
            // InternalMml.g:2682:2: ( ruleSVMClassification )
            {
            // InternalMml.g:2682:2: ( ruleSVMClassification )
            // InternalMml.g:2683:3: ruleSVMClassification
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
    // InternalMml.g:2692:1: rule__DT__NameAssignment_0 : ( ( 'DT' ) ) ;
    public final void rule__DT__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2696:1: ( ( ( 'DT' ) ) )
            // InternalMml.g:2697:2: ( ( 'DT' ) )
            {
            // InternalMml.g:2697:2: ( ( 'DT' ) )
            // InternalMml.g:2698:3: ( 'DT' )
            {
             before(grammarAccess.getDTAccess().getNameDTKeyword_0_0()); 
            // InternalMml.g:2699:3: ( 'DT' )
            // InternalMml.g:2700:4: 'DT'
            {
             before(grammarAccess.getDTAccess().getNameDTKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMml.g:2711:1: rule__DT__Max_depthAssignment_1 : ( RULE_INT ) ;
    public final void rule__DT__Max_depthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2715:1: ( ( RULE_INT ) )
            // InternalMml.g:2716:2: ( RULE_INT )
            {
            // InternalMml.g:2716:2: ( RULE_INT )
            // InternalMml.g:2717:3: RULE_INT
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


    // $ANTLR start "rule__RandomForest__NameAssignment_0"
    // InternalMml.g:2726:1: rule__RandomForest__NameAssignment_0 : ( ( 'RandomForest' ) ) ;
    public final void rule__RandomForest__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2730:1: ( ( ( 'RandomForest' ) ) )
            // InternalMml.g:2731:2: ( ( 'RandomForest' ) )
            {
            // InternalMml.g:2731:2: ( ( 'RandomForest' ) )
            // InternalMml.g:2732:3: ( 'RandomForest' )
            {
             before(grammarAccess.getRandomForestAccess().getNameRandomForestKeyword_0_0()); 
            // InternalMml.g:2733:3: ( 'RandomForest' )
            // InternalMml.g:2734:4: 'RandomForest'
            {
             before(grammarAccess.getRandomForestAccess().getNameRandomForestKeyword_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRandomForestAccess().getNameRandomForestKeyword_0_0()); 

            }

             after(grammarAccess.getRandomForestAccess().getNameRandomForestKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomForest__NameAssignment_0"


    // $ANTLR start "rule__RandomForest__NtreeAssignment_1"
    // InternalMml.g:2745:1: rule__RandomForest__NtreeAssignment_1 : ( RULE_INT ) ;
    public final void rule__RandomForest__NtreeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2749:1: ( ( RULE_INT ) )
            // InternalMml.g:2750:2: ( RULE_INT )
            {
            // InternalMml.g:2750:2: ( RULE_INT )
            // InternalMml.g:2751:3: RULE_INT
            {
             before(grammarAccess.getRandomForestAccess().getNtreeINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRandomForestAccess().getNtreeINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomForest__NtreeAssignment_1"


    // $ANTLR start "rule__LogisticRegression__NameAssignment_0"
    // InternalMml.g:2760:1: rule__LogisticRegression__NameAssignment_0 : ( ( 'LogisticRegression' ) ) ;
    public final void rule__LogisticRegression__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2764:1: ( ( ( 'LogisticRegression' ) ) )
            // InternalMml.g:2765:2: ( ( 'LogisticRegression' ) )
            {
            // InternalMml.g:2765:2: ( ( 'LogisticRegression' ) )
            // InternalMml.g:2766:3: ( 'LogisticRegression' )
            {
             before(grammarAccess.getLogisticRegressionAccess().getNameLogisticRegressionKeyword_0_0()); 
            // InternalMml.g:2767:3: ( 'LogisticRegression' )
            // InternalMml.g:2768:4: 'LogisticRegression'
            {
             before(grammarAccess.getLogisticRegressionAccess().getNameLogisticRegressionKeyword_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getLogisticRegressionAccess().getNameLogisticRegressionKeyword_0_0()); 

            }

             after(grammarAccess.getLogisticRegressionAccess().getNameLogisticRegressionKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogisticRegression__NameAssignment_0"


    // $ANTLR start "rule__LogisticRegression__ClassAssignment_2"
    // InternalMml.g:2779:1: rule__LogisticRegression__ClassAssignment_2 : ( ruleCLASS ) ;
    public final void rule__LogisticRegression__ClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2783:1: ( ( ruleCLASS ) )
            // InternalMml.g:2784:2: ( ruleCLASS )
            {
            // InternalMml.g:2784:2: ( ruleCLASS )
            // InternalMml.g:2785:3: ruleCLASS
            {
             before(grammarAccess.getLogisticRegressionAccess().getClassCLASSEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCLASS();

            state._fsp--;

             after(grammarAccess.getLogisticRegressionAccess().getClassCLASSEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogisticRegression__ClassAssignment_2"


    // $ANTLR start "rule__RFormula__PredictiveAssignment_1_0"
    // InternalMml.g:2794:1: rule__RFormula__PredictiveAssignment_1_0 : ( ruleFormulaItem ) ;
    public final void rule__RFormula__PredictiveAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2798:1: ( ( ruleFormulaItem ) )
            // InternalMml.g:2799:2: ( ruleFormulaItem )
            {
            // InternalMml.g:2799:2: ( ruleFormulaItem )
            // InternalMml.g:2800:3: ruleFormulaItem
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
    // InternalMml.g:2809:1: rule__RFormula__PredictorsAssignment_2 : ( ruleXFormula ) ;
    public final void rule__RFormula__PredictorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2813:1: ( ( ruleXFormula ) )
            // InternalMml.g:2814:2: ( ruleXFormula )
            {
            // InternalMml.g:2814:2: ( ruleXFormula )
            // InternalMml.g:2815:3: ruleXFormula
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
    // InternalMml.g:2824:1: rule__AllVariables__NameAssignment_0 : ( ( 'all' ) ) ;
    public final void rule__AllVariables__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2828:1: ( ( ( 'all' ) ) )
            // InternalMml.g:2829:2: ( ( 'all' ) )
            {
            // InternalMml.g:2829:2: ( ( 'all' ) )
            // InternalMml.g:2830:3: ( 'all' )
            {
             before(grammarAccess.getAllVariablesAccess().getNameAllKeyword_0_0()); 
            // InternalMml.g:2831:3: ( 'all' )
            // InternalMml.g:2832:4: 'all'
            {
             before(grammarAccess.getAllVariablesAccess().getNameAllKeyword_0_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMml.g:2843:1: rule__AllVariables__AllAssignment_1 : ( ( '.' ) ) ;
    public final void rule__AllVariables__AllAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2847:1: ( ( ( '.' ) ) )
            // InternalMml.g:2848:2: ( ( '.' ) )
            {
            // InternalMml.g:2848:2: ( ( '.' ) )
            // InternalMml.g:2849:3: ( '.' )
            {
             before(grammarAccess.getAllVariablesAccess().getAllFullStopKeyword_1_0()); 
            // InternalMml.g:2850:3: ( '.' )
            // InternalMml.g:2851:4: '.'
            {
             before(grammarAccess.getAllVariablesAccess().getAllFullStopKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMml.g:2862:1: rule__PredictorVariables__NameAssignment_0 : ( ( 'PredictorVariables' ) ) ;
    public final void rule__PredictorVariables__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2866:1: ( ( ( 'PredictorVariables' ) ) )
            // InternalMml.g:2867:2: ( ( 'PredictorVariables' ) )
            {
            // InternalMml.g:2867:2: ( ( 'PredictorVariables' ) )
            // InternalMml.g:2868:3: ( 'PredictorVariables' )
            {
             before(grammarAccess.getPredictorVariablesAccess().getNamePredictorVariablesKeyword_0_0()); 
            // InternalMml.g:2869:3: ( 'PredictorVariables' )
            // InternalMml.g:2870:4: 'PredictorVariables'
            {
             before(grammarAccess.getPredictorVariablesAccess().getNamePredictorVariablesKeyword_0_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMml.g:2881:1: rule__PredictorVariables__VarsAssignment_1_0 : ( ruleFormulaItem ) ;
    public final void rule__PredictorVariables__VarsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2885:1: ( ( ruleFormulaItem ) )
            // InternalMml.g:2886:2: ( ruleFormulaItem )
            {
            // InternalMml.g:2886:2: ( ruleFormulaItem )
            // InternalMml.g:2887:3: ruleFormulaItem
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
    // InternalMml.g:2896:1: rule__PredictorVariables__VarsAssignment_1_1_1 : ( ruleFormulaItem ) ;
    public final void rule__PredictorVariables__VarsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2900:1: ( ( ruleFormulaItem ) )
            // InternalMml.g:2901:2: ( ruleFormulaItem )
            {
            // InternalMml.g:2901:2: ( ruleFormulaItem )
            // InternalMml.g:2902:3: ruleFormulaItem
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
    // InternalMml.g:2911:1: rule__FormulaItem__ColumnAssignment_0 : ( RULE_INT ) ;
    public final void rule__FormulaItem__ColumnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2915:1: ( ( RULE_INT ) )
            // InternalMml.g:2916:2: ( RULE_INT )
            {
            // InternalMml.g:2916:2: ( RULE_INT )
            // InternalMml.g:2917:3: RULE_INT
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
    // InternalMml.g:2926:1: rule__FormulaItem__ColNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FormulaItem__ColNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2930:1: ( ( RULE_STRING ) )
            // InternalMml.g:2931:2: ( RULE_STRING )
            {
            // InternalMml.g:2931:2: ( RULE_STRING )
            // InternalMml.g:2932:3: RULE_STRING
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
    // InternalMml.g:2941:1: rule__Validation__StratificationAssignment_0 : ( ruleStratificationMethod ) ;
    public final void rule__Validation__StratificationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2945:1: ( ( ruleStratificationMethod ) )
            // InternalMml.g:2946:2: ( ruleStratificationMethod )
            {
            // InternalMml.g:2946:2: ( ruleStratificationMethod )
            // InternalMml.g:2947:3: ruleStratificationMethod
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
    // InternalMml.g:2956:1: rule__Validation__MetricAssignment_1 : ( ruleValidationMetric ) ;
    public final void rule__Validation__MetricAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2960:1: ( ( ruleValidationMetric ) )
            // InternalMml.g:2961:2: ( ruleValidationMetric )
            {
            // InternalMml.g:2961:2: ( ruleValidationMetric )
            // InternalMml.g:2962:3: ruleValidationMetric
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
    // InternalMml.g:2971:1: rule__TrainingTest__NameAssignment_0 : ( ( 'TrainingTest' ) ) ;
    public final void rule__TrainingTest__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2975:1: ( ( ( 'TrainingTest' ) ) )
            // InternalMml.g:2976:2: ( ( 'TrainingTest' ) )
            {
            // InternalMml.g:2976:2: ( ( 'TrainingTest' ) )
            // InternalMml.g:2977:3: ( 'TrainingTest' )
            {
             before(grammarAccess.getTrainingTestAccess().getNameTrainingTestKeyword_0_0()); 
            // InternalMml.g:2978:3: ( 'TrainingTest' )
            // InternalMml.g:2979:4: 'TrainingTest'
            {
             before(grammarAccess.getTrainingTestAccess().getNameTrainingTestKeyword_0_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMml.g:2990:1: rule__TrainingTest__NumberAssignment_3 : ( ruleFLOAT ) ;
    public final void rule__TrainingTest__NumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2994:1: ( ( ruleFLOAT ) )
            // InternalMml.g:2995:2: ( ruleFLOAT )
            {
            // InternalMml.g:2995:2: ( ruleFLOAT )
            // InternalMml.g:2996:3: ruleFLOAT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00080080A0000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001E00000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0006000000000050L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000000L});

}