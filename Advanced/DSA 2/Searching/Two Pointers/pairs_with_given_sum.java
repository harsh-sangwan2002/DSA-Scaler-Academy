public class pairs_with_given_sum {

    public int solve(int[] A, int B) {

        long ans = 0, mod = (long) (1e9 + 7);

        int lo = 0, hi = A.length - 1;

        while (lo < hi) {

            int sum = A[lo] + A[hi];

            if (sum > B)
                hi--;

            else if (sum < B)
                lo++;

            else {

                if (A[lo] == A[hi]) {

                    int len = hi - lo + 1;
                    long count = 1L * len * (len - 1) / 2;
                    ans = (ans + count) % mod;
                    return (int) ans;
                }

                int count1 = 0, count2 = 0, i2 = lo;

                while (A[lo] == A[i2]) {
                    i2++;
                    count1++;
                }

                lo = i2;
                i2 = hi;

                while (A[hi] == A[i2]) {
                    i2--;
                    count2++;
                }

                hi = i2;
                ans = (ans + count1 * count2) % mod;
            }
        }

        return (int) ans;
    }
}
