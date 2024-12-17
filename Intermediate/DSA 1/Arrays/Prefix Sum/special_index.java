public class special_index {

    public int solve(int[] A) {

        int[] even = new int[A.length];
        int[] odd = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            if (i == 0) {
                even[i] = A[i];
                odd[i] = 0;
            }

            else if (i % 2 == 0) {
                even[i] = even[i - 1] + A[i];
                odd[i] = odd[i - 1];
            }

            else {
                even[i] = even[i - 1];
                odd[i] = odd[i - 1] + A[i];
            }
        }

        int count = 0;

        for (int i = 0; i < A.length; i++) {

            int oddSum = 0, evenSum = 0;

            if (i == 0) {
                evenSum = odd[A.length - 1] - odd[i];
                oddSum = even[A.length - 1] - even[i];
            }

            else {
                evenSum = even[i - 1] + (odd[A.length - 1] - odd[i]);
                oddSum = odd[i - 1] + (even[A.length - 1] - even[i]);
            }

            if (evenSum == oddSum)
                count++;
        }

        return count;
    }
}
