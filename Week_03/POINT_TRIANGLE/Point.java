package POINT_TRIANGLE;

public class Point {

    private double x1, y1, x2, y2, x3, y3;

    Point(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    double sideDistance(double xA, double yA, double xB, double yB) {
        double dx = xB - xA;
        double dy = yB - yA;
        double pythagoras = Math.sqrt((dx * dx) + (dy * dy));
        return pythagoras;
    }

    double sideAB() {
        return sideDistance(x1, y1, x2, y2);
    }

    double sideBC() {
        return sideDistance(x2, y2, x3, y3);
    }

    double sideCA() {
        return sideDistance(x3, y3, x1, y1);
    }

    public String toString() {
        return "Point1: (" + x1 + "," + y1 + ") Point2: (" + x2 + "," + y2 + ") Point3: (" + x3 + "," + y3 + ")";
    }

}
