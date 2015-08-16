package solutions.string;

/**
 * Created by ruby on 2015/8/16.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(" ");
        return s.substring(lastIndex+1).length();
    }
}
