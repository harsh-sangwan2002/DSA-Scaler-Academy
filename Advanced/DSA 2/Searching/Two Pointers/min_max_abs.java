public class min_max_abs {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int minimize(final int[] A, final int[] B, final int[] C) {

        int i = 0, j = 0, k = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;

        while (i < A.length && j < B.length && k < C.length) {

            max = Math.max(A[i], Math.max(B[j], C[k]));
            min = Math.min(A[i], Math.min(B[j], C[k]));

            int diff = max - min;
            ans = Math.min(ans, diff);

            if (diff == 0)
                break;

            if (A[i] == min)
                i++;

            else if (B[j] == min)
                j++;

            else
                k++;
        }

        return ans;
    }
}
