import java.util.HashMap;

public class count_pair_sum {

    public int solve(int[] A, int B) {

        HashMap<Integer, Integer> map = new HashMap<>();
        long count = 0L;
        long mod = (long) (1e9 + 7);

        for (int val : A) {

            int comp = B - val;

            if (map.containsKey(comp))
                count = (count + map.get(comp)) % mod;

            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        return (int) count;
    }
}
