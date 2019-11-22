package dudek.stats_in_java.probability;

import dudek.stats_in_java.random_variables.CoinToss;
import dudek.stats_in_java.unit_interval.UnitInterval;
import org.junit.jupiter.api.Test;

import static dudek.stats_in_java.probabilities.CoinTossProbabilityDistribution.coinToss;
import static dudek.stats_in_java.unit_interval.UnitIntervals.HALF;
import static dudek.stats_in_java.random_variables.CoinToss.HEADS;
import static dudek.stats_in_java.random_variables.CoinToss.TAILS;
import static org.assertj.core.api.Assertions.assertThat;

final class ProbabilitiesTest {

    @Test
    void coin_toss() {
        // when
        final ProbabilityDistribution<CoinToss> pd = coinToss();
        final UnitInterval heads = pd.probability(HEADS);
        final UnitInterval tails = pd.probability(TAILS);
        // then
        assertThat(heads).isEqualTo(HALF);
        assertThat(tails).isEqualTo(HALF);
    }
}
