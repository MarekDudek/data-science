package dudek.stats_in_java.unit_interval;

import fj.data.Either;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import static dudek.stats_in_java.unit_interval.UnitError.OVERFLOW;
import static dudek.stats_in_java.unit_interval.UnitError.UNDERFLOW;
import static fj.data.Either.left;
import static fj.data.Either.right;
import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor(access = PRIVATE)
@EqualsAndHashCode
@ToString
final class ImmutableFloatUnit implements Unit {

    static final float EPSILON = 0.000_000_1f;

    public final float value;

    static Unit fromUnit(final float value) {
        return fromAny(value).right().value();
    }

    static Either<UnitError, Unit> fromAny(final float value) {
        if (value < 0)
            return left(UNDERFLOW);
        if (value > 1) {
            return left(OVERFLOW);
        }
        final Unit interval = new ImmutableFloatUnit(value);
        return right(interval);
    }
}
