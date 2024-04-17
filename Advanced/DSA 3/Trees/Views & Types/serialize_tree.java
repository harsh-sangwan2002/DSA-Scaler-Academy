import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class serialize_tree {

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

    public int[] solve(TreeNode A) {

        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(A);

        while (q.size() != 0) {

            TreeNode node = q.remove();

            if (node.val == -1) {

                res.add(-1);
            }

            else {

                res.add(node.val);

                if (node.left != null)
                    q.add(node.left);

                else
                    q.add(new TreeNode(-1));

                if (node.right != null)
                    q.add(node.right);

                else
                    q.add(new TreeNode(-1));
            }
        }

        int[] ans = new int[res.size()];
        int idx = 0;

        for (int val : res)
            ans[idx++] = val;

        return ans;
    }
}
