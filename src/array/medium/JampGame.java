package array.medium;

/**
 * 55. Jump Game
 * Created by Ruby on 16/2/3.
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * Determine if you are able to reach the last index.
 * For example:
 * A = [2,3,1,1,4], return true.
 * A = [3,2,1,0,4], return false.
 */
public class JampGame {
    public boolean canJump(int[] nums) {
        if(nums.length == 0)
            return false;

        int far = nums[0];

        for(int i = 1; i < nums.length; i ++) {
            if(far < i)
                return false;
            far = Math.max(far, i + nums[i]);
        }

        return true;
    }
}
