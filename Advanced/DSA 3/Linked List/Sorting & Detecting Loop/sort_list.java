public class sort_list {

    // Definition for singly-linked list.
    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private ListNode merge(ListNode A, ListNode B) {

        if (A == null)
            return B;
        if (B == null)
            return A;

        ListNode head = null, tail = null;
        ListNode h1 = A, h2 = B;

        if (A.val < B.val) {
            head = A;
            tail = A;
            h1 = h1.next;
        }

        else {
            head = B;
            tail = B;
            h2 = h2.next;
        }

        while (h1 != null && h2 != null) {

            if (h1.val < h2.val) {
                tail.next = h1;
                h1 = h1.next;
            }

            else {
                tail.next = h2;
                h2 = h2.next;
            }

            tail = tail.next;
        }

        if (h1 == null)
            tail.next = h2;

        else
            tail.next = h1;

        return head;

    }

    private ListNode findMid(ListNode A) {

        if (A == null || A.next == null)
            return A;

        ListNode slow = A, fast = A;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode sortList(ListNode A) {

        if (A == null || A.next == null)
            return A;

        ListNode mid = findMid(A);
        ListNode h2 = mid.next;
        mid.next = null;

        A = sortList(A);
        h2 = sortList(h2);

        return merge(A, h2);
    }
}
