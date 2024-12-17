import java.util.HashMap;

public class count_subarray_zero {

    public int solve(int[] A) {

        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);
        long[] pre = new long[A.length];
        long mod = (long) (1e9 + 7);
        long count = 0;

        for (int i = 0; i < A.length; i++) {

            if (i == 0)
                pre[i] = (long) A[i];

            else
                pre[i] = pre[i - 1] + A[i];
        }

        for (long val : pre) {

            if (map.containsKey(val)) {

                count = (count + map.get(val)) % mod;
                map.put(val, map.get(val) + 1);
            }

            else
                map.put(val, 1);
        }

        return (int) count;
    }
}
