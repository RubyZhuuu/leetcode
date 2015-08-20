package array;

/**
 * Created by Ruby on 2015/8/19.
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        if(nums.length == 0)
            return;
        k = k % nums.length;
        int[] res = new int[nums.length];

        System.arraycopy(nums, 0, res, k, nums.length - k );
        System.arraycopy(nums, nums.length - k , res , 0 , k);

        System.arraycopy(res, 0, nums, 0, nums.length);

    }
}
