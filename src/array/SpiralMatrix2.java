package array;

/**
 * no. 59
 * Created by Ruby on 2015/11/5 12:20.
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 * For example,
 * Given n = 3,
 * You should return the following matrix:
 [
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
 ]
 */
public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int val = 1;
        int looper, loopCount;

        for(looper = 0, loopCount = (int) n / 2; looper < loopCount; looper ++) {
            int i;

            for(i = looper ; i <= n - looper - 1; i ++)
                matrix[looper][i] = val ++;
            for(i = looper + 1; i < n - looper; i ++)
                matrix[i][n - looper - 1] = val ++;
            for(i = n - looper - 2; i >= looper; i --)
                matrix[n - looper - 1][i] = val ++;
            for(i = n - looper - 2; i > looper; i --)
                matrix[i][looper] = val ++;
        }

        if(n % 2 == 1)
            matrix[looper][looper] = val;

        return matrix;

    }
}
