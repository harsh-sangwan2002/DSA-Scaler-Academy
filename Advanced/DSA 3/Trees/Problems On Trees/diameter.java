public class diameter {

    // Definition for binary tree with next pointer.
    public class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    private class Pair {

        int dia;
        int ht;

        Pair(int dia, int ht) {
            this.dia = dia;
            this.ht = ht;
        }
    }

    private Pair findDia(TreeNode root) {

        if (root == null)
            return new Pair(0, 0);

        Pair lp = findDia(root.left);
        Pair rp = findDia(root.right);

        int height = Math.max(lp.ht, rp.ht) + 1;
        int dia = Math.max(lp.dia, rp.dia);
        dia = Math.max(dia, lp.ht + rp.ht);

        Pair mp = new Pair(dia, height);

        return mp;
    }

    public int solve(TreeNode A) {

        Pair res = findDia(A);
        return res.dia;
    }
}
