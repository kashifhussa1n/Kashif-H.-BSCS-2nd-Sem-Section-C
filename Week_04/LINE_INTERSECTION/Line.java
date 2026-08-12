package Week_04.LINE_INTERSECTION;

class Line {

    // since; y = mx + b
    // then; x = (y - b) / m
    /*
     * Line 1: y = m1x + b1
     * Line 2: y = m2x + b2
     * 
     * Intersection:
     * m1x + b1 = m2x + b2
     * 
     * x = (b2 - b1) / (m1 - m2)
     * 
     * y = m1x + b1
     * 
     * Result = (x, y)
     */

    private double m, b;

    Line(double m, double b) { // parametrized constructor
        this.m = m;
        this.b = b;
    }

    // Intersection METHOD
    void Intersection(Line other) {

        if (this.m == other.b) {
            System.out.println("These lines are parallel");

        }

        double x = (other.b - this.b) / (this.m - other.m);
        double y = this.m * x + this.b;

        System.out.println("Intersection: (" + x + ", " + y + ")");

    }

}
