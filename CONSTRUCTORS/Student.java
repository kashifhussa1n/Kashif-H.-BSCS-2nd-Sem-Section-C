package CONSTRUCTORS;

public class Student {
    String name = "Spongebob";
    int age;
    double gpa;

    Student(String name, int age, double gpa) { // Constructor
        this.name = name;
        this.age = age; // this(keyword) = the object we're currently working with/constructing
        this.gpa = gpa;
    }

    // note: Constructor will have same name as main class e.g. Student Student
}
