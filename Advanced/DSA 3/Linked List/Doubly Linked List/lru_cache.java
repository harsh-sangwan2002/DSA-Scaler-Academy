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
    int N;
    int MAX;
    HashMap<Integer, Node> mMap;

    public void updateAccessList(Node node) {
        Node temp = node.prev;
        temp.next = node.next;
        temp = node.next;
        if (temp != null)
            temp.prev = node.prev;

        node.next = head;
        head.prev = node;
        node.prev = null;
        head = node;
    }

    public lru_cache(int capacity) {
        head = null;
        tail = null;
        MAX = capacity;
        N = 0;
        mMap = new HashMap<>();
    }

    public int get(int key) {
        if (N == 0)
            return -1;

        if (mMap.containsKey(key)) {
            Node node = mMap.get(key);

            if (key == head.key) {
                return node.val;
            }
            if (tail.key == key) {
                tail = tail.prev;
            }

            updateAccessList(node);

            return node.val;
        }

        return -1;
    }

    public void set(int key, int value) {

        if (mMap.containsKey(key)) {

            Node node = mMap.get(key);

            if (node.key == head.key) {
                node.val = value;
                return;
            }

            if (tail.key == key) {
                tail = tail.prev;
            }

            updateAccessList(node);

            node.val = value;

            return;
        }

        if (N == MAX) {
            if (tail != null) {
                mMap.remove(tail.key);
                tail = tail.prev;

                if (tail != null) {
                    tail.next.prev = null;
                    tail.next = null;
                }
                N--;
            }
        }

        Node node = new Node(key, value);
        node.next = head;
        if (head != null)
            head.prev = node;

        head = node;
        N++;

        if (N == 1)
            tail = head;

        mMap.put(key, node);
    }
}