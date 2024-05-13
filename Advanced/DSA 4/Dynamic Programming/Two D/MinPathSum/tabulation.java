package MinPathSum;

public class tabulation {

    public int minPathSum(int[][] A) {

        int n = A.length, m = A[0].length;
        int[][] dp = new int[n][m];

        for (int i = A.length - 1; i >= 0; i--) {

            for (int j = A[0].length - 1; j >= 0; j--) {

                if (i == n - 1 && j == m - 1)
                    dp[i][j] = A[i][j];

                else if (i == n - 1)
                    dp[i][j] = A[i][j] + dp[i][j + 1];

                else if (j == m - 1)
                    dp[i][j] = A[i][j] + dp[i + 1][j];

                else
                    dp[i][j] = Math.min(A[i][j] + dp[i][j + 1], A[i][j] + dp[i + 1][j]);
            }
        }

        return dp[0][0];
    }
}
