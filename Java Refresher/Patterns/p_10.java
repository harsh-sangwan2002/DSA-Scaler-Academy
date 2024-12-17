import java.util.Scanner;

public class p_10 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = n, nsp = 0;

        for (int i = 1; i <= n; i++) {

            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*");

            for (int csp = 1; csp <= nsp; csp++)
                System.out.print(" ");

            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*");

            System.out.println();
            
            nst--;
            nsp+=2;
        }

        scn.close();
    }
}