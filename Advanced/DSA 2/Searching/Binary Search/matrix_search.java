public class matrix_search {

    public int searchMatrix(int[][] A, int B) {

        int r = 0, c = A[0].length - 1;

        while (r < A.length && c >= 0) {

            if (A[r][c] == B)
                return 1;

            else if (A[r][c] > B)
                c--;

            else
                r++;
        }

        return 0;
    }
}
