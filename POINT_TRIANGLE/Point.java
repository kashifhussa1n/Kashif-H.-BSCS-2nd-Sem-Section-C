package POINT_TRIANGLE;

public class Point {

    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double sideDistance(Point that) {
        double dx = this.x - that.x;
        double dy = this.y - that.y;
        double pythagoras = Math.sqrt((dx * dx) + (dy * dy));
        return pythagoras;
    }

    void Print() {
        System.out.println("(" + x + "," + y + ")");
    }
}
