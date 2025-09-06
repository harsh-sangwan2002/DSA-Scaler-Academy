// TC -> O(N)
// SC -> O(1)

public class SumOfAllSubarrays {

    public long subarraySum(int[] A) {

        int n = A.length;
        long sum = 0L;

        for (int i = 0; i < n; i++) {

            long freq = (i + 1) * 1L * (n - i);
            long contri = A[i] * 1L * freq;
            sum += contri;
        }

        return sum;
    }
}
