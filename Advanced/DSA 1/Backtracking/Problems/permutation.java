public class permutation {

    int[][] arr;
    int idx;

    private int fact(int n) {

        if (n == 0 || n == 1)
            return 1;

        return n * fact(n - 1);
    }

    private void generate(int[] arr, int curr, int[] ans, int[][] res, boolean[] visited) {

        if (curr == arr.length) {

            int[] temp = new int[ans.length];
            int idx2 = 0;

            for (int val : ans)
                temp[idx2++] = val;

            res[idx++] = temp;
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (!visited[i]) {

                ans[curr] = arr[i];
                visited[i] = true;
                generate(arr, curr + 1, ans, res, visited);
                visited[i] = false;
            }
        }

    }

    public int[][] permute(int[] A) {

        arr = new int[fact(A.length)][A.length];
        idx = 0;

        boolean[] visited = new boolean[A.length];

        generate(A, 0, new int[A.length], arr, visited);

        return arr;
    }
}
