package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. Generate Parentheses
 * Created by Ruby on 2016/1/18 16:36.
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 For example, given n = 3, a solution set is:
 "((()))", "(()())", "(())()", "()(())", "()()()"
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String> ();
        helper(res, "", 0, 0, n);
        return res;
    }

    public void helper(List<String> res, String cur, int open, int close, int num) {
        if(open == num && close == num)
            res.add(cur);

        if(open < num) {
            helper(res, cur + "(", open + 1, close, num);
        }

        if(close < open) {
            helper(res, cur + ")", open, close + 1, num);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses test = new GenerateParentheses();
        test.generateParenthesis(2);
    }
}
