package dynamicProgramming;

/**
 * no. 279
 * Created by ruby on 2015/12/21.
 *
 * Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
 * For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.
 */
public class PerfectSquares {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for(int i = 1; i < n + 1; i ++) {
            dp[i] = i;
            for(int j = (int)Math.sqrt(i); j >= 1; j --) {
                dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
            }
        }

        return dp[n];
    }
}
