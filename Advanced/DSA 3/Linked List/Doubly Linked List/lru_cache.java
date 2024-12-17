import java.util.HashMap;

public class lru_cache {

    static class Node {
        int key;
        int val;
        Node prev, next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    Node head;
    Node tail;
    int capacity;
    HashMap<Integer, Node> map;

    public lru_cache(int capacity) {
        this.capacity = capacity;
        head = new Node(-1, -1); // Dummy head node
        tail = new Node(-1, -1); // Dummy tail node
        head.next = tail;
        tail.prev = head;
        map = new HashMap<>();
    }

    private void addToFront(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private void removeFromList(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);
        removeFromList(node);
        addToFront(node);
        return node.val;
    }

    public void set(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            removeFromList(node);
            addToFront(node);
        } else {
            if (map.size() == capacity) {
                Node toRemove = tail.prev;
                removeFromList(toRemove);
                map.remove(toRemove.key);
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addToFront(newNode);
        }
    }
}