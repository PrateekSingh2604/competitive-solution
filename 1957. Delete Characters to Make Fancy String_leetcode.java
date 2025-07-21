class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if((sb.length() < 2) || sb.charAt(sb.length()-1) != c || sb.charAt(sb.length() - 2) != c){
                sb.append(c);
            }

        }
        return new String(sb);
    }
}


class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        ans.append(s);
        
        int i = 0;
        while(i < (ans.length()-2)){
            if(ans.charAt(i) == ans.charAt(i+1) && ans.charAt(i+1) == ans.charAt(i+2)){
                ans.deleteCharAt(i+2);
                continue;
            }

            i++;
        }
        return new String(ans);
    }
}
