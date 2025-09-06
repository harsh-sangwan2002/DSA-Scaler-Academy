// TC -> O(N)
// SC -> O(1)

public class MaxSubarrayEasy {

    public int maxSubarray(int A, int B, int[] C) {

        int n = A, maxSum = 0;

        for (int i = 0; i < n; i++) {

            int sum = 0;
            for (int j = i; j < n; j++) {

                sum += C[j];

                if (sum > B)
                    break;

                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}
