class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int result = 0;
        int[] flip = new int[n];

        for(int[] mat: matrix){
            boolean check = true;
            for(int i=0; i<n; i++){
                if(mat[0] != mat[i]){
                    check = false;
                    break;
                }
            }
            if(check){
                result++;
            }
        }
        System.out.println(result);
        for(int[] mat: matrix){
            int count = 0;
            for(int i = 0; i<n; i++){
                flip[i] = (mat[i] == 0)? 1: 0;
            }
            for(int i = 0; i<m; i++){
                if(Arrays.equals(flip, matrix[i]) || Arrays.equals(mat, matrix[i])){
                    count++;
                }
            }

            result = Math.max(result, count);
            
        }
        return result;
    }
}
