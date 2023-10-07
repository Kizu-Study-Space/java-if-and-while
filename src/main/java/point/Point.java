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
        int yFactor = y < 0 ? 1 : 0;
        return (x < 0 ? 2 : 1) + yFactor;
    }
}
