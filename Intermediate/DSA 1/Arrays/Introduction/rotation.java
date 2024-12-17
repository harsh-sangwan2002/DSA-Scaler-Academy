public class rotation {

    private void reverse(int[] arr, int lo, int hi) {

        while (lo <= hi) {

            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;

            lo++;
            hi--;
        }
    }

    public int[] solve(int[] A, int B) {

        B = B % A.length;

        // Reverse entire array
        reverse(A, 0, A.length - 1);

        // Reverse first B elements
        reverse(A, 0, A.length - B - 1);

        // Reverse the reamaining elements
        reverse(A, A.length - B, A.length - 1);

        return A;
    }
}
