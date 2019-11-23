package dudek.stats_in_java.pds;

import dudek.stats_in_java.probability.ProbabilityDistribution;
import dudek.stats_in_java.toys.CoinToss;
import dudek.stats_in_java.unit_interval.UnitInterval;
import lombok.NonNull;

import static dudek.stats_in_java.unit_interval.UnitIntervals.HALF;

public final class CoinTossProbabilityDistribution implements ProbabilityDistribution<CoinToss> {

    public static ProbabilityDistribution<CoinToss> coinToss() {
        return new CoinTossProbabilityDistribution();
    }

    @Override
    public UnitInterval probability(final @NonNull CoinToss coinToss) {
        return HALF;
    }
}
