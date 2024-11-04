class Solution {
    public String compressedString(String word) {
        int n = word.length();
        StringBuilder comp = new StringBuilder();
        int count = 1;
        for(int i=1; i<n; i++){
            if(word.charAt(i-1) != word.charAt(i) || count == 9){
                comp.append(count);
                comp.append(word.charAt(i-1));
                count = 1;
                continue;
            }
            count++;
        }
        comp.append(count);
        comp.append(word.charAt(n-1));
        return new String(comp);
    }
}
