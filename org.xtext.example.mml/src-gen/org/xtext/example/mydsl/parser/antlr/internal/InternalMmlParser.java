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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'End.'", "'datainput'", "'separator'", "'mlframework'", "'algorithm'", "'SVM'", "'gamma='", "'C='", "'kernel='", "'classification'", "'DT'", "'RandomForest'", "'LogisticRegression'", "'.'", "'formula'", "'~'", "'all'", "'PredictorVariables'", "'+'", "'TrainingTest'", "'{'", "'pourcentageTraining'", "'}'", "','", "';'", "'scikit-learn'", "'R'", "'Weka'", "'linear'", "'polynomial'", "'radial'", "'C-classification'", "'nu-classification'", "'one-classification'", "'recall'", "'precision'", "'F1'"
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
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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
    // InternalMml.g:72:1: ruleMMLModel returns [EObject current=null] : ( ( (lv_input_0_0= ruleDataInput ) ) ( (lv_algorithm_1_0= ruleMLChoiceAlgorithm ) ) ( (lv_formula_2_0= ruleRFormula ) )? ( (lv_validation_3_0= ruleValidation ) ) otherlv_4= 'End.' ) ;
    public final EObject ruleMMLModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_input_0_0 = null;

        EObject lv_algorithm_1_0 = null;

        EObject lv_formula_2_0 = null;

        EObject lv_validation_3_0 = null;



        	enterRule();

        try {
            // InternalMml.g:78:2: ( ( ( (lv_input_0_0= ruleDataInput ) ) ( (lv_algorithm_1_0= ruleMLChoiceAlgorithm ) ) ( (lv_formula_2_0= ruleRFormula ) )? ( (lv_validation_3_0= ruleValidation ) ) otherlv_4= 'End.' ) )
            // InternalMml.g:79:2: ( ( (lv_input_0_0= ruleDataInput ) ) ( (lv_algorithm_1_0= ruleMLChoiceAlgorithm ) ) ( (lv_formula_2_0= ruleRFormula ) )? ( (lv_validation_3_0= ruleValidation ) ) otherlv_4= 'End.' )
            {
            // InternalMml.g:79:2: ( ( (lv_input_0_0= ruleDataInput ) ) ( (lv_algorithm_1_0= ruleMLChoiceAlgorithm ) ) ( (lv_formula_2_0= ruleRFormula ) )? ( (lv_validation_3_0= ruleValidation ) ) otherlv_4= 'End.' )
            // InternalMml.g:80:3: ( (lv_input_0_0= ruleDataInput ) ) ( (lv_algorithm_1_0= ruleMLChoiceAlgorithm ) ) ( (lv_formula_2_0= ruleRFormula ) )? ( (lv_validation_3_0= ruleValidation ) ) otherlv_4= 'End.'
            {
            // InternalMml.g:80:3: ( (lv_input_0_0= ruleDataInput ) )
            // InternalMml.g:81:4: (lv_input_0_0= ruleDataInput )
            {
            // InternalMml.g:81:4: (lv_input_0_0= ruleDataInput )
            // InternalMml.g:82:5: lv_input_0_0= ruleDataInput
            {

            					newCompositeNode(grammarAccess.getMMLModelAccess().getInputDataInputParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_input_0_0=ruleDataInput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMMLModelRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_0_0,
            						"org.xtext.example.mydsl.Mml.DataInput");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMml.g:99:3: ( (lv_algorithm_1_0= ruleMLChoiceAlgorithm ) )
            // InternalMml.g:100:4: (lv_algorithm_1_0= ruleMLChoiceAlgorithm )
            {
            // InternalMml.g:100:4: (lv_algorithm_1_0= ruleMLChoiceAlgorithm )
            // InternalMml.g:101:5: lv_algorithm_1_0= ruleMLChoiceAlgorithm
            {

            					newCompositeNode(grammarAccess.getMMLModelAccess().getAlgorithmMLChoiceAlgorithmParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_algorithm_1_0=ruleMLChoiceAlgorithm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMMLModelRule());
            					}
            					set(
            						current,
            						"algorithm",
            						lv_algorithm_1_0,
            						"org.xtext.example.mydsl.Mml.MLChoiceAlgorithm");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMml.g:118:3: ( (lv_formula_2_0= ruleRFormula ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMml.g:119:4: (lv_formula_2_0= ruleRFormula )
                    {
                    // InternalMml.g:119:4: (lv_formula_2_0= ruleRFormula )
                    // InternalMml.g:120:5: lv_formula_2_0= ruleRFormula
                    {

                    					newCompositeNode(grammarAccess.getMMLModelAccess().getFormulaRFormulaParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_formula_2_0=ruleRFormula();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMMLModelRule());
                    					}
                    					set(
                    						current,
                    						"formula",
                    						lv_formula_2_0,
                    						"org.xtext.example.mydsl.Mml.RFormula");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMml.g:137:3: ( (lv_validation_3_0= ruleValidation ) )
            // InternalMml.g:138:4: (lv_validation_3_0= ruleValidation )
            {
            // InternalMml.g:138:4: (lv_validation_3_0= ruleValidation )
            // InternalMml.g:139:5: lv_validation_3_0= ruleValidation
            {

            					newCompositeNode(grammarAccess.getMMLModelAccess().getValidationValidationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_validation_3_0=ruleValidation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMMLModelRule());
            					}
            					set(
            						current,
            						"validation",
            						lv_validation_3_0,
            						"org.xtext.example.mydsl.Mml.Validation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMMLModelAccess().getEndKeyword_4());
            		

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


    // $ANTLR start "entryRuleDataInput"
    // InternalMml.g:164:1: entryRuleDataInput returns [EObject current=null] : iv_ruleDataInput= ruleDataInput EOF ;
    public final EObject entryRuleDataInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataInput = null;


        try {
            // InternalMml.g:164:50: (iv_ruleDataInput= ruleDataInput EOF )
            // InternalMml.g:165:2: iv_ruleDataInput= ruleDataInput EOF
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
    // InternalMml.g:171:1: ruleDataInput returns [EObject current=null] : (otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )? ) ;
    public final EObject ruleDataInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_filelocation_1_0=null;
        EObject lv_parsingInstruction_2_0 = null;



        	enterRule();

        try {
            // InternalMml.g:177:2: ( (otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )? ) )
            // InternalMml.g:178:2: (otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )? )
            {
            // InternalMml.g:178:2: (otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )? )
            // InternalMml.g:179:3: otherlv_0= 'datainput' ( (lv_filelocation_1_0= RULE_STRING ) ) ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDataInputAccess().getDatainputKeyword_0());
            		
            // InternalMml.g:183:3: ( (lv_filelocation_1_0= RULE_STRING ) )
            // InternalMml.g:184:4: (lv_filelocation_1_0= RULE_STRING )
            {
            // InternalMml.g:184:4: (lv_filelocation_1_0= RULE_STRING )
            // InternalMml.g:185:5: lv_filelocation_1_0= RULE_STRING
            {
            lv_filelocation_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

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

            // InternalMml.g:201:3: ( (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMml.g:202:4: (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration )
                    {
                    // InternalMml.g:202:4: (lv_parsingInstruction_2_0= ruleCSVParsingConfiguration )
                    // InternalMml.g:203:5: lv_parsingInstruction_2_0= ruleCSVParsingConfiguration
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
    // InternalMml.g:224:1: entryRuleCSVParsingConfiguration returns [EObject current=null] : iv_ruleCSVParsingConfiguration= ruleCSVParsingConfiguration EOF ;
    public final EObject entryRuleCSVParsingConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSVParsingConfiguration = null;


        try {
            // InternalMml.g:224:64: (iv_ruleCSVParsingConfiguration= ruleCSVParsingConfiguration EOF )
            // InternalMml.g:225:2: iv_ruleCSVParsingConfiguration= ruleCSVParsingConfiguration EOF
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
    // InternalMml.g:231:1: ruleCSVParsingConfiguration returns [EObject current=null] : (otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) ) ) ;
    public final EObject ruleCSVParsingConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_sep_1_0 = null;



        	enterRule();

        try {
            // InternalMml.g:237:2: ( (otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) ) ) )
            // InternalMml.g:238:2: (otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) ) )
            {
            // InternalMml.g:238:2: (otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) ) )
            // InternalMml.g:239:3: otherlv_0= 'separator' ( (lv_sep_1_0= ruleCSVSeparator ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCSVParsingConfigurationAccess().getSeparatorKeyword_0());
            		
            // InternalMml.g:243:3: ( (lv_sep_1_0= ruleCSVSeparator ) )
            // InternalMml.g:244:4: (lv_sep_1_0= ruleCSVSeparator )
            {
            // InternalMml.g:244:4: (lv_sep_1_0= ruleCSVSeparator )
            // InternalMml.g:245:5: lv_sep_1_0= ruleCSVSeparator
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
    // InternalMml.g:266:1: entryRuleMLChoiceAlgorithm returns [EObject current=null] : iv_ruleMLChoiceAlgorithm= ruleMLChoiceAlgorithm EOF ;
    public final EObject entryRuleMLChoiceAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMLChoiceAlgorithm = null;


        try {
            // InternalMml.g:266:58: (iv_ruleMLChoiceAlgorithm= ruleMLChoiceAlgorithm EOF )
            // InternalMml.g:267:2: iv_ruleMLChoiceAlgorithm= ruleMLChoiceAlgorithm EOF
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
    // InternalMml.g:273:1: ruleMLChoiceAlgorithm returns [EObject current=null] : (otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) ) ) ;
    public final EObject ruleMLChoiceAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_framework_1_0 = null;

        EObject lv_algorithm_3_0 = null;



        	enterRule();

        try {
            // InternalMml.g:279:2: ( (otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) ) ) )
            // InternalMml.g:280:2: (otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) ) )
            {
            // InternalMml.g:280:2: (otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) ) )
            // InternalMml.g:281:3: otherlv_0= 'mlframework' ( (lv_framework_1_0= ruleFrameworkLang ) ) otherlv_2= 'algorithm' ( (lv_algorithm_3_0= ruleMLAlgorithm ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMLChoiceAlgorithmAccess().getMlframeworkKeyword_0());
            		
            // InternalMml.g:285:3: ( (lv_framework_1_0= ruleFrameworkLang ) )
            // InternalMml.g:286:4: (lv_framework_1_0= ruleFrameworkLang )
            {
            // InternalMml.g:286:4: (lv_framework_1_0= ruleFrameworkLang )
            // InternalMml.g:287:5: lv_framework_1_0= ruleFrameworkLang
            {

            					newCompositeNode(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkFrameworkLangEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmKeyword_2());
            		
            // InternalMml.g:308:3: ( (lv_algorithm_3_0= ruleMLAlgorithm ) )
            // InternalMml.g:309:4: (lv_algorithm_3_0= ruleMLAlgorithm )
            {
            // InternalMml.g:309:4: (lv_algorithm_3_0= ruleMLAlgorithm )
            // InternalMml.g:310:5: lv_algorithm_3_0= ruleMLAlgorithm
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
    // InternalMml.g:331:1: entryRuleMLAlgorithm returns [EObject current=null] : iv_ruleMLAlgorithm= ruleMLAlgorithm EOF ;
    public final EObject entryRuleMLAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMLAlgorithm = null;


        try {
            // InternalMml.g:331:52: (iv_ruleMLAlgorithm= ruleMLAlgorithm EOF )
            // InternalMml.g:332:2: iv_ruleMLAlgorithm= ruleMLAlgorithm EOF
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
    // InternalMml.g:338:1: ruleMLAlgorithm returns [EObject current=null] : (this_SVM_0= ruleSVM | this_DT_1= ruleDT | this_RandomForest_2= ruleRandomForest | this_LogisticRegression_3= ruleLogisticRegression ) ;
    public final EObject ruleMLAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject this_SVM_0 = null;

        EObject this_DT_1 = null;

        EObject this_RandomForest_2 = null;

        EObject this_LogisticRegression_3 = null;



        	enterRule();

        try {
            // InternalMml.g:344:2: ( (this_SVM_0= ruleSVM | this_DT_1= ruleDT | this_RandomForest_2= ruleRandomForest | this_LogisticRegression_3= ruleLogisticRegression ) )
            // InternalMml.g:345:2: (this_SVM_0= ruleSVM | this_DT_1= ruleDT | this_RandomForest_2= ruleRandomForest | this_LogisticRegression_3= ruleLogisticRegression )
            {
            // InternalMml.g:345:2: (this_SVM_0= ruleSVM | this_DT_1= ruleDT | this_RandomForest_2= ruleRandomForest | this_LogisticRegression_3= ruleLogisticRegression )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMml.g:346:3: this_SVM_0= ruleSVM
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
                    // InternalMml.g:355:3: this_DT_1= ruleDT
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
                    // InternalMml.g:364:3: this_RandomForest_2= ruleRandomForest
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
                    // InternalMml.g:373:3: this_LogisticRegression_3= ruleLogisticRegression
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
    // InternalMml.g:385:1: entryRuleSVM returns [EObject current=null] : iv_ruleSVM= ruleSVM EOF ;
    public final EObject entryRuleSVM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSVM = null;


        try {
            // InternalMml.g:385:44: (iv_ruleSVM= ruleSVM EOF )
            // InternalMml.g:386:2: iv_ruleSVM= ruleSVM EOF
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
    // InternalMml.g:392:1: ruleSVM returns [EObject current=null] : ( ( (lv_name_0_0= 'SVM' ) ) (otherlv_1= 'gamma=' ( (lv_gamma_2_0= ruleFLOAT ) ) )? (otherlv_3= 'C=' ( (lv_C_4_0= ruleFLOAT ) ) )? (otherlv_5= 'kernel=' ( (lv_kernel_6_0= ruleSVMKernel ) ) )? (otherlv_7= 'classification' ( (lv_svmclassification_8_0= ruleSVMClassification ) ) )? ) ;
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
            // InternalMml.g:398:2: ( ( ( (lv_name_0_0= 'SVM' ) ) (otherlv_1= 'gamma=' ( (lv_gamma_2_0= ruleFLOAT ) ) )? (otherlv_3= 'C=' ( (lv_C_4_0= ruleFLOAT ) ) )? (otherlv_5= 'kernel=' ( (lv_kernel_6_0= ruleSVMKernel ) ) )? (otherlv_7= 'classification' ( (lv_svmclassification_8_0= ruleSVMClassification ) ) )? ) )
            // InternalMml.g:399:2: ( ( (lv_name_0_0= 'SVM' ) ) (otherlv_1= 'gamma=' ( (lv_gamma_2_0= ruleFLOAT ) ) )? (otherlv_3= 'C=' ( (lv_C_4_0= ruleFLOAT ) ) )? (otherlv_5= 'kernel=' ( (lv_kernel_6_0= ruleSVMKernel ) ) )? (otherlv_7= 'classification' ( (lv_svmclassification_8_0= ruleSVMClassification ) ) )? )
            {
            // InternalMml.g:399:2: ( ( (lv_name_0_0= 'SVM' ) ) (otherlv_1= 'gamma=' ( (lv_gamma_2_0= ruleFLOAT ) ) )? (otherlv_3= 'C=' ( (lv_C_4_0= ruleFLOAT ) ) )? (otherlv_5= 'kernel=' ( (lv_kernel_6_0= ruleSVMKernel ) ) )? (otherlv_7= 'classification' ( (lv_svmclassification_8_0= ruleSVMClassification ) ) )? )
            // InternalMml.g:400:3: ( (lv_name_0_0= 'SVM' ) ) (otherlv_1= 'gamma=' ( (lv_gamma_2_0= ruleFLOAT ) ) )? (otherlv_3= 'C=' ( (lv_C_4_0= ruleFLOAT ) ) )? (otherlv_5= 'kernel=' ( (lv_kernel_6_0= ruleSVMKernel ) ) )? (otherlv_7= 'classification' ( (lv_svmclassification_8_0= ruleSVMClassification ) ) )?
            {
            // InternalMml.g:400:3: ( (lv_name_0_0= 'SVM' ) )
            // InternalMml.g:401:4: (lv_name_0_0= 'SVM' )
            {
            // InternalMml.g:401:4: (lv_name_0_0= 'SVM' )
            // InternalMml.g:402:5: lv_name_0_0= 'SVM'
            {
            lv_name_0_0=(Token)match(input,16,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSVMAccess().getNameSVMKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSVMRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "SVM");
            				

            }


            }

            // InternalMml.g:414:3: (otherlv_1= 'gamma=' ( (lv_gamma_2_0= ruleFLOAT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMml.g:415:4: otherlv_1= 'gamma=' ( (lv_gamma_2_0= ruleFLOAT ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getSVMAccess().getGammaKeyword_1_0());
                    			
                    // InternalMml.g:419:4: ( (lv_gamma_2_0= ruleFLOAT ) )
                    // InternalMml.g:420:5: (lv_gamma_2_0= ruleFLOAT )
                    {
                    // InternalMml.g:420:5: (lv_gamma_2_0= ruleFLOAT )
                    // InternalMml.g:421:6: lv_gamma_2_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getGammaFLOATParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

            // InternalMml.g:439:3: (otherlv_3= 'C=' ( (lv_C_4_0= ruleFLOAT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMml.g:440:4: otherlv_3= 'C=' ( (lv_C_4_0= ruleFLOAT ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getSVMAccess().getCKeyword_2_0());
                    			
                    // InternalMml.g:444:4: ( (lv_C_4_0= ruleFLOAT ) )
                    // InternalMml.g:445:5: (lv_C_4_0= ruleFLOAT )
                    {
                    // InternalMml.g:445:5: (lv_C_4_0= ruleFLOAT )
                    // InternalMml.g:446:6: lv_C_4_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getCFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_15);
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

            // InternalMml.g:464:3: (otherlv_5= 'kernel=' ( (lv_kernel_6_0= ruleSVMKernel ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMml.g:465:4: otherlv_5= 'kernel=' ( (lv_kernel_6_0= ruleSVMKernel ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getSVMAccess().getKernelKeyword_3_0());
                    			
                    // InternalMml.g:469:4: ( (lv_kernel_6_0= ruleSVMKernel ) )
                    // InternalMml.g:470:5: (lv_kernel_6_0= ruleSVMKernel )
                    {
                    // InternalMml.g:470:5: (lv_kernel_6_0= ruleSVMKernel )
                    // InternalMml.g:471:6: lv_kernel_6_0= ruleSVMKernel
                    {

                    						newCompositeNode(grammarAccess.getSVMAccess().getKernelSVMKernelEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
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

            // InternalMml.g:489:3: (otherlv_7= 'classification' ( (lv_svmclassification_8_0= ruleSVMClassification ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMml.g:490:4: otherlv_7= 'classification' ( (lv_svmclassification_8_0= ruleSVMClassification ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getSVMAccess().getClassificationKeyword_4_0());
                    			
                    // InternalMml.g:494:4: ( (lv_svmclassification_8_0= ruleSVMClassification ) )
                    // InternalMml.g:495:5: (lv_svmclassification_8_0= ruleSVMClassification )
                    {
                    // InternalMml.g:495:5: (lv_svmclassification_8_0= ruleSVMClassification )
                    // InternalMml.g:496:6: lv_svmclassification_8_0= ruleSVMClassification
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
    // InternalMml.g:518:1: entryRuleDT returns [EObject current=null] : iv_ruleDT= ruleDT EOF ;
    public final EObject entryRuleDT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDT = null;


        try {
            // InternalMml.g:518:43: (iv_ruleDT= ruleDT EOF )
            // InternalMml.g:519:2: iv_ruleDT= ruleDT EOF
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
    // InternalMml.g:525:1: ruleDT returns [EObject current=null] : ( ( (lv_name_0_0= 'DT' ) ) ( (lv_max_depth_1_0= RULE_INT ) )? ) ;
    public final EObject ruleDT() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_max_depth_1_0=null;


        	enterRule();

        try {
            // InternalMml.g:531:2: ( ( ( (lv_name_0_0= 'DT' ) ) ( (lv_max_depth_1_0= RULE_INT ) )? ) )
            // InternalMml.g:532:2: ( ( (lv_name_0_0= 'DT' ) ) ( (lv_max_depth_1_0= RULE_INT ) )? )
            {
            // InternalMml.g:532:2: ( ( (lv_name_0_0= 'DT' ) ) ( (lv_max_depth_1_0= RULE_INT ) )? )
            // InternalMml.g:533:3: ( (lv_name_0_0= 'DT' ) ) ( (lv_max_depth_1_0= RULE_INT ) )?
            {
            // InternalMml.g:533:3: ( (lv_name_0_0= 'DT' ) )
            // InternalMml.g:534:4: (lv_name_0_0= 'DT' )
            {
            // InternalMml.g:534:4: (lv_name_0_0= 'DT' )
            // InternalMml.g:535:5: lv_name_0_0= 'DT'
            {
            lv_name_0_0=(Token)match(input,21,FOLLOW_19); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDTAccess().getNameDTKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDTRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "DT");
            				

            }


            }

            // InternalMml.g:547:3: ( (lv_max_depth_1_0= RULE_INT ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMml.g:548:4: (lv_max_depth_1_0= RULE_INT )
                    {
                    // InternalMml.g:548:4: (lv_max_depth_1_0= RULE_INT )
                    // InternalMml.g:549:5: lv_max_depth_1_0= RULE_INT
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
    // InternalMml.g:569:1: entryRuleRandomForest returns [EObject current=null] : iv_ruleRandomForest= ruleRandomForest EOF ;
    public final EObject entryRuleRandomForest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomForest = null;


        try {
            // InternalMml.g:569:53: (iv_ruleRandomForest= ruleRandomForest EOF )
            // InternalMml.g:570:2: iv_ruleRandomForest= ruleRandomForest EOF
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
    // InternalMml.g:576:1: ruleRandomForest returns [EObject current=null] : ( (lv_name_0_0= 'RandomForest' ) ) ;
    public final EObject ruleRandomForest() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMml.g:582:2: ( ( (lv_name_0_0= 'RandomForest' ) ) )
            // InternalMml.g:583:2: ( (lv_name_0_0= 'RandomForest' ) )
            {
            // InternalMml.g:583:2: ( (lv_name_0_0= 'RandomForest' ) )
            // InternalMml.g:584:3: (lv_name_0_0= 'RandomForest' )
            {
            // InternalMml.g:584:3: (lv_name_0_0= 'RandomForest' )
            // InternalMml.g:585:4: lv_name_0_0= 'RandomForest'
            {
            lv_name_0_0=(Token)match(input,22,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getRandomForestAccess().getNameRandomForestKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRandomForestRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "RandomForest");
            			

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
    // InternalMml.g:600:1: entryRuleLogisticRegression returns [EObject current=null] : iv_ruleLogisticRegression= ruleLogisticRegression EOF ;
    public final EObject entryRuleLogisticRegression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogisticRegression = null;


        try {
            // InternalMml.g:600:59: (iv_ruleLogisticRegression= ruleLogisticRegression EOF )
            // InternalMml.g:601:2: iv_ruleLogisticRegression= ruleLogisticRegression EOF
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
    // InternalMml.g:607:1: ruleLogisticRegression returns [EObject current=null] : ( (lv_name_0_0= 'LogisticRegression' ) ) ;
    public final EObject ruleLogisticRegression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMml.g:613:2: ( ( (lv_name_0_0= 'LogisticRegression' ) ) )
            // InternalMml.g:614:2: ( (lv_name_0_0= 'LogisticRegression' ) )
            {
            // InternalMml.g:614:2: ( (lv_name_0_0= 'LogisticRegression' ) )
            // InternalMml.g:615:3: (lv_name_0_0= 'LogisticRegression' )
            {
            // InternalMml.g:615:3: (lv_name_0_0= 'LogisticRegression' )
            // InternalMml.g:616:4: lv_name_0_0= 'LogisticRegression'
            {
            lv_name_0_0=(Token)match(input,23,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getLogisticRegressionAccess().getNameLogisticRegressionKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLogisticRegressionRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "LogisticRegression");
            			

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
    // InternalMml.g:631:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalMml.g:631:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalMml.g:632:2: iv_ruleFLOAT= ruleFLOAT EOF
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
    // InternalMml.g:638:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMml.g:644:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalMml.g:645:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMml.g:645:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalMml.g:646:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,24,FOLLOW_13); 

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
    // InternalMml.g:669:1: entryRuleRFormula returns [EObject current=null] : iv_ruleRFormula= ruleRFormula EOF ;
    public final EObject entryRuleRFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRFormula = null;


        try {
            // InternalMml.g:669:49: (iv_ruleRFormula= ruleRFormula EOF )
            // InternalMml.g:670:2: iv_ruleRFormula= ruleRFormula EOF
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
    // InternalMml.g:676:1: ruleRFormula returns [EObject current=null] : (otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) ) ) ;
    public final EObject ruleRFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_predictive_1_0 = null;

        EObject lv_predictors_3_0 = null;



        	enterRule();

        try {
            // InternalMml.g:682:2: ( (otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) ) ) )
            // InternalMml.g:683:2: (otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) ) )
            {
            // InternalMml.g:683:2: (otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) ) )
            // InternalMml.g:684:3: otherlv_0= 'formula' ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )? ( (lv_predictors_3_0= ruleXFormula ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getRFormulaAccess().getFormulaKeyword_0());
            		
            // InternalMml.g:688:3: ( ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_INT)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMml.g:689:4: ( (lv_predictive_1_0= ruleFormulaItem ) ) otherlv_2= '~'
                    {
                    // InternalMml.g:689:4: ( (lv_predictive_1_0= ruleFormulaItem ) )
                    // InternalMml.g:690:5: (lv_predictive_1_0= ruleFormulaItem )
                    {
                    // InternalMml.g:690:5: (lv_predictive_1_0= ruleFormulaItem )
                    // InternalMml.g:691:6: lv_predictive_1_0= ruleFormulaItem
                    {

                    						newCompositeNode(grammarAccess.getRFormulaAccess().getPredictiveFormulaItemParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    otherlv_2=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getRFormulaAccess().getTildeKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalMml.g:713:3: ( (lv_predictors_3_0= ruleXFormula ) )
            // InternalMml.g:714:4: (lv_predictors_3_0= ruleXFormula )
            {
            // InternalMml.g:714:4: (lv_predictors_3_0= ruleXFormula )
            // InternalMml.g:715:5: lv_predictors_3_0= ruleXFormula
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
    // InternalMml.g:736:1: entryRuleXFormula returns [EObject current=null] : iv_ruleXFormula= ruleXFormula EOF ;
    public final EObject entryRuleXFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFormula = null;


        try {
            // InternalMml.g:736:49: (iv_ruleXFormula= ruleXFormula EOF )
            // InternalMml.g:737:2: iv_ruleXFormula= ruleXFormula EOF
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
    // InternalMml.g:743:1: ruleXFormula returns [EObject current=null] : (this_AllVariables_0= ruleAllVariables | this_PredictorVariables_1= rulePredictorVariables ) ;
    public final EObject ruleXFormula() throws RecognitionException {
        EObject current = null;

        EObject this_AllVariables_0 = null;

        EObject this_PredictorVariables_1 = null;



        	enterRule();

        try {
            // InternalMml.g:749:2: ( (this_AllVariables_0= ruleAllVariables | this_PredictorVariables_1= rulePredictorVariables ) )
            // InternalMml.g:750:2: (this_AllVariables_0= ruleAllVariables | this_PredictorVariables_1= rulePredictorVariables )
            {
            // InternalMml.g:750:2: (this_AllVariables_0= ruleAllVariables | this_PredictorVariables_1= rulePredictorVariables )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==28) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMml.g:751:3: this_AllVariables_0= ruleAllVariables
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
                    // InternalMml.g:760:3: this_PredictorVariables_1= rulePredictorVariables
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
    // InternalMml.g:772:1: entryRuleAllVariables returns [EObject current=null] : iv_ruleAllVariables= ruleAllVariables EOF ;
    public final EObject entryRuleAllVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllVariables = null;


        try {
            // InternalMml.g:772:53: (iv_ruleAllVariables= ruleAllVariables EOF )
            // InternalMml.g:773:2: iv_ruleAllVariables= ruleAllVariables EOF
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
    // InternalMml.g:779:1: ruleAllVariables returns [EObject current=null] : ( ( (lv_name_0_0= 'all' ) ) ( (lv_all_1_0= '.' ) ) ) ;
    public final EObject ruleAllVariables() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_all_1_0=null;


        	enterRule();

        try {
            // InternalMml.g:785:2: ( ( ( (lv_name_0_0= 'all' ) ) ( (lv_all_1_0= '.' ) ) ) )
            // InternalMml.g:786:2: ( ( (lv_name_0_0= 'all' ) ) ( (lv_all_1_0= '.' ) ) )
            {
            // InternalMml.g:786:2: ( ( (lv_name_0_0= 'all' ) ) ( (lv_all_1_0= '.' ) ) )
            // InternalMml.g:787:3: ( (lv_name_0_0= 'all' ) ) ( (lv_all_1_0= '.' ) )
            {
            // InternalMml.g:787:3: ( (lv_name_0_0= 'all' ) )
            // InternalMml.g:788:4: (lv_name_0_0= 'all' )
            {
            // InternalMml.g:788:4: (lv_name_0_0= 'all' )
            // InternalMml.g:789:5: lv_name_0_0= 'all'
            {
            lv_name_0_0=(Token)match(input,27,FOLLOW_20); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAllVariablesAccess().getNameAllKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllVariablesRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "all");
            				

            }


            }

            // InternalMml.g:801:3: ( (lv_all_1_0= '.' ) )
            // InternalMml.g:802:4: (lv_all_1_0= '.' )
            {
            // InternalMml.g:802:4: (lv_all_1_0= '.' )
            // InternalMml.g:803:5: lv_all_1_0= '.'
            {
            lv_all_1_0=(Token)match(input,24,FOLLOW_2); 

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
    // InternalMml.g:819:1: entryRulePredictorVariables returns [EObject current=null] : iv_rulePredictorVariables= rulePredictorVariables EOF ;
    public final EObject entryRulePredictorVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredictorVariables = null;


        try {
            // InternalMml.g:819:59: (iv_rulePredictorVariables= rulePredictorVariables EOF )
            // InternalMml.g:820:2: iv_rulePredictorVariables= rulePredictorVariables EOF
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
    // InternalMml.g:826:1: rulePredictorVariables returns [EObject current=null] : ( ( (lv_name_0_0= 'PredictorVariables' ) ) ( ( (lv_vars_1_0= ruleFormulaItem ) ) (otherlv_2= '+' ( (lv_vars_3_0= ruleFormulaItem ) ) )* ) ) ;
    public final EObject rulePredictorVariables() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_vars_1_0 = null;

        EObject lv_vars_3_0 = null;



        	enterRule();

        try {
            // InternalMml.g:832:2: ( ( ( (lv_name_0_0= 'PredictorVariables' ) ) ( ( (lv_vars_1_0= ruleFormulaItem ) ) (otherlv_2= '+' ( (lv_vars_3_0= ruleFormulaItem ) ) )* ) ) )
            // InternalMml.g:833:2: ( ( (lv_name_0_0= 'PredictorVariables' ) ) ( ( (lv_vars_1_0= ruleFormulaItem ) ) (otherlv_2= '+' ( (lv_vars_3_0= ruleFormulaItem ) ) )* ) )
            {
            // InternalMml.g:833:2: ( ( (lv_name_0_0= 'PredictorVariables' ) ) ( ( (lv_vars_1_0= ruleFormulaItem ) ) (otherlv_2= '+' ( (lv_vars_3_0= ruleFormulaItem ) ) )* ) )
            // InternalMml.g:834:3: ( (lv_name_0_0= 'PredictorVariables' ) ) ( ( (lv_vars_1_0= ruleFormulaItem ) ) (otherlv_2= '+' ( (lv_vars_3_0= ruleFormulaItem ) ) )* )
            {
            // InternalMml.g:834:3: ( (lv_name_0_0= 'PredictorVariables' ) )
            // InternalMml.g:835:4: (lv_name_0_0= 'PredictorVariables' )
            {
            // InternalMml.g:835:4: (lv_name_0_0= 'PredictorVariables' )
            // InternalMml.g:836:5: lv_name_0_0= 'PredictorVariables'
            {
            lv_name_0_0=(Token)match(input,28,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPredictorVariablesAccess().getNamePredictorVariablesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPredictorVariablesRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "PredictorVariables");
            				

            }


            }

            // InternalMml.g:848:3: ( ( (lv_vars_1_0= ruleFormulaItem ) ) (otherlv_2= '+' ( (lv_vars_3_0= ruleFormulaItem ) ) )* )
            // InternalMml.g:849:4: ( (lv_vars_1_0= ruleFormulaItem ) ) (otherlv_2= '+' ( (lv_vars_3_0= ruleFormulaItem ) ) )*
            {
            // InternalMml.g:849:4: ( (lv_vars_1_0= ruleFormulaItem ) )
            // InternalMml.g:850:5: (lv_vars_1_0= ruleFormulaItem )
            {
            // InternalMml.g:850:5: (lv_vars_1_0= ruleFormulaItem )
            // InternalMml.g:851:6: lv_vars_1_0= ruleFormulaItem
            {

            						newCompositeNode(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_24);
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

            // InternalMml.g:868:4: (otherlv_2= '+' ( (lv_vars_3_0= ruleFormulaItem ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMml.g:869:5: otherlv_2= '+' ( (lv_vars_3_0= ruleFormulaItem ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_23); 

            	    					newLeafNode(otherlv_2, grammarAccess.getPredictorVariablesAccess().getPlusSignKeyword_1_1_0());
            	    				
            	    // InternalMml.g:873:5: ( (lv_vars_3_0= ruleFormulaItem ) )
            	    // InternalMml.g:874:6: (lv_vars_3_0= ruleFormulaItem )
            	    {
            	    // InternalMml.g:874:6: (lv_vars_3_0= ruleFormulaItem )
            	    // InternalMml.g:875:7: lv_vars_3_0= ruleFormulaItem
            	    {

            	    							newCompositeNode(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_24);
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
            	    break loop11;
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
    // InternalMml.g:898:1: entryRuleFormulaItem returns [EObject current=null] : iv_ruleFormulaItem= ruleFormulaItem EOF ;
    public final EObject entryRuleFormulaItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulaItem = null;


        try {
            // InternalMml.g:898:52: (iv_ruleFormulaItem= ruleFormulaItem EOF )
            // InternalMml.g:899:2: iv_ruleFormulaItem= ruleFormulaItem EOF
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
    // InternalMml.g:905:1: ruleFormulaItem returns [EObject current=null] : ( ( (lv_column_0_0= RULE_INT ) ) | ( (lv_colName_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleFormulaItem() throws RecognitionException {
        EObject current = null;

        Token lv_column_0_0=null;
        Token lv_colName_1_0=null;


        	enterRule();

        try {
            // InternalMml.g:911:2: ( ( ( (lv_column_0_0= RULE_INT ) ) | ( (lv_colName_1_0= RULE_STRING ) ) ) )
            // InternalMml.g:912:2: ( ( (lv_column_0_0= RULE_INT ) ) | ( (lv_colName_1_0= RULE_STRING ) ) )
            {
            // InternalMml.g:912:2: ( ( (lv_column_0_0= RULE_INT ) ) | ( (lv_colName_1_0= RULE_STRING ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_STRING) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMml.g:913:3: ( (lv_column_0_0= RULE_INT ) )
                    {
                    // InternalMml.g:913:3: ( (lv_column_0_0= RULE_INT ) )
                    // InternalMml.g:914:4: (lv_column_0_0= RULE_INT )
                    {
                    // InternalMml.g:914:4: (lv_column_0_0= RULE_INT )
                    // InternalMml.g:915:5: lv_column_0_0= RULE_INT
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
                    // InternalMml.g:932:3: ( (lv_colName_1_0= RULE_STRING ) )
                    {
                    // InternalMml.g:932:3: ( (lv_colName_1_0= RULE_STRING ) )
                    // InternalMml.g:933:4: (lv_colName_1_0= RULE_STRING )
                    {
                    // InternalMml.g:933:4: (lv_colName_1_0= RULE_STRING )
                    // InternalMml.g:934:5: lv_colName_1_0= RULE_STRING
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
    // InternalMml.g:954:1: entryRuleValidation returns [EObject current=null] : iv_ruleValidation= ruleValidation EOF ;
    public final EObject entryRuleValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidation = null;


        try {
            // InternalMml.g:954:51: (iv_ruleValidation= ruleValidation EOF )
            // InternalMml.g:955:2: iv_ruleValidation= ruleValidation EOF
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
    // InternalMml.g:961:1: ruleValidation returns [EObject current=null] : ( ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+ ) ;
    public final EObject ruleValidation() throws RecognitionException {
        EObject current = null;

        EObject lv_stratification_0_0 = null;

        Enumerator lv_metric_1_0 = null;



        	enterRule();

        try {
            // InternalMml.g:967:2: ( ( ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+ ) )
            // InternalMml.g:968:2: ( ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+ )
            {
            // InternalMml.g:968:2: ( ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+ )
            // InternalMml.g:969:3: ( (lv_stratification_0_0= ruleStratificationMethod ) ) ( (lv_metric_1_0= ruleValidationMetric ) )+
            {
            // InternalMml.g:969:3: ( (lv_stratification_0_0= ruleStratificationMethod ) )
            // InternalMml.g:970:4: (lv_stratification_0_0= ruleStratificationMethod )
            {
            // InternalMml.g:970:4: (lv_stratification_0_0= ruleStratificationMethod )
            // InternalMml.g:971:5: lv_stratification_0_0= ruleStratificationMethod
            {

            					newCompositeNode(grammarAccess.getValidationAccess().getStratificationStratificationMethodParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalMml.g:988:3: ( (lv_metric_1_0= ruleValidationMetric ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=45 && LA13_0<=47)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMml.g:989:4: (lv_metric_1_0= ruleValidationMetric )
            	    {
            	    // InternalMml.g:989:4: (lv_metric_1_0= ruleValidationMetric )
            	    // InternalMml.g:990:5: lv_metric_1_0= ruleValidationMetric
            	    {

            	    					newCompositeNode(grammarAccess.getValidationAccess().getMetricValidationMetricEnumRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    // InternalMml.g:1011:1: entryRuleStratificationMethod returns [EObject current=null] : iv_ruleStratificationMethod= ruleStratificationMethod EOF ;
    public final EObject entryRuleStratificationMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStratificationMethod = null;


        try {
            // InternalMml.g:1011:61: (iv_ruleStratificationMethod= ruleStratificationMethod EOF )
            // InternalMml.g:1012:2: iv_ruleStratificationMethod= ruleStratificationMethod EOF
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
    // InternalMml.g:1018:1: ruleStratificationMethod returns [EObject current=null] : this_TrainingTest_0= ruleTrainingTest ;
    public final EObject ruleStratificationMethod() throws RecognitionException {
        EObject current = null;

        EObject this_TrainingTest_0 = null;



        	enterRule();

        try {
            // InternalMml.g:1024:2: (this_TrainingTest_0= ruleTrainingTest )
            // InternalMml.g:1025:2: this_TrainingTest_0= ruleTrainingTest
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
    // InternalMml.g:1036:1: entryRuleTrainingTest returns [EObject current=null] : iv_ruleTrainingTest= ruleTrainingTest EOF ;
    public final EObject entryRuleTrainingTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainingTest = null;


        try {
            // InternalMml.g:1036:53: (iv_ruleTrainingTest= ruleTrainingTest EOF )
            // InternalMml.g:1037:2: iv_ruleTrainingTest= ruleTrainingTest EOF
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
    // InternalMml.g:1043:1: ruleTrainingTest returns [EObject current=null] : ( ( (lv_name_0_0= 'TrainingTest' ) ) otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= ruleFLOAT ) ) otherlv_4= '}' ) ;
    public final EObject ruleTrainingTest() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_number_3_0 = null;



        	enterRule();

        try {
            // InternalMml.g:1049:2: ( ( ( (lv_name_0_0= 'TrainingTest' ) ) otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= ruleFLOAT ) ) otherlv_4= '}' ) )
            // InternalMml.g:1050:2: ( ( (lv_name_0_0= 'TrainingTest' ) ) otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= ruleFLOAT ) ) otherlv_4= '}' )
            {
            // InternalMml.g:1050:2: ( ( (lv_name_0_0= 'TrainingTest' ) ) otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= ruleFLOAT ) ) otherlv_4= '}' )
            // InternalMml.g:1051:3: ( (lv_name_0_0= 'TrainingTest' ) ) otherlv_1= '{' otherlv_2= 'pourcentageTraining' ( (lv_number_3_0= ruleFLOAT ) ) otherlv_4= '}'
            {
            // InternalMml.g:1051:3: ( (lv_name_0_0= 'TrainingTest' ) )
            // InternalMml.g:1052:4: (lv_name_0_0= 'TrainingTest' )
            {
            // InternalMml.g:1052:4: (lv_name_0_0= 'TrainingTest' )
            // InternalMml.g:1053:5: lv_name_0_0= 'TrainingTest'
            {
            lv_name_0_0=(Token)match(input,30,FOLLOW_27); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTrainingTestAccess().getNameTrainingTestKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrainingTestRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "TrainingTest");
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getTrainingTestAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getTrainingTestAccess().getPourcentageTrainingKeyword_2());
            		
            // InternalMml.g:1073:3: ( (lv_number_3_0= ruleFLOAT ) )
            // InternalMml.g:1074:4: (lv_number_3_0= ruleFLOAT )
            {
            // InternalMml.g:1074:4: (lv_number_3_0= ruleFLOAT )
            // InternalMml.g:1075:5: lv_number_3_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getTrainingTestAccess().getNumberFLOATParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
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

            otherlv_4=(Token)match(input,33,FOLLOW_2); 

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
    // InternalMml.g:1100:1: ruleCSVSeparator returns [Enumerator current=null] : ( (enumLiteral_0= ',' ) | (enumLiteral_1= ';' ) ) ;
    public final Enumerator ruleCSVSeparator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMml.g:1106:2: ( ( (enumLiteral_0= ',' ) | (enumLiteral_1= ';' ) ) )
            // InternalMml.g:1107:2: ( (enumLiteral_0= ',' ) | (enumLiteral_1= ';' ) )
            {
            // InternalMml.g:1107:2: ( (enumLiteral_0= ',' ) | (enumLiteral_1= ';' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            else if ( (LA14_0==35) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMml.g:1108:3: (enumLiteral_0= ',' )
                    {
                    // InternalMml.g:1108:3: (enumLiteral_0= ',' )
                    // InternalMml.g:1109:4: enumLiteral_0= ','
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getCSVSeparatorAccess().getCOMMAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCSVSeparatorAccess().getCOMMAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1116:3: (enumLiteral_1= ';' )
                    {
                    // InternalMml.g:1116:3: (enumLiteral_1= ';' )
                    // InternalMml.g:1117:4: enumLiteral_1= ';'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

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
    // InternalMml.g:1127:1: ruleFrameworkLang returns [Enumerator current=null] : ( (enumLiteral_0= 'scikit-learn' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'Weka' ) ) ;
    public final Enumerator ruleFrameworkLang() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMml.g:1133:2: ( ( (enumLiteral_0= 'scikit-learn' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'Weka' ) ) )
            // InternalMml.g:1134:2: ( (enumLiteral_0= 'scikit-learn' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'Weka' ) )
            {
            // InternalMml.g:1134:2: ( (enumLiteral_0= 'scikit-learn' ) | (enumLiteral_1= 'R' ) | (enumLiteral_2= 'Weka' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt15=1;
                }
                break;
            case 37:
                {
                alt15=2;
                }
                break;
            case 38:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMml.g:1135:3: (enumLiteral_0= 'scikit-learn' )
                    {
                    // InternalMml.g:1135:3: (enumLiteral_0= 'scikit-learn' )
                    // InternalMml.g:1136:4: enumLiteral_0= 'scikit-learn'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getFrameworkLangAccess().getSCIKITEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFrameworkLangAccess().getSCIKITEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1143:3: (enumLiteral_1= 'R' )
                    {
                    // InternalMml.g:1143:3: (enumLiteral_1= 'R' )
                    // InternalMml.g:1144:4: enumLiteral_1= 'R'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getFrameworkLangAccess().getREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFrameworkLangAccess().getREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:1151:3: (enumLiteral_2= 'Weka' )
                    {
                    // InternalMml.g:1151:3: (enumLiteral_2= 'Weka' )
                    // InternalMml.g:1152:4: enumLiteral_2= 'Weka'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getFrameworkLangAccess().getJavaWekaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFrameworkLangAccess().getJavaWekaEnumLiteralDeclaration_2());
                    			

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
    // InternalMml.g:1162:1: ruleSVMKernel returns [Enumerator current=null] : ( (enumLiteral_0= 'linear' ) | (enumLiteral_1= 'polynomial' ) | (enumLiteral_2= 'radial' ) ) ;
    public final Enumerator ruleSVMKernel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMml.g:1168:2: ( ( (enumLiteral_0= 'linear' ) | (enumLiteral_1= 'polynomial' ) | (enumLiteral_2= 'radial' ) ) )
            // InternalMml.g:1169:2: ( (enumLiteral_0= 'linear' ) | (enumLiteral_1= 'polynomial' ) | (enumLiteral_2= 'radial' ) )
            {
            // InternalMml.g:1169:2: ( (enumLiteral_0= 'linear' ) | (enumLiteral_1= 'polynomial' ) | (enumLiteral_2= 'radial' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt16=1;
                }
                break;
            case 40:
                {
                alt16=2;
                }
                break;
            case 41:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMml.g:1170:3: (enumLiteral_0= 'linear' )
                    {
                    // InternalMml.g:1170:3: (enumLiteral_0= 'linear' )
                    // InternalMml.g:1171:4: enumLiteral_0= 'linear'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getSVMKernelAccess().getLinearEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSVMKernelAccess().getLinearEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1178:3: (enumLiteral_1= 'polynomial' )
                    {
                    // InternalMml.g:1178:3: (enumLiteral_1= 'polynomial' )
                    // InternalMml.g:1179:4: enumLiteral_1= 'polynomial'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getSVMKernelAccess().getPolyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSVMKernelAccess().getPolyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:1186:3: (enumLiteral_2= 'radial' )
                    {
                    // InternalMml.g:1186:3: (enumLiteral_2= 'radial' )
                    // InternalMml.g:1187:4: enumLiteral_2= 'radial'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

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
    // InternalMml.g:1197:1: ruleSVMClassification returns [Enumerator current=null] : ( (enumLiteral_0= 'C-classification' ) | (enumLiteral_1= 'nu-classification' ) | (enumLiteral_2= 'one-classification' ) ) ;
    public final Enumerator ruleSVMClassification() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMml.g:1203:2: ( ( (enumLiteral_0= 'C-classification' ) | (enumLiteral_1= 'nu-classification' ) | (enumLiteral_2= 'one-classification' ) ) )
            // InternalMml.g:1204:2: ( (enumLiteral_0= 'C-classification' ) | (enumLiteral_1= 'nu-classification' ) | (enumLiteral_2= 'one-classification' ) )
            {
            // InternalMml.g:1204:2: ( (enumLiteral_0= 'C-classification' ) | (enumLiteral_1= 'nu-classification' ) | (enumLiteral_2= 'one-classification' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt17=1;
                }
                break;
            case 43:
                {
                alt17=2;
                }
                break;
            case 44:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMml.g:1205:3: (enumLiteral_0= 'C-classification' )
                    {
                    // InternalMml.g:1205:3: (enumLiteral_0= 'C-classification' )
                    // InternalMml.g:1206:4: enumLiteral_0= 'C-classification'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getSVMClassificationAccess().getCClassEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSVMClassificationAccess().getCClassEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1213:3: (enumLiteral_1= 'nu-classification' )
                    {
                    // InternalMml.g:1213:3: (enumLiteral_1= 'nu-classification' )
                    // InternalMml.g:1214:4: enumLiteral_1= 'nu-classification'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getSVMClassificationAccess().getNuClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSVMClassificationAccess().getNuClassEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:1221:3: (enumLiteral_2= 'one-classification' )
                    {
                    // InternalMml.g:1221:3: (enumLiteral_2= 'one-classification' )
                    // InternalMml.g:1222:4: enumLiteral_2= 'one-classification'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

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


    // $ANTLR start "ruleValidationMetric"
    // InternalMml.g:1232:1: ruleValidationMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'recall' ) | (enumLiteral_1= 'precision' ) | (enumLiteral_2= 'F1' ) ) ;
    public final Enumerator ruleValidationMetric() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMml.g:1238:2: ( ( (enumLiteral_0= 'recall' ) | (enumLiteral_1= 'precision' ) | (enumLiteral_2= 'F1' ) ) )
            // InternalMml.g:1239:2: ( (enumLiteral_0= 'recall' ) | (enumLiteral_1= 'precision' ) | (enumLiteral_2= 'F1' ) )
            {
            // InternalMml.g:1239:2: ( (enumLiteral_0= 'recall' ) | (enumLiteral_1= 'precision' ) | (enumLiteral_2= 'F1' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt18=1;
                }
                break;
            case 46:
                {
                alt18=2;
                }
                break;
            case 47:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMml.g:1240:3: (enumLiteral_0= 'recall' )
                    {
                    // InternalMml.g:1240:3: (enumLiteral_0= 'recall' )
                    // InternalMml.g:1241:4: enumLiteral_0= 'recall'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getValidationMetricAccess().getRECALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getValidationMetricAccess().getRECALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:1248:3: (enumLiteral_1= 'precision' )
                    {
                    // InternalMml.g:1248:3: (enumLiteral_1= 'precision' )
                    // InternalMml.g:1249:4: enumLiteral_1= 'precision'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getValidationMetricAccess().getPRECISIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getValidationMetricAccess().getPRECISIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:1256:3: (enumLiteral_2= 'F1' )
                    {
                    // InternalMml.g:1256:3: (enumLiteral_2= 'F1' )
                    // InternalMml.g:1257:4: enumLiteral_2= 'F1'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000E10000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});

}