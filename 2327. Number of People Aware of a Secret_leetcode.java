class Solution {
    int M = 1_000_000_007;
    int[] t;
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int total = 0;
        t = new int[n+1];
        Arrays.fill(t, -1);

        for(int day = n-forget+1; day <= n; day++){
            total = (total + solve(day, delay, forget))%M;
        }
        return total;
    }

    int solve(int day, int delay, int forget){
        if(day == 1){
            return 1;
        }
        if(day <= 0){
            return 0;
        }
        if(t[day] != -1){
            return t[day];
        }
        long result = 0;

        for(int d = day-forget+1; d<=day-delay; d++){
            if(d > 0){
                result = (result+solve(d, delay, forget))%M;
            }
            
        }
        return t[day] = (int)result;

    }
}
