public class max_subarray_sum {

    public int maxSubarray(int A, int B, int[] C) {

        int ans = 0;

        for (int i = 0; i < C.length; i++) {

            int sum = 0;
            for (int j = i; j < C.length; j++) {

                sum += C[j];

                if (sum <= B)
                    ans = Math.max(ans, sum);

                else
                    break;
            }
        }

        return ans;
    }
}
