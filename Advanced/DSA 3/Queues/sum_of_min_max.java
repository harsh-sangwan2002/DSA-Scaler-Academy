import java.util.ArrayDeque;
import java.util.Deque;

public class sum_of_min_max {

    private int[] findMax(int[] A, int B) {

        if (B == 1)
            return A;

        int[] res = new int[A.length - B + 1];
        Deque<Integer> q = new ArrayDeque<>();
        int idx = 0;

        for (int i = 0; i < B; i++) {

            while (q.size() != 0 && A[q.peekLast()] <= A[i])
                q.removeLast();

            q.addLast(i);
        }

        res[idx++] = A[q.peekFirst()];

        for (int i = B; i < A.length; i++) {

            if (q.peekFirst() <= i - B)
                q.removeFirst();

            while (q.size() != 0 && A[q.peekLast()] <= A[i])
                q.removeLast();

            q.addLast(i);
            res[idx++] = A[q.peekFirst()];
        }

        return res;
    }

    private int[] findMin(int[] A, int B) {

        if (B == 1)
            return A;

        int[] res = new int[A.length - B + 1];
        Deque<Integer> q = new ArrayDeque<>();
        int idx = 0;

        for (int i = 0; i < B; i++) {

            while (q.size() != 0 && A[q.peekLast()] >= A[i])
                q.removeLast();

            q.addLast(i);
        }

        res[idx++] = A[q.peekFirst()];

        for (int i = B; i < A.length; i++) {

            if (q.peekFirst() <= i - B)
                q.removeFirst();

            while (q.size() != 0 && A[q.peekLast()] >= A[i])
                q.removeLast();

            q.addLast(i);
            res[idx++] = A[q.peekFirst()];
        }

        return res;
    }

    public int solve(int[] A, int B) {

        int[] max = findMax(A, B);
        int[] min = findMin(A, B);
        long sum = 0, mod = (long) (1e9 + 7);

        for (int i = 0; i < max.length; i++) {

            sum = (sum + max[i] + min[i]) % mod;
            sum = (sum + mod) % mod;
        }

        return (int) sum;
    }
}
