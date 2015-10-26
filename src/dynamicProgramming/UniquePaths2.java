package dynamicProgramming;

/**
 * no. 63
 * Created by ruby on 2015/10/26.
 * Follow up for "Unique Paths":
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * For example,
 * There is one obstacle in the middle of a 3x3 grid as illustrated below.
 [
 [0,0,0],
 [0,1,0],
 [0,0,0]
 ]
 The total number of unique paths is 2.
 */

public class UniquePaths2 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        obstacleGrid[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;

        for(int mIndex = 0; mIndex < obstacleGrid.length; mIndex ++) {
            for(int nIndex = 0; nIndex < obstacleGrid[0].length; nIndex ++) {
                if(mIndex == 0 && nIndex == 0)
                    continue;

                if(obstacleGrid[mIndex][nIndex] == 1) {
                    obstacleGrid[mIndex][nIndex] = 0;
                    continue;
                }

                if(mIndex == 0){
                    obstacleGrid[mIndex][nIndex] = obstacleGrid[mIndex][nIndex - 1];
                    continue;
                }

                if(nIndex == 0) {
                    obstacleGrid[mIndex][nIndex] = obstacleGrid[mIndex - 1][nIndex];
                    continue;
                }

                obstacleGrid[mIndex][nIndex] = obstacleGrid[mIndex - 1][nIndex] + obstacleGrid[mIndex][nIndex - 1];
            }
        }

        return obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
