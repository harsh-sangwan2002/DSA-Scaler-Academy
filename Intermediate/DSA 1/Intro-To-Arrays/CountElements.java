// TC -> O(N)
// SC -> O(1)

public class CountElements {

    private int findMax(int[] A) {

        int max = A[0];

        for (int val : A)
            max = Math.max(max, val);

        return max;
    }

    public int solve(int[] A) {

        int max = findMax(A), count = 0;

        for (int val : A) {

            if (val != max)
                count++;
        }

        return count;
    }
}
