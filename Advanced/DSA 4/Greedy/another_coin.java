import java.util.Collections;
import java.util.PriorityQueue;

public class another_coin {

    public int solve(int A) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i = 0; Math.pow(5, i) <= A; i++) {

            pq.add((int) Math.pow(5, i));

        }

        int coins = 0;

        while (pq.size() > 0 && A > 0) {

            if (pq.peek() <= A) {
                A -= pq.peek();
                coins++;
            }

            else
                pq.remove();

        }

        return coins;
    }
}
