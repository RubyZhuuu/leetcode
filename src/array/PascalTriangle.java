package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ruby on 2015/8/24.
 *Given numRows, generate the first numRows of Pascal's triangle.
 For example, given numRows = 5,
 Return
 [
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
 ]
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle= new ArrayList<List<Integer>>();
        for(int i = 1; i <= numRows; i ++) {
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(1);

            for(int j = i - 2; j >0; j --) {
                temp.add(triangle.get(i - 2).get(j - 1) + triangle.get(i - 2).get(j));
            }
            if(i > 1)
                temp.add(1);

            triangle.add(temp);
        }
        return triangle;
    }
}
