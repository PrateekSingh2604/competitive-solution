class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] count = new int[26];
        for(char ch: s.toCharArray()){
            count[ch - 'a']++;
        }
        PriorityQueue<Character> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i< 26; i++){
            if(count[i] > 0){
                char ch = (char) (i + 'a');
                pq.add(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        while(!pq.isEmpty()){
            char ch = pq.poll();
            int freq = Math.min(count[ch-'a'], repeatLimit);
            for(int j = 0; j<freq; j++){
                result.append(ch);
            }
            count[ch-'a'] -= freq;

            if(count[ch-'a'] > 0 && !pq.isEmpty()){
                char nextChar = pq.poll();

                result.append(nextChar);
                count[nextChar - 'a']--;

                if(count[nextChar - 'a'] > 0){
                    pq.add(nextChar);
                }
                pq.add(ch);
            }
            


        }
        return new String(result);
    }
}
