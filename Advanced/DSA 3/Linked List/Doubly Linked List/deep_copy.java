import java.util.HashMap;

public class deep_copy {

    // Definition for singly-linked list.
    class RandomListNode {
        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    };

    public RandomListNode copyRandomList(RandomListNode head) {

        if (head == null)
            return null;

        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();

        RandomListNode curr = head;
        while (curr != null) {

            map.put(curr, new RandomListNode(curr.label));
            curr = curr.next;
        }

        curr = head;

        while (curr != null) {

            RandomListNode copy = map.get(curr);
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }
}
