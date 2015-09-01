package dynamicProgramming;

/**
 * Created by Ruby on 2015/9/1.
 * N: 70
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n <= 2)
            return n;

        int count1 = 1, count2 = 2;
        int res = 0;

        for(int i = 3; i <= n; i ++) {
            res = count1 + count2;
            count1 = count2;
            count2 = res;

        }
        return res;
    }
}
