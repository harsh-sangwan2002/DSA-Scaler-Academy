import java.util.Stack;

public class sort_stack {

    public int[] solve(int[] A) {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        for (int val : A)
            st.push(val);

        while (st.size() != 0) {

            if (helper.size() == 0)
                helper.push(st.pop());

            else {

                int val = st.pop();

                while (helper.size() != 0 && helper.peek() < val)
                    st.push(helper.pop());

                helper.push(val);
            }
        }

        int idx = 0;

        while (helper.size() != 0)
            A[idx++] = helper.pop();

        return A;
    }
}
