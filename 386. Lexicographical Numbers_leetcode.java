class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();

        for(int i = 1; i<=9; i++){
            dfs(result,i, n);
        }
           
            return result;
    }

    public void dfs(List<Integer> result, int i, int n){
        if(i>n) return;

        result.add(i);

        for(int j=0; j<=9; j++){
            int next = i*10+j;
            if(next > n) return;
            dfs(result, next, n);
        }
        return;
    }
}
