class Solution {
    public long countBadPairs(int[] nums) {
        long result = 0;
        Map<Integer, Long> count = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(count.containsKey(nums[i]-i)){
                result += i-count.get(nums[i]-i);
            }
            else{
                result += i;
            }
            count.merge(nums[i]-i, 1L, Long::sum);
        }
        return result;
    }
}
