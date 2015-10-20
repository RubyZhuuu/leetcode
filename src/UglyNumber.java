/**
 * no. 263
 * Created by Ruby on 2015/10/20 13:15.
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 */
public class UglyNumber {

    public boolean isUgly(int num) {
        if(num <= 0)
            return false;

        while(num != 1) {
            if(num % 2 == 0) {
                num = num >> 2;
                continue;
            }
            if(num % 3 == 0) {
                num = num / 3;
                continue;
            }
            if(num % 5 == 0) {
                num = num / 5;
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        UglyNumber u = new UglyNumber();
        System.out.println(u.isUgly(16));
    }

}
