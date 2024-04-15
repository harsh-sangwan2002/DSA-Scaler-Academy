public class remove_dups {

    // Definition for singly-linked list.
    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode deleteDuplicates(ListNode A) {

        if (A == null || A.next == null)
            return A;

        ListNode temp = A;

        while (temp.next != null) {

            if (temp.val == temp.next.val)
                temp.next = temp.next.next;

            else
                temp = temp.next;
        }

        return A;
    }
}
