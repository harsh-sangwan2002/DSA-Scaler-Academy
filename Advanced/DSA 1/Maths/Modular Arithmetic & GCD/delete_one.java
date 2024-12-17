public class delete_one {

    private int GCD(int a, int b) {

        if (a == 0)
            return b;
        if (b == 0)
            return a;

        return GCD(b, a % b);
    }

    public int solve(int[] A) {

        int[] left = new int[A.length];
        int[] right = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            if (i == 0)
                left[i] = A[i];

            else
                left[i] = GCD(left[i - 1], A[i]);
        }

        for (int i = A.length - 1; i >= 0; i--) {

            if (i == A.length - 1)
                right[i] = A[i];

            else
                right[i] = GCD(right[i + 1], A[i]);
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {

            int gcd = 0;

            if (i == 0)
                gcd = right[i + 1];

            else if (i == A.length - 1)
                gcd = left[i - 1];

            else
                gcd = GCD(left[i - 1], right[i + 1]);

            max = Math.max(gcd, max);
        }

        return max;
    }
}
