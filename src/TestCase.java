/**
 * Created by ruby on 2015/8/14.
 */

import array.RemoveElement;


public class TestCase {
    public static void main(String[] args) {
        RemoveElement test = new RemoveElement();
        int[] a= {3,7,6,3,5, 3, 3};
        int afterLength = test.removeElement(a, 8);

        System.out.println("after:" + afterLength);
        for(int temp : a) {
            System.out.println(temp);
        }
    }
}
