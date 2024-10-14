class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = nums.length;
        long score = 0;

        for(int i=0; i<n; i++){
            pq.add((int)nums[i]);
        }
        for(int i=0; i<k; i++){
            score += pq.peek();
            pq.add((int)Math.ceil((double)pq.peek()/3));
            pq.poll();
        }
        return score;

    }
}
