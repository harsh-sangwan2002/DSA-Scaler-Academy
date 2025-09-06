// TC -> O(N)
// SC -> O(N)

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] A) {

        String prefix = A[0];

        for (String str : A) {

            while (str.indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);

            if (prefix == "")
                return "";
        }

        return prefix;
    }
}
