public class tabulation {

    public int calculateMinimumHP(int[][] A) {

        int n = A.length, m = A[0].length;

        int[][] dp = new int[n][m];

        for (int i = 0; i < dp.length; i++) {

            for (int j = 0; j < dp[0].length; j++)
                dp[i][j] = -1;
        }

        for (int i = n - 1; i >= 0; i--) {

            for (int j = m - 1; j >= 0; j--) {

                if (i == n - 1 && j == m - 1) {

                    if (A[i][j] > 0)
                        dp[i][j] = 1;

                    else
                        dp[i][j] = 1 + Math.abs(A[i][j]);
                }

                else if (i == n - 1)
                    dp[i][j] = dp[i][j + 1] - A[i][j];

                else if (j == m - 1)
                    dp[i][j] = dp[i + 1][j] - A[i][j];

                else
                    dp[i][j] = Math.min(dp[i][j + 1], dp[i + 1][j]) - A[i][j];

                dp[i][j] = Math.max(1, dp[i][j]);
            }
        }

        return dp[0][0];
    }
}
