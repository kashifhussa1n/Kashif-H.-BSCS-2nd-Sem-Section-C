package STUDENT_GRADES;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Joe");
        Student student2 = new Student("Mary");

        student1.inputGrades();
        student2.inputGrades();

        System.out.println("The average for " + student1.getName() + " is " + student1.getAverage() + ".");
        System.out.println("The average for " + student2.getName() + " is " + student2.getAverage() + ".");

        // Printing the objects directly -- this calls toString() automatically
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
    }
}
