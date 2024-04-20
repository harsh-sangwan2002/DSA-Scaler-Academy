public class rotated_sorted_array {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int search(final int[] A, int B) {

        int lo = 0, hi = A.length - 1, ans = -1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (A[mid] == B)
                return mid;

            else if (A[lo] < A[mid]) {

                if (B >= A[lo] && B < A[mid])
                    hi = mid - 1;

                else
                    lo = mid + 1;
            }

            else {

                if (B > A[mid] && B <= A[hi])
                    lo = mid + 1;

                else
                    hi = mid - 1;
            }
        }

        return -1;
    }
}
