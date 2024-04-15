public class prime_sum {

    private int[] primes(int n) {

        int[] prime = new int[n + 1];

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (prime[i] == 0) {

                for (int j = i * i; j <= n; j += i)
                    prime[j] = 1;
            }
        }

        return prime;
    }

    public int[] primesum(int A) {

        int[] prime = primes(A);
        int[] ans = new int[2];

        for (int i = 2; i <= A; i++) {

            if (prime[i] == 0 && prime[A - i] == 0) {

                ans[0] = i;
                ans[1] = A - i;
                return ans;
            }
        }

        return ans;
    }
}
