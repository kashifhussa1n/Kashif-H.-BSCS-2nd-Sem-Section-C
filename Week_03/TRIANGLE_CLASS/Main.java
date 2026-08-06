package TRIANGLE_CLASS;

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        Triangle t3 = new Triangle();
        Triangle t4 = new Triangle();
        Triangle t5 = new Triangle();

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);

        System.out.println(Triangle.objectCount());
    }
}
