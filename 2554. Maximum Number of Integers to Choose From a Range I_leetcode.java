class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> ban = new HashSet<>();
        for(int i: banned){
            ban.add(i);
        }
        int result = 0;
        int sum = 0;

        for(int i=1; i<=n; i++){
            if(ban.contains(i)){
                continue;
            }
            sum += i;
            if(sum > maxSum){
                return result;
            }
            result++;
        }
        return result;
    }
}
