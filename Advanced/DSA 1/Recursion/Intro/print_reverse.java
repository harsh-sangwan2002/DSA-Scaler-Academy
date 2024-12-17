public class print_reverse {

    private void print(int n) {

        if (n == 0)
            return;

        System.out.print(n + " ");
        print(n - 1);
    }

    public void solve(int A) {

        print(A);
        System.out.println();
    }
}
