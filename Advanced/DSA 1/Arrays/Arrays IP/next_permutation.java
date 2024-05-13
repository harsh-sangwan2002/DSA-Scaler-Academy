public class next_permutation {

    private void reverse(int[] arr, int lo, int hi) {

        while (lo <= hi) {

            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;

            lo++;
            hi--;
        }

    }

    public int[] nextPermutation(int[] A) {

        if (A.length == 1)
            return A;

        int k = A.length - 2;

        while (k >= 0 && A[k] >= A[k + 1])
            k--;

        if (k < 0) {
            reverse(A, 0, A.length - 1);
            return A;
        }

        int idx = A.length - 1;
        while (idx > k && A[idx] <= A[k])
            idx--;

        int temp = A[idx];
        A[idx] = A[k];
        A[k] = temp;

        reverse(A, k + 1, A.length - 1);
        return A;
    }
}
