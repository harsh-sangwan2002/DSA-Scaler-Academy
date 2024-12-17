import java.util.Arrays;

public class aggressive_cows {

    private int[] findMinMax(int[] stalls) {

        int min = stalls[0], max = stalls[0];

        for (int val : stalls) {

            min = Math.min(min, val);
            max = Math.max(max, val);
        }

        return new int[] { min, max };
    }

    private boolean valid(int[] stalls, int mid, int cows) {

        int last_placed = stalls[0];
        int k = 1;

        for (int i = 1; i < stalls.length; i++) {

            if (stalls[i] - last_placed >= mid) {

                k++;

                if (k == cows)
                    return true;

                last_placed = stalls[i];
            }
        }

        return false;
    }

    public int solve(int[] stalls, int B) {

        Arrays.sort(stalls);

        int[] minMax = findMinMax(stalls);
        int min = minMax[0], max = minMax[1];

        int lo = 1, hi = max - min, ans = hi;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (valid(stalls, mid, B)) {
                ans = mid;
                lo = mid + 1;
            }

            else
                hi = mid - 1;
        }

        return ans;
    }
}
