public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public boolean equals(Point other) {
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public String toString() { return "(" + x + ", " + y + ")"; }
}
