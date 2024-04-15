public class reverse_in_range {

    public int[] solve(int[] A, int B, int C) {

        int lo = B, hi = C;

        while (lo <= hi) {

            int temp = A[lo];
            A[lo] = A[hi];
            A[hi] = temp;

            lo++;
            hi--;
        }

        return A;
    }
}
