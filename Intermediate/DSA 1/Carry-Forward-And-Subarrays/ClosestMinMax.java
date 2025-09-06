// TC -> O(N)
// SC -> O(1)

public class ClosestMinMax {

    private int[] findMinMax(int[] A) {

        int min = A[0], max = A[0];

        for (int val : A) {
            min = Math.min(min, val);
            max = Math.max(max, val);
        }

        return new int[] { min, max };
    }

    public int solve(int[] A) {

        int[] minMax = findMinMax(A);
        int min = minMax[0], max = minMax[1], n = A.length;

        if (min == max)
            return 1;

        int last_min_idx = -1, last_max_idx = -1, res = n;

        for (int i = 0; i < n; i++) {

            int val = A[i];

            if (val == min) {

                if (last_max_idx != -1)
                    res = Math.min(res, i - last_max_idx + 1);

                last_min_idx = i;
            }

            else if (val == max) {

                if (last_min_idx != -1)
                    res = Math.min(res, i - last_min_idx + 1);

                last_max_idx = i;
            }
        }

        return res;
    }
}
