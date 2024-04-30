import java.util.PriorityQueue;

public class max_array_sum {

    public int solve(int[] A, int B) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int val : A)
            pq.add(val);

        for (int i = 0; i < B; i++) {

            int val = pq.remove();
            val *= -1;
            pq.add(val);
        }

        int sum = 0;
        while (pq.size() != 0)
            sum += pq.remove();

        return sum;
    }
}
