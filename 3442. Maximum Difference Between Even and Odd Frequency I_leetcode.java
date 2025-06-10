class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];

        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }

        int minEven = Integer.MAX_VALUE;
        int maxOdd = 0;

        for(int f: freq){
            if(f != 0 && f%2 == 0){
                minEven = Math.min(minEven, f);
            }else if(f != 0 && f%2 == 1){
                maxOdd = Math.max(maxOdd, f);
            }
        }

        return maxOdd - minEven;
    }
}
