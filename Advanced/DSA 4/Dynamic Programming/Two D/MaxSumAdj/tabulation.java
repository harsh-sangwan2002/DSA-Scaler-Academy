public class tabulation {
    
    public int adjacent(int[][] grid) {

        if (grid == null || grid[0].length == 0) {
            return 0;
        }

        int n = grid[0].length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = Math.max(grid[0][0], grid[1][0]);

        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(grid[0][i - 1] + dp[i - 2], grid[1][i - 1] + dp[i - 2]));
        }

        return dp[n];
    }
}
