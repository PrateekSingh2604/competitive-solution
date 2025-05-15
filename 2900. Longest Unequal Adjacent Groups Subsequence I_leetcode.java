class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        ArrayList<String> result = new ArrayList<>();

        int group = -1;
        for(int i = 0; i<words.length; i++){
            if(groups[i] != group){
                group = groups[i];
                result.add(words[i]);
            }
        }
        return result;

    }
}
