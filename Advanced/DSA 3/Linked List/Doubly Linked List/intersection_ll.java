//  Definition for singly-linked list.

class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class intersection_ll {

    private int size(ListNode head) {

        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            temp = temp.next;
            count++;
        }

        return count;
    }

    public ListNode getIntersectionNode(ListNode A, ListNode B) {

        int s1 = size(A);
        int s2 = size(B);
        int delta = Math.abs(s1 - s2);

        ListNode t1 = A, t2 = B;

        if (s1 > s2) {

            for (int i = 0; i < delta; i++)
                t1 = t1.next;
        }

        else if (s2 > s1) {

            for (int i = 0; i < delta; i++)
                t2 = t2.next;
        }

        while (t1 != t2) {

            t1 = t1.next;
            t2 = t2.next;
        }

        return t1;
    }
}