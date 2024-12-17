import java.util.Arrays;

public class kth_smallest {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {

        Arrays.sort(A);

        return A[B - 1];
    }
}
