import java.util.Stack;

public class queues_using_stack {

    public static class UserQueue {
        /** Initialize your data structure here. */
        static Stack<Integer> st;
        static Stack<Integer> help;

        UserQueue() {
            st = new Stack<>();
            help = new Stack<>();
        }

        /** Push element X to the back of queue. */
        static void push(int X) {

            if (st.size() == 0)
                st.push(X);

            else {

                while (st.size() != 0)
                    help.push(st.pop());

                st.push(X);

                while (help.size() != 0)
                    st.push(help.pop());
            }
        }

        /** Removes the element from in front of queue and returns that element. */
        static int pop() {

            return st.pop();
        }

        /** Get the front element of the queue. */
        static int peek() {

            return st.peek();
        }

        /** Returns whether the queue is empty. */
        static boolean empty() {

            return st.isEmpty();
        }
    }

    /**
     * Your UserQueue object will be instantiated and called as such:
     * UserQueue obj = new UserQueue();
     * obj.push(X);
     * int param2 = obj.pop();
     * int param3 = obj.peek();
     * boolean param4 = obj.empty();
     */
}