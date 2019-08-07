
data(coagulation, package='faraway')

coagulation
coagulation$diet
coagulation$coag
summary(coagulation)

plot(coag~diet, data=coagulation)

model = lm(coag~diet-1, coagulation)
summary(model)