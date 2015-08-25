package array;

import java.util.HashMap;

/**
 * Created by ruby on 2015/8/25.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash= new HashMap<Integer, Integer>();
        int count = 1;
        int res = 0;
        for(int num : nums) {
            if(hash.get(num) == null) {
                count = 1;
                hash.put(num, count);
            } else {
                count = hash.get(num);
                count ++;
                hash.put(num, count);
            }

            if(count > Math.floor(nums.length/2)) {
               res = num;
                break;
            }
        }
        return res;
    }
}
