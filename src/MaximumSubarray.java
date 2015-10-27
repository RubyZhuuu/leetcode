/**
 * no. 53
 * Created by Ruby on 2015/10/27 13:07.
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [?2,1,?3,4,?1,2,1,?5,4],
 * the contiguous subarray [4,?1,2,1] has the largest sum = 6.
 */

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, sum = 0;

        for(int item : nums) {
            sum += item;
            if(sum >= maxSum)
                maxSum = sum;
            if(sum < 0)
                sum = 0;
        }

        return maxSum;
    }
}
