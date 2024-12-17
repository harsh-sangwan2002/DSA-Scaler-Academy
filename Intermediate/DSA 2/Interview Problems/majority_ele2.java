public class majority_ele2 {

    public int repeatedNumber(int[] A) {

        int count1 = 0, count2 = 0, ans1 = 0, ans2 = 0;

        for (int val : A) {

            if (val == ans1)
                count1++;

            else if (val == ans2)
                count2++;

            else if (count1 == 0 || count2 == 0) {

                if (count1 == 0) {
                    ans1 = val;
                    count1 = 1;
                }

                else {
                    ans2 = val;
                    count2 = 1;
                }
            }

            else {

                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int val : A) {

            if (val == ans1)
                count1++;

            else if (val == ans2)
                count2++;
        }

        int k = A.length / 3;

        if (count1 > k)
            return ans1;

        else if (count2 > k)
            return ans2;

        return -1;
    }
}
