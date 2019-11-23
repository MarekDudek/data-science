package dudek.stats_in_java.pds;

import dudek.stats_in_java.probability.ProbabilityDistribution;
import dudek.stats_in_java.toys.CoinToss;
import dudek.stats_in_java.toys.Color;
import dudek.stats_in_java.toys.Dice;
import dudek.stats_in_java.toys.Rank;
import dudek.stats_in_java.unit_interval.Unit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static dudek.stats_in_java.pds.CoinTossProbabilityDistribution.coinToss;
import static dudek.stats_in_java.probability.ProbabilityDistributions.fromEnum;
import static dudek.stats_in_java.toys.CoinToss.HEADS;
import static dudek.stats_in_java.toys.CoinToss.TAILS;
import static dudek.stats_in_java.unit_interval.Units.*;
import static org.assertj.core.api.Assertions.assertThat;

final class ProbabilitiesTest {

    @Test
    void coin_toss() {
        // when
        final ProbabilityDistribution<CoinToss> pd = coinToss();
        final Unit heads = pd.probability(HEADS);
        final Unit tails = pd.probability(TAILS);
        // then
        assertThat(heads).isEqualTo(HALF);
        assertThat(tails).isEqualTo(HALF);
    }

    private static final Unit ONE_SIXTH = fromUnit(1.0f / 6);

    @ParameterizedTest
    @EnumSource(Dice.class)
    void dice(final Dice dice) {
        // when
        final ProbabilityDistribution<Dice> pd = fromEnum(Dice.class);
        // then
        assertThat(pd.probability(dice)).isEqualTo(ONE_SIXTH);
    }

    @ParameterizedTest
    @EnumSource(CoinToss.class)
    void coin_toss_again(final CoinToss toss) {
        // when
        final ProbabilityDistribution<CoinToss> pd = fromEnum(CoinToss.class);
        // then
        assertThat(pd.probability(toss)).isEqualTo(HALF);
    }

    private static final Unit ONE_THIRTEENTH = fromUnit(1.0f / 13);

    @ParameterizedTest
    @EnumSource(Rank.class)
    void rank(final Rank rank) {
        // when
        final ProbabilityDistribution<Rank> pd = fromEnum(Rank.class);
        // then
        assertThat(pd.probability(rank)).isEqualTo(ONE_THIRTEENTH);
    }

    @ParameterizedTest
    @EnumSource(Color.class)
    void color(final Color color) {
        // when
        final ProbabilityDistribution<Color> pd = fromEnum(Color.class);
        // then
        assertThat(pd.probability(color)).isEqualTo(QUARTER);
    }

    @ParameterizedTest
    @EnumSource(CoinToss.class)
    void comparisons(final CoinToss toss) {
        // given
        final ProbabilityDistribution<CoinToss> pd1 = coinToss();
        final ProbabilityDistribution<CoinToss> pd2 = fromEnum(CoinToss.class);
        // when
        final Unit p1 = pd1.probability(toss);
        final Unit p2 = pd2.probability(toss);
        // then
        assertThat(p1).isEqualTo(p2);
    }
}
