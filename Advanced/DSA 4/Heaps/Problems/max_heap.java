import java.util.ArrayList;
import java.util.Collections;

public class max_heap {

    public int solve(int A) {

        int mod = 1000000007;

        ArrayList<ArrayList<Integer>> ncr = new ArrayList<>();
        for (int i = 0; i <= A; ++i) {
            ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(A + 1, 0));
            ncr.add(row);
        }

        for (int i = 0; i <= A; ++i) {
            ncr.get(i).set(0, 1);
            ncr.get(i).set(i, 1);
            for (int j = 1; j < i; ++j) {
                ncr.get(i).set(j, (ncr.get(i - 1).get(j) + ncr.get(i - 1).get(j - 1)) % mod);
            }
        }

        ArrayList<Long> dp = new ArrayList<>(Collections.nCopies(A + 1, 1L));

        int left = 0, right = 0, next = 1;
        for (int i = 2; i <= A; ++i) {
            if (left < next) {
                left++;
            } else if (left == right) {
                next = 2 * left + 1;
                left++;
            } else {
                right++;
            }
            dp.set(i, (ncr.get(i - 1).get(left) * (dp.get(left) * dp.get(i - 1 - left) % mod) % mod));
        }

        return dp.get(A).intValue();
    }
}
