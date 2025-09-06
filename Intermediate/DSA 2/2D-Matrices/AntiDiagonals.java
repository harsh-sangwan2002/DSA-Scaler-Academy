// TC -> O(N^2)
// SC -> O(N^2)

public class AntiDiagonals {

    public int[][] diagonal(int[][] A) {

        int n = A.length, c = 0;
        int[][] res = new int[2 * n - 1][n];
        int idx = 0;

        while (c < n) {

            int row = 0, col = c;
            int[] temp = new int[n];
            int idx2 = 0;

            while (row < n && col >= 0)
                temp[idx2++] = A[row++][col--];

            res[idx++] = temp;
            c++;
        }

        int r = 1;
        while (r < n) {

            int row = r, col = n - 1;
            int[] temp = new int[n];
            int idx2 = 0;

            while (row < n && col >= 0)
                temp[idx2++] = A[row++][col--];

            res[idx++] = temp;
            r++;
        }

        return res;
    }
}
