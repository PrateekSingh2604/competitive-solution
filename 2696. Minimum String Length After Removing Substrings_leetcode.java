class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            if((stack.peek() == 'A' && s.charAt(i) == 'B') || (s.charAt(i) == 'D' && stack.peek() == 'C')){
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i));
        }
        return stack.size();
    }
}
