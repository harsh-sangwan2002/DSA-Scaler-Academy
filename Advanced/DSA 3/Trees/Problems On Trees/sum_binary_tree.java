public class sum_binary_tree {

    // Definition for binary tree with next pointer.
    public class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    private class Pair {

        int sum;
        boolean flag;

        public Pair(int sum, boolean flag) {
            this.sum = sum;
            this.flag = flag;
        }
    }

    private Pair check(TreeNode root) {

        if (root == null)
            return new Pair(0, true);

        if (root.left == null && root.right == null)
            return new Pair(root.val, true);

        Pair lp = check(root.left);
        if (!lp.flag)
            return new Pair(root.val, false);

        Pair rp = check(root.right);
        if (!rp.flag)
            return new Pair(root.val, false);

        if (lp.sum + rp.sum != root.val)
            return new Pair(root.val, false);

        return new Pair(lp.sum + rp.sum + root.val, true);
    }

    public int solve(TreeNode A) {

        Pair mp = check(A);
        return mp.flag ? 1 : 0;
    }
}
