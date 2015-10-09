package tree;

/**
 * Created by Ruby on 2015/10/9 13:22.
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 */
public class ConvertSortedArrayToBinarySearchTree {

    private TreeNode helper(int[] nums, int start, int end) {
        if(end < 0 || start >= nums.length)
            return null;

        int subIndex = (start + end) / 2;

        TreeNode current = new TreeNode(nums[subIndex]);
        if(subIndex - 1 >= start)
            current.left = helper(nums, start, subIndex - 1);
        if(subIndex + 1 <= end)
            current.right = helper(nums, subIndex + 1, end);

        return current;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;
        TreeNode root = helper(nums, 0, nums.length - 1);
        return root;
    }

    public static void main(String[] args) {
        ConvertSortedArrayToBinarySearchTree test = new ConvertSortedArrayToBinarySearchTree();
        int[] a = {1,3};
        test.sortedArrayToBST(a);
    }
}
