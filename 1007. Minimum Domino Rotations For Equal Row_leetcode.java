class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int ans = Integer.MAX_VALUE;

        for(int i = 1; i<=6; i++){
            int swaps = find(tops, bottoms, i);
            if(swaps != -1){
                ans = Math.min(ans, swaps);
            }
        }

        return (ans == Integer.MAX_VALUE)?-1: ans;
    }

    private int find(int[] tops, int[] bottoms, int val){
        int n = tops.length;

        int topSwaps = 0;
        int bottomSwaps = 0;
        for(int i = 0; i<n; i++){
            
            if(tops[i] != val && bottoms[i] != val){
                return -1;
            }else if(tops[i] != val){
                topSwaps++;
            }else if(bottoms[i] != val){
                bottomSwaps++;
            }
        }
        return Math.min(topSwaps, bottomSwaps);
    }
}
