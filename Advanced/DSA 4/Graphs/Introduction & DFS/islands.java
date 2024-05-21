public class islands {

    int[] row = { -1, 0, 1, 0, -1, 1, -1, 1 };
    int[] col = { 0, -1, 0, 1, -1, 1, 1, -1 };

    private void dfs(int[][] mat, int i, int j) {

        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || mat[i][j] == 0 || mat[i][j] == 2)
            return;

        mat[i][j] = 2;

        for (int l = 0; l < row.length; l++) {

            int x = row[l], y = col[l];
            dfs(mat, i + x, j + y);
        }
    }

    public int solve(int[][] A) {

        int islands = 0, n = A.length, m = A[0].length;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (A[i][j] == 1) {

                    islands++;
                    dfs(A, i, j);
                }
            }
        }

        return islands;
    }
}
