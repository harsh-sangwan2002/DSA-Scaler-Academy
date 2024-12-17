public class create_bst {

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

    private TreeNode create(int[] arr, int s, int e) {

        if (s > e)
            return null;

        int mid = s + (e - s) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = create(arr, s, mid - 1);
        root.right = create(arr, mid + 1, e);

        return root;
    }

    public TreeNode sortedArrayToBST(final int[] A) {

        int s = 0, e = A.length - 1;
        return create(A, s, e);
    }
}
