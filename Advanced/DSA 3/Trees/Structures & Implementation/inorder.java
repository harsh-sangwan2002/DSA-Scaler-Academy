public class inorder {

    // Definition for binary tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
     val = x;
     left=null;
     right=null;
    }
}

    private void helper(TreeNode root, List<Integer> list){

        if(root==null)
        return;

        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }

    public int[] inorderTraversal(TreeNode A) {

        if(A==null)
        return new int[]{};

        List<Integer> res = new ArrayList<>();

        helper(A,res);

        int[] arr = new int[res.size()];
        int idx = 0;

        for(int val : res)
        arr[idx++] = val;

        return arr;
    }
}
