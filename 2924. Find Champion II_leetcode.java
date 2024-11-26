class Solution {
    public int findChampion(int n, int[][] edges) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int result = -1;
        int[] degree = new int[n];
        
        for(int[] edge: edges){
            int v = edge[1];
            degree[v]++;
        }

        for(int i = 0; i<n; i++){
            if(degree[i] == 0){
                result = i;
                count++;
            }
        }
        
        return count>1? -1: result;
    }
}
