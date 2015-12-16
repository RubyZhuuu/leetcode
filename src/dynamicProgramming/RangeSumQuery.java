package dynamicProgramming;

/**
 * no 303
 * Created by ruby on 2015/12/14.
 * Given an integer array nums, find the sum of the elements between indices i and j (i ¡Ü j), inclusive.
 */
public class RangeSumQuery {
    private int[] sums;

    public RangeSumQuery(int[] nums) {
        for(int i = 1; i < nums.length; i ++) {
            nums[i] = nums[i - 1] + nums[i];
        }

        sums = nums;
    }

    public int sumRange(int i, int j) {
        if(i == 0)
            return sums[j];
        return sums[j] - sums[i - 1];
    }

}
