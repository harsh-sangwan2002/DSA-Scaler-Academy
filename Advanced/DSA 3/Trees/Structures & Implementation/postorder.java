import java.util.ArrayList;
import java.util.List;

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

    private void helper(TreeNode node, List<Integer> list) {

        if (node == null)
            return;

        helper(node.left, list);
        helper(node.right, list);
        list.add(node.val);
    }

    public int[] postorderTraversal(TreeNode A) {

        if (A == null)
            return new int[] {};

        List<Integer> list = new ArrayList<>();

        helper(A, list);

        int[] res = new int[list.size()];
        int idx = 0;

        for (int val : list)
            res[idx++] = val;

        return res;
    }
}
