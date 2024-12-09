class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int m = queries.length;
        List<Integer> vi = new ArrayList<>();
        boolean[] ans = new boolean[m];

        for(int i=0; i<n-1; i++){
            if(nums[i]%2 == nums[i+1]%2){
                vi.add(i+1);
            }
        }

        for(int i=0; i<m; i++){
            int start = queries[i][0]+1;
            int end = queries[i][1];

            if(binarySearch(vi, start, end)){
                ans[i] = false;
            }else{
                ans[i] = true;
            }
        }
        return ans;
    }

    public boolean binarySearch(List<Integer> vi, int start, int end){
        int l = 0;
        int r = vi.size()-1;

        while(l <= r){
            int mid = l + (r-l)/2;
            if(vi.get(mid) < start){
                l = mid + 1;
            }else if(vi.get(mid) > end){
                r = mid -1;
            }else{
                return true;
            }
        }
        return false;
    }
}
