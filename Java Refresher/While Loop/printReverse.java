import java.util.Scanner;

public class printReverse {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int count = n;

        while (count >= 1) {
            System.out.println(count + " ");
            count--;
        }

        scn.close();
    }
}