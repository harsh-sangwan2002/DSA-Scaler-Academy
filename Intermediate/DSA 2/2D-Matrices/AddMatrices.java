// TC -> O(N*M)
// SC -> O(1)
public class AddMatrices {

    public int[][] solve(int[][] A, int[][] B) {

        int n = A.length, m = A[0].length;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++)
                A[i][j] += B[i][j];
        }

        return A;
    }
}
