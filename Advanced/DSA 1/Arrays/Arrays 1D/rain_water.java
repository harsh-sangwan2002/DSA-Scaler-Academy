public class rain_water {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {

        int[] pre = new int[A.length];
        int[] sf = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            if (i > 0)
                pre[i] = Math.max(pre[i - 1], A[i]);

            else
                pre[i] = A[i];
        }

        for (int i = A.length - 1; i >= 0; i--) {

            if (i < A.length - 1)
                sf[i] = Math.max(sf[i + 1], A[i]);

            else
                sf[i] = A[i];
        }

        int ans = 0;

        for (int i = 1; i < A.length - 1; i++) {

            int left = pre[i - 1], right = sf[i + 1];
            int water = Math.min(left, right) - A[i];

            if (water > 0)
                ans += water;
        }

        return ans;
    }
}
