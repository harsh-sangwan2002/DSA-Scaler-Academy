import java.util.Arrays;

public class pairs_with_diff {

    public int solve(int[] A, int B) {

        Arrays.sort(A);
        int count = 0, i = 0, j = 1;

        while (j < A.length) {

            if (j == i) {
                j++;
                continue;
            }

            int x = A[i], y = A[j];
            int diff = y - x;

            if (diff < B)
                j++;

            else if (diff > B)
                i++;

            else {

                count++;

                while (i < A.length && A[i] == x)
                    i++;
                while (j < A.length && A[j] == y)
                    j++;
            }
        }

        return count;
    }
}
