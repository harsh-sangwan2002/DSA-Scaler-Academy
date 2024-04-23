public class next_pointer {

    // Definition for binary tree with next pointer.
    public class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode(int x) {
            val = x;
        }
    }

    public void connect(TreeLinkNode root) {

        TreeLinkNode curr = root;

        while (curr.left != null) {

            TreeLinkNode temp = curr;

            while (curr != null) {

                curr.left.next = curr.right;

                if (curr.next != null)
                    curr.right.next = curr.next.left;

                curr = curr.next;
            }

            curr = temp.left;
        }
    }
}
