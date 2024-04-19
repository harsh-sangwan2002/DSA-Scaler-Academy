public class sol2 {

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

    private int helper(TreeNode root, int max, int min) {

        if (root == null)
            return 1;

        if (min <= root.val && root.val <= max) {

            int left = helper(root.left, root.val - 1, min);
            if (left == 0)
                return 0;

            int right = helper(root.right, max, root.val + 1);
            if (right == 0)
                return 0;

            return 1;
        }

        return 0;
    }

    public int isValidBST(TreeNode A) {

        int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
        return helper(A, max, min);
    }
}
