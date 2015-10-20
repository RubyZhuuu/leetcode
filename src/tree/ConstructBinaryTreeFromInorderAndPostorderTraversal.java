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
     * index: ��ǰҪ���ʵ�postorder�����е����ݵ�λ�ã��������ɵ�ǰ�����ڵ�
     * start: ��������е�ǰ�����Ŀ�ʼλ��
     * length: �����Ľڵ����
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
     * ���ڵ�ǰ�Ѿ�ȷ���˵����������ĵ�val��������������ҵ�����λ��index
     * indexǰ�����val����������index�������val��������(˵�����Ͻ�)
     */
    private int findPivotIndex(int[] arr, int val) {
        for(int index = 0; index < arr.length; index ++) {
            if(arr[index] == val)
                return index;
        }
        return 0;
    }
}
