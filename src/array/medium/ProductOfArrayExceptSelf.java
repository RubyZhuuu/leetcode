package array.medium;

/**
 * no 238
 * Created by Ruby on 2016/1/7 10:57.
 * Given an array of n integers where n > 1, nums,
 * return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 * Solve it without division and in O(n).
 * For example, given [1,2,3,4], return [24,12,8,6].
 */

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        res[0] = 1;

        for(int i = 1; i < len; i ++)
            res[i] = res[i - 1] * nums[i - 1];
        int right = 1;
        for(int i = len - 1; i >= 0; right *= nums[i --])
            res[i] *= right;

        return res;
    }
}
