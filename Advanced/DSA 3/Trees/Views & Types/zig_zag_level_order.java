import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class zig_zag_level_order {

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

    public int[][] zigzagLevelOrder(TreeNode A) {

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(A);
        int flag = 0;

        while (q.size() != 0) {

            List<Integer> list = new ArrayList<>();
            int n = q.size();

            for (int i = 1; i <= n; i++) {

                TreeNode node = q.remove();

                if (flag % 2 == 0)
                    list.add(node.val);

                else
                    list.add(0, node.val);

                if (node.left != null)
                    q.add(node.left);

                if (node.right != null)
                    q.add(node.right);
            }

            flag++;
            res.add(list);
        }

        int[][] ans = new int[res.size()][];
        int idx1 = 0;

        for (List<Integer> list : res) {

            int[] temp = new int[list.size()];
            int idx2 = 0;

            for (int val : list)
                temp[idx2++] = val;

            ans[idx1++] = temp;
        }

        return ans;
    }
}
