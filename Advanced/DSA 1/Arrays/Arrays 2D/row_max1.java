public class row_max1 {

    public int solve(int[][] A) {

        int ans = 0, r = 0, c = A.length - 1;

        while (r < A.length) {

            while (c >= 0 && A[r][c] == 1) {

                ans = r;
                c--;
            }

            r++;
        }

        return ans;
    }
}
