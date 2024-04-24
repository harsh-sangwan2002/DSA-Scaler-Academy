import java.util.Arrays;

public class elements_removal {

    public int solve(int[] A) {

        Arrays.sort(A);

        int count = 1;
        int cost = 0;

        for (int i = A.length - 1; i >= 0; i--) {

            cost += count * A[i];
            count++;
        }

        return cost;
    }
}
