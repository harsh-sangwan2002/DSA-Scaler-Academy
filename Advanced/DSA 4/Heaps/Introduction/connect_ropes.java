import java.util.PriorityQueue;

public class connect_ropes {

    public int solve(int[] A) {

        if (A.length == 1)
            return A[0];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int val : A)
            pq.add(val);

        int cost = 0;
        while (pq.size() != 0) {

            int a = pq.remove();
            int b = pq.remove();
            cost += a + b;

            if (pq.size() == 0)
                return cost;

            pq.add(a + b);
        }

        return 1;
    }
}
