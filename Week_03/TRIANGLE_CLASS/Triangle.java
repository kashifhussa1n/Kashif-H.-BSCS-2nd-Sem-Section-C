package TRIANGLE_CLASS;

public class Triangle {

    private double sideA, sideB, sideC;

    // Constructor
    Triangle() {
        this.sideA = 1.0;
        this.sideB = 1.0;
        this.sideC = 1.0;
    }

    // one parameter constructor
    Triangle(double x) {
        this.sideA = x;
        this.sideB = x;
        this.sideC = x;
    }

    // two parameter constructor
    Triangle(double x, double y) {
        this.sideA = x;
        this.sideB = x;
        this.sideC = y;
    }

    // three parameter constructor
    Triangle(double x, double y, double z) {
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
    }

}
