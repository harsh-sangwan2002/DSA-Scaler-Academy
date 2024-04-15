import java.util.Arrays;

public class noble_integer {

    private void reverse(int[] arr) {

        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {

            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;

            lo++;
            hi--;
        }
    }

    public int solve(int[] A) {

        Arrays.sort(A);
        reverse(A);

        int count = 0;

        if (A[0] == 0)
            return 1;

        for (int i = 1; i < A.length; i++) {

            if (A[i] != A[i - 1])
                count = i;

            if (count == A[i])
                return 1;
        }

        return -1;
    }
}
