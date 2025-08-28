class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        for(int i = 0; i<n; i++){
            solve(i, 0, grid, false);
        }
        for(int j = 1; j<n; j++){
            solve(0, j, grid, true);
        }
        return grid;
    }

    public void solve(int r, int c, int[][] grid, boolean asc){
        int n = grid.length;
        ArrayList<Integer> arr= new ArrayList<>();

        int i = r;
        int j = c;
        while(i<n && j<n){
            arr.add(grid[i][j]);
            i++;
            j++;
        }

        if(asc){
            Collections.sort(arr);
        }
        else{
            Collections.sort(arr, Collections.reverseOrder());
        }

        i = r;
        j = c;
        for(int e: arr){
            grid[i][j] = e;
            i++;
            j++;
        }
        return;
    }
}
