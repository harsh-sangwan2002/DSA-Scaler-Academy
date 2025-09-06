// TC -> O(N*M)
// SC -> O(N)
public class RowSum {

    public int[] solve(int[][] A) {

        int idx = 0;
        int[] res = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            int sum = 0;
            for (int j = 0; j < A[0].length; j++)
                sum += A[i][j];

            res[idx++] = sum;
        }

        return res;
    }
}
