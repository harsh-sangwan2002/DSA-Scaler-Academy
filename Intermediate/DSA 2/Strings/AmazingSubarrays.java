// TC -> O(N)
// SC -> O(1)

public class AmazingSubarrays {

    public int solve(String A) {

        int n = A.length(), ans = 0, mod = (int) (1e4 + 3);

        for (int i = 0; i < n; i++) {

            char ch = A.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                ans = (ans + A.length() - i) % mod;

            else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                ans = (ans + A.length() - i) % mod;
        }

        return ans;
    }
}
