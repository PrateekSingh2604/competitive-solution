class Solution {
    public boolean canConstruct(String s, int k) {
        int n = s.length();
        if(n<k){
            return false;
        }
        if(n==k){
            return true;
        }
        int[] alpha = new int[26];

        for(int a: s.toCharArray()){
            alpha[a-'a']++;
        }

        int countOdd = 0;
        for(int i = 0; i<26; i++){
            if(alpha[i]%2 != 0){
                countOdd++;
            }
        }

        return countOdd <= k;
    }
}
