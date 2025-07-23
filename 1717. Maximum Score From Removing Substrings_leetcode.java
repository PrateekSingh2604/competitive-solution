class Solution {
    String removeStr(String s, String matchStr){
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == matchStr.charAt(1) && !stack.isEmpty() && stack.peek() == matchStr.charAt(0)){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        StringBuilder remainStr = new StringBuilder();
        while (!stack.isEmpty()) {
            remainStr.append(stack.pop());
        }
        return remainStr.reverse().toString();
    }

    public int maximumGain(String s, int x, int y) {
        int n = s.length();
        int score = 0;

        String maxStr = (x > y) ? "ab": "ba";
        String minStr = new String();
        if(maxStr == "ab"){
            minStr = "ba";
        }else{
            minStr = "ab";
        }


        String temp_first = removeStr(s, maxStr);
        int L = temp_first.length();
        int charsRemoved = (n-L);
        score += (charsRemoved/2) * Math.max(x, y);

        String temp_second = removeStr(temp_first, minStr);
        charsRemoved = L - temp_second.length();
        score += (charsRemoved/2) * Math.min(x, y);

        return score;
    }
}
