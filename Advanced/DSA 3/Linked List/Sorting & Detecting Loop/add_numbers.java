//  Definition for singly-linked list.
class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class add_numbers {

    public ListNode addTwoNumbers(ListNode A, ListNode B) {

        if (A == null)
            return B;
        if (B == null)
            return A;

        ListNode s1 = A, s2 = B;
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;
        int carry = 0;

        while (s1 != null && s2 != null) {

            int sum = s1.val + s2.val + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode node = new ListNode(digit);
            dummy.next = node;
            dummy = node;

            s1 = s1.next;
            s2 = s2.next;
        }

        while (s1 != null) {

            int sum = s1.val + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode node = new ListNode(digit);
            dummy.next = node;
            dummy = node;

            s1 = s1.next;
        }

        while (s2 != null) {

            int sum = s2.val + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode node = new ListNode(digit);
            dummy.next = node;
            dummy = node;

            s2 = s2.next;
        }

        if (carry != 0) {

            ListNode node = new ListNode(carry);
            dummy.next = node;
            dummy = node;
        }

        return res.next;
    }
}
