package solutions.string;

/**
 * 125. Valid Palindrome
 * Created by Ruby on 16/1/20.
 */
//0-9 ASCII 48-57 A-Z 65-90 a-z 97-122

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^0-9a-zA-Z]", "");

        if(s.equals(""))
            return true;

        for(int i = 0, j = s.length() - 1; i < j; i ++, j --) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(Character.toLowerCase(c1) != Character.toLowerCase(c2))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        IsPalindrome i = new IsPalindrome();
        System.out.println(i.isPalindrome("0P"));
    }
}
