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

    public int getQuadrant() throws InvalidPointException {
        if (this.x == 0 || this.y == 0) throw new InvalidPointException("Point must not be in the origin or between two Quadrants");
        return (int) (2.7 + (y < 0 ? 1 : -1) * (0.5 + (x < 0 ? 0 : 1)));
    }

    public int getQuadrantReadableImplementation() throws Exception {
        if (x > 0 && y > 0) return 1;
        if (x < 0 && y > 0) return 2;
        if (x < 0 && y < 0) return 3;
        if (x > 0 && y < 0) return 4;

        throw new InvalidPointException("Point must not be in the origin or between two Quadrants");
    }
}
