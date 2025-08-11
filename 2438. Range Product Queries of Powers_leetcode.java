class Solution {
    int M = 1_000_000_007;
    public int[] productQueries(int n, int[][] queries) {
        List<Integer> powers = new ArrayList<>();

        for(int i = 0; i<32; i++){
            if((n & (1 << i)) != 0){
                powers.add(1 << i);
            }
        }

        int m = queries.length;
        int[] answers = new int[m];

        for(int j = 0; j<m; j++){
            int start = queries[j][0];
            int end = queries[j][1];

            long product = 1;
            for(int i = start; i<=end; i++){
                product = (product * (long)powers.get(i))%M;
            }

            answers[j] = (int) product;
        }

        return answers;
    }
}
