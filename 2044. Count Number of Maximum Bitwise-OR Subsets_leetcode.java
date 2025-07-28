class Solution {
    public int countSubSet(int idx, int currOr, int maxOr, int[] nums){
        if(idx == nums.length){
            if(currOr == maxOr){
                return 1;

            }else{
                return 0;
            }
            }
            int taken = countSubSet(idx+1, currOr | nums[idx], maxOr, nums);
            int notTaken = countSubSet(idx+1, currOr, maxOr, nums);

            return taken + notTaken;
        
    }
    public int countMaxOrSubsets(int[] nums) {
        int result = 0;
        int maxOr = nums[0];
        int n = nums.length;

        for(int i=1; i<n; i++){
            maxOr |= nums[i];
        }
        int currOr = 0;
        
        return countSubSet(0, currOr, maxOr, nums);
    }
}


class Solution {
  public int countMaxOrSubsets(int[] nums) {
    final int ors = Arrays.stream(nums).reduce((a, b) -> a | b).getAsInt();
    dfs(nums, 0, 0, ors);
    return ans;
  }

  private int ans = 0;

  private void dfs(int[] nums, int i, int path, final int ors) {
    if (i == nums.length) {
      if (path == ors)
        ++ans;
      return;
    }

    dfs(nums, i + 1, path, ors);
    dfs(nums, i + 1, path | nums[i], ors);
  }
}
