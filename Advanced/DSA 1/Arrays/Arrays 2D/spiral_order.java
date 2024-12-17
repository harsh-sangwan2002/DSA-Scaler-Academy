public class spiral_order {

    public int[][] generateMatrix(int A) {

        int[][] res = new int[A][A];
        int minR = 0, minC = 0, maxR = A - 1, maxC = A - 1;
        int count = 1, ne = A * A;

        while (count <= ne) {

            // top wall
            for (int c = minC; c <= maxC && count <= ne; c++) {
                res[minR][c] = count;
                count++;
            }
            minR++;

            // right wall
            for (int r = minR; r <= maxR && count <= ne; r++) {
                res[r][maxC] = count;
                count++;
            }
            maxC--;

            // bottom wall
            for (int c = maxC; c >= minC && count <= ne; c--) {
                res[maxR][c] = count;
                count++;
            }
            maxR--;

            // left wall
            for (int r = maxR; r >= minR && count <= ne; r--) {
                res[r][minC] = count;
                count++;
            }
            minC++;
        }

        return res;
    }
}
