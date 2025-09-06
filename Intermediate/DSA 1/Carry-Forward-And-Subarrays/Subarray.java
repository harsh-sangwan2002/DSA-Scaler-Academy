// TC -> O(N)
// SC -> O(N)

public class Subarray {

    public int[] solve(int[] A, int B, int C) {

        int[] res = new int[C - B + 1];

        for (int i = B; i <= C; i++)
            res[i - B] = A[i];

        return res;
    }
}
