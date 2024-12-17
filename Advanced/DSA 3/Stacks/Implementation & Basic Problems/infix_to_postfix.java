import java.util.Stack;

public class infix_to_postfix {

    private int precedence(char ch) {

        if (ch == '+' || ch == '-')
            return 0;

        else if (ch == '*' || ch == '/')
            return 1;

        else
            return 2;
    }

    public String solve(String A) {

        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {

            char ch = A.charAt(i);

            if (ch == '(')
                st.push(ch);

            else if (ch == ')') {

                while (st.size() != 0 && st.peek() != '(')
                    sb.append(st.pop());

                st.pop();
            }

            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {

                while (st.size() != 0 && st.peek() != '(' && precedence(st.peek()) >= precedence(ch))
                    sb.append(st.pop());

                st.push(ch);
            }

            else
                sb.append(ch);
        }

        while (st.size() != 0)
            sb.append(st.pop());

        return sb.toString();
    }
}
