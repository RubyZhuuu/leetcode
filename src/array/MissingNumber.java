package array;

/**
 * no. 268
 * Created by Ruby on 2015/10/30 14:51.
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * For example,
 * Given nums = [0, 1, 3] return 2.
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i : nums)
            sum += i;

        int sub = sum - nums.length * (nums.length - 1) /2;
        return nums.length - sub;
    }
}
