import java.util.ArrayList;
import java.util.List;

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

    private void create(TreeNode root, List<Integer> list) {

        if (root == null)
            return;

        create(root.left, list);
        list.add(root.val);
        create(root.right, list);
    }

    private boolean find(TreeNode root, int val) {

        if (root == null)
            return false;

        if (root.val == val)
            return true;

        else if (root.val > val)
            return find(root.left, val);

        else
            return find(root.right, val);
    }

    public int solve(TreeNode A, TreeNode B) {

        List<Integer> list = new ArrayList<>();
        create(A, list);

        long sum = 0, mod = (long) (1e9 + 7);

        for (int i = 0; i < list.size(); i++) {

            int val = list.get(i);

            if (find(B, val))
                sum = (sum + val) % mod;
        }

        return (int) sum;
    }
}
