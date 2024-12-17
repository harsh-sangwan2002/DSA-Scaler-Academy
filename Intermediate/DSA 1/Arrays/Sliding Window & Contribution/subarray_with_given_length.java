public class subarray_with_given_length {

    public int solve(int[] A, int B, int C) {

        int sum = 0;

        for (int i = 0; i < B; i++)
            sum += A[i];

        if (sum == C)
            return 1;

        for (int i = B; i < A.length; i++) {

            int prev = A[i - B];
            sum = sum - prev + A[i];

            if (sum == C)
                return 1;
        }

        return 0;
    }
}
