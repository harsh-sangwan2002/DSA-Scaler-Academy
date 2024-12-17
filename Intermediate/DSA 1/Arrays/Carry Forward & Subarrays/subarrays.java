public class subarrays {

    public int[] solve(int[] A, int B, int C) {

        int[] res = new int[C - B + 1];
        int idx = 0;

        for (int i = B; i <= C; i++)
            res[idx++] = A[i];

        return res;
    }
}
