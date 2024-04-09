import java.util.Stack;

public class largest_histogram {

    public int largestRectangleArea(int[] A) {

        Stack<Integer> st = new Stack<>();
        int[] nsl = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            while (st.size() > 0 && A[st.peek()] >= A[i])
                st.pop();

            if (st.size() == 0)
                nsl[i] = -1;

            else
                nsl[i] = st.peek();

            st.push(i);
        }

        st = new Stack<>();
        int[] nsr = new int[A.length];

        for (int i = A.length - 1; i >= 0; i--) {

            while (st.size() > 0 && A[st.peek()] >= A[i])
                st.pop();

            if (st.size() == 0)
                nsr[i] = A.length;

            else
                nsr[i] = st.peek();

            st.push(i);
        }

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {

            int left = nsl[i], right = nsr[i];
            int area = A[i] * (right - left - 1);
            ans = Math.max(ans, area);
        }

        return ans;
    }
}
