import java.util.PriorityQueue;

public class k_places_apart {

    public int[] solve(int[] A, int B) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] res = new int[A.length];
        int idx = 0;

        for (int i = 0; i < A.length; i++) {

            pq.add(A[i]);

            if (i >= B)
                res[idx++] = pq.remove();
        }

        while (pq.size() != 0)
            res[idx++] = pq.remove();

        return res;
    }
}
