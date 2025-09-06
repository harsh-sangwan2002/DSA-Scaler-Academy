// TC -> O(N)
// SC -> O(1)

public class EquilibriumIndex {

    public int solve(int[] A) {

        int n = A.length;

        for (int i = 1; i < n; i++)
            A[i] += A[i - 1];

        for (int i = 0; i < n; i++) {

            int left = 0, right = 0;

            if (i == 0)
                right = A[n - 1] - A[0];

            else if (i == n - 1)
                left = A[n - 2];

            else {
                left = A[i - 1];
                right = A[n - 1] - A[i];
            }

            if (left == right)
                return i;
        }

        return -1;
    }
}
