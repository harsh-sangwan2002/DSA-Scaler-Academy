package Min_Squares;

public class memo {

    private static int solve(int n, int[] dp) {

        if (n == 0)
            return dp[0] = 0;

        if (dp[n] != Integer.MAX_VALUE)
            return dp[n];

        for (int i = 1; i * i <= n; i++)
            dp[n] = Math.min(dp[n], solve(n - i * i, dp));

        return dp[n] = dp[n] + 1;
    }

    public int countMinSquares(int A) {

        int[] dp = new int[A + 1];

        for (int i = 0; i < dp.length; i++)
            dp[i] = Integer.MAX_VALUE;

        dp[0] = 0;
        dp[1] = 1;
        return solve(A, dp);
    }
}
