public class swap_pairs {

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

        ListNode h2 = A.next.next;
        h2 = swapPairs(h2);

        ListNode head = A.next;
        head.next = A;
        A.next = h2;

        return head;
    }
}
