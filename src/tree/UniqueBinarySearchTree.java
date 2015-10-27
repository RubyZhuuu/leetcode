package tree;

/**
 * no. 96
 * Created by Ruby on 2015/10/22 14:43.
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
 1         3     3      2      1
  \       /     /      / \      \
   3     2     1      1   3      2
  /     /       \                 \
 2     1         2                 3
 */

public class UniqueBinarySearchTree {
    public int numTrees(int n) {
        int[] treesCount = new int[n + 1];
        treesCount[0] = treesCount[1] = 1;

        for(int i = 2; i < n + 1; i ++) {
            for(int j = 1; j <= i; j ++) {
                treesCount[i] += treesCount[j - 1] * treesCount[i - j];
            }
        }

        return treesCount[n];
    }
}
