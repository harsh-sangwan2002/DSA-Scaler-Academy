public class Class1 {

    Class1() {
        System.out.println("Class-1");
    }
}

class Class2 extends Class1 {

    Class2() {
        System.out.println("Class-2");
    }

    Class2(String name) {
        System.out.println(name);
    }
}

class Class3 extends Class2 {

    Class3() {
        System.out.println("Class-3");
    }
}

class Class4 extends Class3 {

    Class4() {
        System.out.println("Class-4");
    }

    public static void main(String[] args) {

        Class4 c = new Class4();
        System.out.println(c);
    }
}
