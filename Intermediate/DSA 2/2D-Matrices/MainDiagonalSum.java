// TC -> O(N)
// SC -> O(1)

public class MainDiagonalSum {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {

        int sum = 0, r = 0, c = 0;

        while (r < A.length && c < A.length)
            sum += A[r++][c++];

        return sum;
    }
}
