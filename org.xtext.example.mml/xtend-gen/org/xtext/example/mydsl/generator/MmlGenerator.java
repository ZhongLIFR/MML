/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.mydsl.mml.AllVariables;
import org.xtext.example.mydsl.mml.CSVSeparator;
import org.xtext.example.mydsl.mml.DT;
import org.xtext.example.mydsl.mml.FormulaItem;
import org.xtext.example.mydsl.mml.FrameworkLang;
import org.xtext.example.mydsl.mml.LogisticRegression;
import org.xtext.example.mydsl.mml.MLAlgorithm;
import org.xtext.example.mydsl.mml.MMLModel;
import org.xtext.example.mydsl.mml.PredictorVariables;
import org.xtext.example.mydsl.mml.RFormula;
import org.xtext.example.mydsl.mml.RandomForest;
import org.xtext.example.mydsl.mml.SVM;
import org.xtext.example.mydsl.mml.SVMClassification;
import org.xtext.example.mydsl.mml.SVMKernel;
import org.xtext.example.mydsl.mml.StratificationMethod;
import org.xtext.example.mydsl.mml.TrainingTest;
import org.xtext.example.mydsl.mml.Validation;
import org.xtext.example.mydsl.mml.ValidationMetric;
import org.xtext.example.mydsl.mml.XFormula;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MmlGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
    final MMLModel root = ((MMLModel) _head);
    final String path = root.getInput().getFilelocation();
    final CSVSeparator delim = root.getInput().getParsingInstruction().getSep();
    final FrameworkLang Framework = root.getAlgorithm().getFramework();
    final RFormula formula = root.getFormula();
    Object _xifexpression = null;
    int _column = formula.getPredictive().getColumn();
    boolean _notEquals = (_column != 0);
    if (_notEquals) {
      _xifexpression = Integer.valueOf(formula.getPredictive().getColumn());
    } else {
      String _colName = formula.getPredictive().getColName();
      String _plus = ("\'" + _colName);
      _xifexpression = (_plus + "\'");
    }
    final Object item_predictive = ((Object)_xifexpression);
    final XFormula item_predictors = formula.getPredictors();
    final Validation valid = root.getValidation();
    final StratificationMethod stratificationmethod = valid.getStratification();
    final EList<ValidationMetric> validationmetric = valid.getMetric();
    String lkol = "";
    String preds = "";
    String _name = item_predictors.getName();
    if (_name != null) {
      switch (_name) {
        case "all":
          final AllVariables all = ((AllVariables) item_predictors);
          String _all = all.getAll();
          String _plus_1 = (preds + _all);
          preds = _plus_1;
          lkol = "yes";
          break;
        case "PredictorVariables":
          lkol = "no";
          preds = (preds + "c( ");
          final PredictorVariables pred = ((PredictorVariables) item_predictors);
          EList<FormulaItem> _vars = pred.getVars();
          for (final FormulaItem e : _vars) {
            int _column_1 = e.getColumn();
            boolean _notEquals_1 = (_column_1 != 0);
            if (_notEquals_1) {
              int _column_2 = e.getColumn();
              String _plus_2 = (preds + Integer.valueOf(_column_2));
              String _plus_3 = (_plus_2 + " ,");
              preds = _plus_3;
            } else {
              String _colName_1 = e.getColName();
              String _plus_4 = ((preds + "\'") + _colName_1);
              String _plus_5 = (_plus_4 + "\',");
              preds = _plus_5;
            }
          }
          int _length = preds.length();
          int _minus = (_length - 1);
          preds = preds.substring(0, _minus);
          preds = (preds + " )");
          break;
      }
    }
    ArrayList<Object> list = CollectionLiterals.<Object>newArrayList();
    String _name_1 = root.getAlgorithm().getAlgorithm().getName();
    if (_name_1 != null) {
      switch (_name_1) {
        case "SVM":
          MLAlgorithm _algorithm = root.getAlgorithm().getAlgorithm();
          final SVM model = ((SVM) _algorithm);
          final String name = root.getAlgorithm().getAlgorithm().getName();
          list.add(name);
          final String gamma = model.getGamma();
          list.add(gamma);
          final String c = model.getC();
          list.add(c);
          final SVMKernel kernel = model.getKernel();
          list.add(kernel);
          final SVMClassification class_ = model.getSvmclassification();
          list.add(class_);
          break;
        case "DT":
          MLAlgorithm _algorithm_1 = root.getAlgorithm().getAlgorithm();
          final DT model_1 = ((DT) _algorithm_1);
          final String name_1 = root.getAlgorithm().getAlgorithm().getName();
          list.add(name_1);
          final int depth = model_1.getMax_depth();
          list.add(Integer.valueOf(depth));
          break;
        case "RandomForest":
          MLAlgorithm _algorithm_2 = root.getAlgorithm().getAlgorithm();
          final RandomForest model_2 = ((RandomForest) _algorithm_2);
          final String name_2 = root.getAlgorithm().getAlgorithm().getName();
          list.add(name_2);
          break;
        case "LogisticRegression":
          MLAlgorithm _algorithm_3 = root.getAlgorithm().getAlgorithm();
          final LogisticRegression model_3 = ((LogisticRegression) _algorithm_3);
          final String name_3 = root.getAlgorithm().getAlgorithm().getName();
          list.add(name_3);
          break;
      }
    }
    ArrayList<String> validation = CollectionLiterals.<String>newArrayList();
    final TrainingTest train = ((TrainingTest) stratificationmethod);
    validation.add("trainin_test");
    validation.add(train.getNumber());
    fsa.generateFile("AllTheStates.txt", 
      (((((((((((((((((((((("path " + path) + "\n") + "delim ") + delim) + "\n") + "framework ") + Framework) + "\n") + 
        "y ") + item_predictive) + "\n") + "x ") + preds) + "\n") + "algo ") + list) + "\n") + "validation ") + validation) + "\n") + 
        "metric ") + validationmetric));
    String _string = Framework.toString();
    boolean _equals = Objects.equal(_string, "R");
    if (_equals) {
      String _string_1 = list.get(0).toString();
      boolean _equals_1 = Objects.equal(_string_1, "SVM");
      if (_equals_1) {
        boolean _equals_2 = Objects.equal(lkol, "no");
        if (_equals_2) {
          String _get = validation.get(1);
          String _plus_6 = ((((((((("library(rpart)\nlibrary(readr) #read csv files\nlibrary(caret) # crossvalidation function\nlibrary(ROCR)\nlibrary(e1071)  #svm model\n\nreadFile <- function(path, sep, header = TRUE) {\n  mydata = read.csv(path, sep, header = header)\n  return(mydata)\n}\n\n\ndataSummary<-function(mydata){\n  strData=str(mydata)\n  return(strData)\n}\n\n\ngetDepVar=function(depVar){\n  return(depVar)\n}\n\ngetIndepVar=function(preds){\n  return(preds)\n}\n\ncrossValidation <- function(mydata, prob){\n  trainIndex=list()\n  train=list()\n  test=list()\n  set.seed(100) \n  dat=data.frame(mydata)\n  trainIndex <- createDataPartition(dat[,1] , p=prob)\n  \n  train=dat[as.numeric(unlist(trainIndex) ),]\n  test=dat[-as.numeric(unlist(trainIndex) ),]\n  \n  return(list(train, test) )\n} \n\nsvmModel=function(train_test, depVar, indepVars, type, kernel, gamma, cost) {\n  tabless=list()\n  accuracy=list()\n  predictionModel=list()  \n  modelSVM=NULL\n  dat=data.frame(train_test[1])\n\n  GroupVars  <- paste(indepVars, collapse = \' + \')\n  \n  # Create the formula from the variables\n  fRpart <- as.formula(paste(depVar, GroupVars, sep=\' ~ \'))\n  \n  svm= svm(formula = fRpart, data = dat, na.action = na.pass, type= type, kernel=kernel, cost=cost, gamma=gamma)\n\n  test = data.frame(train_test[2])\n  pred <- predict(svm,test[ , indepVars])\n  g = NULL\n  if(is.integer(depVar)){\n    g = depVar\n  }else{\n    g = which(colnames(data) == depVar)\n  }\n\t\n  cm = confusionMatrix(pred, test[,g]) # create the confusion matrix\n  Precision = mean(cm$byClass[,5])\n  Recall = mean(cm$byClass[,6])\n  F1 = mean(cm$byClass[,7])\n  cat(\'Precision : \' , Precision , \'\n\')\n  cat(\'Recall : \' , Recall, \'\n\')\n  cat(\'F1 : \' , F1, \'\n\')  \n}\n\n\n\ndepVar= NULL\ndata = readFile(\'" + path) + "\' , \'") + delim) + "\' )\nstrData = dataSummary(data)\n\nY=getDepVar(") + item_predictive) + " )\nX=getIndepVar(") + preds) + " )\n\ntrain_test=crossValidation(data, ") + _get);
          String _plus_7 = (_plus_6 + " )\n\nAccuracySVM=svmModel(train_test , Y , X , \'");
          Object _get_1 = list.get(4);
          String _plus_8 = (_plus_7 + _get_1);
          String _plus_9 = (_plus_8 + "\' , \'");
          Object _get_2 = list.get(3);
          String _plus_10 = (_plus_9 + _get_2);
          String _plus_11 = (_plus_10 + "\' , ");
          Object _get_3 = list.get(2);
          String _plus_12 = (_plus_11 + _get_3);
          String _plus_13 = (_plus_12 + " , ");
          Object _get_4 = list.get(1);
          String _plus_14 = (_plus_13 + _get_4);
          String _plus_15 = (_plus_14 + ") ");
          fsa.generateFile("SVM.R", _plus_15);
        } else {
          String _get_5 = validation.get(1);
          String _plus_16 = ((((((("library(rpart)\nlibrary(readr) #read csv files\nlibrary(caret) # crossvalidation function\nlibrary(ROCR)\nlibrary(e1071)  #svm model\n\nreadFile <- function(path, sep, header = TRUE) {\n  mydata = read.csv(path, sep, header = header)\n  return(mydata)\n}\n\n\ndataSummary<-function(mydata){\n  strData=str(mydata)\n  return(strData)\n}\n\n\ngetDepVar=function(depVar){\n  return(depVar)\n}\n\ngetIndepVar=function(preds){\n  return(preds)\n}\n\ncrossValidation <- function(mydata, prob){\n  trainIndex=list()\n  train=list()\n  test=list()\n  set.seed(100) \n  dat=data.frame(mydata)\n  trainIndex <- createDataPartition(dat[,1] , p=prob)\n  \n  train=dat[as.numeric(unlist(trainIndex) ),]\n  test=dat[-as.numeric(unlist(trainIndex) ),]\n  \n  return(list(train, test) )\n} \n\nsvmModel=function(train_test, depVar, type, kernel, gamma, cost) {\n  tabless=list()\n  accuracy=list()\n  predictionModel=list()  \n  modelSVM=NULL\n  dat=data.frame(train_test[1])\n  \n  g = NULL\n  if(is.integer(depVar)){\n    g = depVar\n  }else{\n    g = which(colnames(data) == depVar)\n  }\n\n  svm= svm(x = dat[,-g] , y= dat[, g] ,type= type, kernel=kernel, cost=cost, gamma=gamma)\n\n  test = data.frame(train_test[2])\n  pred <- predict(svm,test[ , -g])\n\t\n  cm = confusionMatrix(pred, test[,g]) # create the confusion matrix\n  Precision = mean(cm$byClass[,5])\n  Recall = mean(cm$byClass[,6])\n  F1 = mean(cm$byClass[,7])\n  cat(\'Precision : \' , Precision , \'\n\')\n  cat(\'Recall : \' , Recall, \'\n\')\n  cat(\'F1 : \' , F1, \'\n\')  \n}\n\n\n\ndepVar= NULL\ndata = readFile(\'" + path) + "\' , \'") + delim) + "\' )\nstrData = dataSummary(data)\n\nY=getDepVar(") + item_predictive) + " )\n\ntrain_test=crossValidation(data, ") + _get_5);
          String _plus_17 = (_plus_16 + " )\n\nAccuracySVM=svmModel(train_test , Y, \'");
          Object _get_6 = list.get(4);
          String _plus_18 = (_plus_17 + _get_6);
          String _plus_19 = (_plus_18 + "\' , \'");
          Object _get_7 = list.get(3);
          String _plus_20 = (_plus_19 + _get_7);
          String _plus_21 = (_plus_20 + "\' , ");
          Object _get_8 = list.get(2);
          String _plus_22 = (_plus_21 + _get_8);
          String _plus_23 = (_plus_22 + " , ");
          Object _get_9 = list.get(1);
          String _plus_24 = (_plus_23 + _get_9);
          String _plus_25 = (_plus_24 + ") ");
          fsa.generateFile("SVM_all.R", _plus_25);
        }
      }
    }
    String _string_2 = list.get(0).toString();
    boolean _equals_3 = Objects.equal(_string_2, "DT");
    if (_equals_3) {
      boolean _equals_4 = Objects.equal(lkol, "no");
      if (_equals_4) {
        String _get_10 = validation.get(1);
        String _plus_26 = ((((((((("library(rpart)\nlibrary(readr) #read csv files\nlibrary(caret) # crossvalidation function\nlibrary(ROCR)\nlibrary(randomForest) #random forest model\n\nreadFile <- function(path, sep, header = TRUE) {\n  mydata = read.csv(path, sep, header = header)\n  return(mydata)\n}\n\n\ndataSummary<-function(mydata){\n  strData=str(mydata)\n  return(strData)\n}\n\n\ngetDepVar=function(depVar){\n  return(depVar)\n}\n\ngetIndepVar=function(preds){\n  return(preds)\n}\n\ncrossValidation <- function(mydata, prob){\n  trainIndex=list()\n  train=list()\n  test=list()\n  set.seed(100) \n  dat=data.frame(mydata)\n  trainIndex <- createDataPartition(dat[,1] , p=prob)\n  \n  train=dat[as.numeric(unlist(trainIndex) ),]\n  test=dat[-as.numeric(unlist(trainIndex) ),]\n  \n  return(list(train, test) )\n} \n\nDTModel=function(train_test, depVar, indepVar, max_depth) {\n  accuracy=list()\n  predictionModel=list()  \n  dat=data.frame(train_test[1])\n  \n  sGroupVars  <- paste(indepVar, collapse = \' + \')\n  \n  # Create the formula from the variables\n  fRpart <- as.formula(paste(depVar, sGroupVars, sep=\' ~ \'))\n   \n  DT= rpart(formula = fRpart, data = dat, na.action = na.pass, maxdepth = max_depth)\n\n  test = data.frame(train_test[2])\n  pred <- predict(DT,test[ , -which(names(data)==depVar)])\n\n  pred2 = c()\n\tfor(i in 1:dim(pred)[1]){\n\t  pred2 = c(pred2, names(which.max(pred[i,])))\n\t}\n  pred2 = as.factor(pred2)\n    g = NULL\n  if(is.integer(depVar)){\n    g = depVar\n  }else{\n    g = which(colnames(data) == depVar)\n  }\n  cm = confusionMatrix(pred2, test[,g]) # create the confusion matrix\n  Precision = mean(cm$byClass[,5])\n  Recall = mean(cm$byClass[,6])\n  F1 = mean(cm$byClass[,7])\n  cat(\'Precision : \' , Precision , \'\n\')\n  cat(\'Recall : \' , Recall, \'\n\')\n  cat(\'F1 : \' , F1, \'\n\')  \n}\n\n\ndata = readFile(\'" + path) + "\' , \'") + delim) + "\' )\nstrData = dataSummary(data)\n\nY=getDepVar(") + item_predictive) + " )\nX=getIndepVar(") + preds) + " )\n\ntrain_test=crossValidation(data, ") + _get_10);
        String _plus_27 = (_plus_26 + " )\n\nModel = DTModel(train_test , Y , X , ");
        Object _get_11 = list.get(1);
        String _plus_28 = (_plus_27 + _get_11);
        String _plus_29 = (_plus_28 + ") ");
        fsa.generateFile("DT.R", _plus_29);
      } else {
        String _get_12 = validation.get(1);
        String _plus_30 = ((((((("library(rpart)\nlibrary(readr) #read csv files\nlibrary(caret) # crossvalidation function\nlibrary(ROCR)\nlibrary(randomForest) #random forest model\n\nreadFile <- function(path, sep, header = TRUE) {\n  mydata = read.csv(path, sep, header = header)\n  return(mydata)\n}\n\n\ndataSummary<-function(mydata){\n  strData=str(mydata)\n  return(strData)\n}\n\n\ngetDepVar=function(depVar){\n  return(depVar)\n}\n\ngetIndepVar=function(preds){\n  return(preds)\n}\n\ncrossValidation <- function(mydata, prob){\n  trainIndex=list()\n  train=list()\n  test=list()\n  set.seed(100) \n  dat=data.frame(mydata)\n  trainIndex <- createDataPartition(dat[,1] , p=prob)\n  \n  train=dat[as.numeric(unlist(trainIndex) ),]\n  test=dat[-as.numeric(unlist(trainIndex) ),]\n  \n  return(list(train, test) )\n} \n\nDTModel=function(train_test, depVar, max_depth) {\n  accuracy=list()\n  predictionModel=list()  \n  dat=data.frame(train_test[1])\n \n  # Create the formula from the variables\n  fRpart <- as.formula(paste(depVar, \'.\', sep=\' ~ \'))\n   \n  DT= rpart(formula = fRpart, data = dat, na.action = na.pass, maxdepth = max_depth)\n\n  test = data.frame(train_test[2])\n  pred <- predict(DT,test[ , -which(names(data)==depVar)])\n\n  pred2 = c()\n\tfor(i in 1:dim(pred)[1]){\n\t  pred2 = c(pred2, names(which.max(pred[i,])))\n\t}\n  pred2 = as.factor(pred2)\n    g = NULL\n  if(is.integer(depVar)){\n    g = depVar\n  }else{\n    g = which(colnames(data) == depVar)\n  }\n  cm = confusionMatrix(pred2, test[,g]) # create the confusion matrix\n  Precision = mean(cm$byClass[,5])\n  Recall = mean(cm$byClass[,6])\n  F1 = mean(cm$byClass[,7])\n  cat(\'Precision : \' , Precision , \'\n\')\n  cat(\'Recall : \' , Recall, \'\n\')\n  cat(\'F1 : \' , F1, \'\n\')  \n}\n\ndata = readFile(\'" + path) + "\' , \'") + delim) + "\' )\nstrData = dataSummary(data)\n\nY=getDepVar(") + item_predictive) + " )\n\ntrain_test=crossValidation(data, ") + _get_12);
        String _plus_31 = (_plus_30 + " )\n\nModel = DTModel(train_test , Y, ");
        Object _get_13 = list.get(1);
        String _plus_32 = (_plus_31 + _get_13);
        String _plus_33 = (_plus_32 + ") ");
        fsa.generateFile("DT_all.R", _plus_33);
      }
    }
  }
}
