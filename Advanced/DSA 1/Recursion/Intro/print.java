public class print {

    private void helper(int n) {

        if (n == 0)
            return;

        helper(n - 1);
        System.out.print(n + " ");
    }

    public void solve(int A) {

        helper(A);
        System.out.println();
    }
}
