import java.util.Arrays;

public class min_abs_diff {

    public int solve(int[] A) {

        Arrays.sort(A);
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < A.length; i++) {

            int diff = A[i] - A[i - 1];
            min = Math.min(min, diff);
        }

        return min;
    }
}
