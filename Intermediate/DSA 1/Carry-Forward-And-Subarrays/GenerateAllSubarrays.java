// TC -> O(N^3)
// SC -> O(N^2)

public class GenerateAllSubarrays {

    public int[][] solve(int[] A) {

        int n = A.length, idx = 0;
        int[][] res = new int[n * (n + 1) / 2][];

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int[] temp = new int[j - i + 1];

                for (int k = i; k <= j; k++)
                    temp[k - i] = A[k];

                res[idx++] = temp;
            }
        }

        return res;
    }
}
