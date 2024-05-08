import java.util.Arrays;

public class assign_mice {

    public int mice(int[] A, int[] B) {

        Arrays.sort(B);
        Arrays.sort(A);
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            ans = Math.max(ans, Math.abs(A[i] - B[i]));
        }
        return ans;
    }
}
