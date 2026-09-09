// Sections 4, 5, 18, 19 of the revision guide.
public class Rectangle implements Cloneable {
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point p1, Point p2) {
        this.topLeft = new Point(p1);     // each Rectangle gets its own Points
        this.bottomRight = new Point(p2);
    }

    public Point getTopLeft() { return topLeft; }
    public Point getBottomRight() { return bottomRight; }

    // Overload of equals (parameter type Rectangle, not Object).
    // Relies on Point.equals(Point) to compare its own fields.
    public boolean equals(Rectangle other) {
        return this.topLeft.equals(other.topLeft) && this.bottomRight.equals(other.bottomRight);
    }

    // SHALLOW CLONE: only the outer Rectangle is a new object.
    // topLeft and bottomRight Point references are still SHARED with the original.
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Rectangle[" + topLeft + ", " + bottomRight + "]";
    }
}
