import java.util.ArrayList;
import java.util.Collections;

public class b_closest {

    private int distance(int x, int y) {

        int res = x * x + y * y;
        return res;
    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        Collections.sort(A, (ArrayList<Integer> l1, ArrayList<Integer> l2) -> {

            return distance(l1.get(0), l1.get(1)) - distance(l2.get(0), l2.get(1));
        });

        for (int i = 0; i < B; i++)
            res.add(A.get(i));

        return res;
    }
}
