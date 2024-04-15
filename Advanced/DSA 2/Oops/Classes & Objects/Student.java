public class Student {

    String name;
    int age;
    String batchName;

    // this keyword
    void changeBatch(String batchName) {
        this.batchName = batchName;
    }

    void mockInterview() {
        System.out.println("I will give mock interviews.");
    }

    public static void main(String[] args) {

        // object creation
        Student s1 = new Student();
        s1.name = "Harsh";
        s1.age = 22;
        s1.batchName = "CSE-2";

        Student s2 = new Student();
        s2.name = "Vinay";
        s2.age = 33;
        s2.batchName = "CSE-2";

        System.out.println(s1);
        System.out.println(s2);
    }
}