package dudek.stats_in_java.probability;

import dudek.stats_in_java.unit_interval.UnitInterval;

public interface ProbabilityDistribution<OUTCOME> {

    UnitInterval probability(OUTCOME outcome);
}