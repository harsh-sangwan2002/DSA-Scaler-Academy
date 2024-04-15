public class anti_diagonals {

    public int[][] diagonal(int[][] A) {

        int n = A.length;
        int[][] res = new int[2 * n - 1][n];
        int idx = 0;

        for (int col = 0; col < n; col++) {

            int r = 0, c = col;
            int[] temp = new int[n];

            while (r < n && c >= 0) {
                temp[r] = A[r][c];
                r++;
                c--;
            }

            res[idx++] = temp;
        }

        for (int row = 1; row < n; row++) {

            int r = row, c = n - 1;
            int[] temp = new int[n];
            int idx2 = 0;

            while (r < n && c >= 0) {
                temp[idx2++] = A[r][c];
                r++;
                c--;
            }

            res[idx++] = temp;
        }

        return res;
    }
}
