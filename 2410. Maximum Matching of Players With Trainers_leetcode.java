class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int n = players.length;
        int m = trainers.length;

        Arrays.sort(players);
        Arrays.sort(trainers);

        int count = 0;
        int j = 0;

        for(int i = 0; i<n; i++){
            while(j<m){
                if(trainers[j] != -1 && players[i] <= trainers[j]){
                    count++;
                    trainers[j] = -1;
                    break;
                }
                j++;
            }
        }
        return count;
    }
}
