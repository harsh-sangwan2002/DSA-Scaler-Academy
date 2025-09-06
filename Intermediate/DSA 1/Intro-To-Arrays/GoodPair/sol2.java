import java.util.HashSet;
import java.util.Set;

// TC -> O(N)
// SC -> O(N)
public class sol2 {

    public int solve(int[] A, int B) {

        Set<Integer> set = new HashSet<>();

        for (int val : A) {

            int comp = B - val;

            if (set.contains(comp))
                return 1;

            set.add(val);
        }

        return 0;
    }
}
