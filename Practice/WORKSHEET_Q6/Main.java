package WORKSHEET_Q6;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Create original object
        Array arr1 = new Array();

        // Clone the object
        Array arr2 = arr1.clone();

        // Print both
        System.out.println("Before increment:");
        System.out.println("arr1: " + arr1);
        System.out.println("arr2: " + arr2);

        // Increment original
        arr1.increment();

        // Print again
        System.out.println("\nAfter incrementing arr1:");
        System.out.println("arr1: " + arr1);
        System.out.println("arr2: " + arr2);
    }
}