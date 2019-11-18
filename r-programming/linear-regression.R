
x <- 1:6
y <- x^2
print(y)

mean(y)
var(y)

model <- lm(y ~ x)
print(model)
summary(model)

par(mfrow = c(2, 2))
plot(model)
