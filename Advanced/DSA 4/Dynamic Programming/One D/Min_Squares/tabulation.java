package Min_Squares;

import java.util.Arrays;

public class tabulation {

    private static int solve(int n, int[] dp) {

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {

            for (int x = 1; x * x <= i; x++)
                dp[i] = Math.min(dp[i], dp[i - x * x]);

            dp[i] += 1;
        }

        return dp[n];
    }

    public int countMinSquares(int A) {

        int[] dp = new int[A + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);

        return solve(A, dp);
    }
}
