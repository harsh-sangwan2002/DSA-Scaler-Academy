//  Definition for singly-linked list.
class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class reverse_ll {
    public ListNode reverseList(ListNode A) {

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
}
