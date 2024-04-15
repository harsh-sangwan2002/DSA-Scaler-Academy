import java.util.ArrayList;
import java.util.HashMap;

public class count_unique {

    public int solve(int[] A) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : A)
            map.put(val, map.getOrDefault(val, 0) + 1);

        ArrayList<Integer> list = new ArrayList<>();

        for (int val : map.keySet()) {

            if (map.get(val) == 1)
                list.add(val);
        }

        return list.size();
    }
}
