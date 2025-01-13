class Solution {
    public int minimumLength(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int result = 0;

        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> el: map.entrySet()){
            if(el.getValue()%2 == 0){
                result+=2;
            }else{
                result++;
            }
        }
        return result;
    }
}
