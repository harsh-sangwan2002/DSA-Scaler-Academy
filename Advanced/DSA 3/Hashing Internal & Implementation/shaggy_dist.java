import java.util.HashMap;

public class shaggy_dist {

    public int solve(int[] A) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int dist = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {

            if (!map.containsKey(A[i]))
                map.put(A[i], i);

            else {
                dist = Math.min(dist, i - map.get(A[i]));
                map.put(A[i], i);
            }
        }

        return dist == Integer.MAX_VALUE ? -1 : dist;
    }
}
