public class search_in_matrix {

    public int solve(int[][] A, int B) {

        int r = 0, c = A[0].length - 1, ans = Integer.MAX_VALUE;

        while (r < A.length && c >= 0) {

            if (A[r][c] == B) {

                int curr = (r + 1) * 1009 + (c + 1);
                if (curr < ans)
                    ans = curr;

                c--;
            }

            else if (A[r][c] > B)
                c--;

            else
                r++;
        }

        if (ans == Integer.MAX_VALUE)
            return -1;

        return ans;
    }
}
