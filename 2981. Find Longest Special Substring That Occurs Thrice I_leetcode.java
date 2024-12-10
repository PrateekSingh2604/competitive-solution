class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        HashMap<Pair<Character, Integer>, Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            char curr = s.charAt(i);
            int length = 0;
            for(int j = i; j<n; j++){
                if(curr == s.charAt(j)){
                    length++;
                    Pair<Character, Integer> key = new Pair<>(curr, length);
                    if(map.containsKey(key)){
                        map.put(key, map.get(key)+1);
                    }else{
                        map.put(key, 1);
                    }
                }else{
                    break;
                }
            }
        }

        int ans = 0;
        for (Map.Entry<Pair<Character, Integer>, Integer> entry : map.entrySet()) {
            int length = entry.getKey().getValue(); // Access length from Pair
            if (entry.getValue() >= 3 && length > ans) {
                ans = length;
            }
        }

        return ans == 0 ? -1 : ans;
    }
}
