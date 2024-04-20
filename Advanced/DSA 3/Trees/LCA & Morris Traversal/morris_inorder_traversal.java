import java.util.ArrayList;
import java.util.List;

public class morris_inorder_traversal {

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
        TreeNode curr = A;

        while (curr != null) {

            if (curr.left == null) {
                res.add(curr.val);
                curr = curr.right;
            }

            else {

                TreeNode temp = curr.left;
                while (temp.right != null && temp.right != curr)
                    temp = temp.right;

                if (temp.right == null) {
                    temp.right = curr;
                    curr = curr.left;
                }

                else {
                    temp.right = null;
                    res.add(curr.val);
                    curr = curr.right;
                }
            }
        }

        int[] arr = new int[res.size()];
        int idx = 0;

        for (int val : res)
            arr[idx++] = val;

        return arr;
    }
}
