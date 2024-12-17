import java.util.Stack;

public class max_min {

    private int[] leftSmaller(int[] A) {

        int[] res = new int[A.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < A.length; i++) {

            while (st.size() != 0 && A[st.peek()] >= A[i])
                st.pop();

            if (st.size() == 0)
                res[i] = -1;

            else
                res[i] = st.peek();

            st.push(i);
        }

        return res;
    }

    private int[] leftGreater(int[] A) {

        int[] res = new int[A.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < A.length; i++) {

            while (st.size() != 0 && A[st.peek()] <= A[i])
                st.pop();

            if (st.size() == 0)
                res[i] = -1;

            else
                res[i] = st.peek();

            st.push(i);
        }

        return res;
    }

    private int[] rightSmaller(int[] A) {

        int[] res = new int[A.length];
        Stack<Integer> st = new Stack<>();

        for (int i = A.length - 1; i >= 0; i--) {

            while (st.size() != 0 && A[st.peek()] >= A[i])
                st.pop();

            if (st.size() == 0)
                res[i] = A.length;

            else
                res[i] = st.peek();

            st.push(i);
        }

        return res;
    }

    private int[] rightGreater(int[] A) {

        int[] res = new int[A.length];
        Stack<Integer> st = new Stack<>();

        for (int i = A.length - 1; i >= 0; i--) {

            while (st.size() != 0 && A[st.peek()] <= A[i])
                st.pop();

            if (st.size() == 0)
                res[i] = A.length;

            else
                res[i] = st.peek();

            st.push(i);
        }

        return res;
    }

    public int solve(int[] A) {

        long ans = 0, mod = (long) (1e9 + 7);

        int[] nsl = leftSmaller(A);
        int[] nsr = rightSmaller(A);
        int[] ngl = leftGreater(A);
        int[] ngr = rightGreater(A);

        for (int i = 0; i < A.length; i++) {

            long max_count = 1L * (i - ngl[i]) * (ngr[i] - i);
            long min_count = 1L * (i - nsl[i]) * (nsr[i] - i);

            ans = (ans + 1L * A[i] * max_count) % mod;
            ans = (ans + mod) % mod;
            ans = (ans - 1L * A[i] * min_count) % mod;
            ans = (ans + mod) % mod;
        }

        return (int) ans;
    }
}
