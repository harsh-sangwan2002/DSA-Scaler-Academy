public class sol2 {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {

        int ans = 0, count = 0;

        for (int val : A) {

            if (val == ans)
                count++;

            else {

                if (count == 0) {
                    ans = val;
                    count = 1;
                }

                else
                    count--;
            }
        }

        return ans;
    }
}
