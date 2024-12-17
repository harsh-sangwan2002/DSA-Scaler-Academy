public class k_reverse {

    public class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private ListNode reverse(ListNode A) {

        if (A == null || A.next == null)
            return A;

        ListNode prev = null, curr = A;

        while (curr != null) {

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode reverseList(ListNode A, int B) {

        if (A == null || A.next == null)
            return A;

        ListNode temp = A, h2 = temp;
        for (int i = 1; i < B; i++)
            temp = temp.next;

        h2 = temp.next;
        temp.next = null;

        h2 = reverseList(h2, B);
        ListNode h1 = reverse(A);

        A.next = h2;
        return h1;
    }
}
