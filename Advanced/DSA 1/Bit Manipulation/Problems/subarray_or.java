public class subarray_or {

    private boolean checkBit(int n, int pos) {

        if ((n & (1 << pos)) != 0)
            return true;

        return false;
    }

    public int solve(int[] A) {

        long sum = 0, mod = (long) (1e9 + 7);
        int n = A.length;

        for (int i = 0; i <= 31; i++) {

            int idx = A.length;
            for (int j = A.length - 1; j >= 0; j--) {

                boolean bit = checkBit(A[j], i);

                if (bit)
                    idx = j;

                // Find the contribution of the ith bit in subarray starting with jth index
                long contri = (n - idx) * 1L * (1 << i);
                sum = (sum + contri) % mod;
            }
        }

        return (int) sum;
    }
}
