package dudek.stats_in_java.unit_interval;

import com.google.common.annotations.VisibleForTesting;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Optional;

@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public final class ImmutableFloatUnitInterval implements UnitInterval {

    static final float EPSILON = 0.000_000_1f;

    public float value;

    @VisibleForTesting
    static Optional<ImmutableFloatUnitInterval> fromFloat(final float value) {
        if (value < 0)
            return Optional.empty();
        if (value > 1) {
            return Optional.empty();
        }
        final ImmutableFloatUnitInterval interval = new ImmutableFloatUnitInterval(value);
        return Optional.of(interval);
    }
}
