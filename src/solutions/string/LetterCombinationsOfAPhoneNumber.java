package solutions.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 17. Letter Combinations of a Phone Number
 * Created by Ruby on 2016/1/19 16:44.
 * Given a digit string, return all possible letter combinations that the number could represent.
 A mapping of digit to letters (just like on the telephone buttons) is given below.
 Input:Digit string "23"
 Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        int len = digits.length();
        if(len == 0)
            return res;

        String[] letters = new String[len];

        for(int i = 0; i < digits.length(); i ++) {
            char temp = digits.charAt(i);

            switch (temp) {
                case '2':
                    letters[i] = "abc";
                    break;
                case '3':
                    letters[i] = "def";
                    break;
                case '4':
                    letters[i] = "ghi";
                    break;
                case '5':
                    letters[i] = "jkl";
                    break;
                case '6':
                    letters[i] = "mno";
                    break;
                case '7':
                    letters[i] = "pqrs";
                    break;
                case '8':
                    letters[i] = "tuv";
                    break;
                case '9':
                    letters[i] = "wxyz";
                    break;
                default:
                    len --;
            }

        }
        helper(res, "", letters, len);
        return res;
    }

    public void helper(List res, String cur, String[] letters, int len) {
        if(cur.length() == len) {
            res.add(cur);
            return;
        }
        int i = cur.length();
        for(int j = 0; j < letters[i].length(); j ++) {
            helper(res, cur + letters[i].charAt(j), letters, len);
        }
    }


    public List<String> letterCombinations2(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for(int i =0; i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length()==i){
                String t = ans.remove();
                for(char s : mapping[x].toCharArray())
                    ans.add(t+s);
            }
        }
        return ans;
    }
}
