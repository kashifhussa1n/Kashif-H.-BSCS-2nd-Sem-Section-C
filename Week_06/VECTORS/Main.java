package Week_06.VECTORS;

public class Main {

    public static void main(String[] args) {

        Vector v1 = new Vector();
        Vector v2 = new Vector(2, 3, 4);
        Vector v3 = new Vector(1, 5, 2);

        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);
        System.out.println("v3: " + v3);

        System.out.println(v2.Add(v3));
        System.out.println(v2.Subtract(v3));
        System.out.println(v2.Mutiply(v3));
        System.out.println(v2.Divide(v3));

        System.out.println("Dot Product: " + v2.dotProduct(v3));
        System.out.println("Cross Product: " + v2.crossProduct(v3));

    }
}
