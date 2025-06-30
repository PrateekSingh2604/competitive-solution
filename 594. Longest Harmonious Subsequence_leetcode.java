class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int num: nums){
            if(count.containsKey(num)){
                count.put(num, count.get(num)+1);
            }else{
                count.put(num, 1);
            }
        }

        int ans = 0;
        for(int num: count.keySet()){
            if(count.containsKey(num+1)){
                ans = Math.max(ans, count.get(num)+count.get(num+1));
            }
        }
        return ans;
    }
}
