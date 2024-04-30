import java.util.ArrayList;
import java.util.PriorityQueue;

public class merge_k_sorted_lists {

    // Definition for singly-linked list.
    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private class Pair implements Comparable<Pair> {

        ListNode node;

        Pair(ListNode node) {
            this.node = node;
        }

        public int compareTo(Pair o) {

            return this.node.val - o.node.val;
        }
    }

    public ListNode mergeKLists(ArrayList<ListNode> list) {

        ListNode head = new ListNode(-1);
        ListNode temp = head;

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < list.size(); i++) {

            ListNode node = list.get(i);
            pq.add(new Pair(node));
        }

        while (pq.size() != 0) {

            Pair p = pq.remove();

            ListNode node = new ListNode(p.node.val);
            temp.next = node;
            temp = temp.next;

            ListNode next = p.node.next;

            if (next != null)
                pq.add(new Pair(next));
        }

        return head.next;
    }
}
