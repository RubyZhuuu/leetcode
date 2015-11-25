package twoPointers;

/**
 * Created by ruby on 2015/10/12.
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if(nums.length <= 1)
            return;

        int i = 0, j = 1;
        while(i < nums.length && j < nums.length) {
            if(nums[i] == 0){
                while(nums[j] == 0 && j < nums.length - 1)
                    j ++;
                nums[i] = nums[j];
                nums[j] = 0;
            }

            i ++;
            j ++;
        }
    }
}
