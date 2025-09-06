// TC -> O(N)
// SC -> O(1)

public class MajorityElement2 {

    public int repeatedNumber(int[] A) {

        int ans1 = 0, count1 = 0, ans2 = 0, count2 = 0, n = A.length;

        for (int val : A) {

            if (ans1 == val)
                count1++;

            else if (ans2 == val)
                count2++;

            else if (count1 == 0) {
                ans1 = val;
                count1 = 1;
            }

            else if (count2 == 0) {
                ans2 = val;
                count2 = 1;
            }

            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int val : A) {

            if (ans1 == val)
                count1++;

            else if (ans2 == val)
                count2++;
        }

        int k = n / 3;

        if (count1 > k)
            return ans1;
        if (count2 > k)
            return ans2;

        return -1;
    }
}
