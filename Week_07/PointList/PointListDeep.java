// Section 7 (deep version) of the revision guide.
public class PointListDeep implements Cloneable {
    private Point[] myList;

    public PointListDeep(Point[] list) {
        this.myList = list;
    }

    public Point[] getList() { return myList; }

    @Override
    public Object clone() throws CloneNotSupportedException {
        PointListDeep copy = (PointListDeep) super.clone();
        copy.myList = new Point[this.myList.length];
        for (int i = 0; i < this.myList.length; i++) {
            copy.myList[i] = new Point(this.myList[i]); // new Point for every element
        }
        return copy;
    }
}
