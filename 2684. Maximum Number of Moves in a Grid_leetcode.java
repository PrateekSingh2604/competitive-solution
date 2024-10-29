class Solution {
    public int maxMoves(int[][] grid) {
        int maxMoves = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] t = new int[rows][cols];
        for(int[] arr: t){
            Arrays.fill(arr, -1);
        }
        for (int j = 0; j < rows; j++) {
            maxMoves = Math.max(maxMoves, dfs(grid, j, 0, t));
        }

        return maxMoves;
    }

    public int dfs(int[][] grid, int i, int j, int[][] t) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (j == cols - 1) {
            return 0;
        }

        int maxPath = 0;
        if(t[i][j] != -1){
            return t[i][j];
        }

        if (i >= 0 && i < rows && j + 1 < cols && grid[i][j] < grid[i][j + 1]) {
            maxPath = Math.max(maxPath, 1 + dfs(grid, i, j + 1, t));
        }

        if (i + 1 < rows && j + 1 < cols && grid[i][j] < grid[i + 1][j + 1]) {
            maxPath = Math.max(maxPath, 1 + dfs(grid, i + 1, j + 1, t));
        }

        if (i - 1 >= 0 && j + 1 < cols && grid[i][j] < grid[i - 1][j + 1]) {
            maxPath = Math.max(maxPath, 1 + dfs(grid, i - 1, j + 1, t));
        }

        return t[i][j] = maxPath;
    }
}
