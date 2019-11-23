package dudek.stats_in_java.probability;

import dudek.stats_in_java.unit_interval.Unit;

public interface ProbabilityDistribution<OUTCOME> {

    Unit probability(OUTCOME outcome);
}
