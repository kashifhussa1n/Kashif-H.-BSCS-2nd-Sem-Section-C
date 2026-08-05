package POINT_TRIANGLE;

public class Main {
    public static void main(String[] args) {

        Point point = new Point();

        point.point1(2, 0);
        point.point2(2, 0);
        point.point3(2, 0);

        if (point.sideAB() == point.sideBC() && point.sideBC() == point.sideCA()) {
            System.out.println("Equilateral Triangle");
        } else {
            System.out.println("Not Equilateral");
        }
    }
}
