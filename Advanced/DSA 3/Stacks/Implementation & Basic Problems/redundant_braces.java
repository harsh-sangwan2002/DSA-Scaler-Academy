import java.util.Stack;

public class redundant_braces {

    public int braces(String A) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < A.length(); i++) {

            char ch = A.charAt(i);

            if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/')
                st.push(ch);

            else if (ch == ')') {

                if (st.size() > 0 && st.peek() == '(')
                    return 1;

                while (st.size() > 0 && st.peek() != '(')
                    st.pop();

                st.pop();
            }
        }

        return 0;
    }
}
