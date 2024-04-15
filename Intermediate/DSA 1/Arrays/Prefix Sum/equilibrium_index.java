public class equilibrium_index {

    public int solve(int[] A) {

        if (A.length == 1)
            return 0;

        for (int i = 1; i < A.length; i++)
            A[i] += A[i - 1];

        int left = 0, right = 0;

        for (int i = 0; i < A.length; i++) {

            if (i == 0) {
                left = 0;
                right = A[A.length - 1] - A[0];
            }

            else if (i == A.length - 1) {
                left = A[A.length - 2];
                right = 0;
            }

            else {
                left = A[i - 1];
                right = A[A.length - 1] - A[i];
            }

            if (left == right)
                return i;
        }

        return -1;
    }
}
