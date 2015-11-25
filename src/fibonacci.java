import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ruby on 2015/9/29.
 */
public class fibonacci {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> out = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        int[] input = new int[N];

        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }

        for(int i = 0; i < N ; i ++) {
//            if(out.size() == 0) {
//                ArrayList<Integer> temp = new ArrayList<Integer>();
//                temp.add(input[i]);
//                if(isFibonacci(temp))
//                    out.add(temp);
//
//            }
            if(input[i] == 1) {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(input[i]);
                out.add(temp);
            }
            else {
                ArrayList<Integer> temp = new ArrayList<Integer>(out.get(out.size() - 1));
                temp.add(input[i]);
                if(isFibonacci(temp))
                    out.add(temp);
            }
        }

        for(int j = 0; j < out.size(); j ++) {
            ArrayList<Integer> a = out.get(j);
            for(int k = 0; k < a.size(); k ++) {
                System.out.print(a.get(k));

            }
            System.out.print("\n");
        }
    }

    static boolean isFibonacci(ArrayList<Integer> toCheck) {
        int length = toCheck.size();
        if(length == 1) {
            if (toCheck.get(0) == 1)
                return true;
            else
                return false;
        }
        if(length == 2) {
            if(toCheck.get(1) == 1)
                return true;
            else
                return false;
        }

        if(toCheck.get(length - 1) == (toCheck.get(length - 2) + toCheck.get(length - 3)))
            return true;

        return false;
    }
}
