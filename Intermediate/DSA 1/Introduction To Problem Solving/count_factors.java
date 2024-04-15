public class count_factors {

    public int solve(int A) {

        if (A == 1)
            return 1;

        int count = 2;

        for (int i = 2; i <= Math.sqrt(A); i++) {

            if (A % i == 0) {

                if (i * i == A)
                    count++;

                else
                    count += 2;
            }
        }

        return count;
    }
}
