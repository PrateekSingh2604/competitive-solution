class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n = words.length;
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i<n; i++){
            for(char c: words[i].toCharArray()){
                if(c == x){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}
