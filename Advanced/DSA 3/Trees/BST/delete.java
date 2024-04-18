public class delete {

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

    private int findMax(TreeNode root) {

        while (root.right != null)
            root = root.right;

        return root.val;
    }

    public TreeNode solve(TreeNode root, int B) {

        if (root == null)
            return root;

        if (root.val < B)
            root.right = solve(root.right, B);

        else if (root.val > B)
            root.left = solve(root.left, B);

        else {

            if (root.left == null && root.right == null)
                return null;

            else if (root.left == null)
                return root.right;

            else if (root.right == null)
                return root.left;

            else {

                int v = findMax(root.left);
                root.val = v;
                root.left = solve(root.left, v);
            }
        }

        return root;
    }
}
