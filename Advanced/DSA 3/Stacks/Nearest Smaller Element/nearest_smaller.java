import java.util.Stack;

public class nearest_smaller {

    public int[] prevSmaller(int[] A) {

        int[] res = new int[A.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < A.length; i++) {

            while (st.size() > 0 && st.peek() >= A[i])
                st.pop();

            if (st.size() == 0)
                res[i] = -1;

            else
                res[i] = st.peek();

            st.push(A[i]);
        }

        return res;
    }
}
