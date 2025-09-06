// TC -> O(N)
// SC -> O(1)

public class ArrayRotation {

    private void swap(int[] A, int x, int y) {

        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }

    private void reverse(int[] A, int lo, int hi) {

        while (lo < hi) {

            swap(A, lo, hi);

            lo++;
            hi--;
        }
    }

    public int[] solve(int[] A, int B) {

        B = B % A.length;

        reverse(A, 0, A.length - 1);
        reverse(A, 0, B - 1);
        reverse(A, B, A.length - 1);

        return A;
    }
}
