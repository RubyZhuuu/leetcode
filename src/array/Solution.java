package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 2015/8/24.
 */
public class Solution {
    private List<String> result = new ArrayList();

    public List<String> generateParenthesis(int n) {
        String tmp = "";
        int left = n,right = n;
        if (n <= 0)  return result;
        if (n == 1){
            result.add("()");
            return result;
        }
        //subTree("(",left,right,tmp);
        //subTree(")",left,right,tmp);
        return result;
    }

    public void subTree(String str, int left, int right, String tmp){
        tmp += str;
        if(str == "("){
            left --;
        }else{
            right --;
        }
        if (left >  right) return;
        if (left == 0){
            if (right == 0){
                result.add(tmp);
                System.out.println(tmp);
                return;
            }else{
                subTree(")",0,right,tmp);
            }
        }
        subTree("(",left,right,tmp);
        subTree(")",left,right,tmp);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.generateParenthesis(2);
    }
}