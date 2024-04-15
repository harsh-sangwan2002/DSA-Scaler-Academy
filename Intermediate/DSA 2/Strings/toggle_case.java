public class toggle_case {

    public String solve(String A) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {

            char ch = A.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {

                ch = (char) (ch + 32);
                sb.append(ch);
            }

            else {

                ch = (char) (ch - 32);
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
