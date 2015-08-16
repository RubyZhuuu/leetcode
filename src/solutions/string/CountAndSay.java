package solutions.string;

/**
 * Created by ruby on 2015/8/15.
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if(n == 1)
            return "1";

        String sequence = countAndSay(n-1);
        StringBuffer strBuffer = new StringBuffer();

        char temp = sequence.charAt(0);
        int nums = 1;

        for(int index = 1; index < sequence.length(); index ++) {
            if(sequence.charAt(index) == temp) {
                nums ++;
                continue;
            } else {
                strBuffer.append(nums);
                strBuffer.append(temp);
                temp = sequence.charAt(index);
                nums = 1;
            }
        }
        strBuffer.append(nums);
        strBuffer.append(temp);

        return strBuffer.toString();
    }
}
