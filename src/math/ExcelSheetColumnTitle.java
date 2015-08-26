package math;

/**
 * Created by Ruby on 2015/8/26.
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuffer buffer = new StringBuffer();

        while( (n - 1) / 26 > 0) {
            int temp = (n -1) % 26;
            buffer.insert(0, Character.toChars(temp + 65));
            n = (n - 1) / 26;
        }
        buffer.insert(0, Character.toChars( (n -1) % 26 + 65));

        return buffer.toString();
    }
}
