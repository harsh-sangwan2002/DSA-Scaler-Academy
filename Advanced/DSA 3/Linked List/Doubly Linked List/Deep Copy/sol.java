import java.util.HashMap;

public class sol {

    // Definition for singly-linked list with a random pointer.
    class RandomListNode {
        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    };

    public RandomListNode copyRandomList(RandomListNode A) {

        if (A == null)
            return null;

        RandomListNode head = new RandomListNode(A.label);
        RandomListNode curr = A.next, temp = head;

        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        map.put(A, head);

        while (curr != null) {

            RandomListNode node = new RandomListNode(curr.label);
            temp.next = node;
            temp = temp.next;

            map.put(curr, node);
            curr = curr.next;
        }

        curr = A;
        while (curr != null) {

            RandomListNode random = curr.random;
            map.get(curr).random = map.get(random);
            curr = curr.next;
        }

        return head;
    }
}
