public class remove_node {

    // Definition for singly-linked list.
    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode removeNthFromEnd(ListNode A, int B) {

        ListNode slow = A, fast = A;

        for (int i = 1; i <= B && fast != null; i++)
            fast = fast.next;

        if (fast == null)
            return A.next;

        while (fast.next != null) {

            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return A;
    }
}
