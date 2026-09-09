public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point a = new Point(0, 0);
        Point b = new Point(4, 3);

        Rectangle r1 = new Rectangle(a, b);
        Rectangle r2 = new Rectangle(a, b);

        Object o1 = r1; // same object as r1, just viewed through an Object reference
        Object o2 = r2; // same object as r2

        // Section 18 result: true, false, true
        System.out.println("r1.equals(r2) = " + r1.equals(r2));
        // true -> compiler picks Rectangle.equals(Rectangle) overload, compares contents

        System.out.println("o1.equals(o2) = " + o1.equals(o2));
        // false -> o1/o2 declared as Object, so only Object.equals(Object) is visible,
        // which is reference equality; r1 and r2 are different objects

        System.out.println("r1.equals(o1) = " + r1.equals(o1));
        // true -> o1 is declared Object, so again Object.equals(Object) (reference equality)
        // is used, and o1 actually IS r1 (same object), so it's true

        // ---- Shallow clone demonstration (Section 5) ----
        Rectangle r3 = (Rectangle) r1.clone();
        System.out.println("\n--- Shallow clone ---");
        System.out.println("r1 topLeft == r3 topLeft ? " + (r1.getTopLeft() == a));
        System.out.println("r3 topLeft == original Point a ? " + (r3.getTopLeft() == a));
        // true -> shallow clone shares the same inner Point objects
    }
}
