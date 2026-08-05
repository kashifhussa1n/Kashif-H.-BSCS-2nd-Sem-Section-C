package POINT_TRIANGLE;

public class Point {

    private double x1, y1, x2, y2, x3, y3;

    void point1(double x, double y) {
        this.x1 = x;
        this.y1 = y;
    }

    void point2(double x, double y) {
        this.x2 = x;
        this.y2 = y;
    }

    void point3(double x, double y) {
        this.x3 = x;
        this.y3 = y;
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

}
