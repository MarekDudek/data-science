package dudek.stats_in_java;

import lombok.Builder;
import lombok.NonNull;
import lombok.ToString;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static dudek.stats_in_java.Anscombe.*;
import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

final class AnscombeTest {

    @Builder
    @ToString
    private static class AnscombeTestCase {
        @NonNull
        public final List<Point2D> sequence;
    }

    private static Stream<AnscombeTestCase> anscombeTestCases() {
        return Stream.of(
                AnscombeTestCase.builder().
                        sequence(Sequence1).
                        build(),
                AnscombeTestCase.builder().
                        sequence(Sequence2).
                        build(),
                AnscombeTestCase.builder().
                        sequence(Sequence3).
                        build(),
                AnscombeTestCase.builder().
                        sequence(Sequence4).
                        build()
        );
    }

    @ParameterizedTest
    @MethodSource("anscombeTestCases")
    void mean(final AnscombeTestCase tc) {
        // given
        final List<Double> xs = tc.sequence.stream().map(p -> p.x).collect(toList());
        // when
        final double mean = Stats.mean(xs);
        // then
        assertThat(mean).isEqualTo(9.0);
    }
}
