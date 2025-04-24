class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        int ans = 0;
        HashSet<Integer> count = new HashSet<>();
        for(int num: nums){
            count.add(num);
        }
        int arrSize = count.size();
        count.clear();

        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                count.add(nums[j]);
                if(count.size() == arrSize){
                    ans++;
                }else if(count.size() > arrSize){
                    break;
                }           
            }
            count.clear();
        }
        return ans;

    }
}
