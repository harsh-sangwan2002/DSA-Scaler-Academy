import java.util.HashMap;

public class subarray_with_given_sum {

    public int[] solve(int[] A, int B) {

        HashMap<Long, Integer> map = new HashMap<>();
        long[] pre = new long[A.length];
        int st = -1, et = -1;

        for (int i = 0; i < A.length; i++) {

            if (i == 0)
                pre[i] = (long) A[i];

            else
                pre[i] = pre[i - 1] + A[i];

            if (pre[i] == B) {
                st = 0;
                et = i;
                return helper(st, et, A);
            }
        }

        for (int i = 0; i < pre.length; i++) {

            long comp = pre[i] - B;

            if (map.containsKey(comp)) {
                st = map.get(comp) + 1;
                et = i;
                return helper(st, et, A);
            }

            else
                map.put(pre[i], i);
        }

        return new int[] { -1 };
    }

    private int[] helper(int st, int et, int[] arr) {

        int[] res = new int[et - st + 1];
        int idx = 0;

        for (int i = st; i <= et; i++)
            res[idx++] = arr[i];

        return res;
    }
}
