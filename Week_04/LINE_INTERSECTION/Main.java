package Week_04.LINE_INTERSECTION;

public class Main {

    public static void main(String[] args) {

        // Line 1: y = 2x - 1
        Line line1 = new Line(2, -1);

        // Line 2: y = -2x + 7
        Line line2 = new Line(-2, 7);

        // Find Intersection
        line1.Intersection(line2);
    }
}