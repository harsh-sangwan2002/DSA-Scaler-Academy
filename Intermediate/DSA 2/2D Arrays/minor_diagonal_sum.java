public class minor_diagonal_sum {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {

        int sum = 0, r = 0, c = A.length - 1;

        while (r < A.length && c >= 0) {

            sum += A[r][c];
            r++;
            c--;
        }

        return sum;
    }
}
