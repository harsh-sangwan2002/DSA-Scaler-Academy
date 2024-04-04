import java.util.Stack;

public class evaluate_postfix {

    public int evalRPN(String[] A) {

        Stack<String> st = new Stack<>();

        for (String str : A) {

            if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {

                int val1 = Integer.parseInt(st.pop());
                int val2 = Integer.parseInt(st.pop());
                int val = operation(val1, val2, str);
                st.push(val + "");
            }

            else
                st.push(str);
        }

        int res = Integer.parseInt(st.pop());
        return res;
    }

    private int operation(int val1, int val2, String str) {

        if (str.equals("+"))
            return val1 + val2;

        else if (str.equals("*"))
            return val1 * val2;

        else if (str.equals("-"))
            return val2 - val1;

        else
            return val2 / val1;
    }
}
