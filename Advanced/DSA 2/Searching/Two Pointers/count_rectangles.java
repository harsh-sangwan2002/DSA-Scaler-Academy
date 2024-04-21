public class count_rectangles {

    public int solve(int[] A, int B) {

        long ans = 0, mod = (long) (1e9 + 7);
        int i = 0, j = A.length - 1;

        while (i <= j) {

            long area = 1L * A[i] * A[j];

            if (i == j) {

                if (area < B)
                    ans = (ans + 1) % mod;

                return (int) ans;
            }

            else if (area < B) {

                long len = ((j - i) * 1L * 2) % mod;
                ans = (ans + len + 1) % mod;
                i++;
            }

            else
                j--;
        }

        return (int) ans;
    }
}
