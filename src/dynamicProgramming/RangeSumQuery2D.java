package dynamicProgramming;

/**
 * Created by ruby on 2015/12/14.
 */
public class RangeSumQuery2D {
    private int[][] sum;

    public RangeSumQuery2D(int[][] matrix) {
        if(matrix.length == 0)
            return;

        int row = matrix.length;
        int col = matrix[0].length;

        for(int i = 0; i < row; i ++)
            for(int j = 0; j < col; j ++) {
                if(i == 0 && j == 0)
                    break;
                if(i == 0)
                    matrix[i][j] += matrix[i][j - 1];
                if(j == 0)
                    matrix[i][j] += matrix[i - 1][j];
                else
                    matrix[i][j] = matrix[i][j] + matrix[i - 1][j] + matrix[i][j - 1] - matrix[i - 1][j - 1];
            }
        sum = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(row1 == 0)
            return 0;
        return sum[row2][col2] - sum[row1-1][col1] - sum[row1][col1 - 1] + sum[row1 - 1][col1 - 1];
    }
}
