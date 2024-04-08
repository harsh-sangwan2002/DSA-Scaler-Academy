//  Definition for singly-linked list.
class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class remove_loop {

    public ListNode solve(ListNode A) {

        ListNode slow = A, fast = A;
        boolean flag = false;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                flag = true;
                break;
            }
        }

        if (!flag)
            return A;

        ListNode s1 = A, s2 = fast;
        while (s1 != s2) {
            s1 = s1.next;
            s2 = s2.next;
        }

        ListNode temp = s1;

        while (temp.next != s1)
            temp = temp.next;

        temp.next = null;

        return A;
    }
}
