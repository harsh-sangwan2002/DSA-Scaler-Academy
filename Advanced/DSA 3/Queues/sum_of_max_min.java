import java.util.Deque;
import java.util.ArrayDeque;

public class sum_of_max_min {

    public int solve(int[] A, int B) {

        long sum = 0, mod = (long) (1e9 + 7);

        if (A.length == 1 || B == 1) {

            for (int val : A)
                sum = (sum + val) % mod;

            sum = (sum * 2) % mod;

            return (int) sum;
        }

        Deque<Integer> maxQ = new ArrayDeque<>();
        Deque<Integer> minQ = new ArrayDeque<>();
        int[] max = new int[A.length - B + 1];
        int[] min = new int[A.length - B + 1];

        int idx1 = 0;
        int idx2 = 0;

        for (int i = 0; i < B; i++) {

            while (!maxQ.isEmpty() && A[maxQ.peekLast()] <= A[i]) {
                maxQ.removeLast();
            }

            while (!minQ.isEmpty() && A[minQ.peekLast()] >= A[i]) {
                minQ.removeLast();
            }

            maxQ.addLast(i);
            minQ.addLast(i);
        }

        max[idx1++] = A[maxQ.peekFirst()];
        min[idx2++] = A[minQ.peekFirst()];
        sum = (sum + max[idx1 - 1] + min[idx2 - 1]) % mod;
        sum = (sum + mod) % mod;

        for (int i = B; i < A.length; i++) {

            if (maxQ.peekFirst() <= i - B) {
                maxQ.removeFirst();
            }

            if (minQ.peekFirst() <= i - B) {
                minQ.removeFirst();
            }

            while (!maxQ.isEmpty() && A[maxQ.peekLast()] <= A[i]) {
                maxQ.removeLast();
            }

            while (!minQ.isEmpty() && A[minQ.peekLast()] >= A[i]) {
                minQ.removeLast();
            }

            maxQ.addLast(i);
            minQ.addLast(i);

            max[idx1++] = A[maxQ.peekFirst()];
            min[idx2++] = A[minQ.peekFirst()];

            sum = (sum + max[idx1 - 1] + min[idx2 - 1]) % mod;
            sum = (sum + mod) % mod;
        }

        return (int) sum;
    }
}
