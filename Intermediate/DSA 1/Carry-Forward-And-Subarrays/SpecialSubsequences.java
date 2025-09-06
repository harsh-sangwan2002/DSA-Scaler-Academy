// TC -> O(N)
// SC -> O(1)

public class SpecialSubsequences {

    public int solve(String A) {

        long mod = (long) (1e9 + 7);
        long countA = 0L, countAG = 0L;

        for (char ch : A.toCharArray()) {

            if (ch == 'A')
                countA = (countA + 1) % mod;

            else if (ch == 'G')
                countAG = (countAG + countA) % mod;
        }

        return (int) countAG;
    }
}
