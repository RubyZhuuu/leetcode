package array;

/**
 * no. 287
 * Created by Ruby on 2015/11/2 13:53.
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
 * Note:
 * You must not modify the array (assume the array is read only).
 * You must use only constant, O(1) extra space.
 * Your runtime complexity should be less than O(n2).
 * There is only one duplicate number in the array, but it could be repeated more than once.
 */

public class FindTheDuplicteNumber {
    public int findDuplicate(int[] nums) {
        int low = 1, high = nums.length -1;
        int count = 0;
        int mid = 0;

        while (low < high) {
            mid = (high + low) / 2;

            for(int num : nums)
                if(num <= mid) count ++;

            if(count <= mid - low + 1)
                low = mid;
            else high = mid;
            count = 0;
        }

        return mid;
    }
}
