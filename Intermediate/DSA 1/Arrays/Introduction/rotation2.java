public class rotation2 {

    public int[] solve(int[] A, int B) {

        B = B % A.length;

        for (int k = 1; k <= B; k++) {

            int last = A[A.length - 1];

            for (int i = A.length - 1; i > 0; i--)
                A[i] = A[i - 1];

            A[0] = last;
        }

        return A;
    }
}
