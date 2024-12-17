public class ath_magical_no {

    static long mod = (long) (1e9 + 7);

    private long GCD(int a, int b) {

        if (a == 0)
            return 1L * b;
        if (b == 0)
            return 1L * a;

        return GCD(b, a % b);
    }

    private long LCM(int a, int b) {

        long gcd = GCD(a, b);
        long lcm = (a * b) / gcd;

        return lcm;
    }

    public int solve(int A, int B, int C) {

        long lo = 1L * Math.min(B, C), hi = lo * A, ans = 1L;
        long lcm = LCM(B, C);

        while (lo <= hi) {

            long mid = lo + (hi - lo) / 2;
            long count = mid / B + mid / C - mid / lcm;

            if (count < A)
                lo = mid + 1;

            else {
                ans = mid;
                hi = mid - 1;
            }
        }

        return (int) (ans % mod);
    }
}
