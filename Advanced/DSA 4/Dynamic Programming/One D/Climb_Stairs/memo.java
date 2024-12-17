import java.util.Arrays;

public class memo {

    private int solve(int n, long mod, long[] dp) {

        if (n == 0 || n == 1)
            return 1;

        if (dp[n] != -1L)
            return (int) (dp[n] % mod);

        dp[n] = (solve(n - 1, mod, dp) + solve(n - 2, mod, dp)) % mod;
        return (int) (dp[n]);
    }

    public int climbStairs(int A) {

        long mod = (long) (1e9 + 7);
        long[] dp = new long[A + 1];

        Arrays.fill(dp, -1L);

        return solve(A, mod, dp);
    }
}
