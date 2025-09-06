// TC -> O(N)
// SC -> O(1)

public class MaxContiguousSum {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {

        int maxSum = Integer.MIN_VALUE, currSum = 0;

        for (int val : A) {
            currSum += val;
            maxSum = Math.max(maxSum, currSum);

            if (currSum < 0)
                currSum = 0;
        }

        return maxSum;
    }
}
