package STUDENT_GRADES;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Ali");
        Student student2 = new Student("Kassam");

        student1.inputGrades();
        student2.inputGrades();

        student1.printName();
        student2.printName();

        // manually print getName method(return type)
        System.out.println("getName() - Student Name: " + student1.getName());
        System.out.println("getName() - Student Name: " + student2.getName());

        System.out.println(student1);
        System.out.println(student2);

    }
}
