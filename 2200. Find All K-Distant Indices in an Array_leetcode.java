class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i<n; i++){
            int dis = 0;
            for(int j = 0; j<n; j++){
                if(nums[j] == key && Math.abs(i-j) <= k){
                    result.add(i);
                    break;
                }
                dis++;
            }
        }
        return result;
    }
}
