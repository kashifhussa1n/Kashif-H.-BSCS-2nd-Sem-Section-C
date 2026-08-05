package CONSTRUCTORS;

public class Main {
    public static void main(String[] args) {

        // constructor= A special method to intialize objects
        // You can pass arguments to a constructor and setup initial values

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        System.out.println(student1.name);
        System.out.println(student2.name); // all would be named Spongebob
        System.out.println(student3.name);

        // what if we wanna give each one unique name(Constructor)
        Student student1 = new Student("Spongebob", 35, 3.9);
        Student student2 = new Student("Patrick", 32, 0.9);
        Student student3 = new Student("Squidward", 48, 2.0);

        System.out.println(student1.name);
        System.out.println(student2.name); // all would be named Spongebob
        System.out.println(student3.name);
    }
}
