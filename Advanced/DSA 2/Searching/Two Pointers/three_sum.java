import java.util.Arrays;

public class three_sum {

    public int threeSumClosest(int[] A, int B) {

        Arrays.sort(A);
        int diff = Integer.MAX_VALUE, ans = -1;

        for (int i = 0; i < A.length - 2; i++) {

            int j = i + 1, k = A.length - 1;

            while (j < k) {

                if (Math.abs(A[i] + A[j] + A[k] - B) < diff) {
                    diff = Math.abs(A[i] + A[j] + A[k] - B);
                    ans = A[i] + A[j] + A[k];
                }

                else if (A[i] + A[j] + A[k] > B)
                    k--;

                else
                    j++;
            }
        }

        return ans;
    }
}
