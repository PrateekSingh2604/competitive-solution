class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int result = 0;
        int n = values.length;
        int max=0;
        
        for(int j=1; j<n; j++){
            max = Math.max(values[j-1] + (j-1), max);
            result = Math.max(result, max + values[j]-j);
        }
        return result;
    }
}
