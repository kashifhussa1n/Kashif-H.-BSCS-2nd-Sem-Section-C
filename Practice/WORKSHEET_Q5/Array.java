package WORKSHEET_Q5;

import java.util.Arrays;

public class Array implements Cloneable {
    private int[] anArray;
    private int value;

    public Array() {
        anArray = new int[]{1, 2, 3, 4, 5};
        value = 0;
    }

    public void increment() {
        for (int i = 0; i < anArray.length; i++) { anArray[i]++; }
        value++;
    }

    @Override
    public String toString() {
        return "anArray=" + Arrays.toString(anArray) + ", value=" + value;
    }

    @Override
    public Array clone() throws CloneNotSupportedException {
        return (Array) super.clone();   // shallow copy
    }
}