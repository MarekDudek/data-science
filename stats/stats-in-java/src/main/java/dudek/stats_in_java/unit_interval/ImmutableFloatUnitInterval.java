package dudek.stats_in_java.unit_interval;

import com.google.common.annotations.VisibleForTesting;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Optional;

import static lombok.AccessLevel.PRIVATE;

@RequiredArgsConstructor(access = PRIVATE)
@AllArgsConstructor(access = PRIVATE)
@EqualsAndHashCode
@ToString
final class ImmutableFloatUnitInterval implements UnitInterval {

    static final float EPSILON = 0.000_000_1f;

    public float value;

    @VisibleForTesting
    static UnitInterval fromUnit(final float value) {
        return fromAny(value).orElseThrow(RuntimeException::new);
    }

    @VisibleForTesting
    static Optional<UnitInterval> fromAny(final float value) {
        if (value < 0)
            return Optional.empty();
        if (value > 1) {
            return Optional.empty();
        }
        final UnitInterval interval = new ImmutableFloatUnitInterval(value);
        return Optional.of(interval);
    }
}
