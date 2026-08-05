package POINT_TRIANGLE;

public class Main {
    public static void main(String[] args) {

        Point triangle = new Point();

        triangle.point1(0, 0);
        triangle.point2(3, 0);
        triangle.point3(0, 4);

        if (triangle.sideAB() == triangle.sideBC() && triangle.sideBC() == triangle.sideCA()) {
            System.out.println("Equilateral Triangle");
        }
    }
}
