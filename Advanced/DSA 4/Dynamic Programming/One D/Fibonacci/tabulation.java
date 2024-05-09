package Fibonacci;

import java.util.*;

public class tabulation {

    private static int solve(int n, int[] dp){

        dp[0] = 0; dp[1] = 1;

        for(int i=2; i<=n; i++)
        dp[i] = dp[i-1]+dp[i-2];

        return dp[n];
    }

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] dp = new int[n+1];

        for(int i=0; i<dp.length; i++)
        dp[i] = -1;

        int res = solve(n,dp);
        System.out.print(res);

        scn.close();
    }
}