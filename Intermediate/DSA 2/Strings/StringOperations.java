// TC -> O(N)
// SC -> O(N)

public class StringOperations {

    public String solve(String A) {

        StringBuilder sb = new StringBuilder(A);
        sb.append(sb);
        StringBuilder res = new StringBuilder();

        for (char ch : sb.toString().toCharArray()) {

            if (ch >= 'A' && ch <= 'Z')
                continue;

            else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                res.append('#');

            else
                res.append(ch);
        }

        return res.toString();
    }
}
