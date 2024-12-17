public class check_bit {

    public int solve(int A, int B) {

        if ((A & (1 << B)) == 0)
            return 0;

        return 1;
    }
}
