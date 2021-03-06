/**
 * no. 136
 * Created by Ruby on 2015/11/4 17:21.
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i : nums)
            res = res ^ i;

        return res;
    }
}
