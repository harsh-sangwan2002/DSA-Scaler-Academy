public class row_sum {

    public int[] solve(int[][] A) {

        int[] res = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            int sum = 0;
            for (int j = 0; j < A[0].length; j++)
                sum += A[i][j];

            res[i] = sum;
        }

        return res;
    }
}
