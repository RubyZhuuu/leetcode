package solutions.string;

import java.util.Stack;

/**
 * no. 20
 * Created by Ruby on 2015/10/29 14:20.
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(int index = 0; index < s.length(); index ++) {
            char c = s.charAt(index);

            switch (c) {
                case ')' :
                    if(stack.isEmpty() || stack.pop() != '(')
                        return false;
                    continue;
                case ']' :
                    if(stack.isEmpty() || stack.pop() != '[')
                        return false;
                    continue;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                        return false;
                    continue;
                default:
                    stack.add(c);
            }
        }

        return stack.isEmpty() ? true : false;
    }
}
