import java.util.Arrays;
import java.util.PriorityQueue;

public class flipkart_challenge {

    static class Pair {

        int expiry;
        int margin;

        Pair(int expiry, int margin) {
            this.expiry = expiry;
            this.margin = margin;
        }
    }

    public int solve(int[] A, int[] B) {

        Pair[] pairs = new Pair[A.length];

        for (int i = 0; i < pairs.length; i++)
            pairs[i] = new Pair(A[i], B[i]);

        Arrays.sort(pairs, (p1, p2) -> p1.expiry - p2.expiry);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int t = 0;

        for (int i = 0; i < pairs.length; i++) {

            if (pairs[i].expiry > t) {
                pq.add(pairs[i].margin);
                t++;
            }

            else {

                if (pairs[i].margin > pq.peek()) {
                    pq.remove();
                    pq.add(pairs[i].margin);
                }
            }
        }

        long sum = 0, mod = (long) (1e9 + 7);

        while (pq.size() != 0)
            sum = (sum + pq.remove()) % mod;

        return (int) sum;
    }
}
