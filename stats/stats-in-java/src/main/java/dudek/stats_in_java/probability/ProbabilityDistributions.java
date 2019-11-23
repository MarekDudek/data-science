package dudek.stats_in_java.probability;

import dudek.stats_in_java.unit_interval.Unit;

import static dudek.stats_in_java.unit_interval.Units.fromUnit;

public enum ProbabilityDistributions {

    ;

    public static <OUTCOME extends Enum<OUTCOME>> ProbabilityDistribution<OUTCOME> fromEnum(final Class<? extends Enum<OUTCOME>> enumeration) {
        final Enum<OUTCOME>[] constants = enumeration.getEnumConstants();
        final Unit unit = fromUnit(1.0f / constants.length);
        return UniformProbabilityDistribution.fromUnit(unit);
    }
}
