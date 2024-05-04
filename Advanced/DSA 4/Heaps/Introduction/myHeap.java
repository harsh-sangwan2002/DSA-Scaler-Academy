import java.util.ArrayList;
import java.util.List;

public class myHeap {

    static class PriorityQueue<T extends Comparable<T>> {

        private List<T> list;

        PriorityQueue() {
            list = new ArrayList<>();
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

        public void print() {

            for (T val : list)
                System.out.print(val + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);

        pq.print();

        System.out.println(pq.peek());
        pq.remove();

        pq.print();
    }
}
