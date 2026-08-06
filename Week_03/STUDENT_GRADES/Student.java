package STUDENT_GRADES;

import java.util.Scanner;

public class Student {
    private String studentName;
    private double scoreTest1, scoreTest2;

    // constructor
    Student(String studentName) {
        this.studentName = studentName;
    }

    // method
    void printName() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Average Test Score: " + getAverage());
    }

    // input method
    void inputGrades() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Test Score of " + studentName + ": ");
        scoreTest1 = scanner.nextDouble();
        while (scoreTest1 < 0 || scoreTest1 > 100) {
            System.out.println("ERROR! Number should be between 0 and 100. Retry: ");
            scoreTest1 = scanner.nextDouble();
        }

        System.out.print("Enter Second Test Score of " + studentName + ": ");
        scoreTest2 = scanner.nextDouble();
        while (scoreTest2 < 0 || scoreTest2 > 100) {
            System.out.print("ERROR! Number should be between 0 and 100. Retry: ");
            scoreTest2 = scanner.nextDouble();
        }

        scanner.close();

    }

    // average method
    double getAverage() {
        return (scoreTest1 + scoreTest2) / 2;
    }

    // get name method
    String getName() {
        return studentName;
    }

    // toString method
    @Override
    public String toString() {
        return "[With toString] Student Name: " + studentName + " Test 01 Score: " + scoreTest1 + " Test 02 Score: "
                + scoreTest2 + "\n[Without toString] STUDENT_GRADES.Student@4fca772d\r\n" + //
                "STUDENT_GRADES.Student@9807454";
    }

}
