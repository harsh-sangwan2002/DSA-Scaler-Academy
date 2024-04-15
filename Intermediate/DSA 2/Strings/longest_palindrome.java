public class longest_palindrome {

    public String longestPalindrome(String A) {

        StringBuilder sb = new StringBuilder();
        int st = 0, len = 1;

        // odd length palindrome
        for (int c = 0; c < A.length(); c++) {

            int i = c - 1;
            int j = c + 1;

            while (i >= 0 && j < A.length()) {

                if (A.charAt(i) != A.charAt(j))
                    break;

                i--;
                j++;
            }

            int curr = j - i - 1;

            if (curr > len) {
                len = curr;
                st = i + 1;
            }
        }

        // even length palindrome
        for (int c = 0; c < A.length(); c++) {

            int i = c;
            int j = c + 1;

            while (i >= 0 && j < A.length()) {

                if (A.charAt(i) != A.charAt(j))
                    break;

                i--;
                j++;
            }

            int curr = j - i - 1;

            if (curr > len) {
                len = curr;
                st = i + 1;
            }
        }

        for (int i = st; i < st + len; i++)
            sb.append(A.charAt(i));

        return sb.toString();
    }
}
