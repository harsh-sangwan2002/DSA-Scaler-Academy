package MaxProductSubarray;

public class tabulation {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProduct(final int[] A) {

        int n = A.length;
        if (n == 1)
            return A[0];

        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        dp1[0] = A[0];
        dp2[0] = A[0];
        int ans = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {

            dp1[i] = Math.min(A[i], Math.min(A[i] * dp1[i - 1], A[i] * dp2[i - 1]));
            dp2[i] = Math.max(A[i], Math.max(A[i] * dp1[i - 1], A[i] * dp2[i - 1]));
            ans = Math.max(ans, dp2[i]);
            
        }

        return ans;
    }
}
