package array;

/**
 * Created by Ruby on 2015/8/20.
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int afterLength =  nums.length;

        for(int i = 0; i < nums.length; i ++) {
            if(nums[i] == val) {
                int temp = afterLength - 1;
                afterLength --;
                while(temp >= 0 && nums[temp] == val)
                    temp --;

                if(temp <= i)
                    return temp + 1;
                nums[i] = nums[temp];
                nums[temp] = val;

            }
        }
        return afterLength;
    }
}
