
set.seed(2016)

test_scores_1 = round(rnorm(50, 78, 10))
test_scores_2 = round(rnorm(50, 70, 14))

plot(test_scores_2 ~ test_scores_1)

