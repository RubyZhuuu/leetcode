package tree;

/**
 * no. 106
 * Created by Ruby on 2015/10/20 13:48.
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root = null;
        if(inorder.length == 0)
            return root;

        root = buildTreeHelper(inorder, postorder, inorder.length - 1, 0, inorder.length);
        return root;
    }


    /*
     * index: 当前要访问的postorder数组中的数据的位置，用来生成当前的树节点
     * start: 中序遍历中当前子树的开始位置
     * length: 子树的节点个数
     */
    private TreeNode buildTreeHelper(int[] inorder, int[] postorder, int index, int start, int length) {
        TreeNode curr = new TreeNode(postorder[index]);
        int pivotIndex = findPivotIndex(inorder, postorder[index]);
        int leftNodeCount = pivotIndex - start;
        int rightNodeCount = start + length - pivotIndex;
        if(leftNodeCount > 0) {
            int tempIndex = rightNodeCount > 0 ? index - rightNodeCount -1 : index - 1;
            curr.left = buildTreeHelper(inorder, postorder, tempIndex, start, leftNodeCount);
        }
        if(rightNodeCount > 0) {
            curr.right = buildTreeHelper(inorder, postorder, index - 1, pivotIndex + 1, rightNodeCount);
        }
        return curr;
    }

    /*
     * 对于当前已经确定了的子树的中心点val，在中序遍历中找到它的位置index
     * index前面的是val的左子树，index后面的是val的右子树(说法不严谨)
     */
    private int findPivotIndex(int[] arr, int val) {
        for(int index = 0; index < arr.length; index ++) {
            if(arr[index] == val)
                return index;
        }
        return 0;
    }
}
