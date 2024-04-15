import java.util.HashMap;

public class count_pair_diff {

    public int solve(int[] A, int B) {

        HashMap<Integer, Integer> map = new HashMap<>();
        long mod = (long) (1e9 + 7);
        long count = 0;

        for (int val : A)
            map.put(val, map.getOrDefault(val, 0) + 1);

        for (int val : A) {

            int comp = val - B;
            count = (count + map.getOrDefault(comp, 0)) % mod;
        }

        return (int) count;
    }
}
