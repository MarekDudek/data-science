package dudek.stats_in_java.unit_interval;

import fj.data.Either;
import org.junit.jupiter.api.Test;

import static dudek.stats_in_java.unit_interval.UnitError.OVERFLOW;
import static dudek.stats_in_java.unit_interval.UnitError.UNDERFLOW;
import static dudek.stats_in_java.unit_interval.Units.*;
import static org.assertj.core.api.Assertions.assertThat;

final class UnitsTest {

    @Test
    void zero() {
        final Unit zero = fromUnit(0);
        assertThat(zero).isEqualTo(ZERO);
    }

    @Test
    void one() {
        final Unit one = fromUnit(1);
        assertThat(one).isEqualTo(ONE);
    }

    @Test
    void underflow() {
        final Either<UnitError, Unit> underflow = fromAny(0 - Float.MIN_VALUE);
        assertThat(underflow.left().value()).isEqualTo(UNDERFLOW);
    }

    @Test
    void overflow() {
        final Either<UnitError, Unit> overflow = fromAny(1 + ImmutableFloatUnit.EPSILON);
        assertThat(overflow.left().value()).isEqualTo(OVERFLOW);
    }
}
