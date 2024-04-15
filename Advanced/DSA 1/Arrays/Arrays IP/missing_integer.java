public class missing_integer {

    public int firstMissingPositive(int[] A) {

        for (int i = 0; i < A.length; i++) {

            if (A[i] <= 0)
                A[i] = A.length + 2;
        }

        for (int i = 0; i < A.length; i++) {

            int idx = Math.abs(A[i]) - 1;

            if (idx >= 0 && idx < A.length) {

                if (A[idx] > 0)
                    A[idx] *= -1;
            }
        }

        for (int i = 0; i < A.length; i++) {

            if (A[i] > 0)
                return i + 1;
        }

        return A.length + 1;
    }
}
