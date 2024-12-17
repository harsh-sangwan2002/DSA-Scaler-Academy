import java.util.Arrays;

public class arithmetic_progression {

    public int solve(int[] A) {

        Arrays.sort(A);

        int d = A[1] - A[0];

        for (int i = 2; i < A.length; i++) {

            int curr = A[i] - A[i - 1];

            if (curr != d)
                return 0;
        }

        return 1;
    }
}
