public class Animal {

    int age;
    String name;

    public Animal() {
        System.out.println("Animal");
    }

    public void print() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {

    public Dog() {

        this("Labrador");
        super.age = 12;
        super.name = "Rocky";
    }

    public Dog(String breed) {

        super();
        System.out.println(breed);
    }

    public void print() {
        System.out.println("Dog");
    }

    public static void main(String[] args) {

        Animal a = new Dog();
        System.out.println(a.age);
        System.out.println(a.name);
        a.print();
    }
}
