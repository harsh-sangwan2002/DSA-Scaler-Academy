public class special_subsequences {

    public int solve(String A) {

        long count = 0, mod = (long) (1e9 + 7);
        int a = 0;

        for (int i = 0; i < A.length(); i++) {

            char ch = A.charAt(i);

            if (ch == 'A')
                a++;

            else if (ch == 'G')
                count = (count + a) % mod;
        }

        return (int) count;
    }
}
