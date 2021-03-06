/*
 * generated by Xtext 2.17.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMmlParser;
import org.xtext.example.mydsl.services.MmlGrammarAccess;

public class MmlParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MmlGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MmlGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMLAlgorithmAccess().getAlternatives(), "rule__MLAlgorithm__Alternatives");
			builder.put(grammarAccess.getXFormulaAccess().getAlternatives(), "rule__XFormula__Alternatives");
			builder.put(grammarAccess.getFormulaItemAccess().getAlternatives(), "rule__FormulaItem__Alternatives");
			builder.put(grammarAccess.getCSVSeparatorAccess().getAlternatives(), "rule__CSVSeparator__Alternatives");
			builder.put(grammarAccess.getFrameworkLangAccess().getAlternatives(), "rule__FrameworkLang__Alternatives");
			builder.put(grammarAccess.getSVMKernelAccess().getAlternatives(), "rule__SVMKernel__Alternatives");
			builder.put(grammarAccess.getSVMClassificationAccess().getAlternatives(), "rule__SVMClassification__Alternatives");
			builder.put(grammarAccess.getCLASSAccess().getAlternatives(), "rule__CLASS__Alternatives");
			builder.put(grammarAccess.getValidationMetricAccess().getAlternatives(), "rule__ValidationMetric__Alternatives");
			builder.put(grammarAccess.getMMLModelAccess().getGroup(), "rule__MMLModel__Group__0");
			builder.put(grammarAccess.getDataInputAccess().getGroup(), "rule__DataInput__Group__0");
			builder.put(grammarAccess.getCSVParsingConfigurationAccess().getGroup(), "rule__CSVParsingConfiguration__Group__0");
			builder.put(grammarAccess.getMLChoiceAlgorithmAccess().getGroup(), "rule__MLChoiceAlgorithm__Group__0");
			builder.put(grammarAccess.getSVMAccess().getGroup(), "rule__SVM__Group__0");
			builder.put(grammarAccess.getSVMAccess().getGroup_1(), "rule__SVM__Group_1__0");
			builder.put(grammarAccess.getSVMAccess().getGroup_2(), "rule__SVM__Group_2__0");
			builder.put(grammarAccess.getSVMAccess().getGroup_3(), "rule__SVM__Group_3__0");
			builder.put(grammarAccess.getSVMAccess().getGroup_4(), "rule__SVM__Group_4__0");
			builder.put(grammarAccess.getDTAccess().getGroup(), "rule__DT__Group__0");
			builder.put(grammarAccess.getRandomForestAccess().getGroup(), "rule__RandomForest__Group__0");
			builder.put(grammarAccess.getLogisticRegressionAccess().getGroup(), "rule__LogisticRegression__Group__0");
			builder.put(grammarAccess.getFLOATAccess().getGroup(), "rule__FLOAT__Group__0");
			builder.put(grammarAccess.getRFormulaAccess().getGroup(), "rule__RFormula__Group__0");
			builder.put(grammarAccess.getRFormulaAccess().getGroup_1(), "rule__RFormula__Group_1__0");
			builder.put(grammarAccess.getAllVariablesAccess().getGroup(), "rule__AllVariables__Group__0");
			builder.put(grammarAccess.getPredictorVariablesAccess().getGroup(), "rule__PredictorVariables__Group__0");
			builder.put(grammarAccess.getPredictorVariablesAccess().getGroup_1(), "rule__PredictorVariables__Group_1__0");
			builder.put(grammarAccess.getPredictorVariablesAccess().getGroup_1_1(), "rule__PredictorVariables__Group_1_1__0");
			builder.put(grammarAccess.getValidationAccess().getGroup(), "rule__Validation__Group__0");
			builder.put(grammarAccess.getTrainingTestAccess().getGroup(), "rule__TrainingTest__Group__0");
			builder.put(grammarAccess.getMMLModelAccess().getPreamAssignment_1(), "rule__MMLModel__PreamAssignment_1");
			builder.put(grammarAccess.getMMLModelAccess().getInputAssignment_2(), "rule__MMLModel__InputAssignment_2");
			builder.put(grammarAccess.getMMLModelAccess().getAlgorithmAssignment_3(), "rule__MMLModel__AlgorithmAssignment_3");
			builder.put(grammarAccess.getMMLModelAccess().getFormulaAssignment_4(), "rule__MMLModel__FormulaAssignment_4");
			builder.put(grammarAccess.getMMLModelAccess().getValidationAssignment_5(), "rule__MMLModel__ValidationAssignment_5");
			builder.put(grammarAccess.getPREAMBULEAccess().getNomProgrammeAssignment(), "rule__PREAMBULE__NomProgrammeAssignment");
			builder.put(grammarAccess.getDataInputAccess().getFilelocationAssignment_1(), "rule__DataInput__FilelocationAssignment_1");
			builder.put(grammarAccess.getDataInputAccess().getParsingInstructionAssignment_2(), "rule__DataInput__ParsingInstructionAssignment_2");
			builder.put(grammarAccess.getCSVParsingConfigurationAccess().getSepAssignment_1(), "rule__CSVParsingConfiguration__SepAssignment_1");
			builder.put(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkAssignment_1(), "rule__MLChoiceAlgorithm__FrameworkAssignment_1");
			builder.put(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmAssignment_3(), "rule__MLChoiceAlgorithm__AlgorithmAssignment_3");
			builder.put(grammarAccess.getSVMAccess().getNameAssignment_0(), "rule__SVM__NameAssignment_0");
			builder.put(grammarAccess.getSVMAccess().getGammaAssignment_1_1(), "rule__SVM__GammaAssignment_1_1");
			builder.put(grammarAccess.getSVMAccess().getCAssignment_2_1(), "rule__SVM__CAssignment_2_1");
			builder.put(grammarAccess.getSVMAccess().getKernelAssignment_3_1(), "rule__SVM__KernelAssignment_3_1");
			builder.put(grammarAccess.getSVMAccess().getSvmclassificationAssignment_4_1(), "rule__SVM__SvmclassificationAssignment_4_1");
			builder.put(grammarAccess.getDTAccess().getNameAssignment_0(), "rule__DT__NameAssignment_0");
			builder.put(grammarAccess.getDTAccess().getMax_depthAssignment_1(), "rule__DT__Max_depthAssignment_1");
			builder.put(grammarAccess.getRandomForestAccess().getNameAssignment_0(), "rule__RandomForest__NameAssignment_0");
			builder.put(grammarAccess.getRandomForestAccess().getNtreeAssignment_1(), "rule__RandomForest__NtreeAssignment_1");
			builder.put(grammarAccess.getLogisticRegressionAccess().getNameAssignment_0(), "rule__LogisticRegression__NameAssignment_0");
			builder.put(grammarAccess.getLogisticRegressionAccess().getClassAssignment_2(), "rule__LogisticRegression__ClassAssignment_2");
			builder.put(grammarAccess.getRFormulaAccess().getPredictiveAssignment_1_0(), "rule__RFormula__PredictiveAssignment_1_0");
			builder.put(grammarAccess.getRFormulaAccess().getPredictorsAssignment_2(), "rule__RFormula__PredictorsAssignment_2");
			builder.put(grammarAccess.getAllVariablesAccess().getNameAssignment_0(), "rule__AllVariables__NameAssignment_0");
			builder.put(grammarAccess.getAllVariablesAccess().getAllAssignment_1(), "rule__AllVariables__AllAssignment_1");
			builder.put(grammarAccess.getPredictorVariablesAccess().getNameAssignment_0(), "rule__PredictorVariables__NameAssignment_0");
			builder.put(grammarAccess.getPredictorVariablesAccess().getVarsAssignment_1_0(), "rule__PredictorVariables__VarsAssignment_1_0");
			builder.put(grammarAccess.getPredictorVariablesAccess().getVarsAssignment_1_1_1(), "rule__PredictorVariables__VarsAssignment_1_1_1");
			builder.put(grammarAccess.getFormulaItemAccess().getColumnAssignment_0(), "rule__FormulaItem__ColumnAssignment_0");
			builder.put(grammarAccess.getFormulaItemAccess().getColNameAssignment_1(), "rule__FormulaItem__ColNameAssignment_1");
			builder.put(grammarAccess.getValidationAccess().getStratificationAssignment_0(), "rule__Validation__StratificationAssignment_0");
			builder.put(grammarAccess.getValidationAccess().getMetricAssignment_1(), "rule__Validation__MetricAssignment_1");
			builder.put(grammarAccess.getTrainingTestAccess().getNameAssignment_0(), "rule__TrainingTest__NameAssignment_0");
			builder.put(grammarAccess.getTrainingTestAccess().getNumberAssignment_3(), "rule__TrainingTest__NumberAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MmlGrammarAccess grammarAccess;

	@Override
	protected InternalMmlParser createParser() {
		InternalMmlParser result = new InternalMmlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MmlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MmlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
