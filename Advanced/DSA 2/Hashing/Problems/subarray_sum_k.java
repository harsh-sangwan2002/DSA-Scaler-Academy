import java.util.HashMap;

public class subarray_sum_k {

    public int solve(int[] A, int B) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;

        for (int i = 1; i < A.length; i++)
            A[i] += A[i - 1];

        for (int val : A) {

            int comp = val - B;

            if (map.containsKey(comp)) {
                count += map.get(comp);
            }

            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        return count;
    }
}
