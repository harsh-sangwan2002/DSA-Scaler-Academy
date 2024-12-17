public class longest_palindrome {

    public class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private int count(ListNode h1, ListNode h2) {

        int count = 0;

        while (h1 != null && h2 != null) {

            if (h1.val != h2.val)
                return count;

            h1 = h1.next;
            h2 = h2.next;
            count++;
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

            // odd length list
            ans = Math.max(ans, 2 * count(prev, next) + 1);

            // even length list
            ans = Math.max(ans, 2 * count(curr, next));

            prev = curr;
            curr = next;
        }

        return ans;
    }
}
