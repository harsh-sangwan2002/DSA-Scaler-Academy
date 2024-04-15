public class pascal_triangle {

    public int[][] solve(int A) {

        int[][] dp = new int[A][A];

        for (int i = 0; i < dp.length; i++) {

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i)
                    dp[i][j] = 1;

                else
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        return dp;
    }
}
