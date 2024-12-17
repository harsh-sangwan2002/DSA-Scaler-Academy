import java.util.ArrayDeque;
import java.util.Deque;

public class siding_window_max {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] slidingMaximum(final int[] A, int B) {

        if (A.length == 1 || B == 1)
            return A;

        Deque<Integer> q = new ArrayDeque<>();
        int[] res = new int[A.length - B + 1];
        int idx = 0;

        for (int i = 0; i < B; i++) {

            while (!q.isEmpty() && A[q.peekLast()] <= A[i])
                q.removeLast();

            q.addLast(i);
        }

        res[idx++] = A[q.peekFirst()];

        for (int i = B; i < A.length; i++) {

            if (q.peekFirst() <= i - B)
                q.removeFirst();

            while (!q.isEmpty() && A[q.peekLast()] <= A[i])
                q.removeLast();

            q.addLast(i);
            res[idx++] = A[q.peekFirst()];
        }

        return res;
    }
}
