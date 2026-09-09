public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p = new Point(0, 0);
        Circle c1 = new Circle(p, 5);
        Circle c2 = (Circle) c1.clone();

        System.out.println("c1 center = " + c1.getCenter());
        System.out.println("c2 center = " + c2.getCenter());
        // Proves the clone is DEEP for center: different Point objects
        System.out.println("Same center object (c1 vs c2)? " + (c1.getCenter() == c2.getCenter())); // false

        System.out.println("c1 area = " + c1.area());
        System.out.println("c2 area = " + c2.area());
        System.out.println("c1.equals(c2) = " + c1.equals(c2)); // true, same values

        // Why radius is NOT static: each Circle keeps its own value
        Circle c3 = new Circle(p, 10);
        System.out.println("c1 radius = " + c1.getRadius() + ", c3 radius = " + c3.getRadius());
    }
}
