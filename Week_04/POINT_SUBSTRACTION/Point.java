package Week_04.POINT_SUBSTRACTION;

public class Point {

    double x;
    double y;

    // Parameterized constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Subtract two points
    public Point subtract(Point other) {
        return new Point(
                this.x - other.x,
                this.y - other.y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
