public class binary_tree_pre_in {

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

    private int find(int[] arr, int st, int et, int tar) {

        for (int i = st; i <= et; i++) {

            if (arr[i] == tar)
                return i;
        }

        return -1;
    }

    private TreeNode create(int[] pre, int ps, int pe, int[] in, int is, int ie) {

        if (ps > pe)
            return null;

        int rootData = pre[ps];
        TreeNode root = new TreeNode(rootData);

        int rootIdx = find(in, is, ie, rootData);
        int elements = rootIdx - is;

        root.left = create(pre, ps + 1, elements + ps, in, is, rootIdx - 1);
        root.right = create(pre, elements + ps + 1, pe, in, rootIdx + 1, ie);

        return root;
    }

    public TreeNode buildTree(int[] A, int[] B) {

        int ps = 0, pe = A.length - 1, is = 0, ie = B.length - 1;

        return create(A, ps, pe, B, is, ie);
    }
}
