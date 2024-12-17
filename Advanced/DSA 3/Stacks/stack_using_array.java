public class stack_using_array {

    public static class Stack {

        private int[] arr;
        private int top;

        public Stack() {
            arr = new int[4];
            top = -1;
        }

        void push(int val) {

            if (top >= arr.length - 1) {
                System.out.println("Stack is full");
                return;
            }

            top++;
            arr[top] = val;
        }

        int peek() {

            if (top == -1) {
                System.out.print("Stack is empty");
                return -1;
            }

            return arr[top];
        }

        int pop() {

            if (top == -1) {
                System.out.print("Stack is empty");
                return -1;
            }

            int val = arr[top];
            top--;
            return val;
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