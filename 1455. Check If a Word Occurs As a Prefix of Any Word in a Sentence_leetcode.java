class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s = sentence.split(" ");
        int m = s.length;
        int n = searchWord.length();
        
        for(int i=0; i<m; i++){
            for(int j=0; j<s[i].length(); j++){
                if(s[i].charAt(j) != searchWord.charAt(j)){
                    break;
                }
                if(j==n-1){
                    return i+1;
                }
            }
        }
        return -1;
    }
}
