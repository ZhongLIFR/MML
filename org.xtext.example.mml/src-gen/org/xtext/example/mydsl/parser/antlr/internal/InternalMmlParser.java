package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMmlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model:'", "'End.'", "'datainput'", "'separator'", "'mlframework'", "'algorithm'", "'SVM'", "'gamma='", "'C='", "'kernel='", "'classification'", "'DT'", "'RandomForest'", "'LogisticRegression'", "'class='", "'.'", "'formula'", "'~'", "'all'", "'PredictorVariables'", "'+'", "'TrainingTest'", "'{'", "'pourcentageTraining'", "'}'", "','", "';'", "'scikit-learn'", "'R'", "'linear'", "'polynomial'", "'radial'", "'C-classification'", "'nu-classification'", "'one-classification'", "'binomial'", "'gaussian'", "'poisson'", "'recall'", "'precision'", "'F1'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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

        public InternalMmlParser(TokenStream input, MmlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MMLModel";
       	}

       	@Override
       	protected MmlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMMLModel"
    // InternalMml.g:65:1: entryRuleMMLModel returns [EObject current=null] : iv_ruleMMLModel= ruleMMLModel EOF ;
    public final EObject entryRuleMMLModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMMLModel = null;


        try {
            // InternalMml.g:65:49: (iv_ruleMMLModel= ruleMMLModel EOF )
            // InternalMml.g:66:2: iv_ruleMMLModel= ruleMMLModel EOF
            {
             newCompositeNode(grammarAccess.getMMLModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMMLModel=ruleMMLModel();

            state._fsp--;

             current =iv_ruleMMLModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMMLModel"


    // $ANTLR start "ruleMMLModel"
    // InternalMml.g:72:1: ruleMMLModel returns [EObject current=null] : (otherlv_0= 'Model:' ( (lv_pream_1_0= rulePREAMBULE ) )? ( (lv_input_2_0= ruleDataInput ) )? ( (lv_algorithm_3_0= ruleMLChoiceAlgorithm ) )? ( (lv_formula_4_0= ruleRFormula ) )? ( (lv_validation_5_0= ruleValidation ) ) otherlv_6= 'End.' ) ;
    public final EObject ruleMMLModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_6=null;
        EObject lv_pream_1_0 = null;

        EObject lv_input_2_0 = null;

        EObject lv_algorithm_3_0 = null;

        EObject lv_formula_4_0 = null;

        EObject lv_validation_5_0 = null;



        	enterRule();

        try {
            // InternalMml.g:78:2: ( (otherlv_0= 'Model:' ( (lv_pream_1_0= rulePREAMBULE ) )? ( (lv_input_2_0= ruleDataInput ) )? ( (lv_algorithm_3_0= ruleMLChoiceAlgorithm ) )? ( (lv_formula_4_0= ruleRFormula ) )? ( (lv_validation_5_0= ruleValidation ) ) otherlv_6= 'End.' ) )
            // InternalMml.g:79:2: (otherlv_0= 'Model:' ( (lv_pream_1_0= rulePREAMBULE ) )? ( (lv_input_2_0= ruleDataInput ) )? ( (lv_algorithm_3_0= ruleMLChoiceAlgorithm ) )? ( (lv_formula_4_0= ruleRFormula ) )? ( (lv_validation_5_0= ruleValidation ) ) otherlv_6= 'End.' )
            {
            // InternalMml.g:79:2: (otherlv_0= 'Model:' ( (lv_pream_1_0= rulePREAMBULE ) )? ( (lv_input_2_0= ruleDataInput ) )? ( (lv_algorithm_3_0= ruleMLChoiceAlgorithm ) )? ( (lv_formula_4_0= ruleRFormula ) )? ( (lv_validation_5_0= ruleValidation ) ) otherlv_6= 'End.' )
            // InternalMml.g:80:3: otherlv_0= 'Model:' ( (lv_pream_1_0= rulePREAMBULE ) )? ( (lv_input_2_0= ruleDataInput ) )? ( (lv_algorithm_3_0= ruleMLChoiceAlgorithm ) )? ( (lv_formula_4_0= ruleRFormula ) )? ( (lv_validation_5_0= ruleValidation ) ) otherlv_6= 'End.'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMMLModelAccess().getModelKeyword_0());
            		
            // InternalMml.g:84:3: ( (lv_pream_1_0= rulePREAMBULE ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMml.g:85:4: (lv_pream_1_0= rulePREAMBULE )
                    {
                    // InternalMml.g:85:4: (lv_pream_1_0= rulePREAMBULE )
                    // InternalMml.g:86:5: lv_pream_1_0= rulePREAMBULE
                    {

                    					newCompositeNode(grammarAccess.getMMLModelAccess().getPreamPREAMBULEParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_pream_1_0=rulePREAMBULE();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMMLModelRule());
                    					}
                    					set(
                    						current,
                    						"pream",
                    						lv_pream_1_0,
                    						"org.xtext.example.mydsl.Mml.PREAMBULE");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMml.g:103:3: ( (lv_input_2_0= ruleDataInput ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMml.g:104:4: (lv_input_2_0= ruleDataInput )
                    {
                    // InternalMml.g:104:4: (lv_input_2_0= ruleDataInput )
                    // InternalMml.g:105:5: lv_input_2_0= ruleDataInput
                    {

                    					newCompositeNode(grammarAccess.getMMLModelAccess().getInputDataInputParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_input_2_0=ruleDataInput();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMMLModelRule());
                    					}
                    					set(
                    						current,
                    						"input",
                    						lv_input_2_0,
                    						"org.xtext.example.mydsl.Mml.DataInput");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMml.g:122:3: ( (lv_algorithm_3_0= ruleMLChoiceAlgorithm ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMml.g:123:4: (lv_algorithm_3_0= ruleMLChoiceAlgorithm )
                    {
                    // InternalMml.g:123:4: (lv_algorithm_3_0= ruleMLChoiceAlgorithm )
                    // InternalMml.g:124:5: lv_algorithm_3_0= ruleMLChoiceAlgorithm
                    {

                    					newCompositeNode(grammarAccess.getMMLModelAccess().getAlgorithmMLChoiceAlgorithmParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_algorithm_3_0=ruleMLChoiceAlgorithm();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMMLModelRule());
                    					}
                    					set(
                    						current,
                    						"algorithm",
                    						lv_algorithm_3_0,
                    						"org.xtext.example.mydsl.Mml.MLChoiceAlgorithm");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMml.g:141:3: ( (lv_formula_4_0= ruleRFormula ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMml.g:142:4: (lv_formula_4_0= ruleRFormula )
                    {
                    // InternalMml.g:142:4: (lv_formula_4_0= ruleRFormula )
                    // InternalMml.g:143:5: lv_formula_4_0= ruleRFormula
                    {

                    					newCompositeNode(grammarAccess.getMMLModelAccess().getFormulaRFormulaParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_formula_4_0=ruleRFormula();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMMLModelRule());
                    					}
                    					set(
                    						current,
                    						"formula",
                    						lv_formula_4_0,
                    						"org.xtext.example.mydsl.Mml.RFormula");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMml.g:160:3: ( (lv_validation_5_0= ruleValidation ) )
            // InternalMml.g:161:4: (lv_validation_5_0= ruleValidation )
            {
            // InternalMml.g:161:4: (lv_validation_5_0= ruleValidation )
            // InternalMml.g:162:5: lv_validation_5_0= ruleValidation
            {

            					newCompositeNode(grammarAccess.getMMLModelAccess().getValidationValidationParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_4);
            lv_validation_5_0=ruleValidation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMMLModelRule());
            					}
            					set(
            						current,
            						"validation",
            						lv_validation_5_0,
            						"org.xtext.example.mydsl.Mml.Validation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMMLModelAccess().getEndKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMMLModel"


    // $ANTLR start "entryRulePREAMBULE"
    // InternalMml.g:187:1: entryRulePREAMBULE returns [EObject current=null] : iv_rulePREAMBULE= rulePREAMBULE EOF ;
    public final EObject entryRulePREAMBULE() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePREAMBULE = null;


        try {
            // InternalMml.g:187:50: (iv_rulePREAMBULE= rulePREAMBULE EOF )
            // InternalMml.g:188:2: iv_rulePREAMBULE= rulePREAMBULE EOF
            {
             newCompositeNode(grammarAccess.getPREAMBULERule()); 
            pushFollow(FOLLOW_1);
            iv_rulePREAMBULE=rulePREAMBULE();

            state._fsp--;

             current =iv_rulePREAMBULE; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePREAMBULE"


    // $ANTLR start "rulePREAMBULE"
    // InternalMml.g:194:1: rulePREAMBULE returns [EObject current=null] : ( (lv_nomProgramme_0_0= RULE_ID ) ) ;
    public final EObject rulePREAMBULE() throws RecognitionException {
        EObject current = null;

        Token lv_nomProgramme_0_0=null;


        	enterRule();

        try {
            // InternalMml.g:200:2: ( ( (lv_nomProgramme_0_0= RULE_ID ) ) )
            // InternalMml.g:201:2: ( (lv_nomProgramme_0_0= RULE_ID ) )
            {
            // InternalMml.g:201:2: ( (lv_nomProgramme_0_0= RULE_ID ) )
            // InternalMml.g:202:3: (lv_nomProgramme_0_0= RULE_ID )
            {
            // InternalMml.g:202:3: (lv_nomProgramme_0_0= RULE_ID )
            // InternalMml.g:203:4: lv_nomProgramme_0_0= RULE_ID
            {
            lv_nomProgramme_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_nomProgramme_0_0, grammarAccess.getPREAMBULEAccess().getNomProgrammeIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPREAMBULERule());
            				}
            				setWithLastConsumed(
            					current,
            					"nomProgramme",
            					lv_nomProgramme_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePREAMBULE"


    // $ANTLR start "entryRuleDataInput"
    // InternalMml.g:222:1: entryRuleDataInput returns [EObject current=null] : iv_ruleDataInput= ruleDataInput EOF ;
    public final EObject entryRuleDataInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataInput = null;


        try {
            // InternalMml.g:222:50: (iv_ruleDataInput= ruleDataInput EOF )
            // InternalMml.g:223:2: iv_ruleDataInput= ruleDataInput EOF
            {
             newCompositeNode(grammarAccess.getDataInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataInput=ruleDataInput();

            state._fsp--;

             current =iv_ruleDataInput; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataInput"


    // $ANTLR start "ruleDataInput"
    // InternalMml.g:229:1: ruleDataInput returns [EObject current=null] : (otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )? ) ;
    public final EObject ruleDataInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_filelocation_1_0=null;
        EObject lv_parsingInstruction_2_0 = null;



        	enterRule();

        try {
            // InternalMml.g:235:2: ( (otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )? ) )
            // InternalMml.g:236:2: (otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )? )
            {
            // InternalMml.g:236:2: (otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )? )
            // InternalMml.g:237:3: otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataInputAccess().getDatainputKeyword_0());
            		
            // InternalMml.g:241:3: ( (lv_filelocation_1_0= RULE_STRING ) )
            // InternalMml.g:242:4: (lv_filelocation_1_0= RULE_STRING )
            {
            // InternalMml.g:242:4: (lv_filelocation_1_0= RULE_STRING )
            // InternalMml.g:243:5: lv_filelocation_1_0= RULE_STRING
            {
            lv_filelocation_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_filelocation_1_0, grammarAccess.getDataInputAccess().getFilelocationSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"filelocation",
            						lv_filelocation_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMml.g:259:3: ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMml.g:260:4: (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration )
                    {
                    // InternalMml.g:260:4: (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration )
                    // InternalMml.g:261:5: lv_parsingInstruction_2_0= ruleCSVParsingConfiguration
                    {

                    					newCompositeNode(grammarAccess.getDataInputAccess().getParsingInstructionCSVParsingConfigurationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parsingInstruction_2_0=ruleCSVParsingConfiguration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDataInputRule());
                    					}
                    					set(
                    						current,
                    						"parsingInstruction",
                    						lv_parsingInstruction_2_0,
                    						"org.xtext.example.mydsl.Mml.CSVParsingConfiguration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataInput"


    // $ANTLR start "entryRuleCSVParsingConfiguration"
    // InternalMml.g:282:1: entryRuleCSVParsingConfiguration returns [EObject current=null] : iv_ruleCSVParsingConfiguration= ruleCSVParsingConfiguration EOF ;
    public final EObject entryRuleCSVParsingConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSVParsingConfiguration = null;


        try {
            // InternalMml.g:282:64: (iv_ruleCSVParsingConfiguration= ruleCSVParsingConfiguration EOF )
            // InternalMml.g:283:2: iv_ruleCSVParsingConfiguration= ruleCSVParsingConfiguration EOF
            {
             newCompositeNode(grammarAccess.getCSVParsingConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCSVParsingConfiguration=ruleCSVParsingConfiguration();

            state._fsp--;

             current =iv_ruleCSVParsingConfiguration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCSVParsingConfiguration"


    // $ANTLR start "ruleCSVParsingConfiguration"
    // InternalMml.g:289:1: ruleCSVParsingConfiguration returns [EObject current=null] : (otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) ) ) ;
    public final EObject ruleCSVParsingConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_sep_1_0 = null;



        	enterRule();

        try {
            // InternalMml.g:295:2: ( (otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) ) ) )
            // InternalMml.g:296:2: (otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) ) )
            {
            // InternalMml.g:296:2: (otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) ) )
            // InternalMml.g:297:3: otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCSVParsingConfigurationAccess().getSeparatorKeyword_0());
            		
            // InternalMml.g:301:3: ( (lv_sep_1_0= ruleCSVSeparator ) )
            // InternalMml.g:302:4: (lv_sep_1_0= ruleCSVSeparator )
            {
            // InternalMml.g:302:4: (lv_sep_1_0= ruleCSVSeparator )
            // InternalMml.g:303:5: lv_sep_1_0= ruleCSVSeparator
            {

            					newCompositeNode(grammarAccess.getCSVParsingConfigurationAccess().getSepCSVSeparatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_sep_1_0=ruleCSVSeparator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCSVParsingConfigurationRule());
            					}
            					set(
            						current,
            						"sep",
            						lv_sep_1_0,
            						"org.xtext.example.mydsl.Mml.CSVSeparator");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSVParsingConfiguration"


    // $ANTLR start "entryRuleMLChoiceAlgorithm"
    // InternalMml.g:324:1: entryRuleMLChoiceAlgorithm returns [EObject current=null] : iv_ruleMLChoiceAlgorithm= ruleMLChoiceAlgorithm EOF ;
    public final EObject entryRuleMLChoiceAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMLChoiceAlgorithm = null;


        try {
            // InternalMml.g:324:58: (iv_ruleMLChoiceAlgorithm= ruleMLChoiceAlgorithm EOF )
            // InternalMml.g:325:2: iv_ruleMLChoiceAlgorithm= ruleMLChoiceAlgorithm EOF
            {
             newCompositeNode(grammarAccess.getMLChoiceAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMLChoiceAlgorithm=ruleMLChoiceAlgorithm();

            state._fsp--;

             current =iv_ruleMLChoiceAlgorithm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMLChoiceAlgorithm"


    // $ANTLR start "ruleMLChoiceAlgorithm"
    // InternalMml.g:331:1: ruleMLChoiceAlgorithm returns [EObject current=null] : (otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) ) ) ;
    public final EObject ruleMLChoiceAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_framework_1_0 = null;

        EObject lv_algorithm_3_0 = null;



        	enterRule();

        try {
            // InternalMml.g:337:2: ( (otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) ) ) )
            // InternalMml.g:338:2: (otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) ) )
            {
            // InternalMml.g:338:2: (otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) ) )
            // InternalMml.g:339:3: otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMLChoiceAlgorithmAccess().getMlframeworkKeyword_0());
            		
            // InternalMml.g:343:3: ( (lv_framework_1_0= ruleFrameworkLang ) )
            // InternalMml.g:344:4: (lv_framework_1_0= ruleFrameworkLang )
            {
            // InternalMml.g:344:4: (lv_framework_1_0= ruleFrameworkLang )
            // InternalMml.g:345:5: lv_framework_1_0= ruleFrameworkLang
            {

            					newCompositeNode(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkFrameworkLangEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_framework_1_0=ruleFrameworkLang();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMLChoiceAlgorithmRule());
            					}
            					set(
            						current,
            						"framework",
            						lv_framework_1_0,
            						"org.xtext.example.mydsl.Mml.FrameworkLang");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmKeyword_2());
            		
            // InternalMml.g:366:3: ( (lv_algorithm_3_0= ruleMLAlgorithm ) )
            // InternalMml.g:367:4: (lv_algorithm_3_0= ruleMLAlgorithm )
            {
            // InternalMml.g:367:4: (lv_algorithm_3_0= ruleMLAlgorithm )
            // InternalMml.g:368:5: lv_algorithm_3_0= ruleMLAlgorithm
            {

            					newCompositeNode(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmMLAlgorithmParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_algorithm_3_0=ruleMLAlgorithm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMLChoiceAlgorithmRule());
            					}
            					set(
            						current,
            						"algorithm",
            						lv_algorithm_3_0,
            						"org.xtext.example.mydsl.Mml.MLAlgorithm");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMLChoiceAlgorithm"


    // $ANTLR start "entryRuleMLAlgorithm"
    // InternalMml.g:389:1: entryRuleMLAlgorithm returns [EObject current=null] : iv_ruleMLAlgorithm= ruleMLAlgorithm EOF ;
    public final EObject entryRuleMLAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMLAlgorithm = null;


        try {
            // InternalMml.g:389:52: (iv_ruleMLAlgorithm= ruleMLAlgorithm EOF )
            // InternalMml.g:390:2: iv_ruleMLAlgorithm= ruleMLAlgorithm EOF
            {
             newCompositeNode(grammarAccess.getMLAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMLAlgorithm=ruleMLAlgorithm();

            state._fsp--;

             current =iv_ruleMLAlgorithm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMLAlgorithm"


    // $ANTLR start "ruleMLAlgorithm"
    // InternalMml.g:396:1: ruleMLAlgorithm returns [EObject current=null] : (this_SVM_0= ruleSVM | this_DT_1= ruleDT | this_RandomForest_2= ruleRandomForest | this_LogisticRegression_3= ruleLogisticRegression ) ;
    public final EObject ruleMLAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject this_SVM_0 = null;

        EObject this_DT_1 = null;

        EObject this_RandomForest_2 = null;

        EObject this_LogisticRegression_3 = null;



        	enterRule();

        try {
            // InternalMml.g:402:2: ( (this_SVM_0= ruleSVM | this_DT_1= ruleDT | this_RandomForest_2= ruleRandomForest | this_LogisticRegression_3= ruleLogisticRegression ) )
            // InternalMml.g:403:2: (this_SVM_0= ruleSVM | this_DT_1= ruleDT | this_RandomForest_2= ruleRandomForest | this_LogisticRegression_3= ruleLogisticRegression )
            {
            // InternalMml.g:403:2: (this_SVM_0= ruleSVM | this_DT_1= ruleDT | this_RandomForest_2= ruleRandomForest | this_LogisticRegression_3= ruleLogisticRegression )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case 24:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMml.g:404:3: this_SVM_0= ruleSVM
                    {

                    			newCompositeNode(grammarAccess.getMLAlgorithmAccess().getSVMParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SVM_0=ruleSVM();

                    state._fsp--;


                    			current = this_SVM_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMml.g:413:3: this_DT_1= ruleDT
                    {

                    			newCompositeNode(grammarAccess.getMLAlgorithmAccess().getDTParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DT_1=ruleDT();

                    state._fsp--;


                    			current = this_DT_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMml.g:422:3: this_RandomForest_2= ruleRandomForest
                    {

                    			newCompositeNode(grammarAccess.getMLAlgorithmAccess().getRandomForestParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RandomForest_2=ruleRandomForest();

                    state._fsp--;


                    			current = this_RandomForest_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMml.g:431:3: this_LogisticRegression_3= ruleLogisticRegression
                    {

                    			newCompositeNode(grammarAccess.getMLAlgorithmAccess().getLogisticRegressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogisticRegression_3=ruleLogisticRegression();

                    state._fsp--;


                    			current = this_LogisticRegression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMLAlgorithm"


    // $ANTLR start "entryRuleSVM"
    // InternalMml.g:443:1: entryRuleSVM returns [EObject current=null] : iv_ruleSVM= ruleSVM EOF ;
    public final EObject entryRuleSVM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSVM = null;


        try {
            // InternalMml.g:443:44: (iv_ruleSVM= ruleSVM EOF )
            // InternalMml.g:444:2: iv_ruleSVM= ruleSVM EOF
            {
             newCompositeNode(grammarAccess.getSVMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSVM=ruleSVM();

            state._fsp--;

             current =iv_ruleSVM; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSVM"


    // $ANTLR start "ruleSVM"
    // InternalMml.g:450:1: ruleSVM returns [EObject current=null] : ( ( (lv_name_0_0= 'SVM' ) ) (otherlv_1= 'gamma=' ( (lv_gamma_2_0= ruleFLOAT ) ) )? (otherlv_3= 'C=' ( (lv_C_4_0= ruleFLOAT ) ) )? (otherlv_5= 'kernel=' ( (lv_kernel_6_0= ruleSVMKernel ) ) )? (otherlv_7= 'classification' ( (lv_svmclassification_8_0= ruleSVMClassification ) ) )? ) ;
    public final EObject ruleSVM() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_gamma_2_0 = null;

        AntlrDatatypeRuleToken lv_C_4_0 = null;

        Enumerator lv_kernel_6_0 = null;

        Enumerator lv_svmclassification_8_0 = null;



        	enterRule();

        try {
            // InternalMml.g:456:2: ( ( ( (lv_name_0_0= 'SVM' ) ) (otherlv_1= 'gamma=' ( (lv_gamma_2_0= ruleFLOAT ) ) )? (otherlv_3= 'C=' ( (lv_C_4_0= ruleFLOAT ) ) )? (otherlv_5= 'kernel=' ( (lv_kernel_6_0= ruleSVMKernel ) ) )? (otherlv_7= 'classification' ( (lv_svmclassification_8_0= ruleSVMClassification ) ) )? ) )
            // InternalMml.g:457:2: ( ( (lv_name_0_0= 'SVM' ) ) (otherlv_1= 'gamma=' ( (lv_gamma_2_0= ruleFLOAT ) ) )? (otherlv_3= 'C=' ( (lv_C_4_0= ruleFLOAT ) ) )? (otherlv_5= 'kernel=' ( (lv_kernel_6_0= ruleSVMKernel ) ) )? (otherlv_7= 'classification' ( (lv_svmclassification_8_0= ruleSVMClassification ) ) )? )
            {
            // InternalMml.g:457:2: ( ( (lv_name_0_0= 'SVM' ) ) (otherlv_1= 'gamma=' ( (lv_gamma_2_0= ruleFLOAT ) ) )? (otherlv_3= 'C=' ( (lv_C_4_0= ruleFLOAT ) ) )? (otherlv_5= 'kernel=' ( (lv_kernel_6_0= ruleSVMKernel ) ) )? (otherlv_7= 'classification' ( (lv_svmclassification_8_0= ruleSVMClassification ) ) )? )
            // InternalMml.g:458:3: ( (lv_name_0_0= 'SVM' ) ) (otherlv_1= 'gamma=' ( (lv_gamma_2_0= ruleFLOAT ) ) )? (otherlv_3= 'C=' ( (lv_C_4_0= ruleFLOAT ) ) )? (otherlv_5= 'kernel=' ( (lv_kernel_6_0= ruleSVMKernel ) ) )? (otherlv_7= 'classification' ( (lv_svmclassification_8_0= ruleSVMClassification ) ) )?
            {
            // InternalMml.g:458:3: ( (lv_name_0_0= 'SVM' ) )
            // InternalMml.g:459:4: (lv_name_0_0= 'SVM' )
            {
            // InternalMml.g:459:4: (lv_name_0_0= 'SVM' )
            // InternalMml.g:460:5: lv_name_0_0= 'SVM'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSVMAccess().getNameSVMKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSVMRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "SVM");
            				

            }


            }

            // InternalMml.g:472:3: (otherlv_1= 'gamma=' ( (lv_gamma_2_0= ruleFLOAT ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMml.g:473:4: otherlv_1= 'gamma=' ( (lv_gamma_2_0= ruleFLOAT ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getSVMAccess().getGammaKeyword_1_0());
                    			
                    // InternalMml.g:477:4: ( (lv_gamma_2_0= ruleFLOAT ) )
                    // InternalMml.g:478:5: (lv_gamma_2_0= ruleFLOAT )
                    {
                    // InternalMml.g:478:5: (lv_gamma_2_0= ruleFLOAT )
                    // InternalMml.g:479:6: lv_gamma_2_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getGammaFLOATParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_gamma_2_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"gamma",
                    							lv_gamma_2_0,
                    							"org.xtext.example.mydsl.Mml.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMml.g:497:3: (otherlv_3= 'C=' ( (lv_C_4_0= ruleFLOAT ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMml.g:498:4: otherlv_3= 'C=' ( (lv_C_4_0= ruleFLOAT ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getSVMAccess().getCKeyword_2_0());
                    			
                    // InternalMml.g:502:4: ( (lv_C_4_0= ruleFLOAT ) )
                    // InternalMml.g:503:5: (lv_C_4_0= ruleFLOAT )
                    {
                    // InternalMml.g:503:5: (lv_C_4_0= ruleFLOAT )
                    // InternalMml.g:504:6: lv_C_4_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getCFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_C_4_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"C",
                    							lv_C_4_0,
                    							"org.xtext.example.mydsl.Mml.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMml.g:522:3: (otherlv_5= 'kernel=' ( (lv_kernel_6_0= ruleSVMKernel ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMml.g:523:4: otherlv_5= 'kernel=' ( (lv_kernel_6_0= ruleSVMKernel ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getSVMAccess().getKernelKeyword_3_0());
                    			
                    // InternalMml.g:527:4: ( (lv_kernel_6_0= ruleSVMKernel ) )
                    // InternalMml.g:528:5: (lv_kernel_6_0= ruleSVMKernel )
                    {
                    // InternalMml.g:528:5: (lv_kernel_6_0= ruleSVMKernel )
                    // InternalMml.g:529:6: lv_kernel_6_0= ruleSVMKernel
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getKernelSVMKernelEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_kernel_6_0=ruleSVMKernel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"kernel",
                    							lv_kernel_6_0,
                    							"org.xtext.example.mydsl.Mml.SVMKernel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMml.g:547:3: (otherlv_7= 'classification' ( (lv_svmclassification_8_0= ruleSVMClassification ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMml.g:548:4: otherlv_7= 'classification' ( (lv_svmclassification_8_0= ruleSVMClassification ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getSVMAccess().getClassificationKeyword_4_0());
                    			
                    // InternalMml.g:552:4: ( (lv_svmclassification_8_0= ruleSVMClassification ) )
                    // InternalMml.g:553:5: (lv_svmclassification_8_0= ruleSVMClassification )
                    {
                    // InternalMml.g:553:5: (lv_svmclassification_8_0= ruleSVMClassification )
                    // InternalMml.g:554:6: lv_svmclassification_8_0= ruleSVMClassification
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getSvmclassificationSVMClassificationEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_svmclassification_8_0=ruleSVMClassification();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSVMRule());
                    						}
                    						set(
                    							current,
                    							"svmclassification",
                    							lv_svmclassification_8_0,
                    							"org.xtext.example.mydsl.Mml.SVMClassification");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSVM"


    // $ANTLR start "entryRuleDT"
    // InternalMml.g:576:1: entryRuleDT returns [EObject current=null] : iv_ruleDT= ruleDT EOF ;
    public final EObject entryRuleDT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDT = null;


        try {
            // InternalMml.g:576:43: (iv_ruleDT= ruleDT EOF )
            // InternalMml.g:577:2: iv_ruleDT= ruleDT EOF
            {
             newCompositeNode(grammarAccess.getDTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDT=ruleDT();

            state._fsp--;

             current =iv_ruleDT; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDT"


    // $ANTLR start "ruleDT"
    // InternalMml.g:583:1: ruleDT returns [EObject current=null] : ( ( (lv_name_0_0= 'DT' ) ) ( (lv_max_depth_1_0= RULE_INT ) )? ) ;
    public final EObject ruleDT() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_max_depth_1_0=null;


        	enterRule();

        try {
            // InternalMml.g:589:2: ( ( ( (lv_name_0_0= 'DT' ) ) ( (lv_max_depth_1_0= RULE_INT ) )? ) )
            // InternalMml.g:590:2: ( ( (lv_name_0_0= 'DT' ) ) ( (lv_max_depth_1_0= RULE_INT ) )? )
            {
            // InternalMml.g:590:2: ( ( (lv_name_0_0= 'DT' ) ) ( (lv_max_depth_1_0= RULE_INT ) )? )
            // InternalMml.g:591:3: ( (lv_name_0_0= 'DT' ) ) ( (lv_max_depth_1_0= RULE_INT ) )?
            {
            // InternalMml.g:591:3: ( (lv_name_0_0= 'DT' ) )
            // InternalMml.g:592:4: (lv_name_0_0= 'DT' )
            {
            // InternalMml.g:592:4: (lv_name_0_0= 'DT' )
            // InternalMml.g:593:5: lv_name_0_0= 'DT'
            {
            lv_name_0_0=(Token)match(input,22,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDTAccess().getNameDTKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDTRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "DT");
            				

            }


            }

            // InternalMml.g:605:3: ( (lv_max_depth_1_0= RULE_INT ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMml.g:606:4: (lv_max_depth_1_0= RULE_INT )
                    {
                    // InternalMml.g:606:4: (lv_max_depth_1_0= RULE_INT )
                    // InternalMml.g:607:5: lv_max_depth_1_0= RULE_INT
                    {
                    lv_max_depth_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_max_depth_1_0, grammarAccess.getDTAccess().getMax_depthINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDTRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"max_depth",
                    						lv_max_depth_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDT"


    // $ANTLR start "entryRuleRandomForest"
    // InternalMml.g:627:1: entryRuleRandomForest returns [EObject current=null] : iv_ruleRandomForest= ruleRandomForest EOF ;
    public final EObject entryRuleRandomForest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomForest = null;


        try {
            // InternalMml.g:627:53: (iv_ruleRandomForest= ruleRandomForest EOF )
            // InternalMml.g:628:2: iv_ruleRandomForest= ruleRandomForest EOF
            {
             newCompositeNode(grammarAccess.getRandomForestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRandomForest=ruleRandomForest();

            state._fsp--;

             current =iv_ruleRandomForest; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRandomForest"


    // $ANTLR start "ruleRandomForest"
    // InternalMml.g:634:1: ruleRandomForest returns [EObject current=null] : ( ( (lv_name_0_0= 'RandomForest' ) ) ( (lv_ntree_1_0= RULE_INT ) ) ) ;
    public final EObject ruleRandomForest() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_ntree_1_0=null;


        	enterRule();

        try {
            // InternalMml.g:640:2: ( ( ( (lv_name_0_0= 'RandomForest' ) ) ( (lv_ntree_1_0= RULE_INT ) ) ) )
            // InternalMml.g:641:2: ( ( (lv_name_0_0= 'RandomForest' ) ) ( (lv_ntree_1_0= RULE_INT ) ) )
            {
            // InternalMml.g:641:2: ( ( (lv_name_0_0= 'RandomForest' ) ) ( (lv_ntree_1_0= RULE_INT ) ) )
            // InternalMml.g:642:3: ( (lv_name_0_0= 'RandomForest' ) ) ( (lv_ntree_1_0= RULE_INT ) )
            {
            // InternalMml.g:642:3: ( (lv_name_0_0= 'RandomForest' ) )
            // InternalMml.g:643:4: (lv_name_0_0= 'RandomForest' )
            {
            // InternalMml.g:643:4: (lv_name_0_0= 'RandomForest' )
            // InternalMml.g:644:5: lv_name_0_0= 'RandomForest'
            {
            lv_name_0_0=(Token)match(input,23,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRandomForestAccess().getNameRandomForestKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRandomForestRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "RandomForest");
            				

            }


            }

            // InternalMml.g:656:3: ( (lv_ntree_1_0= RULE_INT ) )
            // InternalMml.g:657:4: (lv_ntree_1_0= RULE_INT )
            {
            // InternalMml.g:657:4: (lv_ntree_1_0= RULE_INT )
            // InternalMml.g:658:5: lv_ntree_1_0= RULE_INT
            {
            lv_ntree_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_ntree_1_0, grammarAccess.getRandomForestAccess().getNtreeINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRandomForestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ntree",
            						lv_ntree_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRandomForest"


    // $ANTLR start "entryRuleLogisticRegression"
    // InternalMml.g:678:1: entryRuleLogisticRegression returns [EObject current=null] : iv_ruleLogisticRegression= ruleLogisticRegression EOF ;
    public final EObject entryRuleLogisticRegression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogisticRegression = null;


        try {
            // InternalMml.g:678:59: (iv_ruleLogisticRegression= ruleLogisticRegression EOF )
            // InternalMml.g:679:2: iv_ruleLogisticRegression= ruleLogisticRegression EOF
            {
             newCompositeNode(grammarAccess.getLogisticRegressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogisticRegression=ruleLogisticRegression();

            state._fsp--;

             current =iv_ruleLogisticRegression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogisticRegression"


    // $ANTLR start "ruleLogisticRegression"
    // InternalMml.g:685:1: ruleLogisticRegression returns [EObject current=null] : ( ( (lv_name_0_0= 'LogisticRegression' ) ) otherlv_1= 'class=' ( (lv_class_2_0= ruleCLASS ) ) ) ;
    public final EObject ruleLogisticRegression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_class_2_0 = null;



        	enterRule();

        try {
            // InternalMml.g:691:2: ( ( ( (lv_name_0_0= 'LogisticRegression' ) ) otherlv_1= 'class=' ( (lv_class_2_0= ruleCLASS ) ) ) )
            // InternalMml.g:692:2: ( ( (lv_name_0_0= 'LogisticRegression' ) ) otherlv_1= 'class=' ( (lv_class_2_0= ruleCLASS ) ) )
            {
            // InternalMml.g:692:2: ( ( (lv_name_0_0= 'LogisticRegression' ) ) otherlv_1= 'class=' ( (lv_class_2_0= ruleCLASS ) ) )
            // InternalMml.g:693:3: ( (lv_name_0_0= 'LogisticRegression' ) ) otherlv_1= 'class=' ( (lv_class_2_0= ruleCLASS ) )
            {
            // InternalMml.g:693:3: ( (lv_name_0_0= 'LogisticRegression' ) )
            // InternalMml.g:694:4: (lv_name_0_0= 'LogisticRegression' )
            {
            // InternalMml.g:694:4: (lv_name_0_0= 'LogisticRegression' )
            // InternalMml.g:695:5: lv_name_0_0= 'LogisticRegression'
            {
            lv_name_0_0=(Token)match(input,24,FOLLOW_19); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLogisticRegressionAccess().getNameLogisticRegressionKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogisticRegressionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "LogisticRegression");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getLogisticRegressionAccess().getClassKeyword_1());
            		
            // InternalMml.g:711:3: ( (lv_class_2_0= ruleCLASS ) )
            // InternalMml.g:712:4: (lv_class_2_0= ruleCLASS )
            {
            // InternalMml.g:712:4: (lv_class_2_0= ruleCLASS )
            // InternalMml.g:713:5: lv_class_2_0= ruleCLASS
            {

            					newCompositeNode(grammarAccess.getLogisticRegressionAccess().getClassCLASSEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_class_2_0=ruleCLASS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogisticRegressionRule());
            					}
            					set(
            						current,
            						"class",
            						lv_class_2_0,
            						"org.xtext.example.mydsl.Mml.CLASS");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogisticRegression"


    // $ANTLR start "entryRuleFLOAT"
    // InternalMml.g:734:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalMml.g:734:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalMml.g:735:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalMml.g:741:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMml.g:747:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalMml.g:748:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMml.g:748:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalMml.g:749:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,26,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleRFormula"
    // InternalMml.g:772:1: entryRuleRFormula returns [EObject current=null] : iv_ruleRFormula= ruleRFormula EOF ;
    public final EObject entryRuleRFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRFormula = null;


        try {
            // InternalMml.g:772:49: (iv_ruleRFormula= ruleRFormula EOF )
            // InternalMml.g:773:2: iv_ruleRFormula= ruleRFormula EOF
            {
             newCompositeNode(grammarAccess.getRFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRFormula=ruleRFormula();

            state._fsp--;

             current =iv_ruleRFormula; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRFormula"


    // $ANTLR start "ruleRFormula"
    // InternalMml.g:779:1: ruleRFormula returns [EObject current=null] : (otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleRFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_predictive_1_0 = null;

        EObject lv_predictors_3_0 = null;



        	enterRule();

        try {
            // InternalMml.g:785:2: ( (otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) ) ) )
            // InternalMml.g:786:2: (otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) ) )
            {
            // InternalMml.g:786:2: (otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) ) )
            // InternalMml.g:787:3: otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getRFormulaAccess().getFormulaKeyword_0());
            		
            // InternalMml.g:791:3: ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_INT)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMml.g:792:4: ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~'
                    {
                    // InternalMml.g:792:4: ( (lv_predictive_1_0= ruleFormulaItem ) )
                    // InternalMml.g:793:5: (lv_predictive_1_0= ruleFormulaItem )
                    {
                    // InternalMml.g:793:5: (lv_predictive_1_0= ruleFormulaItem )
                    // InternalMml.g:794:6: lv_predictive_1_0= ruleFormulaItem
                    {

                    						newCompositeNode(grammarAccess.getRFormulaAccess().getPredictiveFormulaItemParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_predictive_1_0=ruleFormulaItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRFormulaRule());
                    						}
                    						set(
                    							current,
                    							"predictive",
                    							lv_predictive_1_0,
                    							"org.xtext.example.mydsl.Mml.FormulaItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getRFormulaAccess().getTildeKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalMml.g:816:3: ( (lv_predictors_3_0= ruleXFormula ) )
            // InternalMml.g:817:4: (lv_predictors_3_0= ruleXFormula )
            {
            // InternalMml.g:817:4: (lv_predictors_3_0= ruleXFormula )
            // InternalMml.g:818:5: lv_predictors_3_0= ruleXFormula
            {

            					newCompositeNode(grammarAccess.getRFormulaAccess().getPredictorsXFormulaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_predictors_3_0=ruleXFormula();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRFormulaRule());
            					}
            					set(
            						current,
            						"predictors",
            						lv_predictors_3_0,
            						"org.xtext.example.mydsl.Mml.XFormula");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRFormula"


    // $ANTLR start "entryRuleXFormula"
    // InternalMml.g:839:1: entryRuleXFormula returns [EObject current=null] : iv_ruleXFormula= ruleXFormula EOF ;
    public final EObject entryRuleXFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFormula = null;


        try {
            // InternalMml.g:839:49: (iv_ruleXFormula= ruleXFormula EOF )
            // InternalMml.g:840:2: iv_ruleXFormula= ruleXFormula EOF
            {
             newCompositeNode(grammarAccess.getXFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXFormula=ruleXFormula();

            state._fsp--;

             current =iv_ruleXFormula; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleXFormula"


    // $ANTLR start "ruleXFormula"
    // InternalMml.g:846:1: ruleXFormula returns [EObject current=null] : (this_AllVariables_0= ruleAllVariables | this_PredictorVariables_1= rulePredictorVariables ) ;
    public final EObject ruleXFormula() throws RecognitionException {
        EObject current = null;

        EObject this_AllVariables_0 = null;

        EObject this_PredictorVariables_1 = null;



        	enterRule();

        try {
            // InternalMml.g:852:2: ( (this_AllVariables_0= ruleAllVariables | this_PredictorVariables_1= rulePredictorVariables ) )
            // InternalMml.g:853:2: (this_AllVariables_0= ruleAllVariables | this_PredictorVariables_1= rulePredictorVariables )
            {
            // InternalMml.g:853:2: (this_AllVariables_0= ruleAllVariables | this_PredictorVariables_1= rulePredictorVariables )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMml.g:854:3: this_AllVariables_0= ruleAllVariables
                    {

                    			newCompositeNode(grammarAccess.getXFormulaAccess().getAllVariablesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllVariables_0=ruleAllVariables();

                    state._fsp--;


                    			current = this_AllVariables_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMml.g:863:3: this_PredictorVariables_1= rulePredictorVariables
                    {

                    			newCompositeNode(grammarAccess.getXFormulaAccess().getPredictorVariablesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PredictorVariables_1=rulePredictorVariables();

                    state._fsp--;


                    			current = this_PredictorVariables_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFormula"


    // $ANTLR start "entryRuleAllVariables"
    // InternalMml.g:875:1: entryRuleAllVariables returns [EObject current=null] : iv_ruleAllVariables= ruleAllVariables EOF ;
    public final EObject entryRuleAllVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllVariables = null;


        try {
            // InternalMml.g:875:53: (iv_ruleAllVariables= ruleAllVariables EOF )
            // InternalMml.g:876:2: iv_ruleAllVariables= ruleAllVariables EOF
            {
             newCompositeNode(grammarAccess.getAllVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllVariables=ruleAllVariables();

            state._fsp--;

             current =iv_ruleAllVariables; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAllVariables"


    // $ANTLR start "ruleAllVariables"
    // InternalMml.g:882:1: ruleAllVariables returns [EObject current=null] : ( ( (lv_name_0_0= 'all' ) ) ( (lv_all_1_0= '.' ) ) ) ;
    public final EObject ruleAllVariables() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_all_1_0=null;


        	enterRule();

        try {
            // InternalMml.g:888:2: ( ( ( (lv_name_0_0= 'all' ) ) ( (lv_all_1_0= '.' ) ) ) )
            // InternalMml.g:889:2: ( ( (lv_name_0_0= 'all' ) ) ( (lv_all_1_0= '.' ) ) )
            {
            // InternalMml.g:889:2: ( ( (lv_name_0_0= 'all' ) ) ( (lv_all_1_0= '.' ) ) )
            // InternalMml.g:890:3: ( (lv_name_0_0= 'all' ) ) ( (lv_all_1_0= '.' ) )
            {
            // InternalMml.g:890:3: ( (lv_name_0_0= 'all' ) )
            // InternalMml.g:891:4: (lv_name_0_0= 'all' )
            {
            // InternalMml.g:891:4: (lv_name_0_0= 'all' )
            // InternalMml.g:892:5: lv_name_0_0= 'all'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAllVariablesAccess().getNameAllKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllVariablesRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "all");
            				

            }


            }

            // InternalMml.g:904:3: ( (lv_all_1_0= '.' ) )
            // InternalMml.g:905:4: (lv_all_1_0= '.' )
            {
            // InternalMml.g:905:4: (lv_all_1_0= '.' )
            // InternalMml.g:906:5: lv_all_1_0= '.'
            {
            lv_all_1_0=(Token)match(input,26,FOLLOW_2); 

            					newLeafNode(lv_all_1_0, grammarAccess.getAllVariablesAccess().getAllFullStopKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllVariablesRule());
            					}
            					setWithLastConsumed(current, "all", lv_all_1_0, ".");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllVariables"


    // $ANTLR start "entryRulePredictorVariables"
    // InternalMml.g:922:1: entryRulePredictorVariables returns [EObject current=null] : iv_rulePredictorVariables= rulePredictorVariables EOF ;
    public final EObject entryRulePredictorVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredictorVariables = null;


        try {
            // InternalMml.g:922:59: (iv_rulePredictorVariables= rulePredictorVariables EOF )
            // InternalMml.g:923:2: iv_rulePredictorVariables= rulePredictorVariables EOF
            {
             newCompositeNode(grammarAccess.getPredictorVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredictorVariables=rulePredictorVariables();

            state._fsp--;

             current =iv_rulePredictorVariables; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePredictorVariables"


    // $ANTLR start "rulePredictorVariables"
    // InternalMml.g:929:1: rulePredictorVariables returns [EObject current=null] : ( ( (lv_name_0_0= 'PredictorVariables' ) ) ( ( (lv_vars_1_0= ruleFormulaItem ) ) (otherlv_2= '+' ( (lv_vars_3_0= ruleFormulaItem ) ) )* ) ) ;
    public final EObject rulePredictorVariables() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_vars_1_0 = null;

        EObject lv_vars_3_0 = null;



        	enterRule();

        try {
            // InternalMml.g:935:2: ( ( ( (lv_name_0_0= 'PredictorVariables' ) ) ( ( (lv_vars_1_0= ruleFormulaItem ) ) (otherlv_2= '+' ( (lv_vars_3_0= ruleFormulaItem ) ) )* ) ) )
            // InternalMml.g:936:2: ( ( (lv_name_0_0= 'PredictorVariables' ) ) ( ( (lv_vars_1_0= ruleFormulaItem ) ) (otherlv_2= '+' ( (lv_vars_3_0= ruleFormulaItem ) ) )* ) )
            {
            // InternalMml.g:936:2: ( ( (lv_name_0_0= 'PredictorVariables' ) ) ( ( (lv_vars_1_0= ruleFormulaItem ) ) (otherlv_2= '+' ( (lv_vars_3_0= ruleFormulaItem ) ) )* ) )
            // InternalMml.g:937:3: ( (lv_name_0_0= 'PredictorVariables' ) ) ( ( (lv_vars_1_0= ruleFormulaItem ) ) (otherlv_2= '+' ( (lv_vars_3_0= ruleFormulaItem ) ) )* )
            {
            // InternalMml.g:937:3: ( (lv_name_0_0= 'PredictorVariables' ) )
            // InternalMml.g:938:4: (lv_name_0_0= 'PredictorVariables' )
            {
            // InternalMml.g:938:4: (lv_name_0_0= 'PredictorVariables' )
            // InternalMml.g:939:5: lv_name_0_0= 'PredictorVariables'
            {
            lv_name_0_0=(Token)match(input,30,FOLLOW_24); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPredictorVariablesAccess().getNamePredictorVariablesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPredictorVariablesRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "PredictorVariables");
            				

            }


            }

            // InternalMml.g:951:3: ( ( (lv_vars_1_0= ruleFormulaItem ) ) (otherlv_2= '+' ( (lv_vars_3_0= ruleFormulaItem ) ) )* )
            // InternalMml.g:952:4: ( (lv_vars_1_0= ruleFormulaItem ) ) (otherlv_2= '+' ( (lv_vars_3_0= ruleFormulaItem ) ) )*
            {
            // InternalMml.g:952:4: ( (lv_vars_1_0= ruleFormulaItem ) )
            // InternalMml.g:953:5: (lv_vars_1_0= ruleFormulaItem )
            {
            // InternalMml.g:953:5: (lv_vars_1_0= ruleFormulaItem )
            // InternalMml.g:954:6: lv_vars_1_0= ruleFormulaItem
            {

            						newCompositeNode(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_25);
            lv_vars_1_0=ruleFormulaItem();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPredictorVariablesRule());
            						}
            						add(
            							current,
            							"vars",
            							lv_vars_1_0,
            							"org.xtext.example.mydsl.Mml.FormulaItem");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalMml.g:971:4: (otherlv_2= '+' ( (lv_vars_3_0= ruleFormulaItem ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMml.g:972:5: otherlv_2= '+' ( (lv_vars_3_0= ruleFormulaItem ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_24); 

            	    					newLeafNode(otherlv_2, grammarAccess.getPredictorVariablesAccess().getPlusSignKeyword_1_1_0());
            	    				
            	    // InternalMml.g:976:5: ( (lv_vars_3_0= ruleFormulaItem ) )
            	    // InternalMml.g:977:6: (lv_vars_3_0= ruleFormulaItem )
            	    {
            	    // InternalMml.g:977:6: (lv_vars_3_0= ruleFormulaItem )
            	    // InternalMml.g:978:7: lv_vars_3_0= ruleFormulaItem
            	    {

            	    							newCompositeNode(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    lv_vars_3_0=ruleFormulaItem();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPredictorVariablesRule());
            	    							}
            	    							add(
            	    								current,
            	    								"vars",
            	    								lv_vars_3_0,
            	    								"org.xtext.example.mydsl.Mml.FormulaItem");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredictorVariables"


    // $ANTLR start "entryRuleFormulaItem"
    // InternalMml.g:1001:1: entryRuleFormulaItem returns [EObject current=null] : iv_ruleFormulaItem= ruleFormulaItem EOF ;
    public final EObject entryRuleFormulaItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulaItem = null;


        try {
            // InternalMml.g:1001:52: (iv_ruleFormulaItem= ruleFormulaItem EOF )
            // InternalMml.g:1002:2: iv_ruleFormulaItem= ruleFormulaItem EOF
            {
             newCompositeNode(grammarAccess.getFormulaItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormulaItem=ruleFormulaItem();

            state._fsp--;

             current =iv_ruleFormulaItem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFormulaItem"


    // $ANTLR start "ruleFormulaItem"
    // InternalMml.g:1008:1: ruleFormulaItem returns [EObject current=null] : ( ( (lv_column_0_0= RULE_INT ) ) | ( (lv_colName_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleFormulaItem() throws RecognitionException {
        EObject current = null;

        Token lv_column_0_0=null;
        Token lv_colName_1_0=null;


        	enterRule();

        try {
            // InternalMml.g:1014:2: ( ( ( (lv_column_0_0= RULE_INT ) ) | ( (lv_colName_1_0= RULE_STRING ) ) ) )
            // InternalMml.g:1015:2: ( ( (lv_column_0_0= RULE_INT ) ) | ( (lv_colName_1_0= RULE_STRING ) ) )
            {
            // InternalMml.g:1015:2: ( ( (lv_column_0_0= RULE_INT ) ) | ( (lv_colName_1_0= RULE_STRING ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_STRING) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMml.g:1016:3: ( (lv_column_0_0= RULE_INT ) )
                    {
                    // InternalMml.g:1016:3: ( (lv_column_0_0= RULE_INT ) )
                    // InternalMml.g:1017:4: (lv_column_0_0= RULE_INT )
                    {
                    // InternalMml.g:1017:4: (lv_column_0_0= RULE_INT )
                    // InternalMml.g:1018:5: lv_column_0_0= RULE_INT
                    {
                    lv_column_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_column_0_0, grammarAccess.getFormulaItemAccess().getColumnINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFormulaItemRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"column",
                    						lv_column_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1035:3: ( (lv_colName_1_0= RULE_STRING ) )
                    {
                    // InternalMml.g:1035:3: ( (lv_colName_1_0= RULE_STRING ) )
                    // InternalMml.g:1036:4: (lv_colName_1_0= RULE_STRING )
                    {
                    // InternalMml.g:1036:4: (lv_colName_1_0= RULE_STRING )
                    // InternalMml.g:1037:5: lv_colName_1_0= RULE_STRING
                    {
                    lv_colName_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_colName_1_0, grammarAccess.getFormulaItemAccess().getColNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFormulaItemRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"colName",
                    						lv_colName_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormulaItem"


    // $ANTLR start "entryRuleValidation"
    // InternalMml.g:1057:1: entryRuleValidation returns [EObject current=null] : iv_ruleValidation= ruleValidation EOF ;
    public final EObject entryRuleValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidation = null;


        try {
            // InternalMml.g:1057:51: (iv_ruleValidation= ruleValidation EOF )
            // InternalMml.g:1058:2: iv_ruleValidation= ruleValidation EOF
            {
             newCompositeNode(grammarAccess.getValidationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidation=ruleValidation();

            state._fsp--;

             current =iv_ruleValidation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValidation"


    // $ANTLR start "ruleValidation"
    // InternalMml.g:1064:1: ruleValidation returns [EObject current=null] : ( ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+ ) ;
    public final EObject ruleValidation() throws RecognitionException {
        EObject current = null;

        EObject lv_stratification_0_0 = null;

        Enumerator lv_metric_1_0 = null;



        	enterRule();

        try {
            // InternalMml.g:1070:2: ( ( ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+ ) )
            // InternalMml.g:1071:2: ( ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+ )
            {
            // InternalMml.g:1071:2: ( ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+ )
            // InternalMml.g:1072:3: ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+
            {
            // InternalMml.g:1072:3: ( (lv_stratification_0_0= ruleStratificationMethod ) )
            // InternalMml.g:1073:4: (lv_stratification_0_0= ruleStratificationMethod )
            {
            // InternalMml.g:1073:4: (lv_stratification_0_0= ruleStratificationMethod )
            // InternalMml.g:1074:5: lv_stratification_0_0= ruleStratificationMethod
            {

            					newCompositeNode(grammarAccess.getValidationAccess().getStratificationStratificationMethodParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_stratification_0_0=ruleStratificationMethod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValidationRule());
            					}
            					set(
            						current,
            						"stratification",
            						lv_stratification_0_0,
            						"org.xtext.example.mydsl.Mml.StratificationMethod");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMml.g:1091:3: ( (lv_metric_1_0= ruleValidationMetric ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=49 && LA16_0<=51)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMml.g:1092:4: (lv_metric_1_0= ruleValidationMetric )
            	    {
            	    // InternalMml.g:1092:4: (lv_metric_1_0= ruleValidationMetric )
            	    // InternalMml.g:1093:5: lv_metric_1_0= ruleValidationMetric
            	    {

            	    					newCompositeNode(grammarAccess.getValidationAccess().getMetricValidationMetricEnumRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_metric_1_0=ruleValidationMetric();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getValidationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"metric",
            	    						lv_metric_1_0,
            	    						"org.xtext.example.mydsl.Mml.ValidationMetric");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidation"


    // $ANTLR start "entryRuleStratificationMethod"
    // InternalMml.g:1114:1: entryRuleStratificationMethod returns [EObject current=null] : iv_ruleStratificationMethod= ruleStratificationMethod EOF ;
    public final EObject entryRuleStratificationMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStratificationMethod = null;


        try {
            // InternalMml.g:1114:61: (iv_ruleStratificationMethod= ruleStratificationMethod EOF )
            // InternalMml.g:1115:2: iv_ruleStratificationMethod= ruleStratificationMethod EOF
            {
             newCompositeNode(grammarAccess.getStratificationMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStratificationMethod=ruleStratificationMethod();

            state._fsp--;

             current =iv_ruleStratificationMethod; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStratificationMethod"


    // $ANTLR start "ruleStratificationMethod"
    // InternalMml.g:1121:1: ruleStratificationMethod returns [EObject current=null] : this_TrainingTest_0= ruleTrainingTest ;
    public final EObject ruleStratificationMethod() throws RecognitionException {
        EObject current = null;

        EObject this_TrainingTest_0 = null;



        	enterRule();

        try {
            // InternalMml.g:1127:2: (this_TrainingTest_0= ruleTrainingTest )
            // InternalMml.g:1128:2: this_TrainingTest_0= ruleTrainingTest
            {

            		newCompositeNode(grammarAccess.getStratificationMethodAccess().getTrainingTestParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_TrainingTest_0=ruleTrainingTest();

            state._fsp--;


            		current = this_TrainingTest_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStratificationMethod"


    // $ANTLR start "entryRuleTrainingTest"
    // InternalMml.g:1139:1: entryRuleTrainingTest returns [EObject current=null] : iv_ruleTrainingTest= ruleTrainingTest EOF ;
    public final EObject entryRuleTrainingTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainingTest = null;


        try {
            // InternalMml.g:1139:53: (iv_ruleTrainingTest= ruleTrainingTest EOF )
            // InternalMml.g:1140:2: iv_ruleTrainingTest= ruleTrainingTest EOF
            {
             newCompositeNode(grammarAccess.getTrainingTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrainingTest=ruleTrainingTest();

            state._fsp--;

             current =iv_ruleTrainingTest; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTrainingTest"


    // $ANTLR start "ruleTrainingTest"
    // InternalMml.g:1146:1: ruleTrainingTest returns [EObject current=null] : ( ( (lv_name_0_0= 'TrainingTest' ) ) otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= ruleFLOAT ) ) otherlv_4= '}' ) ;
    public final EObject ruleTrainingTest() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_number_3_0 = null;



        	enterRule();

        try {
            // InternalMml.g:1152:2: ( ( ( (lv_name_0_0= 'TrainingTest' ) ) otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= ruleFLOAT ) ) otherlv_4= '}' ) )
            // InternalMml.g:1153:2: ( ( (lv_name_0_0= 'TrainingTest' ) ) otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= ruleFLOAT ) ) otherlv_4= '}' )
            {
            // InternalMml.g:1153:2: ( ( (lv_name_0_0= 'TrainingTest' ) ) otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= ruleFLOAT ) ) otherlv_4= '}' )
            // InternalMml.g:1154:3: ( (lv_name_0_0= 'TrainingTest' ) ) otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= ruleFLOAT ) ) otherlv_4= '}'
            {
            // InternalMml.g:1154:3: ( (lv_name_0_0= 'TrainingTest' ) )
            // InternalMml.g:1155:4: (lv_name_0_0= 'TrainingTest' )
            {
            // InternalMml.g:1155:4: (lv_name_0_0= 'TrainingTest' )
            // InternalMml.g:1156:5: lv_name_0_0= 'TrainingTest'
            {
            lv_name_0_0=(Token)match(input,32,FOLLOW_28); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTrainingTestAccess().getNameTrainingTestKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrainingTestRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "TrainingTest");
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getTrainingTestAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getTrainingTestAccess().getPourcentageTrainingKeyword_2());
            		
            // InternalMml.g:1176:3: ( (lv_number_3_0= ruleFLOAT ) )
            // InternalMml.g:1177:4: (lv_number_3_0= ruleFLOAT )
            {
            // InternalMml.g:1177:4: (lv_number_3_0= ruleFLOAT )
            // InternalMml.g:1178:5: lv_number_3_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getTrainingTestAccess().getNumberFLOATParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_number_3_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrainingTestRule());
            					}
            					set(
            						current,
            						"number",
            						lv_number_3_0,
            						"org.xtext.example.mydsl.Mml.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTrainingTestAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrainingTest"


    // $ANTLR start "ruleCSVSeparator"
    // InternalMml.g:1203:1: ruleCSVSeparator returns [Enumerator current=null] : ( (enumLiteral_0= ',' ) | (enumLiteral_1= ';' ) ) ;
    public final Enumerator ruleCSVSeparator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMml.g:1209:2: ( ( (enumLiteral_0= ',' ) | (enumLiteral_1= ';' ) ) )
            // InternalMml.g:1210:2: ( (enumLiteral_0= ',' ) | (enumLiteral_1= ';' ) )
            {
            // InternalMml.g:1210:2: ( (enumLiteral_0= ',' ) | (enumLiteral_1= ';' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            else if ( (LA17_0==37) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMml.g:1211:3: (enumLiteral_0= ',' )
                    {
                    // InternalMml.g:1211:3: (enumLiteral_0= ',' )
                    // InternalMml.g:1212:4: enumLiteral_0= ','
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getCSVSeparatorAccess().getCOMMAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCSVSeparatorAccess().getCOMMAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1219:3: (enumLiteral_1= ';' )
                    {
                    // InternalMml.g:1219:3: (enumLiteral_1= ';' )
                    // InternalMml.g:1220:4: enumLiteral_1= ';'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getCSVSeparatorAccess().getSEMI_COLONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCSVSeparatorAccess().getSEMI_COLONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSVSeparator"


    // $ANTLR start "ruleFrameworkLang"
    // InternalMml.g:1230:1: ruleFrameworkLang returns [Enumerator current=null] : ( (enumLiteral_0= 'scikit-learn' ) | (enumLiteral_1= 'R' ) ) ;
    public final Enumerator ruleFrameworkLang() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMml.g:1236:2: ( ( (enumLiteral_0= 'scikit-learn' ) | (enumLiteral_1= 'R' ) ) )
            // InternalMml.g:1237:2: ( (enumLiteral_0= 'scikit-learn' ) | (enumLiteral_1= 'R' ) )
            {
            // InternalMml.g:1237:2: ( (enumLiteral_0= 'scikit-learn' ) | (enumLiteral_1= 'R' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            else if ( (LA18_0==39) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMml.g:1238:3: (enumLiteral_0= 'scikit-learn' )
                    {
                    // InternalMml.g:1238:3: (enumLiteral_0= 'scikit-learn' )
                    // InternalMml.g:1239:4: enumLiteral_0= 'scikit-learn'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getFrameworkLangAccess().getSCIKITEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFrameworkLangAccess().getSCIKITEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1246:3: (enumLiteral_1= 'R' )
                    {
                    // InternalMml.g:1246:3: (enumLiteral_1= 'R' )
                    // InternalMml.g:1247:4: enumLiteral_1= 'R'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getFrameworkLangAccess().getREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFrameworkLangAccess().getREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrameworkLang"


    // $ANTLR start "ruleSVMKernel"
    // InternalMml.g:1257:1: ruleSVMKernel returns [Enumerator current=null] : ( (enumLiteral_0= 'linear' ) | (enumLiteral_1= 'polynomial' ) | (enumLiteral_2= 'radial' ) ) ;
    public final Enumerator ruleSVMKernel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMml.g:1263:2: ( ( (enumLiteral_0= 'linear' ) | (enumLiteral_1= 'polynomial' ) | (enumLiteral_2= 'radial' ) ) )
            // InternalMml.g:1264:2: ( (enumLiteral_0= 'linear' ) | (enumLiteral_1= 'polynomial' ) | (enumLiteral_2= 'radial' ) )
            {
            // InternalMml.g:1264:2: ( (enumLiteral_0= 'linear' ) | (enumLiteral_1= 'polynomial' ) | (enumLiteral_2= 'radial' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt19=1;
                }
                break;
            case 41:
                {
                alt19=2;
                }
                break;
            case 42:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMml.g:1265:3: (enumLiteral_0= 'linear' )
                    {
                    // InternalMml.g:1265:3: (enumLiteral_0= 'linear' )
                    // InternalMml.g:1266:4: enumLiteral_0= 'linear'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getSVMKernelAccess().getLinearEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSVMKernelAccess().getLinearEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1273:3: (enumLiteral_1= 'polynomial' )
                    {
                    // InternalMml.g:1273:3: (enumLiteral_1= 'polynomial' )
                    // InternalMml.g:1274:4: enumLiteral_1= 'polynomial'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getSVMKernelAccess().getPolyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSVMKernelAccess().getPolyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:1281:3: (enumLiteral_2= 'radial' )
                    {
                    // InternalMml.g:1281:3: (enumLiteral_2= 'radial' )
                    // InternalMml.g:1282:4: enumLiteral_2= 'radial'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getSVMKernelAccess().getRadialEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSVMKernelAccess().getRadialEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSVMKernel"


    // $ANTLR start "ruleSVMClassification"
    // InternalMml.g:1292:1: ruleSVMClassification returns [Enumerator current=null] : ( (enumLiteral_0= 'C-classification' ) | (enumLiteral_1= 'nu-classification' ) | (enumLiteral_2= 'one-classification' ) ) ;
    public final Enumerator ruleSVMClassification() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMml.g:1298:2: ( ( (enumLiteral_0= 'C-classification' ) | (enumLiteral_1= 'nu-classification' ) | (enumLiteral_2= 'one-classification' ) ) )
            // InternalMml.g:1299:2: ( (enumLiteral_0= 'C-classification' ) | (enumLiteral_1= 'nu-classification' ) | (enumLiteral_2= 'one-classification' ) )
            {
            // InternalMml.g:1299:2: ( (enumLiteral_0= 'C-classification' ) | (enumLiteral_1= 'nu-classification' ) | (enumLiteral_2= 'one-classification' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt20=1;
                }
                break;
            case 44:
                {
                alt20=2;
                }
                break;
            case 45:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMml.g:1300:3: (enumLiteral_0= 'C-classification' )
                    {
                    // InternalMml.g:1300:3: (enumLiteral_0= 'C-classification' )
                    // InternalMml.g:1301:4: enumLiteral_0= 'C-classification'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getSVMClassificationAccess().getCClassEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSVMClassificationAccess().getCClassEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1308:3: (enumLiteral_1= 'nu-classification' )
                    {
                    // InternalMml.g:1308:3: (enumLiteral_1= 'nu-classification' )
                    // InternalMml.g:1309:4: enumLiteral_1= 'nu-classification'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getSVMClassificationAccess().getNuClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSVMClassificationAccess().getNuClassEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:1316:3: (enumLiteral_2= 'one-classification' )
                    {
                    // InternalMml.g:1316:3: (enumLiteral_2= 'one-classification' )
                    // InternalMml.g:1317:4: enumLiteral_2= 'one-classification'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getSVMClassificationAccess().getOneClassEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSVMClassificationAccess().getOneClassEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSVMClassification"


    // $ANTLR start "ruleCLASS"
    // InternalMml.g:1327:1: ruleCLASS returns [Enumerator current=null] : ( (enumLiteral_0= 'binomial' ) | (enumLiteral_1= 'gaussian' ) | (enumLiteral_2= 'poisson' ) ) ;
    public final Enumerator ruleCLASS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMml.g:1333:2: ( ( (enumLiteral_0= 'binomial' ) | (enumLiteral_1= 'gaussian' ) | (enumLiteral_2= 'poisson' ) ) )
            // InternalMml.g:1334:2: ( (enumLiteral_0= 'binomial' ) | (enumLiteral_1= 'gaussian' ) | (enumLiteral_2= 'poisson' ) )
            {
            // InternalMml.g:1334:2: ( (enumLiteral_0= 'binomial' ) | (enumLiteral_1= 'gaussian' ) | (enumLiteral_2= 'poisson' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt21=1;
                }
                break;
            case 47:
                {
                alt21=2;
                }
                break;
            case 48:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMml.g:1335:3: (enumLiteral_0= 'binomial' )
                    {
                    // InternalMml.g:1335:3: (enumLiteral_0= 'binomial' )
                    // InternalMml.g:1336:4: enumLiteral_0= 'binomial'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getCLASSAccess().getBinomialEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCLASSAccess().getBinomialEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1343:3: (enumLiteral_1= 'gaussian' )
                    {
                    // InternalMml.g:1343:3: (enumLiteral_1= 'gaussian' )
                    // InternalMml.g:1344:4: enumLiteral_1= 'gaussian'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getCLASSAccess().getGaussianEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCLASSAccess().getGaussianEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:1351:3: (enumLiteral_2= 'poisson' )
                    {
                    // InternalMml.g:1351:3: (enumLiteral_2= 'poisson' )
                    // InternalMml.g:1352:4: enumLiteral_2= 'poisson'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getCLASSAccess().getPoissonEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCLASSAccess().getPoissonEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCLASS"


    // $ANTLR start "ruleValidationMetric"
    // InternalMml.g:1362:1: ruleValidationMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'recall' ) | (enumLiteral_1= 'precision' ) | (enumLiteral_2= 'F1' ) ) ;
    public final Enumerator ruleValidationMetric() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMml.g:1368:2: ( ( (enumLiteral_0= 'recall' ) | (enumLiteral_1= 'precision' ) | (enumLiteral_2= 'F1' ) ) )
            // InternalMml.g:1369:2: ( (enumLiteral_0= 'recall' ) | (enumLiteral_1= 'precision' ) | (enumLiteral_2= 'F1' ) )
            {
            // InternalMml.g:1369:2: ( (enumLiteral_0= 'recall' ) | (enumLiteral_1= 'precision' ) | (enumLiteral_2= 'F1' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt22=1;
                }
                break;
            case 50:
                {
                alt22=2;
                }
                break;
            case 51:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMml.g:1370:3: (enumLiteral_0= 'recall' )
                    {
                    // InternalMml.g:1370:3: (enumLiteral_0= 'recall' )
                    // InternalMml.g:1371:4: enumLiteral_0= 'recall'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getValidationMetricAccess().getRECALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getValidationMetricAccess().getRECALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1378:3: (enumLiteral_1= 'precision' )
                    {
                    // InternalMml.g:1378:3: (enumLiteral_1= 'precision' )
                    // InternalMml.g:1379:4: enumLiteral_1= 'precision'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getValidationMetricAccess().getPRECISIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getValidationMetricAccess().getPRECISIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:1386:3: (enumLiteral_2= 'F1' )
                    {
                    // InternalMml.g:1386:3: (enumLiteral_2= 'F1' )
                    // InternalMml.g:1387:4: enumLiteral_2= 'F1'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getValidationMetricAccess().getF1EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getValidationMetricAccess().getF1EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidationMetric"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000010800A010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001C20000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000060000060L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000E000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});

}