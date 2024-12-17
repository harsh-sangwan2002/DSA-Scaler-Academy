public class invert_tree {

    // Definition for binary tree with next pointer.
    public class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode invertTree(TreeNode A) {

        if(A==null)
        return A;

        TreeNode left = invertTree(A.left);
        TreeNode right = invertTree(A.right);

        A.left = right;
        A.right = left;
        return A;
    }
}
