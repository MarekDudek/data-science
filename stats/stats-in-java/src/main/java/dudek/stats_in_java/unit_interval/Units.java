package dudek.stats_in_java.unit_interval;

import fj.data.Either;

public enum Units {

    ;

    public static final Unit ZERO = fromUnit(0);
    public static final Unit ONE = fromUnit(1);

    public static final Unit HALF = fromUnit(0.5f);
    public static final Unit QUARTER = fromUnit(0.25f);

    public static Unit fromUnit(final float value) {
        return ImmutableFloatUnit.fromUnit(value);
    }

    public static Either<UnitError, Unit> fromAny(final float value) {
        return ImmutableFloatUnit.fromAny(value);
    }
}
