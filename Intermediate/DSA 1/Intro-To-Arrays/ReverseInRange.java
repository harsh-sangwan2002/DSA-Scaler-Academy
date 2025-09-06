// TC -> O(N)
// SC -> O(1)

public class ReverseInRange {

    public int[] solve(int[] A, int B, int C) {

        while (B < C) {

            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;

            B++;
            C--;
        }

        return A;
    }
}
