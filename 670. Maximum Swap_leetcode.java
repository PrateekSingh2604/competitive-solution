class Solution {
    public int maximumSwap(int num) {
        String str = Integer.toString(num);
        char[] c = str.toCharArray();
        int n = str.length();
        int[] maxInt = new int[n];
        maxInt[n-1] = n-1;

        for(int i=n-2; i>-1; i--){
            int rightMaxIdx = maxInt[i + 1];
            char rightMaxElement = str.charAt(rightMaxIdx);

            if (str.charAt(i) > rightMaxElement) {
                maxInt[i] = i;
            } else {
                maxInt[i] = rightMaxIdx;
            }
        }

        for (int i = 0; i < n; i++) {
            int maxRightIdx = maxInt[i];
            char maxRightElement = str.charAt(maxRightIdx);

            // If there is a bigger digit to the right, swap and return the result
            if (str.charAt(i) < maxRightElement) {
                char[] charArray = str.toCharArray();
                char temp = charArray[i];
                charArray[i] = charArray[maxRightIdx];
                charArray[maxRightIdx] = temp;

                // Convert back to integer and return
                return Integer.parseInt(new String(charArray));
            }
        }

        

        return num;
    }
}
