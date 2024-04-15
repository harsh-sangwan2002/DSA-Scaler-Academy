public class delete_one {

    private int GCD(int a, int b) {

        if (a == 0)
            return b;
        if (b == 0)
            return a;

        return GCD(b, a % b);
    }

    public int solve(int[] A) {

        int[] pre = new int[A.length];
        int[] suf = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            if (i == 0)
                pre[i] = A[i];

            else
                pre[i] = GCD(pre[i - 1], A[i]);
        }

        for (int i = A.length - 1; i >= 0; i--) {

            if (i == A.length - 1)
                suf[i] = A[i];

            else
                suf[i] = GCD(suf[i + 1], A[i]);
        }

        int ans = 1;

        for (int i = 0; i < A.length; i++) {

            if (i == 0)
                ans = Math.max(ans, suf[i + 1]);

            else if (i == A.length - 1)
                ans = Math.max(ans, pre[i - 1]);

            else {

                int left = pre[i - 1];
                int right = suf[i + 1];
                int gcd = GCD(left, right);
                ans = Math.max(ans, gcd);
            }
        }

        return ans;
    }
}
