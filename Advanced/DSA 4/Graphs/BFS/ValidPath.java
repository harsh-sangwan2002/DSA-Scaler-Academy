import java.util.LinkedList;
import java.util.Queue;

public class ValidPath {

    public String solve(int A, int B, int C, int D, int[] E, int[] F) {
        int[][] grid = new int[B + 1][A + 1];
        addCircles(grid, D, E, F, A, B);
        if (grid[B][0] == 2 || grid[0][A] == 2)
            return "NO";

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { B, 0 });
        grid[B][0] = 1;

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            if (cell[0] == 0 && cell[1] == A)
                return "YES";
            addAdj(cell[0], cell[1], grid, queue);
        }
        return "NO";
    }

    private void addCircles(int[][] grid, int radius, int[] E, int[] F, int A, int B) {
        for (int i = 0; i < E.length; i++) {
            int x = E[i];
            int y = B - F[i];
            for (int j = y - radius; j <= y + radius; j++) {
                for (int k = x - radius; k <= x + radius; k++) {
                    if (j >= 0 && j <= B && k >= 0 && k <= A) {
                        int dis = ((j - y) * (j - y)) + ((k - x) * (k - x));
                        if (dis <= radius * radius)
                            grid[j][k] = 2;
                    }
                }
            }
        }
    }

    private void addAdj(int y, int x, int[][] grid, Queue<int[]> queue) {
        int[] yDir = new int[] { 1, 1, 0, -1, -1, -1, 0, 1 };
        int[] xDir = new int[] { 0, 1, 1, 1, 0, -1, -1, -1 };

        for (int i = 0; i < yDir.length; i++) {
            int a = y + yDir[i];
            int b = x + xDir[i];
            if (valid(a, b, grid)) {
                queue.add(new int[] { a, b });
                grid[a][b] = 1;
            }
        }
    }

    private boolean valid(int a, int b, int[][] grid) {
        return a >= 0 && a < grid.length && b >= 0 && b < grid[0].length && grid[a][b] == 0;
    }
}