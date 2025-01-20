class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer, Pair<Integer, Integer>> map = new HashMap<>();
        HashMap<Integer, Integer> countRow = new HashMap<>();
        HashMap<Integer, Integer> countCol = new HashMap<>();

        int m = mat.length;
        int n = mat[0].length;
        for(int i = 0; i<m; i++){
            for(int j=0; j<n; j++){
                map.put(mat[i][j], new Pair<>(i,j));
            }
        }

        for(int i = 0; i<arr.length; i++){
            Pair index = map.get(arr[i]);
            
            int r = (int)index.getKey();
            int c = (int)index.getValue();
            mat[r][c] = 0;

            if(countRow.containsKey(r)){
                countRow.put(r, countRow.get(r)+1);
            }else{
                countRow.put(r, 1);
            }

            if(countCol.containsKey(c)){
                countCol.put(c, countCol.get(c)+1);
            }else{
                countCol.put(c, 1);
            }
            if(countRow.get(r) == n){
                return i;
            }else if(countCol.get(c) == m){
                return i;
            }

        }
        return -1;
    }
}
