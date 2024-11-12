class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int n = queries.length;
        Arrays.sort(items, (a,b) -> a[0]-b[0]);
        int[] result = new int[n];
        Arrays.fill(result, 0);

        int maxSeen = items[0][1];
        for(int i=1; i<items.length; i++){
            items[i][1] = Math.max(items[i][1], maxSeen);
            maxSeen = items[i][1];
        }

        for(int i=0; i<n; i++){
            result[i] = bs(queries[i], items);
        }
        return result;
    }
    public int bs(int query, int[][] items){
        int result = 0;
        int l = 0;
        int r = items.length-1;
        while(l<=r){
            int m = l+ (r-l)/2;
            if(items[m][0]>query){
                r = m-1;
            }
            else{
                result = Math.max(result, items[m][1]);
                l = m+1;
            }
        }
        return result;

    }
}
