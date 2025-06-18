class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int[][] result = new int[n/3][3];
        for(int i = 0; i<n; i+=3){
            if((nums[i+1]-nums[i] > k) || (nums[i+2]-nums[i+1] > k) || (nums[i+2]-nums[i] > k)){
                return new int[0][0];
            }
            
            int groupIndex = i / 3;
            result[groupIndex][0] = nums[i];
            result[groupIndex][1] = nums[i + 1];
            result[groupIndex][2] = nums[i + 2];
        }
        return result;
    }
}
