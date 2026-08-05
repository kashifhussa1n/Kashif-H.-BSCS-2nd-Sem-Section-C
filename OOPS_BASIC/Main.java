package OOPS_BASIC;

public class Main {
    public static void main(String[] args) {

        // Object = An entiity that holds data (attributes)
        // and can perform actions (methods)
        // It is a reference data types

        // Object Creation
        // class | name = create new object | Constructor(reference)
        // Scanner scanner = new Scanner(System.in);

        Car car = new Car(); // create new object

        System.out.println(car.model);

        car.Start(); // call out method using car. because in seperate files we need to access car
                     // class using dot
        System.out.println(car.isRunning);

        car.Print();
    }
}
