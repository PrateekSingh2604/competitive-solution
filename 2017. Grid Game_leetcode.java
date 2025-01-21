class Solution {
    public long gridGame(int[][] grid) {
        long firstRowSum = 0;
        for (int num : grid[0]) {
            firstRowSum += num; 
        }
        long secondRowSum = 0;
        long minimizedRobot2Sum = Long.MAX_VALUE;

        for(int robot1Col = 0; robot1Col < grid[0].length; robot1Col++){
            firstRowSum -= grid[0][robot1Col];
            long bestOfRobot2 = Math.max(firstRowSum, secondRowSum);

            minimizedRobot2Sum = Math.min(minimizedRobot2Sum, bestOfRobot2);
            secondRowSum += grid[1][robot1Col];
        }
        return minimizedRobot2Sum;
    }
}
