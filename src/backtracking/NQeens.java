package backtracking;

import java.util.LinkedList;
import java.util.List;

/**
 * no.51
 * Created by Ruby on 2015/11/9 16:20.
 * The n-queens puzzle is the problem of placing n queens on an n��n chessboard such that no two queens attack each other.
 * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
 * For example,
 * There exist two distinct solutions to the 4-queens puzzle:
 [
 [".Q..",  // Solution 1
 "...Q",
 "Q...",
 "..Q."],
 ["..Q.",  // Solution 2
 "Q...",
 "...Q",
 ".Q.."]
 ]
 */

public class NQeens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new LinkedList<>();
        placeOnNRow(0, new int[n], res);
        return res;
    }

    private void placeOnNRow(int colNum, int[] current, List<List<String>> res) {
        if(colNum < 0)
            return;

        boolean FLAG = true;

        while(current[colNum] < current.length) {
            FLAG = true;
            for(int i = colNum - 1; i >= 0 ; i --) {
                if(current[i] == current[colNum] || Math.abs(i - colNum) == Math.abs(current[i] - current[colNum])) {
                    FLAG = false;
                }
            }

            if(FLAG == true)
                break;
            current[colNum] ++;
        }

        if(FLAG == true) {
            if(colNum == current.length - 1) {
                //res.add(formatList(current));
                current[colNum] += 1;
                //placeOnNRow(colNum, current, res);
            }
            else
                placeOnNRow(colNum + 1, current, res);
        } else {
            if(colNum == 0) {
                current[colNum] += 1;
                placeOnNRow(0, current, res);
            }
            else{
                current[colNum] = 0;
                current[colNum - 1] += 1;
                if (current[colNum - 1] < current.length)
                    placeOnNRow(colNum - 1, current, res);
                else {
                    current[colNum - 2] += 1;
                    placeOnNRow(colNum - 2, current, res);
                }
            }
        }
    }

    private boolean isValid() {
        return true;
    }

    public static void main(String[] args) {
        NQeens test = new NQeens();
        List<List<String>> res = test.solveNQueens(9);
        for(List<String> l : res) {
            for(String s : l) {
                System.out.println(s);
            }

            System.out.println("-------------------------");
        }
    }
}
