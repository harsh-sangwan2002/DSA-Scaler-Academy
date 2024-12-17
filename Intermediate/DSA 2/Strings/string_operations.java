public class string_operations {

    public String solve(String A) {

        StringBuilder sb = new StringBuilder(A);
        sb.append(sb);

        StringBuilder res = new StringBuilder("");

        for (int i = 0; i < sb.length(); i++) {

            char ch = sb.charAt(i);

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
