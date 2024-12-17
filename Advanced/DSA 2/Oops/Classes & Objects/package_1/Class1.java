public class Class1 {

    public int a = 1;
    private int b = 2;
    protected int c = 3;
    int d = 4;

    public void fn() {
        System.out.println(b);
    }

}

class Class2 {

    public static void main(String[] args) {

        Class1 c1 = new Class1();
        System.out.println(c1.a);

        // Cannot access private fields
        // System.out.println(c1.b);

        System.out.println(c1.c);
        System.out.println(c1.d);
    }
}