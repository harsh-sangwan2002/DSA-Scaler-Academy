public class palindrome_ll {

    // Definition for singly-linked list.
    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private int size(ListNode A) {

        ListNode temp = A;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
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

        ListNode head = prev;
        return head;
    }

    public int lPalin(ListNode A) {

        if (A == null || A.next == null)
            return 1;

        int half = size(A) / 2;
        ListNode temp = A;

        for (int i = 1; i < half; i++)
            temp = temp.next;

        ListNode headB = temp.next;
        temp.next = null;

        ListNode t1 = A;
        ListNode t2 = reverse(headB);

        while (t1 != null && t2 != null) {

            if (t1.val != t2.val)
                return 0;

            t1 = t1.next;
            t2 = t2.next;
        }

        return 1;
    }
}
