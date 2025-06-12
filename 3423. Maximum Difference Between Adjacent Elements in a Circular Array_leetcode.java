class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int result = 0;
        int n = nums.length;

        for(int i = 0; i<n; i++){
            result = Math.max(result, Math.abs(nums[i]-nums[(i+1)%n]));
        }
        return result;
    }
}
