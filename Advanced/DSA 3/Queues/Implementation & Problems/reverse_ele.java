import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reverse_ele {

    public int[] solve(int[] A, int B) {

        Queue<Integer> q = new ArrayDeque<>();
        Stack<Integer> st = new Stack<>();
        int[] res = new int[A.length];
        int idx = 0;

        for (int val : A)
            q.add(val);

        for (int i = 0; i < B; i++)
            st.push(q.remove());

        while (st.size() != 0)
            res[idx++] = st.pop();

        while (q.size() != 0)
            res[idx++] = q.remove();

        return res;
    }
}
