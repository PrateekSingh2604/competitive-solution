class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int n = differences.length;
        int minVal = 0;
        int maxVal = 0;
        int curr = 0; 

        for(int i = 0; i<n; i++){
            curr = curr + differences[i];
            minVal = Math.min(minVal, curr);
            maxVal = Math.max(maxVal, curr);

            if((upper-maxVal)-(lower-minVal)+1 <= 0){
                return 0;
            }
        }
        return (upper-maxVal)-(lower-minVal)+1;
    }
}
