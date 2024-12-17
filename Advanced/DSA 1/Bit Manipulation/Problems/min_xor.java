import java.util.Arrays;

public class min_xor {

    public int findMinXor(int[] A) {

        Arrays.sort(A);

        int xor = A[0] ^ A[1];

        for (int i = 2; i < A.length; i++) {

            int curr = A[i] ^ A[i - 1];
            xor = Math.min(xor, curr);
        }

        return xor;
    }
}
