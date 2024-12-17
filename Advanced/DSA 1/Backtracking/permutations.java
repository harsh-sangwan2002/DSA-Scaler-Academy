public class permutations {

    private int[][] res;
    private int idx1;
    private boolean[] visited;

    private int fact(int n) {

        if (n == 0 || n == 1)
            return 1;

        return fact(n - 1) * n;
    }

    private void solve(int[] arr, int[] ans, int idx2) {

        if (idx2 == arr.length) {

            int[] temp = new int[ans.length];
            int curr = 0;

            for (int val : ans)
                temp[curr++] = val;

            res[idx1++] = temp;
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (!visited[i]) {

                ans[idx2] = arr[i];
                visited[i] = true;
                solve(arr, ans, idx2 + 1);
                visited[i] = false;
            }
        }
    }

    public int[][] permute(int[] A) {

        int n = A.length;

        res = new int[fact(n)][n];
        idx1 = 0;
        visited = new boolean[A.length];

        solve(A, new int[A.length], 0);

        return res;
    }
}
