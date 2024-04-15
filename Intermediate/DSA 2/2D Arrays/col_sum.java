public class col_sum {

    public int[] solve(int[][] A) {

        int[] res = new int[A[0].length];

        for (int j = 0; j < A[0].length; j++) {

            int sum = 0;
            for (int i = 0; i < A.length; i++)
                sum += A[i][j];

            res[j] = sum;
        }

        return res;
    }
}
