package TRIANGLE_CLASS;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    // Class variable to keep track of how many Triangle objects have been created
    private static int count = 0;

    // Default constructor - all sides equal to 1.0
    public Triangle() {
        this.sideA = 1.0;
        this.sideB = 1.0;
        this.sideC = 1.0;
        count++;
    }

    // One parameter constructor - equilateral triangle
    public Triangle(double side) {
        this.sideA = side;
        this.sideB = side;
        this.sideC = side;
        count++;
    }

    // Two parameter constructor - isosceles triangle with sides x, x, y
    public Triangle(double x, double y) {
        this.sideA = x;
        this.sideB = x;
        this.sideC = y;
        count++;
    }

    // Three parameter constructor - sides x, y, z
    public Triangle(double x, double y, double z) {
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
        count++;
    }

    // Copy constructor - creates a clone of an existing triangle
    public Triangle(Triangle other) {
        this.sideA = other.sideA;
        this.sideB = other.sideB;
        this.sideC = other.sideC;
        count++;
    }

    // Class method - returns the current count of Triangle objects created
    public static int objectCount() {
        return count;
    }

    // Instance method - calculates and returns the perimeter
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    // Instance method - determines if the triangle is right-angled
    public boolean isRightAngled() {
        double a = sideA;
        double b = sideB;
        double c = sideC;
        double temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        double epsilon = 1e-9;
        return Math.abs(a * a + b * b - c * c) < epsilon;
    }

    // Instance method - returns a String representation of the triangle
    public String toString() {
        return "Triangle[sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
    }
}
