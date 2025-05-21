class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();

        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        Iterator rowValue = row.iterator();
        while(rowValue.hasNext()){
            int v = (int)rowValue.next();

            for(int i = 0; i<m; i++){
                matrix[v][i] = 0;
            }
        }

        Iterator colValue = col.iterator();
        while(colValue.hasNext()){
            int v = (int)colValue.next();

            for(int i = 0; i<n; i++){
                matrix[i][v] = 0;
            }
        }
    }
}
