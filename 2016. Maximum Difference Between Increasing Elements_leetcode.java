class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int result = -1;

        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i]<nums[j]){
                    result = Math.max(result, nums[j]-nums[i]);
                }
            }
        }


        return result;
    }
}
