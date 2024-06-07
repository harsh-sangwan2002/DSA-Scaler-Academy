import java.util.LinkedList;
import java.util.Queue;

public class ShortestDist {

    class Cell {
        int x;
        int y;
        int dir; // 0=reight, 1=down, 2=left, 3=up

        Cell(int x, int y, int dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }
    }

    int ans = -1;
    boolean[][][] visited;

    public int solve(int[][] A, int[] B, int[] C) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 1)
                    A[i][j] = -1;
            }
        }
        visited = new boolean[A.length][A[0].length][4]; // you can visit each cell from all 4 directions.
        Queue<Cell> queue = new LinkedList<>();
        A[B[0]][B[1]] = 1;
        for (int i = 0; i < 4; i++) {
            visited[B[0]][B[1]][i] = true;
            queue.add(new Cell(B[0], B[1], i));
        }

        while (!queue.isEmpty()) {
            Cell cell = queue.poll();
            addCell(cell, queue, A, 1, C);
            if (ans != -1)
                return ans;
        }
        return ans;
    }

    private void addCell(Cell cell, Queue<Cell> queue, int[][] A, int count, int[] C) {
        if (count == 3)
            return; // base case to prevent infinite recursion for corners or when surrounded by
                    // multiple walls
        int[] x = new int[] { 0, 1, 0, -1 };
        int[] y = new int[] { 1, 0, -1, 0 };

        int a = cell.x + x[cell.dir];
        int b = cell.y + y[cell.dir];
        if (validCell(a, b, A)) {
            if (!visited[a][b][cell.dir]) {
                visited[a][b][cell.dir] = true;
                A[a][b] = A[cell.x][cell.y] + 1;
                queue.add(new Cell(a, b, cell.dir));
            }
        } else if (cell.x == C[0] && cell.y == C[1])
            ans = A[cell.x][cell.y] - 1; // found direction for which cell after destination, is a wall, and hence we
                                         // can stop
        else {
            for (int i = 0; i < 3; i++) { // change direction on reaching a wall
                cell.dir = (cell.dir + 1) % 4;
                addCell(new Cell(cell.x, cell.y, cell.dir), queue, A, count + 1, C);
            }
        }
    }

    private boolean validCell(int x, int y, int[][] A) {
        return x >= 0 && x < A.length && y >= 0 && y < A[0].length && A[x][y] != -1;
    }
}