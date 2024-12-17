import java.util.Stack;

public class queue_using_stack {

    public static class Queue {

        private Stack<Integer> st;
        private Stack<Integer> helper;

        public Queue() {

            st = new Stack<>();
            helper = new Stack<>();
        }

        public void add(int val) {

            while (st.size() != 0)
                helper.push(st.pop());

            st.push(val);

            while (helper.size() != 0)
                st.push(helper.pop());
        }

        public int peek() {

            if (st.size() == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            return st.peek();
        }

        public int remove() {

            if (st.size() == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            return st.pop();
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