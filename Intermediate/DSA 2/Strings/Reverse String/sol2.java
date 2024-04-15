import java.util.Stack;

public class sol2 {

    public String solve(String A) {

        Stack<StringBuilder> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        while (idx < A.length()) {

            StringBuilder temp = new StringBuilder();
            while (idx < A.length() && A.charAt(idx) != ' ') {
                temp.append(A.charAt(idx));
                idx++;
            }

            if (idx < A.length())
                st.push(new StringBuilder(" " + temp));

            else
                st.push(new StringBuilder(temp));

            idx++;
        }

        while (st.size() != 0) {

            sb.append(st.pop());
        }

        return sb.toString().trim();
    }
}
