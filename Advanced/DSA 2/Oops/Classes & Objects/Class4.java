class Class4 {

    public static void main(String[] args) {

        Class1 c1 = new Class1();
        System.out.println(c1.a);

        // Cannot access private fields
        // System.out.println(c1.b);

        System.out.println(c1.c);
        System.out.println(c1.d);
    }
}