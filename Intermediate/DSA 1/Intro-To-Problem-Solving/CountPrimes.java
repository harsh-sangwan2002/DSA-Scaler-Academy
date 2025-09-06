// TC -> O(N*sqrt(N))
// SC -> O(1)
public class CountPrimes {

    private boolean isPrime(int n) {

        if (n == 1)
            return false;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    public int solve(int A) {

        int count = 0;

        for (int i = 2; i <= A; i++) {

            if (isPrime(i))
                count++;
        }

        return count;
    }
}
