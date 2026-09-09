// Section 7 (shallow version) of the revision guide.
public class PointListShallow implements Cloneable {
    private Point[] myList;

    public PointListShallow(Point[] list) {
        this.myList = list;
    }

    public Point[] getList() { return myList; }

    @Override
    public Object clone() throws CloneNotSupportedException {
        PointListShallow copy = (PointListShallow) super.clone();
        // array.clone() makes a NEW ARRAY CONTAINER ONLY.
        // The Point objects INSIDE are still the same shared references.
        copy.myList = this.myList.clone();
        return copy;
    }
}
