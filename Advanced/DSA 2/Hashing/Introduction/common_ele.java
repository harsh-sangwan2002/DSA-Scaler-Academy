import java.util.ArrayList;
import java.util.HashMap;

public class common_ele {

    // Do not write code to include libraries, main() function or accept any input
    // from the console.
    // Initialization code is already written and hidden from you. Do not write code
    // for it again.
    public int[] solve(int[] A, int[] B) {
        // Just write your code below to complete the function. Required input is
        // available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this
        // function.
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : A)
            map.put(val, map.getOrDefault(val, 0) + 1);

        ArrayList<Integer> list = new ArrayList<>();

        for (int val : B) {

            if (map.getOrDefault(val, 0) > 0) {
                list.add(val);
                map.put(val, map.get(val) - 1);
            }
        }

        int[] res = new int[list.size()];
        int idx = 0;

        for (int val : list)
            res[idx++] = val;

        return res;
    }
}
