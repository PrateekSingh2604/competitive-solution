class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] visited = new int[n];
        List<Integer> safe = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(dfs(graph, visited, i)){
                safe.add(i);
            }
        }
        return safe;
    }
    public boolean dfs(int[][] graph, int[] visited, int node){
        if(visited[node] > 0){
            return visited[node] == 2;
        }
        visited[node] = 1;
        for(int ob: graph[node]){
            if(!dfs(graph, visited, ob)){
                return false;
            }
        }
        visited[node] = 2;
        return true;
    }
}
