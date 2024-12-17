public class balanced_binary_tree {

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

    int flag;

    private int height(TreeNode root) {

        if (root == null)
            return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        if (Math.abs(lh - rh) > 1)
            flag = 0;

        return Math.max(lh, rh) + 1;
    }

    public int isBalanced(TreeNode A) {

        flag = 1;
        height(A);

        return flag;
    }
}
