import java.util.HashMap;

/**
 * Created by Ruby on 2015/10/19 17:18.
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();

        if(s.length() != t.length())
            return false;

        for(int index = s.length() - 1; index >= 0; index --) {
            char curr = s.charAt(index);

            if(!hash.containsKey(curr))
                hash.put(curr, 1);
            else {
                int temp = hash.get(curr);
                hash.put(curr, temp + 1);
            }
        }

        for(int index = t.length() - 1; index >= 0; index --) {
            char curr = t.charAt(index);
            if(!hash.containsKey(curr))
                return false;
            int temp = hash.get(curr);
            if(--temp < 0)
                return false;

            hash.put(curr, temp);
        }

        return true;
    }
}
