public class typecasting {

    public static void main(String[] args) {

        int i = 20;
        long l = 10000000000000L;
        float f = 3.14256F;
        double d = 3.14256;

        System.out.println(i + " " + l + " " + f + " " + d);

        // case 1 -> Implicit conversion
        l = i;
        System.out.println(l);

        // case 2 -> Explicit conversion
        i = (int)l;
        System.out.println(i);

    }
}
