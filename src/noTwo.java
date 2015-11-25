/**
 * Created by ruby on 2015/9/29.
 */
import java.util.Scanner;
public class noTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, M;

        N = sc.nextInt();
        M = sc.nextInt();

        int[] to = new int[N];

        for(int i = 0; i < N - 1; i ++) {
            //int temp1 = sc.nextInt();
            //int temp2 = sc.nextInt();
            to[i] = sc.nextInt();
        }
        int THD = 0 ;

        for(int j = 1; j <= N - 1; j ++) {
            for(int i  = 0; i < N - 1; i ++) {
                for(int k = i; (k < i + j) && (k <= N -1); k ++)
                    THD += to[k];
            }
        }
        System.out.println(THD);
    }
}
