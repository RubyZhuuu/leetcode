package array;

/**
 * Created by ruby on 2015/8/25.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0)
            return;
        while( n > 0) {
            if(m == 0) {
                nums1[m + n - 1] = nums2[n -1];
                n -- ;
                continue;
            }
            if(nums1[m -1] > nums2[n -1]) {
                nums1[m + n -1] = nums1[m -1];
                m --;
            } else if(nums1[m - 1] < nums2[n -1]) {
                nums1[m + n -1] = nums2[n -1];
                n --;
            } else {
                nums1[m + n - 1] = nums1[m - 1];
                nums1[m + n -2] = nums2[n - 1];
                m --;
                n --;
            }
        }
    }
}
