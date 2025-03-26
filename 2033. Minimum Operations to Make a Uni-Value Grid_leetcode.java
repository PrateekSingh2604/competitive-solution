class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int[] arr = new int[m*n];
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                arr[i*n+j] = grid[i][j];
            }
        }

        for(int i = 0; i<arr.length; i++){
            if((arr[0]-arr[i])%x != 0){
                return -1;
            }
        }

        Arrays.sort(arr);
        int result = 0;
        for(int i = 0; i<arr.length; i++){
            result += Math.abs(arr[i] - arr[arr.length/2])/x;
        }
        return result;
    }
}
