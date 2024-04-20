public class kth_smallest {

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

    public int kthsmallest(TreeNode A, int B) {

        int count = 0;
        TreeNode curr = A;

        while (curr != null) {

            if (curr.left == null) {

                count++;

                if (count == B)
                    return curr.val;

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

                    count++;

                    if (count == B)
                        return curr.val;

                    curr = curr.right;
                }
            }
        }

        return -1;
    }
}
