package OOPS_BASIC;

public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2015;
    double price = 150000.49;
    boolean isRunning = false;

    void Start() {
        isRunning = true;
        System.out.println("You started the " + make + " " + model);
    }
}