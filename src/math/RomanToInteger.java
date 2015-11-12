package math;

import java.util.HashMap;

/**
 * no. 13
 * Created by Ruby on 2015/11/12 14:51.
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        map.put('Z', 0);

        s = s + "Z";

        int res;
        int cur, prev;
        prev = map.get(s.charAt(s.length() - 1));
        res = prev;

        for(int len = s.length() - 2; len >= 0; len --) {
            cur = map.get(s.charAt(len));
            if(cur >= prev)
                res += cur;
            else
                res -= cur;

            prev = cur;
        }

        return res;
    }

}
