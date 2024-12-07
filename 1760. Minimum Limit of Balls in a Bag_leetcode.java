class Solution {
    public boolean isPossible(int[] nums, int maxOp, int mid){
        int totalOpr = 0;

        for(int num: nums){
            int ops = num/mid;
            if(num%mid == 0){
                ops -= 1;
            }
            totalOpr += ops;
        }
        return totalOpr <= maxOp;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int l = 1;
        int r = 0;
        for(int num: nums){
            r = Math.max(r, num);
        }
        int result = r;
        while(l <= r){
            int mid = l + (r-l)/2;

            if(isPossible(nums, maxOperations, mid)){
                result = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return result;

    }
    
}
