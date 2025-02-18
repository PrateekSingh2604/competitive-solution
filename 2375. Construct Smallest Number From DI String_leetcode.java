class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        int count = 0;
        for (int i = 0; i <= n; i++) {
            stack.push(count);
            if (((i == n) || pattern.charAt(i) == 'I')) {
                while(!stack.isEmpty()){
                    result.append((char) ('1' + stack.pop()));
                }
                
            }
            count++;
        }
        return new String(result);

    }
}
