public class peak_ele {

    public int solve(int[] A) {

        int lo = 0, hi = A.length - 1;

        if (A.length == 1 || A[0] > A[1])
            return A[0];
        if (A[A.length - 1] > A[A.length - 2])
            return A[A.length - 1];

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (A[mid] >= A[mid - 1] && A[mid] >= A[mid + 1])
                return A[mid];

            else if (A[mid - 1] > A[mid])
                hi = mid - 1;

            else
                lo = mid + 1;
        }

        return A[lo];
    }
}
