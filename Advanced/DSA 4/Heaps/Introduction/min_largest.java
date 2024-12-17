import java.util.PriorityQueue;

public class min_largest {

    private class Pair implements Comparable<Pair> {

        int ele;
        int idx;

        Pair(int ele, int idx) {
            this.ele = ele;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair o) {
            return this.ele - o.ele;
        }

    }

    public int solve(int[] A, int B) {

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] state = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            pq.add(new Pair(2 * A[i], i));
            state[i] = A[i];
        }

        while (B-- > 0) {

            Pair top = pq.remove();
            state[top.idx] = top.ele;
            pq.add(new Pair(top.ele + A[top.idx], top.idx));
        }

        int max = state[0];
        for (int val : state)
            max = Math.max(max, val);

        return max;
    }
}
