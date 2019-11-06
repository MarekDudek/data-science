package dudek.stats_in_java;

import java.util.List;

import static java.lang.Math.pow;

public enum Stats {

    ;

    public static double mean(final List<Double> xs) {
        final double sum = xs.stream().reduce(0.0, Double::sum);
        final int count = xs.size();
        return sum / count;
    }

    public static double sampleVariance(final List<Double> xs) {
        final double mean = mean(xs);
        final Double sum = xs.stream().map(x -> pow(x - mean, 2)).reduce(0.0, Double::sum);
        final int count = xs.size();
        return sum / (count - 1);
    }
}
