import java.util.ArrayList;
import java.util.Collections;

public class b_closest_points {

    private int dist(int x, int y) {

        return x * x + y * y;
    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {

        Collections.sort(A, (l1, l2) -> {

            return dist(l1.get(0), l1.get(1)) - dist(l2.get(0), l2.get(1));
        });

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < B; i++) {

            int v1 = A.get(i).get(0);
            int v2 = A.get(i).get(1);

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(v1);
            temp.add(v2);
            list.add(temp);
        }

        return list;
    }
}
