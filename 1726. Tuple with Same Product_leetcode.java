class Solution {
    public int tupleSameProduct(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int prod = nums[i]*nums[j];

                if(map.containsKey(prod)){
                    result += map.get(prod)*8;
                }

                map.merge(prod, 1, Integer::sum);
            }
        }

        return result;

    }
}
