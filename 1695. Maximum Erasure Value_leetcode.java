class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int ans = 0;
        int n = nums.length;
        HashSet<Integer> value = new HashSet<>();

        int i = 0;
        int j = 0;
        int sum = 0;

        while (j < n) {
            sum += nums[j];
            while (value.contains(nums[j])){
                sum -= nums[i];
                value.remove(nums[i]);
                i++;
            }
            ans = Math.max(ans, sum);
            value.add(nums[j]);
            j++;
        }
        return ans;
    }
}
