package UniquePaths;

public class tabulation {

    public int uniquePathsWithObstacles(int[][] A) {

        int n = A.length, m = A[0].length;

        if (A[0][0] == 1)
            return 0;

        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (i == 0 && j == 0)
                    dp[i][j] = 1;

                else if (A[i][j] == 1)
                    dp[i][j] = 0;

                else if (i == 0)
                    dp[i][j] = dp[i][j - 1];

                else if (j == 0)
                    dp[i][j] = dp[i - 1][j];

                else
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[n - 1][m - 1];
    }
}
