public class min_swaps {

    public int solve(int[] A, int B) {

        int swaps = 0, count = 0;

        for (int val : A) {

            if (val <= B)
                count++;
        }

        if (count == A.length)
            return 0;

        int bad = 0;
        for (int i = 0; i < count; i++) {

            if (A[i] > B)
                bad++;
        }

        swaps = bad;
        for (int i = count; i < A.length; i++) {

            int prev = A[i - count];
            if (prev > B)
                bad--;

            if (A[i] > B)
                bad++;

            swaps = Math.min(swaps, bad);
        }

        return swaps;
    }
}
