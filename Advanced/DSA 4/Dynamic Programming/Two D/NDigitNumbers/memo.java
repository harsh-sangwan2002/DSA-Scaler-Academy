public class memo {

    long mod = (long) (1e9 + 7);

    private int helper(int digits, int sum, long[][] dp) {

        if (digits < 0 || sum < 0)
            return 0;

        else if (digits == 0 && sum == 0)
            return 1;

        if (dp[digits][sum] != -1)
            return (int) dp[digits][sum];

        long ans = 0;

        for (int i = 0; i < 10; i++)
            ans = (ans + helper(digits - 1, sum - i, dp)) % mod;

        dp[digits][sum] = ans;
        return (int) ans;
    }

    public int solve(int A, int B) {

        long ans = 0;
        long[][] dp = new long[A + 1][B + 1];

        for (int i = 0; i < dp.length; i++) {

            for (int j = 0; j < dp[0].length; j++)
                dp[i][j] = -1;
        }

        for (int i = 1; i < 10; i++)
            ans = (ans + helper(A - 1, B - i, dp)) % mod;

        return (int) ans;
    }
}
