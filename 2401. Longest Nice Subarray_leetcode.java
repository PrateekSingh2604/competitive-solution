class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int result = 0;

        int i = 0;
        int j = 0;
        int mask = 0;
         while(j < n) {
            while((mask & nums[j]) != 0) { //keep shrinking
                mask = (mask ^ nums[i]);
                i++;
            }
            
            result = Math.max(result, j - i + 1);
            mask = (mask | nums[j]);
            j++;
        }
        return result;
    }
}
