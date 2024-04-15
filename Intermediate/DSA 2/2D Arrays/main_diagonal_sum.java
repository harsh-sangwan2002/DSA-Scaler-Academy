public class main_diagonal_sum {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {

        int sum = 0, r = 0;

        while (r < A.length) {

            sum += A[r][r];
            r++;
        }

        return sum;
    }
}
