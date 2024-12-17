import java.util.HashMap;

public class freq_of_ele {

    public int[] solve(int[] A, int[] B) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : A)
            map.put(val, map.getOrDefault(val, 0) + 1);

        for (int i = 0; i < B.length; i++)
            B[i] = map.getOrDefault(B[i], 0);

        return B;
    }
}
