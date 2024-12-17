import java.util.ArrayList;
import java.util.List;

public class preorder {

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

        list.add(node.val);
        helper(node.left, list);
        helper(node.right, list);
    }

    public int[] preorderTraversal(TreeNode A) {

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
