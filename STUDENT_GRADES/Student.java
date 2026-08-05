import java.util.Scanner;

public class Student {
    private String name;
    private int test1;
    private int test2;

    // Constructor - takes the student's name
    public Student(String name) {
        this.name = name;
        this.test1 = 0;
        this.test2 = 0;
    }

    // Prints the student's name
    public void printName() {
        System.out.println(name);
    }

    // Returns the student's name as a string
    public String getName() {
        return name;
    }

    // Prompts for and reads in the student's test grades, with validation
    public void inputGrades() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter test 1 score for " + name + ": ");
        test1 = scan.nextInt();
        while (test1 < 0 || test1 > 100) {
            System.out.println("Invalid grade. Please enter a value between 0 and 100.");
            System.out.print("Enter test 1 score for " + name + ": ");
            test1 = scan.nextInt();
        }

        System.out.print("Enter test 2 score for " + name + ": ");
        test2 = scan.nextInt();
        while (test2 < 0 || test2 > 100) {
            System.out.println("Invalid grade. Please enter a value between 0 and 100.");
            System.out.print("Enter test 2 score for " + name + ": ");
            test2 = scan.nextInt();
        }
    }

    // Computes and returns the average of the two test scores
    public double getAverage() {
        return (test1 + test2) / 2.0;
    }

    // Returns a string representation of the student
    public String toString() {
        return "Name: " + name + "   Test1: " + test1 + "   Test2: " + test2;
    }
}
