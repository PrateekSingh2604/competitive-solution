class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;
        int min = Integer.MAX_VALUE;
        long result = 0;

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j]<0){
                    count++;
                    matrix[i][j] = matrix[i][j]*(-1);
                }
                min = Math.min(min, matrix[i][j]);
                result += (long) matrix[i][j];
            }
        }
        
        if(count%2 != 0){
            result = result - (long)(2*min);
        }
        return result;

    }
}
