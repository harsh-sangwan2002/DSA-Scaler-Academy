// TC -> O(N)
// SC -> O(1)

public class MaxOneRow {

    public int solve(int[][] A) {

        int n = A.length, r = 0, c = n - 1, ans = r;

        while (r >= 0 && r < n && c >= 0 && c < n) {

            while (c >= 0 && A[r][c] == 1) {
                ans = r;
                c--;
            }

            r++;
        }

        return ans;
    }
}
