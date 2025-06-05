class Solution {

    char dfs(Map<Character, List<Character>> adj, char ch, boolean[] visited){
        visited[ch-'a'] = true;

        char minChar = ch;
        for(char v: adj.getOrDefault(ch, new ArrayList<>())){
            if(visited[v-'a'] == false){
                char nextMin = dfs(adj, v, visited);
                if(nextMin < minChar){
                    minChar = nextMin;
                }
            }
        }
        return minChar;
    }

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int n = s1.length();
        int m = baseStr.length();

        Map<Character, List<Character>> adj = new HashMap<>();
        for(int i = 0; i<n; i++){
            char u = s1.charAt(i);
            char v = s2.charAt(i);

            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < m; i++){
            char ch = baseStr.charAt(i);
            boolean[] visited = new boolean[26];

            char minChar = dfs(adj, ch, visited);
            result.append(minChar);
        }
        return new String(result);
    }
}
