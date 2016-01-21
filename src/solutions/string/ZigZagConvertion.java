package solutions.string;

/**
 * 6. ZigZag Conversion
 * Created by Ruby on 2016/1/21 15:58.
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

 P   A   H   N
 A P L S I I G
 Y   I   R
 And then read line by line: "PAHNAPLSIIGYIR"
 *
 */

//频繁的修改字符串的时候一定要用StringBuffer，效率高很多。另外已经初始化的StringBuffer是空字符串
public class ZigZagConvertion {
    public String convert(String s, int numRows) {
        StringBuffer res = new StringBuffer();
        StringBuffer[] buffer = new StringBuffer[numRows];

        for(int i = 0; i < numRows; i ++)  buffer[i] = new StringBuffer();

        for(int i = 0, j = 0, factor = 1; i < s.length(); i ++) {
            buffer[j].append(s.charAt(i));
            if(j == numRows - 1) factor = -1;
            if(j == 0) factor = 1;
            if(numRows == 1) factor = 0;

            j += factor;
        }

        for(int i = 0; i < numRows; i ++)
            res.append(buffer[i]);

        return res.toString();
    }
}
