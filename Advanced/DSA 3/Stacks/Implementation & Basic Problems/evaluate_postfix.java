import java.util.Stack;

public class evaluate_postfix {

    private int operation(int v1, int v2, String str) {

        if (str.equals("+"))
            return v1 + v2;

        else if (str.equals("-"))
            return v1 - v2;

        else if (str.equals("*"))
            return v1 * v2;

        else
            return v1 / v2;
    }

    public int evalRPN(String[] A) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < A.length; i++) {

            String str = A[i];

            if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {

                int v2 = st.pop();
                int v1 = st.pop();
                st.push(operation(v1, v2, str));
            }

            else
                st.push(Integer.parseInt(str));
        }

        return st.pop();
    }
}
