class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int result = 0;

        int count = 0;
        for(int i=0; i<n; i++){
            count += nums[i];
            if(i < n-1 && nums[i] >= nums[i+1]){
                result = Math.max(result, count);
                count = 0;
            }
        }
        result = Math.max(result, count);
        return result;
    }
}
