import java.util.Collections;
import java.util.PriorityQueue;

public class running_median {
    public int[] solve(int[] A) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        maxHeap.add(A[0]);

        for (int i = 1; i < A.length; i++) {

            int val = A[i];

            if (val < maxHeap.peek())
                maxHeap.add(val);

            else
                minHeap.add(val);

            if (maxHeap.size() - minHeap.size() > 1)
                minHeap.add(maxHeap.remove());

            else if (minHeap.size() - maxHeap.size() > 1)
                maxHeap.add(minHeap.remove());

            int s = maxHeap.size() + minHeap.size();

            if (s % 2 == 1) {

                if (maxHeap.size() > minHeap.size())
                    A[i] = maxHeap.peek();

                else
                    A[i] = minHeap.peek();
            }

            else
                A[i] = maxHeap.peek();
        }

        return A;
    }
}
