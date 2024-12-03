class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = spaces.length;
        int m = s.length();
        StringBuilder result = new StringBuilder();
        int i = 0;

        for (int space : spaces) {
            while (i < space) {
                result.append(s.charAt(i));
                i++;
            }
            i = space;
            result.append(" ");
        }

        while (i < m) {
            result.append(s.charAt(i));
            i++;
        }

        return new String(result);
    }
}
