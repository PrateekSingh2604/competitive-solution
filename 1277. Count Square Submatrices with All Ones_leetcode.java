class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] t = new int[m][n];
        for (int[] arr : t) {
            Arrays.fill(arr, 0);
        }
        int result = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = matrix[i][j];
                } else if (matrix[i][j] == 1) {
                    t[i][j] = 1 + Math.min(Math.min(t[i][j - 1], t[i - 1][j]), t[i - 1][j - 1]);
                }
                result += t[i][j];
            }
        }
        return result;
    }
}





class Solution {
  public int countSquares(int[][] matrix) {
    for (int i = 0; i < matrix.length; ++i)
      for (int j = 0; j < matrix[0].length; ++j)
        if (matrix[i][j] == 1 && i > 0 && j > 0)
          matrix[i][j] +=
              Math.min(matrix[i - 1][j - 1], Math.min(matrix[i - 1][j], matrix[i][j - 1]));
    return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
  }
}
