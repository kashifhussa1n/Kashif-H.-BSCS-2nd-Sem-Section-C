// Section 2 & 3 of the revision guide.
public class Circle implements Cloneable {
    private Point center;
    private double radius; // primitive -> super.clone() already copies it correctly,
                            // no need for radius.clone() and no need to make it static.

    public Circle(Point p, double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("radius must be greater than zero");
        }
        this.center = new Point(p); // copy, so Circle owns its own Point
        this.radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    // Overload of equals (parameter type Circle, not Object)
    public boolean equals(Circle other) {
        return this.center.equals(other.center) && this.radius == other.radius;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Circle copy = (Circle) super.clone();
        // DEEP CLONE for center, because it's an object reference:
        copy.center = new Point(this.center);
        // radius is primitive double -> already copied correctly by super.clone()
        return copy;
    }

    public Point getCenter() { return center; }
    public double getRadius() { return radius; }
}
