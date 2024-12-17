import java.util.HashMap;

public class longest_subarray_zero {

    public int solve(int[] A) {

        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);
        int ans = 0;
        long[] pre = new long[A.length];

        for (int i = 0; i < A.length; i++) {

            if (i == 0)
                pre[i] = (long) A[i];

            else
                pre[i] = pre[i - 1] + A[i];

            if (pre[i] == 0) {
                int len = i + 1;
                ans = Math.max(ans, len);
            }
        }

        for (int i = 0; i < pre.length; i++) {

            long val = pre[i];

            if (map.containsKey(val)) {

                int len = i - map.get(val);
                ans = Math.max(ans, len);
            }

            else {
                map.put(val, i);
            }
        }

        return ans;
    }
}
