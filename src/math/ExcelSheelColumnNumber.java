package math;

/**
 * Created by Ruby on 2015/8/27.
 * Related to question Excel Sheet Column Title

 Given a column title as appear in an Excel sheet, return its corresponding column number.

 For example:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
 */
public class ExcelSheelColumnNumber {
    public int titleToNumber(String s) {
        int num = 0;

        for(int i = 0; i < s.length(); i ++){
            num = num * 26 + ((int)s.charAt(i) - 64);
        }

        return num;
    }
}
