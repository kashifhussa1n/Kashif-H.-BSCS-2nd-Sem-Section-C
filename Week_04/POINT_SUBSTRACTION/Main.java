package Week_04.POINT_SUBSTRACTION;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(5, 10);
        Point p2 = new Point(3, 2);

        Point result = p1.subtract(p2);

        System.out.println("Result: " + result);
    }
}
