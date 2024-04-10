package ponomvrenko.practice.leetcode.binarytree.easy;

/**
 * <a href="https://leetcode.com/problems/invert-binary-tree/description/">...</a>
 * <p>
 * Given the root of a binary tree, invert the tree, and return its root.
 * <p>
 * Ex. 1
 * Input: root = [4,2,7,1,3,6,9]
 * Output: [4,7,2,9,6,3,1]
 * <p>
 * Ex. 2
 * Input: root = [2,1,3]
 * Output: [2,3,1]
 * <p>
 * Ex. 3
 * Input: root = []
 * Output: []
 */

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(3);

        reverseRecursive(treeNode);
        System.out.println(treeNode);
    }

    public static TreeNode reverseRecursive(TreeNode treeNode) {
        if (treeNode == null) {
            return null;
        }

        TreeNode temp = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = temp;

        reverseRecursive(treeNode.left);
        reverseRecursive(treeNode.right);

        return treeNode;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
