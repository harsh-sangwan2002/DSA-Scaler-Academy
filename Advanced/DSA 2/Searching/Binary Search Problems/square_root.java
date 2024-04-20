public class square_root {

    public int sqrt(int A) {

        if (A == 0 || A == 1)
            return A;

        int lo = 1, hi = A, ans = 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (mid <= A / mid) {
                ans = mid;
                lo = mid + 1;
            }

            else
                hi = mid - 1;
        }

        return ans;
    }
}
