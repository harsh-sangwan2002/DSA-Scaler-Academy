public class unbounded_knapsack {

    public int solve(int A, int[] B, int[] C) {

        int k = A;

        int[] dp = new int[k + 1];
        dp[0] = 0;

        int n = B.length;

        for (int i = 1; i <= k; i++) {

            int max = 0;

            for (int j = 0; j < n; j++) {

                if (i >= C[j])
                    max = Math.max(max, B[j] + dp[i - C[j]]);

            }

            dp[i] = max;
        }

        return dp[k];
    }
}