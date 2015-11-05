package array;

/**
 * no.48
 * Created by Ruby on 2015/11/4 15:40.
 * You are given an n x n 2D matrix representing an image.
 * Rotate the image by 90 degrees (clockwise).
 * Follow up:
 * Could you do this in-place?
 */

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < Math.ceil(n / 2); i ++) {
            for(int j = i; j < n - 1 - i; j ++) {
                int temp1 = matrix[i][j];
                int temp2 = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp1;
                temp1 = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = temp2;
                temp2 = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = temp1;
                matrix[i][j] = temp2;

            }
        }
    }

    /*
     *  先向下“对折”，然后沿\方向的中轴线翻转
     */
    public void rotate2(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < n / 2; i ++) {
            for(int j = 0; j < n; j ++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = temp;
            }
        }

        for(int i = 1; i < n; i ++) {
            for(int j = 0; j < i; j ++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
