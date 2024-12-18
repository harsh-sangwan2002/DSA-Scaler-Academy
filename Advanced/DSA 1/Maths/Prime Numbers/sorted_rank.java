public class sorted_rank {

    static long mod = 1000003;

    private long fact(int n) {

        if (n == 0 || n == 1)
            return 1L;

        return (n * fact(n - 1) * 1L) % mod;
    }

    public int findRank(String A) {

        long ans = 0L;

        for (int i = 0; i < A.length(); i++) {

            int count = 0;
            for (int j = i + 1; j < A.length(); j++) {

                if (A.charAt(j) < A.charAt(i))
                    count++;
            }

            ans = (ans + count * fact(A.length() - i - 1)) % mod;
        }

        return (int) ((ans + 1) % mod);
    }
}
