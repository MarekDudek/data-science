package dudek.stats_in_java.toys;

import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public final class Card {
    @NonNull
    public final Color color;
    @NonNull
    public final Rank rank;
}
