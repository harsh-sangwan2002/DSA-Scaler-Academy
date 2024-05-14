public class magic_number {

    public int solve(int A) {

        int pow = 5, ans = 0;

        while (A != 0) {

            int rem = A % 2;
            A /= 2;

            ans += pow * rem;
            pow *= 5;
        }

        return ans;
    }
}
