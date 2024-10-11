class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int targetArrive = times[targetFriend][0];

        Arrays.sort(times, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> emptyChair = new PriorityQueue<>();
        PriorityQueue<Pair<Integer, Integer>> occupied = new PriorityQueue<>((a, b) -> a.getKey() - b.getKey());

        int chair=0;
        for(int[] time: times){
            while(!occupied.isEmpty() && occupied.peek().getKey() <= time[0]){
                emptyChair.add(occupied.poll().getValue());
            }
            if(emptyChair.isEmpty()){
                occupied.add(new Pair<>(time[1], chair));
                if(time[0] == targetArrive){
                    return chair;
                }
                chair++;
            }else{
                int free = emptyChair.poll();
                if(targetArrive == time[0]){
                    return free;
                }
                occupied.add(new Pair<>(time[1], free));
            }
        }
        return -1;
    }
}
