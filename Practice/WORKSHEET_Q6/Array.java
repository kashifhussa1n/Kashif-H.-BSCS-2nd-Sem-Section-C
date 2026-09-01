package WORKSHEET_Q6;

import java.util.Arrays;

public class Array implements Cloneable {
    private int[] Arr;
    private int value;

    public Array() {
        Arr = new int[]{1, 2, 3, 4, 5};
        value = 0;
    }

    public void increment() {
        for (int i = 0; i < Arr.length; i++) { Arr[i]++; }
        value++;
    }

    @Override
    public String toString() {
        return "Array=" + Arrays.toString(Arr) + ", value=" + value;
    }

    @Override
    public Array clone() throws CloneNotSupportedException {
        return (Array) super.clone();   // shallow copy
    }
}
