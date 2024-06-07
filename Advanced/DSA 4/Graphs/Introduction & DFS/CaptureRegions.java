import java.util.ArrayList;

public class CaptureRegions {

    public void solve(ArrayList<ArrayList<Character>> a) {
        if (a == null || a.size() == 0 || a.get(0).size() == 0) {
            return;
        }

        int n = a.size();
        int m = a.get(0).size();

        // Mark the 'O's connected to the boundary
        for (int i = 0; i < n; i++) {
            if (a.get(i).get(0) == 'O') {
                dfs(a, i, 0);
            }
            if (a.get(i).get(m - 1) == 'O') {
                dfs(a, i, m - 1);
            }
        }

        for (int j = 0; j < m; j++) {
            if (a.get(0).get(j) == 'O') {
                dfs(a, 0, j);
            }
            if (a.get(n - 1).get(j) == 'O') {
                dfs(a, n - 1, j);
            }
        }

        // Flip all remaining 'O's to 'X's and turn temporary markers back to 'O'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a.get(i).get(j) == 'O') {
                    a.get(i).set(j, 'X');
                } else if (a.get(i).get(j) == 'T') {
                    a.get(i).set(j, 'O');
                }
            }
        }
    }

    private void dfs(ArrayList<ArrayList<Character>> a, int i, int j) {
        int n = a.size();
        int m = a.get(0).size();

        if (i < 0 || i >= n || j < 0 || j >= m || a.get(i).get(j) != 'O') {
            return;
        }

        // Temporarily mark this 'O' as 'T'
        a.get(i).set(j, 'T');

        // Explore all four directions
        dfs(a, i + 1, j);
        dfs(a, i - 1, j);
        dfs(a, i, j + 1);
        dfs(a, i, j - 1);
    }
}
