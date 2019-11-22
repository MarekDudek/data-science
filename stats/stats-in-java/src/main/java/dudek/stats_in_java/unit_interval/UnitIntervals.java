package dudek.stats_in_java.unit_interval;

import java.util.Optional;

public enum UnitIntervals {

    ;

    public static final UnitInterval ZERO = fromUnit(0);
    public static final UnitInterval ONE = fromUnit(1);

    public static final UnitInterval HALF = fromUnit(0.5f);

    public static UnitInterval fromUnit(final float value) {
        return ImmutableFloatUnitInterval.fromUnit(value);
    }

    public static Optional<UnitInterval> fromAny(final float value) {
        return ImmutableFloatUnitInterval.fromAny(value);
    }
}
