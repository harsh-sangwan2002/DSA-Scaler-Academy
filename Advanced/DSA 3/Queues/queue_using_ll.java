import java.util.LinkedList;

public class queue_using_ll {

    public static class Queue {

        private LinkedList<Integer> list;

        public Queue() {

            list = new LinkedList<>();
        }

        public void add(int val) {

            list.addLast(val);
        }

        public int peek() {

            if (list.size() == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            return list.getFirst();
        }

        public int remove() {

            if (list.size() == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            return list.removeFirst();
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());

        q.remove();
        System.out.println(q.peek());

        q.remove();
        q.remove();
        System.out.println(q.remove());
    }
}