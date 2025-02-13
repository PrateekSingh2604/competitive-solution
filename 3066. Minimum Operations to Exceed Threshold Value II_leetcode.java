class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> q = new PriorityQueue<>();
        int n = nums.length;
        int operations = 0;

        for(int num: nums){
            q.add((long)num);
        }

        while(q.size() >= 2 && q.peek() < k){
            long first = q.poll();
            long second = q.poll();

            long value = Math.min(first, second)*2 + (Math.max(first, second));
            System.out.println(value);
            q.add(value);
            operations++;

        }
        return operations;
    }
}
