public class sum_of_submatrices {

    public int solve(int[][] A) {

        int sum = 0;

        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A.length; j++) {

                int top_left = (i + 1) * (j + 1);
                int right_bottom = (A.length - i) * (A.length - j);
                int contri = top_left * right_bottom * A[i][j];
                sum += contri;
            }
        }

        return sum;
    }
}
