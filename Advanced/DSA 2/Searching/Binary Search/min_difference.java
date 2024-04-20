import java.util.Arrays;

public class min_difference {

    public int solve(int A, int B, int[][] C) {
        // Sort each row of the matrix C
        for (int i = 0; i < C.length; i++) {
            Arrays.sort(C[i]);
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < A - 1; i++) {
            for (int j = 0; j < B; j++) {
                int target = C[i][j];
                int lowerBound = findLowerBound(C[i + 1], target);
                int upperBound = findUpperBound(C[i + 1], target);

                ans = Math.min(ans, Math.abs(target - lowerBound));
                ans = Math.min(ans, Math.abs(upperBound - target));
            }
        }

        return ans;
    }

    // Helper method to find the lower bound of target in a sorted array arr
    private int findLowerBound(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1, result = Integer.MIN_VALUE;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] >= target) {
                result = arr[mid];
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return result;
    }

    // Helper method to find the upper bound of target in a sorted array arr
    private int findUpperBound(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1, result = Integer.MAX_VALUE;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] <= target) {
                result = arr[mid];
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return result;
    }
}
