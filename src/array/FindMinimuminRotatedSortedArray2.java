package array;

/**
 * 154. Find Minimum in Rotated Sorted Array II
 * Created by Ruby on 16/1/26.
 * Follow up for "Find Minimum in Rotated Sorted Array":
 What if duplicates are allowed?


 */
public class FindMinimuminRotatedSortedArray2 {
    public int findMin(int[] nums) {
        if(nums.length == 0)
            return 0;

        int low = 0, high = nums.length - 1;
        int min = nums[low];

        while(nums[low] >= nums[high] && low < high) {
            if(high - low == 1) {
                min = nums[high];
                break;
            }

            int mid = low + (high - low) / 2;  //这样写比(low + high) / 2 要好!!

            if(nums[low] == nums[high] && nums[low] == nums[mid]) {
                min = findByTraversal(nums, low, high);
                break;
            }

            if(nums[mid] >= nums[low])
                low = mid;
            else
                high = mid;
        }

        return min;
    }

    private int findByTraversal(int[] nums, int start, int end) {
        int min = nums[start];

        for(int i = start + 1; i <= end; i++) {
            if(nums[i] < min)
                min = nums[i];
        }

        return min;
    }
}
