public class sum_of_xor {

    private boolean check(int n, int pos) {

        if ((n & (1 << pos)) != 0)
            return true;

        return false;
    }

    public int solve(int[] A) {

        long ans = 0, mod = (long) (1e9 + 7);

        for (int i = 0; i < 32; i++) {

            int one = 0, zero = 0;
            for (int val : A) {

                if (check(val, i))
                    one++;

                else
                    zero++;
            }

            long pairs = (one * 1L * zero) % mod;
            long contri = ((1 << i) * 1L * pairs) % mod;
            ans = (ans + contri) % mod;
        }

        return (int) ans;
    }
}
