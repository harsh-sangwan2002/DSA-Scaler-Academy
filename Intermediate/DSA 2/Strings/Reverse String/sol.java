public class sol {

    public String solve(String A) {

        StringBuilder sb = new StringBuilder("");
        int idx = 0;

        while (idx < A.length()) {

            StringBuilder temp = new StringBuilder("");

            while (idx < A.length() && A.charAt(idx) != ' ') {
                temp.append(A.charAt(idx));
                idx++;
            }

            sb.insert(0, temp);

            if (idx >= A.length())
                return sb.toString();

            sb.insert(0, " ");
            idx++;
        }

        return sb.toString().trim();
    }
}
