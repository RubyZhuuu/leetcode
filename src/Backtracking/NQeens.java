package Backtracking;

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
        placeOnNRow(0, new String[n], res);
        return res;
    }

    private void placeOnNRow(int colNum, String[] current, List<List<String>> res) {
        if(colNum < 0)
            return;

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
