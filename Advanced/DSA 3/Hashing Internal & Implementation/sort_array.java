import java.util.Arrays;
import java.util.HashMap;

public class sort_array {

    public int[] solve(int[] A, int[] B) {

        Arrays.sort(A);
        int[] res = new int[A.length];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : A)
            map.put(val, map.getOrDefault(val, 0) + 1);

        int idx = 0;
        for (int val : B) {

            if (map.containsKey(val)) {

                for (int i = 1; i <= map.get(val); i++)
                    res[idx++] = val;

                map.remove(val);
            }
        }

        for (int i = 0; i < A.length; i++) {

            if (map.containsKey(A[i]))
                res[idx++] = A[i];
        }

        return res;
    }
}
