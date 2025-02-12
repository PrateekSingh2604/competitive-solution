class Solution {
    public int maximumSum(int[] nums) {
        final int kmax = 9 * 9;
        List<Integer>[] count = new ArrayList[kmax + 1];

        for(int i = 0; i<count.length; i++){
            count[i] = new ArrayList<>();
        }
        for(int num: nums){
            count[getDigitSum(num)].add(num);
        }
        int result = -1;
        for(List<Integer> c: count){
            if(c.size() < 2){
                continue;
            }
            Collections.sort(c, Collections.reverseOrder());
            result = Math.max(result, c.get(0)+c.get(1));
        }
        return result;
    }
    private int getDigitSum(int num){
        int sum = 0;
        while(num>0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
