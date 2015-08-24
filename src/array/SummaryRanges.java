package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruby on 2015/8/21.
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> list= new ArrayList<String>();

        if(nums.length == 0)
            return list;

        int i = 0, j =1;

        while(j < nums.length) {
            if(nums[j] == (nums[j - 1] + 1)) j ++;
            else {
                if(j == (i + 1)) {
                    list.add(Integer.toString(nums[i]));
                } else
                    list.add(nums[i] + "->" + nums[j - 1]);
                i = j;
                j ++;
            }
        }
        if(j == (i + 1)) list.add(Integer.toString(nums[i]));
        else
            list.add(nums[i] + "->" + nums[j - 1]);
        return list;
    }
}
