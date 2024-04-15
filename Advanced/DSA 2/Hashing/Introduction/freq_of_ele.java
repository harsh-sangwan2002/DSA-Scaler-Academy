import java.util.HashMap;

public class freq_of_ele {

    public int[] solve(int[] A, int[] B) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : A)
            map.put(val, map.getOrDefault(val, 0) + 1);

        int[] res = new int[B.length];
        int idx = 0;

        for (int val : B)
            res[idx++] = map.getOrDefault(val, 0);

        return res;
    }
}
