public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point[] original = { new Point(1, 1), new Point(2, 2) };

        System.out.println("=== SHALLOW clone ===");
        PointListShallow shallowOriginal = new PointListShallow(original);
        PointListShallow shallowCopy = (PointListShallow) shallowOriginal.clone();
        System.out.println("Same array object? " + (shallowOriginal.getList() == shallowCopy.getList())); // false, new array
        System.out.println("Same Point[0] object? " + (shallowOriginal.getList()[0] == shallowCopy.getList()[0])); // true, shared Point

        System.out.println("\n=== DEEP clone ===");
        PointListDeep deepOriginal = new PointListDeep(original);
        PointListDeep deepCopy = (PointListDeep) deepOriginal.clone();
        System.out.println("Same array object? " + (deepOriginal.getList() == deepCopy.getList())); // false
        System.out.println("Same Point[0] object? " + (deepOriginal.getList()[0] == deepCopy.getList()[0])); // false, new Point
    }
}
