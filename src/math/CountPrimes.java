package math;

/**
 * Created by Ruby on 2015/8/27.
 * Count the number of prime numbers less than a non-negative number, n.
 */
public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        if( n <= 2)
            return 0;
        int count = 0;
        int sq = (int)Math.sqrt(n -1);

        for(int i = 2; i <= sq; i ++ ){
            for(int temp = i * i ; temp < n; temp += i) {
                isPrime[temp - 1] = true;
            }
        }
        for(int i = 1; i < (n - 1); i ++) {
            if(!isPrime[i])
                count ++;
        }
        return count;
    }
}
