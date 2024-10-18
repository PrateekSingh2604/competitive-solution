class Solution {
    public int countSubSet(int idx, int currOr, int maxOr, int[] nums){
        if(idx == nums.length){
            if(currOr == maxOr){
                return 1;

            }else{
                return 0;
            }
            }
            int taken = countSubSet(idx+1, currOr | nums[idx], maxOr, nums);
            int notTaken = countSubSet(idx+1, currOr, maxOr, nums);

            return taken + notTaken;
        
    }
    public int countMaxOrSubsets(int[] nums) {
        int result = 0;
        int maxOr = nums[0];
        int n = nums.length;

        for(int i=1; i<n; i++){
            maxOr |= nums[i];
        }
        int currOr = 0;
        
        return countSubSet(0, currOr, maxOr, nums);
    }
}
