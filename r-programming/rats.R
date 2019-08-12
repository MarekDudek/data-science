
data(rats, package='faraway')
summary(rats)

plot(time ~ poison, data=rats)
plot(time ~ treat, data=rats)

plot(poison ~ treat, data=rats)
plot(treat ~ poison, data=rats)

data(worldcup, package='faraway')
summary(worldcup)
worldcup
mean(worldcup$Time)
