/**
 * no 201
 * Given a range [m, n] where 0 <= m <= n <= 2147483647,
 * return the bitwise AND of all numbers in this range, inclusive.
 * For example, given the range [5, 7], you should return 4.
 * Created by Ruby on 2016/1/7 14:16.
 */
public class BitwiseAndOfNumbersRange {
    static int rangeBitwiseAnd(int m, int n) {
        int res = 0;
        int curBit = 1;

        while(m > 0) {
            if(n - m == 0 && n % 2 == 1) {
                res = res  | curBit;
            }
            n = n >> 1;
            m = m >> 1;
            curBit = curBit << 1;
        }

        return res;
    }

    public int rangeBitwiseAnd2(int m, int n) {
        //int res = 0;
        int factor = 1;

        while(m != n) {
            n = n >> 1;
            m = m >> 1;
            factor = factor << 1;
        }

        return m * factor;
    }
}
