package dudek.stats_in_java;

import java.util.List;

public enum Stats {

    ;

    public static double mean(final List<Double> xs) {
        final double sum = xs.stream().reduce(0.0, Double::sum);
        final int count = xs.size();
        return sum / count;
    }
}
