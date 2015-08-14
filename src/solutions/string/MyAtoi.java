package solutions.string;

import java.util.concurrent.ExecutorCompletionService;

/**
 * Created by ruby on 2015/7/15.
 * Title: String to Integer (atoi)
 */
public class MyAtoi {
    public int myAtoi(String str) {
        //È¥µôÊ×Î²¿Õ¸ñ
        str = str.trim();

        String output = "";
        boolean isNegative = false;
        boolean isPositive = false;
        int index = 0;

        while(index < str.length()) {
            char current = str.charAt(index);

            if(current == ' ') {
                if(isNegative || isPositive || output.length() != 0)
                    break;
            } else if(current == '-' && output.length() == 0) {
                if(isNegative)
                    break;
                isNegative = true;
            } else if(current == '+' && output.length() == 0) {
                if(isPositive)
                    break;
                isPositive = true;
            } else if( current <= '9' && current >= '0') {
                output = output + current;
            } else {
                //if(output.length() != 0 || isNegative || isPositive)
                break;
            }
            index ++;
        }
        if(output.length() == 0)
            return 0;
        if(isPositive && isNegative)
            return 0;
        int num = 0;

        try{
            if(isNegative)
                output = "-" + output;
            num = Integer.parseInt(output,10);
        }
        catch(Exception e){
            if(isNegative)
                num = Integer.MIN_VALUE;
            else
                num = Integer.MAX_VALUE;
        }
        return num;
    }
}

