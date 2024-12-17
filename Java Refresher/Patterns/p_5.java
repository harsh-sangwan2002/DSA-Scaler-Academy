import java.util.Scanner;

public class p_5 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1;

        for (int i = 1; i <= n; i++) {

            for (int cst = 1; cst <= nst; cst++)
            {
                if(cst%2==0)
                System.out.print(cst + " ");

                else
                System.out.print("*" + " ");
            }
                
            System.out.println();
            nst++;
        }

        scn.close();
    }
}