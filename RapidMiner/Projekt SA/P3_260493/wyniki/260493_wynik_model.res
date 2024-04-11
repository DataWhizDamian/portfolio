11.06.2023 20:03:34 Results of ResultWriter 'Write as Text' [1]: 
11.06.2023 20:03:34 Model Metrics Type: BinomialGLM
 Description: N/A
 model id: rm-h2o-model-generalized_linear_model-435
 frame id: rm-h2o-frame-generalized_linear_model-435
 MSE: 0.042181417
 RMSE: 0.20538116
 R^2: 0.7860879
 AUC: 0.9960712
 pr_auc: 0.99835336
 logloss: 0.17612346
 mean_per_class_error: 0.023812402
 default threshold: 0.631654679775238
 CM: Confusion Matrix (Row labels: Actual class; Column labels: Predicted class):
                      Drogie_Bardzo drogie  Tanie_Srednie   Error         Rate
Drogie_Bardzo drogie                  1343             45  0.0324   45 / 1,388
       Tanie_Srednie                    57           3692  0.0152   57 / 3,749
              Totals                  1400           3737  0.0199  102 / 5,137
 null DOF: 5136.0
 residual DOF: 4219.0
 null deviance: 5994.4097
 residual deviance: 1809.4924
GLM Model (summary):
             Family  Link             Regularization Number of Predictors Total Number of Active Predictors Number of Iterations                            Training Frame
 fractionalbinomial logit Ridge ( lambda = 0.01292 )                        917                         917                   10 rm-h2o-frame-generalized_linear_model-435
Scoring History:
           timestamp   duration iterations negative_log_likelihood objective
 2023-06-11 20:03:27  0.000 sec          0              2997.20473   0.58345
 2023-06-11 20:03:27  0.005 sec          1              1546.90111   0.34208
 2023-06-11 20:03:27  0.009 sec          2              1169.02540   0.28786
 2023-06-11 20:03:27  0.011 sec          3              1043.00333   0.27168
 2023-06-11 20:03:27  0.013 sec          4               964.30986   0.26207
 2023-06-11 20:03:27  0.016 sec          5               924.09475   0.25862
 2023-06-11 20:03:27  0.019 sec          6               922.20273   0.25799
 2023-06-11 20:03:27  0.021 sec          7               907.38144   0.25720
 2023-06-11 20:03:27  0.024 sec          8               909.81590   0.25709
 2023-06-11 20:03:27  0.026 sec          9               901.67805   0.25700
 2023-06-11 20:03:27  0.030 sec         10               904.74620   0.25697

H2O version: 3.30.0.1-rm9.8.1
11.06.2023 20:03:34 PerformanceVector:
accuracy: 94.28% +/- 1.03% (micro average: 94.28%)
ConfusionMatrix:
True:	Drogie_Bardzo drogie	Tanie_Srednie
Drogie_Bardzo drogie:	1098	4
Tanie_Srednie:	290	3745
classification_error: 5.72% +/- 1.03% (micro average: 5.72%)
ConfusionMatrix:
True:	Drogie_Bardzo drogie	Tanie_Srednie
Drogie_Bardzo drogie:	1098	4
Tanie_Srednie:	290	3745
kappa: 0.844 +/- 0.030 (micro average: 0.845)
ConfusionMatrix:
True:	Drogie_Bardzo drogie	Tanie_Srednie
Drogie_Bardzo drogie:	1098	4
Tanie_Srednie:	290	3745
AUC: 0.995 +/- 0.003 (micro average: 0.995) (positive class: Tanie_Srednie)

11.06.2023 20:03:34 PerformanceVector:
accuracy: 97.59%
ConfusionMatrix:
True:	Drogie_Bardzo drogie	Tanie_Srednie
Drogie_Bardzo drogie:	1343	79
Tanie_Srednie:	45	3670
classification_error: 2.41%
ConfusionMatrix:
True:	Drogie_Bardzo drogie	Tanie_Srednie
Drogie_Bardzo drogie:	1343	79
Tanie_Srednie:	45	3670
kappa: 0.939
ConfusionMatrix:
True:	Drogie_Bardzo drogie	Tanie_Srednie
Drogie_Bardzo drogie:	1343	79
Tanie_Srednie:	45	3670
AUC: 0.995 (positive class: Tanie_Srednie)

11.06.2023 20:03:34 Parameter set:

Performance: 
PerformanceVector [
-----accuracy: 94.28% +/- 1.03% (micro average: 94.28%)
ConfusionMatrix:
True:	Drogie_Bardzo drogie	Tanie_Srednie
Drogie_Bardzo drogie:	1098	4
Tanie_Srednie:	290	3745
-----classification_error: 5.72% +/- 1.03% (micro average: 5.72%)
ConfusionMatrix:
True:	Drogie_Bardzo drogie	Tanie_Srednie
Drogie_Bardzo drogie:	1098	4
Tanie_Srednie:	290	3745
-----kappa: 0.844 +/- 0.030 (micro average: 0.845)
ConfusionMatrix:
True:	Drogie_Bardzo drogie	Tanie_Srednie
Drogie_Bardzo drogie:	1098	4
Tanie_Srednie:	290	3745
-----AUC: 0.995 +/- 0.003 (micro average: 0.995) (positive class: Tanie_Srednie)
]
Generalized Linear Model.maximum_number_of_threads	= 31
Generalized Linear Model.family	= fractionalbinomial
Generalized Linear Model.solver	= L_BFGS

11.06.2023 20:03:34 Threshold: 0.6361296676649265
first class: Drogie_Bardzo drogie
second class: Tanie_Srednie
if confidence(Tanie_Srednie) > 0.6361296676649265 then Tanie_Srednie
else Drogie_Bardzo drogie
