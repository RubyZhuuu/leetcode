package dynamicProgramming;

/**
 * no. 213
 * Created by Ruby on 2015/10/26 13:42.
 * After robbing those houses on that street, the thief has found himself a new place for his thievery so that he will not get too much attention.
 * This time, all houses at this place are arranged in a circle.
 * That means the first house is the neighbor of the last one.
 * Meanwhile, the security system for these houses remain the same as for those in the previous street.
 * Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class HouseRobber2 {
    public int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];

        return Math.max(robHelper(nums, 0, nums.length - 2), robHelper(nums, 1, nums.length - 1));
    }

    private int robHelper(int[] nums, int start, int end) {
        int maxSum = 0, sumWithoutIndex = 0;

        for(int i = start; i <= end; i ++) {
            int temp = maxSum;
            maxSum = Math.max(maxSum, sumWithoutIndex + nums[i]);
            sumWithoutIndex = temp;
        }

        return Math.max(maxSum, sumWithoutIndex);
    }
}
