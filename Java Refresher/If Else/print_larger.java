import java.util.Scanner;

public class print_larger {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        if (a > b)
            System.out.println(a + " is larger");

        else if (a < b)
            System.out.println(b + " is larger");

        else
            System.out.println("Both are equal");

        scn.close();
    }
}