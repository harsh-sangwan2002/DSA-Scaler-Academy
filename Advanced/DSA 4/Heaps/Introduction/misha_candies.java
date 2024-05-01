import java.util.PriorityQueue;

public class misha_candies {

    public int solve(int[] A, int B) {

        int candies = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int val : A)
            pq.add(val);

        while (pq.size() != 0) {

            int val = pq.remove();

            if (val > B)
                return candies;

            int eat = val / 2;
            candies += eat;

            if (pq.size() == 0)
                return candies;

            int val2 = pq.remove();
            val2 += (val - eat);
            pq.add(val2);
        }

        return candies;
    }
}
