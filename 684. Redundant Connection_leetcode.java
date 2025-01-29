class Solution {
    public boolean dfs(HashMap<Integer, List<Integer>> graph, int u, int v, boolean[] visited){
        visited[u] = true;
        if(u==v){
            return true;
        }
        for(int ngbr: graph.get(u)){
            
            if(visited[ngbr]){
                continue;
            }
            if(dfs(graph, ngbr, v, visited)){
                return true;
            }
        }
        return false;
    }
    public int[] findRedundantConnection(int[][] edges) {
        int m = edges.length;
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        
        
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            if(graph.containsKey(u) && graph.containsKey(v)){
                boolean[] visited = new boolean[m+1];
                if( dfs(graph, u, v, visited)){
                    return edge;
                }
                
            }
            
            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return new int[0];  

    }
    
}
