package dudek.stats_in_java.unit_interval;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static dudek.stats_in_java.unit_interval.UnitIntervals.*;
import static org.assertj.core.api.Assertions.assertThat;

final class UnitIntervalsTest {

    @Test
    void zero() {
        final UnitInterval zero = fromUnit(0);
        assertThat(zero).isEqualTo(ZERO);
    }

    @Test
    void one() {
        final UnitInterval one = fromUnit(1);
        assertThat(one).isEqualTo(ONE);
    }

    @Test
    void underflow() {
        final Optional<UnitInterval> underflow = fromAny(0 - Float.MIN_VALUE);
        assertThat(underflow).isNotPresent();
    }

    @Test
    void overflow() {
        final Optional<UnitInterval> overflow = fromAny(1 + ImmutableFloatUnitInterval.EPSILON);
        assertThat(overflow).isNotPresent();
    }
}
