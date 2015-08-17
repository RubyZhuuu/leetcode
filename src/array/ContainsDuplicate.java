package array;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ruby on 2015/8/17.
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i ++) {
            if(!set.add(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }

        return false;
    }
}
