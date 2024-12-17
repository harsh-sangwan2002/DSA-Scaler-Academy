import java.util.Scanner;

public class printSum {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int sum = 0;
        for (int val : arr)
            sum += val;

        System.out.println(sum);

        scn.close();
    }
}