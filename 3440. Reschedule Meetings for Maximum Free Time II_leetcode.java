class Solution {
    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        int n = startTime.length;
        List<Integer> freeArray = new ArrayList<>();

        freeArray.add(startTime[0]);
        for(int i = 1; i<n; i++){
            freeArray.add(startTime[i] - endTime[i-1]);
        }
        freeArray.add(eventTime - endTime[n-1]);

        int m = freeArray.size();
        int[] maxLeft = new int[m];
        int[] maxRight = new int[m];

        for(int i = m-2; i>=0; i--){
            maxRight[i] = Math.max(maxRight[i+1], freeArray.get(i+1));
        }
        for(int i = 1; i<m; i++){
            maxLeft[i] = Math.max(maxLeft[i-1], freeArray.get(i-1));
        }

        int result = 0;
        for(int i = 1; i<m; i++){
            int currEvent = endTime[i-1] - startTime[i-1];
            if(currEvent <= Math.max(maxLeft[i-1], maxRight[i])){
                result = Math.max(result, freeArray.get(i-1) + currEvent + freeArray.get(i));
            }
            result = Math.max(result, freeArray.get(i-1)+freeArray.get(i));
        }
        return result;
    }
}
