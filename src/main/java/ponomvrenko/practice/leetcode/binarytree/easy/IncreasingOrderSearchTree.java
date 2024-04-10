package ponomvrenko.practice.leetcode.binarytree.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/increasing-order-search-tree/description/">...</a>
 *
 * <p>Increasing Order Search Tree<p/>
 *
 * <p>Given the root of a binary search tree,
 * rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree,
 * and every node has no left child and only one right child.<p/>
 *
 * <p>Ex. 1. ->
 * Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
 * Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]<p/>
 *
 * <p>Ex. 2. ->
 * Input: root = [5,1,7]
 * Output: [1,null,5,null,7]<p/>
 *
 */

public class IncreasingOrderSearchTree {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        //left
        treeNode.left = new TreeNode(3);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.left.left = new TreeNode(1);

        // right
        treeNode.right = new TreeNode(6);
        treeNode.right.right = new TreeNode(8);
        treeNode.right.right.left = new TreeNode(7);
        treeNode.right.right.right = new TreeNode(9);

        System.out.println(increasingBST(treeNode));
    }

    public static TreeNode increasingBST(TreeNode root) {
        // Create a dummy head
        TreeNode ans = new TreeNode(0);
        // Pointer to the current node
        TreeNode cur = ans;
        // Inorder traversal function to rearrange tree
        inorder(root, cur);
        // Return the right child of the dummy head
        return ans.right;
    }

    private static TreeNode inorder(TreeNode root, TreeNode cur) {
        if (root == null) {
            return cur;
        }
        // Traverse left subtree
        cur = inorder(root.left, cur);

        // Process current node
        root.left = null;
        cur.right = root;
        cur = root;

        // Traverse right subtree
        cur = inorder(root.right, cur);

        return cur;
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
