public class palindrome_ll {

    public class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
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

    public int lPalin(ListNode A) {

        if (A.next == null)
            return 1;

        ListNode h1 = A;

        ListNode mid = findMid(A);
        ListNode h2 = mid.next;
        mid.next = null;
        h2 = reverse(h2);

        while (h1 != null && h2 != null) {

            if (h1.val != h2.val)
                return 0;

            h1 = h1.next;
            h2 = h2.next;
        }

        return 1;
    }
}
