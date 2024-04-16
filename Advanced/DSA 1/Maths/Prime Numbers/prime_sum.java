public class prime_sum {

    public int[] primesum(int A) {

        boolean[] prime = new boolean[A + 1];

        for (int i = 2; i <= Math.sqrt(A); i++) {

            if (!prime[i]) {

                for (int j = i * i; j <= A; j += i)
                    prime[j] = true;
            }
        }

        int[] res = new int[2];

        for (int i = 2; i <= A; i++) {

            if (!prime[i] && !prime[A - i]) {

                res[0] = i;
                res[1] = A - i;
                return res;
            }
        }

        return res;
    }
}
