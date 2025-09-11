class Solution {
    public String sortVowels(String s) {
        List<Pair<Character, Integer>> vowels = new ArrayList();

        for(char c: s.toCharArray()){
            if(Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'i' || Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'u'){
                vowels.add(new Pair(c, c - 'a'));
            }
        }

        Collections.sort(vowels, (a,b)->a.getValue()-b.getValue());

        StringBuilder t = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'i' || Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'u'){
                t.append(vowels.get(0).getKey());
                vowels.remove(0);
            }
            else{
                t.append(c);
            }
        }
        return new String(t);
    }
}
