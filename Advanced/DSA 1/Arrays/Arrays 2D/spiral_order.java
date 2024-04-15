public class spiral_order {

    public int[][] generateMatrix(int A) {

        int minR = 0, minC = 0, maxR = A - 1, maxC = A - 1;
        int ne = A * A, count = 0;
        int[][] mat = new int[A][A];

        while (count < ne) {

            // top wall
            for (int c = minC; c <= maxC && count < ne; c++) {
                mat[minR][c] = count + 1;
                count++;
            }
            minR++;

            // right wall
            for (int r = minR; r <= maxR && count < ne; r++) {
                mat[r][maxR] = count + 1;
                count++;
            }
            maxC--;

            // bottom wall
            for (int c = maxC; c >= minC && count < ne; c--) {
                mat[maxR][c] = count + 1;
                count++;
            }
            maxR--;

            // left wall
            for (int r = maxR; r >= minR && count < ne; r--) {
                mat[r][minC] = count + 1;
                count++;
            }
            minC++;
        }

        return mat;
    }
}
