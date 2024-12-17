import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

public class postorder {

    // Definition for binary tree
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }

    public class Pair {

        TreeNode node;
        int idx;

        Pair(TreeNode node) {
            this.node = node;
            this.idx = 1;
        }
    }

    public int[] inorderTraversal(TreeNode A) {

        if (A == null)
            return new int[] {};

        List<Integer> list = new ArrayList<>();
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(A));

        while (st.size() != 0) {

            Pair top = st.peek();

            if (top.idx == 1) {

                top.idx++;
                if (top.node.left != null)
                    st.push(new Pair(top.node.left));
            }

            else if (top.idx == 2) {

                top.idx++;
                if (top.node.right != null)
                    st.push(new Pair(top.node.right));
            }

            else if (top.idx == 3) {

                top.idx++;
                list.add(top.node.val);
            }

            else
                st.pop();
        }

        int[] res = new int[list.size()];
        int idx = 0;

        for (int val : list)
            res[idx++] = val;

        return res;
    }
}
