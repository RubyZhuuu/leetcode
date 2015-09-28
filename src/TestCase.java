/**
 * Created by ruby on 2015/8/14.
 */


import math.CountPrimes;
import math.PalindromeNumber;
import array.medium.MinimunSizeSubarraySum;
import dynamicProgramming.ClimbingStairs;


import java.util.List;
import java.util.Scanner;


public class TestCase {

    //        ClimbingStairs test = new ClimbingStairs();
//        MinimunSizeSubarraySum t = new MinimunSizeSubarraySum();
//        int[] a= {1,3,4};
//        System.out.println(test.climbStairs(4));

    public int getPath() {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums = sc.nextInt();

        int[] path = new int[nums + 1];

        for(int i = 0; i <= nums ; i++) {
            path[i] = sc.nextInt();
        }

        int remainder = 7;
        int count = 0;
        int j = 0;

        while(j < nums) {
            remainder -= path[j];

            if(remainder >= path[j + 1])
                break;
            remainder = 7;
            count ++;
            j++;
        }

        return count;
    }
}
