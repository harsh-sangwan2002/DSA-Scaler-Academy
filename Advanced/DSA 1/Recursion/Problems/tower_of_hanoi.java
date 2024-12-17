public class tower_of_hanoi {

    int[][] arr;
    int curr;

    private void toh(int n, int t1, int t2, int t3) {

        if (n == 0)
            return;

        toh(n - 1, t1, t3, t2);

        arr[curr++] = new int[] { n, t1, t3 };

        toh(n - 1, t2, t1, t3);
    }

    public int[][] towerOfHanoi(int A) {

        arr = new int[(int) Math.pow(2, A) - 1][3];
        curr = 0;

        toh(A, 1, 2, 3);

        return arr;
    }
}
