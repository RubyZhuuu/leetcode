package solutions.string;

import java.util.Stack;

/**
 * 227. Basic Calculator II
 * Created by Ruby on 16/1/24.
 * Implement a basic calculator to evaluate a simple expression string.
 * The expression string contains only non-negative integers, +, -, *, / operators and empty spaces .
 * The integer division should truncate toward zero.
 * You may assume that the given expression is always valid.
 */

public class BasicCalculator2 {
    //UGLY SOLUTION
    public int calculate(String s) {
        Stack<Character> opretors = new Stack<>();
        Stack<Integer> factors = new Stack<>();
        s = s.replaceAll(" ", "");

        for(int i = 0; i < s.length(); ) {
            StringBuffer numStr = new StringBuffer();
            while(i < s.length() && Character.isDigit(s.charAt(i))) {
                numStr.append(s.charAt(i));
                i ++;
            }

            factors.add(Integer.parseInt(numStr.toString()));

            if(!opretors.isEmpty()) {
                Character op = opretors.pop();
                if(op == '*' || op == '/') {
                    int a = factors.pop();
                    int b = factors.pop();

                    if(op == '*') factors.push(a * b);
                    else factors.push(b / a);

                } else
                    opretors.push(op);
            }

            if(i < s.length())
                opretors.add(s.charAt(i));
            i ++;
        }

        Stack<Integer> factors2 = new Stack<> ();
        Stack<Character> opretors2 = new Stack<>();
        while(!factors.isEmpty()) factors2.push(factors.pop());
        while(!opretors.isEmpty()) opretors2.push(opretors.pop());

        while(!opretors2.isEmpty()) {
            int a = factors2.pop();
            int b = factors2.pop();
            Character op = opretors2.pop();
            if(op == '+') factors2.push(a + b);
            else factors2.push(a - b);
        }

        return factors2.isEmpty() ? 0 : factors2.pop();
    }

    public int calculate2(String s) {
        Stack<Integer> factors = new Stack<>();
        s = s.replaceAll(" ", "");
        char op = '+';

        for(int i = 0; i < s.length(); i ++) {
            StringBuffer numStr = new StringBuffer();
            while(i < s.length() && Character.isDigit(s.charAt(i))) {
                numStr.append(s.charAt(i));
                i ++;
            }

            int num = Integer.parseInt(numStr.toString());

            switch(op) {
                case '+':
                    factors.push(num);
                    break;
                case '-':
                    factors.push(num * (-1));
                    break;
                case '*':
                    factors.push(num * factors.pop());
                    break;
                case '/':
                    factors.push(factors.pop() / num);
                    break;
            }

            if(i < s.length()) {
                op = s.charAt(i);
            }
        }

        int res = 0;
        while(!factors.isEmpty()) {
            res += factors.pop();
        }

        return res;
    }

    public static void main(String[] args) {
        BasicCalculator2 b = new BasicCalculator2();

        System.out.println(b.calculate("1-2-4-5*2 -4 + 2*3 "));
    }
}
