class Solution {
    int M = 1_000_000_007;
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int l = 0;
        int r = n-1;

        int[] power = new int[n];
        power[0] = 1;
        for(int i = 1; i<n; i++){
            power[i] = (power[i-1] * 2)%M;
        }
        int result = 0;

        while(l<=r){
            if(nums[l]+nums[r] <= target){
                result = (result%M + power[r-l]%M)%M;
                l++;
            }else{
                r--;
            }
        }
        return result;
    }
}
