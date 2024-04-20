import java.util.Stack;

class min_stack {

    Stack<Integer> st;
    Stack<Integer> min;

    public min_stack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {

        st.push(x);

        if (min.size() == 0)
            min.push(x);

        else if (x < min.peek())
            min.push(x);
    }

    public void pop() {

        if (st.size() == 0)
            return;

        int val = st.pop();

        if (val == min.peek())
            min.pop();
    }

    public int top() {

        if (st.size() == 0)
            return -1;

        return st.peek();
    }

    public int getMin() {

        if (st.size() == 0)
            return -1;

        return min.peek();
    }
}
