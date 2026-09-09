// Section 1 of the revision guide: equals() as an OVERLOAD, not an override.
public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) { // copy constructor
        this.x = p.x;
        this.y = p.y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    // This is an OVERLOAD of equals — parameter type is Point, not Object.
    // Writing @Override above this method would be a compile error,
    // because it does not match Object.equals(Object).
    public boolean equals(Point other) {
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
