package solutions.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ruby on 2015/11/20 14:35.
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, maxLen = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        while(end < s.length()) {
            char c = s.charAt(end);
            if(map.containsKey(c)) {
                start = Math.max(map.get(c) + 1, start);
            }
            map.put(c, end);

            maxLen = Math.max(end - start + 1, maxLen);
            end ++;
        }

        return maxLen;
    }
}
