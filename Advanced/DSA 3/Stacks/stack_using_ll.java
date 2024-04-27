import java.util.LinkedList;

public class stack_using_ll {

    public static class Stack {

        private LinkedList<Integer> list;

        public Stack() {
            list = new LinkedList<>();
        }

        void push(int val) {

            list.addFirst(val);
        }

        int peek() {

            return list.getFirst();
        }

        int pop() {

            return list.removeFirst();
        }
    }

    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(1);
        st.push(2);
        System.out.println(st.peek());

        st.push(3);
        st.push(4);
        System.out.println(st.peek());

        st.push(5);
        System.out.println(st.pop());

        st.push(5);
        System.out.println(st.peek());
    }
}
