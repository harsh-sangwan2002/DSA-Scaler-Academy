public class square_root {

    public int sqrt(int A) {

        if (A == 0 || A == 1)
            return A;

        long lo = 1, hi = A, ans = 1;

        while (lo <= hi) {

            long mid = lo + (hi - lo) / 2;

            if (mid * mid == A)
                return (int) mid;

            else if (mid * mid < A) {
                ans = mid;
                lo = mid + 1;
            }

            else
                hi = mid - 1;
        }

        return (int) ans;
    }
}
