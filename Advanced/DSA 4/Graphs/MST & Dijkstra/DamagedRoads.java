import java.util.Arrays;

public class DamagedRoads {

    public int solve(int[] A, int[] B) {

        Arrays.sort(A); /* sort row wise cost */
        Arrays.sort(B); // sort col wise cost
        int N = A.length, M = B.length, p = (int) 1e9 + 7;
        long ans = 0L;
        int i = 0, j = 0;
        /*
         * since we have to connect each and every cell we
         * can use merge sort kind of algorithm and compare costs whether we are gonna
         * move
         * row wise first or col wise first
         */
        while (i < N && j < M) {
            if (A[i] <= B[j]) {
                ans += A[i] * 1L * (M - j + 1);
                ans %= p;
                i++;
            } else {
                ans += B[j] * 1L * (N - i + 1);
                ans %= p;
                j++;
            }
        }
        while (i < N) {
            ans += A[i++];
        }
        while (j < M)
            ans += B[j++];

        return (int) (ans % p);
    }
}
