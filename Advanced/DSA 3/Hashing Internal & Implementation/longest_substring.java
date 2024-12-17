import java.util.HashSet;
import java.util.Set;

public class longest_substring {

    public int lengthOfLongestSubstring(String A) {

        int max = 1;
        int i = 0, j = 0;
        Set<Character> set = new HashSet<>();

        while (j < A.length()) {

            char ch = A.charAt(j);
            if (!set.contains(ch)) {
                max = Math.max(max, j - i + 1);
                set.add(ch);
                j++;
            }

            else {

                while (i < A.length() && set.contains(ch)) {
                    set.remove(A.charAt(i));
                    i++;
                }

                max = Math.max(max, j - i + 1);
            }
        }

        return max;
    }
}
