package TRIANGLE_CLASS;

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(1);
        Triangle t3 = new Triangle(1,2);
        Triangle t4 = new Triangle(3,5,4);
        Triangle t5 = new Triangle(t4);

        // System.out.println(t1.sideA + " " + t1.sideB + " " + t1.sideC);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);

        System.out.println(Triangle.objectCount());
        System.out.println(t4.perimeter());
        System.out.println(t4.isRightAngle());
        System.out.println();
    }
}
