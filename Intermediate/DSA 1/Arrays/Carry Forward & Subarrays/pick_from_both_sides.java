public class pick_from_both_sides {

    public int solve(int[] A, int B) {

        int[] pre = new int[A.length];
        int[] suf = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            if (i == 0)
                pre[i] = A[i];

            else
                pre[i] = pre[i - 1] + A[i];
        }

        for (int i = A.length - 1; i >= 0; i--) {

            if (i == A.length - 1)
                suf[i] = A[i];

            else
                suf[i] = suf[i + 1] + A[i];
        }

        int max = Math.max(pre[B - 1], suf[A.length - B]);

        for (int i = 1; i < B; i++) {

            int sum = pre[i - 1] + suf[A.length - B + i];
            max = Math.max(max, sum);
        }

        return max;
    }
}
