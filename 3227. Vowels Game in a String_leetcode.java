class Solution {
    public boolean doesAliceWin(String s) {
        int vowelsCount = 0;

        for(char c: s.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowelsCount++;
            }
        }

        if(vowelsCount > 0){
            return true;
        }
        return false;
    }
}
