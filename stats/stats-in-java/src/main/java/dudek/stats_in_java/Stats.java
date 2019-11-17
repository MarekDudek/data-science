package dudek.stats_in_java;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

import static com.google.common.collect.Streams.zip;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.util.stream.Collectors.toList;

public enum Stats {

    ;

    private static double expectedValue(final List<Double> xs) {
        final double sum = xs.stream().reduce(0.0, Double::sum);
        final int count = xs.size();
        return sum / count;
    }

    public static double mean(final List<Double> xs) {
        return expectedValue(xs);
    }

    public static double variance(final List<Double> xs) {
        final List<Double> squares = xs.stream().map(x -> pow(x, 2)).collect(toList());
        final double meanOfSquare = expectedValue(squares);
        final double mean = mean(xs);
        final double squareOfMean = pow(mean, 2);
        return meanOfSquare - squareOfMean;
    }

    public static double sampleVariance(final List<Double> xs) {
        final double mean = mean(xs);
        final List<Double> squares = xs.stream().map(x -> pow(x - mean, 2)).collect(toList());

        final Double sum = xs.stream().map(x -> pow(x - mean, 2)).reduce(0.0, Double::sum);
        final int count = xs.size();
        return sum / (count - 1);
    }

    public static double sampleCorrelationCoefficient(final List<Double> xs, final List<Double> ys) {
        final double meanX = mean(xs);
        final double meanY = mean(ys);
        final double sum = zip(xs.stream(), ys.stream(), (x, y) -> (x - meanX) * (y - meanY)).reduce(0.0, Double::sum);
        final double varianceX = sampleVariance(xs);
        final double varianceY = sampleVariance(ys);
        final int count = xs.size();
        return sum / (count - 1) / sqrt(varianceX) / sqrt(varianceY);
    }

    @Builder
    @ToString
    @EqualsAndHashCode
    public static class LinearRegressionParameters {
        public final double alpha;
        public final double beta;
    }

    public static LinearRegressionParameters simpleLinearRegression(final List<Double> xs, final List<Double> ys) {
        final double meanX = mean(xs);
        final double meanY = mean(ys);
        final double nominator = zip(xs.stream(), ys.stream(), (x, y) -> (x - meanX) * (y - meanY)).reduce(0.0, Double::sum);
        final double denominator = xs.stream().map(x -> pow(x - meanX, 2)).reduce(0.0, Double::sum);
        final double beta = nominator / denominator;
        final double alpha = meanY - beta * meanX;
        return LinearRegressionParameters.builder().
                alpha(alpha).
                beta(beta).
                build();
    }
}
