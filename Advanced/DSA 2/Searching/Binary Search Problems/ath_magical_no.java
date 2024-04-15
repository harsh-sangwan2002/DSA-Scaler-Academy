public class ath_magical_no {

    private int GCD(int a, int b) {

        if (a == 0)
            return b;
        if (b == 0)
            return a;

        return GCD(b, a % b);
    }

    private long LCM(int a, int b) {

        long res = a * b * 1L;
        res = res / GCD(a, b);
        return res;
    }

    public int solve(int A, int B, int C) {

        long lcm = LCM(B, C);
        long mod = (long) (1e9 + 7);
        long l = Math.min(B, C) * 1L, r = l * A, ans = l;

        while (l <= r) {

            long mid = l + (r - l) / 2;
            long count = (mid / B + mid / C - mid / lcm);

            if ((int) count == A) {
                ans = mid;
                r = mid - 1;
            }

            else if ((int) count < A)
                l = mid + 1;

            else
                r = mid - 1;
        }

        return (int) (ans % mod);
    }
}
