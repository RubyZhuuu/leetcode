package tools;

/**
 * Created by Ruby on 2015/8/17.
 */
public class quickSort {
    public void quickSort(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    public int getPivotPos(int[] input, int low, int high) {
        int pivotkey = input[low];

        for( ; low < high; high --) {
            if(input[high] > pivotkey)
                continue;

            input[low] = input[high];
            while(low < high && input[low] < pivotkey) {
                low ++;
            }
            if(low >= high)
                break;
            input[high] = input[low];
        }
        input[low] = pivotkey;
        return low;
    }

    public void sort(int[] input, int low, int high){
        if(low < high) {
            int pivotPos = getPivotPos(input, low, high);
            sort(input, low, pivotPos);
            sort(input, pivotPos + 1, high);
        }
    }

}
