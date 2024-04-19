public class merge_two_arrays {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A, final int[] B) {

        int n = A.length, m = B.length, i = 0, j = 0, k = 0;
        int[] res = new int[n + m];

        while (i < n && j < m) {

            if (A[i] < B[j]) {
                res[k++] = A[i];
                i++;
            }

            else {
                res[k++] = B[j];
                j++;
            }
        }

        while (i < n) {
            res[k++] = A[i];
            i++;
        }

        while (j < m) {
            res[k++] = B[j];
            j++;
        }

        return res;
    }
}
