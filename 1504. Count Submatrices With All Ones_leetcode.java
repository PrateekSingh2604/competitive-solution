class Solution {
    public int numSubmat(int[][] mat) {
        int m = mat[0].length;
        int n = mat.length;
        int ans = 0;

        for(int baseRow = 0; baseRow < n; ++baseRow){
            int[] row = new int[m];
            Arrays.fill(row, 1);

            for(int i = baseRow; i<n; ++i){
                for(int j = 0; j<m; ++j){
                    row[j] &= mat[i][j];
                }
                ans += count(row);
            }
        }
        return ans;
    }

    public int count(int[] row){
        int length = 0;
        int res = 0;

        for(int i = 0; i<row.length; i++){
            length = row[i] == 0 ? 0 : length+1;
            res += length;
        }
        return res;
    }
}
