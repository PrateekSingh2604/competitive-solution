class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i = 0; i<n; i++){
            if(Character.isDigit(s.charAt(i)) && !stack.isEmpty()){
                stack.pop();
            }
            else if(!Character.isDigit(s.charAt(i))){
                stack.push(s.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        result.reverse();
        return new String(result);
    }
}
