package math;

import java.util.*;

/**
 * 202. Happy Number
 * Created by ruby on 2015/12/28.
 * Write an algorithm to determine if a number is "happy".

 A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

 Example: 19 is a happy number

 12 + 92 = 82
 82 + 22 = 68
 62 + 82 = 100
 12 + 02 + 02 = 1
 */
public class HappyNumber {
    static boolean isHappy(int n) {
        Set<Integer> ht = new HashSet<>();
        int loop = 0, temp =0;

        while(ht.add(loop)) {
            loop = 0;
            while(n > 0) {
                temp = n % 10;
                loop += temp * temp;
                n = n / 10;
            }
            if(loop == 1) {
                return true;
            }
            n = loop;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.print(isHappy(1212));
    }
}
