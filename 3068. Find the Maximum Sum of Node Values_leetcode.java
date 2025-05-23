class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        int count = 0;
        long sum = 0;
        long loss = Integer.MAX_VALUE;
        int n = nums.length;

        for(int i = 0; i<n; i++){
            if((nums[i]^k) > nums[i]){
                nums[i] = nums[i]^k;
                count++;
            }
            if((nums[i]^k) < nums[i]){
                loss = Math.min(loss, (long) nums[i] - (nums[i]^k));
            }
        }
        for(int num: nums){
            sum += num;
        }
        if(count%2 != 0){
            sum = (long) sum - loss;
        }
        return sum;
    }
}
