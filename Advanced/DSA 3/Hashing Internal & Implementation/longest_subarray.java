import java.util.HashMap;

public class longest_subarray {

    public int solve(int[] A) {

        int len = 0;
        long[] pre = new long[A.length];
        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {

            if (i == 0)
                pre[i] = (long) A[i];

            else
                pre[i] = pre[i - 1] + A[i];

            if (pre[i] == 0)
                len = Math.max(len, i + 1);
        }

        for (int i = 0; i < pre.length; i++) {

            long val = pre[i];

            if (map.containsKey(val))
                len = Math.max(len, i - map.get(val));

            else
                map.put(val, i);
        }

        return len;
    }
}
