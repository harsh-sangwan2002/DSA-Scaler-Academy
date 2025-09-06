// TC -> O(N^2)
// SC -> O(1)

public class CountingSubarraysEasy {

    public int solve(int[] A, int B) {

        int n = A.length, count = 0;

        for (int i = 0; i < n; i++) {

            int sum = 0;
            for (int j = i; j < n; j++) {

                sum += A[j];

                if (sum >= B)
                    break;

                count++;
            }
        }

        return count;
    }
}
