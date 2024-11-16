class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n-k+1];

        for(int i=0; i<n-k+1; i++){
            int max = 0;
            for(int j=i; j<k+i; j++){
                if(j == i || nums[j] == nums[j-1]+1){
                    max = Math.max(max, nums[j]);
                }else{
                    max = -1;
                    break;
                }
                
            }
            result[i] = max;
        }
        return result;
    }
}
