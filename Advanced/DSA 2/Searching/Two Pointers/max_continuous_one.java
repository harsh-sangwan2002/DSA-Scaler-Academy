public class max_continuous_one {

    public int[] maxone(int[] A, int B) {

        int left = 0; // Left pointer of the window
        int zeroCount = 0; // Count of zeroes in the current window
        int maxOnesCount = 0; // Maximum count of ones in a window
        int startIdx = 0; // Start index of the window with maximum ones

        for (int right = 0; right < A.length; right++) {
            if (A[right] == 0) {
                zeroCount++; // Increment zero count
            }

            // Shrink the window until zero count is <= B
            while (zeroCount > B) {
                if (A[left] == 0) {
                    zeroCount--; // Decrement zero count
                }
                left++; // Shrink the window from the left
            }

            // Update maxOnesCount and startIdx if a longer sequence is found
            int onesCount = right - left + 1; // Count of ones in the current window
            if (onesCount > maxOnesCount) {
                maxOnesCount = onesCount;
                startIdx = left;
            }
        }

        // Create and return the result array
        int[] result = new int[maxOnesCount];
        for (int i = 0; i < maxOnesCount; i++) {
            result[i] = startIdx + i;
        }

        return result;
    }
}
