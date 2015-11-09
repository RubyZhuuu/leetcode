package Backtracking;

import java.util.LinkedList;
import java.util.List;

/**
 * no.51
 * Created by Ruby on 2015/11/9 16:20.
 * The n-queens puzzle is the problem of placing n queens on an n¡Án chessboard such that no two queens attack each other.
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

    private boolean placeOnNRow(int colNum, int[] current, List<List<String>> res) {
        if(colNum < 0)
            return false;

        while(current[colNum] < current.length) {
            for(int i = colNum - 1; i >= 0 ; i --) {
                if(current[i] != current[colNum] && Math.abs(i - colNum) == Math.abs(current[i] - current[colNum])) {

                    if(colNum == current.length - 1) {
                        res.add(formatList(current));
                        placeOnNRow(colNum, new int[current.length], res);
                        return true;
                    }
                    placeOnNRow(colNum + 1, current, res);
                    return true;
                }
            }
            current[colNum] ++;
        }

            current[colNum] = 0;
            return placeOnNRow(colNum - 1, current, res);

    }

    private List<String> formatList(int[] current) {

        List<String> list = new LinkedList<>();

        for(int i : current) {
            StringBuffer s = new StringBuffer();
            int j;
            for(j = 0; j < i; j ++) {
                s.append('.');
            }
            s.append('Q');
            for(j = i + 1; j < current.length; j ++)
                s.append('.');

            list.add(s.toString());
        }

        return list;
    }

    public static void main(String[] args) {
        NQeens test = new NQeens();
        List<List<String>> res = test.solveNQueens(4);
        for(List<String> l : res) {
            for(String s : l) {
                System.out.println(s);
            }
        }
    }
}
