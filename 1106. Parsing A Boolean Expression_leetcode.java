class Solution {
    public char solve(List<Character> value, char opr){
        if(opr == '!'){
            return value.get(0) == 't'? 'f': 't';
        }
        if(opr == '&'){
            for(char c: value){
                if(c == 'f'){
                    return 'f';
                }
            }
        }
        if(opr == '|'){
            for(char c: value){
                if(c == 't'){
                    return 't';
                }
            }
        }
        return opr == '&'? 't': 'f';
    }

    public boolean parseBoolExpr(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for(int i=0; i<n; i++){
            if(s.charAt(i)==','){
                continue;
            }
            if(s.charAt(i) == ')'){
                List<Character> value = new ArrayList<>();
                while(st.peek() != '('){
                    value.add(st.pop());
                }
                st.pop();
                char opr = st.pop();
                st.push(solve(value, opr));
            }else{
                st.push(s.charAt(i));
            }
        }
        return st.peek() == 't';
    }
}
