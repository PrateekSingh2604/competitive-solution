class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        
        for(String a: words){
            for(String b: words){
                if(a.length()<b.length() && b.indexOf(a) != -1){
                    result.add(a);
                    break;
                }
            }
        }
        return result;

    }
}
