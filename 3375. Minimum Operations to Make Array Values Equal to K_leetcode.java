class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            if(num < k){
                return -1;
            }
            set.add(num);
        }
        if(set.contains(k)){
            return set.size() - 1;
        }
        return set.size();
    }
}
