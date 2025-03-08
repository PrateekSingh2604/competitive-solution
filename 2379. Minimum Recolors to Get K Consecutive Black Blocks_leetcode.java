class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int result = Integer.MAX_VALUE;

        for(int i = 0; i<=n-k; i++){
            int count = 0;
            for(int j = i; j < k+i; j++){
                if(blocks.charAt(j) == 'W'){
                    count++;
                }
            }
            System.out.println();
            result = Math.min(result, count);
        }
        return result;
    }
}
