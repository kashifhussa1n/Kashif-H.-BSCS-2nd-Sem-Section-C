public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Correct: new Point[] { new Point(1,2), new Point(3,4) }
        // Wrong:   new Point[] {1, 2, 3};  <- those are ints, not Points
        Point[] pts = new Point[] { new Point(1, 2), new Point(3, 4) };

        PointArray original = new PointArray(pts);
        PointArray copy = original.clone(); // no cast needed: clone() returns PointArray

        for (int i = 0; i < original.getPoints().length; i++) {
            System.out.println("original[" + i + "] = " + original.getPoints()[i]
                    + "  copy[" + i + "] = " + copy.getPoints()[i]
                    + "  same object? " + (original.getPoints()[i] == copy.getPoints()[i]));
        }
        // Every "same object?" should print false -> true deep clone
    }
}
