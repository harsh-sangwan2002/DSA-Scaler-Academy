public class sol2 {

    // Definition for singly-linked list with a random pointer.
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

        // Step 1: Duplicate each node and insert it after its original node
        RandomListNode current = head;
        while (current != null) {
            RandomListNode copy = new RandomListNode(current.label);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }

        // Step 2: Update random pointers of the copied nodes
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }

        // Step 3: Separate the original and copied linked lists
        current = head;
        RandomListNode copiedHead = head.next;
        RandomListNode currentCopied = copiedHead;
        while (current != null) {
            current.next = current.next.next;
            if (currentCopied.next != null) {
                currentCopied.next = currentCopied.next.next;
            }
            current = current.next;
            currentCopied = currentCopied.next;
        }

        return copiedHead;
    }
}
