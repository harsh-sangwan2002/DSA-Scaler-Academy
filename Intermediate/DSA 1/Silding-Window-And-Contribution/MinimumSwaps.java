// TC -> O(N)
// SC -> O(1)

public class MinimumSwaps {

    public int solve(int[] A, int B) {

        int n = A.length, size = 0, bad = 0;

        for (int val : A) {

            if (val <= B)
                size++;
        }

        for (int i = 0; i < size; i++) {

            if (A[i] > B)
                bad++;
        }

        int minSwaps = bad;

        for (int i = size; i < n; i++) {

            if (A[i - size] > B)
                bad--;

            if (A[i] > B)
                bad++;

            minSwaps = Math.min(minSwaps, bad);
        }

        return minSwaps;
    }
}
