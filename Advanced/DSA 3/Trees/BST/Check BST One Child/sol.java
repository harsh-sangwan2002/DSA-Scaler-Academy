import java.util.ArrayDeque;
import java.util.Queue;

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
    TreeNode prev;

    private void check(TreeNode root) {

        if (root == null)
            return;

        check(root.left);

        if (prev == null || prev.val < root.val)
            prev = root;

        else {
            flag = false;
            return;
        }

        check(root.right);
    }

    public String solve(int[] A) {

        flag = true;
        prev = null;

        TreeNode root = new TreeNode(A[0]);
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int idx = 1;

        while (idx < A.length && q.size() != 0) {

            TreeNode node = q.remove();
            TreeNode curr = new TreeNode(A[idx]);

            if (node.val < A[idx])
                node.right = curr;

            else
                node.left = curr;

            q.add(curr);
            idx++;
        }

        check(root);

        if (flag)
            return "YES";

        else
            return "NO";
    }
}
