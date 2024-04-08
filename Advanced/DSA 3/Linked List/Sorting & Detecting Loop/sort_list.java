//  Definition for singly-linked list.
class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class sort_list {

    public ListNode findMid(ListNode node) {

        ListNode slow = node, fast = node;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode sortList(ListNode A) {

        if (A == null || A.next == null)
            return A;

        ListNode mid = findMid(A);
        ListNode temp = mid.next;
        mid.next = null;

        ListNode h1 = sortList(A);
        ListNode h2 = sortList(temp);
        return mergeTwoLists(h1, h2);
    }

    public ListNode mergeTwoLists(ListNode A, ListNode B) {

        if (A == null)
            return B;
        if (B == null)
            return A;

        ListNode h1 = A, h2 = B, head, tail;

        if (h1.val < h2.val) {
            head = h1;
            tail = h1;
            h1 = h1.next;
        }

        else {
            head = h2;
            tail = h2;
            h2 = h2.next;
        }

        while (h1 != null && h2 != null) {

            if (h1.val < h2.val) {
                tail.next = h1;
                tail = h1;
                h1 = h1.next;
            }

            else {
                tail.next = h2;
                tail = h2;
                h2 = h2.next;
            }
        }

        if (h1 == null)
            tail.next = h2;

        else
            tail.next = h1;

        return head;
    }
}
