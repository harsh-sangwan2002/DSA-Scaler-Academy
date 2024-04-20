public class sol2 {

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

    TreeNode p1, p2, prev;

    private void inorder(TreeNode root) {

        if (root == null)
            return;

        TreeNode curr = root;

        while (curr != null) {

            if (curr.left == null) {

                // process the current data
                if (prev != null && prev.val > curr.val) {

                    if (p1 == null) {
                        p1 = prev;
                        p2 = curr;
                    }

                    else
                        p2 = curr;
                }

                prev = curr;
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
                    // process the current data

                    if (prev != null && prev.val > curr.val) {

                        if (p1 == null) {
                            p1 = prev;
                            p2 = curr;
                        }

                        else
                            p2 = curr;
                    }

                    prev = curr;

                    curr = curr.right;
                }
            }
        }
    }

    public int[] recoverTree(TreeNode A) {

        p1 = null;
        p2 = null;
        prev = null;

        inorder(A);

        return new int[] { p2.val, p1.val };
    }
}
