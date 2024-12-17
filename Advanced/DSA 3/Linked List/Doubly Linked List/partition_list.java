public class partition_list {

    // Definition for singly-linked list.
    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode partition(ListNode A, int B) {

        ListNode d1 = new ListNode(-1);
        ListNode h1 = d1, t1 = h1;

        ListNode d2 = new ListNode(-1);
        ListNode h2 = d2, t2 = h2;

        ListNode curr = A;
        while (curr != null) {

            ListNode node = new ListNode(curr.val);

            if (curr.val < B) {
                t1.next = node;
                t1 = t1.next;
            }

            else {
                t2.next = node;
                t2 = t2.next;
            }

            curr = curr.next;
        }

        t1.next = h2.next;
        return h1.next;
    }
}
