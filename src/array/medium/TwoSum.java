package array.medium;

import java.util.HashMap;

/**
 * Created by ruby on 2015/8/31.
 * Given an array of integers, find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

 You may assume that each input would have exactly one solution.

 Input: numbers={2, 7, 11, 15}, target=9
 Output: index1=1, index2=2
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = (nums.length -1); i >= 0; i --) {
            if(map.containsKey(target - nums[i])) {
                a[0] = i + 1;
                a[1] = map.get(target - nums[i]);
                return a;
            } else {
                map.put(nums[i], i + 1);
            }
        }
        return a;
    }
}
