package solutions.string;

/**
 * Created by Ruby on 15/8/18.
 */
public class AddBinary {
    public String addBinary(String a, String b) {

        StringBuffer res = new StringBuffer();

        int index1 = a.length() - 1;
        int index2 = b.length() - 1;
        boolean OVERFLOW_FLAG = false;

        while(index1 >= 0 || index2 >= 0) {
            int arg1;
            int arg2;
            arg1 = index1 >= 0 ? Character.getNumericValue(a.charAt(index1)) : 0;
            arg2 = index2 >= 0 ? Character.getNumericValue(b.charAt(index2)) : 0;
            int sum = arg1 + arg2;

            sum = OVERFLOW_FLAG ? sum + 1 : sum;

            OVERFLOW_FLAG = false;

            OVERFLOW_FLAG = sum >= 2 ? true : false;
            res.append(Integer.toString(sum % 2));

            index1 --;
            index2 --;
        }

        if(OVERFLOW_FLAG)
            res.append("1");

        res.reverse();

        return res.toString();
    }
}
