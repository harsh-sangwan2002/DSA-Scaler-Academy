// TC -> O(N)
// SC -> O(1)

public class SubarrayWithLeastAvg {

    public int solve(int[] A, int B) {

        int n = A.length, sum = 0;

        for (int i = 0; i < B; i++)
            sum += A[i];

        int min = sum, res = 0;

        for (int i = B; i < n; i++) {

            sum -= A[i - B];
            sum += A[i];

            if (sum < min) {
                min = sum;
                res = i - B + 1;
            }
        }

        return res;
    }
}
