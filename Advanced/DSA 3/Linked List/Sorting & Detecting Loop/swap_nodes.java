public class swap_nodes {

    // Definition for singly-linked list.
    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode swapPairs(ListNode A) {

        if (A == null || A.next == null)
            return A;

        ListNode h2 = swapPairs(A.next.next);
        ListNode temp = A;
        ListNode res = temp.next;
        temp.next.next = temp;
        temp.next = h2;

        return res;
    }
}
