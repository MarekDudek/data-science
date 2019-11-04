package dudek.stats_in_java;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
public final class Point2D {
    public final double x;
    public final double y;
}
