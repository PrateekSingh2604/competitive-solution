class Solution {
    public int countSubarrays(int[] nums) {
        int result = 0;
        int n = nums.length;
        for(int i = 0; i<n-2; i++){
            if(nums[i+1]%2 == 0 && nums[i]+nums[i+2] == nums[i+1]/2){
                result++;
            }
        }
        return result;
    }
}
