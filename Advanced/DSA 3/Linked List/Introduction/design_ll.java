public class design_ll {
    public static class Node {

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static Node head = null;
    static int size = 0;

    public static void insert_node(int position, int value) {

        if (position >= 1 && position <= size + 1) {

            Node node = new Node(value);

            if (position == 1) {
                node.next = head;
                head = node;
            }

            else {

                Node temp = head;

                for (int i = 1; i < position - 1; i++)
                    temp = temp.next;

                node.next = temp.next;
                temp.next = node;
            }

            size++;
        }
    }

    public static void delete_node(int position) {

        if (head == null)
            return;

        if (position >= 1 && position <= size) {

            if (position == 1) {
                head = head.next;
                if (size == 1)
                    head = null;
            }

            else {

                Node temp = head;

                for (int i = 1; i < position - 1; i++)
                    temp = temp.next;

                temp.next = temp.next.next;
            }

            size--;
        }
    }

    public static void print_ll() {

        Node temp = head;
        int flag = 0;

        while (temp != null) {

            if (flag == 0) {
                System.out.print(temp.val);
                flag = 1;
            }

            else
                System.out.print(" " + temp.val);

            temp = temp.next;
        }

    }

}