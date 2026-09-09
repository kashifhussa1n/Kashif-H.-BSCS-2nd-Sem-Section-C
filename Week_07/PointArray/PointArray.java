// Sections 8 & 9 of the revision guide: full deep clone of an array of objects.
public class PointArray implements Cloneable {
    private Point[] points;

    public PointArray(Point[] pts) {
        this.points = pts; // pts is already a Point[], so this is correct
    }

    public Point[] getPoints() { return points; }

    @Override
    public PointArray clone() throws CloneNotSupportedException {
        PointArray copy = (PointArray) super.clone();
        // this.points.length = number of elements in the array (NOT this.points itself)
        copy.points = new Point[this.points.length];
        for (int i = 0; i < this.points.length; i++) {
            copy.points[i] = new Point(this.points[i]);
        }
        return copy;
    }
}
