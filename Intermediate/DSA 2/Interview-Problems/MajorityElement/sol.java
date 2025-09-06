package MajorityElement;

import java.util.Arrays;

// TC -> O(N*log(N))
// SC -> O(1)
public class sol {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {

        Arrays.sort(A);
        return A[A.length / 2];
    }
}
