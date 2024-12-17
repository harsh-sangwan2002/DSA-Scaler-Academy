public class anti_diagonals {

    public int[][] diagonal(int[][] A) {

        int n = A.length, m = n;
        int[][] res = new int[n + m - 1][m];
        int idx = 0;

        int col = 0;

        while (col < n) {

            int r = 0, c = col;
            int[] temp = new int[n];
            int idx2 = 0;

            while (r < n && c >= 0) {
                temp[idx2++] = A[r][c];
                r++;
                c--;
            }

            res[idx++] = temp;
            col++;
        }

        int row = 1;
        while (row < n) {

            int r = row, c = m - 1;
            int[] temp = new int[n];
            int idx2 = 0;

            while (r < n && c >= 0) {
                temp[idx2++] = A[r][c];
                r++;
                c--;
            }

            res[idx++] = temp;
            row++;
        }

        return res;
    }
}
