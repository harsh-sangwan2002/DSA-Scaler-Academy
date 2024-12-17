public class count_primes {

    private boolean isPrime(int n) {

        if (n == 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    public int solve(int A) {

        int count = 0;

        for (int n = 2; n <= A; n++) {

            if (isPrime(n))
                count++;
        }

        return count;
    }
}
