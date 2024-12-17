public class dist_bw_nodes {

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

    private TreeNode findLCA(TreeNode root, int a, int b) {

        TreeNode curr = root;

        while (curr != null) {

            if (curr.val > a && curr.val > b)
                curr = curr.left;

            else if (curr.val < a && curr.val < b)
                curr = curr.right;

            else
                return curr;
        }

        return null;
    }

    private int distance(TreeNode root, int val) {

        if (root == null || root.val == val)
            return 0;

        else if (root.val > val)
            return 1 + distance(root.left, val);

        else
            return 1 + distance(root.right, val);
    }

    public int solve(TreeNode A, int B, int C) {

        TreeNode lca = findLCA(A, B, C);
        int d1 = distance(lca, B);
        int d2 = distance(lca, C);

        return d1 + d2;
    }
}
