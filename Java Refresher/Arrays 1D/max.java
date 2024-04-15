import java.util.Scanner;

public class max {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int max_val = 0;
        for (int val : arr)
            max_val = Math.max(max_val, val);

        System.out.println(max_val);

        scn.close();
    }
}