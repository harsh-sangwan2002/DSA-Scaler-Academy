public class max_min {

    public int solve(int[] A) {

        int max = A[0], min = A[0];

        for (int val : A) {

            max = Math.max(max, val);
            min = Math.min(min, val);
        }

        return max + min;
    }
}
