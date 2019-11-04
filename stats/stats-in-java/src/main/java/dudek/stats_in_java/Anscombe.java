package dudek.stats_in_java;

import com.google.common.collect.ImmutableList;

public enum Anscombe {

    ;

    public static final ImmutableList<Point2D> Sequence1 =
            ImmutableList.<Point2D>builder().
                    add(new Point2D(10.0, 8.04)).
                    add(new Point2D(8.0, 6.95)).
                    add(new Point2D(13.0, 7.58)).
                    add(new Point2D(9.0, 8.81)).
                    add(new Point2D(11.0, 8.33)).
                    add(new Point2D(14.0, 9.96)).
                    add(new Point2D(6.0, 7.24)).
                    add(new Point2D(4.0, 4.26)).
                    add(new Point2D(12.0, 10.84)).
                    add(new Point2D(7.0, 4.82)).
                    add(new Point2D(5.0, 5.68)).
                    build();
}
