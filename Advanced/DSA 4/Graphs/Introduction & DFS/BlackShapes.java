import java.util.ArrayList;

public class BlackShapes {

    public int black(ArrayList<String> A) {
        if (A == null || A.size() == 0) {
            return 0;
        }

        int n = A.size();
        int m = A.get(0).length();
        boolean[][] visited = new boolean[n][m];
        int blackShapesCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A.get(i).charAt(j) == 'X' && !visited[i][j]) {
                    // Found an unvisited 'X', which means a new shape
                    dfs(A, visited, i, j);
                    blackShapesCount++;
                }
            }
        }

        return blackShapesCount;
    }

    private void dfs(ArrayList<String> A, boolean[][] visited, int i, int j) {
        int n = A.size();
        int m = A.get(0).length();

        // Base cases: boundary checks and already visited or not 'X'
        if (i < 0 || i >= n || j < 0 || j >= m || A.get(i).charAt(j) != 'X' || visited[i][j]) {
            return;
        }

        // Mark this cell as visited
        visited[i][j] = true;

        // Explore all four possible directions (not diagonals)
        dfs(A, visited, i + 1, j); // down
        dfs(A, visited, i - 1, j); // up
        dfs(A, visited, i, j + 1); // right
        dfs(A, visited, i, j - 1); // left
    }
}
