class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int firstBit = 0;
        int currBit = 0;
        int n = derived.length;
        for(int i = 0; i < n; i++){
            if(i == (n-1) && derived[i] != (firstBit ^ currBit)){
                return false;
            }
            if(derived[i] == (currBit^1)){
                currBit = 1;
            }else{
                currBit = 0;
            }
        }
        return true;
    }
}
