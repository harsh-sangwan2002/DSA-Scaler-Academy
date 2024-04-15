public class k_reverse {

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

    public ListNode reverseList(ListNode A, int B) {

        if (A == null || A.next == null || B == 1)
            return A;

        ListNode temp = A;
        for (int i = 1; i < B; i++)
            temp = temp.next;

        ListNode next = temp.next;
        ListNode h2 = reverseList(next, B);

        temp.next = null;
        ListNode h1 = reverse(A);
        A.next = h2;

        return h1;
    }
}
