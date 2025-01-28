class Solution {
    public int findMaxFish(int[][] grid) {
        int m = grid[0].length;
        int n = grid.length;
        int[][] visited = new int[n][m];
        int result = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(grid[i][j] > 0){
                    result = Math.max(result, dfs(grid, visited, m, n, i, j));
                }
                
            }
        }
        return result;
    }
    public int dfs(int[][] grid, int[][] visited, int m, int n, int i, int j){
        // System.out.println(grid[i][j]);
        if(grid[i][j] == 0 || visited[i][j] == 1){
            return 0;
        }
        visited[i][j] = 1;

        int right = 0; 
        int down = 0;
        int left = 0;
        int up = 0;

        if(j < m-1){
            right = dfs(grid, visited, m, n, i, j+1);
        }
        if(i < n-1){
            down = dfs(grid, visited, m, n, i+1, j);
        }
        if(i > 0){
             up = dfs(grid, visited, m, n, i-1, j);
        }
        if(j > 0){
            left = dfs(grid, visited, m, n, i, j-1);
        }
        
        
        return grid[i][j] + right + down + up + left;
    }
}
