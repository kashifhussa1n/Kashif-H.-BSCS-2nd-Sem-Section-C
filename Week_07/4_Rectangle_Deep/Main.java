public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point a = new Point(0, 0);
        Point b = new Point(4, 3);
        Rectangle r1 = new Rectangle(a, b);

        Rectangle r3 = (Rectangle) r1.clone();

        System.out.println("r1 = " + r1);
        System.out.println("r3 (deep clone) = " + r3);

        System.out.println("r1 topLeft == r3 topLeft ? " + (r1.getTopLeft() == r3.getTopLeft()));
        // false -> deep clone made a brand-new Point, nothing is shared

        System.out.println("r1.equals(r3) = " + r1.equals(r3));
        // true -> different objects, but same content
    }
}
