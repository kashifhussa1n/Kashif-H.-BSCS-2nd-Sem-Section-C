package TRIANGLE_CLASS;

public class Triangle {

    private double sideA, sideB, sideC;

    public static int Count = 0;

    // Constructor
    Triangle() {
        this.sideA = 1.0;
        this.sideB = 1.0;
        this.sideC = 1.0;
        Count++;
    }

    // one parameter constructor
    Triangle(double x) {
        this.sideA = x;
        this.sideB = x;
        this.sideC = x;
        Count++;
    }

    // two parameter constructor
    Triangle(double x, double y) {
        this.sideA = x;
        this.sideB = x;
        this.sideC = y;
        Count++;
    }

    // three parameter constructor
    Triangle(double x, double y, double z) {
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
        Count++;
    }

    // clone constructor
    Triangle(Triangle t) {
        this.sideA = t.sideA;
        this.sideB = t.sideB;
        this.sideC = t.sideC;
        Count++;
    }

    // count object METHOD
    static int objectCount() {
        return Count;
    }

    // perimeter METHOD
    double perimeter() {
        return sideA + sideB + sideC;
    }

    boolean isRightAngle() {
        if (sideA == sideB + sideC) {
            return true;
        } else {
            return false;
        }
    }

}
