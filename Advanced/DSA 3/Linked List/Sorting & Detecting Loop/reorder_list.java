public class reorder_list {

    // Definition for singly-linked list.
    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
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

    public ListNode reorderList(ListNode A) {

        if (A == null || A.next == null)
            return A;

        ListNode mid = findMid(A);
        ListNode h2 = mid.next;
        mid.next = null;

        h2 = reverse(h2);
        ListNode head = A, h1 = A;
        boolean flag = true;

        while (h1 != null && h2 != null) {

            if (flag) {
                ListNode node = h1.next;
                h1.next = h2;
                h1 = node;
            }

            else {
                ListNode node = h2.next;
                h2.next = h1;
                h2 = node;
            }

            flag = !flag;
        }

        return head;
    }
}
