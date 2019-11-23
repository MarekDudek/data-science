package dudek.stats_in_java.probability;

import dudek.stats_in_java.unit_interval.Unit;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;

import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor(access = PRIVATE)
@EqualsAndHashCode
@ToString
final class UniformProbabilityDistribution<OUTCOME> implements ProbabilityDistribution<OUTCOME> {

    @NonNull
    public final Unit probability;

    static <OUTCOME> ProbabilityDistribution<OUTCOME> fromUnit(final Unit unit) {
        return new UniformProbabilityDistribution<>(unit);
    }

    @Override
    public Unit probability(final OUTCOME outcome) {
        return probability;
    }
}
