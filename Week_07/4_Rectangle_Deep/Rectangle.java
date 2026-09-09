// Section 6 of the revision guide: DEEP clone version of Rectangle.
public class Rectangle implements Cloneable {
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point p1, Point p2) {
        this.topLeft = new Point(p1);
        this.bottomRight = new Point(p2);
    }

    public Point getTopLeft() { return topLeft; }
    public Point getBottomRight() { return bottomRight; }

    public boolean equals(Rectangle other) {
        return this.topLeft.equals(other.topLeft) && this.bottomRight.equals(other.bottomRight);
    }

    // DEEP CLONE: new outer Rectangle AND new inner Point objects.
    @Override
    public Object clone() throws CloneNotSupportedException {
        Rectangle copy = (Rectangle) super.clone();
        copy.topLeft = new Point(this.topLeft);
        copy.bottomRight = new Point(this.bottomRight);
        return copy;
    }

    @Override
    public String toString() {
        return "Rectangle[" + topLeft + ", " + bottomRight + "]";
    }
}
