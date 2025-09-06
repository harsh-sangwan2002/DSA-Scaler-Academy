// TC -> O(N^2) 
// SC -> O(1)

public class SpiralOrderMatrix {

    public int[][] generateMatrix(int A) {

        int[][] mat = new int[A][A];
        int te = A * A, count = 1, minC = 0, minR = 0, maxC = A - 1, maxR = A - 1;

        while (count <= te) {

            // Top boundary
            for (int c = minC; c <= maxC && count <= te; c++)
                mat[minR][c] = count++;
            minR++;

            // Right boundary
            for (int r = minR; r <= maxR && count <= te; r++)
                mat[r][maxC] = count++;
            maxC--;

            // Bottom boundary
            for (int c = maxC; c >= minC && count <= te; c--)
                mat[maxR][c] = count++;
            maxR--;

            // Left boundary
            for (int r = maxR; r >= minR && count <= te; r--)
                mat[r][minC] = count++;
            minC++;
        }

        return mat;
    }
}
