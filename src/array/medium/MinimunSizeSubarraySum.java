package array.medium;

/**
 * Created by ruby on 2015/8/31.
 */
public class MinimunSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int i =0, j =0, sum = 0;
        int minLen = Integer.MAX_VALUE;

        while(sum < s && j < nums.length) {
            sum += nums[j ++];

            while(sum >= s) {
                minLen = j - i < minLen ? j - i : minLen ;
                sum -= nums[i ++];
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
