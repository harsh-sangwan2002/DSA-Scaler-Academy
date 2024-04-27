public class queue_using_array {

    public static class Queue {

        private int front;
        private int rear;
        private int[] arr;
        private int size;

        public Queue() {

            front = -1;
            rear = -1;
            arr = new int[5];
            size = 0;
        }

        public void add(int val) {

            if (size == arr.length)
                System.out.println("Queue is full");

            else if (rear == -1) {
                front = 0;
                rear = 0;
                arr[rear] = val;
                size++;
            }

            else {

                rear++;
                rear %= arr.length;
                arr[rear] = val;
                size++;
            }
        }

        public int peek() {

            if (front == -1) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }

        public int remove() {

            if (size <= 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            int temp = arr[front];
            front = (front + 1) % arr.length;
            size--;
            return temp;
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());

        q.remove();
        System.out.println(q.peek());

        q.remove();
        q.remove();
        System.out.println(q.remove());
    }
}