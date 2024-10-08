class Solution {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();

        for(Character c: s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
                continue;
            }
            if(c==']' && stack.peek() == '['){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        if(stack.size()%2==0){
            return ((stack.size()/2)+1)/2;
        }
        else{
            return (stack.size()/2)/2;
        }
    }
}
