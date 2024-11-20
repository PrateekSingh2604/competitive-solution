class Solution {
    public int takeCharacters(String s, int k) {
        int n = s.length();

        int count_a = 0;
        int count_b = 0;
        int count_c = 0;
        for(char c: s.toCharArray()){
            if(c=='a'){
                count_a++;
            }else if(c=='b'){
                count_b++;
            }else{
                count_c++;
            }
        }
        if(count_a<k || count_b<k || count_c<k){
            return -1;
        }


        int i = 0;
        int j = 0;
        int nondeleted = 0;
        while(j<n){
            if(s.charAt(j) == 'a'){
                count_a--;
            }else if(s.charAt(j) == 'b'){
                count_b--;
            }else{
                count_c--;
            }
            while(i<=j && (count_a < k || count_b<k || count_c < k)){
                if(s.charAt(i) == 'a'){
                    count_a++;
                }else if(s.charAt(i) == 'b'){
                    count_b++;
                }else{
                    count_c++;
                }
                i++;
            }
            nondeleted = Math.max(nondeleted, j-i+1);
            j++;
        }
        return n - nondeleted;

    }
}
