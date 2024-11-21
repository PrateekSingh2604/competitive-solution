class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        for(int[] guard: guards){
            int i = guard[0];
            int j = guard[1];
            grid[i][j] = 2;

        }
        for(int[] wall: walls){
            int i = wall[0];
            int j = wall[1];
            grid[i][j] = 3;
        }
        for(int[] guard: guards){
            int i = guard[0];
            int j = guard[1];
            solve(i, j, grid);
        }
        int result = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 0){
                    result++;
                }
            }
        }
        return result;

    }

    private void solve(int row, int col, int[][] grid){
        for(int i=row-1; i>=0; i--){
            if(grid[i][col] == 2 || grid[i][col] == 3){
                break;
            }
            grid[i][col] = 1;
        }
        for(int i=row+1; i<grid.length; i++){
            if(grid[i][col] == 2 || grid[i][col] == 3){
                break;
            }
            grid[i][col] = 1;
        }
        for(int i=col+1; i<grid[0].length; i++){
            if(grid[row][i] == 2 || grid[row][i] == 3){
                break;
            }
            grid[row][i] = 1;
        }
        for(int i=col-1; i>=0; i--){
            if(grid[row][i] == 2 || grid[row][i] == 3){
                break;
            }
            grid[row][i] = 1;
        }
    }
}
