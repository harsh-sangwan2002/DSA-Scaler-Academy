public class nCr {
    
    public int solve(int A, int B, int C) {

        int[][] dp = new int[A+1][B+1];

        for(int i=0; i<dp.length; i++){

            for(int j=0; j<=B; j++){

                if(i==0 || i==1 || j==0 || j==i)
                dp[i][j] = 1;

                else 
                dp[i][j] = (dp[i-1][j-1]+dp[i-1][j])%C;
            }
        }

        return dp[A][B];
    }
}
