import java.util.PriorityQueue;

public class ath_largest {

    public int[] solve(int A, int[] B) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < A; i++) {
            pq.add(B[i]);

            if (i == A - 1)
                B[i] = pq.peek();

            else
                B[i] = -1;
        }

        for (int i = A; i < B.length; i++) {

            if (B[i] > pq.peek()) {
                pq.remove();
                pq.add(B[i]);
            }

            B[i] = pq.peek();
        }

        return B;
    }
}
