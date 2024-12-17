public class sol {

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

    boolean flag;
    TreeNode node;

    private void helper(TreeNode root) {

        if (root == null || flag == false)
            return;

        helper(root.left);

        if (node == null || node.val < root.val)
            node = root;

        else {
            flag = false;
            return;
        }

        helper(root.right);
    }

    public int isValidBST(TreeNode A) {

        flag = true;
        node = null;
        helper(A);

        return flag ? 1 : 0;
    }
}
