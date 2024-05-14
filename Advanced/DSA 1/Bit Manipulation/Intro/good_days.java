public class good_days {

    private boolean check(int n) {

        if ((n & 1) != 0)
            return true;

        return false;
    }

    public int solve(int A) {

        int days = 0;

        while (A != 0) {

            if (check(A))
                days++;

            A = A >> 1;
        }

        return days;
    }
}
