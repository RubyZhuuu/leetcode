package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ruby on 2015/8/25.
 * Given an index k, return the kth row of the Pascal's triangle.

 For example, given k = 3,
 Return [1,3,3,1]
 */
public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        for(int i = 0; i <= rowIndex; i ++) {
            row.add(1);
            int temp1 = 1, temp2 = 1;

            for(int j = 1; j <= i - 1; j ++) {
                temp2= temp1;
                temp1 = row.get(j);
                row.set(j, temp2 + row.get(j));
            }
        }
        return row;
    }
}
