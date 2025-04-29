class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = 0;
        int count = 0;
        int n = nums.length;
        
        for(int num: nums){
            max = Math.max(max, num);
        }
        for(int num: nums){
            count = (num == max)?count+1:count;
        }
        
        if(count < k){
            return 0;
        }

        long ans = 0;
        int i = 0;
        int j = 0;
        count = 0;

        while(i<n){
            while(count >= k){
                ans += (n-j+1);//4
                count = (nums[i] == max)?count-1:count;
                i++;
            }
            if(j>=n){
                break;
            }
            count = (nums[j] == max)?count+1:count;
            j++;

        }
        return ans;
    }
}
