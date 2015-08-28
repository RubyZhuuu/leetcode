package math;

/**
 * Created by Ruby on 2015/8/27.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;

        int prev = x;
        int reverse = 0;

        if( x < 10)
            return true;

        while( x > 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        System.out.println(x);
        System.out.println(reverse);

        return reverse == prev;
    }
}
