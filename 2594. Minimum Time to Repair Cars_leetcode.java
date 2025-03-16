class Solution {
    private boolean isPossible(int[] ranks, long mid, int cars){
        long carsFixed = 0;
        for(int rank: ranks){
            carsFixed += Math.sqrt(mid/rank);
        }
        return (carsFixed >= cars);
    }
    public long repairCars(int[] ranks, int cars) {
        int n = ranks.length;

        long l = 1;
        int maxR = 0;
        for(int rank: ranks){
            maxR = Math.max(maxR, rank);
        }
        long r = (long) maxR * cars*cars;
        long result = -1;

        while(l <= r){
            long mid = l+(r-l)/2;
            if(isPossible(ranks, mid, cars)){
                result = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return result;
    }
}
