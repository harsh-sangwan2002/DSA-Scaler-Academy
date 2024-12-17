public class sol2 {

    public int solve(String A, String B) {

        char[] freq = new char[26];

        for (int i = 0; i < A.length(); i++) {

            char ch = A.charAt(i);

            freq[ch - 'a']++;
        }

        for (int i = 0; i < B.length(); i++) {

            char ch = B.charAt(i);

            if (freq[ch - 'a'] > 0)
                freq[ch - 'a']--;

            else
                return 0;
        }

        return 1;
    }
}
