class Solution {


    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;

        while(k-->0){
            Pair<Integer, Integer> min = new Pair<>(Integer.MAX_VALUE, Integer.MAX_VALUE);
            for(int i = 0; i<n; i++){
                if(nums[i] < min.getKey()){
                    min = new Pair(nums[i], i);
                }
            }
            nums[min.getValue()] = multiplier*min.getKey();
        }
        return nums;
    }
}
