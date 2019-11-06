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

    public static final ImmutableList<Point2D> Sequence2 =
            ImmutableList.<Point2D>builder().
                    add(new Point2D(10.0, 9.14)).
                    add(new Point2D(8.0, 8.14)).
                    add(new Point2D(13.0, 8.74)).
                    add(new Point2D(9.0, 8.77)).
                    add(new Point2D(11.0, 9.26)).
                    add(new Point2D(14.0, 8.10)).
                    add(new Point2D(6.0, 6.13)).
                    add(new Point2D(4.0, 3.10)).
                    add(new Point2D(12.0, 9.13)).
                    add(new Point2D(7.0, 7.26)).
                    add(new Point2D(5.0, 4.74)).
                    build();

    public static final ImmutableList<Point2D> Sequence3 =
            ImmutableList.<Point2D>builder().
                    add(new Point2D(10.0, 7.46)).
                    add(new Point2D(8.0, 6.77)).
                    add(new Point2D(13.0, 12.74)).
                    add(new Point2D(9.0, 7.11)).
                    add(new Point2D(11.0, 7.81)).
                    add(new Point2D(14.0, 8.84)).
                    add(new Point2D(6.0, 6.08)).
                    add(new Point2D(4.0, 5.39)).
                    add(new Point2D(12.0, 8.15)).
                    add(new Point2D(7.0, 6.42)).
                    add(new Point2D(5.0, 5.73)).
                    build();

    public static final ImmutableList<Point2D> Sequence4 =
            ImmutableList.<Point2D>builder().
                    add(new Point2D(8.0, 6.58)).
                    add(new Point2D(8.0, 5.76)).
                    add(new Point2D(8.0, 7.71)).
                    add(new Point2D(8.0, 8.84)).
                    add(new Point2D(8.0, 8.47)).
                    add(new Point2D(8.0, 7.04)).
                    add(new Point2D(8.0, 5.25)).
                    add(new Point2D(19.0, 12.50)).
                    add(new Point2D(8.0, 5.56)).
                    add(new Point2D(8.0, 7.91)).
                    add(new Point2D(8.0, 6.89)).
                    build();
}
