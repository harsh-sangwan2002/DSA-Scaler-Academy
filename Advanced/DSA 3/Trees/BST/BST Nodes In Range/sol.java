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

    int ans;

    private void helper(TreeNode root, int s, int e) {

        if (root == null)
            return;

        if (root.val >= s && root.val <= e)
            ans++;

        if (root.val <= s)
            helper(root.right, s, e);

        else if (root.val >= e)
            helper(root.left, s, e);

        else if (root.val > s && root.val < e) {
            helper(root.left, s, e);
            helper(root.right, s, e);
        }
    }

    public int solve(TreeNode A, int B, int C) {

        ans = 0;
        helper(A, B, C);

        return ans;
    }
}
