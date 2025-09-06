// TC -> O(N)
// SC -> O(1)

public class Flip {

    public int[] flip(String A) {

        int n = A.length(), l = 0, r = 0, sum = 0, maxSum = 0;
        int[] res = new int[2];

        for (int i = 0; i < n; i++) {

            char ch = A.charAt(i);

            if (ch == '0')
                sum++;

            else
                sum--;

            if (sum > maxSum) {
                res[0] = l + 1;
                res[1] = r + 1;
                maxSum = sum;
            }

            if (sum < 0) {
                l = i + 1;
                r = i + 1;
                sum = 0;
            }

            else
                r++;
        }

        if (res[0] == 0)
            return new int[] {};

        return res;
    }
}
