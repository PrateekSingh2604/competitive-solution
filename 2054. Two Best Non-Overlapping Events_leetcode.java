class Solution {
    int n;
    int t[][] = new int[100001][3];
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a,b) -> a[0] - b[0]);
        for(int[] dp: t){
            Arrays.fill(dp, -1);
        }
        n = events.length;
        int count = 0;
        return solve(events, 0, count);
    }

    public int solve(int[][] events, int i, int count){
        if(count == 2 ||  i >= n){
            return 0;
        }
        if(t[i][count] != -1){
            return t[i][count];
        }
        int nextValidIndex = binarySearch(events, events[i][1]);
        int attend = events[i][2] + solve(events, nextValidIndex, count+1);
        int not_attend = solve(events, i+1, count);

        return t[i][count] = Math.max(attend, not_attend);
    }
    public int binarySearch(int[][] events, int endTime){
        int l = 0;
        int r = n-1;

        int result = n;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(events[mid][0] > endTime){
                result = mid;
                r = mid - 1;

            }else{
                l = mid+1;
            }
        }
        return result;
    }
}
