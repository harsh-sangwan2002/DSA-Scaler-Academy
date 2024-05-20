public class coin_sum_infinite {

    public int coinchange2(int[] A, int B) {

        long mod = (long) (1e6 + 7);
        long[] dp = new long[B + 1];
        dp[0] = 1L;

        for (int i = 0; i < A.length; i++) {

            for (int j = 1; j <= B; j++) {

                if (A[i] <= j)
                    dp[j] = (dp[j] + dp[j - A[i]]) % mod;
            }
        }

        return (int) dp[B];
    }
}
