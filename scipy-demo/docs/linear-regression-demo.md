# Goal

Linear regression on simple data
Linear regression on trading data

## Steps
* Read data from disk
    * NumPy
* View data 
    * MatPlotLib
* Preprocess
    * is it required for regression?
* Create model
    * examples on the web, with TF1
* Compile model
* Model can be called on input
    * result for every example is vector of logits or? log-odds scored for each class
    * this is specific to classification
        * how is the effect achieved in construction of model?
    * softmax function converts logits to probabilities
    * loss function
        * sparse categorical crossentropy
            * takes vector of logits
            * returns scalar loss for some example
            * it is equal to minus log of probability of true class
        * loss function is specified during compilation
* Fit
    * takes a lot of time
    * problem installing CUDA
    * Docker image?
    * how to save to disk to reuse?
    * adjusts model parameters to minimize loss    
* Evaluation
    * checks model performance
    * loss and acuracy
        * acuracy os percentage 
        * what is loss
* Model can be wrapped with other layers
    * example attaches softmax to model to get probability straight from model
