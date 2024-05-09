public class Solution {
    public int climbStairs(int A) {

        long mod = (long)(1e9+7);
        long[] dp = new long[A+1];
        dp[0] = 1L; dp[1] = 1L;

        for(int i=2; i<=A; i++)
        dp[i] = (dp[i-1]+dp[i-2])%mod;

        return (int)dp[A];
    }
}
