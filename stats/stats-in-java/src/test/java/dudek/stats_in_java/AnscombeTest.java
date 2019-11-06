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
import static org.assertj.core.data.Percentage.withPercentage;

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
    void properties(final AnscombeTestCase tc) {
        // given
        final List<Double> xs = tc.sequence.stream().map(p -> p.x).collect(toList());
        // when
        final double meanOfX = Stats.mean(xs);
        // then
        assertThat(meanOfX).isEqualTo(9.0);
        // when
        final double sampleVarianceOfX = Stats.sampleVariance(xs);
        // then
        assertThat(sampleVarianceOfX).isEqualTo(11.0);
        // given
        final List<Double> ys = tc.sequence.stream().map(p -> p.y).collect(toList());
        // when
        final double meanOfY = Stats.mean(ys);
        // then
        assertThat(meanOfY).isCloseTo(7.50, withPercentage(0.01 * 7.50));
        // when
        final double sampleVarianceOfY = Stats.sampleVariance(ys);
        // then
        assertThat(sampleVarianceOfY).isCloseTo(4.125, withPercentage(100 * 0.003 / 4.125));
        // when
        final double correlation = Stats.sampleCorrelationCoefficient(xs, ys);
        // then
        assertThat(correlation).isCloseTo(0.816, withPercentage(100 * 0.001 / 0.816));
    }
}
