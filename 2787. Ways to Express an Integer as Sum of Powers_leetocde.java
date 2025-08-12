class Solution {
    int M = 1_000_000_007;
    int[][] dp = new int[301][301];

    public int numberOfWays(int n, int x) {
        return solve(n, 1, x);
    }

    int solve(int n, int num, int x){
        if(n == 0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        int currPow = (int)Math.pow(num, x);
        if(currPow > n){
            return 0;
        }
        if(dp[n][num] != 0){
            return dp[n][num];
        } 

        int take = solve(n-currPow, num+1, x);
        int skip = solve(n, num+1, x);

        return dp[n][num] = (take+skip)%M;
    }
}
