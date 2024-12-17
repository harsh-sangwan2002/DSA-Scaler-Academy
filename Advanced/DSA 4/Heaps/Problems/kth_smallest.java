import java.util.Collections;
import java.util.PriorityQueue;

public class kth_smallest {

    public int solve(int[][] A, int B) {

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A[0].length; j++) {

                if (heap.size() == B && heap.peek() <= A[i][j])
                    break;

                heap.add(A[i][j]);

                if (heap.size() > B)
                    heap.poll();

            }
        }
        
        return heap.peek();
    }
}
