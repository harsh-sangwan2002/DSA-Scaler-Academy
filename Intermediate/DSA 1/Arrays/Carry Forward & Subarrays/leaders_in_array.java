public class leaders_in_array {

    public int[] solve(int[] A) {

        int[] max = new int[A.length];
        int count = 0;

        for (int i = A.length - 1; i >= 0; i--) {

            if (i == A.length - 1) {
                count++;
                max[i] = A[i];
            }

            else {

                if (A[i] > max[i + 1])
                    count++;

                max[i] = Math.max(A[i], max[i + 1]);
            }
        }

        int[] res = new int[count];
        int idx = 0;

        for (int i = 0; i < A.length; i++) {

            if (i == A.length - 1)
                res[idx++] = A[i];

            else if (A[i] > max[i + 1])
                res[idx++] = A[i];
        }

        return res;
    }
}
