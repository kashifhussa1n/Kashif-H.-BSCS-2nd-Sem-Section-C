import java.util.Arrays;

public class Array implements Cloneable {
    private int[] anArray;
    private int value;

    public Array() { // null constructor
        this.anArray = new int[] { 1, 2, 3, 4, 5, 6 };
        this.value = 0;
    }

    public void increment() {
        this.anArray = new int[6];
        for (int i = 0; i < this.anArray.length; i++) {
            this.anArray[i]++;
        }
        this.value++;
    }

    @Override
    public String toString() {
        String print = ""; // empty string for concatenation
        for (int i = 0; i < this.anArray.length; i++) {
            print = print + this.anArray[i];
        }

        return "Array = [" + print + "] - Value = " + this.value;
    }

    @Override
    public Array clone() throws CloneNotSupportedException {
        return (Array) super.clone(); // shallow copy
    }
}
