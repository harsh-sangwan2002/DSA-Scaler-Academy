import java.util.HashMap;

public class longest_fibonacci {

    public int solve(int[] A) {

        int n = A.length;
        int maxLength = 0;
        HashMap<Integer, Integer> index = new HashMap<>();

        // Populate the index map with the indices of each element
        for (int i = 0; i < n; i++) {
            index.put(A[i], i);
        }

        // Create a dp array to store lengths of Fibonacci-like subsequences
        int[][] dp = new int[n][n];

        // Iterate over all pairs (i, j) where 0 <= i < j < n
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Check if there exists an element A[k] such that A[k] + A[i] = A[j]
                int k = index.getOrDefault(A[j] - A[i], -1);
                if (k >= 0 && k < i) {
                    dp[i][j] = dp[k][i] + 1;
                    maxLength = Math.max(maxLength, dp[i][j] + 2);
                }
            }
        }

        // If the maximum length found is less than 3, return 0 as no valid subsequence
        // exists
        return maxLength >= 3 ? maxLength : 0;
    }
}
