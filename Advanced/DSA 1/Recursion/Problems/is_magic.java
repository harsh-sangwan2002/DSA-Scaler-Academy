public class is_magic {

    public int solve(int A) {

        if (A == 1)
            return 1;

        if (A / 10 == 0)
            return 0;

        int sum = 0;

        while (A != 0) {

            int rem = A % 10;
            sum += rem;
            A /= 10;
        }

        if (sum / 10 == 0)
            return sum == 1 ? 1 : 0;

        return solve(sum);
    }
}
