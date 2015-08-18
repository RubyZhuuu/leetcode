package array;

import java.util.ArrayList;

/**
 * Created by ruby on 2015/8/17.
 * A num is displayed with an array of digits, get the result of the num plused 1. For example:
 * [1,8,9,9] -> [1,9,0,0]
 * [9,9,9] -> [1,0,0,0]
 */

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int overflow = 0;

        for(int index = digits.length - 1; index >= 0; index --) {
            int temp = digits[index] + overflow;
            temp = index == (digits.length -1) ? temp + 1 : temp;
            overflow = temp == 10 ? 1 : 0;
            digits[index] = temp == 10 ? 0 : temp;
        }

        if(overflow == 1) {
            int res[] = new int[digits.length + 1];
            System.arraycopy(digits, 0, res, 1, digits.length);
            res[0] = 1;

            return res;
        }

        return digits;
    }
}
