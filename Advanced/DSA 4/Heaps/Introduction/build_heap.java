import java.util.ArrayList;
import java.util.List;

public class build_heap {

    static class PriorityQueue<T extends Comparable<T>> {

        private List<T> list;

        PriorityQueue() {
            list = new ArrayList<>();
        }

        public List<T> get() {
            return this.list;
        }

        private void upheapify(int i) {

            while (i > 0) {

                int pi = (i - 1) / 2;

                if (list.get(pi).compareTo(list.get(i)) > 0) {
                    swap(i, pi);
                    i = pi;
                } else
                    break;
            }
        }

        void add(T val) {

            list.add(val);
            upheapify(list.size() - 1);
        }

        private void downheapify(int i) {

            while (2 * i + 1 < list.size()) {

                int minIndex = i;
                T current = list.get(i);

                if (list.get(2 * i + 1).compareTo(current) < 0)
                    minIndex = 2 * i + 1;

                if (2 * i + 2 < list.size() && list.get(2 * i + 2).compareTo(list.get(minIndex)) < 0)
                    minIndex = 2 * i + 2;

                if (minIndex == i)
                    break;

                swap(i, minIndex);
                i = minIndex;
            }
        }

        T remove() {

            if (list.size() == 0) {
                System.out.println("Heap is empty.");
                return null;
            }

            swap(0, list.size() - 1);
            T res = list.remove(list.size() - 1);
            downheapify(0);

            return res;
        }

        T peek() {

            if (list.size() == 0) {
                System.out.println("Heap is empty.");
                return null;
            }

            return list.get(0);
        }

        private void swap(int x, int y) {

            T temp = list.get(x);
            list.set(x, list.get(y));
            list.set(y, temp);
        }

        @SuppressWarnings("unchecked")
        private List<T> buildHeap(Integer[] arr) {

            int non_leaf = ((arr.length - 1) - 1) / 2;

            for (int i = arr.length - 1; i > non_leaf; i--)
                list.add((T) arr[i]);

            for (int i = non_leaf; i >= 0; i--) {
                list.add((T) arr[i]);
                downheapify(i);
            }

            return list;
        }

        public void print() {

            for (T val : list)
                System.out.print(val + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Integer[] arr = { 5, 3, 1, 2, 4 };
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        List<Integer> heap = pq.buildHeap(arr);

        for (int val : heap)
            System.out.print(val + " ");
    }
}
