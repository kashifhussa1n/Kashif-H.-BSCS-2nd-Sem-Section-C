package TRIANGLE_CLASS;

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(); // 1.0, 1.0, 1.0
        Triangle t2 = new Triangle(5.0); // 5.0, 5.0, 5.0
        Triangle t3 = new Triangle(4.0, 6.0); // 4.0, 4.0, 6.0
        Triangle t4 = new Triangle(3.0, 4.0, 5.0); // right triangle
        Triangle t5 = new Triangle(t4); // clone of t4

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);

        System.out.println("Perimeter of t4: " + t4.perimeter());
        System.out.println("Is t4 right-angled? " + t4.isRightAngled());
        System.out.println("Is t2 right-angled? " + t2.isRightAngled());

        System.out.println("Total Triangle objects created: " + Triangle.objectCount());
    }
}
