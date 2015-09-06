/**
 * Created by ruby on 2015/8/14.
 */

import math.AddDigits;
import array.medium.TwoSum;

import java.util.List;


public class TestCase {
    public static void main(String[] args) {
        TwoSum test = new TwoSum();
        int[] a1= {4,5,2,7,4};
        int[] a2 = test.twoSum(a1, 15);

        System.out.println(a2[0]);
        System.out.println(a2[1]);
    }
}
