class Solution {
    public int countLargestGroup(int n) {
        int[] count = new int[9*4+1];
        for(int i = 1; i<=n; i++){
            ++count[getDigitSum(i)];
        }

        int max = 0;
        for(int c: count){
            max=Math.max(max, c);
        }
        int ans = 0;
        for(int c: count){
            if(c==max){
                ans++;
            }
        }
        return ans;
    }

    private int getDigitSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
