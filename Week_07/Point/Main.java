public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(p1); // copy constructor

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 (copy of p1) = " + p3);

        System.out.println("p1.equals(p2) = " + p1.equals(p2)); // true: same x,y values
        System.out.println("p1.equals(p3) = " + p1.equals(p3)); // true: copy has same values
        System.out.println("p1 == p3 (same object?) = " + (p1 == p3)); // false: different objects in memory
    }
}
