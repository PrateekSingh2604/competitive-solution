class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int result = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] == 0 && i+2 < n){
                nums[i] = 0;
                nums[i+1] = (nums[i+1] == 0)? 1: 0;
                nums[i+2] = (nums[i+2] == 0)? 1: 0;
                result++;
            }
            else if(nums[i] == 0){
                return -1;
            }
        }
        return result;
    }
}
