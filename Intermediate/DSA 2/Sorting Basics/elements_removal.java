import java.util.Arrays;

public class elements_removal {

    public int solve(int[] A) {

        Arrays.sort(A);

        int cost = 0, count = 1;

        for (int i = A.length - 1; i >= 0; i--) {

            cost += (count * A[i]);
            count++;
        }

        return cost;
    }
}
