public class lucky_numbers {

    public int solve(int A) {

        int count = 0;
        int[] primes = new int[A + 1];

        for (int i = 2; i <= A; i++) {

            if (primes[i] == 0) {

                for (int j = i; j <= A; j += i)
                    primes[j]++;
            }

            else if (primes[i] == 2)
                count++;
        }

        return count;
    }
}
