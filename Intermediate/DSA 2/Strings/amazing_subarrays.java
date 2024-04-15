public class amazing_subarrays {

    public int solve(String A) {

        long ans = 0, mod = (long) (1e4 + 3);

        for (int i = 0; i < A.length(); i++) {

            char ch = A.charAt(i);
            int count = 0;

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count = A.length() - i;

            else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                count = A.length() - i;

            ans = (ans + count) % mod;
        }

        return (int) ans;
    }
}
