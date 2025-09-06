// TC -> O(N*log(N))
// SC -> O(1)

import java.util.Arrays;

public class ElementsRemoval {

    public int solve(int[] A) {

        int cost = 0, count = 1, n = A.length;
        Arrays.sort(A);

        for (int i = n - 1; i >= 0; i--) {
            cost += A[i] * count;
            count++;
        }

        return cost;
    }
}
