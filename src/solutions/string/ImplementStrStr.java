package solutions.string;

/**
 * 28. Implement strStr()
 * Created by Ruby on 2016/1/20 15:59.
 * Implement strStr().
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
//KMP Ëã·¨  http://www.ruanyifeng.com/blog/2013/05/Knuth%E2%80%93Morris%E2%80%93Pratt_algorithm.html
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if(needle.equals(""))
            return 0;

        int[] arr = new int[needle.length()];

        for(int i = 1, j =0; i < needle.length(); i ++) {
            if(needle.charAt(i) == needle.charAt(j)) j ++;
            else {
                if(j != 0) i --;
                j = 0;
            }
            arr[i] = j;
        }

        for(int ph = 0, pn = 0; ph < haystack.length() - needle.length() + 1; ph ++) {
            for( ; pn < needle.length(); pn ++) {
                if(needle.charAt(pn) != haystack.charAt(ph + pn)) {
                    pn = 0;
                    ph += pn - arr[pn];
                    break;
                }
            }
            if(pn != 0) return ph;
        }
        return -1;
    }
}
