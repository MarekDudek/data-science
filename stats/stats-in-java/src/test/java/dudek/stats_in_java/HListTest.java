package dudek.stats_in_java;

import dudek.stats_in_java.toys.Color;
import dudek.stats_in_java.toys.Rank;
import fj.F;
import fj.P2;
import fj.Unit;
import fj.data.hlist.HList.Apply;
import fj.data.hlist.HList.HCons;
import fj.data.hlist.HList.HFoldr;
import fj.data.hlist.HList.HNil;
import org.junit.jupiter.api.Test;

import static dudek.stats_in_java.toys.Color.HEARTS;
import static dudek.stats_in_java.toys.Rank.ACE;
import static fj.P.p;
import static fj.Unit.unit;
import static fj.data.hlist.HList.cons;
import static fj.data.hlist.HList.nil;
import static org.assertj.core.api.Assertions.assertThat;

final class HListTest {

    @Test
    void card_as_product() {
        // when
        final HCons<Rank, HCons<Color, HNil>> card = nil().extend(HEARTS).extend(ACE);
        final Rank rank = card.head();
        final Color color = card.tail().head();
        // then
        assertThat(rank).isEqualTo(ACE);
        assertThat(color).isEqualTo(HEARTS);
    }

    @Test
    void lists_with_the_same_elements_are_not_equal() {
        final HCons<Rank, HCons<Color, HNil>> l1 = nil().extend(HEARTS).extend(ACE);
        final HCons<Rank, HCons<Color, HNil>> l2 = cons(ACE, cons(HEARTS, nil()));
        assertThat(l1).isNotEqualTo(l2);
    }

    @Test
    void what_is_extender() {
        final Apply<Unit, P2<String, HNil>, HCons<String, HNil>> extender = nil().extender();
        final HCons<String, HNil> list = extender.apply(unit(), p("dupa", nil()));
        System.out.println(list);

        final HCons<String, HNil> l1 = nil().extend("string");
        final Apply<Unit, P2<String, HNil>, HCons<String, HNil>> extender1 = nil().extender();
        final HCons<String, HNil> l2 = extender1.apply(unit(), p("string", nil()));
    }

    @Test
    void folding() {
        final HFoldr<F<Integer, Long>, String, HNil, String> foldr = HFoldr.<F<Integer, Long>, String>hFoldr();
        final String r = foldr.foldRight(i -> (long) i * 2, "empty", nil());
        System.out.println("result: " + r);
    }
}
