import java.util.ArrayList;

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

    ArrayList<Integer> list;

    private void helper(TreeNode root) {

        if (root == null)
            return;

        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }

    public int t2Sum(TreeNode A, int B) {

        list = new ArrayList<>();

        helper(A);

        int lo = 0, hi = list.size() - 1;

        while (lo < hi) {

            int left = list.get(lo);
            int right = list.get(hi);

            if (left + right == B)
                return 1;

            else if (left + right > B)
                hi--;

            else
                lo++;
        }

        return 0;
    }
}
