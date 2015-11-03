package array;

/**
 * no. 153
 * Created by Ruby on 2015/11/3 13:57.
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * Find the minimum element.
 * You may assume no duplicate exists in the array.
 */

public class FindMinimunInRotatedSortedArray {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        int mid = 0;

        if(nums.length == 0)
            return 0;

        while(low < high) {
            mid = (low + high) / 2;

            if(nums[mid] < nums[high])
                high = mid;
            else
                low = mid + 1;
        }

        return nums[low];
    }
}
