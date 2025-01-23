class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int[] rowServer = new int[m];
        int[] colServer = new int[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    rowServer[i]++;
                    colServer[j]++;
                }
            }
        }

        int result = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && (rowServer[i] > 1 || colServer[j] > 1)){
                    result++;
                }
            }
        }

        return result;
    }
}
