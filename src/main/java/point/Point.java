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
        return 1;
    }
}
