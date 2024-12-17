import java.util.ArrayDeque;
import java.util.Queue;

public class deserialize {

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

    public TreeNode solve(int[] A) {

        Queue<TreeNode> q = new ArrayDeque<>();
        TreeNode root = new TreeNode(A[0]);
        q.add(root);
        int idx = 1;

        while (q.size() != 0) {

            TreeNode node = q.remove();

            if (node.val == -1)
                continue;

            int val1 = A[idx];
            int val2 = A[idx + 1];
            idx += 2;

            if (val1 == -1) {
                node.left = null;
                q.add(new TreeNode(-1));
            }

            else {
                node.left = new TreeNode(val1);
                q.add(node.left);
            }

            if (val2 == -1) {
                node.right = null;
                q.add(new TreeNode(-1));
            }

            else {
                node.right = new TreeNode(val2);
                q.add(node.right);
            }

        }

        return root;
    }
}
