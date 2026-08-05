package OOPS_BASIC;

public class Main {
    public static void main(String[] args) {

        // Object = An entiity that holds data (attributes)
        // and can perform actions (methods)
        // It is a reference data types

        // Object Creation
        // class | name = create new object | Constructor(reference)
        // Scanner scanner = new Scanner(System.in);

        Car car = new Car();

        car.isRunning = true;

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);
    }
}
