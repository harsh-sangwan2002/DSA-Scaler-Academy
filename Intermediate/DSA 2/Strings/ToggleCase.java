// TC -> O(N)
// SC -> O(N)

public class ToggleCase {

    public String solve(String A) {

        StringBuilder sb = new StringBuilder();

        for (char ch : A.toCharArray()) {

            if (ch >= 'A' && ch <= 'Z')
                sb.append((char) (ch + 32));

            else
                sb.append((char) (ch - 32));
        }

        return sb.toString();
    }
}
