import java.util.Scanner;

public class p_3 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++)
                System.out.print("*");

            System.out.println();
        }

        scn.close();
    }
}