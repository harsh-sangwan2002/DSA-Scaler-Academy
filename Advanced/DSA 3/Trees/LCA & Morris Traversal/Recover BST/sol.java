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

    TreeNode p1, p2, prev;

    private void inorder(TreeNode root) {

        if (root == null)
            return;

        inorder(root.left);

        if (prev != null && prev.val > root.val) {

            if (p1 == null) {
                p1 = prev;
                p2 = root;
            }

            else
                p2 = root;
        }

        prev = root;

        inorder(root.right);
    }

    public int[] recoverTree(TreeNode A) {

        p1 = null;
        p2 = null;
        prev = null;
        inorder(A);

        return new int[] { p2.val, p1.val };
    }
}
