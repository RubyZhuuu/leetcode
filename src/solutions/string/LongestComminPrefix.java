package solutions.string;

/**
 * Created by ruby on 2015/8/16.
 */
public class LongestComminPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String prefix = "";
        String comparePattern = "";
        if(!strs[0].equals(""))
            comparePattern = strs[0].substring(0,1);
        else
            return "";

        int length = 1;

        while(true) {
            for(int index = 1; index < strs.length; index ++) {
                if(!strs[index].startsWith(comparePattern))
                    return prefix;
            }
            prefix = comparePattern;
            length ++;
            if(length <= strs[0].length() )
                comparePattern = strs[0].substring(0, length);
            else
                return prefix;
        }
    }

}
