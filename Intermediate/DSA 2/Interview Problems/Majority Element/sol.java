import java.util.Arrays;

public class sol {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {

        Arrays.sort(A);
        return A[A.length / 2];
    }
}
