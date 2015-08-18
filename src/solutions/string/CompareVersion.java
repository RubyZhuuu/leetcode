package solutions.string;

/**
 * Created by ruby on 2015/8/14.
 */
public class CompareVersion {
    public int compareVersion(String version1, String version2) {
        String[] v1;
        String[] v2;
        v1 = version1.split("\\.");
        v2 = version2.split("\\.");

        int count = 0;
        while(count < v1.length || count < v2.length) {
            if(count == v1.length && count == v2.length)
                return 0;
            if(count == v1.length) {
                return Integer.parseInt(v2[count]) == 0 ? 0 : -1;
            }
            if(count == v2.length) {
                return Integer.parseInt(v1[count]) == 0 ? 0 : 1;
            }
            if(Integer.parseInt(v1[count]) > Integer.parseInt(v2[count]))
                return  1;
            if(Integer.parseInt(v1[count]) < Integer.parseInt(v2[count]))
                return -1;
            count ++;
        }

        return 0;
    }
}
