class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        String ans = "";

        int max = -1;

        for(int i = 0; i<n-2; i++){
            StringBuilder curr = new StringBuilder();
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)){
                if(max < num.charAt(i)-'0'){
                    curr.append(num.charAt(i));
                    curr.append(num.charAt(i));
                    curr.append(num.charAt(i));

                    ans = new String(curr);
                    max = num.charAt(i)-'0';
                }
            }
        }
        return ans;
    }
}
