package dudek.stats_in_java;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import static com.google.common.base.Preconditions.checkArgument;
import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor(access = PRIVATE)
@EqualsAndHashCode
@ToString
public final class OldProbability {

    public final double probability;

    public static OldProbability probability(final double probability) {
        checkArgument(0 <= probability && probability <= 1.0);
        return new OldProbability(probability);
    }
}
