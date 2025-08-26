class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0;
        int maxDiagonalSquar = 0;

        for(int[] dimension: dimensions){
            int length = dimension[0];
            int width = dimension[1];

            int diagonalLength = length*length + width*width;

            if(maxDiagonalSquar < diagonalLength){
                maxDiagonalSquar = diagonalLength;
                maxArea = length*width;
            }else if(maxDiagonalSquar == diagonalLength){
                maxArea = Math.max(maxArea, length*width);
            }
        }
        return maxArea;
    }
}
