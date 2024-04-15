public class Student {

    String name;
    int age;
    String batch;

    // Manual constructor
    Student(String name, int age, String batch) {
        this.name = name;
        this.age = age;
        this.batch = batch;
    }

    // Private constructor
    // private void Student(){

    // }

    // Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.batch = s.batch;
    }

    public static void main(String[] args) {

        Student s1 = new Student("Harsh", 22, "CSE-2");
        Student s2 = new Student(s1);

        System.out.println(s2);
    }
}