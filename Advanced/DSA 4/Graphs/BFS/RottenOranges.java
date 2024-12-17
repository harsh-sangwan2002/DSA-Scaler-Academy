import java.util.ArrayDeque;
import java.util.Queue;

public class RottenOranges {

    private class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int solve(int[][] A) {
        int n = A.length, m = A[0].length;
        Queue<Pair> q = new ArrayDeque<>();
        int[] row = { -1, 0, 1, 0 };
        int[] col = { 0, -1, 0, 1 };

        int[][] times = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] == 2) {
                    times[i][j] = 0;
                    q.add(new Pair(i, j));
                } else {
                    times[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        while (!q.isEmpty()) {
            Pair p = q.remove();

            for (int i = 0; i < row.length; i++) {
                int x = p.x + row[i];
                int y = p.y + col[i];

                if (x >= 0 && y >= 0 && x < n && y < m && A[x][y] == 1) {
                    A[x][y] = 2; // Mark as visited
                    times[x][y] = times[p.x][p.y] + 1;
                    q.add(new Pair(x, y));
                }
            }
        }

        int ans = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] == 1 && times[i][j] == Integer.MAX_VALUE) {
                    return -1;
                } else if (times[i][j] != Integer.MAX_VALUE) {
                    ans = Math.max(ans, times[i][j]);
                }
            }
        }

        return ans;
    }
}
