public class longest_palindrome {

    // Definition for singly-linked list.
    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private int count(ListNode h1, ListNode h2) {

        int count = 0;

        while (h1 != null && h2 != null) {

            if (h1.val != h2.val)
                return count;

            count++;
            h1 = h1.next;
            h2 = h2.next;
        }

        return count;
    }

    public int solve(ListNode A) {

        if (A.next == null)
            return 1;

        ListNode prev = null, curr = A;
        int ans = 1;

        while (curr != null) {

            ListNode next = curr.next;
            curr.next = prev;

            // odd length
            ans = Math.max(ans, 2 * count(curr.next, next) + 1);

            // even length
            ans = Math.max(ans, 2 * count(curr, next));

            prev = curr;
            curr = next;
        }

        return ans;
    }
}
