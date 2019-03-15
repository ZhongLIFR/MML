/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.mml.MMLModel
import org.xtext.example.mydsl.mml.SVM
import org.xtext.example.mydsl.mml.DT
import org.xtext.example.mydsl.mml.SVM
import org.xtext.example.mydsl.mml.RandomForest
import org.xtext.example.mydsl.mml.LogisticRegression
import org.xtext.example.mydsl.mml.AllVariables
import org.xtext.example.mydsl.mml.PredictorVariables
import org.xtext.example.mydsl.mml.FormulaItem
import org.eclipse.emf.common.util.EList
import org.xtext.example.mydsl.mml.TrainingTest
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter
import java.util.ArrayList

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MmlGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
		val root = resource.allContents.head as MMLModel;	
		val path = root.getInput().getFilelocation();
		val delim = root.getInput().getParsingInstruction().getSep();
		val Framework = root.getAlgorithm().getFramework();
		val formula = root.getFormula();
		val item_predictive = if (formula.getPredictive().getColumn() != 0) formula.getPredictive().getColumn() else "'" + formula.getPredictive().getColName() + "'";
		val item_predictors = formula.getPredictors();
		val valid = root.getValidation();
		val stratificationmethod = valid.getStratification();
		val validationmetric = valid.getMetric();
		
		var lkol = ""
		var preds = "";	
		switch item_predictors.getName() {
			case "all" : {val all = item_predictors as AllVariables ;
				preds = preds + all.getAll();
				lkol = "yes"
			}
			case "PredictorVariables" : {
				lkol = "no"
				preds = preds + "c( ";
				val pred = item_predictors as PredictorVariables ;
				for(e: pred.getVars()) {
					if (e.getColumn() != 0){
						preds = preds + e.getColumn() + " ," 	
					}
					else{
						preds = preds + "'" + e.getColName() + "'," 	
					}
				}
				preds = preds.substring(0, preds.length() - 1);
				preds = preds + " )"
			}
		}
		
		var list = newArrayList		
		switch root.getAlgorithm().getAlgorithm().getName() {
			case 'SVM' : {val model = root.getAlgorithm().getAlgorithm() as SVM ;
				val name = root.getAlgorithm().getAlgorithm().getName();
				list.add(name)
				val gamma = model.getGamma() ;
				list.add(gamma)
				val c = model.getC();
				list.add(c)
				val kernel = model.getKernel();
				list.add(kernel)
				val class = model.getSvmclassification();
				list.add(class)
			}
			case 'DT' : {val model = root.getAlgorithm().getAlgorithm() as DT ;
				val name = root.getAlgorithm().getAlgorithm().getName();
				list.add(name)
				val depth = model.getMax_depth() ;
				list.add(depth)
			}
			case 'RandomForest' : {val model = root.getAlgorithm().getAlgorithm() as RandomForest ;
				val name = root.getAlgorithm().getAlgorithm().getName();
				list.add(name)
			}
			case 'LogisticRegression' : {val model = root.getAlgorithm().getAlgorithm() as LogisticRegression ;
				val name = root.getAlgorithm().getAlgorithm().getName();
				list.add(name)
			}
		}
		
		var validation = newArrayList		
		val train = stratificationmethod as TrainingTest ;
		validation.add("trainin_test")
		validation.add(train.getNumber());
				
		fsa.generateFile("AllTheStates.txt",
			"path " + path + "\n" + "delim " + delim + "\n" + "framework " + Framework + "\n" +
			"y " + item_predictive + "\n" + "x " + preds + "\n" + "algo " + list + "\n" + "validation " + validation + "\n" +
			"metric " + validationmetric
		)
	
if (Framework.toString() == "R"){
			if (list.get(0).toString() == "SVM"){
				if (lkol == "no"){
				fsa.generateFile('SVM.R', 
"library(rpart)
library(readr) #read csv files
library(caret) # crossvalidation function
library(ROCR)
library(e1071)  #svm model

readFile <- function(path, sep, header = TRUE) {
  mydata = read.csv(path, sep, header = header)
  return(mydata)
}


dataSummary<-function(mydata){
  strData=str(mydata)
  return(strData)
}


getDepVar=function(depVar){
  return(depVar)
}

getIndepVar=function(preds){
  return(preds)
}

crossValidation <- function(mydata, prob){
  trainIndex=list()
  train=list()
  test=list()
  set.seed(100) 
  dat=data.frame(mydata)
  trainIndex <- createDataPartition(dat[,1] , p=prob)
  
  train=dat[as.numeric(unlist(trainIndex) ),]
  test=dat[-as.numeric(unlist(trainIndex) ),]
  
  return(list(train, test) )
} 

svmModel=function(train_test, depVar, indepVars, type, kernel, gamma, cost) {
  tabless=list()
  accuracy=list()
  predictionModel=list()  
  modelSVM=NULL
  dat=data.frame(train_test[1])

  GroupVars  <- paste(indepVars, collapse = ' + ')
  
  # Create the formula from the variables
  fRpart <- as.formula(paste(depVar, GroupVars, sep=' ~ '))
  
  svm= svm(formula = fRpart, data = dat, na.action = na.pass, type= type, kernel=kernel, cost=cost, gamma=gamma)

  test = data.frame(train_test[2])
  pred <- predict(svm,test[ , indepVars])
  g = NULL
  if(is.integer(depVar)){
    g = depVar
  }else{
    g = which(colnames(data) == depVar)
  }
	
  cm = confusionMatrix(pred, test[,g]) # create the confusion matrix
  Precision = mean(cm$byClass[,5])
  Recall = mean(cm$byClass[,6])
  F1 = mean(cm$byClass[,7])
  cat('Precision : ' , Precision , '\n')
  cat('Recall : ' , Recall, '\n')
  cat('F1 : ' , F1, '\n')  
}



depVar= NULL
data = readFile('" + path + "' , '" + delim + "' )
strData = dataSummary(data)

Y=getDepVar(" + item_predictive + " )
X=getIndepVar(" + preds + " )

train_test=crossValidation(data, " + validation.get(1) + " )

AccuracySVM=svmModel(train_test , Y , X , '" +  list.get(4) + "' , '" + list.get(3) + "' , " + list.get(2) + " , "  + list.get(1) + ") "
				)
					}
					else {
										fsa.generateFile('SVM_all.R', 
"library(rpart)
library(readr) #read csv files
library(caret) # crossvalidation function
library(ROCR)
library(e1071)  #svm model

readFile <- function(path, sep, header = TRUE) {
  mydata = read.csv(path, sep, header = header)
  return(mydata)
}


dataSummary<-function(mydata){
  strData=str(mydata)
  return(strData)
}


getDepVar=function(depVar){
  return(depVar)
}

getIndepVar=function(preds){
  return(preds)
}

crossValidation <- function(mydata, prob){
  trainIndex=list()
  train=list()
  test=list()
  set.seed(100) 
  dat=data.frame(mydata)
  trainIndex <- createDataPartition(dat[,1] , p=prob)
  
  train=dat[as.numeric(unlist(trainIndex) ),]
  test=dat[-as.numeric(unlist(trainIndex) ),]
  
  return(list(train, test) )
} 

svmModel=function(train_test, depVar, type, kernel, gamma, cost) {
  tabless=list()
  accuracy=list()
  predictionModel=list()  
  modelSVM=NULL
  dat=data.frame(train_test[1])
  
  g = NULL
  if(is.integer(depVar)){
    g = depVar
  }else{
    g = which(colnames(data) == depVar)
  }

  svm= svm(x = dat[,-g] , y= dat[, g] ,type= type, kernel=kernel, cost=cost, gamma=gamma)

  test = data.frame(train_test[2])
  pred <- predict(svm,test[ , -g])
	
  cm = confusionMatrix(pred, test[,g]) # create the confusion matrix
  Precision = mean(cm$byClass[,5])
  Recall = mean(cm$byClass[,6])
  F1 = mean(cm$byClass[,7])
  cat('Precision : ' , Precision , '\n')
  cat('Recall : ' , Recall, '\n')
  cat('F1 : ' , F1, '\n')  
}



depVar= NULL
data = readFile('" + path + "' , '" + delim + "' )
strData = dataSummary(data)

Y=getDepVar(" + item_predictive + " )

train_test=crossValidation(data, " + validation.get(1) + " )

AccuracySVM=svmModel(train_test , Y, '" +  list.get(4) + "' , '" + list.get(3) + "' , " + list.get(2) + " , "  + list.get(1) + ") "
				)	
				}
			}
		}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
if (list.get(0).toString() == "DT"){
				if (lkol == "no"){
				fsa.generateFile('DT.R', 
"library(rpart)
library(readr) #read csv files
library(caret) # crossvalidation function
library(ROCR)
library(randomForest) #random forest model

readFile <- function(path, sep, header = TRUE) {
  mydata = read.csv(path, sep, header = header)
  return(mydata)
}


dataSummary<-function(mydata){
  strData=str(mydata)
  return(strData)
}


getDepVar=function(depVar){
  return(depVar)
}

getIndepVar=function(preds){
  return(preds)
}

crossValidation <- function(mydata, prob){
  trainIndex=list()
  train=list()
  test=list()
  set.seed(100) 
  dat=data.frame(mydata)
  trainIndex <- createDataPartition(dat[,1] , p=prob)
  
  train=dat[as.numeric(unlist(trainIndex) ),]
  test=dat[-as.numeric(unlist(trainIndex) ),]
  
  return(list(train, test) )
} 

DTModel=function(train_test, depVar, indepVar, max_depth) {
  accuracy=list()
  predictionModel=list()  
  dat=data.frame(train_test[1])
  
  sGroupVars  <- paste(indepVar, collapse = ' + ')
  
  # Create the formula from the variables
  fRpart <- as.formula(paste(depVar, sGroupVars, sep=' ~ '))
   
  DT= rpart(formula = fRpart, data = dat, na.action = na.pass, maxdepth = max_depth)

  test = data.frame(train_test[2])
  pred <- predict(DT,test[ , -which(names(data)==depVar)])

  pred2 = c()
	for(i in 1:dim(pred)[1]){
	  pred2 = c(pred2, names(which.max(pred[i,])))
	}
  pred2 = as.factor(pred2)
    g = NULL
  if(is.integer(depVar)){
    g = depVar
  }else{
    g = which(colnames(data) == depVar)
  }
  cm = confusionMatrix(pred2, test[,g]) # create the confusion matrix
  Precision = mean(cm$byClass[,5])
  Recall = mean(cm$byClass[,6])
  F1 = mean(cm$byClass[,7])
  cat('Precision : ' , Precision , '\n')
  cat('Recall : ' , Recall, '\n')
  cat('F1 : ' , F1, '\n')  
}


data = readFile('" + path + "' , '" + delim + "' )
strData = dataSummary(data)

Y=getDepVar(" + item_predictive + " )
X=getIndepVar(" + preds + " )

train_test=crossValidation(data, " + validation.get(1) + " )

Model = DTModel(train_test , Y , X , " +  list.get(1) + ") "
				)
			}	
			else{	
fsa.generateFile('DT_all.R', 
"library(rpart)
library(readr) #read csv files
library(caret) # crossvalidation function
library(ROCR)
library(randomForest) #random forest model

readFile <- function(path, sep, header = TRUE) {
  mydata = read.csv(path, sep, header = header)
  return(mydata)
}


dataSummary<-function(mydata){
  strData=str(mydata)
  return(strData)
}


getDepVar=function(depVar){
  return(depVar)
}

getIndepVar=function(preds){
  return(preds)
}

crossValidation <- function(mydata, prob){
  trainIndex=list()
  train=list()
  test=list()
  set.seed(100) 
  dat=data.frame(mydata)
  trainIndex <- createDataPartition(dat[,1] , p=prob)
  
  train=dat[as.numeric(unlist(trainIndex) ),]
  test=dat[-as.numeric(unlist(trainIndex) ),]
  
  return(list(train, test) )
} 

DTModel=function(train_test, depVar, max_depth) {
  accuracy=list()
  predictionModel=list()  
  dat=data.frame(train_test[1])
 
  # Create the formula from the variables
  fRpart <- as.formula(paste(depVar, '.', sep=' ~ '))
   
  DT= rpart(formula = fRpart, data = dat, na.action = na.pass, maxdepth = max_depth)

  test = data.frame(train_test[2])
  pred <- predict(DT,test[ , -which(names(data)==depVar)])

  pred2 = c()
	for(i in 1:dim(pred)[1]){
	  pred2 = c(pred2, names(which.max(pred[i,])))
	}
  pred2 = as.factor(pred2)
    g = NULL
  if(is.integer(depVar)){
    g = depVar
  }else{
    g = which(colnames(data) == depVar)
  }
  cm = confusionMatrix(pred2, test[,g]) # create the confusion matrix
  Precision = mean(cm$byClass[,5])
  Recall = mean(cm$byClass[,6])
  F1 = mean(cm$byClass[,7])
  cat('Precision : ' , Precision , '\n')
  cat('Recall : ' , Recall, '\n')
  cat('F1 : ' , F1, '\n')  
}

data = readFile('" + path + "' , '" + delim + "' )
strData = dataSummary(data)

Y=getDepVar(" + item_predictive + " )

train_test=crossValidation(data, " + validation.get(1) + " )

Model = DTModel(train_test , Y, " +  list.get(1) + ") "
				)
			}		
		}
	}
}		