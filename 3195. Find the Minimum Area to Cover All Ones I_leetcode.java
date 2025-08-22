class Solution {
    public int minimumArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int row = 0;
        int col = 0;

        int minCol = Integer.MAX_VALUE;
        int maxCol = Integer.MIN_VALUE;
        int minRow = Integer.MAX_VALUE;
        int maxRow = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(grid[i][j] == 1){
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                }
            }
        }

        col = maxCol - minCol + 1;
        row = maxRow - minRow + 1;


        return row*col;
    }
}
