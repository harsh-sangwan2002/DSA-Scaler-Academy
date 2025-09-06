package MajorityElement;

// TC -> O(N)
// SC -> O(1)
public class sol2 {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {

        int count = 0, ans = 0;

        for (int val : A) {

            if (count == 0) {
                ans = val;
                count = 1;
            }

            else {

                if (val == ans)
                    count++;

                else
                    count--;
            }
        }

        return ans;
    }
}
