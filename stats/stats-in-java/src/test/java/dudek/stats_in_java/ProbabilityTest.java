package dudek.stats_in_java;

import org.junit.jupiter.api.Test;

import static dudek.stats_in_java.Probability.probability;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

final class ProbabilityTest {

    @Test
    void proper_values() {
        assertThatCode(() -> {
            probability(0);
            probability(0.5);
            probability(1);
        }).doesNotThrowAnyException();
    }

    @Test
    void improper_values() {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> probability(-0.0001));
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> probability(1.0001));
    }
}
