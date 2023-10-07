package point;

public class Point {
    private int x;
    private int y;


    public Point () {
        this(20,10);
    }

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int getQuadrant() {
        return (int) (2.7 + (y < 0 ? 1 : -1) * (0.5 + (x < 0 ? 0 : 1)));
    }
}
