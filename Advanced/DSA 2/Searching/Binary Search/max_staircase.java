public class max_staircase {

    public int solve(int A) {

        if (A == 0)
            return 0;

        int lo = 1, hi = (int) (1e9), ans = 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if ((long) mid * (mid + 1) / 2 <= A) {
                ans = mid;
                lo = mid + 1;
            }

            else
                hi = mid - 1;
        }

        return ans;
    }
}
