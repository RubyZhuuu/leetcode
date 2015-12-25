package dynamicProgramming;

/**
 * no. 264
 * Created by Ruby on 2015/12/25 16:42.
 * Ugly Number II
 * Write a program to find the n-th ugly number.
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 * For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
 * Note that 1 is typically treated as an ugly number.
 *
 */
public class UglyNumber2 {
    public int nthUglyNumber(int n) {
        if(n <= 0)
            return 0;
        int p2 = 0, p3 = 0, p5 = 0;

        int[] uglys = new int[n];
        uglys[0] = 1;

        for(int i = 1; i < n; i ++) {
            int r2 = uglys[p2] * 2;
            int r3 = uglys[p3] * 3;
            int r5 = uglys[p5] * 5;

            uglys[i] = Math.min(r2, r3);
            uglys[i] = Math.min(uglys[i], r5);

            if(uglys[i] == r2)
                p2 ++;
            if(uglys[i] == r3)
                p3 ++;
            if(uglys[i] == r5)
                p5 ++;
        }

        return uglys[n -1];
    }
}
