class Solution {
    public int minOperations(String[] logs) {
        Stack<String> s = new Stack<>();
        int result = 0;
       
        for(String log: logs){
            if(log.equals("../")){
                if(s.isEmpty()){
                    continue;
                }
                s.pop();
            }
            else if(log.equals("./")){
                continue;
            }else{
                s.push(log);
            }
        }
        if(s.isEmpty()){
            return 0;
        }else{
            while(!s.isEmpty()){
                s.pop();
                result++;
            }
        }
        return result;
    }
}
