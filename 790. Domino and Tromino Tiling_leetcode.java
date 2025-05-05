class Solution {

    public int numTilings(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 5;

        final int M = 1000000007;
        int[] dp = new int[n+1];
        
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;

        for(int i = 4; i<=n; i++){
            dp[i] = (int)((2*dp[i-1])%M+dp[i-3]%M)%M;
        }
        return dp[n];
    }
}
