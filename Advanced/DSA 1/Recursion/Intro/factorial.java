public class factorial {
    public int solve(int A) {

        if (A == 0 || A == 1)
            return 1;

        return A * solve(A - 1);
    }
}
