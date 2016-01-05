/**
 * no 231 Power of Two
 * Given an integer, write a function to determine if it is a power of two.
 * Created by Ruby on 2016/1/5 16:36.
 */
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
