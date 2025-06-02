class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;

        int[] leftRight = new int[n];
        Arrays.fill(leftRight, 1);

        for(int i = 1; i<n; i++){
            if(ratings[i] > ratings[i-1]){
                leftRight[i] = Math.max(leftRight[i], leftRight[i-1]+1);
            }
            if(ratings[n-i-1] > ratings[n-i]){
                leftRight[n-i-1] = Math.max(leftRight[n-i-1], leftRight[n-i]+1); 
            }
        }
        int ans = 0;
        for(int i = 0; i<n; i++){
            ans += leftRight[i];
        }   
        return ans;
    }
}
