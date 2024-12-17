import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reverse_elements {

    public int[] solve(int[] A, int B) {

        if (B == 1)
            return A;

        Queue<Integer> q = new ArrayDeque<>();
        Stack<Integer> st = new Stack<>();
        int idx = 0;

        for (int val : A)
            q.add(val);

        for (int i = 0; i < B; i++)
            st.push(q.remove());

        while (st.size() != 0)
            A[idx++] = st.pop();

        while (q.size() != 0)
            A[idx++] = q.remove();

        return A;
    }
}
