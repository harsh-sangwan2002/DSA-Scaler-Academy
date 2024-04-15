public class reverse_ll_2 {

    // Definition for singly-linked list.
    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private ListNode reverse(ListNode A) {

        if (A == null || A.next == null)
            return A;

        ListNode prev = null, curr = A;

        while (curr != null) {

            ListNode node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = node;
        }

        return prev;
    }

    public ListNode reverseBetween(ListNode A, int B, int C) {

        if (A == null || A.next == null || B >= C)
            return A;

        ListNode first = null, last = null, from = null, to = null, curr = A;
        ListNode head = A;
        int count = 0;

        while (curr != null) {

            count++;

            if (count < B)
                first = curr;

            else if (count == B)
                from = curr;

            else if (count == C) {

                to = curr;
                last = to.next;
                to.next = null;
                break;
            }

            curr = curr.next;
        }

        reverse(from);

        if (first != null)
            first.next = to;

        else
            head = to;

        from.next = last;

        return head;
    }
}
