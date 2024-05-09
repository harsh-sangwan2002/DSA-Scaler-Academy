package Fibonacci;

import java.util.*;

public class memo {

    private static int solve(int n, int[] dp) {

        if (n == 0 || n == 1)
            return n;

        if (dp[n] != -1)
            return dp[n];

        return dp[n] = solve(n - 1, dp) + solve(n - 2, dp);
    }

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] dp = new int[n + 1];

        for (int i = 0; i < dp.length; i++)
            dp[i] = -1;

        int res = solve(n, dp);
        System.out.print(res);

        scn.close();
    }
}
