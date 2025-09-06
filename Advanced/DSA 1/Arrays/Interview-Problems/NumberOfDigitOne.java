// TC -> O(log(N))
// SC -> O(1)

public class NumberOfDigitOne {

    public int solve(int A) {

        int ans = 0;

        for (int i = 1; i <= A; i *= 10) {

            int divider = i * 10;
            ans += (A / divider) * i + Math.min(Math.max(A % (divider) - (i - 1), 0), i);
        }

        return ans;
    }
}
