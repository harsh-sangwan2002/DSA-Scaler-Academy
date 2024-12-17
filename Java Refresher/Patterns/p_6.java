import java.util.Scanner;

public class p_6 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nsp = n-2;

        for (int i = 1; i <= n; i++) {

            System.out.print("*");

            for(int csp=1; csp<=nsp; csp++)
            System.out.print(" ");

            System.out.println("*");
        }

        scn.close();
    }
}