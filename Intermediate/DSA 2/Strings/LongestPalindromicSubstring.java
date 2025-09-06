// TC -> O(N)
// SC -> O(N)

public class LongestPalindromicSubstring {

    public String longestPalindrome(String A) {

        int n = A.length(), ans = 1, st = 0;

        // Odd length substring
        for (int c = 0; c < n; c++) {

            int i = c - 1, j = c + 1;

            while (i >= 0 && j < n && A.charAt(i) == A.charAt(j)) {
                i--;
                j++;
            }

            int len = j - i - 1;
            if (len > ans) {
                ans = len;
                st = i + 1;
            }
        }

        // Even length substring
        for (int c = 0; c < n; c++) {

            int i = c, j = c + 1;

            while (i >= 0 && j < n && A.charAt(i) == A.charAt(j)) {
                i--;
                j++;
            }

            int len = j - i - 1;
            if (len > ans) {
                ans = len;
                st = i + 1;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = st; i < st + ans; i++)
            sb.append(A.charAt(i));

        return sb.toString();
    }
}
