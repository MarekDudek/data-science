package dudek.stats_in_java.unit_interval;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static dudek.stats_in_java.unit_interval.ImmutableFloatUnitInterval.fromFloat;
import static org.assertj.core.api.Assertions.assertThat;

final class ImmutableFloatUnitIntervalTest {

    @Test
    void zero() {
        final Optional<ImmutableFloatUnitInterval> zero = fromFloat(0);
        assertThat(zero).isPresent();
    }

    @Test
    void one() {
        final Optional<ImmutableFloatUnitInterval> one = fromFloat(1);
        assertThat(one).isPresent();
    }

    @Test
    void underflow() {
        final Optional<ImmutableFloatUnitInterval> underflow = fromFloat(0 - Float.MIN_VALUE);
        assertThat(underflow).isNotPresent();
    }

    @Test
    void overflow() {
        final Optional<ImmutableFloatUnitInterval> overflow = fromFloat(1 + ImmutableFloatUnitInterval.EPSILON);
        assertThat(overflow).isNotPresent();
    }

}
