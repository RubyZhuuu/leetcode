package dynamicProgramming;

/**
 * no. 62
 * Created by ruby on 2015/10/26.
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time.
 * The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * How many possible unique paths are there?
 *
 * Note: m and n will be at most 100.
 */

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] paths= new int[m][n];

        paths[0][0] = 1;

        for(int mIndex = 0; mIndex < m; mIndex ++) {
            for(int nIndex = 0; nIndex < n; nIndex ++) {
                if(mIndex == 0 || nIndex == 0){
                    paths[mIndex][nIndex] = 1;
                    continue;
                }

                paths[mIndex][nIndex] = paths[mIndex - 1][nIndex] + paths[mIndex][nIndex - 1];
            }
        }

        return paths[m - 1][n - 1];
    }
}
