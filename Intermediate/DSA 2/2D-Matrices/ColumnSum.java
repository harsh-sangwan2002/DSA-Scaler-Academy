// TC -> O(N*M)
// SC -> O(1)

public class ColumnSum {

    public int[] solve(int[][] A) {

        int[] res = new int[A[0].length];

        for (int i = 0; i < A[0].length; i++) {

            int sum = 0;
            for (int j = 0; j < A.length; j++)
                sum += A[j][i];

            res[i] = sum;
        }

        return res;
    }
}
