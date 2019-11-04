package dudek.stats_in_java;

import org.junit.jupiter.api.Test;

import java.util.List;

import static dudek.stats_in_java.Anscombe.Sequence1;
import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

final class AnscombeTest {

    @Test
    void mean() {
        // given
        final List<Double> xs = Sequence1.stream().map(p -> p.x).collect(toList());
        // when
        final double mean = Stats.mean(xs);
        // then
        assertThat(mean).isEqualTo(9.0);
    }
}
