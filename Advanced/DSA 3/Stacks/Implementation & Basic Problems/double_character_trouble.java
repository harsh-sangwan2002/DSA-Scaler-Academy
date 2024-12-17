import java.util.Stack;

public class double_character_trouble {

    public String solve(String A) {

        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = A.length() - 1; i >= 0; i--) {

            char ch = A.charAt(i);

            if (st.size() == 0 || st.peek() != ch)
                st.push(ch);

            else
                st.pop();
        }

        while (st.size() != 0)
            sb.append(st.pop());

        return sb.toString();
    }
}
